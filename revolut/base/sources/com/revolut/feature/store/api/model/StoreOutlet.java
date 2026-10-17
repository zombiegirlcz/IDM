package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreOutlet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreOutlet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreOutlet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StoreGeoPoint f88572c;
    public final Long d;
    public final String e;
    public final ArrayList f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            StoreGeoPoint storeGeoPointCreateFromParcel = StoreGeoPoint.CREATOR.createFromParcel(parcel);
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreAvailabilitySchedule.CREATOR, parcel, arrayList, iA, 1);
            }
            return new StoreOutlet(string, string2, storeGeoPointCreateFromParcel, lValueOf, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreOutlet[i];
        }
    }

    public StoreOutlet(String id10, String address, StoreGeoPoint location, Long l2, String campaignId, ArrayList availability) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.f88570a = id10;
        this.f88571b = address;
        this.f88572c = location;
        this.d = l2;
        this.e = campaignId;
        this.f = availability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreOutlet)) {
            return false;
        }
        StoreOutlet storeOutlet = (StoreOutlet) obj2;
        return Intrinsics.f(this.f88570a, storeOutlet.f88570a) && Intrinsics.f(this.f88571b, storeOutlet.f88571b) && Intrinsics.f(this.f88572c, storeOutlet.f88572c) && Intrinsics.f(this.d, storeOutlet.d) && Intrinsics.f(this.e, storeOutlet.e) && this.f.equals(storeOutlet.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f88572c.hashCode() + p.a.c(this.f88570a.hashCode() * 31, 31, this.f88571b)) * 31;
        Long l2 = this.d;
        return this.f.hashCode() + p.a.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88570a);
        dest.writeString(this.f88571b);
        this.f88572c.writeToParcel(dest, i);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.e);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            ((StoreAvailabilitySchedule) itY.next()).writeToParcel(dest, i);
        }
    }
}
