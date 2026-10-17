package com.revolut.feature.credit.card.api.models.statement;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/api/models/statement/CreditCardInAppStatement$AccruedInterest", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInAppStatement$AccruedInterest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardInAppStatement$AccruedInterest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f68869c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardInAppStatement$RevolverTransaction.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CreditCardInAppStatement$AccruedInterest(string, string2, dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInAppStatement$AccruedInterest[i];
        }
    }

    public CreditCardInAppStatement$AccruedInterest(String label, String explainer, d amount, ArrayList transactions) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(explainer, "explainer");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f68867a = label;
        this.f68868b = explainer;
        this.f68869c = amount;
        this.d = transactions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInAppStatement$AccruedInterest)) {
            return false;
        }
        CreditCardInAppStatement$AccruedInterest creditCardInAppStatement$AccruedInterest = (CreditCardInAppStatement$AccruedInterest) obj2;
        return Intrinsics.f(this.f68867a, creditCardInAppStatement$AccruedInterest.f68867a) && Intrinsics.f(this.f68868b, creditCardInAppStatement$AccruedInterest.f68868b) && Intrinsics.f(this.f68869c, creditCardInAppStatement$AccruedInterest.f68869c) && this.d.equals(creditCardInAppStatement$AccruedInterest.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(p.a.c(this.f68867a.hashCode() * 31, 31, this.f68868b), 31, this.f68869c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68867a);
        dest.writeString(this.f68868b);
        dest.writeSerializable(this.f68869c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((CreditCardInAppStatement$RevolverTransaction) itY.next()).writeToParcel(dest, i);
        }
    }
}
