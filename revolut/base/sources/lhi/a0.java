package lhi;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class a0 implements hpa.a {

    @NotNull
    private static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f195258a;

    public a0(z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f195258a = contextProvider;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // hpa.a
    public final boolean b(ipa.j message) {
        String strF;
        CryptoWidgetContext cryptoWidgetContextB;
        Intrinsics.checkNotNullParameter(message, "message");
        if (ipa.k.l(message) != ipa.h.INTERACTIVE_FEED_UPDATE || (strF = ipa.k.f(message)) == null) {
            return false;
        }
        hf0.a aVarJ = ue0.e.j(this.f195258a.getContext());
        switch (strF.hashCode()) {
            case -1669548155:
                if (!strF.equals("TradingPortfolioFeed")) {
                    return false;
                }
                InvestWidgetContext.INSTANCE.getClass();
                ((ish.z) ((p28.b) ((d28.b) ue0.e.h(aVarJ, d28.b.class))).j()).j(InvestWidgetContext.Companion.a());
                return true;
            case -1473770012:
                if (!strF.equals("RetailCryptoPortfolio")) {
                    return false;
                }
                break;
            case -389110297:
                if (!strF.equals("TradingSingleFeed")) {
                    return false;
                }
                InvestWidgetContext.INSTANCE.getClass();
                ((ish.z) ((p28.b) ((d28.b) ue0.e.h(aVarJ, d28.b.class))).j()).j(InvestWidgetContext.Companion.b());
                return true;
            case 2255103:
                if (!strF.equals("Home")) {
                    return false;
                }
                ash.i iVarI = ((tc7.d) ((fc7.b) ue0.e.h(aVarJ, fc7.b.class))).i();
                HomeFeedWidgetContext.Personal.INSTANCE.getClass();
                ((ish.z) iVarI).j(HomeFeedWidgetContext.Personal.Companion.a());
                return true;
            case 2055505130:
                if (!strF.equals("RetailCryptoSingleFeed")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        ash.i iVarI2 = ((rs5.c) ((rr5.a) ue0.e.h(aVarJ, rr5.a.class))).i();
        if (strF.equals("RetailCryptoSingleFeed")) {
            CryptoWidgetContext.INSTANCE.getClass();
            cryptoWidgetContextB = CryptoWidgetContext.Companion.a();
        } else {
            CryptoWidgetContext.INSTANCE.getClass();
            cryptoWidgetContextB = CryptoWidgetContext.Companion.b();
        }
        ((ish.z) iVarI2).j(cryptoWidgetContextB);
        return true;
    }
}
