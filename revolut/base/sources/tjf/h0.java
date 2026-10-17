package tjf;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.fc;
import tof.i7;
import tof.l9;
import tof.t0;
import tof.v6;
import tof.xa;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 implements z87.d {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f271660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f271661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o97.r f271662c;

    public h0(l0 transactionSearchSourceDelegate) {
        Intrinsics.checkNotNullParameter(transactionSearchSourceDelegate, "transactionSearchSourceDelegate");
        this.f271660a = transactionSearchSourceDelegate;
        i7 i7VarA = fc.a(fc.b(new l9(t0.SUSPICIOUS)), new xa(io3.l.SAVINGS));
        i7.c cVar = i7.Companion;
        v6[] v6VarArr = {v6.PENDING, v6.REVERTED, v6.COMPLETED, v6.DECLINED};
        cVar.getClass();
        this.f271661b = fc.a(i7VarA, i7.c.c(v6VarArr));
        this.f271662c = o97.r.VAULTS_RECENT_TRANSACTIONS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r rVarSwitchMap = this.f271660a.g(false, io3.l.SAVINGS, io3.i.INTERNAL).switchMap(new tid.a(new t8e.c(this, searchQuery, 25), 23));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return ue0.e.H(rVarSwitchMap, zhm.h0.f322473a, new e0(this, 0));
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f271662c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r4, o97.y r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof tjf.g0
            if (r4 == 0) goto L13
            r4 = r6
            tjf.g0 r4 = (tjf.g0) r4
            int r0 = r4.f271658w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f271658w = r0
            goto L1a
        L13:
            tjf.g0 r4 = new tjf.g0
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f271658w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            tjf.l0 r6 = r3.f271660a
            java.lang.Object r5 = r5.f223136b
            ufm.b r5 = r6.h(r5)
            r4.f271658w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L45
            return r0
        L45:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tjf.h0.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
