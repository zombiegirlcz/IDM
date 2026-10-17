package com.revolut.feature.support.impl.transfer_tracker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalOutcome;", "Landroid/os/Parcelable;", "<init>", "()V", "WithinTimeframe", "AfterTimeframe", "Unsupported", "Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalOutcome$AfterTimeframe;", "Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalOutcome$Unsupported;", "Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalOutcome$WithinTimeframe;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferArrivalOutcome implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalOutcome$AfterTimeframe;", "Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalOutcome;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AfterTimeframe extends TransferArrivalOutcome {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AfterTimeframe f89378a = new AfterTimeframe();

        @NotNull
        public static final Parcelable.Creator<AfterTimeframe> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AfterTimeframe.f89378a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AfterTimeframe[i];
            }
        }

        private AfterTimeframe() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalOutcome$Unsupported;", "Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalOutcome;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unsupported extends TransferArrivalOutcome {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsupported f89379a = new Unsupported();

        @NotNull
        public static final Parcelable.Creator<Unsupported> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unsupported.f89379a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unsupported[i];
            }
        }

        private Unsupported() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalOutcome$WithinTimeframe;", "Lcom/revolut/feature/support/impl/transfer_tracker/domain/model/TransferArrivalOutcome;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithinTimeframe extends TransferArrivalOutcome {

        @NotNull
        public static final Parcelable.Creator<WithinTimeframe> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Estimation f89380a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithinTimeframe(Estimation.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithinTimeframe[i];
            }
        }

        public WithinTimeframe(Estimation estimation) {
            Intrinsics.checkNotNullParameter(estimation, "estimation");
            this.f89380a = estimation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithinTimeframe) && Intrinsics.f(this.f89380a, ((WithinTimeframe) obj2).f89380a);
        }

        public final int hashCode() {
            return this.f89380a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f89380a.writeToParcel(dest, i);
        }
    }

    private TransferArrivalOutcome() {
    }
}
