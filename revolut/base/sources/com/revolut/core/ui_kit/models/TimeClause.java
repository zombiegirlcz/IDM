package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import aw0.ka;
import aw0.la;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0006\u0007\bJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "", "toString", "()Ljava/lang/String;", "aw0/ka", "aw0/la", "Format", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimeClause implements Clause, fa {

    @NotNull
    public static final Parcelable.Creator<TimeClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f57957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Style f57958c;
    public final ZoneId d;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0012\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Pretty", "Month", "Year", "MonthAndYear", "DayAndMonth", "DateMedium", "DateLong", "DateFull", "TimeDefault", "TimeWithSeconds", "Hour", "Duration", "ShortDayOfWeek", "DayOfWeek", "PrettyDayOfWeek", "DayOfMonth", "DateEditable", "a", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$DateEditable;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$DateFull;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$DateLong;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$DateMedium;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$DayAndMonth;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$DayOfMonth;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$DayOfWeek;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$Duration;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$Hour;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$Month;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$MonthAndYear;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$Pretty;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$PrettyDayOfWeek;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$ShortDayOfWeek;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$TimeDefault;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$TimeWithSeconds;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$Year;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Format implements Parcelable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateMedium f57959a = new DateMedium(0);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$DateEditable;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DateEditable extends Format {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final DateEditable f57960b = new DateEditable();

            @NotNull
            public static final Parcelable.Creator<DateEditable> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DateEditable.f57960b;
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$DateFull;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DateFull extends Format {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final DateFull f57961b = new DateFull();

            @NotNull
            public static final Parcelable.Creator<DateFull> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DateFull.f57961b;
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$DateLong;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DateLong extends Format {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final DateLong f57962b = new DateLong();

            @NotNull
            public static final Parcelable.Creator<DateLong> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DateLong.f57962b;
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$DateMedium;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/n0", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DateMedium extends Format {

            @NotNull
            public static final Parcelable.Creator<DateMedium> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final n0 f57963b;

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

            /* JADX INFO: renamed from: a, reason: from getter */
            public final n0 getF57963b() {
                return this.f57963b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof DateMedium) && this.f57963b == ((DateMedium) obj2).f57963b;
            }

            public final int hashCode() {
                return this.f57963b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57963b.name());
            }

            public DateMedium(n0 showType) {
                Intrinsics.checkNotNullParameter(showType, "showType");
                this.f57963b = showType;
            }

            public /* synthetic */ DateMedium(int i) {
                this(n0.DEFAULT);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$DayAndMonth;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DayAndMonth extends Format {

            @NotNull
            public static final Parcelable.Creator<DayAndMonth> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ka f57964b;

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

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ka getF57964b() {
                return this.f57964b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof DayAndMonth) && this.f57964b == ((DayAndMonth) obj2).f57964b;
            }

            public final int hashCode() {
                return this.f57964b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57964b.name());
            }

            public DayAndMonth(ka monthStyle) {
                Intrinsics.checkNotNullParameter(monthStyle, "monthStyle");
                this.f57964b = monthStyle;
            }

            public /* synthetic */ DayAndMonth(int i) {
                this(ka.FULL);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$DayOfWeek;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DayOfWeek extends Format {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final DayOfWeek f57966b = new DayOfWeek();

            @NotNull
            public static final Parcelable.Creator<DayOfWeek> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DayOfWeek.f57966b;
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$Duration;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "", "toString", "()Ljava/lang/String;", "DurationStyle", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Duration extends Format {

            @NotNull
            public static final Parcelable.Creator<Duration> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DurationStyle f57967b;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$Duration$DurationStyle;", "Landroid/os/Parcelable;", "Digital", "Textual", "com/revolut/core/ui_kit/models/p0", "com/revolut/core/ui_kit/models/o0", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$Duration$DurationStyle$Digital;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$Duration$DurationStyle$Textual;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface DurationStyle extends Parcelable {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$Duration$DurationStyle$Digital;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$Duration$DurationStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Digital implements DurationStyle {

                    @NotNull
                    public static final Parcelable.Creator<Digital> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final o0 f57968a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new Digital(o0.valueOf(parcel.readString()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new Digital[i];
                        }
                    }

                    public Digital() {
                        this(0);
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final o0 getF57968a() {
                        return this.f57968a;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof Digital) && this.f57968a == ((Digital) obj2).f57968a;
                    }

                    public final int hashCode() {
                        return this.f57968a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f57968a.name());
                    }

                    public /* synthetic */ Digital(int i) {
                        this(o0.ALWAYS_DISPLAY_MINUTES);
                    }

                    public Digital(o0 leadingZeroesPolicy) {
                        Intrinsics.checkNotNullParameter(leadingZeroesPolicy, "leadingZeroesPolicy");
                        this.f57968a = leadingZeroesPolicy;
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$Duration$DurationStyle$Textual;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format$Duration$DurationStyle;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Textual implements DurationStyle {

                    @NotNull
                    public static final Parcelable.Creator<Textual> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final p0 f57969a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new Textual(p0.valueOf(parcel.readString()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new Textual[i];
                        }
                    }

                    public Textual() {
                        this(0);
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final p0 getF57969a() {
                        return this.f57969a;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof Textual) && this.f57969a == ((Textual) obj2).f57969a;
                    }

                    public final int hashCode() {
                        return this.f57969a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f57969a.name());
                    }

                    public /* synthetic */ Textual(int i) {
                        this(p0.SECONDS);
                    }

                    public Textual(p0 precision) {
                        Intrinsics.checkNotNullParameter(precision, "precision");
                        this.f57969a = precision;
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Duration((DurationStyle) parcel.readParcelable(Duration.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Duration[i];
                }
            }

            public Duration() {
                this(0);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DurationStyle getF57967b() {
                return this.f57967b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Duration) && Intrinsics.f(this.f57967b, ((Duration) obj2).f57967b);
            }

            public final int hashCode() {
                return this.f57967b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57967b, i);
            }

            public Duration(DurationStyle style) {
                Intrinsics.checkNotNullParameter(style, "style");
                this.f57967b = style;
            }

            public /* synthetic */ Duration(int i) {
                this(new DurationStyle.Digital(0));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$Hour;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Hour extends Format {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Hour f57970b = new Hour();

            @NotNull
            public static final Parcelable.Creator<Hour> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Hour.f57970b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Hour[i];
                }
            }

            private Hour() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$Month;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Month extends Format {

            @NotNull
            public static final Parcelable.Creator<Month> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ka f57971b;

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

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ka getF57971b() {
                return this.f57971b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Month) && this.f57971b == ((Month) obj2).f57971b;
            }

            public final int hashCode() {
                return this.f57971b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57971b.name());
            }

            public Month(ka monthStyle) {
                Intrinsics.checkNotNullParameter(monthStyle, "monthStyle");
                this.f57971b = monthStyle;
            }

            public /* synthetic */ Month(int i) {
                this(ka.FULL);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$MonthAndYear;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MonthAndYear extends Format {

            @NotNull
            public static final Parcelable.Creator<MonthAndYear> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ka f57972b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final la f57973c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MonthAndYear(ka.valueOf(parcel.readString()), la.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MonthAndYear[i];
                }
            }

            public MonthAndYear() {
                this((ka) null, 3);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ka getF57972b() {
                return this.f57972b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final la getF57973c() {
                return this.f57973c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof MonthAndYear)) {
                    return false;
                }
                MonthAndYear monthAndYear = (MonthAndYear) obj2;
                return this.f57972b == monthAndYear.f57972b && this.f57973c == monthAndYear.f57973c;
            }

            public final int hashCode() {
                return this.f57973c.hashCode() + (this.f57972b.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57972b.name());
                dest.writeString(this.f57973c.name());
            }

            public MonthAndYear(ka monthStyle, la yearStyle) {
                Intrinsics.checkNotNullParameter(monthStyle, "monthStyle");
                Intrinsics.checkNotNullParameter(yearStyle, "yearStyle");
                this.f57972b = monthStyle;
                this.f57973c = yearStyle;
            }

            public /* synthetic */ MonthAndYear(ka kaVar, int i) {
                this((i & 1) != 0 ? ka.FULL : kaVar, la.FULL);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$Pretty;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/q0", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Pretty extends Format {

            @NotNull
            public static final Parcelable.Creator<Pretty> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final q0 f57974b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Pretty(q0.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Pretty[i];
                }
            }

            public Pretty() {
                this(0);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final q0 getF57974b() {
                return this.f57974b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Pretty) && this.f57974b == ((Pretty) obj2).f57974b;
            }

            public final int hashCode() {
                return this.f57974b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57974b.name());
            }

            public Pretty(q0 showType) {
                Intrinsics.checkNotNullParameter(showType, "showType");
                this.f57974b = showType;
            }

            public /* synthetic */ Pretty(int i) {
                this(q0.DATETIME);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$PrettyDayOfWeek;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PrettyDayOfWeek extends Format {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final PrettyDayOfWeek f57975b = new PrettyDayOfWeek();

            @NotNull
            public static final Parcelable.Creator<PrettyDayOfWeek> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PrettyDayOfWeek.f57975b;
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$ShortDayOfWeek;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ShortDayOfWeek extends Format {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final ShortDayOfWeek f57976b = new ShortDayOfWeek();

            @NotNull
            public static final Parcelable.Creator<ShortDayOfWeek> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShortDayOfWeek.f57976b;
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$TimeDefault;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TimeDefault extends Format {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final TimeDefault f57977b = new TimeDefault();

            @NotNull
            public static final Parcelable.Creator<TimeDefault> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TimeDefault.f57977b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TimeDefault[i];
                }
            }

            private TimeDefault() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$TimeWithSeconds;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "<init>", "()V", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TimeWithSeconds extends Format {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final TimeWithSeconds f57978b = new TimeWithSeconds();

            @NotNull
            public static final Parcelable.Creator<TimeWithSeconds> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TimeWithSeconds.f57978b;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TimeWithSeconds[i];
                }
            }

            private TimeWithSeconds() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$Year;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Year extends Format {

            @NotNull
            public static final Parcelable.Creator<Year> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final la f57979b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Year(la.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Year[i];
                }
            }

            public Year() {
                this(0);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final la getF57979b() {
                return this.f57979b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Year) && this.f57979b == ((Year) obj2).f57979b;
            }

            public final int hashCode() {
                return this.f57979b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57979b.name());
            }

            public Year(la yearStyle) {
                Intrinsics.checkNotNullParameter(yearStyle, "yearStyle");
                this.f57979b = yearStyle;
            }

            public /* synthetic */ Year(int i) {
                this(la.FULL);
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.models.TimeClause$Format$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        private Format() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/TimeClause$Format$DayOfMonth;", "Lcom/revolut/core/ui_kit/models/TimeClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DayOfMonth extends Format {

            @NotNull
            public static final Parcelable.Creator<DayOfMonth> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f57965b;

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
                this.f57965b = z;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF57965b() {
                return this.f57965b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof DayOfMonth) && this.f57965b == ((DayOfMonth) obj2).f57965b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f57965b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f57965b ? 1 : 0);
            }

            public DayOfMonth() {
                this(false);
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TimeClause(parcel.readLong(), (Format) parcel.readParcelable(TimeClause.class.getClassLoader()), (Style) parcel.readParcelable(TimeClause.class.getClassLoader()), (ZoneId) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TimeClause[i];
        }
    }

    public TimeClause(long j2, Format format, Style style, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.f57956a = j2;
        this.f57957b = format;
        this.f57958c = style;
        this.d = zoneId;
    }

    public static TimeClause a(TimeClause timeClause, Format format, Custom custom, int i) {
        long j2 = timeClause.f57956a;
        if ((i & 2) != 0) {
            format = timeClause.f57957b;
        }
        Format format2 = format;
        Style style = custom;
        if ((i & 4) != 0) {
            style = timeClause.f57958c;
        }
        ZoneId zoneId = timeClause.d;
        timeClause.getClass();
        Intrinsics.checkNotNullParameter(format2, "format");
        return new TimeClause(j2, format2, style, zoneId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TimeClause)) {
            return false;
        }
        TimeClause timeClause = (TimeClause) obj2;
        return this.f57956a == timeClause.f57956a && Intrinsics.f(this.f57957b, timeClause.f57957b) && Intrinsics.f(this.f57958c, timeClause.f57958c) && Intrinsics.f(this.d, timeClause.d);
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57942c() {
        return this.f57958c;
    }

    public final int hashCode() {
        int iHashCode = (this.f57957b.hashCode() + (Long.hashCode(this.f57956a) * 31)) * 31;
        Style style = this.f57958c;
        int iHashCode2 = (iHashCode + (style == null ? 0 : style.hashCode())) * 31;
        ZoneId zoneId = this.d;
        return iHashCode2 + (zoneId != null ? zoneId.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f57956a);
        dest.writeParcelable(this.f57957b, i);
        dest.writeParcelable(this.f57958c, i);
        dest.writeSerializable(this.d);
    }

    public /* synthetic */ TimeClause(long j2, Format format, Style style, ZoneId zoneId, int i) {
        this(j2, format, (i & 4) != 0 ? null : style, (i & 8) != 0 ? null : zoneId);
    }
}
