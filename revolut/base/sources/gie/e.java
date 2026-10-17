package gie;

import com.revolut.feature.tab.accounts.api.model.AccountContent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wik.u f144130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g2e.t f144131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f144132n;
    public final j2 o;

    public e(wik.u planWaveAnimationInteractor) {
        Intrinsics.checkNotNullParameter(planWaveAnimationInteractor, "planWaveAnimationInteractor");
        this.f144130l = planWaveAnimationInteractor;
        this.f144131m = new g2e.t(this, 3);
        this.f144132n = vkm.q.b(0, 6, null);
        this.o = vkm.q.c(b.PENDING);
    }

    @Override // yji.n
    public final void H2() {
        f3(b.PENDING);
        yji.n.l2(this, vkm.q.P(this.f144132n, 1), null, new ge7.f(this, null, 6), 3);
    }

    @Override // gie.a
    public final Object Z2(n nVar) {
        int i = c.f144128a[((b) this.o.getValue()).ordinal()];
        boolean z = true;
        if (i == 1) {
            return e3(nVar);
        }
        if (i != 2) {
            z = false;
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // gie.a
    public final void b3() {
        f3(b.PENDING);
    }

    @Override // gie.a
    public final void c3(AccountContent accountContent, AccountContent accountContent2) {
        V2(new g23.q(this, accountContent, accountContent2, null, 18), new yi5.b(29));
    }

    @Override // gie.a
    public final Object d3(n nVar) {
        Object objY = vkm.q.y(this.o, new d4f.m(2, 19, null), nVar);
        return objY == fim.a.COROUTINE_SUSPENDED ? objY : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof gie.d
            if (r0 == 0) goto L13
            r0 = r7
            gie.d r0 = (gie.d) r0
            int r1 = r0.f144129w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f144129w = r1
            goto L18
        L13:
            gie.d r0 = new gie.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f144129w
            r3 = 0
            wik.u r4 = r6.f144130l
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 != r5) goto L2a
            yhm.o.b(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            egk.b r7 = egk.b.HOME
            r0.f144129w = r5
            kjk.t r0 = r4.f297938a
            r0.getClass()
            java.lang.String r2 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            ihm.b r7 = r0.a(r7)
            java.lang.Object r7 = r7.f()
            od0.i r7 = (od0.i) r7
            if (r7 == 0) goto L54
            java.lang.Object r7 = r7.f224257a
            hgk.a r7 = (hgk.a) r7
            goto L55
        L54:
            r7 = r3
        L55:
            if (r7 != r1) goto L58
            return r1
        L58:
            hgk.a r7 = (hgk.a) r7
            if (r7 != 0) goto L5f
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L5f:
            r4.getClass()
            vjg.g r0 = r4.f297939b
            java.lang.String r1 = "pendingAnimation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            hha.d r1 = r7.f152189b
            hha.w0 r1 = hha.s.f(r1)
            java.lang.String r1 = vc.o.e(r1)
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r1 = r0.a(r1)
            if (r1 != 0) goto L7a
            goto La0
        L7a:
            ekg.g r2 = r4.f297940c
            com.revolut.feature.uipersonalisation.api.models.AppTheme r2 = r2.j()
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r2 = r2.f94561a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r2, r1)
            if (r1 != 0) goto L89
            goto La0
        L89:
            hgk.b r1 = new hgk.b
            hha.d r7 = r7.f152188a
            hha.w0 r7 = hha.s.f(r7)
            java.lang.String r7 = vc.o.e(r7)
            com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration r7 = r0.a(r7)
            if (r7 != 0) goto L9c
            goto La0
        L9c:
            r1.<init>(r7)
            r3 = r1
        La0:
            if (r3 == 0) goto La3
            goto La4
        La3:
            r5 = 0
        La4:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gie.e.e3(gim.c):java.lang.Object");
    }

    public final void f3(b bVar) {
        int i = c.f144128a[bVar.ordinal()];
        if (i != 1 && i != 2) {
            wik.u uVar = this.f144130l;
            if (i == 3) {
                uVar.b();
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                uVar.a(egk.b.HOME);
            }
        }
        j2 j2Var = this.o;
        j2Var.getClass();
        j2Var.g(null, bVar);
    }
}
