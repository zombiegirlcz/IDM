package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsLockedProductOffer;", "Lcom/revolut/feature/shops/api/model/ShopsContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsLockedProductOffer implements ShopsContext, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsLockedProductOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f87055c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (true) {
                String string3 = parcel.readString();
                if (i2 == i) {
                    return new ShopsLockedProductOffer(string, string2, string3, parcel.readString(), arrayList);
                }
                arrayList.add(r.valueOf(string3));
                i2++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsLockedProductOffer[i];
        }
    }

    public ShopsLockedProductOffer(String id10, String str, String carouselId, String analyticsRef, List eligiblePlans) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(eligiblePlans, "eligiblePlans");
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        Intrinsics.checkNotNullParameter(analyticsRef, "analyticsRef");
        this.f87053a = id10;
        this.f87054b = str;
        this.f87055c = eligiblePlans;
        this.d = carouselId;
        this.e = analyticsRef;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsLockedProductOffer)) {
            return false;
        }
        ShopsLockedProductOffer shopsLockedProductOffer = (ShopsLockedProductOffer) obj2;
        return Intrinsics.f(this.f87053a, shopsLockedProductOffer.f87053a) && Intrinsics.f(this.f87054b, shopsLockedProductOffer.f87054b) && Intrinsics.f(this.f87055c, shopsLockedProductOffer.f87055c) && Intrinsics.f(this.d, shopsLockedProductOffer.d) && Intrinsics.f(this.e, shopsLockedProductOffer.e);
    }

    public final int hashCode() {
        int iHashCode = this.f87053a.hashCode() * 31;
        String str = this.f87054b;
        return this.e.hashCode() + p.a.c(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f87055c), 31, this.d);
    }

    @Override // com.revolut.feature.shops.api.model.ShopsContext
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87053a);
        dest.writeString(this.f87054b);
        Iterator itV = p.a.v(this.f87055c, dest);
        while (itV.hasNext()) {
            dest.writeString(((r) itV.next()).name());
        }
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
