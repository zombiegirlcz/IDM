package qni;

import a82.s;
import cli.y;
import com.revolut.otp.input.flow.email.bottom_dialog.OtpEmailNoEmailReceivedBottomSheetContract$InputData;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends oki.h implements dli.b {

    @NotNull
    private static final h Companion = new h();
    public final OtpEmailNoEmailReceivedBottomSheetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f247957p;

    public i(OtpEmailNoEmailReceivedBottomSheetContract$InputData inputData, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        long j2 = inputData.f98513a;
        this.f247957p = mra.d.b(this, new d(j2, j2 == 0, inputData.f98514b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, ta6.a.H(this.o.f98513a, 1L, TimeUnit.SECONDS), null, null, new s(this, (Continuation) null, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f247957p;
    }
}
