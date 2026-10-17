package br6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.network.models.security.SecuritySettings;
import com.revolut.feature.card.terminate.api.navigation.CardTerminateDestination;
import com.revolut.feature.card_screen.common.tapandpay.TapAndPayPresenterDelegate$NegativeBalancePayload;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.corporate_events.navigation.CorporateEventDetailsDestination;
import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.retail.legacy.login.api.TwoFaFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import gei.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf0.c;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import mei.g;
import mif.o;
import msb.i;
import nif.w0;
import q06.h;
import sri.m;
import tjg.e;
import z63.k;
import zh9.u0;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17932c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj2, Object obj3, boolean z, int i) {
        this.f17930a = i;
        this.f17932c = obj2;
        this.d = obj3;
        this.f17931b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // kfm.a
    public final void run() {
        ?? F1;
        Object next;
        switch (this.f17930a) {
            case 0:
                b bVar = (b) this.f17932c;
                c cVar = (c) this.d;
                FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)));
                FeatureCommand featureCommandB = b.b(cVar);
                m mVar = bVar.f17933a;
                if (!this.f17931b) {
                    featureCommand = null;
                }
                FeatureCommand[] elements = {featureCommand, featureCommandB};
                Intrinsics.checkNotNullParameter(elements, "elements");
                mVar.c(new CompositeCommand(d.L(elements)));
                break;
            case 1:
                i8b.b bVar2 = (i8b.b) this.f17932c;
                kp3.b corporateEvent = (kp3.b) this.d;
                bVar2.o.getClass();
                Intrinsics.checkNotNullParameter(corporateEvent, "corporateEvent");
                bVar2.A2(new BridgeDestination(u0.f(new CorporateEventDetailsDestination(corporateEvent.a().b(), false, this.f17931b))));
                break;
            case 2:
                lw5.b bVar3 = (lw5.b) this.f17932c;
                c cVar2 = (c) this.d;
                boolean zL = lw5.b.l(cVar2);
                FeatureCommand featureCommand2 = bVar3.d;
                NaviCommand featureCommand3 = zL ? featureCommand2 : (lw5.b.g(cVar2) || lw5.b.h(cVar2)) ? bVar3.e : lw5.b.k(cVar2) ? new FeatureCommand(CryptoInvestFeatureConfig.Invest.f71500a) : DummyCommand.f98635a;
                if (!lw5.b.l(cVar2) && this.f17931b) {
                    featureCommand3 = com.revolut.retail.core.navigation.a.c(featureCommand2, featureCommand3);
                }
                bVar3.f200410b.c(featureCommand3);
                break;
            case 3:
                g gVar = (g) this.f17932c;
                String str = (String) this.d;
                List<com.revolut.feature_tiles_api.models.a> list = (List) gVar.f204692b.get("TILES");
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (com.revolut.feature_tiles_api.models.a aVar : list) {
                        if (this.f17931b) {
                            F1 = aVar.f97836c;
                            Iterator it8 = ((Iterable) F1).iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next = it8.next();
                                    if (Intrinsics.f(((gei.a) next).f143299a, str)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            gei.a aVar2 = (gei.a) next;
                            if (aVar2 != null) {
                                F1 = d0.f1((Collection) F1);
                                F1.remove(aVar2);
                                F1.add(gei.a.a(aVar2, f.OPENED));
                            }
                        } else {
                            List<gei.a> list2 = aVar.f97836c;
                            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                            for (gei.a aVarA : list2) {
                                if (Intrinsics.f(aVarA.f143299a, str)) {
                                    aVarA = gei.a.a(aVarA, f.OPENED);
                                }
                                arrayList2.add(aVarA);
                            }
                            F1 = arrayList2;
                        }
                        arrayList.add(com.revolut.feature_tiles_api.models.a.a(aVar, F1));
                    }
                    gVar.d.j("TILES", arrayList);
                    break;
                }
                break;
            case 4:
                ((o) this.f17932c).A(new w0((String) this.d, this.f17931b));
                break;
            case 5:
                ((i) this.f17932c).f208654a.c(new FeatureCommand(new TwoFaFeatureConfig.Sms(null, (e) this.d, false, !this.f17931b, 27)));
                break;
            case 6:
                mw2.e eVar = (mw2.e) this.f17932c;
                mw2.c cVar3 = (mw2.c) this.d;
                m mVar2 = eVar.f209316a;
                FeatureCommand featureCommand4 = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) eVar.c(cVar3), false, (Integer) null, 0, 61));
                if (this.f17931b) {
                    featureCommand4 = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, featureCommand4, 2)));
                }
                mVar2.c(featureCommand4);
                break;
            case 7:
                mw2.e eVar2 = (mw2.e) this.f17932c;
                List list3 = (List) this.d;
                Intrinsics.h(list3);
                KompotDestination kompotDestinationB = eVar2.b(list3);
                if (kompotDestinationB != null) {
                    m mVar3 = eVar2.f209316a;
                    FeatureCommand featureCommand5 = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) kompotDestinationB, false, (Integer) null, 0, 61));
                    if (this.f17931b) {
                        featureCommand5 = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, featureCommand5, 2)));
                    }
                    mVar3.c(featureCommand5);
                }
                break;
            case 8:
                pyj.a aVar3 = (pyj.a) this.f17932c;
                NaviCommand naviCommandC = (NaviCommand) this.d;
                if (this.f17931b) {
                    naviCommandC = com.revolut.retail.core.navigation.a.c(aVar3.f240842c, naviCommandC);
                } else {
                    Intrinsics.h(naviCommandC);
                }
                aVar3.f240840a.c(naviCommandC);
                break;
            case 9:
                ru2.a aVar4 = (ru2.a) this.f17932c;
                c cVar4 = (c) this.d;
                NaviCommand naviCommandC2 = vhi.c.c(new CardTerminateDestination(new CardTerminateDestination.InputData(cVar4.e(2), cVar4.d)), yhi.b.SOLID, null, false, 12);
                if (this.f17931b) {
                    naviCommandC2 = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))), naviCommandC2);
                }
                aVar4.f257404a.c(naviCommandC2);
                break;
            case 10:
                h hVar = (h) this.f17932c;
                sda.c cVar5 = (sda.c) this.d;
                ParcelableDestination parcelableDestination = hVar.f241169a;
                NaviCommand naviCommandE = parcelableDestination instanceof BridgeDestination ? ((BridgeDestination) parcelableDestination).f98270a : u0.e(parcelableDestination);
                if (this.f17931b) {
                    naviCommandE = com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6))), naviCommandE);
                }
                cVar5.f261841b.c(naviCommandE);
                break;
            case 11:
                y21.c cVar6 = (y21.c) this.f17932c;
                SecuritySettings securitySettings = (SecuritySettings) this.d;
                w4l.f fVar = cVar6.d;
                String settingName = securitySettings.getSettingName();
                od0.h hVar2 = od0.i.Companion;
                Boolean boolValueOf = Boolean.valueOf(this.f17931b);
                hVar2.getClass();
                fVar.j(settingName, od0.h.a(boolValueOf));
                break;
            default:
                k kVar = (k) this.f17932c;
                dj0.d dVar = (dj0.d) this.d;
                k3l.b bVar4 = kVar.i;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cards_add_to_xpay_negative_balance_prompt_title, null, null, 14);
                boolean z = this.f17931b;
                ((k3l.d) bVar4).O(new StatusViewConfiguration.Warning("tap_and_pay_negative_balance_warning", textLocalisedClause, new TextLocalisedClause(z ? R$string.cards_add_to_xpay_negative_balance_prompt_description_topup_exchange_google : R$string.cards_add_to_xpay_negative_balance_prompt_description_topup_google, u.c(dVar.f115083b.f306286a), null, 12), new TextLocalisedClause(R$string.cards_add_to_xpay_negative_balance_prompt_topup_button, null, null, 14), z ? new TextLocalisedClause(R$string.cards_add_to_xpay_negative_balance_prompt_exchange_button, null, null, 14) : null, new TapAndPayPresenterDelegate$NegativeBalancePayload(dVar), 960));
                break;
        }
    }

    public /* synthetic */ a(Object obj2, boolean z, Object obj3, int i) {
        this.f17930a = i;
        this.f17932c = obj2;
        this.f17931b = z;
        this.d = obj3;
    }

    public /* synthetic */ a(boolean z, pyj.a aVar, NaviCommand naviCommand) {
        this.f17930a = 8;
        this.f17931b = z;
        this.f17932c = aVar;
        this.d = naviCommand;
    }
}
