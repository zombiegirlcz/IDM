package yw9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vkm.z1;
import zlg.r;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends oki.h implements g {
    public final ang.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e60.a f317383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cpa.a f317384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qw9.f f317385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cpg.a f317386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f317387t;
    public final z1 u;

    public w(cli.n stateMapper, ang.f userInteractor, e60.a mediaPickerControllerExtension, cpa.a profileAvatarEncoder, qw9.f suggestionsInteractor, cpg.a usernameInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(profileAvatarEncoder, "profileAvatarEncoder");
        Intrinsics.checkNotNullParameter(suggestionsInteractor, "suggestionsInteractor");
        Intrinsics.checkNotNullParameter(usernameInteractor, "usernameInteractor");
        this.o = userInteractor;
        this.f317383p = mediaPickerControllerExtension;
        this.f317384q = profileAvatarEncoder;
        this.f317385r = suggestionsInteractor;
        this.f317386s = usernameInteractor;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f317387t = mra.d.b(this, new e("", new dpg.a(r.i.f323273a, ""), null, null, null), stateMapper, null, false, 12);
        this.u = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(yw9.w r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof yw9.v
            if (r0 == 0) goto L13
            r0 = r6
            yw9.v r0 = (yw9.v) r0
            int r1 = r0.f317382x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317382x = r1
            goto L18
        L13:
            yw9.v r0 = new yw9.v
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317382x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            cpg.a r4 = r4.f317386s
            r0.u = r5
            r0.f317382x = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            zlg.r r6 = (zlg.r) r6
            dpg.a r4 = new dpg.a
            r4.<init>(r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yw9.w.I2(yw9.w, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(m70.a.g(this.o.k(true), null, new j(0), 1)), null, null, new o(this, continuation, 0), 3);
        hw9.d dVar = this.f317385r.f249842a;
        dVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, mo3.a.g(dVar.f156111c.b(Unit.f186387a, loadingStrategy), null, new j(1), 1), null, null, new o(this, continuation, 1), 3);
        p pVar = new p(this, continuation, 0);
        z1 z1Var = this.u;
        yji.l.a1(this, vkm.q.H(pVar, z1Var), null, null, new o(this, continuation, 2), 3);
        yji.l.a1(this, vkm.q.H(new o(this, continuation, 3), z1Var), null, null, new o(this, continuation, 4), 3);
    }

    public final void J2(String str) {
        H2(this.f317387t, new yui.v(str, 2));
        this.u.k(str);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, rd0.e.b(((e60.s) this.f317383p).f122868g), null, new o(this, null, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f317387t;
    }
}
