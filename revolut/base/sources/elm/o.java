package elm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f127552b = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f127553c = AtomicIntegerFieldUpdater.newUpdater(o.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(o.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(o.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f127554a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final k a(k kVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f127553c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return kVar;
        }
        if (kVar.f127546b) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & CertificateBody.profileType;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f127554a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, kVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final k b() {
        k kVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f127553c.get(this) == 0) {
                return null;
            }
            int i2 = i & CertificateBody.profileType;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (kVar = (k) this.f127554a.getAndSet(i2, null)) != null) {
                if (kVar.f127546b) {
                    e.decrementAndGet(this);
                }
                return kVar;
            }
        }
    }

    public final k c(int i, boolean z) {
        int i2 = i & CertificateBody.profileType;
        AtomicReferenceArray atomicReferenceArray = this.f127554a;
        k kVar = (k) atomicReferenceArray.get(i2);
        if (kVar == null || kVar.f127546b != z || !ehe.n.A(atomicReferenceArray, i2, kVar)) {
            return null;
        }
        if (z) {
            e.decrementAndGet(this);
        }
        return kVar;
    }
}
