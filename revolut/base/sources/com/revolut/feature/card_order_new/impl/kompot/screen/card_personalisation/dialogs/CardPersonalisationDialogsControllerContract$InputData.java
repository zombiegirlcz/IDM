package com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.dialogs;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/dialogs/CardPersonalisationDialogsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "StartOver", "ConfirmExit", "Skip", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/dialogs/CardPersonalisationDialogsControllerContract$InputData$ConfirmExit;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/dialogs/CardPersonalisationDialogsControllerContract$InputData$Skip;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/dialogs/CardPersonalisationDialogsControllerContract$InputData$StartOver;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardPersonalisationDialogsControllerContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/dialogs/CardPersonalisationDialogsControllerContract$InputData$ConfirmExit;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/dialogs/CardPersonalisationDialogsControllerContract$InputData;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmExit extends CardPersonalisationDialogsControllerContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmExit f65180a = new ConfirmExit();

        @NotNull
        public static final Parcelable.Creator<ConfirmExit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmExit.f65180a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/dialogs/CardPersonalisationDialogsControllerContract$InputData$Skip;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/dialogs/CardPersonalisationDialogsControllerContract$InputData;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Skip extends CardPersonalisationDialogsControllerContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Skip f65181a = new Skip();

        @NotNull
        public static final Parcelable.Creator<Skip> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Skip.f65181a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Skip[i];
            }
        }

        private Skip() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/dialogs/CardPersonalisationDialogsControllerContract$InputData$StartOver;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/dialogs/CardPersonalisationDialogsControllerContract$InputData;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StartOver extends CardPersonalisationDialogsControllerContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StartOver f65182a = new StartOver();

        @NotNull
        public static final Parcelable.Creator<StartOver> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StartOver.f65182a;
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

    private CardPersonalisationDialogsControllerContract$InputData() {
    }
}
