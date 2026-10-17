package com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"com/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Promo", "Order", "RevolutShop", "Connection", "NewRequest", "Amount", "Settings", "CardReaderSettings", "TipsSettings", "PaymentLinkExpiryDate", "PaymentLinkSettings", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$Amount;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$CardReaderSettings;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$Connection;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$NewRequest;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$Order;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$PaymentLinkExpiryDate;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$PaymentLinkSettings;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$Promo;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$RevolutShop;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$Settings;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$TipsSettings;", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardReaderRootFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$Amount;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Amount extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Amount f60629a = new Amount();

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Amount.f60629a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        private Amount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$CardReaderSettings;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardReaderSettings extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardReaderSettings f60630a = new CardReaderSettings();

        @NotNull
        public static final Parcelable.Creator<CardReaderSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardReaderSettings.f60630a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardReaderSettings[i];
            }
        }

        private CardReaderSettings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$Connection;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Connection extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Connection f60631a = new Connection();

        @NotNull
        public static final Parcelable.Creator<Connection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Connection.f60631a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Connection[i];
            }
        }

        private Connection() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$NewRequest;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewRequest extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewRequest f60632a = new NewRequest();

        @NotNull
        public static final Parcelable.Creator<NewRequest> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewRequest.f60632a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewRequest[i];
            }
        }

        private NewRequest() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$Order;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Order extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Order f60633a = new Order();

        @NotNull
        public static final Parcelable.Creator<Order> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Order.f60633a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Order[i];
            }
        }

        private Order() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$PaymentLinkExpiryDate;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentLinkExpiryDate extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentLinkExpiryDate f60634a = new PaymentLinkExpiryDate();

        @NotNull
        public static final Parcelable.Creator<PaymentLinkExpiryDate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentLinkExpiryDate.f60634a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentLinkExpiryDate[i];
            }
        }

        private PaymentLinkExpiryDate() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$PaymentLinkSettings;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentLinkSettings extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaymentLinkSettings f60635a = new PaymentLinkSettings();

        @NotNull
        public static final Parcelable.Creator<PaymentLinkSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentLinkSettings.f60635a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentLinkSettings[i];
            }
        }

        private PaymentLinkSettings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$Promo;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Promo extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Promo f60636a = new Promo();

        @NotNull
        public static final Parcelable.Creator<Promo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Promo.f60636a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Promo[i];
            }
        }

        private Promo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$RevolutShop;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevolutShop extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevolutShop f60637a = new RevolutShop();

        @NotNull
        public static final Parcelable.Creator<RevolutShop> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevolutShop.f60637a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutShop[i];
            }
        }

        private RevolutShop() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$Settings;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Settings f60638a = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f60638a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        private Settings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step$TipsSettings;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TipsSettings extends CardReaderRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TipsSettings f60639a = new TipsSettings();

        @NotNull
        public static final Parcelable.Creator<TipsSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TipsSettings.f60639a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TipsSettings[i];
            }
        }

        private TipsSettings() {
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

    private CardReaderRootFlowContract$Step() {
    }
}
