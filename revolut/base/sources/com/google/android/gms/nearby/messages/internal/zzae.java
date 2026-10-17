package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Message;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "MessageWrapperCreator")
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    final int f48090zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    public final Message f48091zzb;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) Message message) {
        this.f48090zza = i;
        this.f48091zzb = (Message) Preconditions.checkNotNull(message);
    }

    public static final zzae zza(Message message) {
        return new zzae(1, message);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzae) {
            return Objects.equal(this.f48091zzb, ((zzae) obj2).f48091zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48091zzb);
    }

    public final String toString() {
        return a.p("MessageWrapper{message=", this.f48091zzb.toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Message message = this.f48091zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, message, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f48090zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
