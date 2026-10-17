package com.revolut.feature.recurringbuys.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/recurringbuys/api/navigation/RecurringPaymentsHistoryDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_recurring_buys_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentsHistoryDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RecurringPaymentsHistoryDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f81659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81661c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringPaymentsHistoryDestination(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringPaymentsHistoryDestination[i];
        }
    }

    public RecurringPaymentsHistoryDestination(String recurringBuyId, String receiverPocketId, b destinationPocketCurrency) {
        Intrinsics.checkNotNullParameter(destinationPocketCurrency, "destinationPocketCurrency");
        Intrinsics.checkNotNullParameter(recurringBuyId, "recurringBuyId");
        Intrinsics.checkNotNullParameter(receiverPocketId, "receiverPocketId");
        this.f81659a = destinationPocketCurrency;
        this.f81660b = recurringBuyId;
        this.f81661c = receiverPocketId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecurringPaymentsHistoryDestination)) {
            return false;
        }
        RecurringPaymentsHistoryDestination recurringPaymentsHistoryDestination = (RecurringPaymentsHistoryDestination) obj2;
        return Intrinsics.f(this.f81659a, recurringPaymentsHistoryDestination.f81659a) && Intrinsics.f(this.f81660b, recurringPaymentsHistoryDestination.f81660b) && Intrinsics.f(this.f81661c, recurringPaymentsHistoryDestination.f81661c);
    }

    public final int hashCode() {
        return this.f81661c.hashCode() + p.a.c(this.f81659a.hashCode() * 31, 31, this.f81660b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f81659a);
        dest.writeString(this.f81660b);
        dest.writeString(this.f81661c);
    }
}
