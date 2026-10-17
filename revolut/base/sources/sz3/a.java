package sz3;

import kotlin.jvm.internal.Intrinsics;
import mmm.v0;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sgm.e3;
import ulm.j1;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f266747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final py3.b f266748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0.d f266749c;

    public a(Call originalCall, py3.b creditApplicationErrorHandlerChecker) {
        Intrinsics.checkNotNullParameter(originalCall, "originalCall");
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerChecker, "creditApplicationErrorHandlerChecker");
        this.f266747a = originalCall;
        this.f266748b = creditApplicationErrorHandlerChecker;
        this.f266749c = new ik0.d(originalCall);
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.f266747a.cancel();
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f266749c.enqueue(new e3(callback, this, 1));
    }

    @Override // retrofit2.Call
    public final Response execute() {
        return this.f266747a.execute();
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.f266747a.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.f266747a.isExecuted();
    }

    @Override // retrofit2.Call
    public final j1 request() {
        return this.f266747a.request();
    }

    @Override // retrofit2.Call
    public final v0 timeout() {
        return this.f266747a.timeout();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new a(this.f266749c.clone(), this.f266748b);
    }
}
