package ccf;

import com.revolut.feature.trading_add_ons.TradingAddOnsApi$Toggles;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends jki.g implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kbf.a f23087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f23088q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wbf.o f23089r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lbf.f f23090s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f23091t;
    public final wbf.b u;
    public final wbf.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final acf.h f23092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ybl.l f23093x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ihm.b f23094y;
    public final q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jki.p stateMapper, kbf.a specificAddOnInteractor, ang.f userInteractor, wbf.o tradingAddOnUnsubscribeInteractor, lbf.f code, u statusDialogMapper, wbf.b downgradeSurveyConfigInteractor, wbf.i surveySenderInteractor, acf.h featureToNavigationMapper, ybl.l tradingConfigInteractor, gte.a featureToggleInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(specificAddOnInteractor, "specificAddOnInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(tradingAddOnUnsubscribeInteractor, "tradingAddOnUnsubscribeInteractor");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(downgradeSurveyConfigInteractor, "downgradeSurveyConfigInteractor");
        Intrinsics.checkNotNullParameter(surveySenderInteractor, "surveySenderInteractor");
        Intrinsics.checkNotNullParameter(featureToNavigationMapper, "featureToNavigationMapper");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f23087p = specificAddOnInteractor;
        this.f23088q = userInteractor;
        this.f23089r = tradingAddOnUnsubscribeInteractor;
        this.f23090s = code;
        this.f23091t = statusDialogMapper;
        this.u = downgradeSurveyConfigInteractor;
        this.v = surveySenderInteractor;
        this.f23092w = featureToNavigationMapper;
        this.f23093x = tradingConfigInteractor;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f23094y = bVarE;
        this.z = new q(((jte.d) featureToggleInteractor).c(TradingAddOnsApi$Toggles.TradingProRevamp.f91661c), 63);
    }

    @Override // yji.l
    public final void T1(long j2) {
        c64.a aVar = new c64.a(new r(this, 0), 20);
        ihm.b bVar = this.f23094y;
        efm.r rVarSwitchMap = bVar.switchMap(aVar);
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        yji.l.b1(this, rd0.e.b(rVarSwitchMap), null, new s(this, null, 0), 3);
        efm.r rVarSwitchMap2 = bVar.switchMap(new c64.a(new r(this, 1), 21));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        yji.l.b1(this, rd0.e.b(rVarSwitchMap2), null, new s(this, null, 1), 3);
        efm.r rVarSwitchMap3 = bVar.switchMap(new c64.a(new r(this, 2), 22));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap3, "switchMap(...)");
        yji.l.b1(this, rd0.e.b(rVarSwitchMap3), null, new s(this, null, 2), 3);
        efm.r rVarSwitchMap4 = bVar.switchMap(new c64.a(new r(this, 3), 23));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap4, "switchMap(...)");
        yji.l.b1(this, rd0.e.b(rVarSwitchMap4), null, new s(this, null, 3), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }
}
