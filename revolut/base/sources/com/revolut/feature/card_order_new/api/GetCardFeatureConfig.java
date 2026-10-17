package com.revolut.feature.card_order_new.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/api/GetCardFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GetCardFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<GetCardFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f64965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zn3.a f64966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f64967c;
    public final AccountId d;
    public final boolean e;
    public final AnalyticsProduct f;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            zn3.a aVarValueOf = parcel.readInt() == 0 ? null : zn3.a.valueOf(parcel.readString());
            h hVar = (h) parcel.readSerializable();
            AccountId accountId = (AccountId) parcel.readParcelable(GetCardFeatureConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new GetCardFeatureConfig(z3, aVarValueOf, hVar, accountId, z, (AnalyticsProduct) parcel.readParcelable(GetCardFeatureConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GetCardFeatureConfig[i];
        }
    }

    public GetCardFeatureConfig(boolean z, zn3.a aVar, h hVar, AccountId accountId, boolean z3, AnalyticsProduct automaticEventProduct) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f64965a = z;
        this.f64966b = aVar;
        this.f64967c = hVar;
        this.d = accountId;
        this.e = z3;
        this.f = automaticEventProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GetCardFeatureConfig)) {
            return false;
        }
        GetCardFeatureConfig getCardFeatureConfig = (GetCardFeatureConfig) obj2;
        return this.f64965a == getCardFeatureConfig.f64965a && this.f64966b == getCardFeatureConfig.f64966b && Intrinsics.f(this.f64967c, getCardFeatureConfig.f64967c) && Intrinsics.f(this.d, getCardFeatureConfig.d) && this.e == getCardFeatureConfig.e && Intrinsics.f(this.f, getCardFeatureConfig.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f64965a) * 31;
        zn3.a aVar = this.f64966b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        h hVar = this.f64967c;
        return this.f.hashCode() + j6.a.c(l.b(this.d, (iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31, 31), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f64965a ? 1 : 0);
        zn3.a aVar = this.f64966b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeSerializable(this.f64967c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ GetCardFeatureConfig(zn3.a aVar, h hVar, boolean z, AnalyticsProduct.Retail retail, int i) {
        this((i & 1) == 0, aVar, (i & 4) != 0 ? null : hVar, AccountId.Personal.f51414a, z, retail);
    }
}
