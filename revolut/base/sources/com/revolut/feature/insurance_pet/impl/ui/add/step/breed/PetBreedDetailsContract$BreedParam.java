package com.revolut.feature.insurance_pet.impl.ui.add.step.breed;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/add/step/breed/PetBreedDetailsContract$BreedParam", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PetBreedDetailsContract$BreedParam implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<PetBreedDetailsContract$BreedParam> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76234c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PetBreedDetailsContract$BreedParam(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PetBreedDetailsContract$BreedParam[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PetBreedDetailsContract$BreedParam() {
        String str = null;
        this(str, str, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PetBreedDetailsContract$BreedParam)) {
            return false;
        }
        PetBreedDetailsContract$BreedParam petBreedDetailsContract$BreedParam = (PetBreedDetailsContract$BreedParam) obj2;
        return Intrinsics.f(this.f76232a, petBreedDetailsContract$BreedParam.f76232a) && Intrinsics.f(this.f76233b, petBreedDetailsContract$BreedParam.f76233b) && this.f76234c == petBreedDetailsContract$BreedParam.f76234c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76234c) + p.a.c(this.f76232a.hashCode() * 31, 31, this.f76233b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76232a);
        dest.writeString(this.f76233b);
        dest.writeInt(this.f76234c ? 1 : 0);
    }

    public PetBreedDetailsContract$BreedParam(String code, String displayName, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f76232a = code;
        this.f76233b = displayName;
        this.f76234c = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PetBreedDetailsContract$BreedParam(String str, String str2, int i) {
        if ((i & 1) != 0) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        if ((i & 2) != 0) {
            m70.a.c(t0.f186434a);
            str2 = "";
        }
        this(str, str2, false);
    }
}
