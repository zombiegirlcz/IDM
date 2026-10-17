package dwi;

import gwi.s3;
import hwi.c1;
import hwi.v0;
import hwi.y0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f120409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hwi.n0 f120410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f120411c;
    public final r0 d;

    public b0(n0 airportsFinder, hwi.n0 repository, y0 savedLoungesRepository, r0 nearbyAirportsInteractor) {
        Intrinsics.checkNotNullParameter(airportsFinder, "airportsFinder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(savedLoungesRepository, "savedLoungesRepository");
        Intrinsics.checkNotNullParameter(nearbyAirportsInteractor, "nearbyAirportsInteractor");
        this.f120409a = airportsFinder;
        this.f120410b = repository;
        this.f120411c = savedLoungesRepository;
        this.d = nearbyAirportsInteractor;
    }

    public final pfm.r a(String loungeId) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        c1 c1Var = (c1) this.f120411c;
        c1Var.getClass();
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        efm.d0<List<gwi.i>> d0VarSaveLounge = c1Var.f156200a.saveLounge(new s3(loungeId));
        int i = 19;
        hw3.d dVar = new hw3.d(i, new hie.b(1, c1Var, c1.class, "updateSavedLounges", "updateSavedLounges(Ljava/util/List;)Lio/reactivex/Completable;", 0, 12));
        d0VarSaveLounge.getClass();
        pfm.a aVar = new pfm.a(d0VarSaveLounge, dVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return te0.w.g0(aVar);
    }

    public final efm.r b(String loungeId) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        v0 v0Var = (v0) this.f120410b;
        v0Var.getClass();
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        return ((w4l.f) v0Var.f156265h.getValue()).f(new hwi.r0(loungeId), false);
    }

    public final efm.r c(String loungeId) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        return nim.a.w(((w4l.f) ((c1) this.f120411c).e.getValue()).f(Unit.f186387a, false), new d7a.p(loungeId, 24));
    }

    public final pfm.r d(String loungeId) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        c1 c1Var = (c1) this.f120411c;
        c1Var.getClass();
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        efm.d0<List<gwi.i>> d0VarRemoveLounge = c1Var.f156200a.removeLounge(new s3(loungeId));
        int i = 20;
        hw3.d dVar = new hw3.d(i, new hie.b(1, c1Var, c1.class, "updateSavedLounges", "updateSavedLounges(Ljava/util/List;)Lio/reactivex/Completable;", 0, 13));
        d0VarRemoveLounge.getClass();
        pfm.a aVar = new pfm.a(d0VarRemoveLounge, dVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return te0.w.g0(aVar);
    }
}
