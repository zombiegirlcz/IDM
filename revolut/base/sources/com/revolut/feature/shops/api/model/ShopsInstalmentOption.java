package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import shd.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/api/model/ShopsInstalmentOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "shd/i", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsInstalmentOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShopsInstalmentOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f87050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f87052c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsInstalmentOption(i.valueOf(parcel.readString()), parcel.readString(), parcel.createStringArrayList(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsInstalmentOption[i];
        }
    }

    public ShopsInstalmentOption(i type, String termsLink, List instalmentPeriods, d minPurchaseAmount) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(termsLink, "termsLink");
        Intrinsics.checkNotNullParameter(instalmentPeriods, "instalmentPeriods");
        Intrinsics.checkNotNullParameter(minPurchaseAmount, "minPurchaseAmount");
        this.f87050a = type;
        this.f87051b = termsLink;
        this.f87052c = instalmentPeriods;
        this.d = minPurchaseAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsInstalmentOption)) {
            return false;
        }
        ShopsInstalmentOption shopsInstalmentOption = (ShopsInstalmentOption) obj2;
        return this.f87050a == shopsInstalmentOption.f87050a && Intrinsics.f(this.f87051b, shopsInstalmentOption.f87051b) && Intrinsics.f(this.f87052c, shopsInstalmentOption.f87052c) && Intrinsics.f(this.d, shopsInstalmentOption.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f87050a.hashCode() * 31, 31, this.f87051b), 31, this.f87052c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87050a.name());
        dest.writeString(this.f87051b);
        dest.writeStringList(this.f87052c);
        dest.writeSerializable(this.d);
    }
}
