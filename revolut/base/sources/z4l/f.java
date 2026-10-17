package z4l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tb4.t;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends koi.i implements g {
    public t e;
    public final e f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j adapter, boolean z) {
        super(adapter, z);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f = new e();
    }

    @Override // z4l.g
    public final void a() {
        t tVar = this.e;
        if (tVar != null) {
            yfm.g.b((xfm.d) tVar.f269457c);
        }
    }

    @Override // koi.i, koi.f
    public final List getItems() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // koi.i, koi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setItems(java.util.List r9) {
        /*
            r8 = this;
            java.lang.String r0 = "items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            tb4.t r0 = r8.e
            if (r0 == 0) goto L17
            java.lang.Object r1 = r0.f269457c
            xfm.d r1 = (xfm.d) r1
            boolean r1 = r1.isDisposed()
            if (r1 != 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L8f
        L17:
            dgm.e r0 = new dgm.e
            r0.<init>()
            tb4.t r1 = new tb4.t
            qfm.b1 r2 = new qfm.b1
            r3 = 0
            r2.<init>(r0, r3)
            long r3 = android.animation.ValueAnimator.getFrameDelay()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            efm.c0 r6 = hhm.f.f152430b
            java.lang.String r7 = "unit is null"
            mfm.f.b(r5, r7)
            java.lang.String r5 = "scheduler is null"
            mfm.f.b(r6, r5)
            qfm.e2 r7 = new qfm.e2
            r7.<init>(r2, r3, r6)
            efm.c0 r2 = hhm.f.f152429a
            int r3 = efm.i.f125385a
            mfm.f.b(r2, r5)
            java.lang.String r4 = "bufferSize"
            mfm.f.e(r3, r4)
            qfm.n1 r5 = new qfm.n1
            r5.<init>(r7, r2, r3)
            z4l.d r2 = new z4l.d
            r3 = 0
            r2.<init>(r8, r3)
            z3e.a r3 = new z3e.a
            r6 = 4
            r3.<init>(r2, r6)
            qfm.j1 r2 = new qfm.j1
            r6 = 0
            r2.<init>(r5, r3, r6)
            efm.c0 r3 = hfm.c.f152030a
            m70.a.p(r3)
            r5 = 1
            mfm.f.e(r5, r4)
            qfm.n1 r4 = new qfm.n1
            r4.<init>(r2, r3, r5)
            z4l.d r2 = new z4l.d
            r3 = 1
            r2.<init>(r8, r3)
            z3e.a r3 = new z3e.a
            r5 = 5
            r3.<init>(r2, r5)
            ch.b r2 = mfm.f.e
            en.a r5 = mfm.f.f205043c
            qfm.e1 r6 = qfm.e1.INSTANCE
            ifm.c r2 = r4.m(r3, r2, r5, r6)
            java.lang.String r3 = "subscribe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            xfm.d r2 = (xfm.d) r2
            r1.<init>(r0, r2)
            r8.e = r1
            r0 = r1
        L8f:
            java.lang.Object r0 = r0.f269456b
            dgm.e r0 = (dgm.e) r0
            r0.onNext(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4l.f.setItems(java.util.List):void");
    }

    @Override // koi.i, koi.f
    public final c getItems() {
        return this.f;
    }
}
