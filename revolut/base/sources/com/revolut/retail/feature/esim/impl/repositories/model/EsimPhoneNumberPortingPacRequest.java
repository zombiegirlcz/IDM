package com.revolut.retail.feature.esim.impl.repositories.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/repositories/model/EsimPhoneNumberPortingPacRequest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingPacRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingPacRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingPacScheduleRequest f100588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100589b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberPortingPacRequest(EsimPhoneNumberPortingPacScheduleRequest.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingPacRequest[i];
        }
    }

    public EsimPhoneNumberPortingPacRequest(EsimPhoneNumberPortingPacScheduleRequest schedule, String code) {
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f100588a = schedule;
        this.f100589b = code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingPacRequest)) {
            return false;
        }
        EsimPhoneNumberPortingPacRequest esimPhoneNumberPortingPacRequest = (EsimPhoneNumberPortingPacRequest) obj2;
        return Intrinsics.f(this.f100588a, esimPhoneNumberPortingPacRequest.f100588a) && Intrinsics.f(this.f100589b, esimPhoneNumberPortingPacRequest.f100589b);
    }

    public final int hashCode() {
        return this.f100589b.hashCode() + (this.f100588a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f100588a.writeToParcel(dest, i);
        dest.writeString(this.f100589b);
    }
}
