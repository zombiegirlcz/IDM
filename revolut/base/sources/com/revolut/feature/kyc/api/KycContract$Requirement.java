package com.revolut.feature.kyc.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/api/KycContract$Requirement", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KycContract$Requirement implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KycContract$Requirement> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77468b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KycContract$Requirement(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KycContract$Requirement[i];
        }
    }

    public KycContract$Requirement(boolean z, String skipResultKey) {
        Intrinsics.checkNotNullParameter(skipResultKey, "skipResultKey");
        this.f77467a = z;
        this.f77468b = skipResultKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KycContract$Requirement)) {
            return false;
        }
        KycContract$Requirement kycContract$Requirement = (KycContract$Requirement) obj2;
        return this.f77467a == kycContract$Requirement.f77467a && Intrinsics.f(this.f77468b, kycContract$Requirement.f77468b);
    }

    public final int hashCode() {
        return this.f77468b.hashCode() + (Boolean.hashCode(this.f77467a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f77467a ? 1 : 0);
        dest.writeString(this.f77468b);
    }

    public /* synthetic */ KycContract$Requirement(boolean z) {
        this(z, "KYC_FLOW_SKIP");
    }
}
