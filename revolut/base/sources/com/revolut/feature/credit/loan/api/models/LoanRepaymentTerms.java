package com.revolut.feature.credit.loan.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n35.d;
import n35.e;
import n35.f;
import n35.g;
import n35.h;
import n35.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\n\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "n35/h", "n35/i", "n35/g", "n35/f", "n35/d", "n35/e", "Breakdown", "ScheduleInfo", "AmountDifference", "DateDifference", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanRepaymentTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanRepaymentTerms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f70082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f70083c;
    public final d d;
    public final f e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f70084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Breakdown f70085h;
    public final ScheduleInfo i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$AmountDifference;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountDifference implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AmountDifference> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f70086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f70087b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountDifference((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountDifference[i];
            }
        }

        public AmountDifference(dj0.d current, dj0.d dVar) {
            Intrinsics.checkNotNullParameter(current, "current");
            this.f70086a = current;
            this.f70087b = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AmountDifference)) {
                return false;
            }
            AmountDifference amountDifference = (AmountDifference) obj2;
            return Intrinsics.f(this.f70086a, amountDifference.f70086a) && Intrinsics.f(this.f70087b, amountDifference.f70087b);
        }

        public final int hashCode() {
            int iHashCode = this.f70086a.hashCode() * 31;
            dj0.d dVar = this.f70087b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70086a);
            dest.writeSerializable(this.f70087b);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$Breakdown;", "Landroid/os/Parcelable;", "<init>", "()V", "Healthy", "UnhealthyPartial", "UnhealthyFull", "Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$Breakdown$Healthy;", "Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$Breakdown$UnhealthyFull;", "Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$Breakdown$UnhealthyPartial;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Breakdown implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$Breakdown$Healthy;", "Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$Breakdown;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Healthy extends Breakdown {

            @NotNull
            public static final Parcelable.Creator<Healthy> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final dj0.d f70088a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final dj0.d f70089b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final LoanAccrual f70090c;
            public final LoanAccrual d;
            public final dj0.d e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Healthy((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), parcel.readInt() == 0 ? null : LoanAccrual.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LoanAccrual.CREATOR.createFromParcel(parcel) : null, (dj0.d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Healthy[i];
                }
            }

            public Healthy(dj0.d dVar, dj0.d dVar2, LoanAccrual loanAccrual, LoanAccrual loanAccrual2, dj0.d dVar3) {
                this.f70088a = dVar;
                this.f70089b = dVar2;
                this.f70090c = loanAccrual;
                this.d = loanAccrual2;
                this.e = dVar3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Healthy)) {
                    return false;
                }
                Healthy healthy = (Healthy) obj2;
                return Intrinsics.f(this.f70088a, healthy.f70088a) && Intrinsics.f(this.f70089b, healthy.f70089b) && Intrinsics.f(this.f70090c, healthy.f70090c) && Intrinsics.f(this.d, healthy.d) && Intrinsics.f(this.e, healthy.e);
            }

            public final int hashCode() {
                dj0.d dVar = this.f70088a;
                int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
                dj0.d dVar2 = this.f70089b;
                int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
                LoanAccrual loanAccrual = this.f70090c;
                int iHashCode3 = (iHashCode2 + (loanAccrual == null ? 0 : loanAccrual.hashCode())) * 31;
                LoanAccrual loanAccrual2 = this.d;
                int iHashCode4 = (iHashCode3 + (loanAccrual2 == null ? 0 : loanAccrual2.hashCode())) * 31;
                dj0.d dVar3 = this.e;
                return iHashCode4 + (dVar3 != null ? dVar3.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f70088a);
                dest.writeSerializable(this.f70089b);
                LoanAccrual loanAccrual = this.f70090c;
                if (loanAccrual == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    loanAccrual.writeToParcel(dest, i);
                }
                LoanAccrual loanAccrual2 = this.d;
                if (loanAccrual2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    loanAccrual2.writeToParcel(dest, i);
                }
                dest.writeSerializable(this.e);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$Breakdown$UnhealthyFull;", "Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$Breakdown;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UnhealthyFull extends Breakdown {

            @NotNull
            public static final Parcelable.Creator<UnhealthyFull> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final dj0.d f70091a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final dj0.d f70092b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final LoanAccrual f70093c;
            public final LoanAccrual d;
            public final dj0.d e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UnhealthyFull((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), parcel.readInt() == 0 ? null : LoanAccrual.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LoanAccrual.CREATOR.createFromParcel(parcel) : null, (dj0.d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UnhealthyFull[i];
                }
            }

            public UnhealthyFull(dj0.d dVar, dj0.d dVar2, LoanAccrual loanAccrual, LoanAccrual loanAccrual2, dj0.d dVar3) {
                this.f70091a = dVar;
                this.f70092b = dVar2;
                this.f70093c = loanAccrual;
                this.d = loanAccrual2;
                this.e = dVar3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof UnhealthyFull)) {
                    return false;
                }
                UnhealthyFull unhealthyFull = (UnhealthyFull) obj2;
                return Intrinsics.f(this.f70091a, unhealthyFull.f70091a) && Intrinsics.f(this.f70092b, unhealthyFull.f70092b) && Intrinsics.f(this.f70093c, unhealthyFull.f70093c) && Intrinsics.f(this.d, unhealthyFull.d) && Intrinsics.f(this.e, unhealthyFull.e);
            }

            public final int hashCode() {
                dj0.d dVar = this.f70091a;
                int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
                dj0.d dVar2 = this.f70092b;
                int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
                LoanAccrual loanAccrual = this.f70093c;
                int iHashCode3 = (iHashCode2 + (loanAccrual == null ? 0 : loanAccrual.hashCode())) * 31;
                LoanAccrual loanAccrual2 = this.d;
                int iHashCode4 = (iHashCode3 + (loanAccrual2 == null ? 0 : loanAccrual2.hashCode())) * 31;
                dj0.d dVar3 = this.e;
                return iHashCode4 + (dVar3 != null ? dVar3.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f70091a);
                dest.writeSerializable(this.f70092b);
                LoanAccrual loanAccrual = this.f70093c;
                if (loanAccrual == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    loanAccrual.writeToParcel(dest, i);
                }
                LoanAccrual loanAccrual2 = this.d;
                if (loanAccrual2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    loanAccrual2.writeToParcel(dest, i);
                }
                dest.writeSerializable(this.e);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$Breakdown$UnhealthyPartial;", "Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$Breakdown;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UnhealthyPartial extends Breakdown {

            @NotNull
            public static final Parcelable.Creator<UnhealthyPartial> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final dj0.d f70094a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final dj0.d f70095b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final dj0.d f70096c;
            public final dj0.d d;
            public final dj0.d e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UnhealthyPartial((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UnhealthyPartial[i];
                }
            }

            public UnhealthyPartial(dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, dj0.d dVar5) {
                this.f70094a = dVar;
                this.f70095b = dVar2;
                this.f70096c = dVar3;
                this.d = dVar4;
                this.e = dVar5;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof UnhealthyPartial)) {
                    return false;
                }
                UnhealthyPartial unhealthyPartial = (UnhealthyPartial) obj2;
                return Intrinsics.f(this.f70094a, unhealthyPartial.f70094a) && Intrinsics.f(this.f70095b, unhealthyPartial.f70095b) && Intrinsics.f(this.f70096c, unhealthyPartial.f70096c) && Intrinsics.f(this.d, unhealthyPartial.d) && Intrinsics.f(this.e, unhealthyPartial.e);
            }

            public final int hashCode() {
                dj0.d dVar = this.f70094a;
                int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
                dj0.d dVar2 = this.f70095b;
                int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
                dj0.d dVar3 = this.f70096c;
                int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
                dj0.d dVar4 = this.d;
                int iHashCode4 = (iHashCode3 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
                dj0.d dVar5 = this.e;
                return iHashCode4 + (dVar5 != null ? dVar5.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f70094a);
                dest.writeSerializable(this.f70095b);
                dest.writeSerializable(this.f70096c);
                dest.writeSerializable(this.d);
                dest.writeSerializable(this.e);
            }
        }

        private Breakdown() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$DateDifference;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateDifference implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DateDifference> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f70097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f70098b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateDifference((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateDifference[i];
            }
        }

        public DateDifference(LocalDate current, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(current, "current");
            this.f70097a = current;
            this.f70098b = localDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DateDifference)) {
                return false;
            }
            DateDifference dateDifference = (DateDifference) obj2;
            return Intrinsics.f(this.f70097a, dateDifference.f70097a) && Intrinsics.f(this.f70098b, dateDifference.f70098b);
        }

        public final int hashCode() {
            int iHashCode = this.f70097a.hashCode() * 31;
            LocalDate localDate = this.f70098b;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70097a);
            dest.writeSerializable(this.f70098b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/LoanRepaymentTerms$ScheduleInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScheduleInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ScheduleInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AmountDifference f70099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AmountDifference f70100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AmountDifference f70101c;
        public final DateDifference d;
        public final DateDifference e;
        public final e f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScheduleInfo(parcel.readInt() == 0 ? null : AmountDifference.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AmountDifference.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AmountDifference.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DateDifference.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DateDifference.CREATOR.createFromParcel(parcel) : null, e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScheduleInfo[i];
            }
        }

        public ScheduleInfo(AmountDifference amountDifference, AmountDifference amountDifference2, AmountDifference amountDifference3, DateDifference dateDifference, DateDifference dateDifference2, e repaymentType) {
            Intrinsics.checkNotNullParameter(repaymentType, "repaymentType");
            this.f70099a = amountDifference;
            this.f70100b = amountDifference2;
            this.f70101c = amountDifference3;
            this.d = dateDifference;
            this.e = dateDifference2;
            this.f = repaymentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ScheduleInfo)) {
                return false;
            }
            ScheduleInfo scheduleInfo = (ScheduleInfo) obj2;
            return Intrinsics.f(this.f70099a, scheduleInfo.f70099a) && Intrinsics.f(this.f70100b, scheduleInfo.f70100b) && Intrinsics.f(this.f70101c, scheduleInfo.f70101c) && Intrinsics.f(this.d, scheduleInfo.d) && Intrinsics.f(this.e, scheduleInfo.e) && this.f == scheduleInfo.f;
        }

        public final int hashCode() {
            AmountDifference amountDifference = this.f70099a;
            int iHashCode = (amountDifference == null ? 0 : amountDifference.hashCode()) * 31;
            AmountDifference amountDifference2 = this.f70100b;
            int iHashCode2 = (iHashCode + (amountDifference2 == null ? 0 : amountDifference2.hashCode())) * 31;
            AmountDifference amountDifference3 = this.f70101c;
            int iHashCode3 = (iHashCode2 + (amountDifference3 == null ? 0 : amountDifference3.hashCode())) * 31;
            DateDifference dateDifference = this.d;
            int iHashCode4 = (iHashCode3 + (dateDifference == null ? 0 : dateDifference.hashCode())) * 31;
            DateDifference dateDifference2 = this.e;
            return this.f.hashCode() + ((iHashCode4 + (dateDifference2 != null ? dateDifference2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AmountDifference amountDifference = this.f70099a;
            if (amountDifference == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                amountDifference.writeToParcel(dest, i);
            }
            AmountDifference amountDifference2 = this.f70100b;
            if (amountDifference2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                amountDifference2.writeToParcel(dest, i);
            }
            AmountDifference amountDifference3 = this.f70101c;
            if (amountDifference3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                amountDifference3.writeToParcel(dest, i);
            }
            DateDifference dateDifference = this.d;
            if (dateDifference == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dateDifference.writeToParcel(dest, i);
            }
            DateDifference dateDifference2 = this.e;
            if (dateDifference2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dateDifference2.writeToParcel(dest, i);
            }
            dest.writeString(this.f.name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanRepaymentTerms(parcel.readString(), h.valueOf(parcel.readString()), i.valueOf(parcel.readString()), d.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : f.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), (dj0.d) parcel.readSerializable(), (Breakdown) parcel.readParcelable(LoanRepaymentTerms.class.getClassLoader()), parcel.readInt() != 0 ? ScheduleInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanRepaymentTerms[i];
        }
    }

    public LoanRepaymentTerms(String token, h type, i variant, d behaviour, f fVar, g gVar, dj0.d amount, Breakdown breakdown, ScheduleInfo scheduleInfo) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(behaviour, "behaviour");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f70081a = token;
        this.f70082b = type;
        this.f70083c = variant;
        this.d = behaviour;
        this.e = fVar;
        this.f = gVar;
        this.f70084g = amount;
        this.f70085h = breakdown;
        this.i = scheduleInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanRepaymentTerms)) {
            return false;
        }
        LoanRepaymentTerms loanRepaymentTerms = (LoanRepaymentTerms) obj2;
        return Intrinsics.f(this.f70081a, loanRepaymentTerms.f70081a) && this.f70082b == loanRepaymentTerms.f70082b && this.f70083c == loanRepaymentTerms.f70083c && this.d == loanRepaymentTerms.d && this.e == loanRepaymentTerms.e && this.f == loanRepaymentTerms.f && Intrinsics.f(this.f70084g, loanRepaymentTerms.f70084g) && Intrinsics.f(this.f70085h, loanRepaymentTerms.f70085h) && Intrinsics.f(this.i, loanRepaymentTerms.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f70083c.hashCode() + ((this.f70082b.hashCode() + (this.f70081a.hashCode() * 31)) * 31)) * 31)) * 31;
        f fVar = this.e;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        g gVar = this.f;
        int iC = v7.c((iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f70084g);
        Breakdown breakdown = this.f70085h;
        int iHashCode3 = (iC + (breakdown == null ? 0 : breakdown.hashCode())) * 31;
        ScheduleInfo scheduleInfo = this.i;
        return iHashCode3 + (scheduleInfo != null ? scheduleInfo.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70081a);
        dest.writeString(this.f70082b.name());
        dest.writeString(this.f70083c.name());
        dest.writeString(this.d.name());
        f fVar = this.e;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        g gVar = this.f;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        dest.writeSerializable(this.f70084g);
        dest.writeParcelable(this.f70085h, i);
        ScheduleInfo scheduleInfo = this.i;
        if (scheduleInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            scheduleInfo.writeToParcel(dest, i);
        }
    }
}
