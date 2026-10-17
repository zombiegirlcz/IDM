package com.revolut.feature.sca_prompt.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/sca_prompt/api/models/TrustedCompanyBeneficiary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_sca_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TrustedCompanyBeneficiary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrustedCompanyBeneficiary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85335a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrustedCompanyBeneficiary(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrustedCompanyBeneficiary[i];
        }
    }

    public TrustedCompanyBeneficiary(String companyId) {
        Intrinsics.checkNotNullParameter(companyId, "companyId");
        this.f85335a = companyId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TrustedCompanyBeneficiary) && Intrinsics.f(this.f85335a, ((TrustedCompanyBeneficiary) obj2).f85335a);
    }

    public final int hashCode() {
        return this.f85335a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85335a);
    }
}
