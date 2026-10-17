package com.revolut.feature.credit.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ft3.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/api/navigation/EmptyStateFeatureConfig;", "Lcom/revolut/feature/credit/api/navigation/CreditHomeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class EmptyStateFeatureConfig implements CreditHomeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<EmptyStateFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f66171a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmptyStateFeatureConfig((q0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmptyStateFeatureConfig[i];
        }
    }

    public EmptyStateFeatureConfig(q0 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f66171a = product;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EmptyStateFeatureConfig) && Intrinsics.f(this.f66171a, ((EmptyStateFeatureConfig) obj2).f66171a);
    }

    public final int hashCode() {
        return this.f66171a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f66171a);
    }
}
