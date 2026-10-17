package com.revolut.retail.feature.transfer.schedule.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import jli.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/transfer/schedule/models/TransferScheduleData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_schedule_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferScheduleData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TransferScheduleData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f104286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferScheduleEndsOn f104287c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferScheduleData(parcel.readLong(), c.valueOf(parcel.readString()), (TransferScheduleEndsOn) parcel.readParcelable(TransferScheduleData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferScheduleData[i];
        }
    }

    public TransferScheduleData() {
        this(0L, (c) null, 7);
    }

    public static TransferScheduleData a(TransferScheduleData transferScheduleData, long j2, c period, TransferScheduleEndsOn endsOn, int i) {
        if ((i & 1) != 0) {
            j2 = transferScheduleData.f104285a;
        }
        if ((i & 2) != 0) {
            period = transferScheduleData.f104286b;
        }
        if ((i & 4) != 0) {
            endsOn = transferScheduleData.f104287c;
        }
        transferScheduleData.getClass();
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(endsOn, "endsOn");
        return new TransferScheduleData(j2, period, endsOn);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferScheduleData)) {
            return false;
        }
        TransferScheduleData transferScheduleData = (TransferScheduleData) obj2;
        return this.f104285a == transferScheduleData.f104285a && this.f104286b == transferScheduleData.f104286b && Intrinsics.f(this.f104287c, transferScheduleData.f104287c);
    }

    public final int hashCode() {
        return this.f104287c.hashCode() + ((this.f104286b.hashCode() + (Long.hashCode(this.f104285a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f104285a);
        dest.writeString(this.f104286b.name());
        dest.writeParcelable(this.f104287c, i);
    }

    public TransferScheduleData(long j2, c period, TransferScheduleEndsOn endsOn) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(endsOn, "endsOn");
        this.f104285a = j2;
        this.f104286b = period;
        this.f104287c = endsOn;
    }

    public /* synthetic */ TransferScheduleData(long j2, c cVar, int i) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? c.PERIOD_SELECTION_NONE : cVar, TransferScheduleEndsOn.Never.f104289a);
    }
}
