package com.revolut.feature.insurance_pet.impl.ui.edit.details;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/edit/details/PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction", "Lmm/a;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction implements mm.a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PetEditDetailsContract$PetEditResult f76287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76289c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction(PetEditDetailsContract$PetEditResult.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction[i];
        }
    }

    public PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction(PetEditDetailsContract$PetEditResult petEdit, String str, String quoteRequestId, d amountDue) {
        Intrinsics.checkNotNullParameter(petEdit, "petEdit");
        Intrinsics.checkNotNullParameter(quoteRequestId, "quoteRequestId");
        Intrinsics.checkNotNullParameter(amountDue, "amountDue");
        this.f76287a = petEdit;
        this.f76288b = str;
        this.f76289c = quoteRequestId;
        this.d = amountDue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction)) {
            return false;
        }
        PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction petEditDetailsContract$ConfirmPetEditUpdateQuoteAction = (PetEditDetailsContract$ConfirmPetEditUpdateQuoteAction) obj2;
        return Intrinsics.f(this.f76287a, petEditDetailsContract$ConfirmPetEditUpdateQuoteAction.f76287a) && Intrinsics.f(this.f76288b, petEditDetailsContract$ConfirmPetEditUpdateQuoteAction.f76288b) && Intrinsics.f(this.f76289c, petEditDetailsContract$ConfirmPetEditUpdateQuoteAction.f76289c) && Intrinsics.f(this.d, petEditDetailsContract$ConfirmPetEditUpdateQuoteAction.d);
    }

    public final int hashCode() {
        int iHashCode = this.f76287a.hashCode() * 31;
        String str = this.f76288b;
        return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f76289c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f76287a.writeToParcel(dest, i);
        dest.writeString(this.f76288b);
        dest.writeString(this.f76289c);
        dest.writeSerializable(this.d);
    }
}
