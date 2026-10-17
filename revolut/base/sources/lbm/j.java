package lbm;

import io.github.resilience4j.circuitbreaker.ResultRecordedAsFailureException;
import java.time.Clock;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import nhm.s;
import retrofit2.Response;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f193726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jbm.h f193727c;
    public final s d;
    public final e e;
    public final Clock f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f193728g;

    public j(String str, jbm.h hVar, nhm.l lVar) {
        Clock clockSystemUTC = Clock.systemUTC();
        n nVar = (n) n.f193735b.get();
        this.f193725a = str;
        Objects.requireNonNull(hVar, "Config must not be null");
        this.f193727c = hVar;
        this.e = new e();
        this.f = clockSystemUTC;
        this.f193726b = new AtomicReference(new g(this));
        this.f193728g = nVar;
        Objects.requireNonNull(lVar, "Tags must not be null");
        this.d = lVar;
    }

    public final void a(Throwable th10, long j2) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        jbm.h hVar = this.f193727c;
        boolean zTest = hVar.f172674b.test(th10);
        String str = this.f193725a;
        AtomicReference atomicReference = this.f193726b;
        if (zTest) {
            ((f) atomicReference.get()).g();
            e(new kbm.e(str, Duration.ofNanos(timeUnit.toNanos(j2)), th10, 1));
            return;
        }
        boolean zTest2 = hVar.f172673a.test(th10);
        e eVar = this.e;
        if (zTest2) {
            if (eVar.f204244c) {
                d(new kbm.e(str, Duration.ofNanos(timeUnit.toNanos(j2)), th10, 0));
            }
            ((f) atomicReference.get()).c(j2);
        } else {
            if (eVar.f204244c) {
                d(new kbm.h(str, Duration.ofNanos(timeUnit.toNanos(j2))));
            }
            ((f) atomicReference.get()).h(j2);
        }
    }

    public final void b(Throwable th10, long j2) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if ((th10 instanceof CompletionException) || (th10 instanceof ExecutionException)) {
            a(th10.getCause(), j2);
        } else {
            a(th10, j2);
        }
    }

    public final void c(long j2, Response response) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        e eVar = this.e;
        String str = this.f193725a;
        AtomicReference atomicReference = this.f193726b;
        if (response == null || !this.f193727c.f172675c.test(response)) {
            if (eVar.f204244c) {
                d(new kbm.h(str, Duration.ofNanos(timeUnit.toNanos(j2))));
            }
            ((f) atomicReference.get()).h(j2);
        } else {
            ResultRecordedAsFailureException resultRecordedAsFailureException = new ResultRecordedAsFailureException(str, response);
            if (eVar.f204244c) {
                d(new kbm.e(str, Duration.ofNanos(timeUnit.toNanos(j2)), resultRecordedAsFailureException, 0));
            }
            ((f) atomicReference.get()).c(j2);
        }
    }

    public final void d(kbm.a aVar) {
        f fVar = (f) this.f193726b.get();
        fVar.getClass();
        if (aVar.getEventType().forcePublish || fVar.getState().allowPublish) {
            try {
                this.e.b(aVar);
            } catch (Throwable unused) {
            }
        }
    }

    public final void e(kbm.a aVar) {
        if (this.e.f204244c) {
            d(aVar);
        }
    }

    public final void f(final jbm.a aVar, final UnaryOperator unaryOperator) {
        jbm.a state = ((f) this.f193726b.getAndUpdate(new UnaryOperator() { // from class: lbm.d
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                f fVar = (f) obj2;
                jbm.b.e(this.f193715a.f193725a, fVar.getState(), aVar);
                fVar.b();
                return (f) unaryOperator.apply(fVar);
            }
        })).getState();
        String str = this.f193725a;
        jbm.b bVarE = jbm.b.e(str, state, aVar);
        if (jbm.b.d(bVarE)) {
            return;
        }
        e(new kbm.g(str, bVarE));
    }

    public final String toString() {
        return p.a.p("CircuitBreaker '", this.f193725a, "'");
    }
}
