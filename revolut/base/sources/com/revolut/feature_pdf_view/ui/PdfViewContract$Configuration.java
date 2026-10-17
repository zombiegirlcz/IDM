package com.revolut.feature_pdf_view.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature_pdf_view.NetworkErrorSetup;
import com.revolut.feature_pdf_view.ResponseCode;
import com.revolut.feature_pdf_view.ui.PdfViewContract$Source;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_pdf_view/ui/PdfViewContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pdf_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class PdfViewContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PdfViewContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PdfViewContract$Source f97452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f97453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97454c;
    public final String d;
    public final boolean e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsProduct f97455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsContext f97456h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            PdfViewContract$Source pdfViewContract$Source = (PdfViewContract$Source) j6.a.f(parcel, "parcel", PdfViewContract$Configuration.class);
            Clause clause = (Clause) parcel.readParcelable(PdfViewContract$Configuration.class.getClassLoader());
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            String string = parcel.readString();
            boolean z4 = parcel.readInt() != 0 ? z : false;
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(ResponseCode.CREATOR.createFromParcel(parcel), NetworkErrorSetup.CREATOR.createFromParcel(parcel));
            }
            return new PdfViewContract$Configuration(pdfViewContract$Source, clause, z3, string, z4, linkedHashMap, (AnalyticsProduct) parcel.readParcelable(PdfViewContract$Configuration.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(PdfViewContract$Configuration.class.getClassLoader()), parcel.readInt() != 0 ? z : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PdfViewContract$Configuration[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdfViewContract$Configuration(Clause clause, String url2, boolean z) {
        this(new PdfViewContract$Source.Remote(url2), clause, z, "PDF_VIEWER", true, r0.g(), null, null, false);
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter("PDF_VIEWER", "flowName");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PdfViewContract$Configuration)) {
            return false;
        }
        PdfViewContract$Configuration pdfViewContract$Configuration = (PdfViewContract$Configuration) obj2;
        return Intrinsics.f(this.f97452a, pdfViewContract$Configuration.f97452a) && Intrinsics.f(this.f97453b, pdfViewContract$Configuration.f97453b) && this.f97454c == pdfViewContract$Configuration.f97454c && Intrinsics.f(this.d, pdfViewContract$Configuration.d) && this.e == pdfViewContract$Configuration.e && Intrinsics.f(this.f, pdfViewContract$Configuration.f) && Intrinsics.f(this.f97455g, pdfViewContract$Configuration.f97455g) && Intrinsics.f(this.f97456h, pdfViewContract$Configuration.f97456h) && this.i == pdfViewContract$Configuration.i;
    }

    public final int hashCode() {
        int iHashCode = this.f97452a.hashCode() * 31;
        Clause clause = this.f97453b;
        int iE = p.a.e(j6.a.c(p.a.c(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f97454c), 31, this.d), 31, this.e), 31, this.f);
        AnalyticsProduct analyticsProduct = this.f97455g;
        int iHashCode2 = (iE + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f97456h;
        return Boolean.hashCode(this.i) + ((iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97452a, i);
        dest.writeParcelable(this.f97453b, i);
        dest.writeInt(this.f97454c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        Iterator itZ = j6.a.z(this.f, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            ((ResponseCode) entry.getKey()).writeToParcel(dest, i);
            ((NetworkErrorSetup) entry.getValue()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f97455g, i);
        dest.writeParcelable(this.f97456h, i);
        dest.writeInt(this.i ? 1 : 0);
    }

    public PdfViewContract$Configuration(PdfViewContract$Source source, Clause clause, boolean z, String flowName, boolean z3, Map networkErrorsSetting, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z4) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(networkErrorsSetting, "networkErrorsSetting");
        this.f97452a = source;
        this.f97453b = clause;
        this.f97454c = z;
        this.d = flowName;
        this.e = z3;
        this.f = networkErrorsSetting;
        this.f97455g = analyticsProduct;
        this.f97456h = analyticsContext;
        this.i = z4;
    }
}
