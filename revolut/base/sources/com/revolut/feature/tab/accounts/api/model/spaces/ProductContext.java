package com.revolut.feature.tab.accounts.api.model.spaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pie.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/spaces/ProductContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductId f89553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductSpaceIdentifier f89554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f89555c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductContext((ProductId) parcel.readParcelable(ProductContext.class.getClassLoader()), (ProductSpaceIdentifier) parcel.readParcelable(ProductContext.class.getClassLoader()), v.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductContext[i];
        }
    }

    public ProductContext(ProductId productId, ProductSpaceIdentifier spaceIdentifier, v subSpaceIdentifier) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        this.f89553a = productId;
        this.f89554b = spaceIdentifier;
        this.f89555c = subSpaceIdentifier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductContext)) {
            return false;
        }
        ProductContext productContext = (ProductContext) obj2;
        return this.f89553a == productContext.f89553a && Intrinsics.f(this.f89554b, productContext.f89554b) && this.f89555c == productContext.f89555c;
    }

    public final int hashCode() {
        return this.f89555c.hashCode() + ((this.f89554b.hashCode() + (this.f89553a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89553a, i);
        dest.writeParcelable(this.f89554b, i);
        dest.writeString(this.f89555c.name());
    }
}
