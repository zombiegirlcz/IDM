package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction;", "Landroid/os/Parcelable;", "Keep", "Downgrade", "Subscribe", "SubscribeWithBenefits", "Order", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction$Downgrade;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction$Keep;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction$Order;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction$Subscribe;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction$SubscribeWithBenefits;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsCardOrderAction extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction$Downgrade;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Downgrade implements CobrandedCardsCardOrderAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Downgrade f82509a = new Downgrade();

        @NotNull
        public static final Parcelable.Creator<Downgrade> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Downgrade.f82509a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Downgrade[i];
            }
        }

        private Downgrade() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction$Keep;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Keep implements CobrandedCardsCardOrderAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Keep f82510a = new Keep();

        @NotNull
        public static final Parcelable.Creator<Keep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Keep.f82510a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Keep[i];
            }
        }

        private Keep() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction$Order;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Order implements CobrandedCardsCardOrderAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Order f82511a = new Order();

        @NotNull
        public static final Parcelable.Creator<Order> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Order.f82511a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction$Subscribe;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Subscribe implements CobrandedCardsCardOrderAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Subscribe f82512a = new Subscribe();

        @NotNull
        public static final Parcelable.Creator<Subscribe> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Subscribe.f82512a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Subscribe[i];
            }
        }

        private Subscribe() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction$SubscribeWithBenefits;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/CobrandedCardsCardOrderAction;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SubscribeWithBenefits implements CobrandedCardsCardOrderAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SubscribeWithBenefits f82513a = new SubscribeWithBenefits();

        @NotNull
        public static final Parcelable.Creator<SubscribeWithBenefits> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SubscribeWithBenefits.f82513a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscribeWithBenefits[i];
            }
        }

        private SubscribeWithBenefits() {
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
