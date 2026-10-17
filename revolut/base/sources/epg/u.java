package epg;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends jki.g implements o {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cpg.a f128194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f128195q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f128196r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(jki.p stateMapper, cpg.a usernameInteractor, j60.a bottomDialog) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(usernameInteractor, "usernameInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f128194p = usernameInteractor;
        this.f128195q = bottomDialog;
        this.f128196r = new l("", "", new zlg.n(1, f0.f322471a), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(epg.u r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof epg.t
            if (r0 == 0) goto L13
            r0 = r6
            epg.t r0 = (epg.t) r0
            int r1 = r0.f128193x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128193x = r1
            goto L18
        L13:
            epg.t r0 = new epg.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128193x
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
            cpg.a r4 = r4.f128194p
            r0.u = r5
            r0.f128193x = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            zlg.r r6 = (zlg.r) r6
            dpg.a r4 = new dpg.a
            r4.<init>(r6, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: epg.u.y2(epg.u, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new eif.j(this, continuation, 19), new yi5.b(26));
        yji.l.a1(this, t1.d(vkm.q.q(new dfj.f(q2(), 15)), 500L), null, null, new eif.j(this, continuation, 20), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f128196r;
    }
}
