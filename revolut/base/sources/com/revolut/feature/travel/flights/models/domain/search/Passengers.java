package com.revolut.feature.travel.flights.models.domain.search;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/search/Passengers;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Passengers implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Passengers> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f93596b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ChildPassenger.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Passengers(i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Passengers[i];
        }
    }

    public Passengers(int i, List children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f93595a = i;
        this.f93596b = children;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Passengers)) {
            return false;
        }
        Passengers passengers = (Passengers) obj2;
        return this.f93595a == passengers.f93595a && Intrinsics.f(this.f93596b, passengers.f93596b);
    }

    public final int hashCode() {
        return this.f93596b.hashCode() + (Integer.hashCode(this.f93595a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f93595a);
        Iterator itV = p.a.v(this.f93596b, dest);
        while (itV.hasNext()) {
            ((ChildPassenger) itV.next()).writeToParcel(dest, i);
        }
    }
}
