package com.revolut.feature.card_add_to_googlepay.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_add_to_googlepay.api.NavigationIconConfig;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z9h.n;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_add_to_googlepay/impl/AddToGooglePayViewControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddToGooglePayViewControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddToGooglePayViewControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f64454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f64456c;
    public final NaviCommand d;
    public final NavigationIconConfig e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f64457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f64458h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            NaviCommand naviCommand;
            NavigationIconConfig navigationIconConfig;
            boolean z4;
            AnalyticsProduct analyticsProduct;
            NaviCommand naviCommand2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f0 f0Var = (f0) parcel.readSerializable();
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            NaviCommand naviCommand3 = (NaviCommand) parcel.readParcelable(AddToGooglePayViewControllerContract$InputData.class.getClassLoader());
            NaviCommand naviCommand4 = (NaviCommand) parcel.readParcelable(AddToGooglePayViewControllerContract$InputData.class.getClassLoader());
            NavigationIconConfig navigationIconConfig2 = (NavigationIconConfig) parcel.readParcelable(AddToGooglePayViewControllerContract$InputData.class.getClassLoader());
            AnalyticsProduct analyticsProduct2 = (AnalyticsProduct) parcel.readParcelable(AddToGooglePayViewControllerContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = true;
                naviCommand = naviCommand3;
                navigationIconConfig = navigationIconConfig2;
                z4 = true;
            } else {
                z3 = true;
                naviCommand = naviCommand3;
                navigationIconConfig = navigationIconConfig2;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                analyticsProduct = analyticsProduct2;
                naviCommand2 = naviCommand4;
            } else {
                analyticsProduct = analyticsProduct2;
                naviCommand2 = naviCommand4;
                z3 = z;
            }
            return new AddToGooglePayViewControllerContract$InputData(f0Var, z6, naviCommand, naviCommand2, navigationIconConfig, analyticsProduct, z4, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddToGooglePayViewControllerContract$InputData[i];
        }
    }

    public AddToGooglePayViewControllerContract$InputData(f0 card, boolean z, NaviCommand onSuccessCommand, NaviCommand onCancelCommand, NavigationIconConfig navigationIconConfig, AnalyticsProduct automaticProduct, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(onSuccessCommand, "onSuccessCommand");
        Intrinsics.checkNotNullParameter(onCancelCommand, "onCancelCommand");
        Intrinsics.checkNotNullParameter(automaticProduct, "automaticProduct");
        this.f64454a = card;
        this.f64455b = z;
        this.f64456c = onSuccessCommand;
        this.d = onCancelCommand;
        this.e = navigationIconConfig;
        this.f = automaticProduct;
        this.f64457g = z3;
        this.f64458h = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddToGooglePayViewControllerContract$InputData)) {
            return false;
        }
        AddToGooglePayViewControllerContract$InputData addToGooglePayViewControllerContract$InputData = (AddToGooglePayViewControllerContract$InputData) obj2;
        return Intrinsics.f(this.f64454a, addToGooglePayViewControllerContract$InputData.f64454a) && this.f64455b == addToGooglePayViewControllerContract$InputData.f64455b && Intrinsics.f(this.f64456c, addToGooglePayViewControllerContract$InputData.f64456c) && Intrinsics.f(this.d, addToGooglePayViewControllerContract$InputData.d) && Intrinsics.f(this.e, addToGooglePayViewControllerContract$InputData.e) && Intrinsics.f(this.f, addToGooglePayViewControllerContract$InputData.f) && this.f64457g == addToGooglePayViewControllerContract$InputData.f64457g && this.f64458h == addToGooglePayViewControllerContract$InputData.f64458h;
    }

    public final int hashCode() {
        int iA = n.a(this.d, n.a(this.f64456c, j6.a.c(this.f64454a.hashCode() * 31, 31, this.f64455b), 31), 31);
        NavigationIconConfig navigationIconConfig = this.e;
        return Boolean.hashCode(this.f64458h) + j6.a.c(l.a((iA + (navigationIconConfig == null ? 0 : navigationIconConfig.hashCode())) * 31, 31, this.f), 31, this.f64457g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64454a);
        dest.writeInt(this.f64455b ? 1 : 0);
        dest.writeParcelable(this.f64456c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f64457g ? 1 : 0);
        dest.writeInt(this.f64458h ? 1 : 0);
    }
}
