package com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/hub/issues/renewal/action/PetRenewalActionContract$RenewalOptInAction", "Lmm/a;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PetRenewalActionContract$RenewalOptInAction implements mm.a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<PetRenewalActionContract$RenewalOptInAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76339c;
    public final boolean d;
    public final NaviCommand e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new PetRenewalActionContract$RenewalOptInAction(string, string2, z3, parcel.readInt() == 0 ? z : true, (NaviCommand) parcel.readParcelable(PetRenewalActionContract$RenewalOptInAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PetRenewalActionContract$RenewalOptInAction[i];
        }
    }

    public PetRenewalActionContract$RenewalOptInAction(String petId, String str, boolean z, boolean z3, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        this.f76337a = petId;
        this.f76338b = str;
        this.f76339c = z;
        this.d = z3;
        this.e = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PetRenewalActionContract$RenewalOptInAction)) {
            return false;
        }
        PetRenewalActionContract$RenewalOptInAction petRenewalActionContract$RenewalOptInAction = (PetRenewalActionContract$RenewalOptInAction) obj2;
        return Intrinsics.f(this.f76337a, petRenewalActionContract$RenewalOptInAction.f76337a) && Intrinsics.f(this.f76338b, petRenewalActionContract$RenewalOptInAction.f76338b) && this.f76339c == petRenewalActionContract$RenewalOptInAction.f76339c && this.d == petRenewalActionContract$RenewalOptInAction.d && Intrinsics.f(this.e, petRenewalActionContract$RenewalOptInAction.e);
    }

    public final int hashCode() {
        int iHashCode = this.f76337a.hashCode() * 31;
        String str = this.f76338b;
        int iC = j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f76339c), 31, this.d);
        NaviCommand naviCommand = this.e;
        return iC + (naviCommand != null ? naviCommand.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76337a);
        dest.writeString(this.f76338b);
        dest.writeInt(this.f76339c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
    }
}
