package blm;

import kotlin.jvm.internal.Intrinsics;
import ukm.q;
import ukm.y;
import vc.s;

/* JADX INFO: loaded from: classes14.dex */
public final class i implements dom.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f16756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f16757c;

    public i(int i, ukm.f fVar, long j2) {
        this.f16755a = j2;
        this.f16757c = s.a(i == 0 ? 1 : i, fVar, null, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof blm.h
            if (r0 == 0) goto L13
            r0 = r5
            blm.h r0 = (blm.h) r0
            int r1 = r0.f16754w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16754w = r1
            goto L18
        L13:
            blm.h r0 = new blm.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f16754w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)
            ukm.z r5 = (ukm.z) r5
            java.lang.Object r5 = r5.f280843a
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            r0.f16754w = r3
            ukm.q r5 = r4.f16757c
            r5.getClass()
            java.lang.Object r5 = ukm.q.J(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.Throwable r0 = ukm.z.a(r5)
            if (r0 != 0) goto L50
            boolean r0 = r5 instanceof ukm.y
            if (r0 == 0) goto L4f
            r5 = 0
        L4f:
            return r5
        L50:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: blm.i.a(gim.c):java.lang.Object");
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        this.f16756b = bVar;
        if (bVar != null) {
            bVar.a(this.f16755a);
        } else {
            Intrinsics.r("subscription");
            throw null;
        }
    }

    @Override // dom.a
    public final void onComplete() {
        this.f16757c.close(null);
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f16757c.n(th10, false);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        q qVar = this.f16757c;
        if (qVar.mo3647trySendJP2dKIU(obj2) instanceof y) {
            throw new IllegalArgumentException(("Element " + obj2 + " was not added to channel because it was full, " + qVar).toString());
        }
    }
}
