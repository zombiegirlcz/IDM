package com.revolut.feature.insurance_pet.impl.ui.profile.dochistory;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zw7.n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/profile/dochistory/PetDocumentHistoryContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PetDocumentHistoryContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PetDocumentHistoryContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f76386b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PetDocumentHistoryContract$Configuration(parcel.readString(), n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PetDocumentHistoryContract$Configuration[i];
        }
    }

    public PetDocumentHistoryContract$Configuration(String policyId, n documentType) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f76385a = policyId;
        this.f76386b = documentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PetDocumentHistoryContract$Configuration)) {
            return false;
        }
        PetDocumentHistoryContract$Configuration petDocumentHistoryContract$Configuration = (PetDocumentHistoryContract$Configuration) obj2;
        return Intrinsics.f(this.f76385a, petDocumentHistoryContract$Configuration.f76385a) && this.f76386b == petDocumentHistoryContract$Configuration.f76386b;
    }

    public final int hashCode() {
        return this.f76386b.hashCode() + (this.f76385a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76385a);
        dest.writeString(this.f76386b.name());
    }
}
