package wma;

import cli.k;
import cli.y;
import com.revolut.feature.profile.impl.ui.details.email.confirm.EmailConfirmationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends h implements dli.b {
    public final EmailConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f298627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sf0.h f298628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v60.e f298629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f298630s;

    public f(EmailConfirmationScreenContract$InputData inputData, ang.f userInteractor, sf0.h serverErrorParser, v60.e serverErrorsProvider, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f298627p = userInteractor;
        this.f298628q = serverErrorParser;
        this.f298629r = serverErrorsProvider;
        this.f298630s = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new w76.a(this, null, 22), new e(1, this, f.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 0));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f298630s;
    }
}
