package xyh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.wealth.resources.R$string;
import h93.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.u;
import ybh.c0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f309734b;

    public /* synthetic */ n(c0 c0Var, boolean z) {
        this.f309733a = 5;
        this.f309734b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f309733a) {
            case 0:
                b update = (b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                wd6.h orderType = update.f309725a;
                boolean z = update.f309726b;
                boolean z3 = update.f309727c;
                boolean z4 = update.d;
                boolean z6 = update.e;
                boolean z11 = update.f309728g;
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                return new b(orderType, z, z3, z4, z6, this.f309734b, z11);
            case 1:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return this.f309734b ? new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, command, 2))) : command;
            case 2:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                if (this.f309734b) {
                    items = d0.V0(items, 20);
                }
                List list = items;
                int i = 0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        if (((s69.d) it8.next()).d == s69.f.CREATED && (i = i + 1) < 0) {
                            v.r();
                            throw null;
                        }
                    }
                }
                return Integer.valueOf(i);
            case 3:
                y7d.l updateState = (y7d.l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return y7d.l.a(updateState, null, null, null, null, null, null, this.f309734b, false, null, 0L, 959);
            case 4:
                yai.k update2 = (yai.k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return yai.k.a(update2, null, null, !this.f309734b, null, null, 59);
            case 5:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new ybh.v(new TextLocalisedClause(this.f309734b ? R$string.wealth_robo_portfolio_recurring_transfer_widget_title : R$string.wealth_robo_portfolio_add_money_header_title, null, null, 14), null, null);
            case 6:
                return ybh.n.a((ybh.n) obj2, null, null, null, null, Boolean.valueOf(this.f309734b), null, null, null, null, null, null, false, false, false, null, null, false, 131055);
            case 7:
                return ybh.n.a((ybh.n) obj2, null, null, null, null, null, Boolean.valueOf(this.f309734b), null, null, null, null, null, false, false, false, null, null, false, 131039);
            case 8:
                yed.o updateState2 = (yed.o) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return yed.o.a(updateState2, null, null, null, null, false, false, null, null, null, null, false, null, this.f309734b, null, null, null, 1032191);
            case 9:
                yid.i update3 = (yid.i) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return yid.i.a(update3, null, this.f309734b, 0L, 5);
            case 10:
                return ymk.l.a((ymk.l) obj2, null, null, this.f309734b, 0, 11);
            case 11:
                yna.a updateState3 = (yna.a) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return yna.a.a(updateState3, null, null, null, null, null, null, null, false, this.f309734b, null, false, null, null, null, null, 65023);
            case 12:
                return yna.a.a((yna.a) obj2, null, null, null, null, null, null, null, false, false, null, this.f309734b, null, null, null, null, 63487);
            case 13:
                yo7.h updateState4 = (yo7.h) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return yo7.h.a(updateState4, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f309734b), null, null, null, 15359);
            case 14:
                yo7.h updateState5 = (yo7.h) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return yo7.h.a(updateState5, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.f309734b), null, null, 14335);
            case 15:
                ype.d dVar = (ype.d) obj2;
                Boolean boolValueOf = Boolean.valueOf(this.f309734b);
                String extractedTin = dVar.f315848a;
                String formattedTin = dVar.f315849b;
                boolean z12 = dVar.f315850c;
                boolean z29 = dVar.d;
                Intrinsics.checkNotNullParameter(extractedTin, "extractedTin");
                Intrinsics.checkNotNullParameter(formattedTin, "formattedTin");
                return new ype.d(extractedTin, formattedTin, z12, z29, boolValueOf);
            case 16:
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : subscriptions) {
                    if (((qua.p) obj3).getType() != ibd.h.UNKNOWN) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    qua.p pVar = (qua.p) obj4;
                    if (this.f309734b || !u.B(pVar)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 17:
                yuc.i iVar = (yuc.i) obj2;
                Boolean boolValueOf2 = Boolean.valueOf(this.f309734b);
                f0 f0Var = iVar.f316978a;
                Data connections = iVar.f316979b;
                boolean z31 = iVar.f316980c;
                boolean z41 = iVar.d;
                Intrinsics.checkNotNullParameter(connections, "connections");
                return new yuc.i(f0Var, connections, z31, z41, boolValueOf2);
            case 18:
                z2g.d dVar2 = (z2g.d) obj2;
                myf.a experience = dVar2.f319071a;
                TravelExperiencesPricingBreakdown pricingBreakdown = dVar2.f319072b;
                TravelExperiencesPointsOption travelExperiencesPointsOption = dVar2.f319073c;
                RevPoints revPoints = dVar2.d;
                Intrinsics.checkNotNullParameter(experience, "experience");
                Intrinsics.checkNotNullParameter(pricingBreakdown, "pricingBreakdown");
                return new z2g.d(experience, pricingBreakdown, travelExperiencesPointsOption, revPoints, this.f309734b);
            case 19:
                return z8k.t.a((z8k.t) obj2, null, null, 0, null, this.f309734b, false, 16255);
            case 20:
                return z8k.t.a((z8k.t) obj2, null, null, 0, null, false, this.f309734b, 16127);
            case 21:
                zl1.a update4 = (zl1.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Data data = update4.f323156a;
                zl1.b bVar = (zl1.b) data.getContent();
                Data settingsData = Data.copy$default(data, bVar != null ? zl1.b.a(bVar, this.f309734b) : null, null, false, 6, null);
                Intrinsics.checkNotNullParameter(settingsData, "settingsData");
                return new zl1.a(settingsData);
            case 22:
                zl1.a aVar = (zl1.a) obj2;
                zl1.b bVar2 = (zl1.b) aVar.f323156a.getContent();
                Data settingsData2 = Data.copy$default(aVar.f323156a, bVar2 != null ? zl1.b.a(bVar2, !this.f309734b) : null, null, false, 6, null);
                Intrinsics.checkNotNullParameter(settingsData2, "settingsData");
                return new zl1.a(settingsData2);
            default:
                return zz9.q.a((zz9.q) obj2, null, null, null, null, null, null, 0, this.f309734b, 1791);
        }
    }

    public /* synthetic */ n(boolean z, int i) {
        this.f309733a = i;
        this.f309734b = z;
    }
}
