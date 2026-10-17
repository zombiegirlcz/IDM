package qbm;

import java.util.concurrent.TimeUnit;
import lbm.f;
import lbm.j;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f244380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callback f244381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f244382c;

    public b(c cVar, long j2, Callback callback) {
        this.f244380a = j2;
        this.f244381b = callback;
        this.f244382c = cVar;
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call call, Throwable th10) {
        j jVar = this.f244382c.f244385c;
        if (call.isCanceled()) {
            ((f) jVar.f193726b.get()).g();
        } else {
            long jNanoTime = System.nanoTime() - this.f244380a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            jVar.b(th10, jNanoTime);
        }
        this.f244381b.onFailure(call, th10);
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call call, Response response) {
        c cVar = this.f244382c;
        j jVar = cVar.f244385c;
        boolean zTest = cVar.d.test(response);
        long j2 = this.f244380a;
        if (zTest) {
            long jNanoTime = System.nanoTime() - j2;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            jVar.c(jNanoTime, response);
        } else {
            Throwable th10 = new Throwable(j6.a.m(response.code(), "Response error: HTTP ", " - ", response.message()));
            long jNanoTime2 = System.nanoTime() - j2;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            jVar.b(th10, jNanoTime2);
        }
        this.f244381b.onResponse(call, response);
    }
}
