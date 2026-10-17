package com.revolut.feature.kyc.api.navigation.document_collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.r;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/document_collection/DocumentCollectionInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentCollectionInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DocumentCollectionInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f77515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f77516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f77517c;
    public final r d;
    public final String e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f77518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f77519h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f77520j;
    public final boolean k;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            b bVar2 = (b) parcel.readSerializable();
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            r rVarValueOf = r.valueOf(parcel.readString());
            String string = parcel.readString();
            b bVar3 = (b) parcel.readSerializable();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iC = 0;
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, i);
            }
            return new DocumentCollectionInputData(bVar, bVar2, z, rVarValueOf, string, bVar3, arrayList, (AnalyticsProduct) parcel.readParcelable(DocumentCollectionInputData.class.getClassLoader()), parcel.readInt() != 0 ? i : 0, parcel.readString(), parcel.readInt() != 0 ? i : 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentCollectionInputData[i];
        }
    }

    public DocumentCollectionInputData(b citizenship, b residencyCountry, boolean z, r kycScope, String str, b bVar, ArrayList documents, AnalyticsProduct analyticsProduct, boolean z3, String str2, boolean z4) {
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(residencyCountry, "residencyCountry");
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f77515a = citizenship;
        this.f77516b = residencyCountry;
        this.f77517c = z;
        this.d = kycScope;
        this.e = str;
        this.f = bVar;
        this.f77518g = documents;
        this.f77519h = analyticsProduct;
        this.i = z3;
        this.f77520j = str2;
        this.k = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentCollectionInputData)) {
            return false;
        }
        DocumentCollectionInputData documentCollectionInputData = (DocumentCollectionInputData) obj2;
        return Intrinsics.f(this.f77515a, documentCollectionInputData.f77515a) && Intrinsics.f(this.f77516b, documentCollectionInputData.f77516b) && this.f77517c == documentCollectionInputData.f77517c && this.d == documentCollectionInputData.d && Intrinsics.f(this.e, documentCollectionInputData.e) && Intrinsics.f(this.f, documentCollectionInputData.f) && this.f77518g.equals(documentCollectionInputData.f77518g) && Intrinsics.f(this.f77519h, documentCollectionInputData.f77519h) && this.i == documentCollectionInputData.i && Intrinsics.f(this.f77520j, documentCollectionInputData.f77520j) && this.k == documentCollectionInputData.k;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + j6.a.c(p.a.c(this.f77515a.f297794a.hashCode() * 31, 31, this.f77516b.f297794a), 31, this.f77517c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f;
        int iC = j6.a.c(l.a(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f77518g, (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31), 31, this.f77519h), 31, this.i);
        String str2 = this.f77520j;
        return Boolean.hashCode(this.k) + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77515a);
        dest.writeSerializable(this.f77516b);
        dest.writeInt(this.f77517c ? 1 : 0);
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        Iterator itY = j6.a.y(this.f77518g, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        dest.writeParcelable(this.f77519h, i);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeString(this.f77520j);
        dest.writeInt(this.k ? 1 : 0);
    }
}
