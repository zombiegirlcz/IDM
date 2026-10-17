package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesRedeemOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesRedeemOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesRedeemOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94119c;
    public final Double d;
    public final ArrayList e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelMilesRedeemOptionItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TravelMilesRedeemOption(string, string2, string3, dValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesRedeemOption[i];
        }
    }

    public TravelMilesRedeemOption(String title, String str, String icon, Double d, ArrayList options) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f94117a = title;
        this.f94118b = str;
        this.f94119c = icon;
        this.d = d;
        this.e = options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesRedeemOption)) {
            return false;
        }
        TravelMilesRedeemOption travelMilesRedeemOption = (TravelMilesRedeemOption) obj2;
        return Intrinsics.f(this.f94117a, travelMilesRedeemOption.f94117a) && Intrinsics.f(this.f94118b, travelMilesRedeemOption.f94118b) && Intrinsics.f(this.f94119c, travelMilesRedeemOption.f94119c) && Intrinsics.f(this.d, travelMilesRedeemOption.d) && this.e.equals(travelMilesRedeemOption.e);
    }

    public final int hashCode() {
        int iHashCode = this.f94117a.hashCode() * 31;
        String str = this.f94118b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f94119c);
        Double d = this.d;
        return this.e.hashCode() + ((iC + (d != null ? d.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94117a);
        dest.writeString(this.f94118b);
        dest.writeString(this.f94119c);
        Double d = this.d;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            ((TravelMilesRedeemOptionItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
