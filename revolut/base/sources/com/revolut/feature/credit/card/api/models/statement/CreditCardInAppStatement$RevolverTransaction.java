package com.revolut.feature.credit.card.api.models.statement;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vl4.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/api/models/statement/CreditCardInAppStatement$RevolverTransaction", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInAppStatement$RevolverTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInAppStatement$RevolverTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f68882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f68883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f68884c;
    public final String d;
    public final String e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CreditCardInAppStatement$Instalment f68885g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardInAppStatement$RevolverTransaction((ZonedDateTime) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CreditCardInAppStatement$Instalment.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInAppStatement$RevolverTransaction[i];
        }
    }

    public CreditCardInAppStatement$RevolverTransaction(ZonedDateTime completedDate, d amount, d dVar, String str, String description, e type, CreditCardInAppStatement$Instalment creditCardInAppStatement$Instalment) {
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f68882a = completedDate;
        this.f68883b = amount;
        this.f68884c = dVar;
        this.d = str;
        this.e = description;
        this.f = type;
        this.f68885g = creditCardInAppStatement$Instalment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInAppStatement$RevolverTransaction)) {
            return false;
        }
        CreditCardInAppStatement$RevolverTransaction creditCardInAppStatement$RevolverTransaction = (CreditCardInAppStatement$RevolverTransaction) obj2;
        return Intrinsics.f(this.f68882a, creditCardInAppStatement$RevolverTransaction.f68882a) && Intrinsics.f(this.f68883b, creditCardInAppStatement$RevolverTransaction.f68883b) && Intrinsics.f(this.f68884c, creditCardInAppStatement$RevolverTransaction.f68884c) && Intrinsics.f(this.d, creditCardInAppStatement$RevolverTransaction.d) && Intrinsics.f(this.e, creditCardInAppStatement$RevolverTransaction.e) && this.f == creditCardInAppStatement$RevolverTransaction.f && Intrinsics.f(this.f68885g, creditCardInAppStatement$RevolverTransaction.f68885g);
    }

    public final int hashCode() {
        int iC = v7.c(this.f68882a.hashCode() * 31, 31, this.f68883b);
        d dVar = this.f68884c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (this.f.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31;
        CreditCardInAppStatement$Instalment creditCardInAppStatement$Instalment = this.f68885g;
        return iHashCode2 + (creditCardInAppStatement$Instalment != null ? creditCardInAppStatement$Instalment.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68882a);
        dest.writeSerializable(this.f68883b);
        dest.writeSerializable(this.f68884c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        CreditCardInAppStatement$Instalment creditCardInAppStatement$Instalment = this.f68885g;
        if (creditCardInAppStatement$Instalment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditCardInAppStatement$Instalment.writeToParcel(dest, i);
        }
    }
}
