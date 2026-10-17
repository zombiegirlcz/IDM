package com.revolut.feature.credit.application.plugins.impl.ui.document.pdf;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/document/pdf/CreditPdfDocumentControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditPdfDocumentControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditPdfDocumentControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPdfDocumentControllerContract$Configuration f67548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPdfDocumentControllerContract$Document f67549c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditPdfDocumentControllerContract$InputData(parcel.readString(), CreditPdfDocumentControllerContract$Configuration.CREATOR.createFromParcel(parcel), (CreditPdfDocumentControllerContract$Document) parcel.readParcelable(CreditPdfDocumentControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditPdfDocumentControllerContract$InputData[i];
        }
    }

    public CreditPdfDocumentControllerContract$InputData(String documentId, CreditPdfDocumentControllerContract$Configuration configuration, CreditPdfDocumentControllerContract$Document document) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f67547a = documentId;
        this.f67548b = configuration;
        this.f67549c = document;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditPdfDocumentControllerContract$InputData)) {
            return false;
        }
        CreditPdfDocumentControllerContract$InputData creditPdfDocumentControllerContract$InputData = (CreditPdfDocumentControllerContract$InputData) obj2;
        return Intrinsics.f(this.f67547a, creditPdfDocumentControllerContract$InputData.f67547a) && Intrinsics.f(this.f67548b, creditPdfDocumentControllerContract$InputData.f67548b) && Intrinsics.f(this.f67549c, creditPdfDocumentControllerContract$InputData.f67549c);
    }

    public final int hashCode() {
        return this.f67549c.hashCode() + ((this.f67548b.hashCode() + (this.f67547a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67547a);
        this.f67548b.writeToParcel(dest, i);
        dest.writeParcelable(this.f67549c, i);
    }
}
