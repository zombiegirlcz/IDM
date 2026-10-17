package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final IBinder f38127zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionResult", id = 3)
    private final ConnectionResult f38128zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", id = 4)
    private final boolean f38129zad;

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", id = 5)
    private final boolean f38130zae;

    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z3) {
        this.zaa = i;
        this.f38127zab = iBinder;
        this.f38128zac = connectionResult;
        this.f38129zad = z;
        this.f38130zae = z3;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj2;
        return this.f38128zac.equals(zavVar.f38128zac) && Objects.equal(zab(), zavVar.zab());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f38127zab, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f38128zac, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f38129zad);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f38130zae);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f38128zac;
    }

    public final IAccountAccessor zab() {
        IBinder iBinder = this.f38127zab;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.f38129zad;
    }

    public final boolean zad() {
        return this.f38130zae;
    }
}
