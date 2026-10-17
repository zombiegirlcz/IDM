package uyd;

import com.revolut.feature.statements.api.models.AnnualStatementDateRange;
import com.revolut.feature.statements.api.models.StatementUrlState;
import ip0.v7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f284170b;

    public /* synthetic */ b0(h0 h0Var, int i) {
        this.f284169a = i;
        this.f284170b = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f284169a) {
            case 0:
                q params = (q) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (StatementUrlState) v7.r("RIB_STATEMENT_CONTENT_KEY", params.f284235a, this.f284170b.f284190c);
            case 1:
                f params2 = (f) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (StatementUrlState) v7.r("CONTRACT_SUMMARY_CONTENT_KEY", params2.f284179a.name(), this.f284170b.f284190c);
            case 2:
                p params3 = (p) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (StatementUrlState) v7.r("REQUEST_ID_STATEMENT_CONTENT_KEY", params3.f284234a, this.f284170b.f284190c);
            case 3:
                oyd.q it8 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f284170b.f284189b.a(it8);
            case 4:
                n params4 = (n) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                return (StatementUrlState) v7.r("STATEMENT_CONTENT_KEY", h0.j(params4), this.f284170b.f284190c);
            case 5:
                k params5 = (k) obj2;
                Intrinsics.checkNotNullParameter(params5, "params");
                return (StatementUrlState) v7.r("STATEMENT_CONTENT_KEY", h0.h(params5), this.f284170b.f284190c);
            case 6:
                m params6 = (m) obj2;
                Intrinsics.checkNotNullParameter(params6, "params");
                return (StatementUrlState) v7.r("STATEMENT_CONTENT_KEY", h0.i(params6), this.f284170b.f284190c);
            case 7:
                r params7 = (r) obj2;
                Intrinsics.checkNotNullParameter(params7, "params");
                return (StatementUrlState) v7.r("STATEMENT_CONTENT_KEY", h0.k(params7), this.f284170b.f284190c);
            case 8:
                m0 params8 = (m0) obj2;
                Intrinsics.checkNotNullParameter(params8, "params");
                return (StatementUrlState) v7.r("STATEMENT_CONTENT_KEY", h0.p(params8), this.f284170b.f284190c);
            case 9:
                i params9 = (i) obj2;
                Intrinsics.checkNotNullParameter(params9, "params");
                return (StatementUrlState) v7.r("STATEMENT_CONTENT_KEY", h0.g(params9), this.f284170b.f284190c);
            case 10:
                l params10 = (l) obj2;
                Intrinsics.checkNotNullParameter(params10, "params");
                return (StatementUrlState) this.f284170b.f284190c.get("INCOME_TAX_STATEMENT_CONTENT_KEY_" + params10.f284218a);
            case 11:
                l0 params11 = (l0) obj2;
                Intrinsics.checkNotNullParameter(params11, "params");
                return (StatementUrlState) v7.r("CONFIRMATION_CONTENT_KEY", params11.f284220a, this.f284170b.f284190c);
            case 12:
                c params12 = (c) obj2;
                Intrinsics.checkNotNullParameter(params12, "params");
                return (StatementUrlState) v7.r("STATEMENT_CONTENT_KEY", h0.c(params12), this.f284170b.f284190c);
            case 13:
                d params13 = (d) obj2;
                Intrinsics.checkNotNullParameter(params13, "params");
                return (AnnualStatementDateRange) this.f284170b.f284190c.get(h0.q(params13, "ANNUAL_RANGE"));
            case 14:
                oyd.q it9 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f284170b.f284189b.a(it9);
            case 15:
                d params14 = (d) obj2;
                Intrinsics.checkNotNullParameter(params14, "params");
                ue0.c cVar = this.f284170b.d;
                String strQ = h0.q(params14, "ANNUAL_RANGE_FROM");
                Class cls = Integer.TYPE;
                Integer num = (Integer) cVar.T2(strQ, cls);
                Integer num2 = (Integer) cVar.T2(h0.q(params14, "ANNUAL_RANGE_TO"), cls);
                if (num == null || num2 == null) {
                    return null;
                }
                return new AnnualStatementDateRange(num.intValue(), num2.intValue());
            case 16:
                t params15 = (t) obj2;
                Intrinsics.checkNotNullParameter(params15, "params");
                return (StatementUrlState) v7.r("STATEMENT_CONTENT_KEY", h0.l(params15), this.f284170b.f284190c);
            default:
                i0 params16 = (i0) obj2;
                Intrinsics.checkNotNullParameter(params16, "params");
                return (StatementUrlState) v7.r("STATEMENT_TAX_CERTIFICATE_CONTENT_KEY", h0.n(params16), this.f284170b.f284190c);
        }
    }
}
