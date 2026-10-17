package com.revolut.feature.pdfsave.ui.fullscreen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pdfsave/ui/fullscreen/PdfFullscreenContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pdf_save_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PdfFullscreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PdfFullscreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f80313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80314c;
    public final Parcelable d;
    public final boolean e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Clause clause = (Clause) parcel.readParcelable(PdfFullscreenContract$Configuration.class.getClassLoader());
            String string2 = parcel.readString();
            Parcelable parcelable = parcel.readParcelable(PdfFullscreenContract$Configuration.class.getClassLoader());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new PdfFullscreenContract$Configuration(string, clause, string2, parcelable, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PdfFullscreenContract$Configuration[i];
        }
    }

    public PdfFullscreenContract$Configuration(String flowName, Clause title, String filename, Parcelable parcelable, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.f80312a = flowName;
        this.f80313b = title;
        this.f80314c = filename;
        this.d = parcelable;
        this.e = z;
        this.f = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PdfFullscreenContract$Configuration)) {
            return false;
        }
        PdfFullscreenContract$Configuration pdfFullscreenContract$Configuration = (PdfFullscreenContract$Configuration) obj2;
        return Intrinsics.f(this.f80312a, pdfFullscreenContract$Configuration.f80312a) && Intrinsics.f(this.f80313b, pdfFullscreenContract$Configuration.f80313b) && Intrinsics.f(this.f80314c, pdfFullscreenContract$Configuration.f80314c) && Intrinsics.f(this.d, pdfFullscreenContract$Configuration.d) && this.e == pdfFullscreenContract$Configuration.e && this.f == pdfFullscreenContract$Configuration.f;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.a(this.f80312a.hashCode() * 31, 31, this.f80313b), 31, this.f80314c);
        Parcelable parcelable = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80312a);
        dest.writeParcelable(this.f80313b, i);
        dest.writeString(this.f80314c);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
    }
}
