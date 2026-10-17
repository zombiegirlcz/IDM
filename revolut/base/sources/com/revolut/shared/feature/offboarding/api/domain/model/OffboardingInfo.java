package com.revolut.shared.feature.offboarding.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/offboarding/api/domain/model/OffboardingInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_offboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OffboardingInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OffboardingInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104871b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OffboardingInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OffboardingInfo[i];
        }
    }

    public OffboardingInfo(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f104870a = title;
        this.f104871b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OffboardingInfo)) {
            return false;
        }
        OffboardingInfo offboardingInfo = (OffboardingInfo) obj2;
        return Intrinsics.f(this.f104870a, offboardingInfo.f104870a) && Intrinsics.f(this.f104871b, offboardingInfo.f104871b);
    }

    public final int hashCode() {
        return this.f104871b.hashCode() + (this.f104870a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104870a);
        dest.writeString(this.f104871b);
    }
}
