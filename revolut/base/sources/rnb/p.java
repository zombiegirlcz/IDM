package rnb;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.domain.interactors.SavingsDisclaimersClickAction;
import com.revolut.feature.retail.savings.impl.domain.interactors.OpenTerms;
import com.revolut.feature.retail.savings.impl.domain.interactors.OpenUrl;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements djb.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f255573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f255574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mre.c f255575c;

    public p(l61.a companyInteractor, ang.f userInteractor, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(companyInteractor, "companyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f255573a = companyInteractor;
        this.f255574b = userInteractor;
        this.f255575c = termsNavigationFactory;
    }

    public static TextLocalisedClause a(int i, String str, String str2) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.balance_picker_revolut_terms, null, new Click(28, (Integer) null, (Object) new OpenUrl(str), "ID_GB_REVOLUT_TERMS", false), 10);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.balance_picker_partner_terms, null, new Click(28, (Integer) null, (Object) new OpenUrl(str2), "ID_GB_PARTNER_TERMS", false), 10);
        int i2 = R$string.savings_disclaimers_personal_terms;
        TermsScope.INSTANCE.getClass();
        return new TextLocalisedClause(i, zhm.v.k(textLocalisedClause, textLocalisedClause2, new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) new OpenTerms(TermsScope.S), "ID_PERSONAL_TERMS", false), 10)), null, 12);
    }

    public final Object b(SavingsDisclaimersClickAction savingsDisclaimersClickAction, gim.c cVar) throws Throwable {
        if (savingsDisclaimersClickAction instanceof OpenTerms) {
            return nim.a.b(((rre.d) this.f255575c).c(((OpenTerms) savingsDisclaimersClickAction).f83340a, null), cVar);
        }
        if (savingsDisclaimersClickAction instanceof OpenUrl) {
            return u0.f(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(((OpenUrl) savingsDisclaimersClickAction).f83341a, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
        }
        hx7.e.n(new IllegalArgumentException("Unsupported action " + savingsDisclaimersClickAction));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.shared.savings.models.product.SavingsProduct r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rnb.p.c(com.revolut.feature.shared.savings.models.product.SavingsProduct, gim.c):java.lang.Object");
    }
}
