package com.revolut.feature.credit.application.models.preapplication;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId;", "Landroid/os/Parcelable;", "<init>", "()V", "Age", "MinimumEmploymentDuration", "MinimumIncome", "UpdatePhone", "NegativeBalance", "MinimumAccountHistory", "DocumentsRemediation", "Residency", "Unknown", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$Age;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$DocumentsRemediation;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$MinimumAccountHistory;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$MinimumEmploymentDuration;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$MinimumIncome;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$NegativeBalance;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$Residency;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$Unknown;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$UpdatePhone;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PreApplicationCheckItemId implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$Age;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Age extends PreApplicationCheckItemId {

        @NotNull
        public static final Parcelable.Creator<Age> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66255a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Age(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Age[i];
            }
        }

        public Age(int i) {
            this.f66255a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Age) && this.f66255a == ((Age) obj2).f66255a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f66255a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f66255a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$DocumentsRemediation;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId;", "<init>", "()V", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentsRemediation extends PreApplicationCheckItemId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentsRemediation f66256a = new DocumentsRemediation();

        @NotNull
        public static final Parcelable.Creator<DocumentsRemediation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentsRemediation.f66256a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsRemediation[i];
            }
        }

        private DocumentsRemediation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$MinimumAccountHistory;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MinimumAccountHistory extends PreApplicationCheckItemId {

        @NotNull
        public static final Parcelable.Creator<MinimumAccountHistory> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final et3.a f66258b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MinimumAccountHistory(parcel.readInt(), et3.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MinimumAccountHistory[i];
            }
        }

        public MinimumAccountHistory(int i, et3.a durationUnit) {
            Intrinsics.checkNotNullParameter(durationUnit, "durationUnit");
            this.f66257a = i;
            this.f66258b = durationUnit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MinimumAccountHistory)) {
                return false;
            }
            MinimumAccountHistory minimumAccountHistory = (MinimumAccountHistory) obj2;
            return this.f66257a == minimumAccountHistory.f66257a && this.f66258b == minimumAccountHistory.f66258b;
        }

        public final int hashCode() {
            return this.f66258b.hashCode() + (Integer.hashCode(this.f66257a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f66257a);
            dest.writeString(this.f66258b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$MinimumEmploymentDuration;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MinimumEmploymentDuration extends PreApplicationCheckItemId {

        @NotNull
        public static final Parcelable.Creator<MinimumEmploymentDuration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final et3.a f66260b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MinimumEmploymentDuration(parcel.readInt(), et3.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MinimumEmploymentDuration[i];
            }
        }

        public MinimumEmploymentDuration(int i, et3.a durationUnit) {
            Intrinsics.checkNotNullParameter(durationUnit, "durationUnit");
            this.f66259a = i;
            this.f66260b = durationUnit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MinimumEmploymentDuration)) {
                return false;
            }
            MinimumEmploymentDuration minimumEmploymentDuration = (MinimumEmploymentDuration) obj2;
            return this.f66259a == minimumEmploymentDuration.f66259a && this.f66260b == minimumEmploymentDuration.f66260b;
        }

        public final int hashCode() {
            return this.f66260b.hashCode() + (Integer.hashCode(this.f66259a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f66259a);
            dest.writeString(this.f66260b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$MinimumIncome;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MinimumIncome extends PreApplicationCheckItemId {

        @NotNull
        public static final Parcelable.Creator<MinimumIncome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f66261a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MinimumIncome((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MinimumIncome[i];
            }
        }

        public MinimumIncome(d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f66261a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MinimumIncome) && Intrinsics.f(this.f66261a, ((MinimumIncome) obj2).f66261a);
        }

        public final int hashCode() {
            return this.f66261a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66261a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$NegativeBalance;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId;", "<init>", "()V", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NegativeBalance extends PreApplicationCheckItemId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NegativeBalance f66262a = new NegativeBalance();

        @NotNull
        public static final Parcelable.Creator<NegativeBalance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NegativeBalance.f66262a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NegativeBalance[i];
            }
        }

        private NegativeBalance() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$Residency;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId;", "<init>", "()V", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Residency extends PreApplicationCheckItemId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Residency f66263a = new Residency();

        @NotNull
        public static final Parcelable.Creator<Residency> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Residency.f66263a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Residency[i];
            }
        }

        private Residency() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$Unknown;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId;", "<init>", "()V", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unknown extends PreApplicationCheckItemId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f66264a = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f66264a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId$UpdatePhone;", "Lcom/revolut/feature/credit/application/models/preapplication/PreApplicationCheckItemId;", "<init>", "()V", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdatePhone extends PreApplicationCheckItemId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdatePhone f66265a = new UpdatePhone();

        @NotNull
        public static final Parcelable.Creator<UpdatePhone> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdatePhone.f66265a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdatePhone[i];
            }
        }

        private UpdatePhone() {
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

    private PreApplicationCheckItemId() {
    }
}
