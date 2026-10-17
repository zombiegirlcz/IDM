package com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/supporting_documents/CFACInsuranceSupportingDocumentsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceSupportingDocumentsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceSupportingDocumentsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75118c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iC = 0;
            boolean z = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CFACInsuranceSupportingDocumentsScreenContract$InputData(string, arrayList, z, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceSupportingDocumentsScreenContract$InputData[i];
        }
    }

    public CFACInsuranceSupportingDocumentsScreenContract$InputData(String str, List claimedDocuments, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(claimedDocuments, "claimedDocuments");
        this.f75116a = str;
        this.f75117b = z;
        this.f75118c = z3;
        this.d = claimedDocuments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACInsuranceSupportingDocumentsScreenContract$InputData)) {
            return false;
        }
        CFACInsuranceSupportingDocumentsScreenContract$InputData cFACInsuranceSupportingDocumentsScreenContract$InputData = (CFACInsuranceSupportingDocumentsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75116a, cFACInsuranceSupportingDocumentsScreenContract$InputData.f75116a) && this.f75117b == cFACInsuranceSupportingDocumentsScreenContract$InputData.f75117b && this.f75118c == cFACInsuranceSupportingDocumentsScreenContract$InputData.f75118c && Intrinsics.f(this.d, cFACInsuranceSupportingDocumentsScreenContract$InputData.d);
    }

    public final int hashCode() {
        String str = this.f75116a;
        return this.d.hashCode() + j6.a.c(j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f75117b), 31, this.f75118c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75116a);
        dest.writeInt(this.f75117b ? 1 : 0);
        dest.writeInt(this.f75118c ? 1 : 0);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
