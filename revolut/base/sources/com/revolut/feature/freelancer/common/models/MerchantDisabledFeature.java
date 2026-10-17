package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.b0;
import lr6.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/MerchantDisabledFeature;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MerchantDisabledFeature implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MerchantDisabledFeature> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f73335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f73336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MerchantFeatureEnableStep f73337c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MerchantDisabledFeature(b0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : e0.valueOf(parcel.readString()), (MerchantFeatureEnableStep) parcel.readParcelable(MerchantDisabledFeature.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MerchantDisabledFeature[i];
        }
    }

    public MerchantDisabledFeature(b0 feature, e0 e0Var, MerchantFeatureEnableStep merchantFeatureEnableStep) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f73335a = feature;
        this.f73336b = e0Var;
        this.f73337c = merchantFeatureEnableStep;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MerchantDisabledFeature)) {
            return false;
        }
        MerchantDisabledFeature merchantDisabledFeature = (MerchantDisabledFeature) obj2;
        return this.f73335a == merchantDisabledFeature.f73335a && this.f73336b == merchantDisabledFeature.f73336b && Intrinsics.f(this.f73337c, merchantDisabledFeature.f73337c);
    }

    public final int hashCode() {
        int iHashCode = this.f73335a.hashCode() * 31;
        e0 e0Var = this.f73336b;
        int iHashCode2 = (iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        MerchantFeatureEnableStep merchantFeatureEnableStep = this.f73337c;
        return iHashCode2 + (merchantFeatureEnableStep != null ? merchantFeatureEnableStep.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73335a.name());
        e0 e0Var = this.f73336b;
        if (e0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(e0Var.name());
        }
        dest.writeParcelable(this.f73337c, i);
    }
}
