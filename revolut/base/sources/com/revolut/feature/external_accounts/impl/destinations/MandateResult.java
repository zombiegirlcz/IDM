package com.revolut.feature.external_accounts.impl.destinations;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/destinations/MandateResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MandateResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MandateResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f72364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f72366c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            return new MandateResult((d) parcel.readSerializable(), parcel.readString(), z, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MandateResult[i];
        }
    }

    public MandateResult(d dVar, String mandateId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        this.f72364a = z;
        this.f72365b = mandateId;
        this.f72366c = dVar;
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
        if (!(obj2 instanceof MandateResult)) {
            return false;
        }
        MandateResult mandateResult = (MandateResult) obj2;
        return this.f72364a == mandateResult.f72364a && Intrinsics.f(this.f72365b, mandateResult.f72365b) && Intrinsics.f(this.f72366c, mandateResult.f72366c) && this.d == mandateResult.d;
    }

    public final int hashCode() {
        int iC = p.a.c(Boolean.hashCode(this.f72364a) * 31, 31, this.f72365b);
        d dVar = this.f72366c;
        return Boolean.hashCode(this.d) + ((iC + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f72364a ? 1 : 0);
        dest.writeString(this.f72365b);
        dest.writeSerializable(this.f72366c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
