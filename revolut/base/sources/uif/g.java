package uif;

import akl.p;
import android.os.SystemClock;
import com.revolut.domain.interactors.transactions.Priority;
import e4k.m0;
import efm.c0;
import efm.d0;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l80.h;
import ofm.i;
import org.jetbrains.annotations.NotNull;
import pfm.r;
import qfm.f0;
import qfm.j0;
import qfm.n1;
import rfm.l;
import rfm.w;
import ud3.n;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f280434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue f280435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f280436c;
    public final dgm.f d;
    public final AtomicLong e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile long f280437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile long f280438h;
    public volatile AtomicReference i;

    public g(yk0.d schedulerProvider, h systemTimeProvider) {
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        this.f280434a = systemTimeProvider;
        this.f280435b = new PriorityQueue();
        this.f280436c = -1L;
        Long lValueOf = Long.valueOf(this.f280436c);
        dgm.b bVar = new dgm.b();
        bVar.e.lazySet(lValueOf);
        dgm.f fVar = new dgm.f(bVar);
        Intrinsics.checkNotNullExpressionValue(fVar, "toSerialized(...)");
        this.d = fVar;
        this.e = new AtomicLong(0L);
        this.f = j.b(new ru0.d(this, 5));
        ifm.a aVar = new ifm.a(mfm.f.f205042b, 1);
        Intrinsics.checkNotNullExpressionValue(aVar, "empty(...)");
        this.i = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ifm.c, java.util.concurrent.atomic.AtomicReference] */
    public final void a(long j2) {
        this.i.dispose();
        this.f280437g = SystemClock.elapsedRealtime();
        this.f280436c = j2;
        this.d.onNext(Long.valueOf(j2));
        if (j2 != -1) {
            ufm.f fVar = new ufm.f(d0.u(1000L, TimeUnit.MILLISECONDS, hhm.f.f152431c), new uhl.b(new m0(this, j2, 13), 5), 3);
            Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
            ufm.f fVarT = ue0.e.t(fVar, h0.f322473a);
            i iVar = new i(mfm.f.d, mfm.f.e, 0);
            fVarT.q(iVar);
            Intrinsics.checkNotNullExpressionValue(iVar, "subscribe(...)");
            this.i = iVar;
        }
    }

    public final synchronized void b(long j2) {
        try {
            if (this.f280436c == j2) {
                a aVar = (a) this.f280435b.poll();
                a(aVar != null ? aVar.a() : -1L);
            } else {
                this.f280435b.removeIf(new p(new nxc.a(j2, 15), 24));
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final synchronized l c(Priority priority) {
        l lVar;
        try {
            a aVar = new a(this.e.incrementAndGet(), priority);
            if (this.f280436c == -1) {
                a(aVar.a());
            } else {
                this.f280435b.add(aVar);
            }
            dgm.f fVar = this.d;
            c0 c0Var = (c0) this.f.getValue();
            fVar.getClass();
            int i = efm.i.f125385a;
            mfm.f.b(c0Var, "scheduler is null");
            mfm.f.e(i, "bufferSize");
            lVar = new l(new ufm.f(new f0(new j0(new n1(fVar, c0Var, i), new uhl.b(new n(aVar, 23), 8), 0), null), new uhl.b(new n(this, 24), 9), 3), new rzc.b(this, aVar, 27), 6);
            Intrinsics.checkNotNullExpressionValue(lVar, "doOnDispose(...)");
        } catch (Throwable th10) {
            throw th10;
        }
        return lVar;
    }

    public final r d(Priority priority, Function0 completable) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(completable, "completable");
        int i = 0;
        pfm.a aVar = new pfm.a(new ufm.c(new b(this, priority, i), i), new uhl.b(new c(completable, this, 1), 7), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        r rVarT = aVar.t(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(rVarT, "observeOn(...)");
        return rVarT;
    }

    public final w e(Priority priority, Function0 maybe) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(maybe, "maybe");
        int i = 0;
        rfm.j jVar = new rfm.j(new ufm.c(new b(this, priority, 3), i), new uhl.b(new c(maybe, this, i), 3), 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        w wVarH = jVar.h(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(wVarH, "observeOn(...)");
        return wVarH;
    }

    public final ufm.n f(Priority priority, Function0 single) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(single, "single");
        ufm.i iVar = new ufm.i(new ufm.c(new b(this, priority, 2), 0), new uhl.b(new c(single, this, 2), 6), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        ufm.n nVarN = iVar.n(hhm.f.f152431c);
        Intrinsics.checkNotNullExpressionValue(nVarN, "observeOn(...)");
        return nVarN;
    }
}
