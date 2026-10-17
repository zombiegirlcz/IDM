package com.revolut.feature_pdf_view;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature_pdf_view.Source;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import j6.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_pdf_view/PdfViewFeatureConfiguration;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_pdf_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class PdfViewFeatureConfiguration implements FeatureConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f97438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f97439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97440c;
    public final String d;
    public final boolean e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsProduct f97441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsContext f97442h;
    public final boolean i;

    @NotNull
    public static final Parcelable.Creator<PdfViewFeatureConfiguration> CREATOR = new b();

    /* JADX INFO: loaded from: classes10.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Source source = (Source) a.f(parcel, "parcel", PdfViewFeatureConfiguration.class);
            Clause clause = (Clause) parcel.readParcelable(PdfViewFeatureConfiguration.class.getClassLoader());
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
            return new PdfViewFeatureConfiguration(source, clause, z3, string, z4, linkedHashMap, (AnalyticsProduct) parcel.readParcelable(PdfViewFeatureConfiguration.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(PdfViewFeatureConfiguration.class.getClassLoader()), parcel.readInt() != 0 ? z : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PdfViewFeatureConfiguration[i];
        }
    }

    public PdfViewFeatureConfiguration(Source source, Clause clause, boolean z, String flowName, boolean z3, Map networkErrorsSetting, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, boolean z4) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(networkErrorsSetting, "networkErrorsSetting");
        this.f97438a = source;
        this.f97439b = clause;
        this.f97440c = z;
        this.d = flowName;
        this.e = z3;
        this.f = networkErrorsSetting;
        this.f97441g = analyticsProduct;
        this.f97442h = analyticsContext;
        this.i = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PdfViewFeatureConfiguration)) {
            return false;
        }
        PdfViewFeatureConfiguration pdfViewFeatureConfiguration = (PdfViewFeatureConfiguration) obj2;
        return Intrinsics.f(this.f97438a, pdfViewFeatureConfiguration.f97438a) && Intrinsics.f(this.f97439b, pdfViewFeatureConfiguration.f97439b) && this.f97440c == pdfViewFeatureConfiguration.f97440c && Intrinsics.f(this.d, pdfViewFeatureConfiguration.d) && this.e == pdfViewFeatureConfiguration.e && Intrinsics.f(this.f, pdfViewFeatureConfiguration.f) && Intrinsics.f(this.f97441g, pdfViewFeatureConfiguration.f97441g) && Intrinsics.f(this.f97442h, pdfViewFeatureConfiguration.f97442h) && this.i == pdfViewFeatureConfiguration.i;
    }

    public final int hashCode() {
        int iHashCode = this.f97438a.hashCode() * 31;
        Clause clause = this.f97439b;
        int iE = p.a.e(a.c(p.a.c(a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f97440c), 31, this.d), 31, this.e), 31, this.f);
        AnalyticsProduct analyticsProduct = this.f97441g;
        int iHashCode2 = (iE + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f97442h;
        return Boolean.hashCode(this.i) + ((iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97438a, i);
        dest.writeParcelable(this.f97439b, i);
        dest.writeInt(this.f97440c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        Iterator itZ = a.z(this.f, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            ((ResponseCode) entry.getKey()).writeToParcel(dest, i);
            ((NetworkErrorSetup) entry.getValue()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f97441g, i);
        dest.writeParcelable(this.f97442h, i);
        dest.writeInt(this.i ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PdfViewFeatureConfiguration(String url2, Clause clause, boolean z, boolean z3, int i) {
        Clause clause2 = (i & 2) != 0 ? null : clause;
        boolean z4 = (i & 4) != 0 ? false : z;
        boolean z6 = (i & 32) != 0 ? false : z3;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter("PDF_VIEWER", "flowName");
        this(new Source.Remote(url2), clause2, z4, true, null, null, z6, BERTags.FLAGS);
    }

    public /* synthetic */ PdfViewFeatureConfiguration(Source source, Clause clause, boolean z, boolean z3, Map map, AnalyticsProduct.Retail retail, boolean z4, int i) {
        this(source, clause, (i & 4) != 0 ? false : z, "PDF_VIEWER", (i & 16) != 0 ? true : z3, (i & 32) != 0 ? r0.g() : map, (i & 64) != 0 ? null : retail, null, (i & 256) != 0 ? false : z4);
    }
}
