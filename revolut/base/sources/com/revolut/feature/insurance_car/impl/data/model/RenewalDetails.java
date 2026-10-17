package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/RenewalDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Status", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RenewalDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RenewalDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Status f75300b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/RenewalDetails$Status;", "Landroid/os/Parcelable;", "", "OFFERED", "SUSPENDED", "DECLINED", "DISMISSED", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Status implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<Status> CREATOR;
        public static final Status DECLINED;
        public static final Status DISMISSED;
        public static final Status OFFERED;
        public static final Status SUSPENDED;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Status.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Status[i];
            }
        }

        static {
            Status status = new Status("OFFERED", 0);
            OFFERED = status;
            Status status2 = new Status("SUSPENDED", 1);
            SUSPENDED = status2;
            Status status3 = new Status("DECLINED", 2);
            DECLINED = status3;
            Status status4 = new Status("DISMISSED", 3);
            DISMISSED = status4;
            Status[] statusArr = {status, status2, status3, status4};
            $VALUES = statusArr;
            $ENTRIES = s.n(statusArr);
            CREATOR = new a();
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RenewalDetails(parcel.readString(), Status.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RenewalDetails[i];
        }
    }

    public RenewalDetails(String applicationId, Status status) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f75299a = applicationId;
        this.f75300b = status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RenewalDetails)) {
            return false;
        }
        RenewalDetails renewalDetails = (RenewalDetails) obj2;
        return Intrinsics.f(this.f75299a, renewalDetails.f75299a) && this.f75300b == renewalDetails.f75300b;
    }

    public final int hashCode() {
        return this.f75300b.hashCode() + (this.f75299a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75299a);
        this.f75300b.writeToParcel(dest, i);
    }
}
