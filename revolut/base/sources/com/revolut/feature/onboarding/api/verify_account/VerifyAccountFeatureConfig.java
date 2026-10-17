package com.revolut.feature.onboarding.api.verify_account;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/verify_account/VerifyAccountFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyAccountFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<VerifyAccountFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f78233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f78234c;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VerifyAccountFeatureConfig(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VerifyAccountFeatureConfig[i];
        }
    }

    public VerifyAccountFeatureConfig(Integer num, Integer num2, boolean z) {
        this.f78232a = z;
        this.f78233b = num;
        this.f78234c = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VerifyAccountFeatureConfig)) {
            return false;
        }
        VerifyAccountFeatureConfig verifyAccountFeatureConfig = (VerifyAccountFeatureConfig) obj2;
        return this.f78232a == verifyAccountFeatureConfig.f78232a && Intrinsics.f(this.f78233b, verifyAccountFeatureConfig.f78233b) && Intrinsics.f(this.f78234c, verifyAccountFeatureConfig.f78234c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f78232a) * 31;
        Integer num = this.f78233b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f78234c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f78232a ? 1 : 0);
        Integer num = this.f78233b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f78234c;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
    }

    public VerifyAccountFeatureConfig() {
        this(null, null, false);
    }
}
