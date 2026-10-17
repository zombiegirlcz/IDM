package com.revolut.shared.feature.market_data.models.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import f8l.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/Limit;", "Landroid/os/Parcelable;", "<init>", "()V", "f8l/d", "UpperRestrictionLimit", "LowerRestrictionLimit", "UsageLimit", "Lcom/revolut/shared/feature/market_data/models/domain/models/Limit$LowerRestrictionLimit;", "Lcom/revolut/shared/feature/market_data/models/domain/models/Limit$UpperRestrictionLimit;", "Lcom/revolut/shared/feature/market_data/models/domain/models/Limit$UsageLimit;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Limit implements Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/Limit$LowerRestrictionLimit;", "Lcom/revolut/shared/feature/market_data/models/domain/models/Limit;", "Lf8l/d;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LowerRestrictionLimit extends Limit implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Amount f104744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Amount f104745c;

        @NotNull
        public static final Parcelable.Creator<LowerRestrictionLimit> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Parcelable.Creator<Amount> creator = Amount.CREATOR;
                return new LowerRestrictionLimit(string, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LowerRestrictionLimit[i];
            }
        }

        public LowerRestrictionLimit(String key, Amount original, Amount amount) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(original, "original");
            this.f104743a = key;
            this.f104744b = original;
            this.f104745c = amount;
        }

        @Override // f8l.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Amount getF104748c() {
            return this.f104745c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LowerRestrictionLimit)) {
                return false;
            }
            LowerRestrictionLimit lowerRestrictionLimit = (LowerRestrictionLimit) obj2;
            return Intrinsics.f(this.f104743a, lowerRestrictionLimit.f104743a) && Intrinsics.f(this.f104744b, lowerRestrictionLimit.f104744b) && Intrinsics.f(this.f104745c, lowerRestrictionLimit.f104745c);
        }

        @Override // f8l.d
        /* JADX INFO: renamed from: getOriginal, reason: from getter */
        public final Amount getF104747b() {
            return this.f104744b;
        }

        public final int hashCode() {
            int iD = y.d(this.f104744b, this.f104743a.hashCode() * 31, 31);
            Amount amount = this.f104745c;
            return iD + (amount == null ? 0 : amount.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104743a);
            this.f104744b.writeToParcel(dest, i);
            Amount amount = this.f104745c;
            if (amount == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                amount.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/Limit$UpperRestrictionLimit;", "Lcom/revolut/shared/feature/market_data/models/domain/models/Limit;", "Lf8l/d;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpperRestrictionLimit extends Limit implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Amount f104747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Amount f104748c;

        @NotNull
        public static final Parcelable.Creator<UpperRestrictionLimit> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Parcelable.Creator<Amount> creator = Amount.CREATOR;
                return new UpperRestrictionLimit(string, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpperRestrictionLimit[i];
            }
        }

        public UpperRestrictionLimit(String key, Amount original, Amount amount) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(original, "original");
            this.f104746a = key;
            this.f104747b = original;
            this.f104748c = amount;
        }

        @Override // f8l.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Amount getF104748c() {
            return this.f104748c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpperRestrictionLimit)) {
                return false;
            }
            UpperRestrictionLimit upperRestrictionLimit = (UpperRestrictionLimit) obj2;
            return Intrinsics.f(this.f104746a, upperRestrictionLimit.f104746a) && Intrinsics.f(this.f104747b, upperRestrictionLimit.f104747b) && Intrinsics.f(this.f104748c, upperRestrictionLimit.f104748c);
        }

        @Override // f8l.d
        /* JADX INFO: renamed from: getOriginal, reason: from getter */
        public final Amount getF104747b() {
            return this.f104747b;
        }

        public final int hashCode() {
            int iD = y.d(this.f104747b, this.f104746a.hashCode() * 31, 31);
            Amount amount = this.f104748c;
            return iD + (amount == null ? 0 : amount.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104746a);
            this.f104747b.writeToParcel(dest, i);
            Amount amount = this.f104748c;
            if (amount == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                amount.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/Limit$UsageLimit;", "Lcom/revolut/shared/feature/market_data/models/domain/models/Limit;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UsageLimit extends Limit {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Amount f104750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Amount f104751c;
        public final Amount d;
        public final DateTime e;

        @NotNull
        public static final Parcelable.Creator<UsageLimit> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Parcelable.Creator<Amount> creator = Amount.CREATOR;
                return new UsageLimit(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), (DateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UsageLimit[i];
            }
        }

        public UsageLimit(String key, Amount limit, Amount current, Amount next, DateTime dateTime) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(limit, "limit");
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(next, "next");
            this.f104749a = key;
            this.f104750b = limit;
            this.f104751c = current;
            this.d = next;
            this.e = dateTime;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UsageLimit)) {
                return false;
            }
            UsageLimit usageLimit = (UsageLimit) obj2;
            return Intrinsics.f(this.f104749a, usageLimit.f104749a) && Intrinsics.f(this.f104750b, usageLimit.f104750b) && Intrinsics.f(this.f104751c, usageLimit.f104751c) && Intrinsics.f(this.d, usageLimit.d) && Intrinsics.f(this.e, usageLimit.e);
        }

        public final int hashCode() {
            int iD = y.d(this.d, y.d(this.f104751c, y.d(this.f104750b, this.f104749a.hashCode() * 31, 31), 31), 31);
            DateTime dateTime = this.e;
            return iD + (dateTime == null ? 0 : dateTime.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104749a);
            this.f104750b.writeToParcel(dest, i);
            this.f104751c.writeToParcel(dest, i);
            this.d.writeToParcel(dest, i);
            dest.writeSerializable(this.e);
        }
    }

    private Limit() {
    }
}
