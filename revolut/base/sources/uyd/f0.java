package uyd;

import com.revolut.feature.statements.api.models.CustomStatementAccountPeriods;
import com.revolut.feature.statements.api.models.CustomStatementData;
import com.revolut.feature.statements.api.models.CustomStatementElementPeriod;
import com.revolut.feature.statements.api.models.CustomStatementPeriods;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.feature.statements.impl.services.StatementsService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f284181w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(h0 h0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284181w = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f284181w, continuation, 0);
            case 1:
                return new f0(this.f284181w, continuation, 1);
            case 2:
                return new f0(this.f284181w, continuation, 2);
            default:
                return new f0(this.f284181w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object bankIdAvailableYears;
        Object consolidatedStatementsCustomisations;
        Object customStatementData;
        Object statementsTaxCertificateAvailableYears;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    StatementsService statementsService = this.f284181w.f284188a;
                    this.v = 1;
                    bankIdAvailableYears = statementsService.getBankIdAvailableYears(this);
                    if (bankIdAvailableYears == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    bankIdAvailableYears = obj2;
                }
                return ((oyd.c) bankIdAvailableYears).getYears();
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    StatementsService statementsService2 = this.f284181w.f284188a;
                    this.v = 1;
                    consolidatedStatementsCustomisations = statementsService2.getConsolidatedStatementsCustomisations("CONSOLIDATED_STATEMENT_V2", this);
                    if (consolidatedStatementsCustomisations == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    consolidatedStatementsCustomisations = obj2;
                }
                return pyd.a.a((oyd.d) consolidatedStatementsCustomisations);
            case 2:
                Object customStatementData2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    StatementsService statementsService3 = this.f284181w.f284188a;
                    this.v = 1;
                    customStatementData = statementsService3.getCustomStatementData("CONSOLIDATED_STATEMENT_V2", this);
                    if (customStatementData != customStatementData2) {
                    }
                    return customStatementData2;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                customStatementData = obj2;
                oyd.i iVar = (oyd.i) customStatementData;
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                oyd.k periods = iVar.getPeriods();
                TaxPeriod taxPeriodA = pyd.d.a(periods.getTaxPeriod());
                List<oyd.h> accounts = periods.getAccounts();
                int i5 = 10;
                ArrayList arrayList = new ArrayList(zhm.w.t(accounts, 10));
                for (oyd.h hVar : accounts) {
                    String productType = hVar.getProductType();
                    LocalDate localDate = LocalDate.parse(hVar.getStartDate());
                    Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                    String endDate = hVar.getEndDate();
                    LocalDate localDate2 = endDate != null ? LocalDate.parse(endDate) : null;
                    List<oyd.j> elements = hVar.getElements();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(elements, i5));
                    for (oyd.j jVar : elements) {
                        String id10 = jVar.getId();
                        LocalDate localDate3 = LocalDate.parse(jVar.getStartDate());
                        Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
                        String endDate2 = jVar.getEndDate();
                        arrayList2.add(new CustomStatementElementPeriod(id10, localDate3, endDate2 != null ? LocalDate.parse(endDate2) : null));
                    }
                    arrayList.add(new CustomStatementAccountPeriods(productType, localDate, localDate2, arrayList2));
                    i5 = 10;
                }
                customStatementData2 = new CustomStatementData(new CustomStatementPeriods(taxPeriodA, arrayList), pyd.a.a(iVar.getFilters()));
                return customStatementData2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    StatementsService statementsService4 = this.f284181w.f284188a;
                    this.v = 1;
                    statementsTaxCertificateAvailableYears = statementsService4.getStatementsTaxCertificateAvailableYears(this);
                    if (statementsTaxCertificateAvailableYears == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    statementsTaxCertificateAvailableYears = obj2;
                }
                oyd.r rVar = (oyd.r) statementsTaxCertificateAvailableYears;
                Intrinsics.checkNotNullParameter(rVar, "<this>");
                return uj3.b.m(rVar.getTaxPeriod(), rVar.getAvailableYears());
        }
    }
}
