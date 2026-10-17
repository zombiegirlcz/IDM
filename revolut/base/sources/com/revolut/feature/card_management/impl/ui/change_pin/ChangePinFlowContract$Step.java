package com.revolut.feature.card_management.impl.ui.change_pin;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Information", "CreatePin", "ConfirmPin", "Activation", "Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step$Activation;", "Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step$ConfirmPin;", "Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step$CreatePin;", "Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step$Information;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ChangePinFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step$Activation;", "Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Activation extends ChangePinFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Activation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64840a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Activation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Activation[i];
            }
        }

        public Activation(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64840a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Activation) && Intrinsics.f(this.f64840a, ((Activation) obj2).f64840a);
        }

        public final int hashCode() {
            return this.f64840a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64840a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step$ConfirmPin;", "Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmPin extends ChangePinFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmPin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64841a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmPin(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmPin[i];
            }
        }

        public ConfirmPin(String pin) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            this.f64841a = pin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConfirmPin) && Intrinsics.f(this.f64841a, ((ConfirmPin) obj2).f64841a);
        }

        public final int hashCode() {
            return this.f64841a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64841a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step$CreatePin;", "Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step;", "<init>", "()V", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreatePin extends ChangePinFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreatePin f64842a = new CreatePin();

        @NotNull
        public static final Parcelable.Creator<CreatePin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreatePin.f64842a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreatePin[i];
            }
        }

        private CreatePin() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step$Information;", "Lcom/revolut/feature/card_management/impl/ui/change_pin/ChangePinFlowContract$Step;", "<init>", "()V", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Information extends ChangePinFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Information f64843a = new Information();

        @NotNull
        public static final Parcelable.Creator<Information> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Information.f64843a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Information[i];
            }
        }

        private Information() {
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

    private ChangePinFlowContract$Step() {
    }
}
