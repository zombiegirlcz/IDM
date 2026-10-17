package kkk;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import kkf.b4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.b f185131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dnk.k f185132b;

    public x(yik.b animatedBackgroundTypeMapper, dnk.k highlightedBenefitsMapper, b invitationHeaderImageProvider, cjk.b familyPlansTermsProvider) {
        Intrinsics.checkNotNullParameter(animatedBackgroundTypeMapper, "animatedBackgroundTypeMapper");
        Intrinsics.checkNotNullParameter(highlightedBenefitsMapper, "highlightedBenefitsMapper");
        Intrinsics.checkNotNullParameter(invitationHeaderImageProvider, "invitationHeaderImageProvider");
        Intrinsics.checkNotNullParameter(familyPlansTermsProvider, "familyPlansTermsProvider");
        this.f185131a = animatedBackgroundTypeMapper;
        this.f185132b = highlightedBenefitsMapper;
    }

    public static TextLocalisedClause a(hha.i iVar, hha.o oVar) {
        int i;
        int i2 = w.f185130a[iVar.ordinal()];
        if (i2 == 1) {
            i = R$string.family_plans_generic_monthly_price;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.family_plans_generic_annual_price;
        }
        return new TextLocalisedClause(i, zhm.u.c(new MoneyClause(oVar.f152326a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(t1.w(domainState.f185102b, domainState.f185101a, domainState.f185103c, domainState.d, domainState.e), new u(this, 0), new b4(6), new kcg.j(this, 7));
    }
}
