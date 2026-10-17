package com.revolut.navigation.deeplink.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.toggles.models.DevelopmentOnlyFeatureDefinition;
import com.revolut.feature.toggles.models.LocalFeatureState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/navigation/deeplink/api/SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled", "Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "<init>", "()V", "deeplink_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled extends DevelopmentOnlyFeatureDefinition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled f98459a = new SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled();

    @NotNull
    public static final Parcelable.Creator<SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled.f98459a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled[i];
        }
    }

    private SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.toggles.models.FeatureDefinition
    public final LocalFeatureState s5() {
        return new LocalFeatureState.Binary(false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
