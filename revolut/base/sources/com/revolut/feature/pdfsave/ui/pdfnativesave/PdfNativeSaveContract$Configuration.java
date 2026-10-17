package com.revolut.feature.pdfsave.ui.pdfnativesave;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pdf_save_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PdfNativeSaveContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PdfNativeSaveContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PdfNativeSaveContract$Payload f80318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80319b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PdfNativeSaveContract$Configuration((PdfNativeSaveContract$Payload) parcel.readParcelable(PdfNativeSaveContract$Configuration.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PdfNativeSaveContract$Configuration[i];
        }
    }

    public PdfNativeSaveContract$Configuration(PdfNativeSaveContract$Payload payload, String flowName) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        this.f80318a = payload;
        this.f80319b = flowName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PdfNativeSaveContract$Configuration)) {
            return false;
        }
        PdfNativeSaveContract$Configuration pdfNativeSaveContract$Configuration = (PdfNativeSaveContract$Configuration) obj2;
        return Intrinsics.f(this.f80318a, pdfNativeSaveContract$Configuration.f80318a) && Intrinsics.f(this.f80319b, pdfNativeSaveContract$Configuration.f80319b);
    }

    public final int hashCode() {
        return this.f80319b.hashCode() + (this.f80318a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80318a, i);
        dest.writeString(this.f80319b);
    }
}
