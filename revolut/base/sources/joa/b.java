package joa;

import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.crypto.features.api.navigation.CryptoFeaturesDestination;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingConsentsDestination;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.pockets.api.navigation.PocketsListFeatureConfig;
import com.revolut.feature.profile.api.navigation.ProfileFeatureConfig;
import com.revolut.feature.profile.impl.ui.profile.screens.profile_account.ProfileAccountScreen;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesDestination;
import com.revolut.sso.api.navigation.RevolutSsoPasskeysManagementFlowDestination;
import com.revolut.sso.api.passcode.change.RevolutSsoChangePasscodeFlowDestination;
import ip0.yc0;
import jec.p;
import ji1.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        d dVar = (d) this.receiver;
        KProperty[] kPropertyArr = ProfileAccountScreen.f81475b0;
        i iVar = (i) dVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj4 = model.u;
        switch (str.hashCode()) {
            case -2087664248:
                if (str.equals("ID_ALL_ACCOUNTS")) {
                    iVar.C1(new BridgeDestination(new FeatureCommand(new PocketsListFeatureConfig(fda.a.FIAT_CURRENCIES_POCKETS))));
                }
                break;
            case -2043544161:
                if (str.equals("ID_ABOUT_PRIVACY_POLICY")) {
                    iVar.l2(new g(iVar, null, 0), new yi5.b(26));
                }
                break;
            case -2029462210:
                if (str.equals("ID_PROFILE_DOCUMENTS")) {
                    ((jma.i) iVar.f176908r).getClass();
                    iVar.C1(new BridgeDestination(new FeatureCommand(ProfileFeatureConfig.Documents.f81347a)));
                }
                break;
            case -1853293719:
                if (str.equals("ID_OPEN_FINANCE")) {
                    iVar.C1(OpenBankingConsentsDestination.f72349a);
                }
                break;
            case -1838824118:
                if (str.equals("ID_ACCOUNT_SWITCH")) {
                    mn2.a aVar = obj4 instanceof mn2.a ? (mn2.a) obj4 : null;
                    if (aVar != null) {
                        iVar.C1(new BankAccountSwitchingDestination(new BankAccountSwitchingFlowInputData.RequestList(aVar)));
                    }
                }
                break;
            case -1368895499:
                if (str.equals("ID_TRADING_RULES")) {
                    iVar.C1(u0.b(new BrowserCommand(((f80.b) iVar.z).f("https://www.revolut.com/en-GB/legal/crypto-exchange-trading-rules"))));
                }
                break;
            case -716683223:
                if (str.equals("ID_PASSKEYS")) {
                    iVar.C1(RevolutSsoPasskeysManagementFlowDestination.f106011b);
                }
                break;
            case -447829312:
                if (str.equals("ID_POD_NOMINEES")) {
                    iVar.C1(PodNomineesDestination.f102578a);
                }
                break;
            case -287099483:
                if (str.equals("ID_LEGAL_DISCLAIMER")) {
                    Terms terms = obj4 instanceof Terms ? (Terms) obj4 : null;
                    if (terms != null) {
                        iVar.C1(new BridgeDestination(((rre.d) iVar.f176910t).b(terms)));
                    }
                }
                break;
            case -205617799:
                if (str.equals("ID_SECURITY_PASSCODE")) {
                    iVar.C1(new RevolutSsoChangePasscodeFlowDestination(0));
                }
                break;
            case -187443196:
                if (str.equals("ID_EXIT_TERMINATE")) {
                    iVar.l2(new m(iVar, null, 8), new yc0(1, iVar, i.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 12));
                }
                break;
            case 189353415:
                if (str.equals("ID_PERSONAL_DETAILS")) {
                    qa.c cVar = (qa.c) ((c) iVar.t2()).f176900h.getContent();
                    iVar.C1(cVar instanceof qa.b ? til.m.a(iVar.B, new WorkflowConfiguration.Workflow(((qa.b) cVar).f243920a, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), null, 4) : UserDetailsDestination.f26226a);
                }
                break;
            case 355760758:
                if (str.equals("ID_CALIFORNIA_COLLECTION_NOTICE")) {
                    TermsScope.INSTANCE.getClass();
                    iVar.l2(new p(iVar, TermsScope.f90374n0, null, 21), new yi5.b(26));
                }
                break;
            case 602238798:
                if (str.equals("ID_ABOUT_TERMS_AND_CONDITIONS")) {
                    iVar.l2(new g(iVar, null, 1), new yi5.b(26));
                }
                break;
            case 1078200408:
                if (str.equals("ID_LIMITS_AND_FEES")) {
                    iVar.C1(new CryptoFeaturesDestination(null));
                }
                break;
        }
        return Unit.f186387a;
    }
}
