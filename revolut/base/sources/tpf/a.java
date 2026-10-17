package tpf;

import java.lang.reflect.Type;
import kg.u;
import kg.w;
import kg.y;
import kg.z;
import kotlin.jvm.internal.Intrinsics;
import upf.j;
import upf.k;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements z {
    @Override // kg.z
    public final u serialize(Object obj2, Type type, y context) {
        k src2 = (k) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(context, "context");
        w wVar = new w();
        a31.a aVar = (a31.a) context;
        wVar.g("recipientAmount", aVar.n(src2.f282025a));
        wVar.g("senderCurrency", aVar.n(src2.f282026b));
        wVar.g("senderPocketId", aVar.n(src2.f282027c));
        j jVar = src2.d;
        wVar.g(jVar.a(), aVar.n(jVar.b()));
        String str = src2.e;
        if (str != null) {
            wVar.g("taxTreatment", aVar.n(str));
        }
        return wVar;
    }
}
