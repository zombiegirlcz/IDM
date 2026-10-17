package com.revolut.retail.feature.limits.impl.ui.limits_prompt.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit", "Landroid/os/Parcelable;", "<init>", "()V", "Fx", "WalletDaily", "WalletWeekly", "WalletYearly", "Atm", "Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit$Atm;", "Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit$Fx;", "Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit$WalletDaily;", "Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit$WalletWeekly;", "Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit$WalletYearly;", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LimitsPromptFlowContract$Limit implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit$Atm;", "Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit;", "<init>", "()V", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Atm extends LimitsPromptFlowContract$Limit {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Atm f101789a = new Atm();

        @NotNull
        public static final Parcelable.Creator<Atm> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Atm.f101789a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Atm[i];
            }
        }

        private Atm() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit$Fx;", "Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit;", "<init>", "()V", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Fx extends LimitsPromptFlowContract$Limit {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Fx f101790a = new Fx();

        @NotNull
        public static final Parcelable.Creator<Fx> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Fx.f101790a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fx[i];
            }
        }

        private Fx() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit$WalletDaily;", "Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit;", "<init>", "()V", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WalletDaily extends LimitsPromptFlowContract$Limit {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WalletDaily f101791a = new WalletDaily();

        @NotNull
        public static final Parcelable.Creator<WalletDaily> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WalletDaily.f101791a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletDaily[i];
            }
        }

        private WalletDaily() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit$WalletWeekly;", "Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit;", "<init>", "()V", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WalletWeekly extends LimitsPromptFlowContract$Limit {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WalletWeekly f101792a = new WalletWeekly();

        @NotNull
        public static final Parcelable.Creator<WalletWeekly> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WalletWeekly.f101792a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletWeekly[i];
            }
        }

        private WalletWeekly() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit$WalletYearly;", "Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowContract$Limit;", "<init>", "()V", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WalletYearly extends LimitsPromptFlowContract$Limit {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WalletYearly f101793a = new WalletYearly();

        @NotNull
        public static final Parcelable.Creator<WalletYearly> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WalletYearly.f101793a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletYearly[i];
            }
        }

        private WalletYearly() {
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

    private LimitsPromptFlowContract$Limit() {
    }
}
