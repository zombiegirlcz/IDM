package pzd;

import com.revolut.feature.statements.api.StatementsMode;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zxd.c f240965a;

    public g(zxd.c statementsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f240965a = statementsInteractor;
    }

    public static io3.h b(StatementsMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (mode instanceof StatementsMode.Consolidated) {
            return new i0e.a(StatementPeriodType.TAX_YEAR, null);
        }
        if (mode instanceof StatementsMode.TaxCertificate) {
            StatementPeriodType statementPeriodType = StatementPeriodType.TAX_YEAR;
            return new i0e.b(y0.b(statementPeriodType), null, statementPeriodType, 2);
        }
        if (mode instanceof StatementsMode.TaxFiling) {
            StatementPeriodType statementPeriodType2 = StatementPeriodType.TAX_YEAR;
            return new i0e.b(y0.b(statementPeriodType2), null, statementPeriodType2, 2);
        }
        if (!Intrinsics.f(mode, StatementsMode.BankIDAnnualStatements.f88212a)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException(mode + " not supported");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof pzd.f
            if (r0 == 0) goto L13
            r0 = r5
            pzd.f r0 = (pzd.f) r0
            int r1 = r0.f240964w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240964w = r1
            goto L18
        L13:
            pzd.f r0 = new pzd.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240964w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            zxd.c r5 = r4.f240965a
            ryd.w r5 = (ryd.w) r5
            ufm.i r5 = r5.d()
            r0.f240964w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pzd.g.a(gim.c):java.lang.Object");
    }
}
