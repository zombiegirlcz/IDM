package q97;

import com.revolut.feature.credit.health.api.navigation.CreditHealthNavigationDestination;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r05.e f243709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(t97.c productCellProvider, xq3.w creditPrimaryEntryPointsInteractor, r05.e creditScoreEntryPointInteractor) {
        super(productCellProvider, creditPrimaryEntryPointsInteractor);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(creditPrimaryEntryPointsInteractor, "creditPrimaryEntryPointsInteractor");
        Intrinsics.checkNotNullParameter(creditScoreEntryPointInteractor, "creditScoreEntryPointInteractor");
        this.f243709c = creditScoreEntryPointInteractor;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        if (productCell.f234280a != t97.d.CREDIT_HEALTH) {
            ufm.c cVarL = efm.d0.l(new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a)));
            Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
            return cVarL;
        }
        ufm.b bVarM = efm.d0.m(new o97.l(zh9.u0.f(CreditHealthNavigationDestination.f69955b)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // q97.p
    public final fs3.b d() {
        return fs3.b.CREDIT_HEALTH;
    }

    @Override // q97.p
    public final t97.d e() {
        return t97.d.CREDIT_HEALTH;
    }

    @Override // q97.p
    public final Flow f() {
        return rd0.e.e(vkm.q.q(new n33.r0(mo3.a.g(this.f243709c.a(), null, new q92.f(7), 1), 25)), zhm.h0.f322473a, new otd.a(3, 16, null));
    }
}
