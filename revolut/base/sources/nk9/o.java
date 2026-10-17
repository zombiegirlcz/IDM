package nk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi9.e0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends jki.g implements h {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh9.a f216768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f216769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0 f216770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qi9.d f216771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f216772t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(j60.a bottomExpandableDialogControllerExtension, jki.p stateMapper, qi9.d payLaterNavigationCommandFactory, e0 payLaterStateDialogMapper, xh9.a payLaterInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(payLaterStateDialogMapper, "payLaterStateDialogMapper");
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f216768p = payLaterInteractor;
        this.f216769q = bottomExpandableDialogControllerExtension;
        this.f216770r = payLaterStateDialogMapper;
        this.f216771s = payLaterNavigationCommandFactory;
        this.f216772t = new g(new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(nk9.o r5, gim.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof nk9.k
            if (r0 == 0) goto L16
            r0 = r6
            nk9.k r0 = (nk9.k) r0
            int r1 = r0.f216764w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f216764w = r1
            goto L1b
        L16:
            nk9.k r0 = new nk9.k
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f216764w
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
            xh9.a r5 = r5.f216768p
            w4l.h r6 = w4l.h.f294642c
            ti9.g r5 = (ti9.g) r5
            cxe.u r5 = r5.k(r6)
            nij.d r6 = new nij.d
            r2 = 26
            r6.<init>(r2)
            jhi.b r5 = mo3.a.g(r5, r3, r6, r4)
            r0.f216764w = r4
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
        throw new UnsupportedOperationException("Method not decompiled: nk9.o.y2(nk9.o, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(ue0.e.p(nim.a.w(((ti9.g) this.f216768p).i(), new njf.d(17)), h0.f322473a)), null, null, new naf.j(this, null, 26), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f216772t;
    }
}
