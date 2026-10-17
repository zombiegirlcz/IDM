package w10;

import java.lang.reflect.Type;
import java.util.Base64;
import kg.u;
import kg.x;
import kg.y;
import kg.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements z {
    @Override // kg.z
    public final u serialize(Object obj2, Type typeOfSrc, y context) {
        byte[] src2 = (byte[]) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(typeOfSrc, "typeOfSrc");
        Intrinsics.checkNotNullParameter(context, "context");
        return new x(Base64.getEncoder().encodeToString(src2));
    }
}
