package com.revolut.feature.wealth.private_companies.api.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/private_companies/api/ui/details/PrivateCompanyDetailsContract$PrivateCompanyDetailsScreenConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_companies_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PrivateCompanyDetailsContract$PrivateCompanyDetailsScreenConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PrivateCompanyDetailsContract$PrivateCompanyDetailsScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95722a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PrivateCompanyDetailsContract$PrivateCompanyDetailsScreenConfig(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PrivateCompanyDetailsContract$PrivateCompanyDetailsScreenConfig[i];
        }
    }

    public PrivateCompanyDetailsContract$PrivateCompanyDetailsScreenConfig(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        this.f95722a = securityRef;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PrivateCompanyDetailsContract$PrivateCompanyDetailsScreenConfig) && Intrinsics.f(this.f95722a, ((PrivateCompanyDetailsContract$PrivateCompanyDetailsScreenConfig) obj2).f95722a);
    }

    public final int hashCode() {
        return this.f95722a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95722a);
    }
}
