package com.revolut.feature.insurance_pet.impl.ui.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsContract$BreedParam;
import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zw7.c0;
import zw7.h;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/edit/PetEditFlowContract$Configuration", "Landroid/os/Parcelable;", "<init>", "()V", "EditPetFields", "EditPet", "EditQuote", "Lcom/revolut/feature/insurance_pet/impl/ui/edit/PetEditFlowContract$Configuration$EditPet;", "Lcom/revolut/feature/insurance_pet/impl/ui/edit/PetEditFlowContract$Configuration$EditPetFields;", "Lcom/revolut/feature/insurance_pet/impl/ui/edit/PetEditFlowContract$Configuration$EditQuote;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PetEditFlowContract$Configuration implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/edit/PetEditFlowContract$Configuration$EditPet;", "Lcom/revolut/feature/insurance_pet/impl/ui/edit/PetEditFlowContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditPet extends PetEditFlowContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<EditPet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76275a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditPet(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditPet[i];
            }
        }

        public EditPet(String petId) {
            Intrinsics.checkNotNullParameter(petId, "petId");
            this.f76275a = petId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditPet) && Intrinsics.f(this.f76275a, ((EditPet) obj2).f76275a);
        }

        public final int hashCode() {
            return this.f76275a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76275a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/edit/PetEditFlowContract$Configuration$EditPetFields;", "Lcom/revolut/feature/insurance_pet/impl/ui/edit/PetEditFlowContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditPetFields extends PetEditFlowContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<EditPetFields> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f76276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final z f76278c;
        public final h d;
        public final PetBreedDetailsContract$BreedParam e;
        public final DOBInputData f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AmountData f76279g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f76280h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditPetFields(c0.valueOf(parcel.readString()), parcel.readString(), z.valueOf(parcel.readString()), h.valueOf(parcel.readString()), PetBreedDetailsContract$BreedParam.CREATOR.createFromParcel(parcel), (DOBInputData) parcel.readParcelable(EditPetFields.class.getClassLoader()), AmountData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditPetFields[i];
            }
        }

        public EditPetFields(c0 petType, String name, z gender, h breedType, PetBreedDetailsContract$BreedParam breed, DOBInputData dob2, AmountData amount, boolean z) {
            Intrinsics.checkNotNullParameter(petType, "petType");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(gender, "gender");
            Intrinsics.checkNotNullParameter(breedType, "breedType");
            Intrinsics.checkNotNullParameter(breed, "breed");
            Intrinsics.checkNotNullParameter(dob2, "dob");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f76276a = petType;
            this.f76277b = name;
            this.f76278c = gender;
            this.d = breedType;
            this.e = breed;
            this.f = dob2;
            this.f76279g = amount;
            this.f76280h = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditPetFields)) {
                return false;
            }
            EditPetFields editPetFields = (EditPetFields) obj2;
            return this.f76276a == editPetFields.f76276a && Intrinsics.f(this.f76277b, editPetFields.f76277b) && this.f76278c == editPetFields.f76278c && this.d == editPetFields.d && Intrinsics.f(this.e, editPetFields.e) && Intrinsics.f(this.f, editPetFields.f) && Intrinsics.f(this.f76279g, editPetFields.f76279g) && this.f76280h == editPetFields.f76280h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76280h) + ((this.f76279g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f76278c.hashCode() + p.a.c(this.f76276a.hashCode() * 31, 31, this.f76277b)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76276a.name());
            dest.writeString(this.f76277b);
            dest.writeString(this.f76278c.name());
            dest.writeString(this.d.name());
            this.e.writeToParcel(dest, i);
            dest.writeParcelable(this.f, i);
            this.f76279g.writeToParcel(dest, i);
            dest.writeInt(this.f76280h ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/edit/PetEditFlowContract$Configuration$EditQuote;", "Lcom/revolut/feature/insurance_pet/impl/ui/edit/PetEditFlowContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditQuote extends PetEditFlowContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<EditQuote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76281a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditQuote(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditQuote[i];
            }
        }

        public EditQuote(String petId) {
            Intrinsics.checkNotNullParameter(petId, "petId");
            this.f76281a = petId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditQuote) && Intrinsics.f(this.f76281a, ((EditQuote) obj2).f76281a);
        }

        public final int hashCode() {
            return this.f76281a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76281a);
        }
    }

    private PetEditFlowContract$Configuration() {
    }
}
