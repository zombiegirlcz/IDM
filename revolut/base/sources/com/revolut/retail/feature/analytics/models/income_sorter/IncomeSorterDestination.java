package com.revolut.retail.feature.analytics.models.income_sorter;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/analytics/models/income_sorter/IncomeSorterDestination;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_analytics_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorterDestination implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IncomeSorterDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f99166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncomeSorterDestinationId f99167b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IncomeSorterDestination((d) parcel.readSerializable(), (IncomeSorterDestinationId) parcel.readParcelable(IncomeSorterDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterDestination[i];
        }
    }

    public IncomeSorterDestination(d money, IncomeSorterDestinationId destinationId) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        this.f99166a = money;
        this.f99167b = destinationId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeSorterDestination)) {
            return false;
        }
        IncomeSorterDestination incomeSorterDestination = (IncomeSorterDestination) obj2;
        return Intrinsics.f(this.f99166a, incomeSorterDestination.f99166a) && Intrinsics.f(this.f99167b, incomeSorterDestination.f99167b);
    }

    public final int hashCode() {
        return this.f99167b.hashCode() + (this.f99166a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99166a);
        dest.writeParcelable(this.f99167b, i);
    }
}
