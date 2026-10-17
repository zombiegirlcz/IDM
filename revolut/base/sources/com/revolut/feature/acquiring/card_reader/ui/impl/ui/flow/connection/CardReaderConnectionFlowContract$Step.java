package com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CompatibilityCheck", "Introduction", "Scanning", "RevolutShop", "Connecting", "Updating", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$CompatibilityCheck;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$Connecting;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$Introduction;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$RevolutShop;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$Scanning;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$Updating;", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardReaderConnectionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$CompatibilityCheck;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CompatibilityCheck extends CardReaderConnectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CompatibilityCheck f60617a = new CompatibilityCheck();

        @NotNull
        public static final Parcelable.Creator<CompatibilityCheck> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CompatibilityCheck.f60617a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CompatibilityCheck[i];
            }
        }

        private CompatibilityCheck() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$Connecting;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Connecting extends CardReaderConnectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Connecting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardReaderDevice f60618a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Connecting((CardReaderDevice) parcel.readParcelable(Connecting.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Connecting[i];
            }
        }

        public Connecting(CardReaderDevice cardReaderDevice) {
            Intrinsics.checkNotNullParameter(cardReaderDevice, "cardReaderDevice");
            this.f60618a = cardReaderDevice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Connecting) && Intrinsics.f(this.f60618a, ((Connecting) obj2).f60618a);
        }

        public final int hashCode() {
            return this.f60618a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60618a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$Introduction;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Introduction extends CardReaderConnectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Introduction f60619a = new Introduction();

        @NotNull
        public static final Parcelable.Creator<Introduction> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Introduction.f60619a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Introduction[i];
            }
        }

        private Introduction() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$RevolutShop;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevolutShop extends CardReaderConnectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevolutShop f60620a = new RevolutShop();

        @NotNull
        public static final Parcelable.Creator<RevolutShop> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevolutShop.f60620a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$Scanning;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step;", "<init>", "()V", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Scanning extends CardReaderConnectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Scanning f60621a = new Scanning();

        @NotNull
        public static final Parcelable.Creator<Scanning> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Scanning.f60621a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scanning[i];
            }
        }

        private Scanning() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step$Updating;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/connection/CardReaderConnectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Updating extends CardReaderConnectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Updating> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardReaderDevice f60622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PairingInfo f60623b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Updating((CardReaderDevice) parcel.readParcelable(Updating.class.getClassLoader()), (PairingInfo) parcel.readParcelable(Updating.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Updating[i];
            }
        }

        public Updating(CardReaderDevice cardReader, PairingInfo pairingInfo) {
            Intrinsics.checkNotNullParameter(cardReader, "cardReader");
            Intrinsics.checkNotNullParameter(pairingInfo, "pairingInfo");
            this.f60622a = cardReader;
            this.f60623b = pairingInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Updating)) {
                return false;
            }
            Updating updating = (Updating) obj2;
            return Intrinsics.f(this.f60622a, updating.f60622a) && Intrinsics.f(this.f60623b, updating.f60623b);
        }

        public final int hashCode() {
            return this.f60623b.hashCode() + (this.f60622a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60622a, i);
            dest.writeParcelable(this.f60623b, i);
        }
    }

    private CardReaderConnectionFlowContract$Step() {
    }
}
