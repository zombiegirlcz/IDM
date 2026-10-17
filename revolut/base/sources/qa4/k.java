package qa4;

import a82.s;
import android.os.SystemClock;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email.CheckEmailInboxScreenContract$InputData;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends oki.h implements g {

    @NotNull
    private static final i Companion = new i();
    public final CheckEmailInboxScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l80.h f243956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f243957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sa4.a f243958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f243959s;

    public k(CheckEmailInboxScreenContract$InputData inputData, l80.h timeProvider, ang.f userInteractor, sa4.a emailClientIntentProvider, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(emailClientIntentProvider, "emailClientIntentProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f243956p = timeProvider;
        this.f243957q = userInteractor;
        this.f243958r = emailClientIntentProvider;
        long j2 = inputData.f67639b;
        this.f243959s = mra.d.b(this, new e(((int) (60000 - (SystemClock.elapsedRealtime() - j2))) / 1000, j2, inputData.f67640c), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        long j2 = ((e) ((j2) this.f243959s.f22677a).getValue()).f243951b;
        this.f243956p.getClass();
        yji.l.a1(this, ta6.a.H(60000 - (SystemClock.elapsedRealtime() - j2), 1000L, TimeUnit.MILLISECONDS), null, null, new s(this, (Continuation) null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f243959s;
    }
}
