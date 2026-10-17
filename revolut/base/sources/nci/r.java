package nci;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature_retail_user_declarations.terms_review.screen.ReadTermsControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends oki.h implements l {
    public final ReadTermsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pre.c f214214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hk0.a f214215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f214216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f214217s;

    public r(ReadTermsControllerContract$InputData inputData, s mapper, pre.c termsInteractor, hk0.a networkFileRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        this.o = inputData;
        this.f214214p = termsInteractor;
        this.f214215q = networkFileRepository;
        this.f214216r = new vii.b();
        this.f214217s = mra.d.b(this, new k(new Data(null, null, true, 3, null), null, false), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f214216r, new mk0.f(continuation, this, 21)), null, null, new naf.j(this, continuation, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f214217s;
    }
}
