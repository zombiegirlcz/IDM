package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/WealthProtectionFeaturesState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthProtectionFeaturesState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WealthProtectionFeaturesState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthProtectionFeatureState f85449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthProtectionFeatureState f85450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WealthProtectionFeatureState f85451c;
    public final WealthProtectionFeatureState d;
    public final WealthProtectionFeatureState e;
    public final WealthProtectionFeatureState f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WealthProtectionFeatureState f85452g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthProtectionFeaturesState((WealthProtectionFeatureState) parcel.readParcelable(WealthProtectionFeaturesState.class.getClassLoader()), (WealthProtectionFeatureState) parcel.readParcelable(WealthProtectionFeaturesState.class.getClassLoader()), (WealthProtectionFeatureState) parcel.readParcelable(WealthProtectionFeaturesState.class.getClassLoader()), (WealthProtectionFeatureState) parcel.readParcelable(WealthProtectionFeaturesState.class.getClassLoader()), (WealthProtectionFeatureState) parcel.readParcelable(WealthProtectionFeaturesState.class.getClassLoader()), (WealthProtectionFeatureState) parcel.readParcelable(WealthProtectionFeaturesState.class.getClassLoader()), (WealthProtectionFeatureState) parcel.readParcelable(WealthProtectionFeaturesState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthProtectionFeaturesState[i];
        }
    }

    public WealthProtectionFeaturesState(WealthProtectionFeatureState savings, WealthProtectionFeatureState pockets, WealthProtectionFeatureState stocks, WealthProtectionFeatureState commodities, WealthProtectionFeatureState crypto, WealthProtectionFeatureState transfers, WealthProtectionFeatureState cardPayments) {
        Intrinsics.checkNotNullParameter(savings, "savings");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(stocks, "stocks");
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        Intrinsics.checkNotNullParameter(transfers, "transfers");
        Intrinsics.checkNotNullParameter(cardPayments, "cardPayments");
        this.f85449a = savings;
        this.f85450b = pockets;
        this.f85451c = stocks;
        this.d = commodities;
        this.e = crypto;
        this.f = transfers;
        this.f85452g = cardPayments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthProtectionFeaturesState)) {
            return false;
        }
        WealthProtectionFeaturesState wealthProtectionFeaturesState = (WealthProtectionFeaturesState) obj2;
        return Intrinsics.f(this.f85449a, wealthProtectionFeaturesState.f85449a) && Intrinsics.f(this.f85450b, wealthProtectionFeaturesState.f85450b) && Intrinsics.f(this.f85451c, wealthProtectionFeaturesState.f85451c) && Intrinsics.f(this.d, wealthProtectionFeaturesState.d) && Intrinsics.f(this.e, wealthProtectionFeaturesState.e) && Intrinsics.f(this.f, wealthProtectionFeaturesState.f) && Intrinsics.f(this.f85452g, wealthProtectionFeaturesState.f85452g);
    }

    public final int hashCode() {
        return this.f85452g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f85451c.hashCode() + ((this.f85450b.hashCode() + (this.f85449a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f85449a, i);
        dest.writeParcelable(this.f85450b, i);
        dest.writeParcelable(this.f85451c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f85452g, i);
    }
}
