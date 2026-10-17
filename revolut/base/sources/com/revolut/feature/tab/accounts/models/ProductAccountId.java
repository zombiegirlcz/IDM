package com.revolut.feature.tab.accounts.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/ProductAccountId;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Payload", "a", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductAccountId implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Payload f89730b;

    @NotNull
    public static final Parcelable.Creator<ProductAccountId> CREATOR = new b();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/models/ProductAccountId$Payload;", "Landroid/os/Parcelable;", "feature_tab_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Payload extends Parcelable {
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductAccountId(parcel.readString(), (Payload) parcel.readParcelable(ProductAccountId.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductAccountId[i];
        }
    }

    public ProductAccountId(String id10, Payload payload) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f89729a = id10;
        this.f89730b = payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductAccountId)) {
            return false;
        }
        ProductAccountId productAccountId = (ProductAccountId) obj2;
        return Intrinsics.f(this.f89729a, productAccountId.f89729a) && Intrinsics.f(this.f89730b, productAccountId.f89730b);
    }

    public final int hashCode() {
        int iHashCode = this.f89729a.hashCode() * 31;
        Payload payload = this.f89730b;
        return iHashCode + (payload == null ? 0 : payload.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89729a);
        dest.writeParcelable(this.f89730b, i);
    }
}
