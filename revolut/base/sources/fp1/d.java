package fp1;

import com.revolut.feature.pay_bills_taxes.api.PayBillsAndTaxesApi$Toggles;
import efm.d0;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements vo1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f137038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f137039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f137040c;
    public final ang.f d;

    public d(uw1.c apmFeatureChecker, h productCatalogueInteractor, gte.a featureToggleInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f137038a = apmFeatureChecker;
        this.f137039b = productCatalogueInteractor;
        this.f137040c = featureToggleInteractor;
        this.d = userInteractor;
    }

    public final boolean a() {
        return ((jte.d) this.f137040c).c(PayBillsAndTaxesApi$Toggles.BillsCatalogue.f78657c) && c(cf9.h.f23659c);
    }

    public final d0 b() {
        i iVar = new i(((ty1.b) this.f137038a).c(yoj.c.APM_MULTIBANCO), new fjj.b(new c(this, 2), 10), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.c cVar = new ufm.c(new a(this, 5), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        i iVar2 = new i(this.d.f(false), new fjj.b(new c(this, 1), 9), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        int i = 2;
        ufm.c cVar2 = new ufm.c(new a(this, i), i);
        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
        ufm.c cVar3 = new ufm.c(new a(this, 1), 2);
        Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
        ufm.c cVar4 = new ufm.c(new a(this, 3), 2);
        Intrinsics.checkNotNullExpressionValue(cVar4, "fromCallable(...)");
        d0 d0VarZ = d0.z(iVar, cVar, iVar2, cVar2, cVar3, cVar4, new fjj.b(new b(), 7));
        Intrinsics.checkNotNullExpressionValue(d0VarZ, "zip(...)");
        return d0VarZ;
    }

    public final boolean c(av1.c cVar) {
        return this.f137039b.d(cVar.a(), null) == bla.c.ENABLED;
    }

    public final i d() {
        i iVar = new i(this.d.f(false), new fjj.b(new c(this, 0), 8), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
