package vyi;

import com.revolut.data.model.Data;
import dwi.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vdl.c1;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends jki.g implements jki.h {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f293344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f293345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f293346r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jki.p stateMapper, b0 airportLoungesInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(airportLoungesInteractor, "airportLoungesInteractor");
        this.f293344p = airportLoungesInteractor;
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f293345q = z1VarB;
        this.f293346r = new i(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A2(vyi.r r13, java.lang.String r14, gim.c r15) {
        /*
            boolean r0 = r15 instanceof vyi.q
            if (r0 == 0) goto L13
            r0 = r15
            vyi.q r0 = (vyi.q) r0
            int r1 = r0.f293343w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293343w = r1
            goto L18
        L13:
            vyi.q r0 = new vyi.q
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293343w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L41
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r15)
            dwi.b0 r15 = r13.f293344p
            pfm.r r14 = r15.d(r14)
            r0.f293343w = r3
            java.lang.Object r14 = nim.a.a(r14, r0)
            if (r14 != r1) goto L41
            return r1
        L41:
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_saved_lounges_removed_title
            r15 = 14
            r0 = 0
            r3.<init>(r14, r0, r0, r15)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r4 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r5 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_heart_outline
            int r14 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorWhite
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r14)
            r11 = 0
            r12 = 246(0xf6, float:3.45E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r8 = 108(0x6c, float:1.51E-43)
            java.lang.String r2 = "ID_SAVE_LOUNGE_DIALOG"
            r5 = r4
            r4 = 0
            mii.f r14 = te0.w.a(r2, r3, r4, r5, r6, r7, r8)
            r13.X1(r14)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vyi.r.A2(vyi.r, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(vyi.r r13, java.lang.String r14, gim.c r15) {
        /*
            boolean r0 = r15 instanceof vyi.n
            if (r0 == 0) goto L13
            r0 = r15
            vyi.n r0 = (vyi.n) r0
            int r1 = r0.f293340w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293340w = r1
            goto L18
        L13:
            vyi.n r0 = new vyi.n
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293340w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L41
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r15)
            dwi.b0 r15 = r13.f293344p
            pfm.r r14 = r15.a(r14)
            r0.f293340w = r3
            java.lang.Object r14 = nim.a.a(r14, r0)
            if (r14 != r1) goto L41
            return r1
        L41:
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_saved_lounges_added_title
            r15 = 14
            r0 = 0
            r3.<init>(r14, r0, r0, r15)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r4 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r5 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_heart
            int r14 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorWhite
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r14)
            r11 = 0
            r12 = 246(0xf6, float:3.45E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r8 = 108(0x6c, float:1.51E-43)
            java.lang.String r2 = "ID_SAVE_LOUNGE_DIALOG"
            r5 = r4
            r4 = 0
            mii.f r14 = te0.w.a(r2, r3, r4, r5, r6, r7, r8)
            r13.X1(r14)
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vyi.r.y2(vyi.r, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(vyi.r r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof vyi.o
            if (r0 == 0) goto L13
            r0 = r6
            vyi.o r0 = (vyi.o) r0
            int r1 = r0.f293341w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293341w = r1
            goto L18
        L13:
            vyi.o r0 = new vyi.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293341w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L56
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            dwi.b0 r4 = r4.f293344p
            efm.r r4 = r4.c(r5)
            vv7.l r5 = new vv7.l
            r6 = 15
            r5.<init>(r6)
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r5, r3)
            efm.d0 r4 = r4.firstOrError()
            java.lang.String r5 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.f293341w = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vyi.r.z2(vyi.r, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f293345q, new c1(continuation, this, 28)), null, new p(this, continuation, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(nim.a.w(((w4l.f) ((hwi.c1) this.f293344p.f120411c).e.getValue()).f(Unit.f186387a, false), new vw4.j(25))), null, new p(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f293346r;
    }
}
