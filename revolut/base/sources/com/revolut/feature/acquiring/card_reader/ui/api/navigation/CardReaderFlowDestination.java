package com.revolut.feature.acquiring.card_reader.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "<init>", "()V", "CardReader", "PaymentLinkSettings", "CardReaderBridge", "CardReaderSettingsBridge", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination$CardReader;", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination$CardReaderBridge;", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination$CardReaderSettingsBridge;", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination$PaymentLinkSettings;", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderTipsSettingsDestination$TipsSettings;", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderTipsSettingsDestination$TipsSettingsBridge;", "feature_acquiring_card_reader_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardReaderFlowDestination extends InternalDestination<IOData$EmptyInput> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination$CardReader;", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination;", "<init>", "()V", "feature_acquiring_card_reader_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardReader extends CardReaderFlowDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CardReader f60609b = new CardReader(0);

        @NotNull
        public static final Parcelable.Creator<CardReader> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardReader.f60609b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardReader[i];
            }
        }

        private CardReader() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination$CardReaderBridge;", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_acquiring_card_reader_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardReaderBridge extends CardReaderFlowDestination implements KompotDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CardReaderBridge f60610b = new CardReaderBridge(0);

        @NotNull
        public static final Parcelable.Creator<CardReaderBridge> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardReaderBridge.f60610b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardReaderBridge[i];
            }
        }

        private CardReaderBridge() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination$CardReaderSettingsBridge;", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_acquiring_card_reader_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardReaderSettingsBridge extends CardReaderFlowDestination implements KompotDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CardReaderSettingsBridge f60611b = new CardReaderSettingsBridge(0);

        @NotNull
        public static final Parcelable.Creator<CardReaderSettingsBridge> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardReaderSettingsBridge.f60611b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardReaderSettingsBridge[i];
            }
        }

        private CardReaderSettingsBridge() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination$PaymentLinkSettings;", "Lcom/revolut/feature/acquiring/card_reader/ui/api/navigation/CardReaderFlowDestination;", "<init>", "()V", "feature_acquiring_card_reader_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentLinkSettings extends CardReaderFlowDestination {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PaymentLinkSettings f60612b = new PaymentLinkSettings(0);

        @NotNull
        public static final Parcelable.Creator<PaymentLinkSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentLinkSettings.f60612b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentLinkSettings[i];
            }
        }

        private PaymentLinkSettings() {
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

    public /* synthetic */ CardReaderFlowDestination(int i) {
        this();
    }

    private CardReaderFlowDestination() {
        super(IOData$EmptyInput.f98299a);
    }
}
