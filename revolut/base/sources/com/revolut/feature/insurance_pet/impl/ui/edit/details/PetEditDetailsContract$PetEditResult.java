package com.revolut.feature.insurance_pet.impl.ui.edit.details;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/edit/details/PetEditDetailsContract$PetEditResult", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PetEditDetailsContract$PetEditResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PetEditDetailsContract$PetEditResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f76293c;
    public final z d;
    public final h e;
    public final PetBreedDetailsContract$BreedParam f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DOBInputData f76294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AmountData f76295h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PetEditDetailsContract$PetEditResult(parcel.readString(), parcel.readString(), c0.valueOf(parcel.readString()), z.valueOf(parcel.readString()), h.valueOf(parcel.readString()), PetBreedDetailsContract$BreedParam.CREATOR.createFromParcel(parcel), (DOBInputData) parcel.readParcelable(PetEditDetailsContract$PetEditResult.class.getClassLoader()), AmountData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PetEditDetailsContract$PetEditResult[i];
        }
    }

    public PetEditDetailsContract$PetEditResult(String str, String name, c0 type, z gender, h breedType, PetBreedDetailsContract$BreedParam breed, DOBInputData dob2, AmountData amount, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(breedType, "breedType");
        Intrinsics.checkNotNullParameter(breed, "breed");
        Intrinsics.checkNotNullParameter(dob2, "dob");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f76291a = str;
        this.f76292b = name;
        this.f76293c = type;
        this.d = gender;
        this.e = breedType;
        this.f = breed;
        this.f76294g = dob2;
        this.f76295h = amount;
        this.i = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PetEditDetailsContract$PetEditResult)) {
            return false;
        }
        PetEditDetailsContract$PetEditResult petEditDetailsContract$PetEditResult = (PetEditDetailsContract$PetEditResult) obj2;
        return Intrinsics.f(this.f76291a, petEditDetailsContract$PetEditResult.f76291a) && Intrinsics.f(this.f76292b, petEditDetailsContract$PetEditResult.f76292b) && this.f76293c == petEditDetailsContract$PetEditResult.f76293c && this.d == petEditDetailsContract$PetEditResult.d && this.e == petEditDetailsContract$PetEditResult.e && Intrinsics.f(this.f, petEditDetailsContract$PetEditResult.f) && Intrinsics.f(this.f76294g, petEditDetailsContract$PetEditResult.f76294g) && Intrinsics.f(this.f76295h, petEditDetailsContract$PetEditResult.f76295h) && this.i == petEditDetailsContract$PetEditResult.i;
    }

    public final int hashCode() {
        String str = this.f76291a;
        return Boolean.hashCode(this.i) + ((this.f76295h.hashCode() + ((this.f76294g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f76293c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f76292b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76291a);
        dest.writeString(this.f76292b);
        dest.writeString(this.f76293c.name());
        dest.writeString(this.d.name());
        dest.writeString(this.e.name());
        this.f.writeToParcel(dest, i);
        dest.writeParcelable(this.f76294g, i);
        this.f76295h.writeToParcel(dest, i);
        dest.writeInt(this.i ? 1 : 0);
    }
}
