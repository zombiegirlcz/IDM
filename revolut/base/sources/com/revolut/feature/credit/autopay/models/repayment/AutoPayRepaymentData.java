package com.revolut.feature.credit.autopay.models.repayment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ux4.e;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/models/repayment/AutoPayRepaymentData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoPayRepaymentData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AutoPayRepaymentData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RepresentationAmountStyle f68548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RepresentationDayStyle f68549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RepresentationFromStyle f68550c;
    public final e d;
    public final RepresentationBackupCardStyle e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RepresentationPaymentDayType f68551g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoPayRepaymentData((RepresentationAmountStyle) parcel.readParcelable(AutoPayRepaymentData.class.getClassLoader()), RepresentationDayStyle.CREATOR.createFromParcel(parcel), (RepresentationFromStyle) parcel.readParcelable(AutoPayRepaymentData.class.getClassLoader()), (e) parcel.readSerializable(), parcel.readInt() == 0 ? null : RepresentationBackupCardStyle.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable(), (RepresentationPaymentDayType) parcel.readParcelable(AutoPayRepaymentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoPayRepaymentData[i];
        }
    }

    public AutoPayRepaymentData(RepresentationAmountStyle amount, RepresentationDayStyle repaymentDay, RepresentationFromStyle from, e document, RepresentationBackupCardStyle representationBackupCardStyle, b bVar, RepresentationPaymentDayType representationPaymentDayType) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(repaymentDay, "repaymentDay");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(document, "document");
        this.f68548a = amount;
        this.f68549b = repaymentDay;
        this.f68550c = from;
        this.d = document;
        this.e = representationBackupCardStyle;
        this.f = bVar;
        this.f68551g = representationPaymentDayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoPayRepaymentData)) {
            return false;
        }
        AutoPayRepaymentData autoPayRepaymentData = (AutoPayRepaymentData) obj2;
        return Intrinsics.f(this.f68548a, autoPayRepaymentData.f68548a) && Intrinsics.f(this.f68549b, autoPayRepaymentData.f68549b) && Intrinsics.f(this.f68550c, autoPayRepaymentData.f68550c) && Intrinsics.f(this.d, autoPayRepaymentData.d) && Intrinsics.f(this.e, autoPayRepaymentData.e) && Intrinsics.f(this.f, autoPayRepaymentData.f) && Intrinsics.f(this.f68551g, autoPayRepaymentData.f68551g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f68550c.hashCode() + ((this.f68549b.hashCode() + (this.f68548a.hashCode() * 31)) * 31)) * 31)) * 31;
        RepresentationBackupCardStyle representationBackupCardStyle = this.e;
        int iHashCode2 = (iHashCode + (representationBackupCardStyle == null ? 0 : representationBackupCardStyle.hashCode())) * 31;
        b bVar = this.f;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        RepresentationPaymentDayType representationPaymentDayType = this.f68551g;
        return iHashCode3 + (representationPaymentDayType != null ? representationPaymentDayType.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68548a, i);
        this.f68549b.writeToParcel(dest, i);
        dest.writeParcelable(this.f68550c, i);
        dest.writeSerializable(this.d);
        RepresentationBackupCardStyle representationBackupCardStyle = this.e;
        if (representationBackupCardStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            representationBackupCardStyle.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f);
        dest.writeParcelable(this.f68551g, i);
    }

    public /* synthetic */ AutoPayRepaymentData(RepresentationAmountStyle representationAmountStyle, RepresentationDayStyle representationDayStyle, RepresentationFromStyle representationFromStyle, e eVar, RepresentationBackupCardStyle representationBackupCardStyle, int i) {
        this(representationAmountStyle, representationDayStyle, representationFromStyle, eVar, (i & 16) != 0 ? null : representationBackupCardStyle, null, null);
    }
}
