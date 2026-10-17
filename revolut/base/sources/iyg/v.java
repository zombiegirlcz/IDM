package iyg;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a f169750w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f169750w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(0, this.f169750w, continuation);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(1, this.f169750w, continuation);
                vVar2.v = obj2;
                return vVar2;
            case 2:
                v vVar3 = new v(2, this.f169750w, continuation);
                vVar3.v = obj2;
                return vVar3;
            case 3:
                v vVar4 = new v(3, this.f169750w, continuation);
                vVar4.v = obj2;
                return vVar4;
            case 4:
                v vVar5 = new v(4, this.f169750w, continuation);
                vVar5.v = obj2;
                return vVar5;
            case 5:
                v vVar6 = new v(5, this.f169750w, continuation);
                vVar6.v = obj2;
                return vVar6;
            case 6:
                v vVar7 = new v(6, this.f169750w, continuation);
                vVar7.v = obj2;
                return vVar7;
            case 7:
                v vVar8 = new v(7, this.f169750w, continuation);
                vVar8.v = obj2;
                return vVar8;
            case 8:
                v vVar9 = new v(8, this.f169750w, continuation);
                vVar9.v = obj2;
                return vVar9;
            case 9:
                v vVar10 = new v(9, this.f169750w, continuation);
                vVar10.v = obj2;
                return vVar10;
            case 10:
                v vVar11 = new v(10, this.f169750w, continuation);
                vVar11.v = obj2;
                return vVar11;
            default:
                v vVar12 = new v(11, this.f169750w, continuation);
                vVar12.v = obj2;
                return vVar12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((v) create((DisclaimerParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((v) create((dvg.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((v) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((v) create((vyg.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((v) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.a aVar = this.f169750w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.P, new iuj.z(data, 14));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.P, new iuj.z(data2, 15));
                break;
            case 2:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.P, new i2l.e0(list, 11));
                break;
            case 3:
                DisclaimerParams disclaimerParams = (DisclaimerParams) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.P, new bzg.r(disclaimerParams, 3));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.P, new iuj.z(data3, 16));
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.P, new iuj.z(data4, 17));
                break;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.P, new iuj.z(data5, 18));
                break;
            case 7:
                dvg.a aVar9 = (dvg.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.P, new is2.t(aVar9, 29));
                break;
            case 8:
                Data data6 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.P, new iuj.z(data6, 19));
                break;
            case 9:
                vyg.c cVar = (vyg.c) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.P, new t(cVar, 0));
                break;
            case 10:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(popupMenuItem);
                if (((jte.d) aVar.G).c(WealthAnalyticsApi$Toggles.AnalyticsDashboardContextualHeader.f94961c)) {
                    Object f53016n = popupMenuItem.getF54982q();
                    if (f53016n instanceof vyg.c) {
                        tyg.m mVar = aVar.f95067s;
                        vyg.c analyticsTimeframe = (vyg.c) f53016n;
                        mVar.getClass();
                        Intrinsics.checkNotNullParameter(analyticsTimeframe, "analyticsTimeframe");
                        mVar.f275583a.G(analyticsTimeframe, "WIDGETISED_TIMESTAMP_KEY", wim.z.d(o0.b(vyg.c.class)));
                    } else if (f53016n instanceof WidgetisedAnalyticsType) {
                        aVar.H2(aVar.P, new is6.t((WidgetisedAnalyticsType) f53016n, aVar, 20));
                    }
                }
                break;
            default:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                WidgetisedAnalyticsType widgetisedAnalyticsType = (WidgetisedAnalyticsType) rVar.f314201a;
                vyg.c cVar2 = (vyg.c) rVar.f314202b;
                boolean zBooleanValue = ((Boolean) rVar.f314203c).booleanValue();
                if (widgetisedAnalyticsType != null) {
                    aVar.L2();
                    aVar.N2();
                    aVar.M2();
                    aVar.O2(widgetisedAnalyticsType, cVar2);
                    if (zBooleanValue) {
                        aVar.K2();
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
