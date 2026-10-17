package eq8;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.list.ChallengesOverviewListScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends oki.h implements b0 {
    public final ChallengesOverviewListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f128378p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zp8.h f128379q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cli.y f128380r;

    public f0(k0 stateMapper, ChallengesOverviewListScreenContract$InputData inputData, hj8.a juniorProfileInteractor, zp8.h juniorTasksWithCoparentsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorTasksWithCoparentsProvider, "juniorTasksWithCoparentsProvider");
        this.o = inputData;
        this.f128378p = juniorProfileInteractor;
        this.f128379q = juniorTasksWithCoparentsProvider;
        this.f128380r = mra.d.b(this, new l(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public final void I2(t event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof o;
        u uVar = u.f128403a;
        if (z) {
            if (Intrinsics.f(((o) event).f128398a, "MENU_ITEM_ID_ADD_TASK")) {
                C2(uVar);
                return;
            }
            return;
        }
        if (event instanceof m) {
            C2(uVar);
            return;
        }
        if (event instanceof n) {
            if (Intrinsics.f(((n) event).f128397a.f52708a, "LIST_ID_SUBHEADER_COMPLETED_TASKS")) {
                C2(y.f128407a);
                return;
            }
            return;
        }
        if (event instanceof p) {
            if (Intrinsics.f(((p) event).f128399a.f164935a, "LIST_ID_ERROR_TASKS")) {
                l2(new ebg.o(this, null, 24), new yi5.b(26));
                return;
            }
            return;
        }
        if (event instanceof q) {
            Object obj2 = ((q) event).f128400a.u;
            if (obj2 instanceof dp8.b) {
                C2(new x(((dp8.b) obj2).f116831a));
                return;
            }
            return;
        }
        if (event instanceof r) {
            Object obj3 = ((r) event).f128401a.u;
            if (obj3 instanceof dp8.b) {
                dp8.b bVar = (dp8.b) obj3;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                if (bVar.e == dp8.h.COMPLETED) {
                    C2(new z(bVar));
                    return;
                }
                return;
            }
            return;
        }
        if (!(event instanceof s)) {
            throw new NoWhenBranchMatchedException();
        }
        SwipeToActionDelegate.SwipeAction swipeAction = ((s) event).f128402a.f54883a;
        Object obj4 = swipeAction.f;
        if (obj4 instanceof dp8.b) {
            String str = swipeAction.f53505a;
            if (Intrinsics.f(str, "SWIPE_ACTION_ID_EDIT_TASK")) {
                C2(new w((dp8.b) obj4));
            } else if (Intrinsics.f(str, "SWIPE_ACTION_ID_DELETE_TASK")) {
                C2(new v((dp8.b) obj4));
            }
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        akg.n nVarA = hj8.a.a(this.f128378p, this.o.f77403a, w4l.h.f294642c);
        zp8.h hVar = this.f128379q;
        yji.l.b1(this, yh5.b.d(nVarA, nim.a.v(u0.m((SharedFlow) hVar.d.getValue(), rd0.e.b(hVar.f324195b.m(hVar.f324196c, false))), new znd.u0(15))), null, new enb.f(this, null, 14), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f128380r;
    }
}
