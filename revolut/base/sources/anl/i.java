package anl;

import akb.s;
import com.revolut.data.model.Data;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import rqk.k;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uil.a f7816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f7817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f7818r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, uil.a revolutAccountsManager, k revolutSsoDependenciesProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revolutAccountsManager, "revolutAccountsManager");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        this.f7816p = revolutAccountsManager;
        this.f7817q = revolutSsoDependenciesProvider;
        this.f7818r = new c(new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(anl.i r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof anl.h
            if (r0 == 0) goto L13
            r0 = r5
            anl.h r0 = (anl.h) r0
            int r1 = r0.f7815w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7815w = r1
            goto L18
        L13:
            anl.h r0 = new anl.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f7815w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            uil.a r5 = r4.f7816p
            rqk.k r2 = r4.f7817q
            r2.getClass()
            cjl.b r2 = cjl.b.RETAIL
            r0.f7815w = r3
            pjl.z0 r5 = (pjl.z0) r5
            java.lang.Object r5 = r5.i(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.util.List r5 = (java.util.List) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L54
            anl.e$b r5 = anl.e.b.f7811a
            r4.v2(r5)
            goto L5e
        L54:
            a26.j r0 = new a26.j
            r1 = 13
            r0.<init>(r5, r1)
            r4.x2(r0)
        L5e:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: anl.i.y2(anl.i, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new s(this, null, 9), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f7818r;
    }
}
