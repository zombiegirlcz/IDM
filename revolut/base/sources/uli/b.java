package uli;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.blik.api.navigation.BlikFeatureConfig;
import com.revolut.feature.card_contactless_limit.api.CardContactlessLimitFeatureConfig;
import com.revolut.feature.card_contactless_limit.api.Mode;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.checkout.api.resume.ResumeCheckoutFeatureConfig;
import com.revolut.feature.checkout.models.Checkout;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.starter.CardDeliveryStarterFragment;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FragmentDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.ui.activity.container.ContainerScreenContract$Configuration;
import efm.d0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import jla.h;
import k71.k;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qr0.i;
import te0.w;
import tof.a3;
import tof.ba;
import tof.i7;
import tof.q6;
import tof.q7;
import tof.r9;
import uj6.v;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f281023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gde.d f281024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f281025c;
    public final d4m.a d;
    public final d4m.a e;
    public final d4m.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zj2.a f281026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f281027h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CompositeCommand f281028j;

    public b(xoj.a featuresInteractor, gde.d helpCentreNaviCommandProvider, d4m.a localization, d4m.a revolutCardsNavigationFactory, d4m.a transactionsInteractor, d4m.a blikInteractor, zj2.a atmDestinationsResolver, h productCatalogueInteractor, i urlRootDomainChecker) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(helpCentreNaviCommandProvider, "helpCentreNaviCommandProvider");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(revolutCardsNavigationFactory, "revolutCardsNavigationFactory");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(blikInteractor, "blikInteractor");
        Intrinsics.checkNotNullParameter(atmDestinationsResolver, "atmDestinationsResolver");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(urlRootDomainChecker, "urlRootDomainChecker");
        this.f281023a = featuresInteractor;
        this.f281024b = helpCentreNaviCommandProvider;
        this.f281025c = localization;
        this.d = revolutCardsNavigationFactory;
        this.e = transactionsInteractor;
        this.f = blikInteractor;
        this.f281026g = atmDestinationsResolver;
        this.f281027h = productCatalogueInteractor;
        this.i = urlRootDomainChecker;
        this.f281028j = new CompositeCommand(f0.f322471a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.retail.core.navigation.FeatureCommand a(java.lang.String r2, jf0.c r3) {
        /*
            java.util.Map r3 = r3.d()
            java.lang.String r0 = "option"
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L46
            int r0 = r3.hashCode()
            switch(r0) {
                case -2140246347: goto L3a;
                case -429560054: goto L2e;
                case 2342692: goto L22;
                case 632296920: goto L16;
                default: goto L15;
            }
        L15:
            goto L46
        L16:
            java.lang.String r0 = "NOT_DELIVERED"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1f
            goto L46
        L1f:
            wy2.d r3 = wy2.d.NEVER_RECEIVED
            goto L47
        L22:
            java.lang.String r0 = "LOST"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L2b
            goto L46
        L2b:
            wy2.d r3 = wy2.d.LOST
            goto L47
        L2e:
            java.lang.String r0 = "COMPROMISED"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L37
            goto L46
        L37:
            wy2.d r3 = wy2.d.FRAUD_OR_THEFT
            goto L47
        L3a:
            java.lang.String r0 = "DAMAGED"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L43
            goto L46
        L43:
            wy2.d r3 = wy2.d.DAMAGED
            goto L47
        L46:
            r3 = 0
        L47:
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.card_management.api.CardManagementFeatureConfig$CardSelectReplaceReason r1 = new com.revolut.feature.card_management.api.CardManagementFeatureConfig$CardSelectReplaceReason
            r1.<init>(r2, r3)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uli.b.a(java.lang.String, jf0.c):com.revolut.retail.core.navigation.FeatureCommand");
    }

    public static ActivityNavigateCommand b(jf0.c cVar) {
        String str = (String) cVar.d().get("id");
        Bundle bundleBundleOf = BundleKt.bundleOf(new Pair("EXTRA_NEVER_RECEIVED_MODE", Intrinsics.f((String) cVar.d().get("never_received_mode"), "simplified") ? uce.c.REORDER_CARD : uce.c.ALL_OPTIONS));
        if (str != null) {
            m70.a.r(bundleBundleOf, "EXTRA_CARD_ID", str);
        }
        new FragmentDestination(CardDeliveryStarterFragment.class);
        ContainerScreenContract$Configuration containerScreenContract$Configuration = new ContainerScreenContract$Configuration(ewl.d.FULL_SCREEN, null, null, bundleBundleOf, CardDeliveryStarterFragment.class.getName(), null);
        ewl.g.Companion.getClass();
        return new ActivityNavigateCommand(ewl.e.a(), containerScreenContract$Configuration, null, 0, 0, null, null, null, null, false, 1008);
    }

    public static FeatureCommand d(String str, jf0.c cVar) {
        return new FeatureCommand(new CardContactlessLimitFeatureConfig(str != null ? new Mode.SingleCard(str, R$string.card_sca_limit_reset_tutorial_text_after_limit_reached) : new Mode.AllCardsLimitWarning(str, R$string.card_sca_limit_reset_all_cards_tutorial_text1_after_limit_reached, R$string.card_sca_limit_reset_all_cards_tutorial_text2_after_limit_reached), R$string.card_sca_limit_reset_tutorial_title_after_limit_reached, true, (Integer) null, true, Intrinsics.f(cVar.d().get("skip_initial_view"), "true"), 40));
    }

    public static FeatureCommand e(String str, jf0.c cVar) {
        return new FeatureCommand(new CardContactlessLimitFeatureConfig(str != null ? new Mode.SingleCard(str, R$string.card_sca_limit_reset_tutorial_text_before_limit_reached) : new Mode.AllCardsLimitWarning(str, R$string.card_sca_limit_reset_all_cards_tutorial_text1_before_limit_reached, R$string.card_sca_limit_reset_all_cards_tutorial_text2_before_limit_reached), R$string.card_sca_limit_reset_tutorial_title_before_limit_reached, false, (Integer) null, true, Intrinsics.f(cVar.d().get("skip_initial_view"), "true"), 40));
    }

    public static FeatureCommand h(jf0.c cVar) {
        String strG = cVar.g();
        return strG.length() == 0 ? new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.a(), null, null, 6))) : new FeatureCommand(new ResumeCheckoutFeatureConfig(new Checkout.Id(strG), AccountId.Personal.f51414a, (NaviCommand) null, 12));
    }

    public static String i(jf0.c cVar) {
        String strC = cVar.c();
        jf0.e eVarJ = cVar.j();
        String strK = cVar.k();
        Map mapD = cVar.d();
        String strF = cVar.f();
        StringBuilder sb6 = new StringBuilder("Deeplink(originalUri=");
        sb6.append(strC);
        sb6.append(", type=");
        sb6.append(eVarJ);
        sb6.append(", uri=");
        sb6.append(strK);
        sb6.append(", parameters=");
        sb6.append(mapD);
        sb6.append(", pattern=");
        return v0.a.i(sb6, strF, ")");
    }

    public static k71.i j(String str, jf0.c cVar) {
        return qk.d.d(cVar.g(), str, (String) cVar.d().get("walletId"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0263, code lost:
    
        if (r2.equals("waiting-list-friend") == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d7, code lost:
    
        if (r2.equals("source-of-funds") == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04dd, code lost:
    
        if (r2.equals("topup") == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04e1, code lost:
    
        r2 = (java.lang.String) r30.d().get("currency");
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04eb, code lost:
    
        if (r2 == null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04ed, code lost:
    
        xi0.b.Companion.getClass();
        r20 = xi0.a.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04f7, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04fd, code lost:
    
        if (cp5.d.A(r20) == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04ff, code lost:
    
        r13 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0502, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0503, code lost:
    
        r0 = (java.lang.String) r30.d().get("amount");
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x050f, code lost:
    
        if (r0 == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0511, code lost:
    
        r0 = kotlin.text.z.n(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0515, code lost:
    
        if (r0 == null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0517, code lost:
    
        r4 = r0.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x051b, code lost:
    
        if (r13 == 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x051d, code lost:
    
        r20 = new dj0.d(r4, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0525, code lost:
    
        r20 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0527, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x052b, code lost:
    
        if (r3 == null) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x052d, code lost:
    
        r2 = com.revolut.feature.topup_screen.api.config.TopUpConfig.Companion.a(com.revolut.feature.topup_screen.api.config.TopUpConfig.INSTANCE, r3, null, null, 30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0534, code lost:
    
        r2 = com.revolut.feature.topup_screen.api.config.TopUpConfig.Companion.c(com.revolut.feature.topup_screen.api.config.TopUpConfig.INSTANCE, r13, null, null, null, 30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0547, code lost:
    
        return zh9.u0.f(new com.revolut.feature.topup_screen.api.destination.InitTopUpDestination(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0b0f, code lost:
    
        if (r2.equals("waiting-list-top-of-list") == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0b19, code lost:
    
        if (r2.equals("sign-in-consent") == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0b24, code lost:
    
        return new com.revolut.retail.core.navigation.FeatureCommand(com.revolut.feature.extension_auth.api.ExtensionAuthFeatureConfig.f72163a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0ce4, code lost:
    
        if (r2.equals("waiting-list-me") == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0cfc, code lost:
    
        return new com.revolut.retail.core.navigation.FeatureCommand(new com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig.Main((java.lang.String) null, (com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig.Main.SSODeeplinkData) null, false, (com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig.UseCase) new com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig.UseCase.SignIn(0), 7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0163, code lost:
    
        if (r2.equals("access-consent") == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0db2, code lost:
    
        if (r2.equals("sof-status") == false) goto L610;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0dd0, code lost:
    
        return new com.revolut.retail.core.navigation.FeatureCommand(new com.revolut.feature.selfserve.sow.api.navigation.SowFeatureConfig.Sow(false, java.lang.Boolean.parseBoolean((java.lang.String) r30.d().get("skip-home"))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016f, code lost:
    
        if (r2.equals("topup-card") == false) goto L610;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.retail.core.navigation.NaviCommand c(jf0.c r30) {
        /*
            Method dump skipped, instruction units count: 3928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uli.b.c(jf0.c):com.revolut.retail.core.navigation.NaviCommand");
    }

    public final NaviCommand f(jf0.c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar2 = rd0.c.INFO;
        rd0.d.b(cVar2, "DeeplinkNavigation", j6.a.q("BLIK Deeplink: ", i(cVar)), null, null, 16);
        String strL = m70.a.l(cVar.g());
        CompositeCommand compositeCommand = this.f281028j;
        Continuation continuation = null;
        if (strL == null) {
            rd0.d.a(rd0.c.ERROR, null, null, new IllegalStateException(j6.a.q("BLIK deeplink couldn't find tx ID: ", strL)), h0.f322473a);
            return compositeCommand;
        }
        if (((Boolean) w.o0(kotlin.coroutines.g.f186406a, new u83.f(this, continuation, 13)).e()).booleanValue()) {
            rd0.d.b(cVar2, "DeeplinkNavigation", "BLIK Deeplink: open confirmation", null, null, 16);
            return new FeatureCommand(new BlikFeatureConfig.BlikTransactionConfirmationConfig(0));
        }
        rd0.d.a(rd0.c.ERROR, null, null, new IllegalStateException("BLIK deeplink couldn't find any pending tx: ".concat(strL)), h0.f322473a);
        return compositeCommand;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final NaviCommand g(jf0.c cVar) {
        com.revolut.feature.transactions.api.navigation.c cVar2;
        com.revolut.feature.transactions.api.navigation.c cVar3;
        a3 a3Var;
        String strI = cVar.i();
        switch (strI.hashCode()) {
            case -1367724422:
                if (!strI.equals("cancel")) {
                    cVar2 = null;
                } else {
                    cVar3 = com.revolut.feature.transactions.api.navigation.c.CANCEL;
                    cVar2 = cVar3;
                }
                break;
            case -938102371:
                if (!strI.equals("rating")) {
                    cVar2 = null;
                } else {
                    cVar3 = com.revolut.feature.transactions.api.navigation.c.RATING;
                    cVar2 = cVar3;
                }
                break;
            case 860974167:
                if (!strI.equals("accept-alert")) {
                    cVar2 = null;
                } else {
                    cVar3 = com.revolut.feature.transactions.api.navigation.c.ACCEPT_ALERT;
                    cVar2 = cVar3;
                }
                break;
            case 983597621:
                if (!strI.equals("rating2")) {
                    cVar2 = null;
                } else {
                    cVar3 = com.revolut.feature.transactions.api.navigation.c.RATING;
                    cVar2 = cVar3;
                }
                break;
            default:
                cVar2 = null;
                break;
        }
        k71.i iVarJ = cVar2 != null ? j(null, cVar) : j(m70.a.l(cVar.i()), cVar);
        boolean zBooleanValue = false;
        try {
            i7.c cVar4 = i7.Companion;
            r9 r9Var = new r9(iVarJ.a());
            String strJ = qk.d.j(iVarJ);
            ba baVar = strJ != null ? new ba(strJ) : null;
            cVar4.getClass();
            q7 q7VarA = i7.c.a(r9Var, baVar);
            Object obj2 = this.e.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            ufm.i iVarB = com.revolut.domain.interactors.transactions.a.b((com.revolut.domain.interactors.transactions.a) obj2, q7VarA, null, null, null, null, 30);
            ufm.b bVarM = d0.m(f0.f322471a);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Object objE = iVarB.d(bVarM.i(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS)).e();
            Intrinsics.checkNotNullExpressionValue(objE, "blockingGet(...)");
            a3Var = (a3) zhm.d0.d0((List) objE);
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "DeeplinkNavigation", "Failed to get transaction by descriptor " + iVarJ, th10, h0Var);
            a3Var = null;
        }
        if (a3Var != null && cVar2 == null) {
            q6 q6VarK = qk.d.k(iVarJ);
            iVarJ = q6VarK != null ? new k71.h(a3Var, q6VarK) : new k71.g(a3Var);
        }
        k71.i iVar = iVarJ;
        a3 a3Var2 = a3Var;
        FeatureCommand featureCommand = new FeatureCommand(new TransactionsFeatureConfig.Details(iVar, com.revolut.feature.transactions.api.navigation.a.PUSH, cVar2, cVar.d(), 52));
        if (a3Var2 == null) {
            return featureCommand;
        }
        boolean z = cp5.d.z(a3Var2.c().f115083b);
        boolean zU1 = k.u1(a3Var2);
        try {
            ufm.i iVar2 = new ufm.i(((cpj.b) this.f281023a).e(yoj.c.CRYPTO, yoj.d.DISABLED), new uhl.b(new v(16), 21), 1);
            ufm.b bVarM2 = d0.m(Boolean.FALSE);
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            Boolean bool = (Boolean) iVar2.d(bVarM2.i(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS)).e();
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } catch (Throwable th11) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "DeeplinkNavigation", "Failed to get crypto feature state", th11, h0Var2);
        }
        return (z && zU1 && zBooleanValue && cVar2 != null) ? com.revolut.retail.core.navigation.a.c(new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(a3Var2.c().f115083b, ocj.a.TRANSACTIONS, null, null, 60)), featureCommand) : com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.a(), null, null, 6))), featureCommand);
    }
}
