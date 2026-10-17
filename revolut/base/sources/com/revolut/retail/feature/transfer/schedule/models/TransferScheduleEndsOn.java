package com.revolut.retail.feature.transfer.schedule.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/transfer/schedule/models/TransferScheduleEndsOn;", "Landroid/os/Parcelable;", "Never", "Date", "Lcom/revolut/retail/feature/transfer/schedule/models/TransferScheduleEndsOn$Date;", "Lcom/revolut/retail/feature/transfer/schedule/models/TransferScheduleEndsOn$Never;", "feature_transfer_schedule_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferScheduleEndsOn extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/transfer/schedule/models/TransferScheduleEndsOn$Date;", "Lcom/revolut/retail/feature/transfer/schedule/models/TransferScheduleEndsOn;", "", "toString", "()Ljava/lang/String;", "feature_transfer_schedule_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Date implements TransferScheduleEndsOn {

        @NotNull
        public static final Parcelable.Creator<Date> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f104288a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Date(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Date[i];
            }
        }

        public Date(long j2) {
            this.f104288a = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Date) && this.f104288a == ((Date) obj2).f104288a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f104288a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f104288a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/transfer/schedule/models/TransferScheduleEndsOn$Never;", "Lcom/revolut/retail/feature/transfer/schedule/models/TransferScheduleEndsOn;", "<init>", "()V", "feature_transfer_schedule_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Never implements TransferScheduleEndsOn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Never f104289a = new Never();

        @NotNull
        public static final Parcelable.Creator<Never> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Never.f104289a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Never[i];
            }
        }

        private Never() {
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
