package xem;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class b implements c {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "top");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f304717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f304718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceArray f304719c;
    public final int[] d;

    @NotNull
    private volatile /* synthetic */ long top;

    public b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i).toString());
        }
        if (i > 536870911) {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i).toString());
        }
        this.top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.f304717a = iHighestOneBit;
        this.f304718b = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i2 = iHighestOneBit + 1;
        this.f304719c = new AtomicReferenceArray(i2);
        this.d = new int[i2];
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Object instance = g();
            if (instance == null) {
                return;
            } else {
                Intrinsics.checkNotNullParameter(instance, "instance");
            }
        }
    }

    public Object d(Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return instance;
    }

    @Override // xem.c
    public final void d5(Object instance) {
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(instance, "instance");
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.f304718b) + 1;
        for (int i = 0; i < 8; i++) {
            AtomicReferenceArray atomicReferenceArray = this.f304719c;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, instance)) {
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = this.f304717a;
                    }
                }
            }
            if (iIdentityHashCode <= 0) {
                throw new IllegalArgumentException("index should be positive");
            }
            do {
                j2 = this.top;
                j3 = ((j2 >> 32) & BodyPartID.bodyIdMax) + 1;
                this.d[iIdentityHashCode] = (int) (BodyPartID.bodyIdMax & j2);
            } while (!e.compareAndSet(this, j2, (j3 << 32) | ((long) iIdentityHashCode)));
            return;
        }
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    public abstract Object f();

    public final Object g() {
        long j2;
        int i;
        b bVar;
        long j3;
        do {
            j2 = this.top;
            if (j2 != 0) {
                j3 = ((j2 >> 32) & BodyPartID.bodyIdMax) + 1;
                i = (int) (BodyPartID.bodyIdMax & j2);
                if (i != 0) {
                    bVar = this;
                }
            }
            i = 0;
            bVar = this;
            break;
        } while (!e.compareAndSet(bVar, j2, (j3 << 32) | ((long) this.d[i])));
        if (i == 0) {
            return null;
        }
        return bVar.f304719c.getAndSet(i, null);
    }

    @Override // xem.c
    public final Object n8() {
        Object objD;
        Object objG = g();
        return (objG == null || (objD = d(objG)) == null) ? f() : objD;
    }
}
