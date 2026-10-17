package com.revolut.feature.rewards.api.model.rent_and_bills;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsConfigurations;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Configuration", "PaymentEligibility", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RentAndBillsConfigurations implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RentAndBillsConfigurations> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Configuration f84777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f84778b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsConfigurations$Configuration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "PaymentCriteria", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Configuration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f84779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f84780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f84781c;
        public final PaymentCriteria d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsConfigurations$Configuration$PaymentCriteria;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PaymentCriteria implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PaymentCriteria> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f84782a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f84783b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f84784c;
            public final ArrayList d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    d dVar = (d) parcel.readSerializable();
                    d dVar2 = (d) parcel.readSerializable();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(b.valueOf(parcel.readString()));
                    }
                    int i3 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i3);
                    while (iE != i3) {
                        iE = j6.a.e(PaymentCriteria.class, parcel, arrayList2, iE, 1);
                    }
                    return new PaymentCriteria(dVar, dVar2, arrayList, arrayList2);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PaymentCriteria[i];
                }
            }

            public PaymentCriteria(d dVar, d dVar2, ArrayList types, ArrayList eligibilities) {
                Intrinsics.checkNotNullParameter(types, "types");
                Intrinsics.checkNotNullParameter(eligibilities, "eligibilities");
                this.f84782a = dVar;
                this.f84783b = dVar2;
                this.f84784c = types;
                this.d = eligibilities;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PaymentCriteria)) {
                    return false;
                }
                PaymentCriteria paymentCriteria = (PaymentCriteria) obj2;
                return Intrinsics.f(this.f84782a, paymentCriteria.f84782a) && Intrinsics.f(this.f84783b, paymentCriteria.f84783b) && this.f84784c.equals(paymentCriteria.f84784c) && this.d.equals(paymentCriteria.d);
            }

            public final int hashCode() {
                d dVar = this.f84782a;
                int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
                d dVar2 = this.f84783b;
                return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f84784c, (iHashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f84782a);
                dest.writeSerializable(this.f84783b);
                Iterator itY = j6.a.y(this.f84784c, dest);
                while (itY.hasNext()) {
                    dest.writeString(((b) itY.next()).name());
                }
                Iterator itY2 = j6.a.y(this.d, dest);
                while (itY2.hasNext()) {
                    dest.writeParcelable((Parcelable) itY2.next(), i);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Configuration(parcel.readDouble(), (d) parcel.readSerializable(), parcel.readInt(), PaymentCriteria.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public Configuration(double d, d pointsEarnValue, int i, PaymentCriteria paymentCriteria) {
            Intrinsics.checkNotNullParameter(pointsEarnValue, "pointsEarnValue");
            Intrinsics.checkNotNullParameter(paymentCriteria, "paymentCriteria");
            this.f84779a = d;
            this.f84780b = pointsEarnValue;
            this.f84781c = i;
            this.d = paymentCriteria;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj2;
            return Double.compare(this.f84779a, configuration.f84779a) == 0 && Intrinsics.f(this.f84780b, configuration.f84780b) && this.f84781c == configuration.f84781c && Intrinsics.f(this.d, configuration.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.b(this.f84781c, v7.c(Double.hashCode(this.f84779a) * 31, 31, this.f84780b), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f84779a);
            dest.writeSerializable(this.f84780b);
            dest.writeInt(this.f84781c);
            this.d.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsConfigurations$PaymentEligibility;", "Landroid/os/Parcelable;", "DirectDebitEligibility", "Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsConfigurations$PaymentEligibility$DirectDebitEligibility;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PaymentEligibility extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsConfigurations$PaymentEligibility$DirectDebitEligibility;", "Lcom/revolut/feature/rewards/api/model/rent_and_bills/RentAndBillsConfigurations$PaymentEligibility;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DirectDebitEligibility implements PaymentEligibility {

            @NotNull
            public static final Parcelable.Creator<DirectDebitEligibility> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f84785a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DirectDebitEligibility(parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DirectDebitEligibility[i];
                }
            }

            public DirectDebitEligibility(List sepaCreditorIds) {
                Intrinsics.checkNotNullParameter(sepaCreditorIds, "sepaCreditorIds");
                this.f84785a = sepaCreditorIds;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof DirectDebitEligibility) && Intrinsics.f(this.f84785a, ((DirectDebitEligibility) obj2).f84785a);
            }

            public final int hashCode() {
                return this.f84785a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeStringList(this.f84785a);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RentAndBillsConfigurations(parcel.readInt() == 0 ? null : Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Configuration.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RentAndBillsConfigurations[i];
        }
    }

    public RentAndBillsConfigurations(Configuration configuration, Configuration configuration2) {
        this.f84777a = configuration;
        this.f84778b = configuration2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RentAndBillsConfigurations)) {
            return false;
        }
        RentAndBillsConfigurations rentAndBillsConfigurations = (RentAndBillsConfigurations) obj2;
        return Intrinsics.f(this.f84777a, rentAndBillsConfigurations.f84777a) && Intrinsics.f(this.f84778b, rentAndBillsConfigurations.f84778b);
    }

    public final int hashCode() {
        Configuration configuration = this.f84777a;
        int iHashCode = (configuration == null ? 0 : configuration.hashCode()) * 31;
        Configuration configuration2 = this.f84778b;
        return iHashCode + (configuration2 != null ? configuration2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Configuration configuration = this.f84777a;
        if (configuration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            configuration.writeToParcel(dest, i);
        }
        Configuration configuration2 = this.f84778b;
        if (configuration2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            configuration2.writeToParcel(dest, i);
        }
    }
}
