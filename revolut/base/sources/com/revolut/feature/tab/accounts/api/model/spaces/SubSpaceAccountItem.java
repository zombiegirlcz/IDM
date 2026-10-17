package com.revolut.feature.tab.accounts.api.model.spaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/spaces/SubSpaceAccountItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubSpaceAccountItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SubSpaceAccountItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductContext f89559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductAccount f89560b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubSpaceAccountItem(ProductContext.CREATOR.createFromParcel(parcel), (ProductAccount) parcel.readParcelable(SubSpaceAccountItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubSpaceAccountItem[i];
        }
    }

    public SubSpaceAccountItem(ProductContext context, ProductAccount productAccount) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productAccount, "productAccount");
        this.f89559a = context;
        this.f89560b = productAccount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubSpaceAccountItem)) {
            return false;
        }
        SubSpaceAccountItem subSpaceAccountItem = (SubSpaceAccountItem) obj2;
        return Intrinsics.f(this.f89559a, subSpaceAccountItem.f89559a) && Intrinsics.f(this.f89560b, subSpaceAccountItem.f89560b);
    }

    public final int hashCode() {
        return this.f89560b.hashCode() + (this.f89559a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f89559a.writeToParcel(dest, i);
        dest.writeParcelable(this.f89560b, i);
    }
}
