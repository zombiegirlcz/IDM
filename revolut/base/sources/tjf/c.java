package tjf;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.cc;
import tof.fc;
import tof.i7;
import tof.l9;
import tof.na;
import tof.t0;
import tof.xa;
import tof.y6;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements z87.d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f271640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.p f271641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y45.h f271642c;
    public final o97.r d;
    public final na e;
    public final i7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cc f271643g;

    public c(al4.p creditCardProductFeatureTogglesInteractor, l0 transactionSearchSourceDelegate, y45.h loanProductFeatureTogglesInteractor) {
        Intrinsics.checkNotNullParameter(transactionSearchSourceDelegate, "transactionSearchSourceDelegate");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(loanProductFeatureTogglesInteractor, "loanProductFeatureTogglesInteractor");
        this.f271640a = transactionSearchSourceDelegate;
        this.f271641b = creditCardProductFeatureTogglesInteractor;
        this.f271642c = loanProductFeatureTogglesInteractor;
        this.d = o97.r.CREDIT_PAYMENTS;
        this.e = fc.b(new l9(t0.SUSPICIOUS));
        i7.c cVar = i7.Companion;
        y6[] y6VarArr = {y6.TRANSFER};
        cVar.getClass();
        this.f = fc.a(i7.c.d(y6VarArr), new xa(io3.l.CREDIT));
        this.f271643g = i7.c.d(y6.LOAN, y6.LOAN_PAYOFF, y6.LOAN_PAYMENT);
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        cxe.u uVarJ = ((qx4.f) this.f271641b).j();
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        return pd.b.r(nim.a.w(kli.a.h(rd0.e.c(uVarJ, gVar), rd0.e.c(this.f271642c.j(), gVar)), new tif.g(8)), new t8e.c(this, searchQuery, 20));
    }

    @Override // z87.f
    public final o97.r h() {
        return this.d;
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
            boolean r4 = r6 instanceof tjf.b
            if (r4 == 0) goto L13
            r4 = r6
            tjf.b r4 = (tjf.b) r4
            int r0 = r4.f271639w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f271639w = r0
            goto L1a
        L13:
            tjf.b r4 = new tjf.b
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f271639w
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
            tjf.l0 r6 = r3.f271640a
            java.lang.Object r5 = r5.f223136b
            ufm.b r5 = r6.h(r5)
            r4.f271639w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L45
            return r0
        L45:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tjf.c.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
