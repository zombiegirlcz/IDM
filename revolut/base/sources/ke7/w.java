package ke7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.PowerManager;
import com.revolut.feature.in_app_calls.domain.AudioRoute;
import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import com.revolut.feature.in_app_calls.screen.in_progress.InProgressScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends oki.h implements o {
    public final InProgressScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fe7.b f183040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final be7.h f183041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final be7.k f183042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n30.y f183043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l80.e f183044t;
    public final l80.h u;
    public final be7.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f183045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f183046x;

    public w(InProgressScreenContract$InputData inputData, fe7.b callControlsDispatcher, be7.h inAppCalls, be7.k inAppCallsInteractor, n30.y chatProductSpecificInteractor, l80.e dateProvider, l80.h systemTimeProvider, be7.e chatVisibilityObserver, y proximitySensorWakeLockDelegate, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(callControlsDispatcher, "callControlsDispatcher");
        Intrinsics.checkNotNullParameter(inAppCalls, "inAppCalls");
        Intrinsics.checkNotNullParameter(inAppCallsInteractor, "inAppCallsInteractor");
        Intrinsics.checkNotNullParameter(chatProductSpecificInteractor, "chatProductSpecificInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        Intrinsics.checkNotNullParameter(chatVisibilityObserver, "chatVisibilityObserver");
        Intrinsics.checkNotNullParameter(proximitySensorWakeLockDelegate, "proximitySensorWakeLockDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f183040p = callControlsDispatcher;
        this.f183041q = inAppCalls;
        this.f183042r = inAppCallsInteractor;
        this.f183043s = chatProductSpecificInteractor;
        this.f183044t = dateProvider;
        this.u = systemTimeProvider;
        this.v = chatVisibilityObserver;
        this.f183045w = proximitySensorWakeLockDelegate;
        be7.a aVar = be7.a.IDLE;
        AudioRoute.Earpiece earpiece = AudioRoute.Earpiece.f74800a;
        this.f183046x = mra.d.b(this, new n(i.f183017a, aVar, false, new fe7.a(zhm.u.c(earpiece), earpiece), null, null, null, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (this.o.f74836a) {
            com.revolut.feature.in_app_calls.a aVar = (com.revolut.feature.in_app_calls.a) this.f183041q;
            aVar.getClass();
            CallNotificationService.Companion companion = CallNotificationService.INSTANCE;
            Context context = aVar.f74790a.getContext();
            companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) CallNotificationService.class);
            intent.putExtra("EXTRA_INVITE", (Parcelable) null);
            context.startService(intent.setAction("com.revolut.feature.in_app_calls.ACCEPT_CALL"));
        }
        yji.l.a1(this, rd0.e.b(((com.revolut.feature.in_app_calls.b) this.f183042r).f74794b), null, null, new u(this, continuation, 0), 3);
        fe7.b bVar = this.f183040p;
        yji.l.a1(this, bVar.f134458c, null, null, new jkh.g(this, continuation, 4), 3);
        yji.l.a1(this, bVar.d, null, null, new u(this, continuation, 1), 3);
    }

    @Override // yji.l
    public final void P1() {
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f183045w.f183048b.getValue();
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        wakeLock.release();
    }

    @Override // yji.l
    public final void T1(long j2) {
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f183045w.f183048b.getValue();
        if (wakeLock == null || wakeLock.isHeld()) {
            return;
        }
        wakeLock.acquire();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f183046x;
    }
}
