package androidx.camera.camera2.pipe.core;

import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import rkm.b;
import skm.e0;
import skm.k0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\u0007J\r\u0010\u0016\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\nH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/camera/camera2/pipe/core/WakeLock;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "timeout", "", "startTimeoutOnCreation", "", "callback", "Lkotlin/Function0;", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;JZLkotlin/jvm/functions/Function0;)V", "lock", "count", "", "timeoutJob", "Lkotlinx/coroutines/Job;", "closed", "acquire", "Landroidx/camera/camera2/pipe/core/Token;", "release", "releaseToken", "releaseToken$camera_camera2_pipe", "startTimeout", "WakeLockToken", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WakeLock {

    @NotNull
    private final Function0<Unit> callback;
    private boolean closed;
    private int count;

    @NotNull
    private final Object lock;

    @NotNull
    private final CoroutineScope scope;
    private final boolean startTimeoutOnCreation;
    private final long timeout;
    private Job timeoutJob;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/camera/camera2/pipe/core/WakeLock$WakeLockToken;", "Landroidx/camera/camera2/pipe/core/Token;", "<init>", "(Landroidx/camera/camera2/pipe/core/WakeLock;)V", "", "release", "()Z", "Lrkm/b;", "_released", "Lrkm/b;", "getReleased", "released", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class WakeLockToken implements Token {

        @NotNull
        private final b _released = hx7.b.g(false);

        public WakeLockToken() {
        }

        @Override // androidx.camera.camera2.pipe.core.Token
        public boolean getReleased() {
            return this._released.b();
        }

        @Override // androidx.camera.camera2.pipe.core.Token
        public boolean release() {
            if (!this._released.a()) {
                return false;
            }
            WakeLock.this.releaseToken$camera_camera2_pipe();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.core.WakeLock$release$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.core.WakeLock$release$2", f = "WakeLock.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return WakeLock.this.new AnonymousClass2(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            WakeLock.this.callback.invoke();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1", f = "WakeLock.kt", l = {116}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return WakeLock.this.new AnonymousClass1(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                long j2 = WakeLock.this.timeout;
                this.label = 1;
                if (k0.b(j2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            Object obj3 = WakeLock.this.lock;
            WakeLock wakeLock = WakeLock.this;
            synchronized (obj3) {
                if (!wakeLock.closed && wakeLock.count == 0) {
                    wakeLock.timeoutJob = null;
                    wakeLock.closed = true;
                    Unit unit = Unit.f186387a;
                    WakeLock.this.callback.invoke();
                    return Unit.f186387a;
                }
                return Unit.f186387a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public WakeLock(@NotNull CoroutineScope scope, long j2, boolean z, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.scope = scope;
        this.timeout = j2;
        this.startTimeoutOnCreation = z;
        this.callback = callback;
        Object obj2 = new Object();
        this.lock = obj2;
        if (z) {
            synchronized (obj2) {
                startTimeout();
                Unit unit = Unit.f186387a;
            }
        }
    }

    private final void startTimeout() {
        this.timeoutJob = e0.C(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    public final Token acquire() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return null;
                }
                int i = this.count + 1;
                this.count = i;
                if (i == 1) {
                    Job job2 = this.timeoutJob;
                    if (job2 != null) {
                        job2.f(null);
                    }
                    this.timeoutJob = null;
                }
                Unit unit = Unit.f186387a;
                return new WakeLockToken();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final boolean release() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return false;
                }
                this.closed = true;
                Job job2 = this.timeoutJob;
                if (job2 != null) {
                    job2.f(null);
                }
                this.timeoutJob = null;
                Unit unit = Unit.f186387a;
                e0.C(this.scope, null, null, new AnonymousClass2(null), 3);
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void releaseToken$camera_camera2_pipe() {
        synchronized (this.lock) {
            try {
                int i = this.count - 1;
                this.count = i;
                if (i == 0 && !this.closed) {
                    startTimeout();
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
