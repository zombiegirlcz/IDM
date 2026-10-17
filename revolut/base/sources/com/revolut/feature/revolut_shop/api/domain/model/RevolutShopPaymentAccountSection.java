package com.revolut.feature.revolut_shop.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import d3c.l0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolut_shop/api/domain/model/RevolutShopPaymentAccountSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "d3c/l0", "feature_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutShopPaymentAccountSection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevolutShopPaymentAccountSection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f84201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f84202b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            l0 l0VarValueOf = l0.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RevolutShopAccount.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RevolutShopPaymentAccountSection(l0VarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutShopPaymentAccountSection[i];
        }
    }

    public RevolutShopPaymentAccountSection(l0 title, ArrayList accounts) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f84201a = title;
        this.f84202b = accounts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutShopPaymentAccountSection)) {
            return false;
        }
        RevolutShopPaymentAccountSection revolutShopPaymentAccountSection = (RevolutShopPaymentAccountSection) obj2;
        return this.f84201a == revolutShopPaymentAccountSection.f84201a && this.f84202b.equals(revolutShopPaymentAccountSection.f84202b);
    }

    public final int hashCode() {
        return this.f84202b.hashCode() + (this.f84201a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84201a.name());
        ArrayList arrayList = this.f84202b;
        dest.writeInt(arrayList.size());
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((RevolutShopAccount) it8.next()).writeToParcel(dest, i);
        }
    }
}
