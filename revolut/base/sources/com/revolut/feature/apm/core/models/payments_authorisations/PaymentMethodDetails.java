package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "Landroid/os/Parcelable;", "Unknown", "Pix", "Upi", "PayTo", "Giro", "Pse", "Iris", "Wero", "Masav", "MasavRequestToPay", "Aani", "AlipayPlus", "Creditor", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Aani;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$AlipayPlus;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Giro;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Iris;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Masav;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$MasavRequestToPay;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$PayTo;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pix;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Unknown;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Upi;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Wero;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentMethodDetails extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Aani;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Aani implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<Aani> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Creditor f62025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62027c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Aani(Creditor.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Aani[i];
            }
        }

        public Aani(Creditor creditor, String str, String str2) {
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            this.f62025a = creditor;
            this.f62026b = str;
            this.f62027c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Aani)) {
                return false;
            }
            Aani aani = (Aani) obj2;
            return Intrinsics.f(this.f62025a, aani.f62025a) && Intrinsics.f(this.f62026b, aani.f62026b) && Intrinsics.f(this.f62027c, aani.f62027c);
        }

        public final int hashCode() {
            int iHashCode = this.f62025a.hashCode() * 31;
            String str = this.f62026b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f62027c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62025a.writeToParcel(dest, i);
            dest.writeString(this.f62026b);
            dest.writeString(this.f62027c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$AlipayPlus;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AlipayPlus implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<AlipayPlus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Creditor f62028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62029b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AlipayPlus(Creditor.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AlipayPlus[i];
            }
        }

        public AlipayPlus(Creditor creditor, String str) {
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            this.f62028a = creditor;
            this.f62029b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AlipayPlus)) {
                return false;
            }
            AlipayPlus alipayPlus = (AlipayPlus) obj2;
            return Intrinsics.f(this.f62028a, alipayPlus.f62028a) && Intrinsics.f(this.f62029b, alipayPlus.f62029b);
        }

        public final int hashCode() {
            int iHashCode = this.f62028a.hashCode() * 31;
            String str = this.f62029b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62028a.writeToParcel(dest, i);
            dest.writeString(this.f62029b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Creditor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Creditor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Creditor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Identification f62031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62032c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Creditor(parcel.readString(), parcel.readInt() == 0 ? null : Identification.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Creditor[i];
            }
        }

        public Creditor(String name, Identification identification, String str, String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f62030a = name;
            this.f62031b = identification;
            this.f62032c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Creditor)) {
                return false;
            }
            Creditor creditor = (Creditor) obj2;
            return Intrinsics.f(this.f62030a, creditor.f62030a) && Intrinsics.f(this.f62031b, creditor.f62031b) && Intrinsics.f(this.f62032c, creditor.f62032c) && Intrinsics.f(this.d, creditor.d);
        }

        public final int hashCode() {
            int iHashCode = this.f62030a.hashCode() * 31;
            Identification identification = this.f62031b;
            int iHashCode2 = (iHashCode + (identification == null ? 0 : identification.hashCode())) * 31;
            String str = this.f62032c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62030a);
            Identification identification = this.f62031b;
            if (identification == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                identification.writeToParcel(dest, i);
            }
            dest.writeString(this.f62032c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Giro;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "Consumer", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Giro implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<Giro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Consumer f62033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f62034b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Giro$Consumer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Consumer implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Consumer> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f62035a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Consumer(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Consumer[i];
                }
            }

            public Consumer(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f62035a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Consumer) && Intrinsics.f(this.f62035a, ((Consumer) obj2).f62035a);
            }

            public final int hashCode() {
                return this.f62035a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62035a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Giro(Consumer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Giro[i];
            }
        }

        public Giro(Consumer consumer, boolean z) {
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            this.f62033a = consumer;
            this.f62034b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Giro)) {
                return false;
            }
            Giro giro = (Giro) obj2;
            return Intrinsics.f(this.f62033a, giro.f62033a) && this.f62034b == giro.f62034b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62034b) + (this.f62033a.f62035a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62033a.writeToParcel(dest, i);
            dest.writeInt(this.f62034b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Iris;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Iris implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<Iris> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Creditor f62036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f62037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62038c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Iris(Creditor.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Iris[i];
            }
        }

        public Iris(Creditor creditor, d amount, String str, String str2) {
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f62036a = creditor;
            this.f62037b = amount;
            this.f62038c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Iris)) {
                return false;
            }
            Iris iris = (Iris) obj2;
            return Intrinsics.f(this.f62036a, iris.f62036a) && Intrinsics.f(this.f62037b, iris.f62037b) && Intrinsics.f(this.f62038c, iris.f62038c) && Intrinsics.f(this.d, iris.d);
        }

        public final int hashCode() {
            int iC = v7.c(this.f62036a.hashCode() * 31, 31, this.f62037b);
            String str = this.f62038c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62036a.writeToParcel(dest, i);
            dest.writeSerializable(this.f62037b);
            dest.writeString(this.f62038c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Masav;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Masav implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<Masav> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62039a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Masav(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Masav[i];
            }
        }

        public Masav(String str) {
            this.f62039a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Masav) && Intrinsics.f(this.f62039a, ((Masav) obj2).f62039a);
        }

        public final int hashCode() {
            String str = this.f62039a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62039a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$MasavRequestToPay;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MasavRequestToPay implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<MasavRequestToPay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Creditor f62040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62042c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MasavRequestToPay(Creditor.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MasavRequestToPay[i];
            }
        }

        public MasavRequestToPay(Creditor creditor, String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            this.f62040a = creditor;
            this.f62041b = str;
            this.f62042c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MasavRequestToPay)) {
                return false;
            }
            MasavRequestToPay masavRequestToPay = (MasavRequestToPay) obj2;
            return Intrinsics.f(this.f62040a, masavRequestToPay.f62040a) && Intrinsics.f(this.f62041b, masavRequestToPay.f62041b) && Intrinsics.f(this.f62042c, masavRequestToPay.f62042c) && Intrinsics.f(this.d, masavRequestToPay.d) && Intrinsics.f(this.e, masavRequestToPay.e);
        }

        public final int hashCode() {
            int iHashCode = this.f62040a.hashCode() * 31;
            String str = this.f62041b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f62042c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62040a.writeToParcel(dest, i);
            dest.writeString(this.f62041b);
            dest.writeString(this.f62042c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$PayTo;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "AdditionalInfo", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayTo implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<PayTo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Creditor f62044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62045c;
        public final d d;
        public final d e;
        public final AmountType f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final LocalDate f62046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final LocalDate f62047h;
        public final Integer i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f62048j;
        public final LocalTime k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Party f62049l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final DebtorAlias f62050m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AdditionalInfo f62051n;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$PayTo$AdditionalInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AdditionalInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AdditionalInfo> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f62052a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Purpose f62053b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f62054c;
            public final Boolean d;
            public final String e;
            public final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f62055g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final String f62056h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    Boolean boolValueOf = null;
                    Purpose purposeCreateFromParcel = parcel.readInt() == 0 ? null : Purpose.CREATOR.createFromParcel(parcel);
                    String string2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new AdditionalInfo(string, purposeCreateFromParcel, string2, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AdditionalInfo[i];
                }
            }

            public AdditionalInfo(String str, Purpose purpose, String str2, Boolean bool, String str3, String str4, String str5, String str6) {
                this.f62052a = str;
                this.f62053b = purpose;
                this.f62054c = str2;
                this.d = bool;
                this.e = str3;
                this.f = str4;
                this.f62055g = str5;
                this.f62056h = str6;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AdditionalInfo)) {
                    return false;
                }
                AdditionalInfo additionalInfo = (AdditionalInfo) obj2;
                return Intrinsics.f(this.f62052a, additionalInfo.f62052a) && this.f62053b == additionalInfo.f62053b && Intrinsics.f(this.f62054c, additionalInfo.f62054c) && Intrinsics.f(this.d, additionalInfo.d) && Intrinsics.f(this.e, additionalInfo.e) && Intrinsics.f(this.f, additionalInfo.f) && Intrinsics.f(this.f62055g, additionalInfo.f62055g) && Intrinsics.f(this.f62056h, additionalInfo.f62056h);
            }

            public final int hashCode() {
                String str = this.f62052a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Purpose purpose = this.f62053b;
                int iHashCode2 = (iHashCode + (purpose == null ? 0 : purpose.hashCode())) * 31;
                String str2 = this.f62054c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.d;
                int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str3 = this.e;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f;
                int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f62055g;
                int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f62056h;
                return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62052a);
                Purpose purpose = this.f62053b;
                if (purpose == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    purpose.writeToParcel(dest, i);
                }
                dest.writeString(this.f62054c);
                Boolean bool = this.d;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    p.a.A(dest, 1, bool);
                }
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.f62055g);
                dest.writeString(this.f62056h);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayTo(parcel.readString(), Creditor.CREATOR.createFromParcel(parcel), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : AmountType.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (LocalTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Party.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DebtorAlias.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AdditionalInfo.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayTo[i];
            }
        }

        public PayTo(String description, Creditor creditor, String pocketId, d dVar, d dVar2, AmountType amountType, LocalDate localDate, LocalDate localDate2, Integer num, Integer num2, LocalTime localTime, Party party, DebtorAlias debtorAlias, AdditionalInfo additionalInfo) {
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            this.f62043a = description;
            this.f62044b = creditor;
            this.f62045c = pocketId;
            this.d = dVar;
            this.e = dVar2;
            this.f = amountType;
            this.f62046g = localDate;
            this.f62047h = localDate2;
            this.i = num;
            this.f62048j = num2;
            this.k = localTime;
            this.f62049l = party;
            this.f62050m = debtorAlias;
            this.f62051n = additionalInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PayTo)) {
                return false;
            }
            PayTo payTo = (PayTo) obj2;
            return Intrinsics.f(this.f62043a, payTo.f62043a) && Intrinsics.f(this.f62044b, payTo.f62044b) && Intrinsics.f(this.f62045c, payTo.f62045c) && Intrinsics.f(this.d, payTo.d) && Intrinsics.f(this.e, payTo.e) && this.f == payTo.f && Intrinsics.f(this.f62046g, payTo.f62046g) && Intrinsics.f(this.f62047h, payTo.f62047h) && Intrinsics.f(this.i, payTo.i) && Intrinsics.f(this.f62048j, payTo.f62048j) && Intrinsics.f(this.k, payTo.k) && this.f62049l == payTo.f62049l && Intrinsics.f(this.f62050m, payTo.f62050m) && Intrinsics.f(this.f62051n, payTo.f62051n);
        }

        public final int hashCode() {
            int iC = p.a.c((this.f62044b.hashCode() + (this.f62043a.hashCode() * 31)) * 31, 31, this.f62045c);
            d dVar = this.d;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            d dVar2 = this.e;
            int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
            AmountType amountType = this.f;
            int iHashCode3 = (iHashCode2 + (amountType == null ? 0 : amountType.hashCode())) * 31;
            LocalDate localDate = this.f62046g;
            int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.f62047h;
            int iHashCode5 = (iHashCode4 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
            Integer num = this.i;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f62048j;
            int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            LocalTime localTime = this.k;
            int iHashCode8 = (iHashCode7 + (localTime == null ? 0 : localTime.hashCode())) * 31;
            Party party = this.f62049l;
            int iHashCode9 = (iHashCode8 + (party == null ? 0 : party.hashCode())) * 31;
            DebtorAlias debtorAlias = this.f62050m;
            int iHashCode10 = (iHashCode9 + (debtorAlias == null ? 0 : debtorAlias.hashCode())) * 31;
            AdditionalInfo additionalInfo = this.f62051n;
            return iHashCode10 + (additionalInfo != null ? additionalInfo.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62043a);
            this.f62044b.writeToParcel(dest, i);
            dest.writeString(this.f62045c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            AmountType amountType = this.f;
            if (amountType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                amountType.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f62046g);
            dest.writeSerializable(this.f62047h);
            Integer num = this.i;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            Integer num2 = this.f62048j;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num2);
            }
            dest.writeSerializable(this.k);
            Party party = this.f62049l;
            if (party == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                party.writeToParcel(dest, i);
            }
            DebtorAlias debtorAlias = this.f62050m;
            if (debtorAlias == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                debtorAlias.writeToParcel(dest, i);
            }
            AdditionalInfo additionalInfo = this.f62051n;
            if (additionalInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                additionalInfo.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pix;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pix implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<Pix> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Creditor f62057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Debtor f62058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f62059c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pix(Creditor.CREATOR.createFromParcel(parcel), Debtor.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pix[i];
            }
        }

        public Pix(Creditor creditor, Debtor debtor, List additionalInformation, String documentNumber, String str) {
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            Intrinsics.checkNotNullParameter(debtor, "debtor");
            Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
            Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
            this.f62057a = creditor;
            this.f62058b = debtor;
            this.f62059c = additionalInformation;
            this.d = documentNumber;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pix)) {
                return false;
            }
            Pix pix = (Pix) obj2;
            return Intrinsics.f(this.f62057a, pix.f62057a) && Intrinsics.f(this.f62058b, pix.f62058b) && Intrinsics.f(this.f62059c, pix.f62059c) && Intrinsics.f(this.d, pix.d) && Intrinsics.f(this.e, pix.e);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.d((this.f62058b.hashCode() + (this.f62057a.hashCode() * 31)) * 31, 31, this.f62059c), 31, this.d);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62057a.writeToParcel(dest, i);
            this.f62058b.writeToParcel(dest, i);
            dest.writeStringList(this.f62059c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "ExecutionType", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pse implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<Pse> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62062c;
        public final List d;
        public final Creditor e;
        public final ExecutionType f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f62063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f62064h;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse$ExecutionType;", "Landroid/os/Parcelable;", "OneTime", "Otp", "Unknown", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse$ExecutionType$OneTime;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse$ExecutionType$Otp;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse$ExecutionType$Unknown;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface ExecutionType extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse$ExecutionType$OneTime;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse$ExecutionType;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class OneTime implements ExecutionType {

                @NotNull
                public static final Parcelable.Creator<OneTime> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f62065a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new OneTime(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new OneTime[i];
                    }
                }

                public OneTime(String backToMerchantUrl) {
                    Intrinsics.checkNotNullParameter(backToMerchantUrl, "backToMerchantUrl");
                    this.f62065a = backToMerchantUrl;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof OneTime) && Intrinsics.f(this.f62065a, ((OneTime) obj2).f62065a);
                }

                public final int hashCode() {
                    return this.f62065a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f62065a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse$ExecutionType$Otp;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse$ExecutionType;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Otp implements ExecutionType {

                @NotNull
                public static final Parcelable.Creator<Otp> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f62066a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Otp(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Otp[i];
                    }
                }

                public Otp(String otp) {
                    Intrinsics.checkNotNullParameter(otp, "otp");
                    this.f62066a = otp;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Otp) && Intrinsics.f(this.f62066a, ((Otp) obj2).f62066a);
                }

                public final int hashCode() {
                    return this.f62066a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f62066a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse$ExecutionType$Unknown;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Pse$ExecutionType;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Unknown implements ExecutionType {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Unknown f62067a = new Unknown();

                @NotNull
                public static final Parcelable.Creator<Unknown> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Unknown.f62067a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Unknown[i];
                    }
                }

                private Unknown() {
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

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), Creditor.CREATOR.createFromParcel(parcel), (ExecutionType) parcel.readParcelable(Pse.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pse[i];
            }
        }

        public Pse(String pseEmail, String str, String cus, List referenceNumber, Creditor creditor, ExecutionType executionType, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(pseEmail, "pseEmail");
            Intrinsics.checkNotNullParameter(cus, "cus");
            Intrinsics.checkNotNullParameter(referenceNumber, "referenceNumber");
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            Intrinsics.checkNotNullParameter(executionType, "executionType");
            this.f62060a = pseEmail;
            this.f62061b = str;
            this.f62062c = cus;
            this.d = referenceNumber;
            this.e = creditor;
            this.f = executionType;
            this.f62063g = str2;
            this.f62064h = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pse)) {
                return false;
            }
            Pse pse2 = (Pse) obj2;
            return Intrinsics.f(this.f62060a, pse2.f62060a) && Intrinsics.f(this.f62061b, pse2.f62061b) && Intrinsics.f(this.f62062c, pse2.f62062c) && Intrinsics.f(this.d, pse2.d) && Intrinsics.f(this.e, pse2.e) && Intrinsics.f(this.f, pse2.f) && Intrinsics.f(this.f62063g, pse2.f62063g) && this.f62064h == pse2.f62064h;
        }

        public final int hashCode() {
            int iHashCode = this.f62060a.hashCode() * 31;
            String str = this.f62061b;
            int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + p.a.d(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f62062c), 31, this.d)) * 31)) * 31;
            String str2 = this.f62063g;
            return Boolean.hashCode(this.f62064h) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62060a);
            dest.writeString(this.f62061b);
            dest.writeString(this.f62062c);
            dest.writeStringList(this.d);
            this.e.writeToParcel(dest, i);
            dest.writeParcelable(this.f, i);
            dest.writeString(this.f62063g);
            dest.writeInt(this.f62064h ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Unknown;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "<init>", "()V", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unknown implements PaymentMethodDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f62068a = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f62068a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Upi;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Upi implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<Upi> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitiationFlow f62070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Creditor f62071c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Upi(parcel.readString(), parcel.readInt() == 0 ? null : InitiationFlow.CREATOR.createFromParcel(parcel), Creditor.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Upi[i];
            }
        }

        public Upi(String str, InitiationFlow initiationFlow, Creditor creditor, String str2) {
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            this.f62069a = str;
            this.f62070b = initiationFlow;
            this.f62071c = creditor;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Upi)) {
                return false;
            }
            Upi upi2 = (Upi) obj2;
            return Intrinsics.f(this.f62069a, upi2.f62069a) && this.f62070b == upi2.f62070b && Intrinsics.f(this.f62071c, upi2.f62071c) && Intrinsics.f(this.d, upi2.d);
        }

        public final int hashCode() {
            String str = this.f62069a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            InitiationFlow initiationFlow = this.f62070b;
            int iHashCode2 = (this.f62071c.hashCode() + ((iHashCode + (initiationFlow == null ? 0 : initiationFlow.hashCode())) * 31)) * 31;
            String str2 = this.d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62069a);
            InitiationFlow initiationFlow = this.f62070b;
            if (initiationFlow == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                initiationFlow.writeToParcel(dest, i);
            }
            this.f62071c.writeToParcel(dest, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails$Wero;", "Lcom/revolut/feature/apm/core/models/payments_authorisations/PaymentMethodDetails;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Wero implements PaymentMethodDetails {

        @NotNull
        public static final Parcelable.Creator<Wero> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Creditor f62072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f62073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62074c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Wero(Creditor.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Wero[i];
            }
        }

        public Wero(Creditor creditor, d amount, String str, String str2, String consentBase64) {
            Intrinsics.checkNotNullParameter(creditor, "creditor");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(consentBase64, "consentBase64");
            this.f62072a = creditor;
            this.f62073b = amount;
            this.f62074c = str;
            this.d = str2;
            this.e = consentBase64;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Wero)) {
                return false;
            }
            Wero wero = (Wero) obj2;
            return Intrinsics.f(this.f62072a, wero.f62072a) && Intrinsics.f(this.f62073b, wero.f62073b) && Intrinsics.f(this.f62074c, wero.f62074c) && Intrinsics.f(this.d, wero.d) && Intrinsics.f(this.e, wero.e);
        }

        public final int hashCode() {
            int iC = v7.c(this.f62072a.hashCode() * 31, 31, this.f62073b);
            String str = this.f62074c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f62072a.writeToParcel(dest, i);
            dest.writeSerializable(this.f62073b);
            dest.writeString(this.f62074c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }
}
