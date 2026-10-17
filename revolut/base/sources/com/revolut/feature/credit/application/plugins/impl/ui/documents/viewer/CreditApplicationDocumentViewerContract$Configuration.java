package com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x94.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/documents/viewer/CreditApplicationDocumentViewerContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationDocumentViewerContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationDocumentViewerContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentViewerScreenConfig f67565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f67567c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationDocumentViewerContract$Configuration((DocumentViewerScreenConfig) parcel.readParcelable(CreditApplicationDocumentViewerContract$Configuration.class.getClassLoader()), parcel.readString(), f.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationDocumentViewerContract$Configuration[i];
        }
    }

    public CreditApplicationDocumentViewerContract$Configuration(DocumentViewerScreenConfig screenConfig, String documentId, f screen, String str, String flowName) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        this.f67565a = screenConfig;
        this.f67566b = documentId;
        this.f67567c = screen;
        this.d = str;
        this.e = flowName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationDocumentViewerContract$Configuration)) {
            return false;
        }
        CreditApplicationDocumentViewerContract$Configuration creditApplicationDocumentViewerContract$Configuration = (CreditApplicationDocumentViewerContract$Configuration) obj2;
        return Intrinsics.f(this.f67565a, creditApplicationDocumentViewerContract$Configuration.f67565a) && Intrinsics.f(this.f67566b, creditApplicationDocumentViewerContract$Configuration.f67566b) && this.f67567c == creditApplicationDocumentViewerContract$Configuration.f67567c && Intrinsics.f(this.d, creditApplicationDocumentViewerContract$Configuration.d) && Intrinsics.f(this.e, creditApplicationDocumentViewerContract$Configuration.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f67567c.hashCode() + p.a.c(this.f67565a.hashCode() * 31, 31, this.f67566b)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f67565a, i);
        dest.writeString(this.f67566b);
        dest.writeString(this.f67567c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
