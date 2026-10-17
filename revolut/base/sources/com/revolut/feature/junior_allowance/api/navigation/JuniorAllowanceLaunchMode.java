package com.revolut.feature.junior_allowance.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode;", "Landroid/os/Parcelable;", "AsDestination", "AsNaviCommand", "Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsDestination;", "Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsNaviCommand;", "feature_junior_allowance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorAllowanceLaunchMode extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsDestination;", "Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode;", "<init>", "()V", "feature_junior_allowance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AsDestination implements JuniorAllowanceLaunchMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AsDestination f76816a = new AsDestination();

        @NotNull
        public static final Parcelable.Creator<AsDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AsDestination.f76816a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AsDestination[i];
            }
        }

        private AsDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsNaviCommand;", "Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode;", "", "toString", "()Ljava/lang/String;", "NaviCommandMode", "feature_junior_allowance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AsNaviCommand implements JuniorAllowanceLaunchMode {

        @NotNull
        public static final Parcelable.Creator<AsNaviCommand> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommandMode f76817a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsNaviCommand$NaviCommandMode;", "Landroid/os/Parcelable;", "WithRequestCode", "Default", "Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsNaviCommand$NaviCommandMode$Default;", "Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsNaviCommand$NaviCommandMode$WithRequestCode;", "feature_junior_allowance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface NaviCommandMode extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsNaviCommand$NaviCommandMode$Default;", "Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsNaviCommand$NaviCommandMode;", "", "toString", "()Ljava/lang/String;", "feature_junior_allowance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Default implements NaviCommandMode {

                @NotNull
                public static final Parcelable.Creator<Default> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final NaviCommand f76818a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Default((NaviCommand) parcel.readParcelable(Default.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Default[i];
                    }
                }

                public Default() {
                    this(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Default) && Intrinsics.f(this.f76818a, ((Default) obj2).f76818a);
                }

                public final int hashCode() {
                    NaviCommand naviCommand = this.f76818a;
                    if (naviCommand == null) {
                        return 0;
                    }
                    return naviCommand.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f76818a, i);
                }

                public Default(NaviCommand naviCommand) {
                    this.f76818a = naviCommand;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsNaviCommand$NaviCommandMode$WithRequestCode;", "Lcom/revolut/feature/junior_allowance/api/navigation/JuniorAllowanceLaunchMode$AsNaviCommand$NaviCommandMode;", "<init>", "()V", "feature_junior_allowance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class WithRequestCode implements NaviCommandMode {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final WithRequestCode f76819a = new WithRequestCode();

                @NotNull
                public static final Parcelable.Creator<WithRequestCode> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return WithRequestCode.f76819a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new WithRequestCode[i];
                    }
                }

                private WithRequestCode() {
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
                return new AsNaviCommand((NaviCommandMode) parcel.readParcelable(AsNaviCommand.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AsNaviCommand[i];
            }
        }

        public AsNaviCommand(NaviCommandMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f76817a = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AsNaviCommand) && Intrinsics.f(this.f76817a, ((AsNaviCommand) obj2).f76817a);
        }

        public final int hashCode() {
            return this.f76817a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76817a, i);
        }
    }
}
