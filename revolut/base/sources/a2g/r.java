package a2g;

import c1g.u;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.additional_information.TravelExperiencesAdditionalInformationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.additional_information.TravelExperiencesAdditionalInformationScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends jki.g implements k {
    public static final /* synthetic */ int v = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelExperiencesDetailsScreenContract$InputData f852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hyf.b f853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hyf.a f854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r10.f f855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0g.d f856t;
    public final g u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jki.p stateMapper, TravelExperiencesDetailsScreenContract$InputData inputData, hyf.b interactor, hyf.a travelExperiencesFeatureInteractor, r10.f dropOffInteractor, o0g.d reviewsRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(travelExperiencesFeatureInteractor, "travelExperiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(dropOffInteractor, "dropOffInteractor");
        Intrinsics.checkNotNullParameter(reviewsRepository, "reviewsRepository");
        this.f852p = inputData;
        this.f853q = interactor;
        this.f854r = travelExperiencesFeatureInteractor;
        this.f855s = dropOffInteractor;
        this.f856t = reviewsRepository;
        this.u = new g(new Data(null, null, true, 3, null), inputData.f93061c, null, false, inputData.d, false, false, new Data(null, null, false, 7, null));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new a01.e(this, continuation, 6), new a09.a(12));
        TravelExperiencesDetailsScreenContract$InputData travelExperiencesDetailsScreenContract$InputData = this.f852p;
        String str = travelExperiencesDetailsScreenContract$InputData.f93059a;
        u uVar = (u) this.f853q;
        yji.l.a1(this, uVar.c(str), null, null, new o(this, null, 1), 3);
        String experienceId = travelExperiencesDetailsScreenContract$InputData.f93059a;
        myf.c params = new myf.c(experienceId, DateTime.now().withTimeAtStartOfDay(), DateTime.now().plusYears(1).withTimeAtStartOfDay());
        uVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        m0g.g gVar = (m0g.g) uVar.f20509a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        yji.l.a1(this, nz8.d.i(rd0.e.b(gVar.f.f(params, false)), new a08.n(9), new m(0), new a08.n(10)), null, null, new o(this, null, 2), 3);
        uVar.getClass();
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        yji.l.a1(this, new a07.p(nim.a.v(uVar.c(experienceId), new c09.a(uVar)), 10), null, null, new q(this, (Continuation) null, 0), 3);
        x3g.g request = new x3g.g(experienceId, null);
        o0g.d dVar = this.f856t;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.n(rd0.e.b(dVar.d.e(request, loadingStrategy)), h0.f322473a), null, null, new o(this, null, 0), 3);
        l2(new a07.d(this, continuation, 5), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void y2(String str, l1g.c cVar) {
        yji.l.g2(this, new TravelExperiencesAdditionalInformationScreen(new TravelExperiencesAdditionalInformationScreenContract$InputData(str, cVar)), ModalDestination.Style.POPUP.f98311a, null, 2);
    }
}
