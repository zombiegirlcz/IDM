package shh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends chh.b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hj8.a f263479l;

    public f(hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f263479l = juniorProfileInteractor;
    }

    @Override // chh.b
    public final Flow Z2(WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount) {
        Intrinsics.checkNotNullParameter(taxAdvantageWealthAccount, "taxAdvantageWealthAccount");
        if ((taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) || (taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa)) {
            return zi0.c.i(new chh.h(taxAdvantageWealthAccount));
        }
        if (taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Personal) {
            return zi0.c.i(new chh.i((WealthAccount.TaxAdvantageWealthAccount.JIsa) taxAdvantageWealthAccount));
        }
        if (!(taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian)) {
            throw new NoWhenBranchMatchedException();
        }
        String string = ((WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian) taxAdvantageWealthAccount).f.f105175a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return nim.a.v(hj8.a.d(this.f263479l, string, w4l.h.f294642c), new d(taxAdvantageWealthAccount, 0));
    }
}
