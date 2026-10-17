package com.revolut.feature.credit_card.autopay.api.models_v3;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nb5.e;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0002\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment;", "Landroid/os/Parcelable;", "AutoPayment", "BackupCard", "PaymentSource", "nb5/c", "PaymentAmount", "PaymentDay", "nb5/b", "nb5/e", "nb5/d", "com/revolut/feature/credit_card/autopay/api/models_v3/a", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$AutoPayment;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$BackupCard;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardAutopayPayment extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$AutoPayment;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoPayment implements CreditCardAutopayPayment {

        @NotNull
        public static final Parcelable.Creator<AutoPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f70705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nb5.d f70706c;
        public final PaymentSource d;
        public final PaymentAmount e;
        public final PaymentDay f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Instant f70707g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f70708h;
        public final boolean i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoPayment(parcel.readString(), e.valueOf(parcel.readString()), nb5.d.valueOf(parcel.readString()), PaymentSource.CREATOR.createFromParcel(parcel), (PaymentAmount) parcel.readParcelable(AutoPayment.class.getClassLoader()), PaymentDay.CREATOR.createFromParcel(parcel), (Instant) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoPayment[i];
            }
        }

        public AutoPayment(String id10, e type, nb5.d state, PaymentSource source, PaymentAmount amount, PaymentDay paymentDay, Instant instant, Integer num, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(paymentDay, "paymentDay");
            this.f70704a = id10;
            this.f70705b = type;
            this.f70706c = state;
            this.d = source;
            this.e = amount;
            this.f = paymentDay;
            this.f70707g = instant;
            this.f70708h = num;
            this.i = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoPayment)) {
                return false;
            }
            AutoPayment autoPayment = (AutoPayment) obj2;
            return Intrinsics.f(this.f70704a, autoPayment.f70704a) && this.f70705b == autoPayment.f70705b && this.f70706c == autoPayment.f70706c && Intrinsics.f(this.d, autoPayment.d) && Intrinsics.f(this.e, autoPayment.e) && Intrinsics.f(this.f, autoPayment.f) && Intrinsics.f(this.f70707g, autoPayment.f70707g) && Intrinsics.f(this.f70708h, autoPayment.f70708h) && this.i == autoPayment.i;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF70709a() {
            return this.f70704a;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final nb5.d getF70711c() {
            return this.f70706c;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment
        /* JADX INFO: renamed from: getType, reason: from getter */
        public final e getF70710b() {
            return this.f70705b;
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f70706c.hashCode() + ((this.f70705b.hashCode() + (this.f70704a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            Instant instant = this.f70707g;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Integer num = this.f70708h;
            return Boolean.hashCode(this.i) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70704a);
            dest.writeString(this.f70705b.name());
            dest.writeString(this.f70706c.name());
            this.d.writeToParcel(dest, i);
            dest.writeParcelable(this.e, i);
            this.f.writeToParcel(dest, i);
            dest.writeSerializable(this.f70707g);
            Integer num = this.f70708h;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeInt(this.i ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$BackupCard;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackupCard implements CreditCardAutopayPayment {

        @NotNull
        public static final Parcelable.Creator<BackupCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f70710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nb5.d f70711c;
        public final PaymentSource d;
        public final Instant e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BackupCard(parcel.readString(), e.valueOf(parcel.readString()), nb5.d.valueOf(parcel.readString()), PaymentSource.CREATOR.createFromParcel(parcel), (Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackupCard[i];
            }
        }

        public BackupCard(String id10, e type, nb5.d state, PaymentSource source, Instant instant) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f70709a = id10;
            this.f70710b = type;
            this.f70711c = state;
            this.d = source;
            this.e = instant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BackupCard)) {
                return false;
            }
            BackupCard backupCard = (BackupCard) obj2;
            return Intrinsics.f(this.f70709a, backupCard.f70709a) && this.f70710b == backupCard.f70710b && this.f70711c == backupCard.f70711c && Intrinsics.f(this.d, backupCard.d) && Intrinsics.f(this.e, backupCard.e);
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF70709a() {
            return this.f70709a;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final nb5.d getF70711c() {
            return this.f70711c;
        }

        @Override // com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment
        /* JADX INFO: renamed from: getType, reason: from getter */
        public final e getF70710b() {
            return this.f70710b;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ((this.f70711c.hashCode() + ((this.f70710b.hashCode() + (this.f70709a.hashCode() * 31)) * 31)) * 31)) * 31;
            Instant instant = this.e;
            return iHashCode + (instant == null ? 0 : instant.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70709a);
            dest.writeString(this.f70710b.name());
            dest.writeString(this.f70711c.name());
            this.d.writeToParcel(dest, i);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount;", "Landroid/os/Parcelable;", "StatementBalance", "MinRepayment", "Unsupported", "Fixed", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount$Fixed;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount$MinRepayment;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount$StatementBalance;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount$Unsupported;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PaymentAmount extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount$Fixed;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Fixed implements PaymentAmount {

            @NotNull
            public static final Parcelable.Creator<Fixed> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final dj0.d f70712a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Fixed((dj0.d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Fixed[i];
                }
            }

            public Fixed(dj0.d fixedAmount) {
                Intrinsics.checkNotNullParameter(fixedAmount, "fixedAmount");
                this.f70712a = fixedAmount;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Fixed) && Intrinsics.f(this.f70712a, ((Fixed) obj2).f70712a);
            }

            public final int hashCode() {
                return this.f70712a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f70712a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount$MinRepayment;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount;", "<init>", "()V", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class MinRepayment implements PaymentAmount {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final MinRepayment f70713a = new MinRepayment();

            @NotNull
            public static final Parcelable.Creator<MinRepayment> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return MinRepayment.f70713a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MinRepayment[i];
                }
            }

            private MinRepayment() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount$StatementBalance;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount;", "<init>", "()V", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class StatementBalance implements PaymentAmount {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final StatementBalance f70714a = new StatementBalance();

            @NotNull
            public static final Parcelable.Creator<StatementBalance> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return StatementBalance.f70714a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new StatementBalance[i];
                }
            }

            private StatementBalance() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount$Unsupported;", "Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentAmount;", "<init>", "()V", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Unsupported implements PaymentAmount {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Unsupported f70715a = new Unsupported();

            @NotNull
            public static final Parcelable.Creator<Unsupported> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Unsupported.f70715a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Unsupported[i];
                }
            }

            private Unsupported() {
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

        default a N6() throws Throwable {
            Object objA;
            try {
                m.Companion companion = m.INSTANCE;
                if (this instanceof StatementBalance) {
                    objA = a.STATEMENT_BALANCE;
                } else if (this instanceof MinRepayment) {
                    objA = a.MIN_REPAYMENT;
                } else {
                    if (!(this instanceof Fixed)) {
                        if (this instanceof Unsupported) {
                            throw new IllegalArgumentException("Cannot convert PaymentAmount.Unsupported to PaymentAmountType");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    objA = a.FIXED;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            if (objA instanceof n) {
                objA = null;
            }
            return (a) objA;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentDay;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentDay implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PaymentDay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nb5.b f70716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f70717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f70718c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentDay(nb5.b.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentDay[i];
            }
        }

        public PaymentDay(nb5.b type, int i, boolean z) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f70716a = type;
            this.f70717b = i;
            this.f70718c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentDay)) {
                return false;
            }
            PaymentDay paymentDay = (PaymentDay) obj2;
            return this.f70716a == paymentDay.f70716a && this.f70717b == paymentDay.f70717b && this.f70718c == paymentDay.f70718c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f70718c) + j6.a.b(this.f70717b, this.f70716a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70716a.name());
            dest.writeInt(this.f70717b);
            dest.writeInt(this.f70718c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit_card/autopay/api/models_v3/CreditCardAutopayPayment$PaymentSource;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentSource implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PaymentSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nb5.c f70720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f70721c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentSource(parcel.readString(), nb5.c.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentSource[i];
            }
        }

        public PaymentSource(String str, nb5.c state, xi0.b currency) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f70719a = str;
            this.f70720b = state;
            this.f70721c = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentSource)) {
                return false;
            }
            PaymentSource paymentSource = (PaymentSource) obj2;
            return Intrinsics.f(this.f70719a, paymentSource.f70719a) && this.f70720b == paymentSource.f70720b && Intrinsics.f(this.f70721c, paymentSource.f70721c);
        }

        public final int hashCode() {
            String str = this.f70719a;
            return this.f70721c.hashCode() + ((this.f70720b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70719a);
            dest.writeString(this.f70720b.name());
            dest.writeSerializable(this.f70721c);
        }
    }

    /* JADX INFO: renamed from: getId */
    String getF70709a();

    /* JADX INFO: renamed from: getState */
    nb5.d getF70711c();

    /* JADX INFO: renamed from: getType */
    e getF70710b();
}
