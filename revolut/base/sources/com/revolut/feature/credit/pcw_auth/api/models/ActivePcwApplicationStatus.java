package com.revolut.feature.credit.pcw_auth.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/pcw_auth/api/models/ActivePcwApplicationStatus;", "Lcom/revolut/feature/credit/pcw_auth/api/models/PcwApplicationStatus;", "", "", "toString", "()Ljava/lang/String;", "feature_credit_pcw_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActivePcwApplicationStatus implements PcwApplicationStatus {

    @NotNull
    public static final Parcelable.Creator<ActivePcwApplicationStatus> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z95.a f70647c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActivePcwApplicationStatus(parcel.readString(), parcel.readString(), z95.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActivePcwApplicationStatus[i];
        }
    }

    public ActivePcwApplicationStatus(String applicationId, String ametistApplicationId, z95.a flowType) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(ametistApplicationId, "ametistApplicationId");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f70645a = applicationId;
        this.f70646b = ametistApplicationId;
        this.f70647c = flowType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActivePcwApplicationStatus)) {
            return false;
        }
        ActivePcwApplicationStatus activePcwApplicationStatus = (ActivePcwApplicationStatus) obj2;
        return Intrinsics.f(this.f70645a, activePcwApplicationStatus.f70645a) && Intrinsics.f(this.f70646b, activePcwApplicationStatus.f70646b) && this.f70647c == activePcwApplicationStatus.f70647c;
    }

    public final int hashCode() {
        return this.f70647c.hashCode() + p.a.c(this.f70645a.hashCode() * 31, 31, this.f70646b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70645a);
        dest.writeString(this.f70646b);
        dest.writeString(this.f70647c.name());
    }
}
