package com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationManualDocumentSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationManualDocumentSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f50601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f50602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiometricVerificationDocumentType f50603c;
    public final AnalyticsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(BiometricVerificationManualDocumentSelectionScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new BiometricVerificationManualDocumentSelectionScreenContract$InputData(arrayList, (b) parcel.readSerializable(), (BiometricVerificationDocumentType) parcel.readParcelable(BiometricVerificationManualDocumentSelectionScreenContract$InputData.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(BiometricVerificationManualDocumentSelectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationManualDocumentSelectionScreenContract$InputData[i];
        }
    }

    public BiometricVerificationManualDocumentSelectionScreenContract$InputData(ArrayList acceptedDocuments, b defaultCountry, BiometricVerificationDocumentType defaultDocument, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(acceptedDocuments, "acceptedDocuments");
        Intrinsics.checkNotNullParameter(defaultCountry, "defaultCountry");
        Intrinsics.checkNotNullParameter(defaultDocument, "defaultDocument");
        this.f50601a = acceptedDocuments;
        this.f50602b = defaultCountry;
        this.f50603c = defaultDocument;
        this.d = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationManualDocumentSelectionScreenContract$InputData)) {
            return false;
        }
        BiometricVerificationManualDocumentSelectionScreenContract$InputData biometricVerificationManualDocumentSelectionScreenContract$InputData = (BiometricVerificationManualDocumentSelectionScreenContract$InputData) obj2;
        return this.f50601a.equals(biometricVerificationManualDocumentSelectionScreenContract$InputData.f50601a) && Intrinsics.f(this.f50602b, biometricVerificationManualDocumentSelectionScreenContract$InputData.f50602b) && Intrinsics.f(this.f50603c, biometricVerificationManualDocumentSelectionScreenContract$InputData.f50603c) && Intrinsics.f(this.d, biometricVerificationManualDocumentSelectionScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f50603c.hashCode() + p.a.c(this.f50601a.hashCode() * 31, 31, this.f50602b.f297794a)) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f50601a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeSerializable(this.f50602b);
        dest.writeParcelable(this.f50603c, i);
        dest.writeParcelable(this.d, i);
    }
}
