package com.revolut.feature.credit.forbearance.application.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/api/models/ForbearanceApplicationPayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_forbearance_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ForbearanceApplicationPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ForbearanceApplicationPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gs3.a f69921c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ForbearanceApplicationPayload(parcel.readString(), parcel.readString(), gs3.a.valueOf(parcel.readString()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ForbearanceApplicationPayload[i];
        }
    }

    public ForbearanceApplicationPayload(String facilityId, String applicationId, gs3.a forbearanceType, b bVar) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(forbearanceType, "forbearanceType");
        this.f69919a = facilityId;
        this.f69920b = applicationId;
        this.f69921c = forbearanceType;
        this.d = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ForbearanceApplicationPayload)) {
            return false;
        }
        ForbearanceApplicationPayload forbearanceApplicationPayload = (ForbearanceApplicationPayload) obj2;
        return Intrinsics.f(this.f69919a, forbearanceApplicationPayload.f69919a) && Intrinsics.f(this.f69920b, forbearanceApplicationPayload.f69920b) && this.f69921c == forbearanceApplicationPayload.f69921c && Intrinsics.f(this.d, forbearanceApplicationPayload.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f69921c.hashCode() + p.a.c(this.f69919a.hashCode() * 31, 31, this.f69920b)) * 31;
        b bVar = this.d;
        return iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69919a);
        dest.writeString(this.f69920b);
        dest.writeString(this.f69921c.name());
        dest.writeSerializable(this.d);
    }
}
