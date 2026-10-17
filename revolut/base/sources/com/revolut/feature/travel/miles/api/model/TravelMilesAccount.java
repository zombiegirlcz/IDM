package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesAccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesAccount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f94084c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesAccount(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesAccount[i];
        }
    }

    public TravelMilesAccount(String id10, String externalId, List primaryAirlines) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(primaryAirlines, "primaryAirlines");
        this.f94082a = id10;
        this.f94083b = externalId;
        this.f94084c = primaryAirlines;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesAccount)) {
            return false;
        }
        TravelMilesAccount travelMilesAccount = (TravelMilesAccount) obj2;
        return Intrinsics.f(this.f94082a, travelMilesAccount.f94082a) && Intrinsics.f(this.f94083b, travelMilesAccount.f94083b) && Intrinsics.f(this.f94084c, travelMilesAccount.f94084c);
    }

    public final int hashCode() {
        return this.f94084c.hashCode() + p.a.c(this.f94082a.hashCode() * 31, 31, this.f94083b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94082a);
        dest.writeString(this.f94083b);
        dest.writeStringList(this.f94084c);
    }
}
