package w10;

import java.lang.reflect.Type;
import kg.u;
import kg.x;
import kg.y;
import kg.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements z {
    @Override // kg.z
    public final u serialize(Object obj2, Type typeOfSrc, y context) {
        d70.a src2 = (d70.a) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(typeOfSrc, "typeOfSrc");
        Intrinsics.checkNotNullParameter(context, "context");
        kg.r rVar = new kg.r(src2.f111733b);
        byte[] bArr = src2.f111732a;
        int i = src2.f111733b;
        for (int i2 = 0; i2 < i; i2++) {
            rVar.f183889a.add(new x(Byte.valueOf(bArr[i2])));
        }
        return rVar;
    }
}
