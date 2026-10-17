package tma;

import a82.s;
import android.os.SystemClock;
import cli.y;
import com.revolut.feature.profile.impl.ui.details.email.check_inbox.CheckInboxScreenContract$InputData;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends oki.h implements i {

    @NotNull
    public static final k Companion = new k();
    public final l80.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vma.a f272174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f272175q;

    public l(CheckInboxScreenContract$InputData inputData, m stateMapper, l80.h timeProvider, vma.a inboxIntentProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(inboxIntentProvider, "inboxIntentProvider");
        this.o = timeProvider;
        this.f272174p = inboxIntentProvider;
        long j2 = inputData.f81390a;
        this.f272175q = mra.d.b(this, new e(inputData.f81391b, (int) TimeUnit.MILLISECONDS.toSeconds(60000 - (SystemClock.elapsedRealtime() - j2)), j2, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        long j2 = ((e) ((j2) this.f272175q.f22677a).getValue()).f272169a;
        this.o.getClass();
        yji.l.a1(this, ta6.a.H(60000 - (SystemClock.elapsedRealtime() - j2), 1000L, TimeUnit.MILLISECONDS), null, null, new s(this, (Continuation) null, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f272175q;
    }
}
