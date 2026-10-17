package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.ka;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"com/revolut/core/ui_kit/models/LocalDateClause$DateFormat", "Landroid/os/Parcelable;", "Companion", "Month", "Year", "MonthAndYear", "DayAndMonth", "DateMedium", "DateLong", "DateFull", "ShortDayOfWeek", "DayOfWeek", "DayOfMonth", "DateEditable", "PrettyDayOfWeek", "a", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DateEditable;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DateFull;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DateLong;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DateMedium;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DayAndMonth;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DayOfMonth;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DayOfWeek;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$Month;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$MonthAndYear;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$PrettyDayOfWeek;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$ShortDayOfWeek;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$Year;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LocalDateClause$DateFormat extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f57814a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DateEditable;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DateEditable implements LocalDateClause$DateFormat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateEditable f57802a = new DateEditable();

        @NotNull
        public static final Parcelable.Creator<DateEditable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DateEditable.f57802a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateEditable[i];
            }
        }

        private DateEditable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DateFull;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DateFull implements LocalDateClause$DateFormat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateFull f57803a = new DateFull();

        @NotNull
        public static final Parcelable.Creator<DateFull> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DateFull.f57803a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateFull[i];
            }
        }

        private DateFull() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DateLong;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DateLong implements LocalDateClause$DateFormat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateLong f57804a = new DateLong();

        @NotNull
        public static final Parcelable.Creator<DateLong> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DateLong.f57804a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateLong[i];
            }
        }

        private DateLong() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DateMedium;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateMedium implements LocalDateClause$DateFormat {

        @NotNull
        public static final Parcelable.Creator<DateMedium> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0 f57805a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateMedium(n0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateMedium[i];
            }
        }

        public DateMedium() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DateMedium) && this.f57805a == ((DateMedium) obj2).f57805a;
        }

        public final int hashCode() {
            return this.f57805a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f57805a.name());
        }

        public DateMedium(n0 showType) {
            Intrinsics.checkNotNullParameter(showType, "showType");
            this.f57805a = showType;
        }

        public /* synthetic */ DateMedium(int i) {
            this(n0.DEFAULT);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DayAndMonth;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DayAndMonth implements LocalDateClause$DateFormat {

        @NotNull
        public static final Parcelable.Creator<DayAndMonth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ka f57806a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DayAndMonth(ka.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DayAndMonth[i];
            }
        }

        public DayAndMonth() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DayAndMonth) && this.f57806a == ((DayAndMonth) obj2).f57806a;
        }

        public final int hashCode() {
            return this.f57806a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f57806a.name());
        }

        public DayAndMonth(ka monthStyle) {
            Intrinsics.checkNotNullParameter(monthStyle, "monthStyle");
            this.f57806a = monthStyle;
        }

        public /* synthetic */ DayAndMonth(int i) {
            this(ka.FULL);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DayOfWeek;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DayOfWeek implements LocalDateClause$DateFormat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DayOfWeek f57808a = new DayOfWeek();

        @NotNull
        public static final Parcelable.Creator<DayOfWeek> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DayOfWeek.f57808a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DayOfWeek[i];
            }
        }

        private DayOfWeek() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$Month;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Month implements LocalDateClause$DateFormat {

        @NotNull
        public static final Parcelable.Creator<Month> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ka f57809a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Month(ka.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Month[i];
            }
        }

        public Month() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Month) && this.f57809a == ((Month) obj2).f57809a;
        }

        public final int hashCode() {
            return this.f57809a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f57809a.name());
        }

        public Month(ka monthStyle) {
            Intrinsics.checkNotNullParameter(monthStyle, "monthStyle");
            this.f57809a = monthStyle;
        }

        public /* synthetic */ Month(int i) {
            this(ka.FULL);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$MonthAndYear;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MonthAndYear implements LocalDateClause$DateFormat {

        @NotNull
        public static final Parcelable.Creator<MonthAndYear> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ka f57810a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MonthAndYear(ka.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MonthAndYear[i];
            }
        }

        public MonthAndYear() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MonthAndYear) && this.f57810a == ((MonthAndYear) obj2).f57810a;
        }

        public final int hashCode() {
            return this.f57810a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f57810a.name());
        }

        public MonthAndYear(ka monthStyle) {
            Intrinsics.checkNotNullParameter(monthStyle, "monthStyle");
            this.f57810a = monthStyle;
        }

        public /* synthetic */ MonthAndYear(int i) {
            this(ka.FULL);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$PrettyDayOfWeek;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrettyDayOfWeek implements LocalDateClause$DateFormat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrettyDayOfWeek f57811a = new PrettyDayOfWeek();

        @NotNull
        public static final Parcelable.Creator<PrettyDayOfWeek> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrettyDayOfWeek.f57811a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrettyDayOfWeek[i];
            }
        }

        private PrettyDayOfWeek() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$ShortDayOfWeek;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShortDayOfWeek implements LocalDateClause$DateFormat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShortDayOfWeek f57812a = new ShortDayOfWeek();

        @NotNull
        public static final Parcelable.Creator<ShortDayOfWeek> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShortDayOfWeek.f57812a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShortDayOfWeek[i];
            }
        }

        private ShortDayOfWeek() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$Year;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Year implements LocalDateClause$DateFormat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Year f57813a = new Year();

        @NotNull
        public static final Parcelable.Creator<Year> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Year.f57813a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Year[i];
            }
        }

        private Year() {
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

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.models.LocalDateClause$DateFormat$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f57814a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final DateMedium f57815b = new DateMedium(0);

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat$DayOfMonth;", "Lcom/revolut/core/ui_kit/models/LocalDateClause$DateFormat;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DayOfMonth implements LocalDateClause$DateFormat {

        @NotNull
        public static final Parcelable.Creator<DayOfMonth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f57807a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DayOfMonth(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DayOfMonth[i];
            }
        }

        public DayOfMonth(boolean z) {
            this.f57807a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DayOfMonth) && this.f57807a == ((DayOfMonth) obj2).f57807a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57807a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f57807a ? 1 : 0);
        }

        public DayOfMonth() {
            this(false);
        }
    }
}
