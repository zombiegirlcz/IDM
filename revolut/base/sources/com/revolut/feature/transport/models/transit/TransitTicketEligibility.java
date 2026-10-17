package com.revolut.feature.transport.models.transit;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/models/transit/TransitTicketEligibility;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransitTicketEligibility implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransitTicketEligibility> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92724b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitTicketEligibility(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransitTicketEligibility[i];
        }
    }

    public TransitTicketEligibility(String description, List tags) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f92723a = description;
        this.f92724b = tags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransitTicketEligibility)) {
            return false;
        }
        TransitTicketEligibility transitTicketEligibility = (TransitTicketEligibility) obj2;
        return Intrinsics.f(this.f92723a, transitTicketEligibility.f92723a) && Intrinsics.f(this.f92724b, transitTicketEligibility.f92724b);
    }

    public final int hashCode() {
        return this.f92724b.hashCode() + (this.f92723a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92723a);
        dest.writeStringList(this.f92724b);
    }
}
