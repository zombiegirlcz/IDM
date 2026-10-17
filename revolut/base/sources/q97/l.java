package q97;

import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.e f243727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy1.b f243728b;

    public l(t97.c productCellProvider, uw1.e apmProductProvider, oy1.b apmNavigationProvider) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(apmProductProvider, "apmProductProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        this.f243727a = apmProductProvider;
        this.f243728b = apmNavigationProvider;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        t97.d[] elements = {t97.d.APM_BIZUM, t97.d.APM_BLIK, t97.d.APM_BRE_B, t97.d.APM_IRIS, t97.d.APM_MULTIBANCO, t97.d.APM_MULTIBANCO_VIA_VERDE, t97.d.APM_PAYID, t97.d.APM_QVIK, t97.d.APM_QVIK_SECONDARY_ID, t97.d.APM_SPIN, t97.d.APM_UPI, t97.d.APM_UPI_MANDATES, t97.d.APM_WERO, t97.d.PIX};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.T(kotlin.collections.d.y0(elements), id10);
    }

    @Override // p97.c
    public final efm.r b() {
        ty1.e eVar = (ty1.e) this.f243727a;
        rfm.f0 f0VarA = eVar.a();
        ty1.b bVar = (ty1.b) eVar.f275460a;
        bVar.getClass();
        ufm.i iVar = new ufm.i(te0.w.H0(f0VarA, bVar.c(yoj.c.APM_MULTIBANCO)), new ty1.c(new tx.f(15), 2), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        efm.r rVarX = new ufm.i(iVar, new q3d.c(24, new h(this, 1)), 1).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        Object obj2 = productCell.f234283g;
        if (obj2 instanceof dx1.h) {
            ufm.b bVarM = efm.d0.m(new o97.d(this.f243728b.b((dx1.h) obj2)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (!(obj2 instanceof j)) {
            throw new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a));
        }
        if (k.f243720a[((j) obj2).ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        ufm.b bVarM2 = efm.d0.m(new o97.d(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3)));
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
