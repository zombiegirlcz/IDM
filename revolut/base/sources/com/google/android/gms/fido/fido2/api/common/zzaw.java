package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SimpleTransactionAuthorizationExtensionCreator")
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTxAuthSimple", id = 1)
    private final String f38630zza;

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(id = 1) String str) {
        this.f38630zza = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzaw) {
            return Objects.equal(this.f38630zza, ((zzaw) obj2).f38630zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f38630zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f38630zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
