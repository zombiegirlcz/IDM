package qlm;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a implements KSerializer {
    public abstract Object a();

    public abstract int b(Object obj2);

    public abstract Iterator c(Object obj2);

    public abstract int d(Object obj2);

    @Override // mlm.b
    public Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Object objA = a();
        int iB = b(objA);
        plm.d dVarBeginStructure = decoder.beginStructure(getDescriptor());
        dVarBeginStructure.getClass();
        while (true) {
            int iD = dVarBeginStructure.d(getDescriptor());
            if (iD == -1) {
                dVarBeginStructure.endStructure(getDescriptor());
                return h(objA);
            }
            f(dVarBeginStructure, iD + iB, objA);
        }
    }

    public abstract void f(plm.d dVar, int i, Object obj2);

    public abstract Object g(Object obj2);

    public abstract Object h(Object obj2);
}
