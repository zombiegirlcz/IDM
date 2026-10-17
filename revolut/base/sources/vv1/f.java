package vv1;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import zhm.d0;
import zhm.v;
import zjh.j;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data legalEntityContextData = (Data) obj2;
        Intrinsics.checkNotNullParameter(legalEntityContextData, "p0");
        wv1.c cVar = (wv1.c) this.receiver;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(legalEntityContextData, "legalEntityContextData");
        return d0.E0(j.v(cVar.f300262b, legalEntityContextData), ((s12.f) cVar.f300261a).b(v.k(uv1.a.About, uv1.a.Help)));
    }
}
