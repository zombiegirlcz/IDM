package com.revolut.feature.tab.accounts.api.remove_account;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tab/accounts/api/remove_account/RemoveAccountContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemoveAccountContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RemoveAccountContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductId f89567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductAccountId f89568b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemoveAccountContract$InputData((ProductAccountId) parcel.readParcelable(RemoveAccountContract$InputData.class.getClassLoader()), (ProductId) parcel.readParcelable(RemoveAccountContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemoveAccountContract$InputData[i];
        }
    }

    public RemoveAccountContract$InputData(ProductAccountId productAccountId, ProductId productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        this.f89567a = productId;
        this.f89568b = productAccountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemoveAccountContract$InputData)) {
            return false;
        }
        RemoveAccountContract$InputData removeAccountContract$InputData = (RemoveAccountContract$InputData) obj2;
        return this.f89567a == removeAccountContract$InputData.f89567a && Intrinsics.f(this.f89568b, removeAccountContract$InputData.f89568b);
    }

    public final int hashCode() {
        return this.f89568b.hashCode() + (this.f89567a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89567a, i);
        dest.writeParcelable(this.f89568b, i);
    }
}
