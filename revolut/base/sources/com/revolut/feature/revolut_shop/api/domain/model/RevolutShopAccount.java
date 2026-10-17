package com.revolut.feature.revolut_shop.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolut_shop/api/domain/model/RevolutShopAccount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutShopAccount implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f84200c;
    public final String d;
    public final boolean e;

    @NotNull
    public static final Parcelable.Creator<RevolutShopAccount> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutShopAccount(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutShopAccount[i];
        }
    }

    public RevolutShopAccount(String id10, String str, d balance, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f84198a = id10;
        this.f84199b = str;
        this.f84200c = balance;
        this.d = str2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutShopAccount)) {
            return false;
        }
        RevolutShopAccount revolutShopAccount = (RevolutShopAccount) obj2;
        return Intrinsics.f(this.f84198a, revolutShopAccount.f84198a) && Intrinsics.f(this.f84199b, revolutShopAccount.f84199b) && Intrinsics.f(this.f84200c, revolutShopAccount.f84200c) && Intrinsics.f(this.d, revolutShopAccount.d) && this.e == revolutShopAccount.e;
    }

    public final int hashCode() {
        int iHashCode = this.f84198a.hashCode() * 31;
        String str = this.f84199b;
        int iC = v7.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f84200c);
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84198a);
        dest.writeString(this.f84199b);
        dest.writeSerializable(this.f84200c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
    }
}
