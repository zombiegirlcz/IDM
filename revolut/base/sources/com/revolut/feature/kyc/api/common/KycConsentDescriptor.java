package com.revolut.feature.kyc.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.k;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/api/common/KycConsentDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Lns8/a;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KycConsentDescriptor implements ParcelableControllerDescriptor<ns8.a> {

    @NotNull
    public static final Parcelable.Creator<KycConsentDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f77469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f77470b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KycConsentDescriptor(k.valueOf(parcel.readString()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KycConsentDescriptor[i];
        }
    }

    public KycConsentDescriptor(k kycConsent, b countryCode) {
        Intrinsics.checkNotNullParameter(kycConsent, "kycConsent");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f77469a = kycConsent;
        this.f77470b = countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getF77470b() {
        return this.f77470b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getF77469a() {
        return this.f77469a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KycConsentDescriptor)) {
            return false;
        }
        KycConsentDescriptor kycConsentDescriptor = (KycConsentDescriptor) obj2;
        return this.f77469a == kycConsentDescriptor.f77469a && Intrinsics.f(this.f77470b, kycConsentDescriptor.f77470b);
    }

    public final int hashCode() {
        return this.f77470b.f297794a.hashCode() + (this.f77469a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77469a.name());
        dest.writeSerializable(this.f77470b);
    }
}
