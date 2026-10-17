package com.revolut.feature_travel_hotels_models.dropoff;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/dropoff/TravelHotelsDropoff;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "bfi/a", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsDropoff implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsDropoff> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bfi.a f97915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97916c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f97917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f97918h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TravelHotelsDropoffSearchParameters f97919j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            bfi.a aVarValueOf = bfi.a.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelHotelsRoomsInformation.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new TravelHotelsDropoff(string, aVarValueOf, string2, string3, string4, string5, string6, string7, arrayList, TravelHotelsDropoffSearchParameters.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsDropoff[i];
        }
    }

    public TravelHotelsDropoff(String id10, bfi.a state, String sessionId, String name, String imageUrl, String str, String str2, String str3, ArrayList arrayList, TravelHotelsDropoffSearchParameters searchParameters) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(searchParameters, "searchParameters");
        this.f97914a = id10;
        this.f97915b = state;
        this.f97916c = sessionId;
        this.d = name;
        this.e = imageUrl;
        this.f = str;
        this.f97917g = str2;
        this.f97918h = str3;
        this.i = arrayList;
        this.f97919j = searchParameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsDropoff)) {
            return false;
        }
        TravelHotelsDropoff travelHotelsDropoff = (TravelHotelsDropoff) obj2;
        return Intrinsics.f(this.f97914a, travelHotelsDropoff.f97914a) && this.f97915b == travelHotelsDropoff.f97915b && Intrinsics.f(this.f97916c, travelHotelsDropoff.f97916c) && Intrinsics.f(this.d, travelHotelsDropoff.d) && Intrinsics.f(this.e, travelHotelsDropoff.e) && Intrinsics.f(this.f, travelHotelsDropoff.f) && Intrinsics.f(this.f97917g, travelHotelsDropoff.f97917g) && Intrinsics.f(this.f97918h, travelHotelsDropoff.f97918h) && Intrinsics.f(this.i, travelHotelsDropoff.i) && Intrinsics.f(this.f97919j, travelHotelsDropoff.f97919j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c((this.f97915b.hashCode() + (this.f97914a.hashCode() * 31)) * 31, 31, this.f97916c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97917g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97918h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.i;
        return this.f97919j.hashCode() + ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97914a);
        dest.writeString(this.f97915b.name());
        dest.writeString(this.f97916c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f97917g);
        dest.writeString(this.f97918h);
        List list = this.i;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((TravelHotelsRoomsInformation) itQ.next()).writeToParcel(dest, i);
            }
        }
        this.f97919j.writeToParcel(dest, i);
    }
}
