package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.sso.api.models.PasswordEvidenceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/models/PasswordScreenCustomization;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PasswordScreenCustomization implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PasswordScreenCustomization> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasswordEvidenceType f105964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f105965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f105966c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PasswordEvidenceType passwordEvidenceType = (PasswordEvidenceType) parcel.readParcelable(PasswordScreenCustomization.class.getClassLoader());
            Clause clause = (Clause) parcel.readParcelable(PasswordScreenCustomization.class.getClassLoader());
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new PasswordScreenCustomization(passwordEvidenceType, clause, z4, z6, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PasswordScreenCustomization[i];
        }
    }

    public PasswordScreenCustomization() {
        this(31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PasswordScreenCustomization)) {
            return false;
        }
        PasswordScreenCustomization passwordScreenCustomization = (PasswordScreenCustomization) obj2;
        return Intrinsics.f(this.f105964a, passwordScreenCustomization.f105964a) && Intrinsics.f(this.f105965b, passwordScreenCustomization.f105965b) && this.f105966c == passwordScreenCustomization.f105966c && this.d == passwordScreenCustomization.d && this.e == passwordScreenCustomization.e;
    }

    public final int hashCode() {
        int iHashCode = this.f105964a.hashCode() * 31;
        Clause clause = this.f105965b;
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f105966c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105964a, i);
        dest.writeParcelable(this.f105965b, i);
        dest.writeInt(this.f105966c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }

    public PasswordScreenCustomization(PasswordEvidenceType defaultPasswordEvidenceType, Clause clause, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(defaultPasswordEvidenceType, "defaultPasswordEvidenceType");
        this.f105964a = defaultPasswordEvidenceType;
        this.f105965b = clause;
        this.f105966c = z;
        this.d = z3;
        this.e = z4;
    }

    public /* synthetic */ PasswordScreenCustomization(int i) {
        this(PasswordEvidenceType.Passcode.f105962a, null, true, (i & 8) != 0, false);
    }
}
