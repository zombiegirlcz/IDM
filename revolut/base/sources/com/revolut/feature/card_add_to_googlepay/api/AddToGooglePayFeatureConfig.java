package com.revolut.feature.card_add_to_googlepay.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import grl.k9;
import h30.l;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z9h.n;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/api/AddToGooglePayFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddToGooglePayFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<AddToGooglePayFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f64431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f64433c;
    public final NaviCommand d;
    public final NavigationIconConfig e;
    public final AccountId f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsProduct f64434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f64435h;
    public final boolean i;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            NaviCommand naviCommand;
            NavigationIconConfig navigationIconConfig;
            AnalyticsProduct analyticsProduct;
            NaviCommand naviCommand2;
            AccountId accountId;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f0 f0Var = (f0) parcel.readSerializable();
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(AddToGooglePayFeatureConfig.class.getClassLoader());
            NaviCommand naviCommand4 = (NaviCommand) parcel.readParcelable(AddToGooglePayFeatureConfig.class.getClassLoader());
            NavigationIconConfig navigationIconConfigCreateFromParcel = parcel.readInt() == 0 ? null : NavigationIconConfig.CREATOR.createFromParcel(parcel);
            AccountId accountId2 = (AccountId) parcel.readParcelable(AddToGooglePayFeatureConfig.class.getClassLoader());
            AnalyticsProduct analyticsProduct2 = (AnalyticsProduct) parcel.readParcelable(AddToGooglePayFeatureConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = true;
                naviCommand = naviCommand3;
                navigationIconConfig = navigationIconConfigCreateFromParcel;
                analyticsProduct = analyticsProduct2;
                naviCommand2 = naviCommand4;
                accountId = accountId2;
                z4 = true;
            } else {
                z3 = true;
                naviCommand = naviCommand3;
                navigationIconConfig = navigationIconConfigCreateFromParcel;
                analyticsProduct = analyticsProduct2;
                naviCommand2 = naviCommand4;
                accountId = accountId2;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new AddToGooglePayFeatureConfig(f0Var, z6, naviCommand, naviCommand2, navigationIconConfig, accountId, analyticsProduct, z4, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddToGooglePayFeatureConfig[i];
        }
    }

    public AddToGooglePayFeatureConfig(f0 card, boolean z, NaviCommand onSuccessCommand, NaviCommand onCancelCommand, NavigationIconConfig navigationIconConfig, AccountId accountId, AnalyticsProduct automaticEventProduct, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(onSuccessCommand, "onSuccessCommand");
        Intrinsics.checkNotNullParameter(onCancelCommand, "onCancelCommand");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f64431a = card;
        this.f64432b = z;
        this.f64433c = onSuccessCommand;
        this.d = onCancelCommand;
        this.e = navigationIconConfig;
        this.f = accountId;
        this.f64434g = automaticEventProduct;
        this.f64435h = z3;
        this.i = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddToGooglePayFeatureConfig)) {
            return false;
        }
        AddToGooglePayFeatureConfig addToGooglePayFeatureConfig = (AddToGooglePayFeatureConfig) obj2;
        return Intrinsics.f(this.f64431a, addToGooglePayFeatureConfig.f64431a) && this.f64432b == addToGooglePayFeatureConfig.f64432b && Intrinsics.f(this.f64433c, addToGooglePayFeatureConfig.f64433c) && Intrinsics.f(this.d, addToGooglePayFeatureConfig.d) && Intrinsics.f(this.e, addToGooglePayFeatureConfig.e) && Intrinsics.f(this.f, addToGooglePayFeatureConfig.f) && Intrinsics.f(this.f64434g, addToGooglePayFeatureConfig.f64434g) && this.f64435h == addToGooglePayFeatureConfig.f64435h && this.i == addToGooglePayFeatureConfig.i;
    }

    public final int hashCode() {
        int iA = n.a(this.d, n.a(this.f64433c, j6.a.c(this.f64431a.hashCode() * 31, 31, this.f64432b), 31), 31);
        NavigationIconConfig navigationIconConfig = this.e;
        return Boolean.hashCode(this.i) + j6.a.c(l.a(l.b(this.f, (iA + (navigationIconConfig == null ? 0 : navigationIconConfig.hashCode())) * 31, 31), 31, this.f64434g), 31, this.f64435h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64431a);
        dest.writeInt(this.f64432b ? 1 : 0);
        dest.writeParcelable(this.f64433c, i);
        dest.writeParcelable(this.d, i);
        NavigationIconConfig navigationIconConfig = this.e;
        if (navigationIconConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            navigationIconConfig.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f64434g, i);
        dest.writeInt(this.f64435h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AddToGooglePayFeatureConfig(f0 f0Var, NaviCommand naviCommand, NaviCommand naviCommand2, NavigationIconConfig navigationIconConfig, AnalyticsProduct analyticsProduct, boolean z, int i) {
        AnalyticsProduct analyticsProductG;
        boolean z3 = (i & 2) == 0;
        if ((i & 64) != 0) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.f137500l;
            analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        } else {
            analyticsProductG = analyticsProduct;
        }
        this(f0Var, z3, naviCommand, naviCommand2, navigationIconConfig, AccountId.Personal.f51414a, analyticsProductG, (i & 128) != 0 ? false : z, (i & 256) == 0);
    }
}
