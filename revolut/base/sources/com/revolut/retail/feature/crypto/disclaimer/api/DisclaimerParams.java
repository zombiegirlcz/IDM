package com.revolut.retail.feature.crypto.disclaimer.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.user.UserCompanyRegion;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/crypto/disclaimer/api/DisclaimerParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_crypto_disclaimer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DisclaimerParams implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCompanyRegion f100019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f100020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100021c;
    public final boolean d;

    @NotNull
    public static final Parcelable.Creator<DisclaimerParams> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisclaimerParams(UserCompanyRegion.valueOf(parcel.readString()), (wi0.b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DisclaimerParams[i];
        }
    }

    public DisclaimerParams(UserCompanyRegion userCompanyRegion, wi0.b countryCode, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(userCompanyRegion, "userCompanyRegion");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f100019a = userCompanyRegion;
        this.f100020b = countryCode;
        this.f100021c = z;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DisclaimerParams)) {
            return false;
        }
        DisclaimerParams disclaimerParams = (DisclaimerParams) obj2;
        return this.f100019a == disclaimerParams.f100019a && Intrinsics.f(this.f100020b, disclaimerParams.f100020b) && this.f100021c == disclaimerParams.f100021c && this.d == disclaimerParams.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a.c(p.a.c(this.f100019a.hashCode() * 31, 31, this.f100020b.f297794a), 31, this.f100021c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100019a.name());
        dest.writeSerializable(this.f100020b);
        dest.writeInt(this.f100021c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }
}
