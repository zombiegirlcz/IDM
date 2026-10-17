package com.revolut.feature.shared_separate_favourites.api.alerts.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/alerts/navigation/AddSharedAlertsDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/shared_separate_favourites/api/alerts/navigation/AddSharedAlertsDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddSharedAlertsDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AddSharedAlertsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AddSharedAlertsConfiguration f86763b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/api/alerts/navigation/AddSharedAlertsDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AddSharedAlertsConfiguration f86764a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData(AddSharedAlertsConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(AddSharedAlertsConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f86764a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f86764a, ((InputData) obj2).f86764a);
        }

        public final int hashCode() {
            return this.f86764a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f86764a.writeToParcel(dest, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddSharedAlertsDestination(AddSharedAlertsConfiguration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddSharedAlertsDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddSharedAlertsDestination(AddSharedAlertsConfiguration configuration) {
        super(new InputData(configuration));
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f86763b = configuration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AddSharedAlertsConfiguration getF86763b() {
        return this.f86763b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AddSharedAlertsDestination) && Intrinsics.f(this.f86763b, ((AddSharedAlertsDestination) obj2).f86763b);
    }

    public final int hashCode() {
        return this.f86763b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f86763b.writeToParcel(dest, i);
    }
}
