package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import hfg.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesAirline;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesAirline implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesAirline> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94090c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelMilesProvider f94091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f94092h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f94093j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            TravelMilesProvider travelMilesProviderCreateFromParcel = TravelMilesProvider.CREATOR.createFromParcel(parcel);
            int i = 0;
            boolean z = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (true) {
                String string7 = parcel.readString();
                if (i == i2) {
                    return new TravelMilesAirline(string, string2, string3, string4, string5, string6, travelMilesProviderCreateFromParcel, z, arrayList, string7);
                }
                arrayList.add(b0.valueOf(string7));
                i++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesAirline[i];
        }
    }

    public TravelMilesAirline(String ref2, String name, String programmeName, String description, String logoUrl, String learnMoreUrl, TravelMilesProvider provider, boolean z, List redeemTypes, String str) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(programmeName, "programmeName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
        this.f94088a = ref2;
        this.f94089b = name;
        this.f94090c = programmeName;
        this.d = description;
        this.e = logoUrl;
        this.f = learnMoreUrl;
        this.f94091g = provider;
        this.f94092h = z;
        this.i = redeemTypes;
        this.f94093j = str;
    }

    public static TravelMilesAirline a(TravelMilesAirline travelMilesAirline, TravelMilesProvider travelMilesProvider, ArrayList arrayList, int i) {
        String ref2 = travelMilesAirline.f94088a;
        String name = travelMilesAirline.f94089b;
        String programmeName = travelMilesAirline.f94090c;
        String description = travelMilesAirline.d;
        String logoUrl = travelMilesAirline.e;
        String learnMoreUrl = travelMilesAirline.f;
        if ((i & 64) != 0) {
            travelMilesProvider = travelMilesAirline.f94091g;
        }
        TravelMilesProvider provider = travelMilesProvider;
        boolean z = travelMilesAirline.f94092h;
        List list = arrayList;
        if ((i & 256) != 0) {
            list = travelMilesAirline.i;
        }
        List redeemTypes = list;
        String str = travelMilesAirline.f94093j;
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(programmeName, "programmeName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(redeemTypes, "redeemTypes");
        return new TravelMilesAirline(ref2, name, programmeName, description, logoUrl, learnMoreUrl, provider, z, redeemTypes, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesAirline)) {
            return false;
        }
        TravelMilesAirline travelMilesAirline = (TravelMilesAirline) obj2;
        return Intrinsics.f(this.f94088a, travelMilesAirline.f94088a) && Intrinsics.f(this.f94089b, travelMilesAirline.f94089b) && Intrinsics.f(this.f94090c, travelMilesAirline.f94090c) && Intrinsics.f(this.d, travelMilesAirline.d) && Intrinsics.f(this.e, travelMilesAirline.e) && Intrinsics.f(this.f, travelMilesAirline.f) && Intrinsics.f(this.f94091g, travelMilesAirline.f94091g) && this.f94092h == travelMilesAirline.f94092h && Intrinsics.f(this.i, travelMilesAirline.i) && Intrinsics.f(this.f94093j, travelMilesAirline.f94093j);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c((this.f94091g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f94088a.hashCode() * 31, 31, this.f94089b), 31, this.f94090c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.f94092h), 31, this.i);
        String str = this.f94093j;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94088a);
        dest.writeString(this.f94089b);
        dest.writeString(this.f94090c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        this.f94091g.writeToParcel(dest, i);
        dest.writeInt(this.f94092h ? 1 : 0);
        Iterator itV = p.a.v(this.i, dest);
        while (itV.hasNext()) {
            dest.writeString(((b0) itV.next()).name());
        }
        dest.writeString(this.f94093j);
    }
}
