package yxb;

import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f317607b;

    public /* synthetic */ a(s sVar, int i) {
        this.f317606a = i;
        this.f317607b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f317606a) {
            case 0:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f317607b.f317631a.c(it8);
                return Boolean.TRUE;
            case 1:
                NaviCommand it9 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                this.f317607b.f317631a.c(it9);
                return Boolean.TRUE;
            case 2:
                NaviCommand it10 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                this.f317607b.f317631a.c(it10);
                return Boolean.TRUE;
            case 3:
                Boolean spareChangeEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(spareChangeEnabled, "spareChangeEnabled");
                if (!spareChangeEnabled.booleanValue()) {
                    return d0.m(Boolean.FALSE);
                }
                s sVar = this.f317607b;
                if (!((nyb.b) sVar.e).g()) {
                    return d0.m(Boolean.FALSE);
                }
                d0 d0VarFirstOrError = w.a0(w.l(m70.a.g(sVar.f317635h.j(true), null, null, 3), m70.a.g(xvh.c.c(sVar.f317636j, null, w4l.h.f294642c, 1), null, null, 3)), new yv8.j(sVar, 18)).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return new ufm.i(ue0.e.t(d0VarFirstOrError, h0.f322473a), new c(new a(sVar, 21), 27), 0);
            case 4:
                NaviCommand it11 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                this.f317607b.f317631a.c(it11);
                return Boolean.TRUE;
            case 5:
                NaviCommand it12 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                this.f317607b.f317631a.c(it12);
                return Boolean.TRUE;
            case 6:
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (!isEnabled.booleanValue()) {
                    return d0.m(Boolean.FALSE);
                }
                ufm.i iVar = new ufm.i(s.d(null, true), new c(new a(this.f317607b, 17), 19), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return ue0.e.F(iVar, Boolean.TRUE);
            case 7:
                v19.a lifestyleTabAvailability = (v19.a) obj2;
                Intrinsics.checkNotNullParameter(lifestyleTabAvailability, "lifestyleTabAvailability");
                if (lifestyleTabAvailability == v19.a.NOT_AVAILABLE) {
                    return d0.m(Boolean.FALSE);
                }
                return new ufm.i(s.c(), new c(new a(this.f317607b, 16), 18), 1);
            case 8:
                NaviCommand it13 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                this.f317607b.f317631a.c(it13);
                return Boolean.TRUE;
            case 9:
                NaviCommand it14 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                this.f317607b.f317631a.c(it14);
                return Boolean.TRUE;
            case 10:
                List plansToUpgrade = (List) obj2;
                Intrinsics.checkNotNullParameter(plansToUpgrade, "plansToUpgrade");
                if (plansToUpgrade.isEmpty()) {
                    return d0.m(Boolean.FALSE);
                }
                FeatureCommand featureCommandB = s.b();
                RevPointsOptInNextDestination.Tab tab2 = RevPointsOptInNextDestination.Tab.f83531a;
                s sVar2 = this.f317607b;
                return new ufm.i(s.E(sVar2, featureCommandB, tab2, null), new c(new yrb.i(sVar2, plansToUpgrade, 25), 24), 1);
            case 11:
                NaviCommand it15 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                this.f317607b.f317631a.c(it15);
                return Boolean.TRUE;
            case 12:
                NaviCommand it16 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                this.f317607b.f317631a.c(it16);
                return Boolean.TRUE;
            case 13:
                Boolean spareChangeEnabled2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(spareChangeEnabled2, "spareChangeEnabled");
                if (!spareChangeEnabled2.booleanValue()) {
                    return d0.m(Boolean.FALSE);
                }
                s sVar3 = this.f317607b;
                if (!((nyb.b) sVar3.e).g()) {
                    return d0.m(Boolean.FALSE);
                }
                ufm.i iVar2 = new ufm.i(s.i(), new c(new a(sVar3, 19), 23), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return ue0.e.F(iVar2, Boolean.TRUE);
            case 14:
                NaviCommand it17 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                this.f317607b.f317631a.c(it17);
                return Boolean.TRUE;
            case 15:
                NaviCommand it18 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                this.f317607b.f317631a.c(it18);
                return Boolean.TRUE;
            case 16:
                NaviCommand it19 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                this.f317607b.f317631a.c(it19);
                return Boolean.TRUE;
            case 17:
                NaviCommand it20 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                this.f317607b.f317631a.c(it20);
                return Boolean.TRUE;
            case 18:
                NaviCommand it21 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                this.f317607b.f317631a.c(it21);
                return Boolean.TRUE;
            case 19:
                NaviCommand it22 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                this.f317607b.f317631a.c(it22);
                return Boolean.TRUE;
            case 20:
                NaviCommand it23 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                this.f317607b.f317631a.c(it23);
                return Boolean.TRUE;
            case 21:
                d0 scBreakdownCommand = (d0) obj2;
                Intrinsics.checkNotNullParameter(scBreakdownCommand, "scBreakdownCommand");
                c cVar = new c(new a(this.f317607b, 22), 28);
                scBreakdownCommand.getClass();
                ufm.i iVar3 = new ufm.i(scBreakdownCommand, cVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return ue0.e.F(iVar3, Boolean.TRUE);
            default:
                NaviCommand it24 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                this.f317607b.f317631a.c(it24);
                return Boolean.TRUE;
        }
    }
}
