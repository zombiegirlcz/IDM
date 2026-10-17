package com.revolut.sso.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/models/EmailIdentifierScreenCustomization;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmailIdentifierScreenCustomization implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f105943c;
    public final boolean d;
    public final boolean e;
    public final Clause f;

    @NotNull
    public static final Parcelable.Creator<EmailIdentifierScreenCustomization> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Class cls;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z6 = false;
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z11 = z;
            }
            Clause clause = (Clause) parcel.readParcelable(EmailIdentifierScreenCustomization.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = EmailIdentifierScreenCustomization.class;
                z4 = z3;
            } else {
                cls = EmailIdentifierScreenCustomization.class;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z = z3;
            }
            return new EmailIdentifierScreenCustomization(z6, z11, clause, z4, z, (Clause) parcel.readParcelable(cls.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmailIdentifierScreenCustomization[i];
        }
    }

    public EmailIdentifierScreenCustomization() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmailIdentifierScreenCustomization)) {
            return false;
        }
        EmailIdentifierScreenCustomization emailIdentifierScreenCustomization = (EmailIdentifierScreenCustomization) obj2;
        return this.f105941a == emailIdentifierScreenCustomization.f105941a && this.f105942b == emailIdentifierScreenCustomization.f105942b && Intrinsics.f(this.f105943c, emailIdentifierScreenCustomization.f105943c) && this.d == emailIdentifierScreenCustomization.d && this.e == emailIdentifierScreenCustomization.e && Intrinsics.f(this.f, emailIdentifierScreenCustomization.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f105941a) * 31, 31, this.f105942b);
        Clause clause = this.f105943c;
        int iC2 = j6.a.c(j6.a.c((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31, this.e);
        Clause clause2 = this.f;
        return iC2 + (clause2 != null ? clause2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f105941a ? 1 : 0);
        dest.writeInt(this.f105942b ? 1 : 0);
        dest.writeParcelable(this.f105943c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }

    public EmailIdentifierScreenCustomization(boolean z, boolean z3, Clause clause, boolean z4, boolean z6, Clause clause2) {
        this.f105941a = z;
        this.f105942b = z3;
        this.f105943c = clause;
        this.d = z4;
        this.e = z6;
        this.f = clause2;
    }

    public /* synthetic */ EmailIdentifierScreenCustomization(int i) {
        this(true, true, null, true, true, null);
    }
}
