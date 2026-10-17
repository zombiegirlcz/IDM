package com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import e93.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Guidelines", "EmojiPicker", "ImageGeneration", "ConfirmExit", "StartOver", "ConfirmSkip", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$ConfirmExit;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$ConfirmSkip;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$EmojiPicker;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$Guidelines;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$ImageGeneration;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$StartOver;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardPersonalisationControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$ConfirmExit;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmExit implements CardPersonalisationControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmExit f65164a = new ConfirmExit();

        @NotNull
        public static final Parcelable.Creator<ConfirmExit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmExit.f65164a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmExit[i];
            }
        }

        private ConfirmExit() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$ConfirmSkip;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmSkip implements CardPersonalisationControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmSkip f65165a = new ConfirmSkip();

        @NotNull
        public static final Parcelable.Creator<ConfirmSkip> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmSkip.f65165a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmSkip[i];
            }
        }

        private ConfirmSkip() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$EmojiPicker;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmojiPicker implements CardPersonalisationControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EmojiPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f65166a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmojiPicker((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmojiPicker[i];
            }
        }

        public EmojiPicker(wi0.b bVar) {
            this.f65166a = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EmojiPicker) && Intrinsics.f(this.f65166a, ((EmojiPicker) obj2).f65166a);
        }

        public final int hashCode() {
            wi0.b bVar = this.f65166a;
            if (bVar == null) {
                return 0;
            }
            return bVar.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65166a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$Guidelines;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Guidelines implements CardPersonalisationControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Guidelines> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f65167a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Guidelines(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Guidelines[i];
            }
        }

        public Guidelines(boolean z) {
            this.f65167a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Guidelines) && this.f65167a == ((Guidelines) obj2).f65167a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f65167a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f65167a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$ImageGeneration;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ImageGeneration implements CardPersonalisationControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ImageGeneration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g0 f65168a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ImageGeneration((g0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImageGeneration[i];
            }
        }

        public ImageGeneration(g0 g0Var) {
            this.f65168a = g0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ImageGeneration) && Intrinsics.f(this.f65168a, ((ImageGeneration) obj2).f65168a);
        }

        public final int hashCode() {
            g0 g0Var = this.f65168a;
            if (g0Var == null) {
                return 0;
            }
            return g0Var.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65168a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep$StartOver;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationControllerContract$ModalStep;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StartOver implements CardPersonalisationControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StartOver f65169a = new StartOver();

        @NotNull
        public static final Parcelable.Creator<StartOver> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StartOver.f65169a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartOver[i];
            }
        }

        private StartOver() {
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
}
