package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/Identification;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Identification implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Identification> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryIdentificationType f62022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62023b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Identification((BeneficiaryIdentificationType) parcel.readParcelable(Identification.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Identification[i];
        }
    }

    public Identification(BeneficiaryIdentificationType beneficiaryIdentificationType, String str) {
        this.f62022a = beneficiaryIdentificationType;
        this.f62023b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Identification)) {
            return false;
        }
        Identification identification = (Identification) obj2;
        return this.f62022a == identification.f62022a && Intrinsics.f(this.f62023b, identification.f62023b);
    }

    public final int hashCode() {
        BeneficiaryIdentificationType beneficiaryIdentificationType = this.f62022a;
        int iHashCode = (beneficiaryIdentificationType == null ? 0 : beneficiaryIdentificationType.hashCode()) * 31;
        String str = this.f62023b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62022a, i);
        dest.writeString(this.f62023b);
    }
}
