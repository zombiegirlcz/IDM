package com.revolut.feature.shared.savings.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ScreensConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreensConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScreensConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductGroupOptions f86685a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreensConfig(parcel.readInt() == 0 ? null : ProductGroupOptions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreensConfig[i];
        }
    }

    public ScreensConfig(ProductGroupOptions productGroupOptions) {
        this.f86685a = productGroupOptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ScreensConfig) && Intrinsics.f(this.f86685a, ((ScreensConfig) obj2).f86685a);
    }

    public final int hashCode() {
        ProductGroupOptions productGroupOptions = this.f86685a;
        if (productGroupOptions == null) {
            return 0;
        }
        return productGroupOptions.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ProductGroupOptions productGroupOptions = this.f86685a;
        if (productGroupOptions == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productGroupOptions.writeToParcel(dest, i);
        }
    }
}
