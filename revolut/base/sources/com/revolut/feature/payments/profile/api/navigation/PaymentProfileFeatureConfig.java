package com.revolut.feature.payments.profile.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/profile/api/navigation/PaymentProfileFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ew9/a", "retail_feature_payments_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentProfileFeatureConfig implements FeatureConfig, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentProfileFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ew9.a f79619a;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentProfileFeatureConfig(parcel.readInt() == 0 ? null : ew9.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentProfileFeatureConfig[i];
        }
    }

    public PaymentProfileFeatureConfig(ew9.a aVar) {
        this.f79619a = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PaymentProfileFeatureConfig) && this.f79619a == ((PaymentProfileFeatureConfig) obj2).f79619a;
    }

    public final int hashCode() {
        ew9.a aVar = this.f79619a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ew9.a aVar = this.f79619a;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }

    public PaymentProfileFeatureConfig() {
        this(null);
    }
}
