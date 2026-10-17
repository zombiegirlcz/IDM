package q50;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import skm.w1;

/* JADX INFO: loaded from: classes19.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y50.d f242260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v20.j0 f242262c;
    public final AtomicReference d;
    public final AtomicReference e;
    public oq0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f242263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f242264h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f242265j;

    public q(s sVar, y50.d dVar, String itemId, v20.j0 message) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f242265j = sVar;
        this.f242260a = dVar;
        this.f242261b = itemId;
        this.f242262c = message;
        this.d = new AtomicReference(null);
        this.e = new AtomicReference(null);
    }

    public final void a() {
        if (this.f242260a == null) {
            return;
        }
        w1 w1Var = w1.f264016b;
        Job job2 = (Job) this.d.getAndSet(w1Var);
        Continuation continuation = null;
        if (job2 != null) {
            job2.f(null);
        }
        Job job3 = (Job) this.e.getAndSet(w1Var);
        if (job3 != null) {
            job3.f(null);
        }
        s sVar = this.f242265j;
        sVar.T2(new q2e.i0(this, sVar, continuation, 10), new yi5.b(27));
    }

    public final void b(oq0.b bVar) {
        this.f = bVar;
        s sVar = this.f242265j;
        if (sVar.o.get() == 0) {
            sVar.f242274m.k(Unit.f186387a);
        }
    }

    public final void c() {
        y50.d dVar;
        s sVar = this.f242265j;
        if (sVar.f242278r && (dVar = this.f242260a) != null) {
            AtomicReference atomicReference = this.e;
            Job job2 = (Job) atomicReference.get();
            if (Intrinsics.f(job2, w1.f264016b)) {
                return;
            }
            Job jobV2 = dVar.f314526g ? null : (job2 == null || !job2.d()) ? sVar.V2(new o4a.b(dVar, sVar, null, 21), new yi5.b(29)) : job2;
            if (job2 != jobV2) {
                while (!atomicReference.compareAndSet(job2, jobV2)) {
                    if (atomicReference.get() != job2) {
                        if (jobV2 != null) {
                            jobV2.f(null);
                            return;
                        }
                        return;
                    }
                }
                if (job2 != null) {
                    job2.f(null);
                }
            }
        }
    }
}
