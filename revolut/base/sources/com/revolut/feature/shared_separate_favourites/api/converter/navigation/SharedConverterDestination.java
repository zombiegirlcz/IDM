package com.revolut.feature.shared_separate_favourites.api.converter.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "Configuration", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedConverterDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SharedConverterDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f86787b;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination$Configuration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Configuration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f86788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f86789b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination$Configuration$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "AddAsset", "ShowKeyboard", "Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination$Configuration$Action$AddAsset;", "Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination$Configuration$Action$ShowKeyboard;", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Action implements Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination$Configuration$Action$AddAsset;", "Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination$Configuration$Action;", "<init>", "()V", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class AddAsset extends Action {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final AddAsset f86790a = new AddAsset();

                @NotNull
                public static final Parcelable.Creator<AddAsset> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return AddAsset.f86790a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AddAsset[i];
                    }
                }

                private AddAsset() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination$Configuration$Action$ShowKeyboard;", "Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination$Configuration$Action;", "<init>", "()V", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class ShowKeyboard extends Action {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final ShowKeyboard f86791a = new ShowKeyboard();

                @NotNull
                public static final Parcelable.Creator<ShowKeyboard> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return ShowKeyboard.f86791a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ShowKeyboard[i];
                    }
                }

                private ShowKeyboard() {
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

            private Action() {
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(Configuration.class, parcel, linkedHashSet, iE, 1);
                }
                return new Configuration(linkedHashSet, (Action) parcel.readParcelable(Configuration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public Configuration(Set convertibleAssets, Action action) {
            Intrinsics.checkNotNullParameter(convertibleAssets, "convertibleAssets");
            this.f86788a = convertibleAssets;
            this.f86789b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj2;
            return Intrinsics.f(this.f86788a, configuration.f86788a) && Intrinsics.f(this.f86789b, configuration.f86789b);
        }

        public final int hashCode() {
            int iHashCode = this.f86788a.hashCode() * 31;
            Action action = this.f86789b;
            return iHashCode + (action == null ? 0 : action.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f86788a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f86789b, i);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/converter/navigation/SharedConverterDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Configuration f86792a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData(Configuration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f86792a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f86792a, ((InputData) obj2).f86792a);
        }

        public final int hashCode() {
            return this.f86792a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f86792a.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharedConverterDestination(Configuration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedConverterDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedConverterDestination(Configuration configuration) {
        super(new InputData(configuration));
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f86787b = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SharedConverterDestination) && Intrinsics.f(this.f86787b, ((SharedConverterDestination) obj2).f86787b);
    }

    public final int hashCode() {
        return this.f86787b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f86787b.writeToParcel(dest, i);
    }
}
