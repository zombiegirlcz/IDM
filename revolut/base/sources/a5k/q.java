package a5k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f1478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ skm.l f1479c;
    public final /* synthetic */ BankTransferData d;

    public /* synthetic */ q(t tVar, skm.l lVar, BankTransferData bankTransferData, int i) {
        this.f1477a = i;
        this.f1478b = tVar;
        this.f1479c = lVar;
        this.d = bankTransferData;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f1477a) {
            case 0:
                kq2.b bankTransferDetails = (kq2.b) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(bankTransferDetails, "bankTransferDetails");
                t.Z2(this.f1478b, this.f1479c, new g(bankTransferDetails, zBooleanValue, this.d.d));
                break;
            default:
                a3 transaction = (a3) obj2;
                kq2.b bankTransferDetails2 = (kq2.b) obj3;
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                Intrinsics.checkNotNullParameter(bankTransferDetails2, "bankTransferDetails");
                t.Z2(this.f1478b, this.f1479c, new h(bankTransferDetails2, transaction, this.d.d));
                break;
        }
        return Unit.f186387a;
    }
}
