package ww;

import gim.i;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pw.c f300561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f300562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f300563c;
    public final AtomicLong d;
    public final AtomicReference e;
    public final z1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z1 f300564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z1 f300565h;

    public b(pw.c currentTimeProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f300561a = currentTimeProvider;
        this.f300562b = new AtomicLong(0L);
        this.f300563c = new AtomicLong(0L);
        new AtomicLong(0L);
        this.d = new AtomicLong(0L);
        new AtomicReference(new c(0.0d, 0.0d));
        this.e = new AtomicReference(new c(0.0d, 0.0d));
        this.f = q.b(0, 7, null);
        this.f300564g = q.b(0, 7, null);
        this.f300565h = q.b(0, 7, null);
    }

    public final Object a(i iVar) throws Throwable {
        boolean z = this.f300562b.get() != 0;
        getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zCompareAndSet = this.f300563c.compareAndSet(0L, jCurrentTimeMillis);
        if (!z || !zCompareAndSet) {
            return Unit.f186387a;
        }
        Object objEmit = this.f.emit(new Double((r2.get() - r0.get()) / 1000.0d), iVar);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }

    public final Object b(i iVar) throws Throwable {
        getClass();
        double dCurrentTimeMillis = (System.currentTimeMillis() - this.f300563c.get()) / 1000.0d;
        long andIncrement = this.d.getAndIncrement();
        AtomicReference atomicReference = this.e;
        if (andIncrement == 0) {
            Object obj2 = atomicReference.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            c cVar = (c) obj2;
            double d = cVar.f300567b;
            cVar.getClass();
            atomicReference.set(new c(dCurrentTimeMillis, d));
        } else {
            double d5 = dCurrentTimeMillis - ((c) atomicReference.get()).f300566a;
            Object obj3 = atomicReference.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            c cVar2 = (c) obj3;
            double d6 = cVar2.f300566a;
            cVar2.getClass();
            atomicReference.set(new c(d6, d5 / (r2.get() - 1)));
        }
        Object obj4 = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
        Object objEmit = this.f300565h.emit(obj4, iVar);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }
}
