package com.revolut.feature.insurance.api.models.cfac;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/cfac/CFACClaimCancellationFile;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimCancellationFile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimCancellationFile> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74939c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CFACClaimCancellationFile(parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimCancellationFile[i];
        }
    }

    public CFACClaimCancellationFile(String id10, String name, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f74937a = id10;
        this.f74938b = name;
        this.f74939c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimCancellationFile)) {
            return false;
        }
        CFACClaimCancellationFile cFACClaimCancellationFile = (CFACClaimCancellationFile) obj2;
        return Intrinsics.f(this.f74937a, cFACClaimCancellationFile.f74937a) && Intrinsics.f(this.f74938b, cFACClaimCancellationFile.f74938b) && this.f74939c == cFACClaimCancellationFile.f74939c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f74939c) + p.a.c(this.f74937a.hashCode() * 31, 31, this.f74938b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74937a);
        dest.writeString(this.f74938b);
        dest.writeLong(this.f74939c);
    }
}
