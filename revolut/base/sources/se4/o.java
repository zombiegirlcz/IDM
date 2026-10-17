package se4;

import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.OtpScreenContract$InputData;
import java.time.LocalDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sbb.w;
import yy3.x;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends oki.h implements dli.b {

    @NotNull
    private static final l Companion = new l();
    public final re4.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final OtpScreenContract$InputData f262113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l80.e f262114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qe4.e f262115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f262116s;

    public o(re4.e interactor, OtpScreenContract$InputData inputData, l80.e dateProvider, qe4.e startSigningProcessControllerModelExtension, q stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(startSigningProcessControllerModelExtension, "startSigningProcessControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f262113p = inputData;
        this.f262114q = dateProvider;
        this.f262115r = startSigningProcessControllerModelExtension;
        LocalDateTime localDateTimeF = ((l80.f) dateProvider).f();
        String str = inputData.f68041b;
        String str2 = inputData.f68042c;
        LocalDateTime localDateTimePlusSeconds = localDateTimeF.plusSeconds(inputData.d);
        Intrinsics.checkNotNullExpressionValue(localDateTimePlusSeconds, "plusSeconds(...)");
        this.f262116s = mra.d.b(this, new e(str, str2, localDateTimePlusSeconds, localDateTimeF, x.STARTED, localDateTimeF), stateMapper, null, false, 12);
    }

    public static final void I2(o oVar) {
        oVar.n2(new m(oVar, null, 1), new k(oVar, 0));
    }

    @Override // yji.l
    public final void I1() {
        l2(new m(this, null, 2), new yi5.b(26));
    }

    public final void J2(h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof g) {
            B2();
        } else {
            if (!(event instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new m(this, null, 3), new yi5.b(26));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new w(this, null, 7), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f262116s;
    }
}
