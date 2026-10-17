package com.revolut.feature.credit.card.api.models.statement;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/api/models/statement/CreditCardInAppStatement$Charge", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInAppStatement$Charge implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInAppStatement$Charge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f68870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f68871b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardInAppStatement$Charge((d) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInAppStatement$Charge[i];
        }
    }

    public CreditCardInAppStatement$Charge(d dVar, LocalDate chargeDate) {
        Intrinsics.checkNotNullParameter(chargeDate, "chargeDate");
        this.f68870a = chargeDate;
        this.f68871b = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInAppStatement$Charge)) {
            return false;
        }
        CreditCardInAppStatement$Charge creditCardInAppStatement$Charge = (CreditCardInAppStatement$Charge) obj2;
        return Intrinsics.f(this.f68870a, creditCardInAppStatement$Charge.f68870a) && Intrinsics.f(this.f68871b, creditCardInAppStatement$Charge.f68871b);
    }

    public final int hashCode() {
        int iHashCode = this.f68870a.hashCode() * 31;
        d dVar = this.f68871b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68870a);
        dest.writeSerializable(this.f68871b);
    }
}
