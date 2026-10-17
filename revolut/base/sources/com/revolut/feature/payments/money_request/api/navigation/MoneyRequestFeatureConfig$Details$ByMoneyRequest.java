package com.revolut.feature.payments.money_request.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.retail.core.flow.FlowExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/money_request/api/navigation/MoneyRequestFeatureConfig$Details$ByMoneyRequest", "", "", "toString", "()Ljava/lang/String;", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyRequestFeatureConfig$Details$ByMoneyRequest implements MoneyRequestFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<MoneyRequestFeatureConfig$Details$ByMoneyRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f79613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlowExtras f79614b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyRequestFeatureConfig$Details$ByMoneyRequest((MoneyRequest) parcel.readParcelable(MoneyRequestFeatureConfig$Details$ByMoneyRequest.class.getClassLoader()), (FlowExtras) parcel.readParcelable(MoneyRequestFeatureConfig$Details$ByMoneyRequest.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyRequestFeatureConfig$Details$ByMoneyRequest[i];
        }
    }

    public MoneyRequestFeatureConfig$Details$ByMoneyRequest(MoneyRequest moneyRequest, FlowExtras flowExtras) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        this.f79613a = moneyRequest;
        this.f79614b = flowExtras;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyRequestFeatureConfig$Details$ByMoneyRequest)) {
            return false;
        }
        MoneyRequestFeatureConfig$Details$ByMoneyRequest moneyRequestFeatureConfig$Details$ByMoneyRequest = (MoneyRequestFeatureConfig$Details$ByMoneyRequest) obj2;
        return Intrinsics.f(this.f79613a, moneyRequestFeatureConfig$Details$ByMoneyRequest.f79613a) && Intrinsics.f(this.f79614b, moneyRequestFeatureConfig$Details$ByMoneyRequest.f79614b);
    }

    public final int hashCode() {
        int iHashCode = this.f79613a.hashCode() * 31;
        FlowExtras flowExtras = this.f79614b;
        return iHashCode + (flowExtras == null ? 0 : flowExtras.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79613a, i);
        dest.writeParcelable(this.f79614b, i);
    }
}
