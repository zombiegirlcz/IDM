package ui9;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ud3.f0;
import ueg.p0;
import vkm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f280363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej9.c f280364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xh9.a f280365c;
    public final al4.p d;
    public final y45.h e;
    public final l f;

    public z(t crossSellSelectorInteractor, ej9.c crossSellStateRepository, xh9.a payLaterInteractor, al4.p creditCardProductFeatureTogglesInteractor, y45.h loanProductFeatureTogglesInteractor, l crossSellConfiguratorInteractor) {
        Intrinsics.checkNotNullParameter(crossSellSelectorInteractor, "crossSellSelectorInteractor");
        Intrinsics.checkNotNullParameter(crossSellStateRepository, "crossSellStateRepository");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(crossSellConfiguratorInteractor, "crossSellConfiguratorInteractor");
        this.f280363a = crossSellSelectorInteractor;
        this.f280364b = crossSellStateRepository;
        this.f280365c = payLaterInteractor;
        this.d = creditCardProductFeatureTogglesInteractor;
        this.e = loanProductFeatureTogglesInteractor;
        this.f = crossSellConfiguratorInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[PHI: r4 r10
      0x0042: PHI (r4v1 java.util.Iterator) = (r4v0 java.util.Iterator), (r4v2 java.util.Iterator) binds: [B:14:0x0036, B:30:0x00b3] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r10v4 int) = (r10v3 int), (r10v5 int) binds: [B:14:0x0036, B:30:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00aa -> B:29:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ui9.z r9, java.util.List r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof ui9.y
            if (r0 == 0) goto L13
            r0 = r11
            ui9.y r0 = (ui9.y) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ui9.y r0 = new ui9.y
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f280361x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r10 = r0.f280360w
            java.lang.Object r2 = r0.v
            java.util.Iterator r4 = r0.u
            yhm.o.b(r11)
            goto Lad
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            yhm.o.b(r11)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
            r4 = r10
            r10 = r11
        L42:
            boolean r11 = r4.hasNext()
            r2 = 0
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r4.next()
            r5 = r11
            wi9.g r5 = (wi9.g) r5
            r0.u = r4
            r0.v = r11
            r0.f280360w = r10
            r0.z = r3
            wi9.b r5 = r5.f297868a
            int[] r6 = ui9.u.f280350b
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r3) goto L83
            r6 = 2
            if (r5 != r6) goto L7d
            y45.h r5 = r9.e
            grl.r2 r6 = grl.r2.UNRECOGNIZED
            qx4.f r5 = (qx4.f) r5
            kotlinx.coroutines.flow.Flow r5 = r5.e(r6)
            ueg.p0 r6 = new ueg.p0
            r7 = 23
            r6.<init>(r7)
            akg.n r5 = nim.a.v(r5, r6)
            goto L98
        L7d:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L83:
            al4.p r5 = r9.d
            grl.r2 r6 = grl.r2.UNRECOGNIZED
            om4.b r5 = (om4.b) r5
            kotlinx.coroutines.flow.Flow r5 = r5.e(r6)
            ueg.p0 r6 = new ueg.p0
            r7 = 22
            r6.<init>(r7)
            akg.n r5 = nim.a.v(r5, r6)
        L98:
            ud3.f0 r6 = new ud3.f0
            r7 = 27
            r6.<init>(r7)
            jhi.b r2 = mo3.a.g(r5, r2, r6, r3)
            java.lang.Object r2 = vkm.q.x(r2, r0)
            if (r2 != r1) goto Laa
            return r1
        Laa:
            r8 = r2
            r2 = r11
            r11 = r8
        Lad:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L42
        Lb5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ui9.z.a(ui9.z, java.util.List, gim.c):java.lang.Object");
    }

    public final wkm.l b(ai9.h slot) {
        Intrinsics.checkNotNullParameter(slot, "slot");
        Continuation continuation = null;
        return vkm.q.Q(new q0(mo3.a.g(nim.a.v(((ti9.g) this.f280365c).k(w4l.j.f294644c), new p0(21)), null, new f0(26), 1), new l10.m(this, slot, continuation, 26), 1), new sdi.a(continuation, this, slot, 16));
    }
}
