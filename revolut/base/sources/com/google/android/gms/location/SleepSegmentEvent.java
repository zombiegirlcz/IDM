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

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SleepSegmentEventCreator")
@SafeParcelable.Reserved({1000})
public class SleepSegmentEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzap();
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL = 0;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 1)
    private final long f46535zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 2)
    private final long f46536zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatus", id = 3)
    private final int f46537zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMissingDataDurationMinutes", id = 4)
    private final int f46538zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNinetiethPctConfidence", id = 5)
    private final int f46539zze;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentEvent(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) long j3, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) int i3) {
        Preconditions.checkArgument(j2 <= j3, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f46535zza = j2;
        this.f46536zzb = j3;
        this.f46537zzc = i;
        this.f46538zzd = i2;
        this.f46539zze = i3;
    }

    @NonNull
    public static List<SleepSegmentEvent> extractEvents(@NonNull Intent intent) {
        ArrayList arrayList;
        Preconditions.checkNotNull(intent);
        if (hasEvents(intent) && (arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT")) != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                byte[] bArr = (byte[]) arrayList.get(i);
                Preconditions.checkNotNull(bArr);
                arrayList2.add((SleepSegmentEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
            }
            return Collections.unmodifiableList(arrayList2);
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj2;
            if (this.f46535zza == sleepSegmentEvent.getStartTimeMillis() && this.f46536zzb == sleepSegmentEvent.getEndTimeMillis() && this.f46537zzc == sleepSegmentEvent.getStatus() && this.f46538zzd == sleepSegmentEvent.f46538zzd && this.f46539zze == sleepSegmentEvent.f46539zze) {
                return true;
            }
        }
        return false;
    }

    public long getEndTimeMillis() {
        return this.f46536zzb;
    }

    public long getSegmentDurationMillis() {
        return this.f46536zzb - this.f46535zza;
    }

    public long getStartTimeMillis() {
        return this.f46535zza;
    }

    public int getStatus() {
        return this.f46537zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f46535zza), Long.valueOf(this.f46536zzb), Integer.valueOf(this.f46537zzc));
    }

    @NonNull
    public String toString() {
        long j2 = this.f46535zza;
        int length = String.valueOf(j2).length();
        long j3 = this.f46536zzb;
        int length2 = String.valueOf(j3).length();
        int i = this.f46537zzc;
        StringBuilder sb6 = new StringBuilder(length + 24 + length2 + 9 + String.valueOf(i).length());
        sb6.append("startMillis=");
        sb6.append(j2);
        sb6.append(", endMillis=");
        sb6.append(j3);
        sb6.append(", status=");
        sb6.append(i);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getStartTimeMillis());
        SafeParcelWriter.writeLong(parcel, 2, getEndTimeMillis());
        SafeParcelWriter.writeInt(parcel, 3, getStatus());
        SafeParcelWriter.writeInt(parcel, 4, this.f46538zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.f46539zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
