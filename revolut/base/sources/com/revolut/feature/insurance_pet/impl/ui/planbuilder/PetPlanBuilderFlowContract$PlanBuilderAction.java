package com.revolut.feature.insurance_pet.impl.ui.planbuilder;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zw7.c0;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/planbuilder/PetPlanBuilderFlowContract$PlanBuilderAction", "Lmm/a;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PetPlanBuilderFlowContract$PlanBuilderAction implements mm.a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PetPlanBuilderFlowContract$PlanBuilderAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f76355c;
    public final z d;
    public final String e;
    public final Date f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PetPlanBuilderFlowContract$PlanBuilderAction(parcel.readString(), parcel.readString(), c0.valueOf(parcel.readString()), z.valueOf(parcel.readString()), parcel.readString(), (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PetPlanBuilderFlowContract$PlanBuilderAction[i];
        }
    }

    public PetPlanBuilderFlowContract$PlanBuilderAction(String petId, String petName, c0 petType, z petGender, String breedDisplayName, Date policyStartDate) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(petName, "petName");
        Intrinsics.checkNotNullParameter(petType, "petType");
        Intrinsics.checkNotNullParameter(petGender, "petGender");
        Intrinsics.checkNotNullParameter(breedDisplayName, "breedDisplayName");
        Intrinsics.checkNotNullParameter(policyStartDate, "policyStartDate");
        this.f76353a = petId;
        this.f76354b = petName;
        this.f76355c = petType;
        this.d = petGender;
        this.e = breedDisplayName;
        this.f = policyStartDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PetPlanBuilderFlowContract$PlanBuilderAction)) {
            return false;
        }
        PetPlanBuilderFlowContract$PlanBuilderAction petPlanBuilderFlowContract$PlanBuilderAction = (PetPlanBuilderFlowContract$PlanBuilderAction) obj2;
        return Intrinsics.f(this.f76353a, petPlanBuilderFlowContract$PlanBuilderAction.f76353a) && Intrinsics.f(this.f76354b, petPlanBuilderFlowContract$PlanBuilderAction.f76354b) && this.f76355c == petPlanBuilderFlowContract$PlanBuilderAction.f76355c && this.d == petPlanBuilderFlowContract$PlanBuilderAction.d && Intrinsics.f(this.e, petPlanBuilderFlowContract$PlanBuilderAction.e) && Intrinsics.f(this.f, petPlanBuilderFlowContract$PlanBuilderAction.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c((this.d.hashCode() + ((this.f76355c.hashCode() + p.a.c(this.f76353a.hashCode() * 31, 31, this.f76354b)) * 31)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76353a);
        dest.writeString(this.f76354b);
        dest.writeString(this.f76355c.name());
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
    }
}
