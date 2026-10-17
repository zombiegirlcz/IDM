package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.internal.views.timer.TimerViewLabels;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\u0006\u0007\b\t\n\u000bJ\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel;", "Landroid/os/Parcelable;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Button", "MainTextStyle", "MainText", "Subtitle", "MainTextEndIcon", "CountDown", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavBarCenterViewModel implements Parcelable, TrackableItem {

    @NotNull
    public static final Parcelable.Creator<NavBarCenterViewModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainText f57840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f57841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Subtitle f57842c;
    public final Button d;
    public final CountDown e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f57843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57844h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Image f57845j;
    public final MainTextEndIcon k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Parcelable f57846l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$CountDown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "TimerState", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountDown implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CountDown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimerState f57850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f57851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ev0.c f57852c;
        public final TimerViewLabels d;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$CountDown$TimerState;", "Landroid/os/Parcelable;", "ExpirationTime", "StaticTime", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$CountDown$TimerState$ExpirationTime;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$CountDown$TimerState$StaticTime;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface TimerState extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$CountDown$TimerState$ExpirationTime;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$CountDown$TimerState;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ExpirationTime implements TimerState {

                @NotNull
                public static final Parcelable.Creator<ExpirationTime> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f57853a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ExpirationTime(parcel.readLong());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ExpirationTime[i];
                    }
                }

                public ExpirationTime(long j2) {
                    this.f57853a = j2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof ExpirationTime) && this.f57853a == ((ExpirationTime) obj2).f57853a;
                }

                public final int hashCode() {
                    return Long.hashCode(this.f57853a);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeLong(this.f57853a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$CountDown$TimerState$StaticTime;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$CountDown$TimerState;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class StaticTime implements TimerState {

                @NotNull
                public static final Parcelable.Creator<StaticTime> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f57854a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new StaticTime(parcel.readLong());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new StaticTime[i];
                    }
                }

                public StaticTime(long j2) {
                    this.f57854a = j2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof StaticTime) && this.f57854a == ((StaticTime) obj2).f57854a;
                }

                public final int hashCode() {
                    return Long.hashCode(this.f57854a);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeLong(this.f57854a);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountDown((TimerState) parcel.readParcelable(CountDown.class.getClassLoader()), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), ev0.c.valueOf(parcel.readString()), TimerViewLabels.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountDown[i];
            }
        }

        public CountDown(TimerState time, CharSequence dividerLabel, ev0.c timerViewMode, TimerViewLabels timerViewLabels) {
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(dividerLabel, "dividerLabel");
            Intrinsics.checkNotNullParameter(timerViewMode, "timerViewMode");
            Intrinsics.checkNotNullParameter(timerViewLabels, "timerViewLabels");
            this.f57850a = time;
            this.f57851b = dividerLabel;
            this.f57852c = timerViewMode;
            this.d = timerViewLabels;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CountDown)) {
                return false;
            }
            CountDown countDown = (CountDown) obj2;
            return Intrinsics.f(this.f57850a, countDown.f57850a) && Intrinsics.f(this.f57851b, countDown.f57851b) && this.f57852c == countDown.f57852c && Intrinsics.f(this.d, countDown.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f57852c.hashCode() + ((this.f57851b.hashCode() + (this.f57850a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57850a, i);
            TextUtils.writeToParcel(this.f57851b, dest, i);
            dest.writeString(this.f57852c.name());
            this.d.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainTextEndIcon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MainTextEndIcon implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<MainTextEndIcon> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f57860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f57861b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MainTextEndIcon((Image) parcel.readParcelable(MainTextEndIcon.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MainTextEndIcon[i];
            }
        }

        public MainTextEndIcon(Image icon, boolean z) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f57860a = icon;
            this.f57861b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MainTextEndIcon)) {
                return false;
            }
            MainTextEndIcon mainTextEndIcon = (MainTextEndIcon) obj2;
            return Intrinsics.f(this.f57860a, mainTextEndIcon.f57860a) && this.f57861b == mainTextEndIcon.f57861b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57861b) + (this.f57860a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57860a, i);
            dest.writeInt(this.f57861b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainTextStyle;", "Landroid/os/Parcelable;", "Default", "Marketing", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainTextStyle$Default;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainTextStyle$Marketing;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface MainTextStyle extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainTextStyle$Default;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainTextStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Default implements MainTextStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Default f57862a = new Default();

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.f57862a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            private Default() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainTextStyle$Marketing;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainTextStyle;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Marketing implements MainTextStyle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Marketing f57863a = new Marketing();

            @NotNull
            public static final Parcelable.Creator<Marketing> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Marketing.f57863a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Marketing[i];
                }
            }

            private Marketing() {
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
            MainTextEndIcon mainTextEndIcon;
            CountDown countDown;
            boolean z;
            MainTextEndIcon mainTextEndIconCreateFromParcel;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            MainText mainText = (MainText) parcel.readParcelable(NavBarCenterViewModel.class.getClassLoader());
            Clause clause = (Clause) parcel.readParcelable(NavBarCenterViewModel.class.getClassLoader());
            Subtitle subtitle = (Subtitle) parcel.readParcelable(NavBarCenterViewModel.class.getClassLoader());
            Button buttonCreateFromParcel = parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel);
            CountDown countDownCreateFromParcel = parcel.readInt() == 0 ? null : CountDown.CREATOR.createFromParcel(parcel);
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                mainTextEndIcon = null;
                countDown = countDownCreateFromParcel;
                z = true;
            } else {
                mainTextEndIcon = null;
                countDown = countDownCreateFromParcel;
                z = false;
            }
            if (parcel.readInt() != 0) {
                mainTextEndIconCreateFromParcel = mainTextEndIcon;
                z3 = true;
            } else {
                mainTextEndIconCreateFromParcel = mainTextEndIcon;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = false;
                z6 = true;
            } else {
                z4 = false;
            }
            boolean z11 = parcel.readInt() == 0 ? z4 : true;
            Image image = (Image) parcel.readParcelable(NavBarCenterViewModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                mainTextEndIconCreateFromParcel = MainTextEndIcon.CREATOR.createFromParcel(parcel);
            }
            return new NavBarCenterViewModel(mainText, clause, subtitle, buttonCreateFromParcel, countDown, z, z3, z6, z11, image, mainTextEndIconCreateFromParcel, parcel.readParcelable(NavBarCenterViewModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NavBarCenterViewModel[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavBarCenterViewModel(Clause mainText, Clause clause, Subtitle subtitle, boolean z, int i) {
        Clause clause2 = (i & 4) != 0 ? null : clause;
        boolean z3 = (i & 512) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        MainTextStyle.Default mainTextStyle = MainTextStyle.Default.f57862a;
        Intrinsics.checkNotNullParameter(mainTextStyle, "mainTextStyle");
        this((MainText) new MainText.Static(mainText, mainTextStyle), clause2, subtitle, (Button) null, true, false, false, z3, (Image) null, (MainTextEndIcon) null, (AnalyticsContext) null, 512);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NavBarCenterViewModel)) {
            return false;
        }
        NavBarCenterViewModel navBarCenterViewModel = (NavBarCenterViewModel) obj2;
        return Intrinsics.f(this.f57840a, navBarCenterViewModel.f57840a) && Intrinsics.f(this.f57841b, navBarCenterViewModel.f57841b) && Intrinsics.f(this.f57842c, navBarCenterViewModel.f57842c) && Intrinsics.f(this.d, navBarCenterViewModel.d) && Intrinsics.f(this.e, navBarCenterViewModel.e) && this.f == navBarCenterViewModel.f && this.f57843g == navBarCenterViewModel.f57843g && this.f57844h == navBarCenterViewModel.f57844h && this.i == navBarCenterViewModel.i && Intrinsics.f(this.f57845j, navBarCenterViewModel.f57845j) && Intrinsics.f(this.k, navBarCenterViewModel.k) && Intrinsics.f(this.f57846l, navBarCenterViewModel.f57846l);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public final Parcelable getF57846l() {
        return this.f57846l;
    }

    public final int hashCode() {
        int iHashCode = this.f57840a.hashCode() * 31;
        Clause clause = this.f57841b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Subtitle subtitle = this.f57842c;
        int iHashCode3 = (iHashCode2 + (subtitle == null ? 0 : subtitle.hashCode())) * 31;
        Button button = this.d;
        int iHashCode4 = (iHashCode3 + (button == null ? 0 : button.hashCode())) * 31;
        CountDown countDown = this.e;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode4 + (countDown == null ? 0 : countDown.hashCode())) * 31, 31, this.f), 31, this.f57843g), 31, this.f57844h), 31, this.i);
        Image image = this.f57845j;
        int iHashCode5 = (iC + (image == null ? 0 : image.hashCode())) * 31;
        MainTextEndIcon mainTextEndIcon = this.k;
        int iHashCode6 = (iHashCode5 + (mainTextEndIcon == null ? 0 : mainTextEndIcon.hashCode())) * 31;
        Parcelable parcelable = this.f57846l;
        return iHashCode6 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f57846l = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57840a, i);
        dest.writeParcelable(this.f57841b, i);
        dest.writeParcelable(this.f57842c, i);
        Button button = this.d;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, i);
        }
        CountDown countDown = this.e;
        if (countDown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            countDown.writeToParcel(dest, i);
        }
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f57843g ? 1 : 0);
        dest.writeInt(this.f57844h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeParcelable(this.f57845j, i);
        MainTextEndIcon mainTextEndIcon = this.k;
        if (mainTextEndIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mainTextEndIcon.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f57846l, i);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle;", "Landroid/os/Parcelable;", "<init>", "()V", "Secondary", "CaptionComplex", "Caption", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$Caption;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$CaptionComplex;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$Secondary;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Subtitle implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$Caption;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Caption extends Subtitle {

            @NotNull
            public static final Parcelable.Creator<Caption> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f57864a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Caption((Clause) parcel.readParcelable(Caption.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Caption[i];
                }
            }

            public Caption(Clause text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f57864a = text;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Caption) && Intrinsics.f(this.f57864a, ((Caption) obj2).f57864a);
            }

            @Override // com.revolut.core.ui_kit.models.NavBarCenterViewModel.Subtitle
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final Clause getF57869a() {
                return this.f57864a;
            }

            public final int hashCode() {
                return this.f57864a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57864a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$Secondary;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Secondary extends Subtitle {

            @NotNull
            public static final Parcelable.Creator<Secondary> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f57869a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Secondary((Clause) parcel.readParcelable(Secondary.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Secondary[i];
                }
            }

            public Secondary(Clause text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f57869a = text;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Secondary) && Intrinsics.f(this.f57869a, ((Secondary) obj2).f57869a);
            }

            @Override // com.revolut.core.ui_kit.models.NavBarCenterViewModel.Subtitle
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final Clause getF57869a() {
                return this.f57869a;
            }

            public final int hashCode() {
                return this.f57869a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57869a, i);
            }
        }

        private Subtitle() {
        }

        /* JADX INFO: renamed from: getText */
        public abstract Clause getF57869a();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$CaptionComplex;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle;", "", "toString", "()Ljava/lang/String;", "Companion", "SubtitlePart", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CaptionComplex extends Subtitle {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f57865a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f57866b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<CaptionComplex> CREATOR = new b();

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Subtitle$CaptionComplex$SubtitlePart;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SubtitlePart implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<SubtitlePart> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Clause f57867a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Parcelable f57868b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SubtitlePart((Clause) parcel.readParcelable(SubtitlePart.class.getClassLoader()), parcel.readParcelable(SubtitlePart.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SubtitlePart[i];
                    }
                }

                public SubtitlePart(Clause clause, Parcelable parcelable) {
                    Intrinsics.checkNotNullParameter(clause, "clause");
                    this.f57867a = clause;
                    this.f57868b = parcelable;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof SubtitlePart)) {
                        return false;
                    }
                    SubtitlePart subtitlePart = (SubtitlePart) obj2;
                    return Intrinsics.f(this.f57867a, subtitlePart.f57867a) && Intrinsics.f(this.f57868b, subtitlePart.f57868b);
                }

                public final int hashCode() {
                    int iHashCode = this.f57867a.hashCode() * 31;
                    Parcelable parcelable = this.f57868b;
                    return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f57867a, i);
                    dest.writeParcelable(this.f57868b, i);
                }
            }

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.models.NavBarCenterViewModel$Subtitle$CaptionComplex$a, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }
            }

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Clause clause = (Clause) j6.a.f(parcel, "parcel", CaptionComplex.class);
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(SubtitlePart.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new CaptionComplex(clause, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CaptionComplex[i];
                }
            }

            public CaptionComplex(Clause clause, List list) {
                this.f57865a = clause;
                this.f57866b = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CaptionComplex)) {
                    return false;
                }
                CaptionComplex captionComplex = (CaptionComplex) obj2;
                return Intrinsics.f(this.f57865a, captionComplex.f57865a) && Intrinsics.f(this.f57866b, captionComplex.f57866b);
            }

            @Override // com.revolut.core.ui_kit.models.NavBarCenterViewModel.Subtitle
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final Clause getF57869a() {
                return this.f57865a;
            }

            public final int hashCode() {
                return this.f57866b.hashCode() + (this.f57865a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57865a, i);
                Iterator itV = p.a.v(this.f57866b, dest);
                while (itV.hasNext()) {
                    ((SubtitlePart) itV.next()).writeToParcel(dest, i);
                }
            }

            public /* synthetic */ CaptionComplex(List list) {
                this(new TextClause("   ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), list);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public CaptionComplex(TextClause separator, List parts) {
                this(new CompositeClause(parts, separator, null, null, 12), zhm.f0.f322471a);
                Intrinsics.checkNotNullParameter(parts, "parts");
                Intrinsics.checkNotNullParameter(separator, "separator");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainText;", "Landroid/os/Parcelable;", "Animated", "Static", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainText$Animated;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainText$Static;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface MainText extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainText$Static;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainText;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Static implements MainText {

            @NotNull
            public static final Parcelable.Creator<Static> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f57858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MainTextStyle f57859b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Static((Clause) parcel.readParcelable(Static.class.getClassLoader()), (MainTextStyle) parcel.readParcelable(Static.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Static[i];
                }
            }

            public Static(Clause value, MainTextStyle style) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(style, "style");
                this.f57858a = value;
                this.f57859b = style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Static)) {
                    return false;
                }
                Static r56 = (Static) obj2;
                return Intrinsics.f(this.f57858a, r56.f57858a) && Intrinsics.f(this.f57859b, r56.f57859b);
            }

            @Override // com.revolut.core.ui_kit.models.NavBarCenterViewModel.MainText
            /* JADX INFO: renamed from: h, reason: from getter */
            public final MainTextStyle getF57859b() {
                return this.f57859b;
            }

            public final int hashCode() {
                return this.f57859b.hashCode() + (this.f57858a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57858a, i);
                dest.writeParcelable(this.f57859b, i);
            }
        }

        /* JADX INFO: renamed from: h */
        MainTextStyle getF57859b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainText$Animated;", "Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$MainText;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Animated implements MainText {

            @NotNull
            public static final Parcelable.Creator<Animated> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f57855a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f57856b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final MainTextStyle f57857c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Animated((Clause) parcel.readParcelable(Animated.class.getClassLoader()), parcel.readString(), (MainTextStyle) parcel.readParcelable(Animated.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Animated[i];
                }
            }

            public Animated(Clause value, String animationId, MainTextStyle style) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(animationId, "animationId");
                Intrinsics.checkNotNullParameter(style, "style");
                this.f57855a = value;
                this.f57856b = animationId;
                this.f57857c = style;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Animated)) {
                    return false;
                }
                Animated animated = (Animated) obj2;
                return Intrinsics.f(this.f57855a, animated.f57855a) && Intrinsics.f(this.f57856b, animated.f57856b) && Intrinsics.f(this.f57857c, animated.f57857c);
            }

            @Override // com.revolut.core.ui_kit.models.NavBarCenterViewModel.MainText
            /* JADX INFO: renamed from: h, reason: from getter */
            public final MainTextStyle getF57859b() {
                return this.f57857c;
            }

            public final int hashCode() {
                return this.f57857c.hashCode() + p.a.c(this.f57855a.hashCode() * 31, 31, this.f57856b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f57855a, i);
                dest.writeString(this.f57856b);
                dest.writeParcelable(this.f57857c, i);
            }

            public /* synthetic */ Animated(MoneyClause moneyClause, String str) {
                this(moneyClause, str, MainTextStyle.Default.f57862a);
            }
        }
    }

    public NavBarCenterViewModel(MainText mainText, Clause clause, Subtitle subtitle, Button button, CountDown countDown, boolean z, boolean z3, boolean z4, boolean z6, Image image, MainTextEndIcon mainTextEndIcon, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(mainText, "mainText");
        this.f57840a = mainText;
        this.f57841b = clause;
        this.f57842c = subtitle;
        this.d = button;
        this.e = countDown;
        this.f = z;
        this.f57843g = z3;
        this.f57844h = z4;
        this.i = z6;
        this.f57845j = image;
        this.k = mainTextEndIcon;
        this.f57846l = parcelable;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/NavBarCenterViewModel$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/models/l", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f57847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f57848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f57849c;
        public final Integer d;
        public final l e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button((Clause) parcel.readParcelable(Button.class.getClassLoader()), (Image) parcel.readParcelable(Button.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), l.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(Clause buttonTitle, Image image, boolean z, Integer num, l theme) {
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.f57847a = buttonTitle;
            this.f57848b = image;
            this.f57849c = z;
            this.d = num;
            this.e = theme;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f57847a, button.f57847a) && Intrinsics.f(this.f57848b, button.f57848b) && this.f57849c == button.f57849c && Intrinsics.f(this.d, button.d) && this.e == button.e;
        }

        public final int hashCode() {
            int iHashCode = this.f57847a.hashCode() * 31;
            Image image = this.f57848b;
            int iC = j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f57849c);
            Integer num = this.d;
            return this.e.hashCode() + ((iC + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f57847a, i);
            dest.writeParcelable(this.f57848b, i);
            dest.writeInt(this.f57849c ? 1 : 0);
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeString(this.e.name());
        }

        public /* synthetic */ Button(TextLocalisedClause textLocalisedClause, Image image, boolean z, Integer num, l lVar, int i) {
            this(textLocalisedClause, (i & 2) != 0 ? null : image, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? l.CONTEXTUAL : lVar);
        }
    }

    public /* synthetic */ NavBarCenterViewModel(MainText mainText, Clause clause, Subtitle subtitle, Button button, boolean z, boolean z3, boolean z4, boolean z6, Image image, MainTextEndIcon mainTextEndIcon, AnalyticsContext analyticsContext, int i) {
        this(mainText, (i & 2) != 0 ? null : clause, (i & 4) != 0 ? null : subtitle, (i & 8) != 0 ? null : button, (CountDown) null, (i & 32) != 0 ? true : z, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z6, (i & 512) != 0 ? null : image, (i & 1024) != 0 ? null : mainTextEndIcon, (i & 2048) != 0 ? null : analyticsContext);
    }
}
