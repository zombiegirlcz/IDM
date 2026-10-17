package com.revolut.shared.feature.offboarding.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/offboarding/api/domain/model/OffboardingRestriction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_offboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OffboardingRestriction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OffboardingRestriction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104873b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OffboardingRestriction(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OffboardingRestriction[i];
        }
    }

    public OffboardingRestriction(String title, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f104872a = title;
        this.f104873b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OffboardingRestriction)) {
            return false;
        }
        OffboardingRestriction offboardingRestriction = (OffboardingRestriction) obj2;
        return Intrinsics.f(this.f104872a, offboardingRestriction.f104872a) && this.f104873b == offboardingRestriction.f104873b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104873b) + (this.f104872a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104872a);
        dest.writeInt(this.f104873b);
    }
}
