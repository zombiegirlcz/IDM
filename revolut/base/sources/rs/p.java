package rs;

import android.net.Uri;
import com.revolut.biometric_verification.impl.ui.step.active_liveness.video_confirmation.BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.re0;
import ip0.ue0;
import ip0.we0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData f256896a;

    public p(BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f256896a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        we0 we0Var = new we0("active_liveness_video_confirmation_video", new ue0(new UriVideo(this.f256896a.f50515a, (Uri) null, true, oz0.b.CENTER_CROP, Boolean.FALSE, (oz0.c) null, 66), new re0(4, 3)));
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp32;
        yp0.b.l(we0Var, i, i, i2, i2, null, false, 48);
        return new m(u.c(we0Var));
    }
}
