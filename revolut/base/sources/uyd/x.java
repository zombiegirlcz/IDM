package uyd;

import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import com.revolut.feature.statements.api.models.StatementContent;
import com.revolut.feature.statements.api.models.StatementUrlState;
import ip0.v7;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f284251b;

    public /* synthetic */ x(h0 h0Var, int i) {
        this.f284250a = i;
        this.f284251b = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f284250a) {
            case 0:
                j0 params = (j0) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (StatementUrlState) v7.r("STATEMENT_TAX_FILING_CONTENT_KEY", h0.o(params), this.f284251b.f284190c);
            case 1:
                k0 params2 = (k0) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (StatementUrlState) v7.r("TAX_INVOICE_CONTENT_KEY", params2.f284217a, this.f284251b.f284190c);
            case 2:
                u params3 = (u) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (ProductStatementPeriods) v7.r("STATEMENT_PERIOD_CONTENT_KEY", h0.m(params3), this.f284251b.f284190c);
            case 3:
                a params4 = (a) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                return (StatementUrlState) v7.r("ACCOUNT_CONFIRMATION_KEY_", h0.a(params4), this.f284251b.f284190c);
            case 4:
                b params5 = (b) obj2;
                Intrinsics.checkNotNullParameter(params5, "params");
                return (StatementUrlState) v7.r("ANNUAL_FEE_STATEMENT_KEY_", h0.b(params5), this.f284251b.f284190c);
            case 5:
                o params6 = (o) obj2;
                Intrinsics.checkNotNullParameter(params6, "params");
                return (StatementUrlState) v7.r("PURPOSE_DECLARATION_STATEMENT_KEY_", com.google.android.gms.internal.mlkit_vision_face.a.o(params6.f284232a, "_", params6.f284233b), this.f284251b.f284190c);
            case 6:
                oyd.q it8 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f284251b.f284189b.a(it8);
            case 7:
                e params7 = (e) obj2;
                Intrinsics.checkNotNullParameter(params7, "params");
                return (StatementUrlState) v7.r("BANK_ID_SUMMARISED_REPORT_CACHE_KEY_", h0.d(params7), this.f284251b.f284190c);
            case 8:
                e params8 = (e) obj2;
                Intrinsics.checkNotNullParameter(params8, "params");
                return (StatementUrlState) v7.r("BANK_ID_DETAILED_REPORT_CACHE_KEY_", h0.d(params8), this.f284251b.f284190c);
            case 9:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (StatementContent) this.f284251b.f284190c.get("STATEMENT_CONTENT_KEY");
            case 10:
                g params9 = (g) obj2;
                Intrinsics.checkNotNullParameter(params9, "params");
                return (StatementUrlState) v7.r("STATEMENT_CONTENT_KEY", h0.e(params9), this.f284251b.f284190c);
            case 11:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                s sVar = (s) this.f284251b.d.T2("STATEMENT_CONTENT_KEY", s.class);
                if (sVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(sVar, "<this>");
                return new StatementContent(sVar.getPhone(), sVar.getCompanyInfo(), sVar.getCryptoInfo(), sVar.getLegalInfo(), sVar.getCustomersNumber());
            case 12:
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                return (oyd.u) v7.r("TopUpConfirmation", id10, this.f284251b.f284190c);
            case 13:
                oyd.q it9 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f284251b.f284189b.a(it9);
            case 14:
                j params10 = (j) obj2;
                Intrinsics.checkNotNullParameter(params10, "params");
                return (List) this.f284251b.f284190c.get(h0.r(params10, "AvailableFinancialSummaryYears"));
            case 15:
                j params11 = (j) obj2;
                Intrinsics.checkNotNullParameter(params11, "params");
                ue0.c cVar = this.f284251b.d;
                String strR = h0.r(params11, "available-financial-summary-years");
                Type AVAILABLE_YEARS_TYPE = h0.G;
                Intrinsics.checkNotNullExpressionValue(AVAILABLE_YEARS_TYPE, "AVAILABLE_YEARS_TYPE");
                qyd.a aVar = (qyd.a) cVar.T2(strR, AVAILABLE_YEARS_TYPE);
                if (aVar != null) {
                    return aVar.getYears();
                }
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) this.f284251b.f284190c.get("AvailableIncomeTaxYears");
            case 17:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                ue0.c cVar2 = this.f284251b.d;
                Type AVAILABLE_YEARS_TYPE2 = h0.G;
                Intrinsics.checkNotNullExpressionValue(AVAILABLE_YEARS_TYPE2, "AVAILABLE_YEARS_TYPE");
                qyd.a aVar2 = (qyd.a) cVar2.T2("available-income-tax-years", AVAILABLE_YEARS_TYPE2);
                if (aVar2 != null) {
                    return aVar2.getYears();
                }
                return null;
            case 18:
                oyd.q it10 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return this.f284251b.f284189b.a(it10);
            case 19:
                oyd.q it11 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return this.f284251b.f284189b.a(it11);
            case 20:
                oyd.q statementOfFeesDto = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(statementOfFeesDto, "statementOfFeesDto");
                return this.f284251b.f284189b.a(statementOfFeesDto);
            case 21:
                oyd.q it12 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return this.f284251b.f284189b.a(it12);
            case 22:
                oyd.q it13 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return this.f284251b.f284189b.a(it13);
            case 23:
                oyd.q it14 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return this.f284251b.f284189b.a(it14);
            case 24:
                oyd.q it15 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return this.f284251b.f284189b.a(it15);
            case 25:
                oyd.q it16 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return this.f284251b.f284189b.a(it16);
            case 26:
                oyd.q it17 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return this.f284251b.f284189b.a(it17);
            case 27:
                oyd.q it18 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return this.f284251b.f284189b.a(it18);
            case 28:
                oyd.q it19 = (oyd.q) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return this.f284251b.f284189b.a(it19);
            default:
                h params12 = (h) obj2;
                Intrinsics.checkNotNullParameter(params12, "params");
                return (StatementUrlState) v7.r("STATEMENT_CONTENT_KEY", h0.f(params12), this.f284251b.f284190c);
        }
    }
}
