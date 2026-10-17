package idi;

import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature_rev_points_pocket_api.RevPointsPocketApi$Toggles;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination;
import com.revolut.kompot.common.ParcelableDestination;
import efm.d0;
import efm.r;
import eub.i;
import i83.m;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ldi.f;
import lg0.e;
import m1c.r0;
import m1c.x0;
import nyb.o;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import te0.w;
import ufm.p;
import w4l.h;
import zh9.u0;
import zhm.h0;
import zi0.c;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f160492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f160493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f160494c;

    public b(i optInInteractor, eub.a revPointsAvailabilityInteractor, f pointsPocketInteractor) {
        Intrinsics.checkNotNullParameter(optInInteractor, "optInInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(pointsPocketInteractor, "pointsPocketInteractor");
        this.f160492a = optInInteractor;
        this.f160493b = revPointsAvailabilityInteractor;
        this.f160494c = pointsPocketInteractor;
    }

    @Override // xii.b
    public final Set a() {
        String[] elements = {"rev-points/pocket", "rev-points/pocket/rewards"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.y0(elements);
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        nyb.b bVar = (nyb.b) this.f160493b;
        if (bVar.f() && bVar.a("REVPOINTS.points_pocket")) {
            if (((jte.d) bVar.f220771a).c(RevPointsPocketApi$Toggles.RevPointsPocketHome.f97777c)) {
                try {
                    Flow flowC = this.f160494c.c(h.f294642c);
                    p0 p0Var = p0.f264001a;
                    r rVarC = rd0.e.c(flowC, elm.f.f127540b);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    r rVarTimeout = rVarC.timeout(3L, timeUnit);
                    Intrinsics.checkNotNullExpressionValue(rVarTimeout, "timeout(...)");
                    d0 d0VarFirstOrError = m70.a.g(c.J(w.f0(rVarTimeout)), null, new m(25), 1).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    RevPointsPocketState revPointsPocketState = (RevPointsPocketState) w.k(d0VarFirstOrError);
                    ytb.b bVar2 = new ytb.b(deeplink);
                    boolean zF = Intrinsics.f(bVar2.c(2), "rewards");
                    if (revPointsPocketState instanceof RevPointsPocketState.Active) {
                        return ytb.b.b(bVar2, ibb.c.f160140a.f83420a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(((RevPointsPocketState.Active) revPointsPocketState).f97790b.f97784a, ExtendedSubaccountType.RevPoints.INSTANCE), ProductId.SUBACCOUNT), zF ? new TabAccountsInitialPayload.Action(u0.f(new RevPointsPocketDestination.Onboarding(RevPointsPocketDestination.Onboarding.Mode.Boost.f97800a, null))) : null));
                    }
                    if (!(revPointsPocketState instanceof RevPointsPocketState.Inactive)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z = false;
                    try {
                        p pVarT = ((o) this.f160492a).e(false).t(3L, timeUnit);
                        Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
                        z = ((r0) w.k(pVarT)).f201447a == x0.OPTED_IN;
                    } catch (Exception e) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    }
                    return ytb.b.f(bVar2, new RevPointsPocketDestination.Onboarding(new RevPointsPocketDestination.Onboarding.Mode.OptIn(RevPointsOptInSource.PointsPocket.f83999a, z), bVar2.a()));
                } catch (Exception e2) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                }
            }
        }
        return null;
    }
}
