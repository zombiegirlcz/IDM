package dwi;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import hwi.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import svi.k1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f120446b;

    public /* synthetic */ o0(r0 r0Var, int i) {
        this.f120445a = i;
        this.f120446b = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f120445a) {
            case 0:
                r0 r0Var = this.f120446b;
                Boolean coarseLocationPermissionGranted = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(coarseLocationPermissionGranted, "coarseLocationPermissionGranted");
                if (Intrinsics.f(coarseLocationPermissionGranted, Boolean.TRUE)) {
                    efm.r rVarSwitchMap = ((z39.b) r0Var.f120457c).f319221b.j().switchMap(new dv5.n(new o0(r0Var, 1), 18));
                    Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                    return rVarSwitchMap;
                }
                if (Intrinsics.f(coarseLocationPermissionGranted, Boolean.FALSE)) {
                    return zi0.c.j(k1.a.f265932a);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                r0 r0Var2 = this.f120446b;
                x39.b state = (x39.b) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                int i = q0.f120453a[state.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        return zi0.c.j(k1.b.f265933a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                efm.r rVarDefer = efm.r.defer(new a31.l(r0Var2, 13));
                Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
                return pd.b.r(rVarDefer, new o0(r0Var2, 2));
            case 2:
                r0 r0Var3 = this.f120446b;
                LocationDomain userCurrentLocation = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(userCurrentLocation, "userCurrentLocation");
                return nim.a.w(nim.a.w(((w4l.f) ((v0) r0Var3.f120455a).f.getValue()).f(Unit.f186387a, false), new doe.c(r0Var3, userCurrentLocation, 18)), new f(13));
            default:
                this.f120446b.e = (LocationDomain) obj2;
                return Unit.f186387a;
        }
    }
}
