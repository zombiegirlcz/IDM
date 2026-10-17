package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.zzek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({3, 1000})
public class GeofencingRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzp();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getParcelableGeofences", id = 1)
    private final List f46466zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @InitialTrigger
    @SafeParcelable.Field(getter = "getInitialTrigger", id = 2)
    private final int f46467zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttributionTag", id = 4)
    private final String f46468zzc;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final List f46469zza = new ArrayList();

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        @InitialTrigger
        private int f46470zzb = 5;

        @NonNull
        public Builder addGeofence(@NonNull Geofence geofence) {
            Preconditions.checkArgument(geofence instanceof zzek, "Geofence must be created using Geofence.Builder.");
            this.f46469zza.add((zzek) geofence);
            return this;
        }

        @NonNull
        public Builder addGeofences(@NonNull List<? extends Geofence> list) {
            Iterator<? extends Geofence> it8 = list.iterator();
            while (it8.hasNext()) {
                addGeofence(it8.next());
            }
            return this;
        }

        @NonNull
        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.f46469zza.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(new ArrayList(this.f46469zza), this.f46470zzb, null);
        }

        @NonNull
        public Builder setInitialTrigger(@InitialTrigger int i) {
            this.f46470zzb = i & 7;
            return this;
        }
    }

    public @interface InitialTrigger {
    }

    @SafeParcelable.Constructor
    public GeofencingRequest(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) @InitialTrigger int i, @SafeParcelable.Param(id = 4) String str) {
        this.f46466zza = list;
        this.f46467zzb = i;
        this.f46468zzc = str;
    }

    @NonNull
    public List<Geofence> getGeofences() {
        return new ArrayList(this.f46466zza);
    }

    @InitialTrigger
    public int getInitialTrigger() {
        return this.f46467zzb;
    }

    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(this.f46466zza);
        int length = strValueOf.length();
        int i = this.f46467zzb;
        StringBuilder sb6 = new StringBuilder(length + 45 + String.valueOf(i).length() + 1);
        sb6.append("GeofencingRequest[geofences=");
        sb6.append(strValueOf);
        sb6.append(", initialTrigger=");
        sb6.append(i);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        List list = this.f46466zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 4, this.f46468zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
