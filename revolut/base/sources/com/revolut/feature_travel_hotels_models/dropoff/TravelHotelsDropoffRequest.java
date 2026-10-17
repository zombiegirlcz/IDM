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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/dropoff/TravelHotelsDropoffRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsDropoffRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsDropoffRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfi.a f97920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97922c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelHotelsDropoffSearchParameters f97923g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            bfi.a aVarValueOf = bfi.a.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
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
            return new TravelHotelsDropoffRequest(aVarValueOf, string, string2, string3, string4, arrayList, TravelHotelsDropoffSearchParameters.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsDropoffRequest[i];
        }
    }

    public TravelHotelsDropoffRequest(bfi.a state, String sessionId, String str, String str2, String str3, ArrayList arrayList, TravelHotelsDropoffSearchParameters searchParameters) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(searchParameters, "searchParameters");
        this.f97920a = state;
        this.f97921b = sessionId;
        this.f97922c = str;
        this.d = str2;
        this.e = str3;
        this.f = arrayList;
        this.f97923g = searchParameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsDropoffRequest)) {
            return false;
        }
        TravelHotelsDropoffRequest travelHotelsDropoffRequest = (TravelHotelsDropoffRequest) obj2;
        return this.f97920a == travelHotelsDropoffRequest.f97920a && Intrinsics.f(this.f97921b, travelHotelsDropoffRequest.f97921b) && Intrinsics.f(this.f97922c, travelHotelsDropoffRequest.f97922c) && Intrinsics.f(this.d, travelHotelsDropoffRequest.d) && Intrinsics.f(this.e, travelHotelsDropoffRequest.e) && Intrinsics.f(this.f, travelHotelsDropoffRequest.f) && Intrinsics.f(this.f97923g, travelHotelsDropoffRequest.f97923g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f97920a.hashCode() * 31, 31, this.f97921b);
        String str = this.f97922c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f;
        return this.f97923g.hashCode() + ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97920a.name());
        dest.writeString(this.f97921b);
        dest.writeString(this.f97922c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((TravelHotelsRoomsInformation) itQ.next()).writeToParcel(dest, i);
            }
        }
        this.f97923g.writeToParcel(dest, i);
    }
}
