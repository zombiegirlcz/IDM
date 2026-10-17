package com.revolut.feature.kyc.impl.choosedocument.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku8.p;
import my8.r;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/choosedocument/kompot/ChooseDocumentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChooseDocumentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChooseDocumentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f77591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f77592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f77593c;
    public final b d;
    public final String e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SelectedKycDocs f77594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f77595h;
    public final AnalyticsProduct i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f77596j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f77597l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            p pVarValueOf = p.valueOf(parcel.readString());
            r rVarValueOf = r.valueOf(parcel.readString());
            b bVar = (b) parcel.readSerializable();
            b bVar2 = (b) parcel.readSerializable();
            String string = parcel.readString();
            b bVar3 = (b) parcel.readSerializable();
            SelectedKycDocs selectedKycDocsCreateFromParcel = SelectedKycDocs.CREATOR.createFromParcel(parcel);
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(ChooseDocumentScreenContract$InputData.class.getClassLoader());
            boolean z4 = true;
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new ChooseDocumentScreenContract$InputData(pVarValueOf, rVarValueOf, bVar, bVar2, string, bVar3, selectedKycDocsCreateFromParcel, z3, analyticsProduct, string2, z4, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChooseDocumentScreenContract$InputData[i];
        }
    }

    public ChooseDocumentScreenContract$InputData(p selectionVariant, r kycScope, b homeCountryCode, b citizenship, String str, b bVar, SelectedKycDocs selectedDocs, boolean z, AnalyticsProduct analyticsProduct, String str2, boolean z3, String documentsLanguageTag) {
        Intrinsics.checkNotNullParameter(selectionVariant, "selectionVariant");
        Intrinsics.checkNotNullParameter(kycScope, "kycScope");
        Intrinsics.checkNotNullParameter(homeCountryCode, "homeCountryCode");
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(selectedDocs, "selectedDocs");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(documentsLanguageTag, "documentsLanguageTag");
        this.f77591a = selectionVariant;
        this.f77592b = kycScope;
        this.f77593c = homeCountryCode;
        this.d = citizenship;
        this.e = str;
        this.f = bVar;
        this.f77594g = selectedDocs;
        this.f77595h = z;
        this.i = analyticsProduct;
        this.f77596j = str2;
        this.k = z3;
        this.f77597l = documentsLanguageTag;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChooseDocumentScreenContract$InputData)) {
            return false;
        }
        ChooseDocumentScreenContract$InputData chooseDocumentScreenContract$InputData = (ChooseDocumentScreenContract$InputData) obj2;
        return this.f77591a == chooseDocumentScreenContract$InputData.f77591a && this.f77592b == chooseDocumentScreenContract$InputData.f77592b && Intrinsics.f(this.f77593c, chooseDocumentScreenContract$InputData.f77593c) && Intrinsics.f(this.d, chooseDocumentScreenContract$InputData.d) && Intrinsics.f(this.e, chooseDocumentScreenContract$InputData.e) && Intrinsics.f(this.f, chooseDocumentScreenContract$InputData.f) && Intrinsics.f(this.f77594g, chooseDocumentScreenContract$InputData.f77594g) && this.f77595h == chooseDocumentScreenContract$InputData.f77595h && Intrinsics.f(this.i, chooseDocumentScreenContract$InputData.i) && Intrinsics.f(this.f77596j, chooseDocumentScreenContract$InputData.f77596j) && this.k == chooseDocumentScreenContract$InputData.k && Intrinsics.f(this.f77597l, chooseDocumentScreenContract$InputData.f77597l);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.f77592b.hashCode() + (this.f77591a.hashCode() * 31)) * 31, 31, this.f77593c.f297794a), 31, this.d.f297794a);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f;
        int iA = l.a(j6.a.c((this.f77594g.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31)) * 31, 31, this.f77595h), 31, this.i);
        String str2 = this.f77596j;
        return this.f77597l.hashCode() + j6.a.c((iA + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77591a.name());
        dest.writeString(this.f77592b.name());
        dest.writeSerializable(this.f77593c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        this.f77594g.writeToParcel(dest, i);
        dest.writeInt(this.f77595h ? 1 : 0);
        dest.writeParcelable(this.i, i);
        dest.writeString(this.f77596j);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeString(this.f77597l);
    }
}
