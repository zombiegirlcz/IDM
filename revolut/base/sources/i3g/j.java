package i3g;

import cli.y;
import com.revolut.feature.travel.experiences.impl.ui.screen.reviews.TravelExperiencesReviewsScreenContract$InputData;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements dli.b {
    public final TravelExperiencesReviewsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0g.d f158216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f158217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f158218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f158219s;

    public j(k stateMapper, TravelExperiencesReviewsScreenContract$InputData inputData, o0g.d experiencesReviewsRepository, c guestsReviewsPagingInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(experiencesReviewsRepository, "experiencesReviewsRepository");
        Intrinsics.checkNotNullParameter(guestsReviewsPagingInteractor, "guestsReviewsPagingInteractor");
        this.o = inputData;
        this.f158216p = experiencesReviewsRepository;
        this.f158217q = guestsReviewsPagingInteractor;
        this.f158218r = v0.a.d("create(...)");
        this.f158219s = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        x3g.g request = new x3g.g(this.o.f93129a, null);
        o0g.d dVar = this.f158216p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, rd0.e.b(dVar.d.e(request, loadingStrategy)), null, null, new i(this, null, 0), 3);
        r rVarHide = this.f158217q.f158206b.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        l.a1(this, rd0.e.b(rVarHide), null, null, new i(this, null, 1), 3);
        l2(new hy2.e(this, null, 7), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f158219s;
    }
}
