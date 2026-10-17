package ukm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends q implements j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f280803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ReentrantLock f280804n;
    public Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f280805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f280806q;

    public d() {
        super(0, null);
        this.f280803m = -1;
        this.f280804n = new ReentrantLock();
        this.o = zhm.f0.f322471a;
        this.f280805p = e.f280807a;
        this.f280806q = new HashMap();
    }

    @Override // ukm.q
    public final void L(flm.i iVar, Object obj2) {
        ReentrantLock reentrantLock = this.f280804n;
        reentrantLock.lock();
        try {
            Object objRemove = this.f280806q.remove(iVar);
            if (objRemove != null) {
                ((flm.h) iVar).e = objRemove;
                return;
            }
            Unit unit = Unit.f186387a;
            reentrantLock.unlock();
            skm.e0.C(skm.e0.c(((flm.h) iVar).f136011a), null, skm.d0.UNDISPATCHED, new twb.b0(this, obj2, iVar, null, 19), 1);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ukm.q, ukm.j0
    public final boolean close(Throwable th10) {
        ReentrantLock reentrantLock = this.f280804n;
        reentrantLock.lock();
        try {
            Iterator it8 = ((Iterable) this.o).iterator();
            while (it8.hasNext()) {
                ((q) it8.next()).close(th10);
            }
            Iterable iterable = (Iterable) this.o;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((q) obj2).x()) {
                    arrayList.add(obj2);
                }
            }
            this.o = arrayList;
            boolean zN = n(th10, false);
            reentrantLock.unlock();
            return zN;
        } catch (Throwable th11) {
            reentrantLock.unlock();
            throw th11;
        }
    }

    @Override // ukm.q, ukm.j0
    public final boolean isClosedForSend() {
        ReentrantLock reentrantLock = this.f280804n;
        reentrantLock.lock();
        try {
            return super.isClosedForSend();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ukm.q
    public final boolean m(Throwable th10) {
        ReentrantLock reentrantLock = this.f280804n;
        reentrantLock.lock();
        try {
            Iterator it8 = ((Iterable) this.o).iterator();
            while (it8.hasNext()) {
                ((q) it8.next()).m(th10);
            }
            this.f280805p = e.f280807a;
            boolean zM = super.m(th10);
            reentrantLock.unlock();
            return zM;
        } catch (Throwable th11) {
            reentrantLock.unlock();
            throw th11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0077 -> B:30:0x007a). Please report as a decompilation issue!!! */
    @Override // ukm.q, ukm.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object send(java.lang.Object r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ukm.c
            if (r0 == 0) goto L13
            r0 = r8
            ukm.c r0 = (ukm.c) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ukm.c r0 = new ukm.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f280800x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.Iterator r7 = r0.f280799w
            java.lang.Object r2 = r0.v
            ukm.d r4 = r0.u
            yhm.o.b(r8)
            goto L7a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.f280804n
            r8.lock()
            boolean r2 = r6.isClosedForSend()     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L93
            int r2 = r6.f280803m     // Catch: java.lang.Throwable -> L4b
            r4 = -1
            if (r2 != r4) goto L4d
            r6.f280805p = r7     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r7 = move-exception
            goto L98
        L4d:
            java.lang.Object r2 = r6.o     // Catch: java.lang.Throwable -> L4b
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r8
            r8 = r7
            r7 = r4
            r4 = r6
        L5c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r7.next()
            ukm.q r2 = (ukm.q) r2
            r0.u = r4
            r0.v = r8
            r0.f280799w = r7
            r0.z = r3
            java.lang.Object r2 = r2.N(r8, r0)
            if (r2 != r1) goto L77
            return r1
        L77:
            r5 = r2
            r2 = r8
            r8 = r5
        L7a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L8e
            boolean r8 = r4.isClosedForSend()
            if (r8 != 0) goto L89
            goto L8e
        L89:
            java.lang.Throwable r7 = r4.u()
            throw r7
        L8e:
            r8 = r2
            goto L5c
        L90:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L93:
            java.lang.Throwable r7 = r6.u()     // Catch: java.lang.Throwable -> L4b
            throw r7     // Catch: java.lang.Throwable -> L4b
        L98:
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.d.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ukm.q
    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f280805p != e.f280807a ? com.revolut.data.database.models.openbanking.d.t(new StringBuilder("CONFLATED_ELEMENT="), this.f280805p, "; ") : "");
        sb6.append("BROADCAST=<");
        sb6.append(super.toString());
        sb6.append(">; SUBSCRIBERS=");
        sb6.append(zhm.d0.k0((Iterable) this.o, ";", "<", ">", 0, null, 56));
        return sb6.toString();
    }

    @Override // ukm.q, ukm.j0
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public final Object mo3647trySendJP2dKIU(Object obj2) {
        ReentrantLock reentrantLock = this.f280804n;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                return super.mo3647trySendJP2dKIU(obj2);
            }
            Iterable iterable = (Iterable) this.o;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    if (((q) it8.next()).O()) {
                        z.Companion.getClass();
                        return z.f280842b;
                    }
                }
            }
            if (this.f280803m == -1) {
                this.f280805p = obj2;
            }
            Iterator it9 = ((Iterable) this.o).iterator();
            while (it9.hasNext()) {
                ((q) it9.next()).mo3647trySendJP2dKIU(obj2);
            }
            x xVar = z.Companion;
            Unit unit = Unit.f186387a;
            xVar.getClass();
            return unit;
        } finally {
            reentrantLock.unlock();
        }
    }
}
