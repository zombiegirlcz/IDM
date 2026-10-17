package com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import ft3.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/autopay/loan/model/AutoPayDataRequest;", "Lcom/revolut/feature/credit/autopay/models/repayment/AutoPayRepaymentDataRequest;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoPayDataRequest implements AutoPayRepaymentDataRequest {

    @NotNull
    public static final Parcelable.Creator<AutoPayDataRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RepaymentSource f67151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f67152b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoPayDataRequest((RepaymentSource) parcel.readParcelable(AutoPayDataRequest.class.getClassLoader()), (h1) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoPayDataRequest[i];
        }
    }

    public AutoPayDataRequest(RepaymentSource repaymentSource, h1 productPayload) {
        Intrinsics.checkNotNullParameter(repaymentSource, "repaymentSource");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        this.f67151a = repaymentSource;
        this.f67152b = productPayload;
    }

    @Override // com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest
    /* JADX INFO: renamed from: N8, reason: from getter */
    public final RepaymentSource getF67151a() {
        return this.f67151a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoPayDataRequest)) {
            return false;
        }
        AutoPayDataRequest autoPayDataRequest = (AutoPayDataRequest) obj2;
        return Intrinsics.f(this.f67151a, autoPayDataRequest.f67151a) && Intrinsics.f(this.f67152b, autoPayDataRequest.f67152b);
    }

    public final int hashCode() {
        return this.f67152b.hashCode() + (this.f67151a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67151a, i);
        dest.writeSerializable(this.f67152b);
    }
}
