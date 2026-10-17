package com.revolut.feature.kyc.impl.screens.documentid_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/screens/documentid_input/KYCDocumentIdInputScreenContract$FormField", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KYCDocumentIdInputScreenContract$FormField implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KYCDocumentIdInputScreenContract$FormField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my8.b f77860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77862c;
    public final boolean d;
    public final Clause e;
    public final Clause f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KYCDocumentIdInputScreenContract$FormField((my8.b) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (Clause) parcel.readParcelable(KYCDocumentIdInputScreenContract$FormField.class.getClassLoader()), (Clause) parcel.readParcelable(KYCDocumentIdInputScreenContract$FormField.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KYCDocumentIdInputScreenContract$FormField[i];
        }
    }

    public KYCDocumentIdInputScreenContract$FormField(my8.b docField, String value, String str, boolean z, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(docField, "docField");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f77860a = docField;
        this.f77861b = value;
        this.f77862c = str;
        this.d = z;
        this.e = clause;
        this.f = clause2;
    }

    public static KYCDocumentIdInputScreenContract$FormField a(KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormField, String str, String str2, boolean z, Clause clause, Clause clause2, int i) {
        String value = str;
        my8.b docField = kYCDocumentIdInputScreenContract$FormField.f77860a;
        if ((i & 2) != 0) {
            value = kYCDocumentIdInputScreenContract$FormField.f77861b;
        }
        if ((i & 4) != 0) {
            str2 = kYCDocumentIdInputScreenContract$FormField.f77862c;
        }
        if ((i & 8) != 0) {
            z = kYCDocumentIdInputScreenContract$FormField.d;
        }
        if ((i & 16) != 0) {
            clause = kYCDocumentIdInputScreenContract$FormField.e;
        }
        if ((i & 32) != 0) {
            clause2 = kYCDocumentIdInputScreenContract$FormField.f;
        }
        Clause clause3 = clause2;
        kYCDocumentIdInputScreenContract$FormField.getClass();
        Intrinsics.checkNotNullParameter(docField, "docField");
        Intrinsics.checkNotNullParameter(value, "value");
        Clause clause4 = clause;
        boolean z3 = z;
        return new KYCDocumentIdInputScreenContract$FormField(docField, value, str2, z3, clause4, clause3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KYCDocumentIdInputScreenContract$FormField)) {
            return false;
        }
        KYCDocumentIdInputScreenContract$FormField kYCDocumentIdInputScreenContract$FormField = (KYCDocumentIdInputScreenContract$FormField) obj2;
        return Intrinsics.f(this.f77860a, kYCDocumentIdInputScreenContract$FormField.f77860a) && Intrinsics.f(this.f77861b, kYCDocumentIdInputScreenContract$FormField.f77861b) && Intrinsics.f(this.f77862c, kYCDocumentIdInputScreenContract$FormField.f77862c) && this.d == kYCDocumentIdInputScreenContract$FormField.d && Intrinsics.f(this.e, kYCDocumentIdInputScreenContract$FormField.e) && Intrinsics.f(this.f, kYCDocumentIdInputScreenContract$FormField.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f77860a.hashCode() * 31, 31, this.f77861b);
        String str = this.f77862c;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Clause clause = this.e;
        int iHashCode = (iC2 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77860a);
        dest.writeString(this.f77861b);
        dest.writeString(this.f77862c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
