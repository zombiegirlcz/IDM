package nk4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$PaymentUiStyle;
import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$ScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f216641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConfirmAutopayContract$PaymentUiStyle f216643c;
    public final ConfirmAutopayContract$ScreenConfig d;
    public final RepaymentSource e;

    public a(Data autoPayData, boolean z, ConfirmAutopayContract$PaymentUiStyle paymentUiStyle, ConfirmAutopayContract$ScreenConfig screenConfig, RepaymentSource repaymentSource) {
        Intrinsics.checkNotNullParameter(autoPayData, "autoPayData");
        Intrinsics.checkNotNullParameter(paymentUiStyle, "paymentUiStyle");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        this.f216641a = autoPayData;
        this.f216642b = z;
        this.f216643c = paymentUiStyle;
        this.d = screenConfig;
        this.e = repaymentSource;
    }

    public static a a(a aVar, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            data = aVar.f216641a;
        }
        Data autoPayData = data;
        if ((i & 2) != 0) {
            z = aVar.f216642b;
        }
        ConfirmAutopayContract$PaymentUiStyle paymentUiStyle = aVar.f216643c;
        ConfirmAutopayContract$ScreenConfig screenConfig = aVar.d;
        RepaymentSource repaymentSource = aVar.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(autoPayData, "autoPayData");
        Intrinsics.checkNotNullParameter(paymentUiStyle, "paymentUiStyle");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        return new a(autoPayData, z, paymentUiStyle, screenConfig, repaymentSource);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f216641a, aVar.f216641a) && this.f216642b == aVar.f216642b && Intrinsics.f(this.f216643c, aVar.f216643c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f216643c.hashCode() + j6.a.c(this.f216641a.hashCode() * 31, 31, this.f216642b)) * 31)) * 31;
        RepaymentSource repaymentSource = this.e;
        return iHashCode + (repaymentSource == null ? 0 : repaymentSource.hashCode());
    }
}
