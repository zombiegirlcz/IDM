package l1g;

import c1g.u;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.additional_information.TravelExperiencesAdditionalInformationScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TravelExperiencesAdditionalInformationScreenContract$InputData f191538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hyf.b f191539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f191540r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p stateMapper, TravelExperiencesAdditionalInformationScreenContract$InputData inputData, hyf.b travelExperiencesInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelExperiencesInteractor, "travelExperiencesInteractor");
        this.f191538p = inputData;
        this.f191539q = travelExperiencesInteractor;
        this.f191540r = new b(new Data(null, null, false, 7, null), inputData.f93013b);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, ((u) this.f191539q).c(this.f191538p.f93012a), null, null, new e(this, (Continuation) null, 0), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.f191540r;
    }
}
