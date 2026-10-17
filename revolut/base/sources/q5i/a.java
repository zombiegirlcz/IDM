package q5i;

import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p4i.f;
import pri.c;
import rp0.y;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends c implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f242409h;

    public a(b mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f242409h = mapper;
    }

    @Override // p4i.f
    public final r E(Screen screen) {
        y yVarH;
        Screen.InterestBreakdown screen2 = (Screen.InterestBreakdown) screen;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        p5k.a aVar = this.f242409h.f242410a;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        Screen.InterestBreakdown.Interest interest = screen2.f97130a;
        if (interest instanceof Screen.InterestBreakdown.Interest.EstimatedInterest) {
            Screen.InterestBreakdown.Interest.EstimatedInterest estimatedInterest = (Screen.InterestBreakdown.Interest.EstimatedInterest) interest;
            yVarH = aVar.e(estimatedInterest.f97134b, estimatedInterest.f97133a, screen2);
        } else if (interest instanceof Screen.InterestBreakdown.Interest.DailyEstimatedInterest) {
            Screen.InterestBreakdown.Interest.DailyEstimatedInterest dailyEstimatedInterest = (Screen.InterestBreakdown.Interest.DailyEstimatedInterest) interest;
            yVarH = aVar.d(dailyEstimatedInterest.f97131a, dailyEstimatedInterest.f97132b, screen2);
        } else {
            if (!(interest instanceof Screen.InterestBreakdown.Interest.InterestApplies)) {
                throw new NoWhenBranchMatchedException();
            }
            Screen.InterestBreakdown.Interest.InterestApplies interestApplies = (Screen.InterestBreakdown.Interest.InterestApplies) interest;
            wi0.b bVar = interestApplies.d;
            wi0.b.Companion.getClass();
            yVarH = Intrinsics.f(bVar, wi0.b.p0) ? aVar.h(screen2) : aVar.g(interestApplies.f97135a, interestApplies.f97136b, interestApplies.f97137c, screen2);
        }
        r rVarJust = r.just(yVarH);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
