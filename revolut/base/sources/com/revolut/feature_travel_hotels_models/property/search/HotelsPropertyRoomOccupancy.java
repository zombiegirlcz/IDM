package com.revolut.feature_travel_hotels_models.property.search;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/search/HotelsPropertyRoomOccupancy;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyRoomOccupancy implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyRoomOccupancy> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f98128b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Child.CREATOR, parcel, arrayList, iA, 1);
            }
            return new HotelsPropertyRoomOccupancy(i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyRoomOccupancy[i];
        }
    }

    public HotelsPropertyRoomOccupancy(int i, List children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f98127a = i;
        this.f98128b = children;
    }

    public static HotelsPropertyRoomOccupancy a(HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy, int i, List children, int i2) {
        if ((i2 & 1) != 0) {
            i = hotelsPropertyRoomOccupancy.f98127a;
        }
        if ((i2 & 2) != 0) {
            children = hotelsPropertyRoomOccupancy.f98128b;
        }
        hotelsPropertyRoomOccupancy.getClass();
        Intrinsics.checkNotNullParameter(children, "children");
        return new HotelsPropertyRoomOccupancy(i, children);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyRoomOccupancy)) {
            return false;
        }
        HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy = (HotelsPropertyRoomOccupancy) obj2;
        return this.f98127a == hotelsPropertyRoomOccupancy.f98127a && Intrinsics.f(this.f98128b, hotelsPropertyRoomOccupancy.f98128b);
    }

    public final int hashCode() {
        return this.f98128b.hashCode() + (Integer.hashCode(this.f98127a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98127a);
        Iterator itV = p.a.v(this.f98128b, dest);
        while (itV.hasNext()) {
            ((Child) itV.next()).writeToParcel(dest, i);
        }
    }
}
