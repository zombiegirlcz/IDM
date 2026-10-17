package qbm;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import kbm.d;
import lbm.f;
import lbm.j;
import mmm.v0;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ulm.j1;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call f244383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call f244384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f244385c;
    public final Predicate d;

    public c(Call call, j jVar, Predicate predicate) {
        this.f244383a = call;
        this.f244384b = call;
        this.f244385c = jVar;
        this.d = predicate;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.f244383a.cancel();
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback callback) throws Exception {
        Call call = this.f244384b;
        try {
            if (this.f244383a.request().f281096b.equals("GET")) {
                j jVar = this.f244385c;
                jVar.getClass();
                try {
                    ((f) jVar.f193726b.get()).e();
                } catch (Exception e) {
                    jVar.e(new d(jVar.f193725a));
                    throw e;
                }
            }
            call.enqueue(new b(this, System.nanoTime(), callback));
        } catch (CallNotPermittedException e2) {
            callback.onFailure(call, e2);
        }
    }

    @Override // retrofit2.Call
    public final Response execute() throws Exception {
        Call call = this.f244384b;
        boolean zEquals = this.f244383a.request().f281096b.equals("GET");
        j jVar = this.f244385c;
        if (zEquals) {
            jVar.getClass();
            try {
                ((f) jVar.f193726b.get()).e();
            } catch (Exception e) {
                jVar.e(new d(jVar.f193725a));
                throw e;
            }
        }
        Clock clockSystemUTC = Clock.systemUTC();
        Instant instant = clockSystemUTC.instant();
        try {
            Response responseExecute = call.execute();
            if (this.d.test(responseExecute)) {
                long nanos = Duration.between(instant, clockSystemUTC.instant()).toNanos();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                jVar.c(nanos, responseExecute);
                return responseExecute;
            }
            Throwable th10 = new Throwable("Response error: HTTP " + responseExecute.code() + " - " + responseExecute.message());
            long nanos2 = Duration.between(instant, clockSystemUTC.instant()).toNanos();
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            jVar.b(th10, nanos2);
            return responseExecute;
        } catch (Exception e2) {
            if (call.isCanceled()) {
                ((f) jVar.f193726b.get()).g();
            } else {
                long nanos3 = Duration.between(instant, clockSystemUTC.instant()).toNanos();
                TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
                jVar.b(e2, nanos3);
            }
            throw e2;
        }
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.f244383a.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.f244383a.isExecuted();
    }

    @Override // retrofit2.Call
    public final j1 request() {
        return this.f244383a.request();
    }

    @Override // retrofit2.Call
    public final v0 timeout() {
        return this.f244384b.timeout();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new c(this.f244384b.clone(), this.f244385c, this.d);
    }
}
