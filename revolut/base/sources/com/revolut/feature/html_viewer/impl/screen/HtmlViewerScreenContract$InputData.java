package com.revolut.feature.html_viewer.impl.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/html_viewer/impl/screen/HtmlViewerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_html_viewer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HtmlViewerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<HtmlViewerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlDocumentDescriptor f74752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f74753b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HtmlViewerScreenContract$InputData((HtmlDocumentDescriptor) parcel.readParcelable(HtmlViewerScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(HtmlViewerScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HtmlViewerScreenContract$InputData[i];
        }
    }

    public HtmlViewerScreenContract$InputData(HtmlDocumentDescriptor documentDescriptor, Clause title) {
        Intrinsics.checkNotNullParameter(documentDescriptor, "documentDescriptor");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f74752a = documentDescriptor;
        this.f74753b = title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HtmlViewerScreenContract$InputData)) {
            return false;
        }
        HtmlViewerScreenContract$InputData htmlViewerScreenContract$InputData = (HtmlViewerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74752a, htmlViewerScreenContract$InputData.f74752a) && Intrinsics.f(this.f74753b, htmlViewerScreenContract$InputData.f74753b);
    }

    public final int hashCode() {
        return this.f74753b.hashCode() + (this.f74752a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f74752a, i);
        dest.writeParcelable(this.f74753b, i);
    }
}
