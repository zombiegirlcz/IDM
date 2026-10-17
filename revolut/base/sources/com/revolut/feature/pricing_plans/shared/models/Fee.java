package com.revolut.feature.pricing_plans.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/pricing_plans/shared/models/Fee;", "Landroid/os/Parcelable;", "<init>", "()V", "MoneyFee", "Percent", "Combined", "Free", "Cashback", "Undefined", "Lcom/revolut/feature/pricing_plans/shared/models/Fee$Cashback;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee$Combined;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee$Free;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee$MoneyFee;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee$Percent;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee$Undefined;", "feature_pricing_plans_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Fee implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/shared/models/Fee$Cashback;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cashback extends Fee {

        @NotNull
        public static final Parcelable.Creator<Cashback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f80952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f80953b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cashback(parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cashback[i];
            }
        }

        public Cashback(float f, float f4) {
            this.f80952a = f;
            this.f80953b = f4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cashback)) {
                return false;
            }
            Cashback cashback = (Cashback) obj2;
            return Float.compare(this.f80952a, cashback.f80952a) == 0 && Float.compare(this.f80953b, cashback.f80953b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f80953b) + (Float.hashCode(this.f80952a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.f80952a);
            dest.writeFloat(this.f80953b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/shared/models/Fee$Combined;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Combined extends Fee {

        @NotNull
        public static final Parcelable.Creator<Combined> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f80954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f80955b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Combined((d) parcel.readSerializable(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Combined[i];
            }
        }

        public Combined(d moneyFee, float f) {
            Intrinsics.checkNotNullParameter(moneyFee, "moneyFee");
            this.f80954a = moneyFee;
            this.f80955b = f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Combined)) {
                return false;
            }
            Combined combined = (Combined) obj2;
            return Intrinsics.f(this.f80954a, combined.f80954a) && Float.compare(this.f80955b, combined.f80955b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f80955b) + (this.f80954a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80954a);
            dest.writeFloat(this.f80955b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/shared/models/Fee$Free;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee;", "<init>", "()V", "feature_pricing_plans_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Free extends Fee {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Free f80956a = new Free();

        @NotNull
        public static final Parcelable.Creator<Free> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Free.f80956a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Free[i];
            }
        }

        private Free() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/shared/models/Fee$MoneyFee;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoneyFee extends Fee {

        @NotNull
        public static final Parcelable.Creator<MoneyFee> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f80957a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoneyFee((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoneyFee[i];
            }
        }

        public MoneyFee(d fee2) {
            Intrinsics.checkNotNullParameter(fee2, "fee");
            this.f80957a = fee2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoneyFee) && Intrinsics.f(this.f80957a, ((MoneyFee) obj2).f80957a);
        }

        public final int hashCode() {
            return this.f80957a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80957a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/shared/models/Fee$Percent;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Percent extends Fee {

        @NotNull
        public static final Parcelable.Creator<Percent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f80958a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Percent(parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Percent[i];
            }
        }

        public Percent(float f) {
            this.f80958a = f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Percent) && Float.compare(this.f80958a, ((Percent) obj2).f80958a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f80958a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.f80958a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/shared/models/Fee$Undefined;", "Lcom/revolut/feature/pricing_plans/shared/models/Fee;", "<init>", "()V", "feature_pricing_plans_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Undefined extends Fee {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Undefined f80959a = new Undefined();

        @NotNull
        public static final Parcelable.Creator<Undefined> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Undefined.f80959a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Undefined[i];
            }
        }

        private Undefined() {
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

    private Fee() {
    }
}
