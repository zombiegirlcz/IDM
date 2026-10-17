package com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/junior/isa/impl/ui/jisa_child_trading_creation/JuniorIsaChildCreationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "UpdateAddress", "UpdateGender", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_child_trading_creation/JuniorIsaChildCreationScreenContract$ModalStep$UpdateAddress;", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_child_trading_creation/JuniorIsaChildCreationScreenContract$ModalStep$UpdateGender;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorIsaChildCreationScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_child_trading_creation/JuniorIsaChildCreationScreenContract$ModalStep$UpdateAddress;", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_child_trading_creation/JuniorIsaChildCreationScreenContract$ModalStep;", "<init>", "()V", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdateAddress extends JuniorIsaChildCreationScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateAddress f76779a = new UpdateAddress();

        @NotNull
        public static final Parcelable.Creator<UpdateAddress> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdateAddress.f76779a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateAddress[i];
            }
        }

        private UpdateAddress() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_child_trading_creation/JuniorIsaChildCreationScreenContract$ModalStep$UpdateGender;", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_child_trading_creation/JuniorIsaChildCreationScreenContract$ModalStep;", "<init>", "()V", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdateGender extends JuniorIsaChildCreationScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateGender f76780a = new UpdateGender();

        @NotNull
        public static final Parcelable.Creator<UpdateGender> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdateGender.f76780a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateGender[i];
            }
        }

        private UpdateGender() {
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

    private JuniorIsaChildCreationScreenContract$ModalStep() {
    }
}
