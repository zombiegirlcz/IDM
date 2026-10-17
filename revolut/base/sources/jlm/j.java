package jlm;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* JADX INFO: loaded from: classes14.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f175885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f175886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f175887c;
    public static final int d;
    public static final int e;
    public static final AtomicReferenceArray f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceArray f175888g;

    static {
        int iIntValue;
        int i = 0;
        byte[] data = new byte[0];
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        f175885a = new i(data, 0, 0, null);
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f175886b = iHighestOneBit;
        int i2 = iHighestOneBit / 2;
        int i3 = i2 >= 1 ? i2 : 1;
        f175887c = i3;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", Intrinsics.f(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        Integer numM = z.m(property);
        if (numM != null && (iIntValue = numM.intValue()) >= 0) {
            i = iIntValue;
        }
        d = i;
        int i5 = i / i3;
        if (i5 < 8192) {
            i5 = 8192;
        }
        e = i5;
        f = new AtomicReferenceArray(iHighestOneBit);
        f175888g = new AtomicReferenceArray(i3);
    }

    public static final void a(i segment) {
        i iVar = f175885a;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f != null || segment.f175884g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        l lVar = segment.d;
        if (lVar != null) {
            g gVar = (g) lVar;
            if (gVar.f175880b != 0) {
                int iDecrementAndGet = g.f175879c.decrementAndGet(gVar);
                if (iDecrementAndGet >= 0) {
                    return;
                }
                if (iDecrementAndGet != -1) {
                    throw new IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
                }
                gVar.f175880b = 0;
            }
        }
        AtomicReferenceArray atomicReferenceArray = f;
        int id10 = (int) ((((long) f175886b) - 1) & Thread.currentThread().getId());
        segment.f175882b = 0;
        segment.e = true;
        while (true) {
            i iVar2 = (i) atomicReferenceArray.get(id10);
            if (iVar2 != iVar) {
                int i = iVar2 != null ? iVar2.f175883c : 0;
                if (i < 65536) {
                    segment.f = iVar2;
                    segment.f175883c = i + 8192;
                    while (!atomicReferenceArray.compareAndSet(id10, iVar2, segment)) {
                        if (atomicReferenceArray.get(id10) != iVar2) {
                            break;
                        }
                    }
                    return;
                }
                if (d <= 0) {
                    return;
                }
                segment.f175882b = 0;
                segment.e = true;
                int id11 = (int) ((((long) f175887c) - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = f175888g;
                int i2 = 0;
                while (true) {
                    i iVar3 = (i) atomicReferenceArray2.get(id11);
                    if (iVar3 != iVar) {
                        int i3 = (iVar3 != null ? iVar3.f175883c : 0) + 8192;
                        if (i3 <= e) {
                            segment.f = iVar3;
                            segment.f175883c = i3;
                            while (!atomicReferenceArray2.compareAndSet(id11, iVar3, segment)) {
                                if (atomicReferenceArray2.get(id11) != iVar3) {
                                    break;
                                }
                            }
                            return;
                        }
                        int i5 = f175887c;
                        if (i2 >= i5) {
                            return;
                        }
                        i2++;
                        id11 = (id11 + 1) & (i5 - 1);
                    }
                }
            }
        }
    }

    public static final i b() {
        AtomicReferenceArray atomicReferenceArray;
        i iVar;
        i iVar2;
        int id10 = (int) ((((long) f175886b) - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f;
            iVar = f175885a;
            iVar2 = (i) atomicReferenceArray.getAndSet(id10, iVar);
        } while (Intrinsics.f(iVar2, iVar));
        if (iVar2 != null) {
            atomicReferenceArray.set(id10, iVar2.f);
            iVar2.f = null;
            iVar2.f175883c = 0;
            return iVar2;
        }
        atomicReferenceArray.set(id10, null);
        if (d <= 0) {
            i.Companion.getClass();
            return new i();
        }
        int i = f175887c;
        int id11 = (int) (Thread.currentThread().getId() & (((long) i) - 1));
        int i2 = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = f175888g;
            i iVar3 = (i) atomicReferenceArray2.getAndSet(id11, iVar);
            if (!Intrinsics.f(iVar3, iVar)) {
                if (iVar3 != null) {
                    atomicReferenceArray2.set(id11, iVar3.f);
                    iVar3.f = null;
                    iVar3.f175883c = 0;
                    return iVar3;
                }
                atomicReferenceArray2.set(id11, null);
                if (i2 >= i) {
                    i.Companion.getClass();
                    return new i();
                }
                id11 = (id11 + 1) & (i - 1);
                i2++;
            }
        }
    }
}
