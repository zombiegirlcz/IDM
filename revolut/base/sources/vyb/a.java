package vyb;

import com.revolut.feature.rev_points.impl.ui.advent.screen.RevPointsAdventRewardsScreen;
import com.revolut.feature.rev_points.impl.ui.advent.screen.RevPointsAdventRewardsScreenContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n14.e;
import zxb.d;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RevPointsAdventRewardsScreen f293292b;

    public /* synthetic */ a(RevPointsAdventRewardsScreen revPointsAdventRewardsScreen, int i) {
        this.f293291a = i;
        this.f293292b = revPointsAdventRewardsScreen;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f293291a) {
            case 0:
                return (b) ((d) this.f293292b.O.getValue()).f326113a.get();
            case 1:
                RevPointsAdventRewardsScreen revPointsAdventRewardsScreen = this.f293292b;
                return e.a(revPointsAdventRewardsScreen, (b) revPointsAdventRewardsScreen.M.getValue());
            default:
                qji.b bVarU2 = this.f293292b.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev_points.impl.ui.advent.screen.di.RevPointsAdventRewardsScreenInjector");
                d dVar = new d();
                dVar.f326113a = e4m.b.b(new zd8.c(3));
                return dVar;
        }
    }

    public /* synthetic */ a(RevPointsAdventRewardsScreen revPointsAdventRewardsScreen, RevPointsAdventRewardsScreenContract$InputData revPointsAdventRewardsScreenContract$InputData) {
        this.f293291a = 2;
        this.f293292b = revPointsAdventRewardsScreen;
    }
}
