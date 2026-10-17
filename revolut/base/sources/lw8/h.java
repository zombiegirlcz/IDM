package lw8;

import cli.k;
import cli.y;
import com.revolut.feature.kyc.impl.incode.screen.IncodeScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {
    public final IncodeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f200434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f200435q;

    public h(IncodeScreenContract$InputData inputData, e incodeInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(incodeInteractor, "incodeInteractor");
        this.o = inputData;
        this.f200434p = incodeInteractor;
        this.f200435q = mra.d.b(this, k.f25028a, new a54.b(19), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new lo.c(this, (Continuation) null, 9), new lrk.h(1, this, h.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 4));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f200435q;
    }
}
