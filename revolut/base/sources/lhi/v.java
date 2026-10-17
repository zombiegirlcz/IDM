package lhi;

import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreen;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreen;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ljl.n1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements kfm.g, kfm.o, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f195305b;

    public /* synthetic */ v(int i, Function1 function1) {
        this.f195304a = i;
        this.f195305b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f195304a) {
            case 0:
                ((lfg.z) this.f195305b).invoke(obj2);
                break;
            default:
                ((n1) this.f195305b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f195304a;
        Function1 function1 = this.f195305b;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 7:
            case 10:
            case 16:
            case 19:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                KProperty[] kPropertyArr = CFACInsuranceDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((n1) function1).invoke(p0);
                break;
            case 17:
                KProperty[] kPropertyArr2 = CFACInsuranceDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((n1) function1).invoke(p0);
                break;
            case 18:
                KProperty[] kPropertyArr3 = CFACInsuranceDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((n1) function1).invoke(p0);
                break;
            case 20:
                KProperty[] kPropertyArr4 = PayLaterRepaymentDetailsScreen.f78910k0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (efm.h0) ((llh.d) function1).invoke(p0);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f195304a;
        Function1 function1 = this.f195305b;
        switch (i) {
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                KProperty[] kPropertyArr = CFACInsuranceDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                KProperty[] kPropertyArr2 = CFACInsuranceDetailsScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((n1) function1).invoke(p0)).booleanValue();
    }
}
