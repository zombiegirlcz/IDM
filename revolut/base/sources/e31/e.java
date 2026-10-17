package e31;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.beneficiary.api.common.QrScanResult;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuote;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import e8e.y;
import efm.h0;
import java.util.HashSet;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements o, p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f122176b;

    public /* synthetic */ e(int i, Function1 function1) {
        this.f122175a = i;
        this.f122176b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f122175a) {
            case 21:
                ((e6d.a) this.f122176b).invoke(obj2);
                break;
            case 22:
                ((e6d.a) this.f122176b).invoke(obj2);
                break;
            case 23:
            case 24:
            default:
                ((e6d.a) this.f122176b).invoke(obj2);
                break;
            case 25:
                ((e6d.a) this.f122176b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f122175a;
        Function1 function1 = this.f122176b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j71.a) ((e1d.h) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j71.b) ((e1d.h) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((e1.b) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((e3j.c) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((e1.b) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xo9.h) ((d62.a) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((e3j.c) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (QrScanResult) ((e1d.h) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e1d.h) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e2j.j) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (HashSet) ((e1d.h) function1).invoke(p0);
            case 11:
            case 12:
            case 13:
            case 15:
            case 18:
            case 21:
            case 22:
            case 25:
            case 26:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((y) function1).invoke(p0);
            case 14:
                KProperty[] kPropertyArr = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((e1d.h) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((e4k.f) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((e6d.a) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((e2j.i) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e4k.f) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yvh.b) ((e6d.b) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yvh.b) ((e6d.b) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((e87.e) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CollectionQuote) ((y) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f122175a;
        e4k.f fVar = (e4k.f) this.f122176b;
        switch (i) {
            case 11:
                KProperty[] kPropertyArr = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                KProperty[] kPropertyArr2 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                KProperty[] kPropertyArr3 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                KProperty[] kPropertyArr4 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) fVar.invoke(p0)).booleanValue();
    }
}
