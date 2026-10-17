package com.revolut.feature.kyc.impl.screens.documentid_input;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/screens/documentid_input/KYCDocumentIdInputScreenContract$FieldResult", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KYCDocumentIdInputScreenContract$FieldResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<KYCDocumentIdInputScreenContract$FieldResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77859c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KYCDocumentIdInputScreenContract$FieldResult(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KYCDocumentIdInputScreenContract$FieldResult[i];
        }
    }

    public KYCDocumentIdInputScreenContract$FieldResult(String key, String value, String valueType) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        this.f77857a = key;
        this.f77858b = value;
        this.f77859c = valueType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KYCDocumentIdInputScreenContract$FieldResult)) {
            return false;
        }
        KYCDocumentIdInputScreenContract$FieldResult kYCDocumentIdInputScreenContract$FieldResult = (KYCDocumentIdInputScreenContract$FieldResult) obj2;
        return Intrinsics.f(this.f77857a, kYCDocumentIdInputScreenContract$FieldResult.f77857a) && Intrinsics.f(this.f77858b, kYCDocumentIdInputScreenContract$FieldResult.f77858b) && Intrinsics.f(this.f77859c, kYCDocumentIdInputScreenContract$FieldResult.f77859c);
    }

    public final int hashCode() {
        return this.f77859c.hashCode() + p.a.c(this.f77857a.hashCode() * 31, 31, this.f77858b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77857a);
        dest.writeString(this.f77858b);
        dest.writeString(this.f77859c);
    }
}
