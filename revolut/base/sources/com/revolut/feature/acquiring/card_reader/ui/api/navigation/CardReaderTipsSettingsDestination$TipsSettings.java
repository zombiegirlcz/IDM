package com.revolut.feature.acquiring.card_reader.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderTipsSettingsDestination$TipsSettings", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination;", "<init>", "()V", "feature_acquiring_card_reader_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderTipsSettingsDestination$TipsSettings extends CardReaderFlowDestination {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CardReaderTipsSettingsDestination$TipsSettings f60613b = new CardReaderTipsSettingsDestination$TipsSettings(0);

    @NotNull
    public static final Parcelable.Creator<CardReaderTipsSettingsDestination$TipsSettings> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CardReaderTipsSettingsDestination$TipsSettings.f60613b;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardReaderTipsSettingsDestination$TipsSettings[i];
        }
    }

    private CardReaderTipsSettingsDestination$TipsSettings() {
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
