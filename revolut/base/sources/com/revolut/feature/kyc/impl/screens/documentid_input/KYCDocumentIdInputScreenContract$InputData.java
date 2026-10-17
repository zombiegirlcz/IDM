package com.revolut.feature.kyc.impl.screens.documentid_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/screens/documentid_input/KYCDocumentIdInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class KYCDocumentIdInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<KYCDocumentIdInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f77863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f77864b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KYCDocumentIdInputScreenContract$InputData((wi0.b) parcel.readSerializable(), (l) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new KYCDocumentIdInputScreenContract$InputData[i];
        }
    }

    public KYCDocumentIdInputScreenContract$InputData(wi0.b countryCode, l selectedDocument) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(selectedDocument, "selectedDocument");
        this.f77863a = countryCode;
        this.f77864b = selectedDocument;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KYCDocumentIdInputScreenContract$InputData)) {
            return false;
        }
        KYCDocumentIdInputScreenContract$InputData kYCDocumentIdInputScreenContract$InputData = (KYCDocumentIdInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77863a, kYCDocumentIdInputScreenContract$InputData.f77863a) && Intrinsics.f(this.f77864b, kYCDocumentIdInputScreenContract$InputData.f77864b);
    }

    public final int hashCode() {
        return this.f77864b.hashCode() + (this.f77863a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77863a);
        dest.writeSerializable(this.f77864b);
    }
}
