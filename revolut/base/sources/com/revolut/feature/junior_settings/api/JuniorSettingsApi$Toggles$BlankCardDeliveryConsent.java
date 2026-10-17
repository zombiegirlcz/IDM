package com.revolut.feature.junior_settings.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/junior_settings/api/JuniorSettingsApi$Toggles$BlankCardDeliveryConsent", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorSettingsApi$Toggles$BlankCardDeliveryConsent extends RemoteFeatureDefinition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final JuniorSettingsApi$Toggles$BlankCardDeliveryConsent f77250c = new JuniorSettingsApi$Toggles$BlankCardDeliveryConsent();

    @NotNull
    public static final Parcelable.Creator<JuniorSettingsApi$Toggles$BlankCardDeliveryConsent> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return JuniorSettingsApi$Toggles$BlankCardDeliveryConsent.f77250c;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorSettingsApi$Toggles$BlankCardDeliveryConsent[i];
        }
    }

    private JuniorSettingsApi$Toggles$BlankCardDeliveryConsent() {
    }

    @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
    public final Experiment a() {
        return new ReleaseFlagExperiment("blankCardDeliveryConsent");
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
