package com.revolut.feature.crypto.receive_widget.impl.ui.customize;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "InitialEmpty", "CryptoOnboarded", "SelectNetwork", "MindfulOfNetwork", "Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step$CryptoOnboarded;", "Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step$InitialEmpty;", "Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step$MindfulOfNetwork;", "Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step$SelectNetwork;", "feature_crypto_receive_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoReceiveWidgetCustomizationContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step$CryptoOnboarded;", "Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step;", "<init>", "()V", "feature_crypto_receive_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoOnboarded extends CryptoReceiveWidgetCustomizationContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CryptoOnboarded f70908a = new CryptoOnboarded();

        @NotNull
        public static final Parcelable.Creator<CryptoOnboarded> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoOnboarded.f70908a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoOnboarded[i];
            }
        }

        private CryptoOnboarded() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step$InitialEmpty;", "Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step;", "<init>", "()V", "feature_crypto_receive_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InitialEmpty extends CryptoReceiveWidgetCustomizationContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitialEmpty f70909a = new InitialEmpty();

        @NotNull
        public static final Parcelable.Creator<InitialEmpty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InitialEmpty.f70909a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InitialEmpty[i];
            }
        }

        private InitialEmpty() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step$MindfulOfNetwork;", "Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_receive_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MindfulOfNetwork extends CryptoReceiveWidgetCustomizationContract$Step {

        @NotNull
        public static final Parcelable.Creator<MindfulOfNetwork> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wk5.a f70911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70912c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MindfulOfNetwork(parcel.readString(), parcel.readString(), wk5.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MindfulOfNetwork[i];
            }
        }

        public MindfulOfNetwork(String currencyCode, String depositAddress, wk5.a blockchain) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(blockchain, "blockchain");
            Intrinsics.checkNotNullParameter(depositAddress, "depositAddress");
            this.f70910a = currencyCode;
            this.f70911b = blockchain;
            this.f70912c = depositAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MindfulOfNetwork)) {
                return false;
            }
            MindfulOfNetwork mindfulOfNetwork = (MindfulOfNetwork) obj2;
            return Intrinsics.f(this.f70910a, mindfulOfNetwork.f70910a) && this.f70911b == mindfulOfNetwork.f70911b && Intrinsics.f(this.f70912c, mindfulOfNetwork.f70912c);
        }

        public final int hashCode() {
            return this.f70912c.hashCode() + ((this.f70911b.hashCode() + (this.f70910a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70910a);
            dest.writeString(this.f70911b.name());
            dest.writeString(this.f70912c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step$SelectNetwork;", "Lcom/revolut/feature/crypto/receive_widget/impl/ui/customize/CryptoReceiveWidgetCustomizationContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_receive_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectNetwork extends CryptoReceiveWidgetCustomizationContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectNetwork> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f70914b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(wk5.a.valueOf(parcel.readString()));
                }
                return new SelectNetwork(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectNetwork[i];
            }
        }

        public SelectNetwork(String currencyCode, List blockchains) {
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(blockchains, "blockchains");
            this.f70913a = currencyCode;
            this.f70914b = blockchains;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectNetwork)) {
                return false;
            }
            SelectNetwork selectNetwork = (SelectNetwork) obj2;
            return Intrinsics.f(this.f70913a, selectNetwork.f70913a) && Intrinsics.f(this.f70914b, selectNetwork.f70914b);
        }

        public final int hashCode() {
            return this.f70914b.hashCode() + (this.f70913a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70913a);
            Iterator itV = p.a.v(this.f70914b, dest);
            while (itV.hasNext()) {
                dest.writeString(((wk5.a) itV.next()).name());
            }
        }
    }

    private CryptoReceiveWidgetCustomizationContract$Step() {
    }
}
