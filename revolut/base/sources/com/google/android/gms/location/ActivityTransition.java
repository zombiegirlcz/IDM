package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ActivityTransitionCreator")
@SafeParcelable.Reserved({1000})
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;

    @NonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zze();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getActivityType", id = 1)
    private final int f46403zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransitionType", id = 2)
    private final int f46404zzb;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private int f46405zza = -1;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f46406zzb = -1;

        @NonNull
        public ActivityTransition build() {
            Preconditions.checkState(this.f46405zza != -1, "Activity type not set.");
            Preconditions.checkState(this.f46406zzb != -1, "Activity transition type not set.");
            return new ActivityTransition(this.f46405zza, this.f46406zzb);
        }

        @NonNull
        public Builder setActivityTransition(int i) {
            ActivityTransition.zza(i);
            this.f46406zzb = i;
            return this;
        }

        @NonNull
        public Builder setActivityType(int i) {
            this.f46405zza = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    @SafeParcelable.Constructor
    public ActivityTransition(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.f46403zza = i;
        this.f46404zzb = i2;
    }

    public static void zza(int i) {
        boolean z = false;
        if (i >= 0 && i <= 1) {
            z = true;
        }
        StringBuilder sb6 = new StringBuilder(String.valueOf(i).length() + 30);
        sb6.append("Transition type ");
        sb6.append(i);
        sb6.append(" is not valid.");
        Preconditions.checkArgument(z, sb6.toString());
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj2;
        return this.f46403zza == activityTransition.f46403zza && this.f46404zzb == activityTransition.f46404zzb;
    }

    public int getActivityType() {
        return this.f46403zza;
    }

    public int getTransitionType() {
        return this.f46404zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f46403zza), Integer.valueOf(this.f46404zzb));
    }

    @NonNull
    public String toString() {
        int i = this.f46403zza;
        int length = String.valueOf(i).length();
        int i2 = this.f46404zzb;
        StringBuilder sb6 = new StringBuilder(length + 52 + String.valueOf(i2).length() + 1);
        sb6.append("ActivityTransition [mActivityType=");
        sb6.append(i);
        sb6.append(", mTransitionType=");
        sb6.append(i2);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
