package cq8;

import bw4.s;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.ChallengesOverviewDetailsScreenContract$InputData;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;
import yhm.m;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends oki.h implements dli.b {
    public final ChallengesOverviewDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f108033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hp8.b f108034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ao.h f108035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f108036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f108037t;

    public m(p stateMapper, ChallengesOverviewDetailsScreenContract$InputData inputData, ang.f userInteractor, hp8.b juniorTasksInteractor, ao.h juniorCoparentInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorTasksInteractor, "juniorTasksInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        this.o = inputData;
        this.f108033p = userInteractor;
        this.f108034q = juniorTasksInteractor;
        this.f108035r = juniorCoparentInteractor;
        this.f108036s = vkm.q.b(1, 5, null);
        this.f108037t = mra.d.b(this, new c(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public final void I2(g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof e) {
            Object obj2 = ((e) event).f108027a.k;
            if (obj2 instanceof dp8.b) {
                C2(new h((dp8.b) obj2));
                return;
            }
            try {
                m.Companion companion = yhm.m.INSTANCE;
                throw new IllegalStateException("challenge details primary action parcel must be a JuniorTask");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                    return;
                }
                return;
            }
        }
        if (!(event instanceof f)) {
            if (!(event instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f108036s.k(Unit.f186387a);
            return;
        }
        Object obj3 = ((f) event).f108028a.k;
        if (obj3 instanceof dp8.b) {
            dp8.b bVar = (dp8.b) obj3;
            int i = l.f108032a[bVar.e.ordinal()];
            if (i == 1) {
                C2(new i(bVar));
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                C2(new j(bVar));
                return;
            }
        }
        try {
            m.Companion companion3 = yhm.m.INSTANCE;
            throw new IllegalStateException("challenge details secondary action parcel must be a JuniorTask");
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th11) {
            m.Companion companion4 = yhm.m.INSTANCE;
            Throwable thA2 = yhm.m.a(yhm.o.a(th11));
            if (thA2 != null) {
                hx7.e.n(thA2);
            }
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(new vkm.y(new a35.j(2, 13, null), this.f108036s), new s(continuation, this, 22)), null, new ck7.j(this, continuation, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f108037t;
    }
}
