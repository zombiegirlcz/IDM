package com.revolut.retail.feature.esim.impl.repositories.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.z0;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/repositories/model/EsimPhoneNumberPortingPreferredScheduleRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingPreferredScheduleRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingPreferredScheduleRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f100594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f100595b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberPortingPreferredScheduleRequest(parcel.readInt() == 0 ? null : z0.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingPreferredScheduleRequest[i];
        }
    }

    public EsimPhoneNumberPortingPreferredScheduleRequest(z0 z0Var, LocalDate localDate) {
        this.f100594a = z0Var;
        this.f100595b = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingPreferredScheduleRequest)) {
            return false;
        }
        EsimPhoneNumberPortingPreferredScheduleRequest esimPhoneNumberPortingPreferredScheduleRequest = (EsimPhoneNumberPortingPreferredScheduleRequest) obj2;
        return this.f100594a == esimPhoneNumberPortingPreferredScheduleRequest.f100594a && Intrinsics.f(this.f100595b, esimPhoneNumberPortingPreferredScheduleRequest.f100595b);
    }

    public final int hashCode() {
        z0 z0Var = this.f100594a;
        int iHashCode = (z0Var == null ? 0 : z0Var.hashCode()) * 31;
        LocalDate localDate = this.f100595b;
        return iHashCode + (localDate != null ? localDate.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        z0 z0Var = this.f100594a;
        if (z0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(z0Var.name());
        }
        dest.writeSerializable(this.f100595b);
    }
}
