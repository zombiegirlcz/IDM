package com.revolut.feature.payments.money_request.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.money_request.api.model.MoneyRequestAction;
import com.revolut.retail.core.flow.FlowExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/money_request/api/navigation/MoneyRequestFeatureConfig$Details$ById", "", "", "toString", "()Ljava/lang/String;", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyRequestFeatureConfig$Details$ById implements MoneyRequestFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<MoneyRequestFeatureConfig$Details$ById> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyRequestAction f79611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlowExtras f79612c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyRequestFeatureConfig$Details$ById(parcel.readString(), (MoneyRequestAction) parcel.readParcelable(MoneyRequestFeatureConfig$Details$ById.class.getClassLoader()), (FlowExtras) parcel.readParcelable(MoneyRequestFeatureConfig$Details$ById.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyRequestFeatureConfig$Details$ById[i];
        }
    }

    public MoneyRequestFeatureConfig$Details$ById(String moneyRequestId, MoneyRequestAction moneyRequestAction, FlowExtras flowExtras) {
        Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
        this.f79610a = moneyRequestId;
        this.f79611b = moneyRequestAction;
        this.f79612c = flowExtras;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyRequestFeatureConfig$Details$ById)) {
            return false;
        }
        MoneyRequestFeatureConfig$Details$ById moneyRequestFeatureConfig$Details$ById = (MoneyRequestFeatureConfig$Details$ById) obj2;
        return Intrinsics.f(this.f79610a, moneyRequestFeatureConfig$Details$ById.f79610a) && Intrinsics.f(this.f79611b, moneyRequestFeatureConfig$Details$ById.f79611b) && Intrinsics.f(this.f79612c, moneyRequestFeatureConfig$Details$ById.f79612c);
    }

    public final int hashCode() {
        int iHashCode = this.f79610a.hashCode() * 31;
        MoneyRequestAction moneyRequestAction = this.f79611b;
        int iHashCode2 = (iHashCode + (moneyRequestAction == null ? 0 : moneyRequestAction.hashCode())) * 31;
        FlowExtras flowExtras = this.f79612c;
        return iHashCode2 + (flowExtras != null ? flowExtras.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79610a);
        dest.writeParcelable(this.f79611b, i);
        dest.writeParcelable(this.f79612c, i);
    }
}
