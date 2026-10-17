package h29;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f148745a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f148746b = com.bumptech.glide.c.a("LifestyleHomeProductDto.DtoType", olm.e.f226474j);

    private g() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Object next;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        Iterator<E> it8 = h19.c.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((h19.c) next).name(), strDecodeString)) {
                break;
            }
        }
        h19.c cVar = (h19.c) next;
        return cVar != null ? new d(cVar) : new e(strDecodeString);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f148746b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f value = (f) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof d) {
            encoder.encodeString(((d) value).f148743a.name());
        } else {
            if (!(value instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.encodeString(((e) value).f148744a);
        }
    }
}
