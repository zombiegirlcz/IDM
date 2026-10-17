package w10;

import java.lang.reflect.Type;
import kg.u;
import kg.x;
import kg.y;
import kg.z;
import kotlin.jvm.internal.Intrinsics;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements z {
    @Override // kg.z
    public final u serialize(Object obj2, Type type, y yVar) {
        c0 src2 = (c0) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        return new x(src2.d());
    }
}
