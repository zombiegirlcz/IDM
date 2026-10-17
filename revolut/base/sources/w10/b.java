package w10;

import java.lang.reflect.Type;
import kg.u;
import kg.x;
import kg.y;
import kg.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements z {
    @Override // kg.z
    public final u serialize(Object obj2, Type type, y yVar) {
        v30.c src2 = (v30.c) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        return new x(src2.b());
    }
}
