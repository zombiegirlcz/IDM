package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/Referrer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Referrer implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81772b;

    @NotNull
    public static final Parcelable.Creator<Referrer> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Referrer(((RegisteredIdentityId) parcel.readParcelable(Referrer.class.getClassLoader())).f74764a, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Referrer[i];
        }
    }

    public Referrer(String registeredIdentityId, String firstName) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f81771a = registeredIdentityId;
        this.f81772b = firstName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Referrer)) {
            return false;
        }
        Referrer referrer = (Referrer) obj2;
        return Intrinsics.f(this.f81771a, referrer.f81771a) && Intrinsics.f(this.f81772b, referrer.f81772b);
    }

    public final int hashCode() {
        return this.f81772b.hashCode() + (this.f81771a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        e.x(this.f81771a, dest, i);
        dest.writeString(this.f81772b);
    }
}
