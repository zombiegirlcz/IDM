package p0l;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends jki.g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r60.b f231570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f231571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lyk.a f231572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f231573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0l.a f231574t;
    public final e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r60.b promptViewControllerExtension, j60.a bottomExpandableDialogControllerExtension, lyk.a spouseConsentInteractor, ang.f userInteractor, o0l.a dialogsFactory, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(spouseConsentInteractor, "spouseConsentInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f231570p = promptViewControllerExtension;
        this.f231571q = bottomExpandableDialogControllerExtension;
        this.f231572r = spouseConsentInteractor;
        this.f231573s = userInteractor;
        this.f231574t = dialogsFactory;
        this.u = new e(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(p0l.v r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof p0l.m
            if (r0 == 0) goto L14
            r0 = r9
            p0l.m r0 = (p0l.m) r0
            int r1 = r0.f231562w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f231562w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            p0l.m r0 = new p0l.m
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f231562w
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r9)
            r1 = r8
            goto L56
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r9)
            iuf.y r4 = new iuf.y
            r9 = 17
            r4.<init>(r8, r9)
            lic.a r3 = new lic.a
            r9 = 8
            r3.<init>(r8, r9)
            p0l.l r5 = new p0l.l
            r9 = 0
            r1 = 1
            r5.<init>(r8, r9, r1)
            r6.f231562w = r2
            r2 = 0
            r7 = 1
            r1 = r8
            java.lang.Object r9 = n14.k.V(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L56
            return r0
        L56:
            nii.h r9 = (nii.h) r9
            boolean r8 = r9 instanceof nii.g
            if (r8 == 0) goto L61
            p0l.f$a r8 = p0l.f.a.f231554a
            r1.v2(r8)
        L61:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p0l.v.y2(p0l.v, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        r60.d dVar = (r60.d) this.f231570p;
        efm.r rVarB = dVar.d.b();
        p0 p0Var = dVar.d;
        vkm.d dVarB = rd0.e.b(te0.w.B0(rVarB, p0Var.e()));
        Continuation continuation = null;
        yji.l.a1(this, dVarB, null, null, new s(this, null), 3);
        yji.l.a1(this, rd0.e.b(p0Var.d()), new o(this, continuation, 2), null, new u(this, null), 2);
        yji.l.a1(this, rd0.e.b(this.f231572r.f200849a.d.f(Unit.f186387a, false)), null, null, new o(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(this.f231573s.k(false)), null, null, new o(this, continuation, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }
}
