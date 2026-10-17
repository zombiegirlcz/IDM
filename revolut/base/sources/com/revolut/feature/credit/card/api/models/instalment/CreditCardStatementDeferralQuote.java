package com.revolut.feature.credit.card.api.models.instalment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardCellModel;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardStatementDeferralQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ScheduleExcerpt", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardStatementDeferralQuote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardStatementDeferralQuote> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f68802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f68803c;
    public final d d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f68804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f68805h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f68806j;
    public final ScheduleExcerpt k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f68807l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f68808m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f68809n;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/instalment/CreditCardStatementDeferralQuote$ScheduleExcerpt;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScheduleExcerpt implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ScheduleExcerpt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f68810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f68811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f68812c;
        public final LocalDate d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScheduleExcerpt((d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScheduleExcerpt[i];
            }
        }

        public ScheduleExcerpt(d instalment, d lastInstalment, LocalDate firstPaymentDate, LocalDate lastPaymentDate) {
            Intrinsics.checkNotNullParameter(instalment, "instalment");
            Intrinsics.checkNotNullParameter(lastInstalment, "lastInstalment");
            Intrinsics.checkNotNullParameter(firstPaymentDate, "firstPaymentDate");
            Intrinsics.checkNotNullParameter(lastPaymentDate, "lastPaymentDate");
            this.f68810a = instalment;
            this.f68811b = lastInstalment;
            this.f68812c = firstPaymentDate;
            this.d = lastPaymentDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ScheduleExcerpt)) {
                return false;
            }
            ScheduleExcerpt scheduleExcerpt = (ScheduleExcerpt) obj2;
            return Intrinsics.f(this.f68810a, scheduleExcerpt.f68810a) && Intrinsics.f(this.f68811b, scheduleExcerpt.f68811b) && Intrinsics.f(this.f68812c, scheduleExcerpt.f68812c) && Intrinsics.f(this.d, scheduleExcerpt.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + y.a(v7.c(this.f68810a.hashCode() * 31, 31, this.f68811b), 31, this.f68812c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68810a);
            dest.writeSerializable(this.f68811b);
            dest.writeSerializable(this.f68812c);
            dest.writeSerializable(this.d);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            d dVar4 = (d) parcel.readSerializable();
            d dVar5 = (d) parcel.readSerializable();
            d dVar6 = (d) parcel.readSerializable();
            d dVar7 = (d) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ScheduleExcerpt scheduleExcerptCreateFromParcel = ScheduleExcerpt.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditCardCellModel.CREATOR, parcel, arrayList2, iA, 1);
                    i2 = i2;
                }
                arrayList = arrayList2;
            }
            return new CreditCardStatementDeferralQuote(i, dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, string, string2, scheduleExcerptCreateFromParcel, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardStatementDeferralQuote[i];
        }
    }

    public CreditCardStatementDeferralQuote(int i, d currentDownPayment, d minDownPayment, d maxDownPayment, d totalPrincipal, d totalInterest, d totalTax, d totalRepayable, String monthlyInterestRate, String apr, ScheduleExcerpt scheduleExcerpt, List list, String str, String quoteIdentifier) {
        Intrinsics.checkNotNullParameter(currentDownPayment, "currentDownPayment");
        Intrinsics.checkNotNullParameter(minDownPayment, "minDownPayment");
        Intrinsics.checkNotNullParameter(maxDownPayment, "maxDownPayment");
        Intrinsics.checkNotNullParameter(totalPrincipal, "totalPrincipal");
        Intrinsics.checkNotNullParameter(totalInterest, "totalInterest");
        Intrinsics.checkNotNullParameter(totalTax, "totalTax");
        Intrinsics.checkNotNullParameter(totalRepayable, "totalRepayable");
        Intrinsics.checkNotNullParameter(monthlyInterestRate, "monthlyInterestRate");
        Intrinsics.checkNotNullParameter(apr, "apr");
        Intrinsics.checkNotNullParameter(scheduleExcerpt, "scheduleExcerpt");
        Intrinsics.checkNotNullParameter(quoteIdentifier, "quoteIdentifier");
        this.f68801a = i;
        this.f68802b = currentDownPayment;
        this.f68803c = minDownPayment;
        this.d = maxDownPayment;
        this.e = totalPrincipal;
        this.f = totalInterest;
        this.f68804g = totalTax;
        this.f68805h = totalRepayable;
        this.i = monthlyInterestRate;
        this.f68806j = apr;
        this.k = scheduleExcerpt;
        this.f68807l = list;
        this.f68808m = str;
        this.f68809n = quoteIdentifier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardStatementDeferralQuote)) {
            return false;
        }
        CreditCardStatementDeferralQuote creditCardStatementDeferralQuote = (CreditCardStatementDeferralQuote) obj2;
        return this.f68801a == creditCardStatementDeferralQuote.f68801a && Intrinsics.f(this.f68802b, creditCardStatementDeferralQuote.f68802b) && Intrinsics.f(this.f68803c, creditCardStatementDeferralQuote.f68803c) && Intrinsics.f(this.d, creditCardStatementDeferralQuote.d) && Intrinsics.f(this.e, creditCardStatementDeferralQuote.e) && Intrinsics.f(this.f, creditCardStatementDeferralQuote.f) && Intrinsics.f(this.f68804g, creditCardStatementDeferralQuote.f68804g) && Intrinsics.f(this.f68805h, creditCardStatementDeferralQuote.f68805h) && Intrinsics.f(this.i, creditCardStatementDeferralQuote.i) && Intrinsics.f(this.f68806j, creditCardStatementDeferralQuote.f68806j) && Intrinsics.f(this.k, creditCardStatementDeferralQuote.k) && Intrinsics.f(this.f68807l, creditCardStatementDeferralQuote.f68807l) && Intrinsics.f(this.f68808m, creditCardStatementDeferralQuote.f68808m) && Intrinsics.f(this.f68809n, creditCardStatementDeferralQuote.f68809n);
    }

    public final int hashCode() {
        int iHashCode = (this.k.hashCode() + p.a.c(p.a.c(v7.c(v7.c(v7.c(v7.c(v7.c(v7.c(v7.c(Integer.hashCode(this.f68801a) * 31, 31, this.f68802b), 31, this.f68803c), 31, this.d), 31, this.e), 31, this.f), 31, this.f68804g), 31, this.f68805h), 31, this.i), 31, this.f68806j)) * 31;
        List list = this.f68807l;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f68808m;
        return this.f68809n.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f68801a);
        dest.writeSerializable(this.f68802b);
        dest.writeSerializable(this.f68803c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f68804g);
        dest.writeSerializable(this.f68805h);
        dest.writeString(this.i);
        dest.writeString(this.f68806j);
        this.k.writeToParcel(dest, i);
        List list = this.f68807l;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((CreditCardCellModel) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.f68808m);
        dest.writeString(this.f68809n);
    }
}
