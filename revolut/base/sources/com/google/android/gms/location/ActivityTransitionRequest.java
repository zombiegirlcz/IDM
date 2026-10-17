package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import j6.a;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ActivityTransitionRequestCreator")
@SafeParcelable.Reserved({1000})
public class ActivityTransitionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new zzh();

    @NonNull
    public static final Comparator<ActivityTransition> IS_SAME_TRANSITION = new zzg();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActivityTransitions", id = 1)
    private final List f46410zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTag", id = 2)
    private final String f46411zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getClients", id = 3)
    private final List f46412zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getContextAttributionTag", id = 4)
    private String f46413zzd;

    public ActivityTransitionRequest(@NonNull List<ActivityTransition> list) {
        this(list, null, null, null);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && getClass() == obj2.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj2;
            if (Objects.equal(this.f46410zza, activityTransitionRequest.f46410zza) && Objects.equal(this.f46411zzb, activityTransitionRequest.f46411zzb) && Objects.equal(this.f46413zzd, activityTransitionRequest.f46413zzd) && Objects.equal(this.f46412zzc, activityTransitionRequest.f46412zzc)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f46410zza.hashCode() * 31;
        String str = this.f46411zzb;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f46412zzc;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f46413zzd;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public void serializeToIntentExtra(@NonNull Intent intent) {
        Preconditions.checkNotNull(intent);
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    @NonNull
    public String toString() {
        List list = this.f46412zzc;
        String strValueOf = String.valueOf(this.f46410zza);
        String strValueOf2 = String.valueOf(list);
        String str = this.f46413zzd;
        int length = strValueOf.length();
        String str2 = this.f46411zzb;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb6 = new StringBuilder(length + 48 + length2 + 12 + strValueOf2.length() + 18 + String.valueOf(str).length() + 1);
        a.D(sb6, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str2);
        a.D(sb6, "', mClients=", strValueOf2, ", mAttributionTag=", str);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        List list = this.f46410zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46411zzb, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f46412zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f46413zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final ActivityTransitionRequest zza(String str) {
        this.f46413zzd = str;
        return this;
    }

    @SafeParcelable.Constructor
    public ActivityTransitionRequest(@NonNull @SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) List list2, @SafeParcelable.Param(id = 4) String str2) {
        Preconditions.checkNotNull(list, "transitions can't be null");
        Preconditions.checkArgument(!list.isEmpty(), "transitions can't be empty.");
        Preconditions.checkNotNull(list);
        TreeSet treeSet = new TreeSet(IS_SAME_TRANSITION);
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it8.next();
            Preconditions.checkArgument(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.f46410zza = Collections.unmodifiableList(list);
        this.f46411zzb = str;
        this.f46412zzc = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f46413zzd = str2;
    }
}
