package v20;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 implements kg.z {
    @Override // kg.z
    public final kg.u serialize(Object obj2, Type typeOfSrc, kg.y context) {
        h0 src2 = (h0) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(typeOfSrc, "typeOfSrc");
        Intrinsics.checkNotNullParameter(context, "context");
        kg.w wVar = new kg.w();
        wVar.h("type", src2.f285419a);
        wVar.h("rawData", src2.f285420b);
        return wVar;
    }
}
