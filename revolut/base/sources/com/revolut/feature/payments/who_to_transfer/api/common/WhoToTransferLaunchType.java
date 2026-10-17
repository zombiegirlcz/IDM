package com.revolut.feature.payments.who_to_transfer.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferLaunchType;", "Landroid/os/Parcelable;", "<init>", "()V", "FullApp", "LiteApp", "Freelancer", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferLaunchType$Freelancer;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferLaunchType$FullApp;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferLaunchType$LiteApp;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WhoToTransferLaunchType implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferLaunchType$Freelancer;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferLaunchType;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Freelancer extends WhoToTransferLaunchType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Freelancer f80006a = new Freelancer();

        @NotNull
        public static final Parcelable.Creator<Freelancer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Freelancer.f80006a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Freelancer[i];
            }
        }

        private Freelancer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferLaunchType$FullApp;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferLaunchType;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/payments/who_to_transfer/api/common/b", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FullApp extends WhoToTransferLaunchType {

        @NotNull
        public static final Parcelable.Creator<FullApp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f80007a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FullApp(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FullApp[i];
            }
        }

        public FullApp() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FullApp) && this.f80007a == ((FullApp) obj2).f80007a;
        }

        public final int hashCode() {
            return this.f80007a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80007a.name());
        }

        public FullApp(b mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f80007a = mode;
        }

        public /* synthetic */ FullApp(int i) {
            this(b.TRANSFER);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferLaunchType$LiteApp;", "Lcom/revolut/feature/payments/who_to_transfer/api/common/WhoToTransferLaunchType;", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LiteApp extends WhoToTransferLaunchType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LiteApp f80008a = new LiteApp();

        @NotNull
        public static final Parcelable.Creator<LiteApp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LiteApp.f80008a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LiteApp[i];
            }
        }

        private LiteApp() {
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

    private WhoToTransferLaunchType() {
    }
}
