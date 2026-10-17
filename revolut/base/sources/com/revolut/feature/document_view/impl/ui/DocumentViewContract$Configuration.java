package com.revolut.feature.document_view.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/document_view/impl/ui/DocumentViewContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_document_view_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentViewContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentViewContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f71963b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentViewContract$Configuration((Clause) parcel.readParcelable(DocumentViewContract$Configuration.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentViewContract$Configuration[i];
        }
    }

    public DocumentViewContract$Configuration(Clause title, String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f71962a = filePath;
        this.f71963b = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentViewContract$Configuration)) {
            return false;
        }
        DocumentViewContract$Configuration documentViewContract$Configuration = (DocumentViewContract$Configuration) obj2;
        return Intrinsics.f(this.f71962a, documentViewContract$Configuration.f71962a) && Intrinsics.f(this.f71963b, documentViewContract$Configuration.f71963b);
    }

    public final int hashCode() {
        return this.f71963b.hashCode() + (this.f71962a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71962a);
        dest.writeParcelable(this.f71963b, i);
    }
}
