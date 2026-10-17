package w10;

import i20.h0;
import java.lang.reflect.Type;
import kg.u;
import kg.x;
import kg.y;
import kg.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n implements z {
    @Override // kg.z
    public final u serialize(Object obj2, Type type, y yVar) {
        h0 src2 = (h0) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        return new x(src2.a());
    }
}
