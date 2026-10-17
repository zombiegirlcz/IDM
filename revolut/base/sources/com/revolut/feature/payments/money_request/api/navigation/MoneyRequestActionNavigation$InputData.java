package com.revolut.feature.payments.money_request.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/money_request/api/navigation/MoneyRequestActionNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_money_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyRequestActionNavigation$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MoneyRequestActionNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f79599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yv9.a f79600b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyRequestActionNavigation$InputData((MoneyRequest) parcel.readParcelable(MoneyRequestActionNavigation$InputData.class.getClassLoader()), yv9.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyRequestActionNavigation$InputData[i];
        }
    }

    public MoneyRequestActionNavigation$InputData(MoneyRequest moneyRequest, yv9.a action) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f79599a = moneyRequest;
        this.f79600b = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyRequestActionNavigation$InputData)) {
            return false;
        }
        MoneyRequestActionNavigation$InputData moneyRequestActionNavigation$InputData = (MoneyRequestActionNavigation$InputData) obj2;
        return Intrinsics.f(this.f79599a, moneyRequestActionNavigation$InputData.f79599a) && this.f79600b == moneyRequestActionNavigation$InputData.f79600b;
    }

    public final int hashCode() {
        return this.f79600b.hashCode() + (this.f79599a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79599a, i);
        dest.writeString(this.f79600b.name());
    }
}
