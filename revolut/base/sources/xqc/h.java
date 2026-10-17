package xqc;

import aqc.j;
import cli.y;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.review_details.ReviewDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements dli.b {
    public final hp.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f308153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f308154q;

    public h(i stateMapper, ReviewDetailsScreenContract$InputData inputData, hp.b cnpjValidator, j interactor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cnpjValidator, "cnpjValidator");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = cnpjValidator;
        this.f308153p = interactor;
        this.f308154q = mra.d.b(this, new d(inputData.f85291a, inputData.f85292b, inputData.f85293c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f308154q;
    }
}
