package n47;

import cli.y;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import com.revolut.feature.statements.api.models.StatementProductType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import ryd.w;
import tof.a3;
import tof.va;
import vkm.j2;
import zh9.u0;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f f212331b;

    public /* synthetic */ q(com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar, int i) {
        this.f212330a = i;
        this.f212331b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        DateTime dateTime;
        LocalDateTime localDateTimeJ;
        LocalDate localDate;
        switch (this.f212330a) {
            case 0:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                a3 a3Var = (a3) d0.d0(transactions);
                return (a3Var == null || (dateTime = a3Var.f272591g) == null || (localDateTimeJ = pu7.a.J(dateTime)) == null || (localDate = localDateTimeJ.toLocalDate()) == null) ? ((l80.f) this.f212331b.o).e() : localDate;
            case 1:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar = this.f212331b;
                vkm.d dVarB = rd0.e.b(((w) fVar.f74421s).g(null, y0.b(StatementProductType.PRO)));
                com.revolut.domain.interactors.transactions.a aVar = fVar.f74422t;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it8 = pockets.iterator();
                while (it8.hasNext()) {
                    linkedHashSet.add(((io3.d) it8.next()).f163145a);
                }
                return nim.a.v(u0.m(dVarB, nim.a.v(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(aVar, new va(linkedHashSet), null, 1, TransactionsSort.CREATED_DATE_ASC, null, 18)), new q(fVar, 0))), new lsl.d(pockets, 23));
            case 2:
                mw6.e result = (mw6.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof mw6.c) {
                    com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar2 = this.f212331b;
                    fVar2.H2(fVar2.v, new n45.b(fVar2, result, 5));
                }
                return Unit.f186387a;
            case 3:
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar3 = this.f212331b;
                y yVar = fVar3.v;
                final kw6.b result2 = (kw6.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                final i iVar = ((TaxHubTransactionExportPeriodPickerScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f74403b;
                if (!(iVar instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b)) {
                    throw new IllegalArgumentException("If not Custom, the content won't render with the UI enabling picking dates.");
                }
                final int i = 0;
                fVar3.H2(yVar, new Function1() { // from class: n47.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        TaxHubTransactionExportPeriodPickerScreenContract$DomainState update = (TaxHubTransactionExportPeriodPickerScreenContract$DomainState) obj3;
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period selectedPeriod = TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period.a(((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b) iVar).f74412a, null, result2.f190295a, 1);
                                Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                                return TaxHubTransactionExportPeriodPickerScreenContract$DomainState.a(update, new com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b(selectedPeriod));
                            default:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period selectedPeriod2 = TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period.a(((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b) iVar).f74412a, result2.f190295a, null, 2);
                                Intrinsics.checkNotNullParameter(selectedPeriod2, "selectedPeriod");
                                return TaxHubTransactionExportPeriodPickerScreenContract$DomainState.a(update, new com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b(selectedPeriod2));
                        }
                    }
                });
                return Unit.f186387a;
            default:
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar4 = this.f212331b;
                y yVar2 = fVar4.v;
                final kw6.b result3 = (kw6.b) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                final i iVar2 = ((TaxHubTransactionExportPeriodPickerScreenContract$DomainState) ((j2) yVar2.f22677a).getValue()).f74403b;
                if (!(iVar2 instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b)) {
                    throw new IllegalArgumentException("If not Custom, the content won't render with the UI enabling picking dates.");
                }
                final int i2 = 1;
                fVar4.H2(yVar2, new Function1() { // from class: n47.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        TaxHubTransactionExportPeriodPickerScreenContract$DomainState update = (TaxHubTransactionExportPeriodPickerScreenContract$DomainState) obj3;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period selectedPeriod = TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period.a(((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b) iVar2).f74412a, null, result3.f190295a, 1);
                                Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                                return TaxHubTransactionExportPeriodPickerScreenContract$DomainState.a(update, new com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b(selectedPeriod));
                            default:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period selectedPeriod2 = TaxHubTransactionExportPeriodPickerScreenContract$DomainState.Period.a(((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b) iVar2).f74412a, result3.f190295a, null, 2);
                                Intrinsics.checkNotNullParameter(selectedPeriod2, "selectedPeriod");
                                return TaxHubTransactionExportPeriodPickerScreenContract$DomainState.a(update, new com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b(selectedPeriod2));
                        }
                    }
                });
                return Unit.f186387a;
        }
    }
}
