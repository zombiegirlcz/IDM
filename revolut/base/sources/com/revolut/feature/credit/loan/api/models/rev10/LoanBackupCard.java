package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard;", "Landroid/os/Parcelable;", "<init>", "()V", "None", "Stale", "ExternalCard", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$ExternalCard;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$None;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$Stale;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanBackupCard implements Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$ExternalCard;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard;", "Personal", "CoBorrower", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$ExternalCard$CoBorrower;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$ExternalCard$Personal;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ExternalCard extends LoanBackupCard {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f70129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70130b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$ExternalCard$CoBorrower;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$ExternalCard;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CoBorrower extends ExternalCard {

            @NotNull
            public static final Parcelable.Creator<CoBorrower> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final LoanBackupCardPaymentSource f70131c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CoBorrower(LoanBackupCardPaymentSource.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CoBorrower[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CoBorrower(LoanBackupCardPaymentSource backUpPaymentSource) {
                super(backUpPaymentSource.f70137c == q35.c.Active, backUpPaymentSource.f70136b);
                Intrinsics.checkNotNullParameter(backUpPaymentSource, "backUpPaymentSource");
                this.f70131c = backUpPaymentSource;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CoBorrower) && Intrinsics.f(this.f70131c, ((CoBorrower) obj2).f70131c);
            }

            public final int hashCode() {
                return this.f70131c.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f70131c.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$ExternalCard$Personal;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$ExternalCard;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Personal extends ExternalCard {

            @NotNull
            public static final Parcelable.Creator<Personal> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final t61.g f70132c;
            public final q35.c d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Personal((t61.g) parcel.readSerializable(), q35.c.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Personal[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Personal(t61.g card, q35.c repaymentSourceState) {
                super(repaymentSourceState == q35.c.Active, card.f268138b);
                Intrinsics.checkNotNullParameter(card, "card");
                Intrinsics.checkNotNullParameter(repaymentSourceState, "repaymentSourceState");
                this.f70132c = card;
                this.d = repaymentSourceState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Personal)) {
                    return false;
                }
                Personal personal = (Personal) obj2;
                return Intrinsics.f(this.f70132c, personal.f70132c) && this.d == personal.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.f70132c.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f70132c);
                dest.writeString(this.d.name());
            }
        }

        public ExternalCard(boolean z, String str) {
            this.f70129a = z;
            this.f70130b = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$None;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard;", "<init>", "()V", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None extends LoanBackupCard {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f70133a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f70133a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard$Stale;", "Lcom/revolut/feature/credit/loan/api/models/rev10/LoanBackupCard;", "<init>", "()V", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Stale extends LoanBackupCard {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Stale f70134a = new Stale();

        @NotNull
        public static final Parcelable.Creator<Stale> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Stale.f70134a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stale[i];
            }
        }

        private Stale() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private LoanBackupCard() {
    }
}
