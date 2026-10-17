package a6j;

import ah3.g;
import android.content.Intent;
import cjl.n;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checklist_challenges.api.navigation.ChecklistCollectionDestination;
import com.revolut.feature.checklist_challenges_ui.impl.navigation.ChecklistStepDetailsDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig;
import com.revolut.feature.salary_switch.api.navigation.SalaryAccountDetailsDestination;
import com.revolut.feature.salary_switch.api.navigation.SalarySwitchDestination;
import com.revolut.feature.separate_favourites.api.alerts.AlertsFeatureConfig;
import com.revolut.feature.separate_favourites.api.combined_watchlist.CombinedWatchlistFeatureConfig;
import com.revolut.feature.separate_favourites.api.converter.ConverterFeatureConfig;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.IntentCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.sso.api.app_consent.RevolutSsoQrConsentDestination;
import com.revolut.sso.api.app_consent.SsoQrConsentInputData;
import d7j.k1;
import efm.d0;
import grj.o;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import l1.e;
import omd.f;
import op0.o3;
import org.jmrtd.lds.LDSFile;
import q06.h;
import q06.i;
import q06.j;
import sri.m;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1699c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, Object obj3, boolean z, int i) {
        this.f1697a = i;
        this.f1699c = obj2;
        this.d = obj3;
        this.f1698b = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        NaviCommand naviCommandB;
        NaviCommand featureCommand;
        boolean z = false;
        int i = 1;
        switch (this.f1697a) {
            case 0:
                d dVar = (d) this.f1699c;
                j jVar = (j) this.d;
                boolean z3 = this.f1698b;
                m mVar = dVar.f1701a;
                Intrinsics.h(jVar);
                if (jVar instanceof i) {
                    naviCommandB = d.b(null);
                } else {
                    if (!(jVar instanceof h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ParcelableDestination parcelableDestination = ((h) jVar).f241169a;
                    Intrinsics.i(parcelableDestination, "null cannot be cast to non-null type com.revolut.kompot.bridge.navigation.BridgeDestination");
                    naviCommandB = ((BridgeDestination) parcelableDestination).f98270a;
                    if (z3) {
                        naviCommandB = d.b(naviCommandB);
                    }
                }
                mVar.c(naviCommandB);
                return Boolean.TRUE;
            case 1:
                ah3.d dVar2 = (ah3.d) this.f1699c;
                jf0.c cVar = (jf0.c) this.d;
                boolean z4 = this.f1698b;
                ChecklistCollectionDestination checklistCollectionDestinationB = ah3.d.b(cVar);
                if (checklistCollectionDestinationB == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                NaviCommand naviCommandF = u0.f(checklistCollectionDestinationB);
                if (z4) {
                    naviCommandF = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), naviCommandF);
                }
                dVar2.f4880a.c(naviCommandF);
                return Boolean.TRUE;
            case 2:
                g gVar = (g) this.f1699c;
                jf0.c cVar2 = (jf0.c) this.d;
                boolean z6 = this.f1698b;
                ChecklistStepDetailsDestination checklistStepDetailsDestinationB = g.b(cVar2);
                if (checklistStepDetailsDestinationB == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                NaviCommand naviCommandF2 = u0.f(checklistStepDetailsDestinationB);
                if (z6) {
                    naviCommandF2 = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), naviCommandF2);
                }
                gVar.f4882a.c(naviCommandF2);
                return Boolean.TRUE;
            case 3:
                b3d.c cVar3 = (b3d.c) this.f1699c;
                jf0.c cVar4 = (jf0.c) this.d;
                boolean z11 = this.f1698b;
                Set setB = b3d.c.b(cVar4);
                if (!setB.isEmpty()) {
                    FeatureCommand featureCommand2 = new FeatureCommand(new ConverterFeatureConfig.ConverterScreen(14, setB));
                    if (z11) {
                        featureCommand2 = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, featureCommand2, 2)));
                    }
                    cVar3.f12022a.c(featureCommand2);
                }
                return Boolean.TRUE;
            case 4:
                cid.a aVar = (cid.a) this.f1699c;
                jf0.c cVar5 = (jf0.c) this.d;
                boolean z12 = this.f1698b;
                NaviCommand naviCommandB2 = cid.a.b(cVar5);
                if (naviCommandB2 == null) {
                    return Boolean.FALSE;
                }
                m mVar2 = aVar.f24445b;
                if (z12) {
                    naviCommandB2 = com.revolut.retail.core.navigation.a.c(jbb.a.a(ibb.c.e, null, null, null, 14), naviCommandB2);
                }
                mVar2.c(naviCommandB2);
                return Boolean.TRUE;
            case 5:
                fg8.d dVar3 = (fg8.d) this.f1699c;
                dVar3.f134915b.c(fg8.d.a(com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Error("ID_STATUS_VIEW_ERROR_ACTIVATION_ERROR", hf8.b.a(dVar3.f134916c, (Throwable) this.d), null, null, null, null, null, 8188), null, null, null, null, 510), this.f1698b));
                return Unit.f186387a;
            case 6:
                grj.i iVar = (grj.i) this.f1699c;
                AccountId accountId = (AccountId) this.d;
                boolean z29 = this.f1698b;
                o oVar = iVar.d;
                synchronized (((HashMap) oVar.f)) {
                }
                return new pfm.a(iVar.c(accountId), new gqk.b(new k1(iVar, z29, i), 16), 4);
            case 7:
                hdb.c cVar6 = (hdb.c) this.f1699c;
                jf0.c cVar7 = (jf0.c) this.d;
                boolean z31 = this.f1698b;
                hdb.b bVarB = hdb.c.b(cVar7);
                if (bVarB == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                KompotFeatureConfig kompotFeatureConfigA = cka.b.a(cVar6.f151405b, bVarB.f151402a, SkipShownArticleBehaviour.AlwaysShow.f81285a, null, null, bVarB.f151403b, LDSFile.EF_DG12_TAG);
                m mVar3 = cVar6.f151404a;
                NaviCommand featureCommand3 = new FeatureCommand(kompotFeatureConfigA);
                if (z31) {
                    featureCommand3 = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))), featureCommand3);
                }
                mVar3.c(featureCommand3);
                return Boolean.TRUE;
            case 8:
                j2d.a aVar2 = (j2d.a) this.f1699c;
                jf0.c cVar8 = (jf0.c) this.d;
                boolean z41 = this.f1698b;
                SharedAlertsConfiguration sharedAlertsConfigurationB = j2d.a.b(cVar8);
                if (sharedAlertsConfigurationB == null) {
                    return d0.m(Boolean.TRUE);
                }
                FeatureCommand featureCommand4 = new FeatureCommand(new AlertsFeatureConfig.AlertsScreen(sharedAlertsConfigurationB));
                m mVar4 = aVar2.f170835a;
                if (z41) {
                    featureCommand4 = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, featureCommand4, 2)));
                }
                mVar4.c(featureCommand4);
                pfm.m mVar5 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar5, "complete(...)");
                return mVar5.D(Boolean.TRUE);
            case 9:
                j3d.c cVar9 = (j3d.c) this.f1699c;
                jf0.c cVar10 = (jf0.c) this.d;
                boolean z49 = this.f1698b;
                Set setB2 = j3d.c.b(cVar10);
                if (!setB2.isEmpty()) {
                    m mVar6 = cVar9.f171177a;
                    NaviCommand[] elements = {z49 ? new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP)) : null, new FeatureCommand(new CombinedWatchlistFeatureConfig(new CombinedWatchlistContext("COMBINED_WATCHLIST_ORDERING_HOME", setB2, setB2)))};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    mVar6.c(new CompositeCommand(kotlin.collections.d.L(elements)));
                }
                return Boolean.TRUE;
            case 10:
                lqc.b bVar = (lqc.b) this.f1699c;
                jf0.c cVar11 = (jf0.c) this.d;
                boolean z54 = this.f1698b;
                m mVar7 = bVar.f199307a;
                StackDestination salaryAccountDetailsDestination = Intrinsics.f(cVar11.e(2), "account-details") ? new SalaryAccountDetailsDestination(null) : new SalarySwitchDestination(null, cVar11.e(2));
                if (salaryAccountDetailsDestination instanceof SalaryAccountDetailsDestination) {
                    featureCommand = new FeatureCommand(new KompotOverlayFeatureConfig(salaryAccountDetailsDestination, yhi.b.POPUP, (Integer) null, 12));
                    if (z54) {
                        featureCommand = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), featureCommand);
                    }
                } else {
                    if (!(salaryAccountDetailsDestination instanceof SalarySwitchDestination)) {
                        throw new IllegalStateException("Unexpected Salary Switch deeplink destination");
                    }
                    NaviCommand naviCommandF3 = u0.f(salaryAccountDetailsDestination);
                    if (z54) {
                        naviCommandF3 = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), naviCommandF3);
                    }
                    featureCommand = naviCommandF3;
                }
                mVar7.c(featureCommand);
                return Boolean.TRUE;
            case 11:
                jf0.c cVar12 = (jf0.c) this.f1699c;
                boolean z74 = this.f1698b;
                cid.a aVar3 = (cid.a) this.d;
                FeatureCommand featureCommand5 = new FeatureCommand(new KompotOverlayFeatureConfig(new RevolutSsoQrConsentDestination(new SsoQrConsentInputData(n.QrPersonal, cVar12.e(3), null)), yhi.b.SOLID, (Integer) null, 12));
                if (z74) {
                    featureCommand5 = jbb.a.a(ibb.c.f160140a, null, null, featureCommand5, 6);
                }
                aVar3.f24445b.c(featureCommand5);
                return Boolean.TRUE;
            case 12:
                mxa.h hVar = (mxa.h) this.f1699c;
                jf0.c cVar13 = (jf0.c) this.d;
                boolean z83 = this.f1698b;
                Intent intentB = hVar.b(cVar13);
                if (intentB == null) {
                    return Boolean.FALSE;
                }
                NaviCommand intentCommand = new IntentCommand(intentB, null);
                m mVar8 = hVar.f210246a;
                if (z83) {
                    intentCommand = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))), intentCommand);
                }
                mVar8.c(intentCommand);
                return Boolean.TRUE;
            case 13:
                jf0.c cVar14 = (jf0.c) this.f1699c;
                m mVar9 = ((omd.c) this.d).f226813a;
                boolean z89 = this.f1698b;
                if (Intrinsics.f(cVar14.e(1), "income-sorters")) {
                    String strE = cVar14.e(2);
                    if (Intrinsics.f(strE, "new")) {
                        mVar9.c(omd.a.a(new FeatureCommand(new AnalyticsFeatureConfig.IncomeSorterCreation((String) cVar14.d.get("transactionId"))), z89));
                    } else if (Intrinsics.f(strE, "executions")) {
                        String strE2 = cVar14.e(3);
                        if (strE2.length() > 0) {
                            mVar9.c(omd.a.a(new FeatureCommand(new AnalyticsFeatureConfig.IncomeSorterExecutionScreen(strE2)), z89));
                        } else {
                            mVar9.c(omd.a.a(new FeatureCommand(AnalyticsFeatureConfig.IncomeSortersList.f87417h), z89));
                        }
                    } else if (strE.length() > 0) {
                        mVar9.c(omd.a.a(new FeatureCommand(new AnalyticsFeatureConfig.IncomeSorterDetails(cVar14.e(2))), z89));
                    } else {
                        mVar9.c(omd.a.a(new FeatureCommand(AnalyticsFeatureConfig.IncomeSortersList.f87417h), z89));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                jf0.c cVar15 = (jf0.c) this.f1699c;
                m mVar10 = ((omd.g) this.d).f226817a;
                boolean z96 = this.f1698b;
                String strE3 = cVar15.e(2);
                if (!Intrinsics.f(strE3, "custom-assets") || cVar15.e(3).length() <= 0) {
                    f fVarD = omd.g.d(strE3);
                    if (fVarD == null) {
                        f.Companion.getClass();
                        fVarD = f.f226814c;
                    }
                    mVar10.c(omd.a.a(new FeatureCommand(new AnalyticsFeatureConfig.TotalWealthScreen(fVarD.f226815a, fVarD.f226816b, omd.g.b(cVar15))), z96));
                } else {
                    String customAssetId = cVar15.e(3);
                    Intrinsics.checkNotNullParameter(customAssetId, "customAssetId");
                    mVar10.c(omd.a.a(new FeatureCommand(new AnalyticsFeatureConfig.TotalWealthCustomAssetDetails(new AnalyticsFeatureConfig.TotalWealthCustomAssetDetails.Destination(customAssetId), null)), z96));
                }
                return Boolean.TRUE;
            case 15:
                oq3.m mVar11 = (oq3.m) this.f1699c;
                return new pfm.a(mVar11.c(), new o3(24, new e(mVar11, this.f1698b, (jf0.c) this.d, 25)), 4);
            case 16:
                q9f.b bVar2 = (q9f.b) this.f1699c;
                jf0.c cVar16 = (jf0.c) this.d;
                boolean z100 = this.f1698b;
                m mVar12 = bVar2.f243889a;
                NaviCommand featureCommand6 = new FeatureCommand(q9f.b.b(cVar16));
                if (z100) {
                    featureCommand6 = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))), featureCommand6);
                }
                mVar12.c(featureCommand6);
                return Boolean.TRUE;
            case 17:
                vli.b bVar3 = (vli.b) this.f1699c;
                jf0.c cVar17 = (jf0.c) this.d;
                boolean z101 = this.f1698b;
                NaviCommand naviCommandB3 = bVar3.b(cVar17);
                m mVar13 = bVar3.f290449a;
                if (z101) {
                    naviCommandB3 = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))), naviCommandB3);
                }
                mVar13.c(naviCommandB3);
                return Boolean.TRUE;
            case 18:
                vli.m mVar14 = (vli.m) this.f1699c;
                jf0.c cVar18 = (jf0.c) this.d;
                boolean z102 = this.f1698b;
                m mVar15 = mVar14.f290473a;
                Regex regex = jf0.f.f173632a;
                NaviCommand featureCommand7 = new FeatureCommand(new RemoteStoriesFeatureConfig.Deeplink(u.c(jf0.f.a(cVar18.f173627a))));
                if (z102) {
                    featureCommand7 = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))), featureCommand7);
                }
                mVar15.c(featureCommand7);
                return Boolean.TRUE;
            default:
                z0e.b bVar4 = (z0e.b) this.f1699c;
                n4l.e eVar = (n4l.e) this.d;
                boolean z103 = this.f1698b;
                d1e.a aVar4 = bVar4.f318239b;
                Intrinsics.h(eVar);
                NaviCommand naviCommandB4 = aVar4.b(eVar);
                m mVar16 = bVar4.f318240c;
                if (naviCommandB4 == null) {
                    naviCommandB4 = z0e.b.b();
                } else if (z103) {
                    naviCommandB4 = com.revolut.retail.core.navigation.a.c(z0e.b.b(), naviCommandB4);
                }
                mVar16.c(naviCommandB4);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(Object obj2, boolean z, Object obj3, int i) {
        this.f1697a = i;
        this.f1699c = obj2;
        this.f1698b = z;
        this.d = obj3;
    }
}
