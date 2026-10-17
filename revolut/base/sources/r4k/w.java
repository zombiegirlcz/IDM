package r4k;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferEntryPoint;
import e4k.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r40.y0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a f251504b;

    public /* synthetic */ w(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a aVar, int i) {
        this.f251503a = i;
        this.f251504b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        kq2.f exchangeRate;
        Object b0Var;
        switch (this.f251503a) {
            case 0:
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof dpf.a)) {
                    if (!(output instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f251504b.K2(new bg2.p(output, 10));
                }
                return Unit.f186387a;
            case 1:
                fpf.c output2 = (fpf.c) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof fpf.b) {
                    this.f251504b.K2(new r38.m(output2, 7));
                }
                return Unit.f186387a;
            case 2:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.f) {
                    this.f251504b.K2(new y0(14));
                }
                return Unit.f186387a;
            case 3:
                l it8 = (l) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                m mVar = it8.d;
                if (mVar == null || (exchangeRate = mVar.f251484b) == null) {
                    return null;
                }
                String value = exchangeRate.u;
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a aVar = this.f251504b;
                f2k.p pVar = aVar.B;
                BankTransferEntryPoint entryPoint = aVar.o.f102124c;
                BankTransferData transferData = it8.f251480c;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
                Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
                Intrinsics.checkNotNullParameter(transferData, "transferData");
                int i = f2k.o.f131853a[entryPoint.ordinal()];
                if (i == 1) {
                    if (value != null) {
                        Intrinsics.checkNotNullParameter(value, "value");
                    } else {
                        value = null;
                    }
                    kq2.c cVar = transferData.k;
                    b0Var = new mga.b0(value, cVar != null ? cVar.name() : null);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (value != null) {
                        Intrinsics.checkNotNullParameter(value, "value");
                    } else {
                        value = null;
                    }
                    kq2.c cVar2 = transferData.k;
                    String strName = cVar2 != null ? cVar2.name() : null;
                    RemittanceRouteId remittanceRouteId = transferData.f101935r;
                    b0Var = new mga.s(value, strName, remittanceRouteId != null ? remittanceRouteId.f101913a : null);
                }
                return b0Var;
            case 4:
                gpf.a output3 = (gpf.a) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                this.f251504b.K2(new as1.q(output3, 5));
                return Unit.f186387a;
            case 5:
                y2k.f output4 = (y2k.f) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (output4 instanceof y2k.g) {
                    this.f251504b.K2(new n0(output4, 1));
                }
                return Unit.f186387a;
            default:
                c4k.g outputData = (c4k.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof c4k.f) {
                    this.f251504b.K2(new r38.m(outputData, 8));
                }
                return Unit.f186387a;
        }
    }
}
