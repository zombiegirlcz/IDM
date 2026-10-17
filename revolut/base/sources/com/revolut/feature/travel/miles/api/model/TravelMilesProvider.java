package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import hfg.t0;
import hfg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesProvider;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "hfg/x", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesProvider implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesProvider> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94105c;
    public final String d;
    public final String e;
    public final TravelMilesAccount f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelMilesRate f94106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t0 f94107h;
    public final TravelMilesCampaign i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f94108j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesProvider(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TravelMilesAccount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TravelMilesRate.CREATOR.createFromParcel(parcel), t0.valueOf(parcel.readString()), parcel.readInt() != 0 ? TravelMilesCampaign.CREATOR.createFromParcel(parcel) : null, x.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesProvider[i];
        }
    }

    public TravelMilesProvider(String id10, String name, String description, String logoUrl, String signupUrl, TravelMilesAccount travelMilesAccount, TravelMilesRate travelMilesRate, t0 unit, TravelMilesCampaign travelMilesCampaign, x accountLinkType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(signupUrl, "signupUrl");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(accountLinkType, "accountLinkType");
        this.f94103a = id10;
        this.f94104b = name;
        this.f94105c = description;
        this.d = logoUrl;
        this.e = signupUrl;
        this.f = travelMilesAccount;
        this.f94106g = travelMilesRate;
        this.f94107h = unit;
        this.i = travelMilesCampaign;
        this.f94108j = accountLinkType;
    }

    public static TravelMilesProvider a(TravelMilesProvider travelMilesProvider, TravelMilesAccount travelMilesAccount) {
        String id10 = travelMilesProvider.f94103a;
        String name = travelMilesProvider.f94104b;
        String description = travelMilesProvider.f94105c;
        String logoUrl = travelMilesProvider.d;
        String signupUrl = travelMilesProvider.e;
        TravelMilesRate travelMilesRate = travelMilesProvider.f94106g;
        t0 unit = travelMilesProvider.f94107h;
        TravelMilesCampaign travelMilesCampaign = travelMilesProvider.i;
        x accountLinkType = travelMilesProvider.f94108j;
        travelMilesProvider.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(signupUrl, "signupUrl");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(accountLinkType, "accountLinkType");
        return new TravelMilesProvider(id10, name, description, logoUrl, signupUrl, travelMilesAccount, travelMilesRate, unit, travelMilesCampaign, accountLinkType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesProvider)) {
            return false;
        }
        TravelMilesProvider travelMilesProvider = (TravelMilesProvider) obj2;
        return Intrinsics.f(this.f94103a, travelMilesProvider.f94103a) && Intrinsics.f(this.f94104b, travelMilesProvider.f94104b) && Intrinsics.f(this.f94105c, travelMilesProvider.f94105c) && Intrinsics.f(this.d, travelMilesProvider.d) && Intrinsics.f(this.e, travelMilesProvider.e) && Intrinsics.f(this.f, travelMilesProvider.f) && Intrinsics.f(this.f94106g, travelMilesProvider.f94106g) && this.f94107h == travelMilesProvider.f94107h && Intrinsics.f(this.i, travelMilesProvider.i) && this.f94108j == travelMilesProvider.f94108j;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f94103a.hashCode() * 31, 31, this.f94104b), 31, this.f94105c), 31, this.d), 31, this.e);
        TravelMilesAccount travelMilesAccount = this.f;
        int iHashCode = (iC + (travelMilesAccount == null ? 0 : travelMilesAccount.hashCode())) * 31;
        TravelMilesRate travelMilesRate = this.f94106g;
        int iHashCode2 = (this.f94107h.hashCode() + ((iHashCode + (travelMilesRate == null ? 0 : travelMilesRate.hashCode())) * 31)) * 31;
        TravelMilesCampaign travelMilesCampaign = this.i;
        return this.f94108j.hashCode() + ((iHashCode2 + (travelMilesCampaign != null ? travelMilesCampaign.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94103a);
        dest.writeString(this.f94104b);
        dest.writeString(this.f94105c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        TravelMilesAccount travelMilesAccount = this.f;
        if (travelMilesAccount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelMilesAccount.writeToParcel(dest, i);
        }
        TravelMilesRate travelMilesRate = this.f94106g;
        if (travelMilesRate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelMilesRate.writeToParcel(dest, i);
        }
        dest.writeString(this.f94107h.name());
        TravelMilesCampaign travelMilesCampaign = this.i;
        if (travelMilesCampaign == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelMilesCampaign.writeToParcel(dest, i);
        }
        dest.writeString(this.f94108j.name());
    }
}
