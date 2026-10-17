package com.revolut.feature.credit.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ft3.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/api/navigation/CreditApplicationDashboardFeatureConfig;", "Lcom/revolut/feature/credit/api/navigation/CreditHomeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class CreditApplicationDashboardFeatureConfig implements CreditHomeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationDashboardFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f66169b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationDashboardFeatureConfig(parcel.readString(), (q0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationDashboardFeatureConfig[i];
        }
    }

    public CreditApplicationDashboardFeatureConfig(String applicationId, q0 product) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f66168a = applicationId;
        this.f66169b = product;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationDashboardFeatureConfig)) {
            return false;
        }
        CreditApplicationDashboardFeatureConfig creditApplicationDashboardFeatureConfig = (CreditApplicationDashboardFeatureConfig) obj2;
        return Intrinsics.f(this.f66168a, creditApplicationDashboardFeatureConfig.f66168a) && Intrinsics.f(this.f66169b, creditApplicationDashboardFeatureConfig.f66169b);
    }

    public final int hashCode() {
        return this.f66169b.hashCode() + (this.f66168a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66168a);
        dest.writeSerializable(this.f66169b);
    }
}
