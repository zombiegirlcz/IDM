package n47;

import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreen;
import ip0.a10;
import ip0.re;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TaxHubTransactionExportPeriodPickerScreen f212312w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f212312w = taxHubTransactionExportPeriodPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f212312w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f212312w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f212312w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Pair pair = (Pair) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(pair, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen = this.f212312w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = taxHubTransactionExportPeriodPickerScreen.R2();
                final re model = (re) pair.f186385a;
                final int iIntValue = ((Number) pair.f186386b).intValue();
                final com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f) lVarE3;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                final int i2 = 1;
                fVar.H2(fVar.v, new Function1() { // from class: n47.r
                    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r8) {
                        /*
                            Method dump skipped, instruction units count: 362
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: n47.r.invoke(java.lang.Object):java.lang.Object");
                    }
                });
                break;
            case 1:
                Pair pair2 = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = taxHubTransactionExportPeriodPickerScreen.R2();
                final re model2 = (re) pair2.f186385a;
                final int iIntValue2 = ((Number) pair2.f186386b).intValue();
                final com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar2 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f) lVarE32;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                final int i3 = 0;
                fVar2.H2(fVar2.v, new Function1() { // from class: n47.r
                    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r8) {
                        /*
                            Method dump skipped, instruction units count: 362
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: n47.r.invoke(java.lang.Object):java.lang.Object");
                    }
                });
                break;
            default:
                Pair pair3 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE33 = taxHubTransactionExportPeriodPickerScreen.R2();
                a10 model3 = (a10) pair3.f186385a;
                int iIntValue3 = ((Number) pair3.f186386b).intValue();
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar3 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f) lVarE33;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                fVar3.H2(fVar3.v, new a94.e(fVar3, model3, iIntValue3, 7));
                break;
        }
        return Unit.f186387a;
    }
}
