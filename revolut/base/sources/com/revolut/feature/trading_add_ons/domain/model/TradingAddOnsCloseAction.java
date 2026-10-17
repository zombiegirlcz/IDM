package com.revolut.feature.trading_add_ons.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading_add_ons/domain/model/TradingAddOnsCloseAction;", "Landroid/os/Parcelable;", "GoToInvest", "GoBack", "Lcom/revolut/feature/trading_add_ons/domain/model/TradingAddOnsCloseAction$GoBack;", "Lcom/revolut/feature/trading_add_ons/domain/model/TradingAddOnsCloseAction$GoToInvest;", "feature_trading_add_ons_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingAddOnsCloseAction extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading_add_ons/domain/model/TradingAddOnsCloseAction$GoBack;", "Lcom/revolut/feature/trading_add_ons/domain/model/TradingAddOnsCloseAction;", "<init>", "()V", "feature_trading_add_ons_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GoBack implements TradingAddOnsCloseAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GoBack f91662a = new GoBack();

        @NotNull
        public static final Parcelable.Creator<GoBack> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GoBack.f91662a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GoBack[i];
            }
        }

        private GoBack() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading_add_ons/domain/model/TradingAddOnsCloseAction$GoToInvest;", "Lcom/revolut/feature/trading_add_ons/domain/model/TradingAddOnsCloseAction;", "<init>", "()V", "feature_trading_add_ons_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GoToInvest implements TradingAddOnsCloseAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GoToInvest f91663a = new GoToInvest();

        @NotNull
        public static final Parcelable.Creator<GoToInvest> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GoToInvest.f91663a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GoToInvest[i];
            }
        }

        private GoToInvest() {
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
