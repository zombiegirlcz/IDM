package com.revolut.retail.feature.api.income_sorter.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/api/income_sorter/models/IncomeSorterDestinationTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "yzi/a", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeSorterDestinationTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IncomeSorterDestinationTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yzi.a f99237b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IncomeSorterDestinationTransaction(parcel.readString(), yzi.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeSorterDestinationTransaction[i];
        }
    }

    public IncomeSorterDestinationTransaction(String id10, yzi.a state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f99236a = id10;
        this.f99237b = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeSorterDestinationTransaction)) {
            return false;
        }
        IncomeSorterDestinationTransaction incomeSorterDestinationTransaction = (IncomeSorterDestinationTransaction) obj2;
        return Intrinsics.f(this.f99236a, incomeSorterDestinationTransaction.f99236a) && this.f99237b == incomeSorterDestinationTransaction.f99237b;
    }

    public final int hashCode() {
        return this.f99237b.hashCode() + (this.f99236a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99236a);
        dest.writeString(this.f99237b.name());
    }
}
