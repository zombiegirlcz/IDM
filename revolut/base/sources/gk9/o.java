package gk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi9.e0;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends jki.g implements i {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f144362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xh9.a f144363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0 f144364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qi9.d f144365s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f144366t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j60.a bottomExpandableDialogControllerExtension, jki.p stateMapper, qi9.d payLaterNavigationCommandFactory, e0 payLaterStateDialogMapper, xh9.a payLaterInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterStateDialogMapper, "payLaterStateDialogMapper");
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f144362p = bottomExpandableDialogControllerExtension;
        this.f144363q = payLaterInteractor;
        this.f144364r = payLaterStateDialogMapper;
        this.f144365s = payLaterNavigationCommandFactory;
        this.f144366t = new h(new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(gk9.o r5, gim.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof gk9.l
            if (r0 == 0) goto L16
            r0 = r6
            gk9.l r0 = (gk9.l) r0
            int r1 = r0.f144360w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f144360w = r1
            goto L1b
        L16:
            gk9.l r0 = new gk9.l
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f144360w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r6)
            goto L54
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            xh9.a r5 = r5.f144363q
            w4l.h r6 = w4l.h.f294642c
            ti9.g r5 = (ti9.g) r5
            cxe.u r5 = r5.k(r6)
            gcc.c r6 = new gcc.c
            r2 = 19
            r6.<init>(r2)
            jhi.b r5 = mo3.a.g(r5, r3, r6, r4)
            r0.f144360w = r4
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            od0.i r6 = (od0.i) r6
            java.lang.Object r5 = r6.f224257a
            zh9.i0 r5 = (zh9.i0) r5
            if (r5 == 0) goto L61
            zh9.a r5 = cj9.c.Y(r5)
            return r5
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gk9.o.y2(gk9.o, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        ti9.g gVar = (ti9.g) this.f144363q;
        yji.l.a1(this, rd0.e.n(nim.a.v(u0.m(nim.a.v(gVar.k(w4l.h.f294642c), new gk7.a(2)), rd0.e.b(gVar.n())), new gk7.a(3)), h0.f322473a), null, null, new gii.b(this, null, 4), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f144366t;
    }
}
