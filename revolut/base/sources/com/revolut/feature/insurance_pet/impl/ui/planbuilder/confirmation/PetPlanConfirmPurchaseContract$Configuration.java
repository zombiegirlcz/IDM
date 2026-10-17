package com.revolut.feature.insurance_pet.impl.ui.planbuilder.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zw7.c0;
import zw7.g0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/planbuilder/confirmation/PetPlanConfirmPurchaseContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PetPlanConfirmPurchaseContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PetPlanConfirmPurchaseContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f76365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f76366c;
    public final g0 d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PetPlanConfirmPurchaseContract$Configuration(parcel.readString(), c0.valueOf(parcel.readString()), (Date) parcel.readSerializable(), g0.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PetPlanConfirmPurchaseContract$Configuration[i];
        }
    }

    public PetPlanConfirmPurchaseContract$Configuration(String petId, c0 petType, Date policyStartDate, g0 planType, String quoteId) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(petType, "petType");
        Intrinsics.checkNotNullParameter(policyStartDate, "policyStartDate");
        Intrinsics.checkNotNullParameter(planType, "planType");
        Intrinsics.checkNotNullParameter(quoteId, "quoteId");
        this.f76364a = petId;
        this.f76365b = petType;
        this.f76366c = policyStartDate;
        this.d = planType;
        this.e = quoteId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PetPlanConfirmPurchaseContract$Configuration)) {
            return false;
        }
        PetPlanConfirmPurchaseContract$Configuration petPlanConfirmPurchaseContract$Configuration = (PetPlanConfirmPurchaseContract$Configuration) obj2;
        return Intrinsics.f(this.f76364a, petPlanConfirmPurchaseContract$Configuration.f76364a) && this.f76365b == petPlanConfirmPurchaseContract$Configuration.f76365b && Intrinsics.f(this.f76366c, petPlanConfirmPurchaseContract$Configuration.f76366c) && this.d == petPlanConfirmPurchaseContract$Configuration.d && Intrinsics.f(this.e, petPlanConfirmPurchaseContract$Configuration.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + t61.a.e(this.f76366c, (this.f76365b.hashCode() + (this.f76364a.hashCode() * 31)) * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76364a);
        dest.writeString(this.f76365b.name());
        dest.writeSerializable(this.f76366c);
        dest.writeString(this.d.name());
        dest.writeString(this.e);
    }
}
