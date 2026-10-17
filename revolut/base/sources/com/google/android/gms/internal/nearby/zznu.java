package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "CastIdentityCreator")
public final class zznu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznu> CREATOR = new zznv();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String f45527zza;

    @SafeParcelable.Constructor
    public zznu(@SafeParcelable.Param(id = 1) String str) {
        Preconditions.checkArgument(str.length() <= 32, "Cast id should be at most 32 characters.");
        this.f45527zza = str;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zznu)) {
            return false;
        }
        String str = this.f45527zza;
        String str2 = ((zznu) obj2).f45527zza;
        if (str != str2) {
            return str != null && str.equals(str2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{17, this.f45527zza});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return a.p("DataElement<type: CastId, Id: ", this.f45527zza, ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f45527zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
