package bce;

import com.revolut.data.model.Data;
import efm.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import r21.h;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f14435b;

    public /* synthetic */ d(g gVar, int i) {
        this.f14434a = i;
        this.f14435b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        r map;
        p subscription = (p) obj2;
        switch (this.f14434a) {
            case 0:
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                f5j.a aVar = subscription.f249329r;
                return (aVar == null || (str = aVar.f132329a) == null || (map = ((h) this.f14435b.f).h(str, false).map(new e(new bbh.a(6), 1))) == null) ? w.h(Boolean.FALSE) : map;
            default:
                Intrinsics.checkNotNullParameter(subscription, "recurringPayment");
                ((sce.g) this.f14435b.f14440b).w0().set(subscription);
                return new hce.c(new hce.b(subscription, new Data(null, null, false, 7, null), null), false);
        }
    }
}
