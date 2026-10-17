package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CableAuthenticationExtensionCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getCableAuthentication", id = 1)
    private final List f38639zza;

    @SafeParcelable.Constructor
    public zzs(@NonNull @SafeParcelable.Param(id = 1) List list) {
        this.f38639zza = (List) Preconditions.checkNotNull(list);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj2;
        return this.f38639zza.containsAll(zzsVar.f38639zza) && zzsVar.f38639zza.containsAll(this.f38639zza);
    }

    public final int hashCode() {
        return Objects.hashCode(new HashSet(this.f38639zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.f38639zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
