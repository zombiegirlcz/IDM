package com.revolut.feature.retail.savings.impl.home.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/savings/impl/home/accounts/SavingsAccountsContract$JuniorDiscoverAccountPayload", "Lcom/revolut/feature/tab/accounts/models/ProductAccountId$Payload;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsAccountsContract$JuniorDiscoverAccountPayload implements ProductAccountId.Payload {

    @NotNull
    public static final Parcelable.Creator<SavingsAccountsContract$JuniorDiscoverAccountPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83343b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsAccountsContract$JuniorDiscoverAccountPayload(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsAccountsContract$JuniorDiscoverAccountPayload[i];
        }
    }

    public SavingsAccountsContract$JuniorDiscoverAccountPayload(String juniorId, String productId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f83342a = juniorId;
        this.f83343b = productId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsAccountsContract$JuniorDiscoverAccountPayload)) {
            return false;
        }
        SavingsAccountsContract$JuniorDiscoverAccountPayload savingsAccountsContract$JuniorDiscoverAccountPayload = (SavingsAccountsContract$JuniorDiscoverAccountPayload) obj2;
        return Intrinsics.f(this.f83342a, savingsAccountsContract$JuniorDiscoverAccountPayload.f83342a) && Intrinsics.f(this.f83343b, savingsAccountsContract$JuniorDiscoverAccountPayload.f83343b);
    }

    public final int hashCode() {
        return this.f83343b.hashCode() + (this.f83342a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83342a);
        dest.writeString(this.f83343b);
    }
}
