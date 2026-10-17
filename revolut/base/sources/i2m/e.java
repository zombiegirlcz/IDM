package i2m;

import h30.q;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import mmm.v0;
import r10.v;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import u1m.f0;
import ulm.j1;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Call f158059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f158060b;

    public e(Call call, v vVar) {
        this.f158059a = call;
        this.f158060b = vVar;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.f158059a.cancel();
    }

    public final Object clone() {
        Call callClone = this.f158059a.clone();
        Intrinsics.checkNotNullExpressionValue(callClone, "clone(...)");
        return callClone;
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        StringBuilder sb6 = new StringBuilder("communication start. url=");
        Call call = this.f158059a;
        sb6.append(call.request().f281095a);
        String message = sb6.toString();
        Intrinsics.checkNotNullParameter(message, "message");
        f0 f0Var = f0.VERBOSE;
        call.enqueue(new q(this.f158060b, call, callback));
    }

    @Override // retrofit2.Call
    public final Response execute() throws IOException {
        Response responseExecute = this.f158059a.execute();
        Intrinsics.checkNotNullExpressionValue(responseExecute, "execute(...)");
        return responseExecute;
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.f158059a.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.f158059a.isExecuted();
    }

    @Override // retrofit2.Call
    public final j1 request() {
        j1 j1VarRequest = this.f158059a.request();
        Intrinsics.checkNotNullExpressionValue(j1VarRequest, "request(...)");
        return j1VarRequest;
    }

    @Override // retrofit2.Call
    public final v0 timeout() {
        v0 v0VarTimeout = this.f158059a.timeout();
        Intrinsics.checkNotNullExpressionValue(v0VarTimeout, "timeout(...)");
        return v0VarTimeout;
    }

    @Override // retrofit2.Call
    public final Call clone() {
        Call callClone = this.f158059a.clone();
        Intrinsics.checkNotNullExpressionValue(callClone, "clone(...)");
        return callClone;
    }
}
