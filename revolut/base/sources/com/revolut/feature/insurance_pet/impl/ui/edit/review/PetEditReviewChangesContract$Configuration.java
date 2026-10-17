package com.revolut.feature.insurance_pet.impl.ui.edit.review;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/edit/review/PetEditReviewChangesContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PetEditReviewChangesContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PetEditReviewChangesContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76309a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PetEditReviewChangesContract$Configuration(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PetEditReviewChangesContract$Configuration[i];
        }
    }

    public PetEditReviewChangesContract$Configuration(String petId) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        this.f76309a = petId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PetEditReviewChangesContract$Configuration) && Intrinsics.f(this.f76309a, ((PetEditReviewChangesContract$Configuration) obj2).f76309a);
    }

    public final int hashCode() {
        return this.f76309a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76309a);
    }
}
