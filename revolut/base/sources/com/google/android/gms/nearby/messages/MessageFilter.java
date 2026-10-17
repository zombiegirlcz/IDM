package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zznk;
import com.google.android.gms.nearby.messages.internal.zzac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "MessageFilterCreator")
public class MessageFilter extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MessageFilter> CREATOR = new zzb();

    @NonNull
    public static final MessageFilter INCLUDE_ALL_MY_TYPES;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    final int f48016zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessageTypes", id = 1)
    private final List f48017zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceFilters", id = 2)
    private final List f48018zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIncludeAllMyTypes", id = 3)
    private final boolean f48019zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBleFilters", id = 4)
    private final List f48020zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNumRawAudioBytes", id = 5)
    private final int f48021zzf;

    public static final class Builder {

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private boolean f48025zzd;

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final Set f48022zza = new HashSet();

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private final List f48023zzb = new ArrayList();

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private final Set f48024zzc = new HashSet();

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private int f48026zze = 0;

        private final Builder zza(String str, String str2) {
            this.f48022zza.add(new zzac(str, str2));
            return this;
        }

        @NonNull
        public MessageFilter build() {
            boolean z = true;
            if (!this.f48025zzd && this.f48022zza.isEmpty()) {
                z = false;
            }
            Preconditions.checkState(z, "At least one of the include methods must be called.");
            return new MessageFilter(2, new ArrayList(this.f48022zza), this.f48023zzb, this.f48025zzd, new ArrayList(this.f48024zzc), this.f48026zze);
        }

        @NonNull
        public Builder includeAllMyTypes() {
            this.f48025zzd = true;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder includeAudioBytes(int i) {
            Preconditions.checkArgument(this.f48026zze == 0, "includeAudioBytes() can only be called once per MessageFilter instance.");
            Preconditions.checkArgument(i > 0, "Invalid value for numAudioBytes: " + i);
            Preconditions.checkArgument(i <= 10, "numAudioBytes is capped by AudioBytes.MAX_SIZE = 10");
            zza("__reserved_namespace", "__audio_bytes");
            this.f48026zze = i;
            return this;
        }

        @NonNull
        public Builder includeEddystoneUids(@NonNull String str, String str2) {
            zza("__reserved_namespace", "__eddystone_uid");
            this.f48023zzb.add(zznk.zza(str, str2));
            return this;
        }

        @NonNull
        public Builder includeFilter(@NonNull MessageFilter messageFilter) {
            this.f48022zza.addAll(messageFilter.zzc());
            this.f48023zzb.addAll(messageFilter.zzb());
            this.f48024zzc.addAll(messageFilter.zza());
            this.f48025zzd = messageFilter.zzd() | this.f48025zzd;
            return this;
        }

        @NonNull
        public Builder includeIBeaconIds(@NonNull UUID uuid, Short sh10, Short sh11) {
            zza("__reserved_namespace", "__i_beacon_id");
            this.f48023zzb.add(zznk.zzb(uuid, sh10, sh11));
            return this;
        }

        @NonNull
        public Builder includeNamespacedType(@NonNull String str, @NonNull String str2) {
            Preconditions.checkArgument((str == null || str.isEmpty() || str.contains("*")) ? false : true, "namespace(%s) cannot be null, empty or contain (*).", str);
            Preconditions.checkArgument((str2 == null || str2.contains("*")) ? false : true, "type(%s) cannot be null or contain (*).", str2);
            zza(str, str2);
            return this;
        }
    }

    static {
        Builder builder = new Builder();
        builder.includeAllMyTypes();
        INCLUDE_ALL_MY_TYPES = builder.build();
    }

    @SafeParcelable.Constructor
    public MessageFilter(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) List list2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) List list3, @SafeParcelable.Param(id = 5) int i2) {
        this.f48016zza = i;
        this.f48017zzb = Collections.unmodifiableList((List) Preconditions.checkNotNull(list));
        this.f48019zzd = z;
        this.f48018zzc = Collections.unmodifiableList(list2 == null ? Collections.EMPTY_LIST : list2);
        this.f48020zze = Collections.unmodifiableList(list3 == null ? Collections.EMPTY_LIST : list3);
        this.f48021zzf = i2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj2;
        return this.f48019zzd == messageFilter.f48019zzd && Objects.equal(this.f48017zzb, messageFilter.f48017zzb) && Objects.equal(this.f48018zzc, messageFilter.f48018zzc) && Objects.equal(this.f48020zze, messageFilter.f48020zze);
    }

    public int hashCode() {
        return Objects.hashCode(this.f48017zzb, this.f48018zzc, Boolean.valueOf(this.f48019zzd), this.f48020zze);
    }

    @NonNull
    public String toString() {
        return "MessageFilter{includeAllMyTypes=" + this.f48019zzd + ", messageTypes=" + String.valueOf(this.f48017zzb) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        List list = this.f48017zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f48018zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f48019zzd);
        SafeParcelWriter.writeTypedList(parcel, 4, this.f48020zze, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f48021zzf);
        SafeParcelWriter.writeInt(parcel, 1000, this.f48016zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final List zza() {
        return this.f48020zze;
    }

    public final List zzb() {
        return this.f48018zzc;
    }

    @NonNull
    public final List zzc() {
        return this.f48017zzb;
    }

    public final boolean zzd() {
        return this.f48019zzd;
    }
}
