package com.revolut.feature.check_topup.impl.ui_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.check_topup.api.data.SDKScanResult;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Permissions", "Scan", "Review", "Lcom/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlowContract$Step$Permissions;", "Lcom/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlowContract$Step$Review;", "Lcom/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlowContract$Step$Scan;", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CheckTopUpFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlowContract$Step$Permissions;", "Lcom/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlowContract$Step;", "<init>", "()V", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Permissions implements CheckTopUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Permissions f65768a = new Permissions();

        @NotNull
        public static final Parcelable.Creator<Permissions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Permissions.f65768a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Permissions[i];
            }
        }

        private Permissions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlowContract$Step$Review;", "Lcom/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements CheckTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SDKScanResult f65769a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review((SDKScanResult) parcel.readParcelable(Review.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(SDKScanResult scanResult) {
            Intrinsics.checkNotNullParameter(scanResult, "scanResult");
            this.f65769a = scanResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Review) && Intrinsics.f(this.f65769a, ((Review) obj2).f65769a);
        }

        public final int hashCode() {
            return this.f65769a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65769a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlowContract$Step$Scan;", "Lcom/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlowContract$Step;", "<init>", "()V", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Scan implements CheckTopUpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Scan f65770a = new Scan();

        @NotNull
        public static final Parcelable.Creator<Scan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Scan.f65770a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scan[i];
            }
        }

        private Scan() {
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
