package com.revolut.feature.credit.card.impl.ui.statement.export;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement/export/CreditCardStatementExportScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardStatementExportScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardStatementExportScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f69694b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardStatementExportScreenContract$InputData(parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardStatementExportScreenContract$InputData[i];
        }
    }

    public CreditCardStatementExportScreenContract$InputData(String facilityId, LocalDate referenceDate) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        this.f69693a = facilityId;
        this.f69694b = referenceDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardStatementExportScreenContract$InputData)) {
            return false;
        }
        CreditCardStatementExportScreenContract$InputData creditCardStatementExportScreenContract$InputData = (CreditCardStatementExportScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69693a, creditCardStatementExportScreenContract$InputData.f69693a) && Intrinsics.f(this.f69694b, creditCardStatementExportScreenContract$InputData.f69694b);
    }

    public final int hashCode() {
        return this.f69694b.hashCode() + (this.f69693a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69693a);
        dest.writeSerializable(this.f69694b);
    }
}
