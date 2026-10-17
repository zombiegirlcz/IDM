package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionRefundProration;", "Landroid/os/Parcelable;", "DaysPassed", "DataUsage", "Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionRefundProration$DataUsage;", "Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionRefundProration$DaysPassed;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimSubscriptionRefundProration extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionRefundProration$DataUsage;", "Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionRefundProration;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataUsage implements EsimSubscriptionRefundProration {

        @NotNull
        public static final Parcelable.Creator<DataUsage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f100508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f100509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f100510c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DataUsage(parcel.readLong(), parcel.readLong(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DataUsage[i];
            }
        }

        public DataUsage(long j2, long j3, d dVar) {
            this.f100508a = j2;
            this.f100509b = j3;
            this.f100510c = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DataUsage)) {
                return false;
            }
            DataUsage dataUsage = (DataUsage) obj2;
            return this.f100508a == dataUsage.f100508a && this.f100509b == dataUsage.f100509b && Intrinsics.f(this.f100510c, dataUsage.f100510c);
        }

        public final int hashCode() {
            int iC = a0.d.c(Long.hashCode(this.f100508a) * 31, 31, this.f100509b);
            d dVar = this.f100510c;
            return iC + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f100508a);
            dest.writeLong(this.f100509b);
            dest.writeSerializable(this.f100510c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionRefundProration$DaysPassed;", "Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionRefundProration;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DaysPassed implements EsimSubscriptionRefundProration {

        @NotNull
        public static final Parcelable.Creator<DaysPassed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f100511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f100512b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DaysPassed(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DaysPassed[i];
            }
        }

        public DaysPassed(int i, int i2) {
            this.f100511a = i;
            this.f100512b = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DaysPassed)) {
                return false;
            }
            DaysPassed daysPassed = (DaysPassed) obj2;
            return this.f100511a == daysPassed.f100511a && this.f100512b == daysPassed.f100512b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f100512b) + (Integer.hashCode(this.f100511a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f100511a);
            dest.writeInt(this.f100512b);
        }
    }
}
