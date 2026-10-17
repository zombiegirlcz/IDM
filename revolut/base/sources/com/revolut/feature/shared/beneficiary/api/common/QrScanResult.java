package com.revolut.feature.shared.beneficiary.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.shared.beneficiary.api.domain.PaymentCodeType;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/common/QrScanResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrScanResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QrScanResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f86035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f86036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86037c;
    public final List d;
    public final UltimateDebtor e;
    public final PaymentCodeType f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f5j.a aVar = (f5j.a) parcel.readSerializable();
            d dVar = (d) parcel.readSerializable();
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ReferenceField.CREATOR, parcel, arrayList, iA, 1);
            }
            return new QrScanResult(aVar, dVar, string, arrayList, (UltimateDebtor) parcel.readParcelable(QrScanResult.class.getClassLoader()), PaymentCodeType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QrScanResult[i];
        }
    }

    public QrScanResult(f5j.a beneficiary, d dVar, String str, List referenceFields, UltimateDebtor ultimateDebtor, PaymentCodeType codeType) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(referenceFields, "referenceFields");
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        this.f86035a = beneficiary;
        this.f86036b = dVar;
        this.f86037c = str;
        this.d = referenceFields;
        this.e = ultimateDebtor;
        this.f = codeType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QrScanResult)) {
            return false;
        }
        QrScanResult qrScanResult = (QrScanResult) obj2;
        return Intrinsics.f(this.f86035a, qrScanResult.f86035a) && Intrinsics.f(this.f86036b, qrScanResult.f86036b) && Intrinsics.f(this.f86037c, qrScanResult.f86037c) && Intrinsics.f(this.d, qrScanResult.d) && Intrinsics.f(this.e, qrScanResult.e) && this.f == qrScanResult.f;
    }

    public final int hashCode() {
        int iHashCode = this.f86035a.hashCode() * 31;
        d dVar = this.f86036b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f86037c;
        int iD = p.a.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        UltimateDebtor ultimateDebtor = this.e;
        return this.f.hashCode() + ((iD + (ultimateDebtor != null ? ultimateDebtor.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f86035a);
        dest.writeSerializable(this.f86036b);
        dest.writeString(this.f86037c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((ReferenceField) itV.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
        this.f.writeToParcel(dest, i);
    }
}
