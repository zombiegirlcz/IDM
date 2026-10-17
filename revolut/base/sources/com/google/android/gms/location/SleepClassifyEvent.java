package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t61.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SleepClassifyEventCreator")
public class SleepClassifyEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzao();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimestampSec", id = 1)
    private final int f46526zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConfidence", id = 2)
    private final int f46527zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMotion", id = 3)
    private final int f46528zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLight", id = 4)
    private final int f46529zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNoise", id = 5)
    private final int f46530zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLightDiff", id = 6)
    private final int f46531zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNightOrDay", id = 7)
    private final int f46532zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConfidenceOverwrittenByAlarmClockTrigger", id = 8)
    private final boolean f46533zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceConfidence", id = 9)
    private final int f46534zzi;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepClassifyEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) int i6, @SafeParcelable.Param(id = 6) int i21, @SafeParcelable.Param(id = 7) int i22, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) int i32) {
        this.f46526zza = i;
        this.f46527zzb = i2;
        this.f46528zzc = i3;
        this.f46529zzd = i5;
        this.f46530zze = i6;
        this.f46531zzf = i21;
        this.f46532zzg = i22;
        this.f46533zzh = z;
        this.f46534zzi = i32;
    }

    @NonNull
    public static List<SleepClassifyEvent> extractEvents(@NonNull Intent intent) {
        ArrayList arrayList;
        Preconditions.checkNotNull(intent);
        if (hasEvents(intent) && (arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT")) != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                byte[] bArr = (byte[]) arrayList.get(i);
                Preconditions.checkNotNull(bArr);
                arrayList2.add((SleepClassifyEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
            }
            return Collections.unmodifiableList(arrayList2);
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj2;
        return this.f46526zza == sleepClassifyEvent.f46526zza && this.f46527zzb == sleepClassifyEvent.f46527zzb;
    }

    public int getConfidence() {
        return this.f46527zzb;
    }

    public int getLight() {
        return this.f46529zzd;
    }

    public int getMotion() {
        return this.f46528zzc;
    }

    public long getTimestampMillis() {
        return ((long) this.f46526zza) * 1000;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f46526zza), Integer.valueOf(this.f46527zzb));
    }

    @NonNull
    public String toString() {
        int i = this.f46526zza;
        int length = String.valueOf(i).length();
        int i2 = this.f46527zzb;
        int length2 = String.valueOf(i2).length();
        int i3 = this.f46528zzc;
        int length3 = String.valueOf(i3).length();
        int i5 = this.f46529zzd;
        StringBuilder sb6 = new StringBuilder(length + 6 + length2 + 8 + length3 + 7 + String.valueOf(i5).length());
        a.x(sb6, i, " Conf:", i2, " Motion:");
        sb6.append(i3);
        sb6.append(" Light:");
        sb6.append(i5);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int i2 = this.f46526zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, getConfidence());
        SafeParcelWriter.writeInt(parcel, 3, getMotion());
        SafeParcelWriter.writeInt(parcel, 4, getLight());
        SafeParcelWriter.writeInt(parcel, 5, this.f46530zze);
        SafeParcelWriter.writeInt(parcel, 6, this.f46531zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.f46532zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f46533zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.f46534zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
