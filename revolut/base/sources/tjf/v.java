package tjf;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.fc;
import tof.i7;
import tof.l9;
import tof.t0;
import tof.xa;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements z87.d {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f271705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f271706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o97.r f271707c;

    public v(l0 transactionSearchSourceDelegate) {
        Intrinsics.checkNotNullParameter(transactionSearchSourceDelegate, "transactionSearchSourceDelegate");
        this.f271705a = transactionSearchSourceDelegate;
        this.f271706b = fc.a(fc.b(new l9(t0.SUSPICIOUS)), new xa(io3.l.CURRENT));
        this.f271707c = o97.r.FIAT_CURRENCIES_RECENT_TRANSACTIONS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r rVarOnErrorReturn = this.f271705a.g(true, io3.l.CURRENT, io3.i.INTERNAL).switchMap(new tid.a(new t8e.c(this, searchQuery, 22), 16)).onErrorReturn(new tid.a(new s(this, 0), 17));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
        return rVarOnErrorReturn;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f271707c;
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
            boolean r4 = r6 instanceof tjf.u
            if (r4 == 0) goto L13
            r4 = r6
            tjf.u r4 = (tjf.u) r4
            int r0 = r4.f271704w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f271704w = r0
            goto L1a
        L13:
            tjf.u r4 = new tjf.u
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f271704w
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
            tjf.l0 r6 = r3.f271705a
            java.lang.Object r5 = r5.f223136b
            ufm.b r5 = r6.h(r5)
            r4.f271704w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L45
            return r0
        L45:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tjf.v.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
