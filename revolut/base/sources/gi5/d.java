package gi5;

import ang.f;
import aw0.d4;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FcaDisclaimerDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto.onboarding.api.disclaimer.CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.crypto.onboarding.impl.R$string;
import efm.d0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements sh5.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f144091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f144092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f144093c;

    public d(f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f144091a = userInteractor;
        this.f144092b = featureToggleInteractor;
    }

    public static sh5.c e(xi0.b bVar) {
        CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_fca_onboarding_header_disclaimer_text_long, null, null, 14), new TextLocalisedClause(R$string.crypto_fca_onboarding_warning_link, null, new Click(12, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Object) new CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink(bVar), "CRYPTO_FCA_DISCLAIMER_LEARN_MORE", false), 10)));
        FcaDisclaimerDelegate.Model model = new FcaDisclaimerDelegate.Model("crypto_header_disclaimer_id", new d4(compositeClauseM), null);
        int i = R$attr.uikit_dp16;
        yp0.b.r(model, 0, 0, i, i, 3);
        return new sh5.c(compositeClauseM, model);
    }

    public static sh5.c f() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_home_header_disclaimer_text_israel, null, null, 14);
        FcaDisclaimerDelegate.Model model = new FcaDisclaimerDelegate.Model("crypto_header_disclaimer_id", new d4(textLocalisedClause), null);
        int i = R$attr.uikit_dp16;
        yp0.b.r(model, 0, 0, i, i, 3);
        return new sh5.c(textLocalisedClause, model);
    }

    public final sh5.c b(xi0.b bVar) {
        b bVar2 = this.f144093c;
        int i = bVar2 == null ? -1 : c.f144090a[bVar2.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return e(bVar);
        }
        if (i == 2) {
            return f();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        sh5.c.Companion.getClass();
        return sh5.b.a();
    }

    public final d0 c(xi0.b bVar) {
        sh5.c cVarB = b(bVar);
        if (cVarB != null) {
            ufm.b bVarM = d0.m(cVarB);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        d0 d0VarFirstOrError = m70.a.g(nim.a.w(this.f144091a.k(false), new gbi.c(this, bVar, 18)), null, new gcc.c(16), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final CryptoFcaRisksDestination d(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.d;
        CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink cryptoFcaDisclaimerWidget$Parcel$DisclaimerLink = obj2 instanceof CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink ? (CryptoFcaDisclaimerWidget$Parcel$DisclaimerLink) obj2 : null;
        if (cryptoFcaDisclaimerWidget$Parcel$DisclaimerLink != null) {
            return new CryptoFcaRisksDestination(cryptoFcaDisclaimerWidget$Parcel$DisclaimerLink.f70886a);
        }
        IllegalStateException illegalStateException = new IllegalStateException(v0.a.h(clickData.d, "Parcel was ", " but DisclaimerLink parcel was expected"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "CryptoFcaDisclaimerWidget", null, illegalStateException, h0Var);
        return null;
    }
}
