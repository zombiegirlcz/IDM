package com.revolut.feature.selfserve.sot.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/flow/DocumentUpload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentUpload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentUpload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f85909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f85910b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentUpload((DocumentType) parcel.readParcelable(DocumentUpload.class.getClassLoader()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentUpload[i];
        }
    }

    public DocumentUpload(DocumentType documentType, ArrayList filePaths) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(filePaths, "filePaths");
        this.f85909a = documentType;
        this.f85910b = filePaths;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentUpload)) {
            return false;
        }
        DocumentUpload documentUpload = (DocumentUpload) obj2;
        return Intrinsics.f(this.f85909a, documentUpload.f85909a) && Intrinsics.f(this.f85910b, documentUpload.f85910b);
    }

    public final int hashCode() {
        return this.f85910b.hashCode() + (this.f85909a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f85909a, i);
        dest.writeStringList(this.f85910b);
    }
}
