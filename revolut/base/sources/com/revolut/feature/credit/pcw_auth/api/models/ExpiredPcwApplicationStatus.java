package com.revolut.feature.credit.pcw_auth.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/pcw_auth/api/models/ExpiredPcwApplicationStatus;", "Lcom/revolut/feature/credit/pcw_auth/api/models/PcwApplicationStatus;", "", "", "toString", "()Ljava/lang/String;", "feature_credit_pcw_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpiredPcwApplicationStatus implements PcwApplicationStatus {

    @NotNull
    public static final Parcelable.Creator<ExpiredPcwApplicationStatus> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z95.a f70650c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExpiredPcwApplicationStatus(parcel.readString(), parcel.readString(), z95.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExpiredPcwApplicationStatus[i];
        }
    }

    public ExpiredPcwApplicationStatus(String applicationId, String ametistApplicationId, z95.a flowType) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(ametistApplicationId, "ametistApplicationId");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f70648a = applicationId;
        this.f70649b = ametistApplicationId;
        this.f70650c = flowType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExpiredPcwApplicationStatus)) {
            return false;
        }
        ExpiredPcwApplicationStatus expiredPcwApplicationStatus = (ExpiredPcwApplicationStatus) obj2;
        return Intrinsics.f(this.f70648a, expiredPcwApplicationStatus.f70648a) && Intrinsics.f(this.f70649b, expiredPcwApplicationStatus.f70649b) && this.f70650c == expiredPcwApplicationStatus.f70650c;
    }

    public final int hashCode() {
        return this.f70650c.hashCode() + p.a.c(this.f70648a.hashCode() * 31, 31, this.f70649b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70648a);
        dest.writeString(this.f70649b);
        dest.writeString(this.f70650c.name());
    }
}
