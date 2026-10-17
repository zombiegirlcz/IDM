package com.revolut.feature.wealth.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Configuration", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DisclosuresDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<DisclosuresDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Configuration f95902a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration;", "Landroid/os/Parcelable;", "<init>", "()V", "Trading", "InvestCombined", "Crypto", "Commodities", "Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration$Commodities;", "Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration$Crypto;", "Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration$InvestCombined;", "Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration$Trading;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Configuration implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration$Commodities;", "Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration;", "<init>", "()V", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Commodities extends Configuration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Commodities f95903a = new Commodities();

            @NotNull
            public static final Parcelable.Creator<Commodities> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Commodities.f95903a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Commodities[i];
                }
            }

            private Commodities() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration$Crypto;", "Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration;", "<init>", "()V", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Crypto extends Configuration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Crypto f95904a = new Crypto();

            @NotNull
            public static final Parcelable.Creator<Crypto> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Crypto.f95904a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Crypto[i];
                }
            }

            private Crypto() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration$InvestCombined;", "Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration;", "<init>", "()V", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class InvestCombined extends Configuration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvestCombined f95905a = new InvestCombined();

            @NotNull
            public static final Parcelable.Creator<InvestCombined> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return InvestCombined.f95905a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InvestCombined[i];
                }
            }

            private InvestCombined() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration$Trading;", "Lcom/revolut/feature/wealth/ui/api/navigation/DisclosuresDestination$Configuration;", "<init>", "()V", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Trading extends Configuration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Trading f95906a = new Trading();

            @NotNull
            public static final Parcelable.Creator<Trading> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Trading.f95906a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Trading[i];
                }
            }

            private Trading() {
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

        private Configuration() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisclosuresDestination((Configuration) parcel.readParcelable(DisclosuresDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DisclosuresDestination[i];
        }
    }

    public DisclosuresDestination(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f95902a = configuration;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Configuration getF95902a() {
        return this.f95902a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DisclosuresDestination) && Intrinsics.f(this.f95902a, ((DisclosuresDestination) obj2).f95902a);
    }

    public final int hashCode() {
        return this.f95902a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95902a, i);
    }
}
