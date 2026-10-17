package com.revolut.feature.tax_residency.impl.v2.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/DeclaredTaxResidency;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kpe/b", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeclaredTaxResidency implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeclaredTaxResidency> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f90160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExemptionReason f90161c;
    public final kpe.b d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f90163h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            ExemptionReason exemptionReasonCreateFromParcel = parcel.readInt() == 0 ? null : ExemptionReason.CREATOR.createFromParcel(parcel);
            kpe.b bVarValueOf = parcel.readInt() != 0 ? kpe.b.valueOf(parcel.readString()) : null;
            boolean z3 = true;
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new DeclaredTaxResidency(bVar, boolValueOf, exemptionReasonCreateFromParcel, bVarValueOf, string, z3, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeclaredTaxResidency[i];
        }
    }

    public DeclaredTaxResidency(b countryCode, Boolean bool, ExemptionReason exemptionReason, kpe.b bVar, String str, boolean z, boolean z3, String str2) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f90159a = countryCode;
        this.f90160b = bool;
        this.f90161c = exemptionReason;
        this.d = bVar;
        this.e = str;
        this.f = z;
        this.f90162g = z3;
        this.f90163h = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeclaredTaxResidency)) {
            return false;
        }
        DeclaredTaxResidency declaredTaxResidency = (DeclaredTaxResidency) obj2;
        return Intrinsics.f(this.f90159a, declaredTaxResidency.f90159a) && Intrinsics.f(this.f90160b, declaredTaxResidency.f90160b) && this.f90161c == declaredTaxResidency.f90161c && this.d == declaredTaxResidency.d && Intrinsics.f(this.e, declaredTaxResidency.e) && this.f == declaredTaxResidency.f && this.f90162g == declaredTaxResidency.f90162g && Intrinsics.f(this.f90163h, declaredTaxResidency.f90163h);
    }

    public final int hashCode() {
        int iHashCode = this.f90159a.f297794a.hashCode() * 31;
        Boolean bool = this.f90160b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ExemptionReason exemptionReason = this.f90161c;
        int iHashCode3 = (iHashCode2 + (exemptionReason == null ? 0 : exemptionReason.hashCode())) * 31;
        kpe.b bVar = this.d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.e;
        int iC = j6.a.c(j6.a.c((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.f90162g);
        String str2 = this.f90163h;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90159a);
        Boolean bool = this.f90160b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        ExemptionReason exemptionReason = this.f90161c;
        if (exemptionReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            exemptionReason.writeToParcel(dest, i);
        }
        kpe.b bVar = this.d;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f90162g ? 1 : 0);
        dest.writeString(this.f90163h);
    }
}
