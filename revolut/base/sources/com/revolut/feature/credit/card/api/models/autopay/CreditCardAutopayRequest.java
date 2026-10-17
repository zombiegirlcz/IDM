package com.revolut.feature.credit.card.api.models.autopay;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import fl4.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest;", "Landroid/os/Parcelable;", "Setup", "Update", "AmountType", "fl4/a", "fl4/b", "Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$Setup;", "Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$Update;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardAutopayRequest extends Parcelable {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$AmountType;", "Landroid/os/Parcelable;", "Statement", "Minimum", "Fixed", "Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$AmountType$Fixed;", "Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$AmountType$Minimum;", "Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$AmountType$Statement;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface AmountType extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$AmountType$Fixed;", "Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$AmountType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Fixed implements AmountType {

            @NotNull
            public static final Parcelable.Creator<Fixed> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f68693a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Fixed((d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Fixed[i];
                }
            }

            public Fixed(d amount) {
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.f68693a = amount;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Fixed) && Intrinsics.f(this.f68693a, ((Fixed) obj2).f68693a);
            }

            public final int hashCode() {
                return this.f68693a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f68693a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$AmountType$Minimum;", "Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$AmountType;", "<init>", "()V", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Minimum implements AmountType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Minimum f68694a = new Minimum();

            @NotNull
            public static final Parcelable.Creator<Minimum> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Minimum.f68694a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Minimum[i];
                }
            }

            private Minimum() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$AmountType$Statement;", "Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$AmountType;", "<init>", "()V", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Statement implements AmountType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Statement f68695a = new Statement();

            @NotNull
            public static final Parcelable.Creator<Statement> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Statement.f68695a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Statement[i];
                }
            }

            private Statement() {
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
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$Setup;", "Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Setup implements CreditCardAutopayRequest {

        @NotNull
        public static final Parcelable.Creator<Setup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AmountType f68697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fl4.a f68698c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Setup(parcel.readInt(), (AmountType) parcel.readParcelable(Setup.class.getClassLoader()), fl4.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Setup[i];
            }
        }

        public Setup(int i, AmountType amountType, fl4.a paymentType) {
            Intrinsics.checkNotNullParameter(amountType, "amountType");
            Intrinsics.checkNotNullParameter(paymentType, "paymentType");
            this.f68696a = i;
            this.f68697b = amountType;
            this.f68698c = paymentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Setup)) {
                return false;
            }
            Setup setup = (Setup) obj2;
            return this.f68696a == setup.f68696a && Intrinsics.f(this.f68697b, setup.f68697b) && this.f68698c == setup.f68698c;
        }

        public final int hashCode() {
            return this.f68698c.hashCode() + ((this.f68697b.hashCode() + (Integer.hashCode(this.f68696a) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f68696a);
            dest.writeParcelable(this.f68697b, i);
            dest.writeString(this.f68698c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest$Update;", "Lcom/revolut/feature/credit/card/api/models/autopay/CreditCardAutopayRequest;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Update implements CreditCardAutopayRequest {

        @NotNull
        public static final Parcelable.Creator<Update> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AmountType f68700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fl4.a f68701c;
        public final b d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Update(parcel.readInt(), (AmountType) parcel.readParcelable(Update.class.getClassLoader()), fl4.a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Update[i];
            }
        }

        public Update(int i, AmountType amountType, fl4.a paymentType, b state, String paymentId) {
            Intrinsics.checkNotNullParameter(amountType, "amountType");
            Intrinsics.checkNotNullParameter(paymentType, "paymentType");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            this.f68699a = i;
            this.f68700b = amountType;
            this.f68701c = paymentType;
            this.d = state;
            this.e = paymentId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Update)) {
                return false;
            }
            Update update = (Update) obj2;
            return this.f68699a == update.f68699a && Intrinsics.f(this.f68700b, update.f68700b) && this.f68701c == update.f68701c && this.d == update.d && Intrinsics.f(this.e, update.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f68701c.hashCode() + ((this.f68700b.hashCode() + (Integer.hashCode(this.f68699a) * 31)) * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f68699a);
            dest.writeParcelable(this.f68700b, i);
            dest.writeString(this.f68701c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e);
        }
    }
}
