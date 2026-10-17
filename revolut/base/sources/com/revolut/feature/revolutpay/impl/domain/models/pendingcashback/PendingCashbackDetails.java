package com.revolut.feature.revolutpay.impl.domain.models.pendingcashback;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails;", "Landroid/os/Parcelable;", "<init>", "()V", "Data", "Empty", "Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Data;", "Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Empty;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PendingCashbackDetails implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Data;", "Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails;", "", "toString", "()Ljava/lang/String;", "Requirement", "com/revolut/feature/revolutpay/impl/domain/models/pendingcashback/a", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data extends PendingCashbackDetails {

        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f84447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84449c;
        public final com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a d;
        public final ArrayList e;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Data$Requirement;", "Landroid/os/Parcelable;", "<init>", "()V", "Kyc", "PaymentTransactionThreshold", "Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Data$Requirement$Kyc;", "Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Data$Requirement$PaymentTransactionThreshold;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Requirement implements Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Data$Requirement$Kyc;", "Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Data$Requirement;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Kyc extends Requirement {

                @NotNull
                public static final Parcelable.Creator<Kyc> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a f84450a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final d f84451b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Kyc(com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a.valueOf(parcel.readString()), (d) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Kyc[i];
                    }
                }

                public Kyc(com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a status, d dVar) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    this.f84450a = status;
                    this.f84451b = dVar;
                }

                @Override // com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.PendingCashbackDetails.Data.Requirement
                /* JADX INFO: renamed from: a, reason: from getter */
                public final com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a getF84452a() {
                    return this.f84450a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Kyc)) {
                        return false;
                    }
                    Kyc kyc2 = (Kyc) obj2;
                    return this.f84450a == kyc2.f84450a && Intrinsics.f(this.f84451b, kyc2.f84451b);
                }

                public final int hashCode() {
                    int iHashCode = this.f84450a.hashCode() * 31;
                    d dVar = this.f84451b;
                    return iHashCode + (dVar == null ? 0 : dVar.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f84450a.name());
                    dest.writeSerializable(this.f84451b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Data$Requirement$PaymentTransactionThreshold;", "Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Data$Requirement;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class PaymentTransactionThreshold extends Requirement {

                @NotNull
                public static final Parcelable.Creator<PaymentTransactionThreshold> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a f84452a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final d f84453b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final long f84454c;
                public final d d;
                public final boolean e;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PaymentTransactionThreshold(com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readLong(), (d) parcel.readSerializable(), parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new PaymentTransactionThreshold[i];
                    }
                }

                public PaymentTransactionThreshold(com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a status, d dVar, long j2, d dVar2, boolean z) {
                    Intrinsics.checkNotNullParameter(status, "status");
                    this.f84452a = status;
                    this.f84453b = dVar;
                    this.f84454c = j2;
                    this.d = dVar2;
                    this.e = z;
                }

                @Override // com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.PendingCashbackDetails.Data.Requirement
                /* JADX INFO: renamed from: a, reason: from getter */
                public final com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a getF84452a() {
                    return this.f84452a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof PaymentTransactionThreshold)) {
                        return false;
                    }
                    PaymentTransactionThreshold paymentTransactionThreshold = (PaymentTransactionThreshold) obj2;
                    return this.f84452a == paymentTransactionThreshold.f84452a && Intrinsics.f(this.f84453b, paymentTransactionThreshold.f84453b) && this.f84454c == paymentTransactionThreshold.f84454c && Intrinsics.f(this.d, paymentTransactionThreshold.d) && this.e == paymentTransactionThreshold.e;
                }

                public final int hashCode() {
                    int iHashCode = this.f84452a.hashCode() * 31;
                    d dVar = this.f84453b;
                    int iC = a0.d.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f84454c);
                    d dVar2 = this.d;
                    return Boolean.hashCode(this.e) + ((iC + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f84452a.name());
                    dest.writeSerializable(this.f84453b);
                    dest.writeLong(this.f84454c);
                    dest.writeSerializable(this.d);
                    dest.writeInt(this.e ? 1 : 0);
                }
            }

            private Requirement() {
            }

            /* JADX INFO: renamed from: a */
            public abstract com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a getF84452a();
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVar = (d) parcel.readSerializable();
                String string = parcel.readString();
                String string2 = parcel.readString();
                com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a aVarValueOf = com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Data.class, parcel, arrayList, iE, 1);
                }
                return new Data(dVar, string, string2, aVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data(d totalAmount, String str, String merchantCountry, com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a status, ArrayList requirements) {
            Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
            Intrinsics.checkNotNullParameter(merchantCountry, "merchantCountry");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(requirements, "requirements");
            this.f84447a = totalAmount;
            this.f84448b = str;
            this.f84449c = merchantCountry;
            this.d = status;
            this.e = requirements;
        }

        public final boolean a() {
            ArrayList arrayList = this.e;
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (((Requirement) it8.next()).getF84452a() != com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.a.Done) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Data)) {
                return false;
            }
            Data data = (Data) obj2;
            return Intrinsics.f(this.f84447a, data.f84447a) && Intrinsics.f(this.f84448b, data.f84448b) && Intrinsics.f(this.f84449c, data.f84449c) && this.d == data.d && this.e.equals(data.e);
        }

        public final int hashCode() {
            int iHashCode = this.f84447a.hashCode() * 31;
            String str = this.f84448b;
            return this.e.hashCode() + ((this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f84449c)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f84447a);
            dest.writeString(this.f84448b);
            dest.writeString(this.f84449c);
            dest.writeString(this.d.name());
            Iterator itY = j6.a.y(this.e, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails$Empty;", "Lcom/revolut/feature/revolutpay/impl/domain/models/pendingcashback/PendingCashbackDetails;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Empty extends PendingCashbackDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Empty f84455a = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.f84455a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        private Empty() {
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

    private PendingCashbackDetails() {
    }
}
