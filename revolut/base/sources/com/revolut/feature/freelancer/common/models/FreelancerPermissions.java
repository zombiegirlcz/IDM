package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.e0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerPermissions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerPermissions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerPermissions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f73321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f73322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73323c;
    public final e0 d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            e0 e0Var;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z12 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            e0 e0VarValueOf = parcel.readInt() == 0 ? null : e0.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                e0 e0Var2 = e0VarValueOf;
                z6 = z4;
                e0Var = e0Var2;
            } else {
                e0Var = e0VarValueOf;
                z6 = z;
            }
            return new FreelancerPermissions(z11, z12, z3, e0Var, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerPermissions[i];
        }
    }

    public FreelancerPermissions(boolean z, boolean z3, boolean z4, e0 e0Var, boolean z6) {
        this.f73321a = z;
        this.f73322b = z3;
        this.f73323c = z4;
        this.d = e0Var;
        this.e = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerPermissions)) {
            return false;
        }
        FreelancerPermissions freelancerPermissions = (FreelancerPermissions) obj2;
        return this.f73321a == freelancerPermissions.f73321a && this.f73322b == freelancerPermissions.f73322b && this.f73323c == freelancerPermissions.f73323c && this.d == freelancerPermissions.d && this.e == freelancerPermissions.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.f73321a) * 31, 31, this.f73322b), 31, this.f73323c);
        e0 e0Var = this.d;
        return Boolean.hashCode(this.e) + ((iC + (e0Var == null ? 0 : e0Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f73321a ? 1 : 0);
        dest.writeInt(this.f73322b ? 1 : 0);
        dest.writeInt(this.f73323c ? 1 : 0);
        e0 e0Var = this.d;
        if (e0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(e0Var.name());
        }
        dest.writeInt(this.e ? 1 : 0);
    }
}
