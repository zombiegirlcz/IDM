package com.revolut.feature.acquiring.card_reader.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderTipsSettingsDestination$TipsSettingsBridge", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_acquiring_card_reader_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderTipsSettingsDestination$TipsSettingsBridge extends CardReaderFlowDestination implements KompotDestination {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CardReaderTipsSettingsDestination$TipsSettingsBridge f60614b = new CardReaderTipsSettingsDestination$TipsSettingsBridge(0);

    @NotNull
    public static final Parcelable.Creator<CardReaderTipsSettingsDestination$TipsSettingsBridge> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CardReaderTipsSettingsDestination$TipsSettingsBridge.f60614b;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardReaderTipsSettingsDestination$TipsSettingsBridge[i];
        }
    }

    private CardReaderTipsSettingsDestination$TipsSettingsBridge() {
        super(0);
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
