package com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v44.f;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/agreements/common/viewer/CreditApplicationDocumentViewerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationDocumentViewerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationDocumentViewerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f66987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f66989c;
    public final DocumentViewerScreenConfig d;
    public final String e;
    public final AnalyticsContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f66990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f66991h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", CreditApplicationDocumentViewerScreenContract$InputData.class);
            String string = parcel.readString();
            f fVar = (f) parcel.readSerializable();
            DocumentViewerScreenConfig documentViewerScreenConfig = (DocumentViewerScreenConfig) parcel.readParcelable(CreditApplicationDocumentViewerScreenContract$InputData.class.getClassLoader());
            String string2 = parcel.readString();
            AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(CreditApplicationDocumentViewerScreenContract$InputData.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(CreditApplicationDocumentViewerScreenContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CreditApplicationDocumentViewerScreenContract$InputData(clause, string, fVar, documentViewerScreenConfig, string2, analyticsContext, clause2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationDocumentViewerScreenContract$InputData[i];
        }
    }

    public CreditApplicationDocumentViewerScreenContract$InputData(Clause toolbarTitle, String documentId, f document, DocumentViewerScreenConfig screenConfig, String str, AnalyticsContext analyticsContext, Clause clause, List checkboxes) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(checkboxes, "checkboxes");
        this.f66987a = toolbarTitle;
        this.f66988b = documentId;
        this.f66989c = document;
        this.d = screenConfig;
        this.e = str;
        this.f = analyticsContext;
        this.f66990g = clause;
        this.f66991h = checkboxes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationDocumentViewerScreenContract$InputData)) {
            return false;
        }
        CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData = (CreditApplicationDocumentViewerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f66987a, creditApplicationDocumentViewerScreenContract$InputData.f66987a) && Intrinsics.f(this.f66988b, creditApplicationDocumentViewerScreenContract$InputData.f66988b) && Intrinsics.f(this.f66989c, creditApplicationDocumentViewerScreenContract$InputData.f66989c) && Intrinsics.f(this.d, creditApplicationDocumentViewerScreenContract$InputData.d) && Intrinsics.f(this.e, creditApplicationDocumentViewerScreenContract$InputData.e) && Intrinsics.f(this.f, creditApplicationDocumentViewerScreenContract$InputData.f) && Intrinsics.f(this.f66990g, creditApplicationDocumentViewerScreenContract$InputData.f66990g) && Intrinsics.f(this.f66991h, creditApplicationDocumentViewerScreenContract$InputData.f66991h);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f66989c.hashCode() + p.a.c(this.f66987a.hashCode() * 31, 31, this.f66988b)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f;
        int iA = (iHashCode2 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        Clause clause = this.f66990g;
        return this.f66991h.hashCode() + ((iA + (clause != null ? clause.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66987a, i);
        dest.writeString(this.f66988b);
        dest.writeSerializable(this.f66989c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f66990g, i);
        Iterator itV = p.a.v(this.f66991h, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }

    public CreditApplicationDocumentViewerScreenContract$InputData(Clause clause, String str, f fVar, DocumentViewerScreenConfig documentViewerScreenConfig, String str2, AnalyticsContext analyticsContext, Clause clause2, List list, int i) {
        this(clause, str, fVar, documentViewerScreenConfig, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : analyticsContext, (i & 64) != 0 ? null : clause2, (i & 128) != 0 ? f0.f322471a : list);
    }
}
