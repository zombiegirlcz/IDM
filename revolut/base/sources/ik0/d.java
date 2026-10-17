package ik0;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import hx7.e;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import mmm.v0;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ulm.j1;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Call {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call f161865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161866b;

    public d(Call call, boolean z) {
        this.f161865a = call;
        this.f161866b = z;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.f161865a.cancel();
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback callback) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean zF = Intrinsics.f(Looper.myLooper(), Looper.getMainLooper());
        boolean zBooleanValue = false;
        if (!this.f161866b || !zF) {
            try {
                m.Companion companion = m.INSTANCE;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            if (zF) {
                throw new NetworkOnMainThreadException();
            }
            objA = Boolean.TRUE;
            Throwable thA = m.a(objA);
            if (thA != null) {
                e.n(thA);
            }
            if (objA instanceof n) {
                objA = null;
            }
            Boolean bool = (Boolean) objA;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        Call call = this.f161865a;
        if (!zBooleanValue) {
            call.enqueue(new fkg.a(callback, 14));
            return;
        }
        try {
            callback.onResponse(this, call.execute());
        } catch (Throwable th11) {
            callback.onFailure(this, th11);
        }
    }

    @Override // retrofit2.Call
    public final Response execute() {
        return this.f161865a.execute();
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.f161865a.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.f161865a.isExecuted();
    }

    @Override // retrofit2.Call
    public final j1 request() {
        return this.f161865a.request();
    }

    @Override // retrofit2.Call
    public final v0 timeout() {
        return this.f161865a.timeout();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        Call callClone = this.f161865a.clone();
        Intrinsics.checkNotNullExpressionValue(callClone, "clone(...)");
        return new d(callClone, this.f161866b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Call originalCall) {
        this(originalCall, false);
        Intrinsics.checkNotNullParameter(originalCall, "originalCall");
    }
}
