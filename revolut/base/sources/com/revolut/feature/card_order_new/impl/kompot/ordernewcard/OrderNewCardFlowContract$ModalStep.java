package com.revolut.feature.card_order_new.impl.kompot.ordernewcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_order_new.api.BackConfirmationDialog;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m23.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BackConfirmation", "JuniorSkip", "SubtypePicker", "Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$ModalStep$BackConfirmation;", "Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$ModalStep$JuniorSkip;", "Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$ModalStep$SubtypePicker;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderNewCardFlowContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$ModalStep$BackConfirmation;", "Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BackConfirmation implements OrderNewCardFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BackConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BackConfirmationDialog f65099a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BackConfirmation((BackConfirmationDialog) parcel.readParcelable(BackConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BackConfirmation[i];
            }
        }

        public BackConfirmation(BackConfirmationDialog dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.f65099a = dialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BackConfirmation) && Intrinsics.f(this.f65099a, ((BackConfirmation) obj2).f65099a);
        }

        public final int hashCode() {
            return this.f65099a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65099a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$ModalStep$JuniorSkip;", "Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorSkip implements OrderNewCardFlowContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JuniorSkip f65100a = new JuniorSkip();

        @NotNull
        public static final Parcelable.Creator<JuniorSkip> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return JuniorSkip.f65100a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorSkip[i];
            }
        }

        private JuniorSkip() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof JuniorSkip);
        }

        public final int hashCode() {
            return -180693365;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$ModalStep$SubtypePicker;", "Lcom/revolut/feature/card_order_new/impl/kompot/ordernewcard/OrderNewCardFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubtypePicker implements OrderNewCardFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SubtypePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f65101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e13.a f65102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f65103c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubtypePicker(b.valueOf(parcel.readString()), e13.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubtypePicker[i];
            }
        }

        public SubtypePicker(b country, e13.a flowType, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f65101a = country;
            this.f65102b = flowType;
            this.f65103c = z;
            this.d = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubtypePicker)) {
                return false;
            }
            SubtypePicker subtypePicker = (SubtypePicker) obj2;
            return this.f65101a == subtypePicker.f65101a && this.f65102b == subtypePicker.f65102b && this.f65103c == subtypePicker.f65103c && this.d == subtypePicker.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c((this.f65102b.hashCode() + (this.f65101a.hashCode() * 31)) * 31, 31, this.f65103c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65101a.name());
            dest.writeString(this.f65102b.name());
            dest.writeInt(this.f65103c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }
}
