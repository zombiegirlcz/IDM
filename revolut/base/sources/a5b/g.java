package a5b;

import ael.v;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import p2b.j;
import vkm.q;
import vkm.z1;
import yji.n;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends n implements b2b.f {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ybl.d f1342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f1343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kge.d f1344n;
    public final p2b.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f2b.b f1345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f1346q;

    public g(ybl.d portfolioInteractor, j cfdPerformanceInteractor, kge.d cfdPositionsInteractor, p2b.f cfdPositionsSorterInteractor, f2b.b cfdPerformanceTracker) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(cfdPerformanceInteractor, "cfdPerformanceInteractor");
        Intrinsics.checkNotNullParameter(cfdPositionsInteractor, "cfdPositionsInteractor");
        Intrinsics.checkNotNullParameter(cfdPositionsSorterInteractor, "cfdPositionsSorterInteractor");
        Intrinsics.checkNotNullParameter(cfdPerformanceTracker, "cfdPerformanceTracker");
        this.f1342l = portfolioInteractor;
        this.f1343m = cfdPerformanceInteractor;
        this.f1344n = cfdPositionsInteractor;
        this.o = cfdPositionsSorterInteractor;
        this.f1345p = cfdPerformanceTracker;
        this.f1346q = q.b(1, 4, null);
    }

    public static final b2b.a Z2(g gVar, b2b.a aVar, del.f sortBy) {
        if (sortBy == null) {
            gVar.getClass();
            return aVar;
        }
        p2b.f fVar = gVar.o;
        List positionsPerformance = aVar.f11929a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(positionsPerformance, "positionsPerformance");
        Intrinsics.checkNotNullParameter(sortBy, "sortBy");
        Comparator vVar = new v(sortBy);
        int i = p2b.e.f232198b[sortBy.f113715b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vVar = vVar.reversed();
        }
        Intrinsics.h(vVar);
        return b2b.a.a(aVar, d0.P0(positionsPerformance, vVar));
    }

    @Override // b2b.f
    public final Flow M1() {
        return q.q(this.f1346q);
    }
}
