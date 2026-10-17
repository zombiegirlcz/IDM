package com.revolut.feature.kyc.impl.document_collection.document_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.r;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/document_collection/document_selection/DocumentSelectionControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentSelectionControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DocumentSelectionControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f77618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f77619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f77620c;
    public final String d;
    public final b e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f77621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f77622h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f77623j;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            b bVar2 = (b) parcel.readSerializable();
            r rVarValueOf = r.valueOf(parcel.readString());
            String string = parcel.readString();
            b bVar3 = (b) parcel.readSerializable();
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iC = 0;
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, i);
            }
            return new DocumentSelectionControllerContract$InputData(bVar, bVar2, rVarValueOf, string, bVar3, z, arrayList, (AnalyticsProduct) parcel.readParcelable(DocumentSelectionControllerContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? i : 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentSelectionControllerContract$InputData[i];
        }
    }

    public DocumentSelectionControllerContract$InputData(b citizenship, b bVar, r scope, String str, b bVar2, boolean z, List documents, AnalyticsProduct analyticsProduct, String str2, boolean z3) {
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f77618a = citizenship;
        this.f77619b = bVar;
        this.f77620c = scope;
        this.d = str;
        this.e = bVar2;
        this.f = z;
        this.f77621g = documents;
        this.f77622h = analyticsProduct;
        this.i = str2;
        this.f77623j = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentSelectionControllerContract$InputData)) {
            return false;
        }
        DocumentSelectionControllerContract$InputData documentSelectionControllerContract$InputData = (DocumentSelectionControllerContract$InputData) obj2;
        return Intrinsics.f(this.f77618a, documentSelectionControllerContract$InputData.f77618a) && Intrinsics.f(this.f77619b, documentSelectionControllerContract$InputData.f77619b) && this.f77620c == documentSelectionControllerContract$InputData.f77620c && Intrinsics.f(this.d, documentSelectionControllerContract$InputData.d) && Intrinsics.f(this.e, documentSelectionControllerContract$InputData.e) && this.f == documentSelectionControllerContract$InputData.f && Intrinsics.f(this.f77621g, documentSelectionControllerContract$InputData.f77621g) && Intrinsics.f(this.f77622h, documentSelectionControllerContract$InputData.f77622h) && Intrinsics.f(this.i, documentSelectionControllerContract$InputData.i) && this.f77623j == documentSelectionControllerContract$InputData.f77623j;
    }

    public final int hashCode() {
        int iHashCode = this.f77618a.f297794a.hashCode() * 31;
        b bVar = this.f77619b;
        int iHashCode2 = (this.f77620c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31)) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar2 = this.e;
        int iA = l.a(p.a.d(j6.a.c((iHashCode3 + (bVar2 == null ? 0 : bVar2.f297794a.hashCode())) * 31, 31, this.f), 31, this.f77621g), 31, this.f77622h);
        String str2 = this.i;
        return Boolean.hashCode(this.f77623j) + ((iA + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77618a);
        dest.writeSerializable(this.f77619b);
        dest.writeString(this.f77620c.name());
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
        Iterator itV = p.a.v(this.f77621g, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeParcelable(this.f77622h, i);
        dest.writeString(this.i);
        dest.writeInt(this.f77623j ? 1 : 0);
    }
}
