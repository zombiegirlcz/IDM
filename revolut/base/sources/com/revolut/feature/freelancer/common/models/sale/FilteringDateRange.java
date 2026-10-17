package com.revolut.feature.freelancer.common.models.sale;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange;", "Landroid/os/Parcelable;", "<init>", "()V", "Custom", "Today", "ThisWeek", "ThisMonth", "ThisQuarter", "Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange$Custom;", "Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange$ThisMonth;", "Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange$ThisQuarter;", "Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange$ThisWeek;", "Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange$Today;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FilteringDateRange implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange$Custom;", "Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom extends FilteringDateRange {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f73462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f73463b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(LocalDate from, LocalDate to6) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            this.f73462a = from;
            this.f73463b = to6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj2;
            return Intrinsics.f(this.f73462a, custom.f73462a) && Intrinsics.f(this.f73463b, custom.f73463b);
        }

        public final int hashCode() {
            return this.f73463b.hashCode() + (this.f73462a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73462a);
            dest.writeSerializable(this.f73463b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange$ThisMonth;", "Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange;", "<init>", "()V", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ThisMonth extends FilteringDateRange {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ThisMonth f73464a = new ThisMonth();

        @NotNull
        public static final Parcelable.Creator<ThisMonth> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ThisMonth.f73464a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThisMonth[i];
            }
        }

        private ThisMonth() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange$ThisQuarter;", "Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange;", "<init>", "()V", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ThisQuarter extends FilteringDateRange {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ThisQuarter f73465a = new ThisQuarter();

        @NotNull
        public static final Parcelable.Creator<ThisQuarter> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ThisQuarter.f73465a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThisQuarter[i];
            }
        }

        private ThisQuarter() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange$ThisWeek;", "Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange;", "<init>", "()V", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ThisWeek extends FilteringDateRange {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ThisWeek f73466a = new ThisWeek();

        @NotNull
        public static final Parcelable.Creator<ThisWeek> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ThisWeek.f73466a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThisWeek[i];
            }
        }

        private ThisWeek() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange$Today;", "Lcom/revolut/feature/freelancer/common/models/sale/FilteringDateRange;", "<init>", "()V", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Today extends FilteringDateRange {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Today f73467a = new Today();

        @NotNull
        public static final Parcelable.Creator<Today> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Today.f73467a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Today[i];
            }
        }

        private Today() {
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

    private FilteringDateRange() {
    }
}
