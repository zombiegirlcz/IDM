package com.google.android.gms.location;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.identity.zzek;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private double f46457zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private double f46458zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private float f46459zzg;

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f46453zza = null;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        @TransitionTypes
        private int f46454zzb = 3;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private long f46455zzc = -1;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private short f46456zzd = -1;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private int f46460zzh = 0;

        /* JADX INFO: renamed from: zzi, reason: collision with root package name */
        private int f46461zzi = -1;

        @NonNull
        public Geofence build() {
            if (this.f46453zza == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i = this.f46454zzb;
            if (i == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i & 4) != 0 && this.f46461zzi < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
            if (this.f46455zzc == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.f46456zzd == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (this.f46460zzh >= 0) {
                return new zzek(this.f46453zza, this.f46454zzb, (short) 1, this.f46457zze, this.f46458zzf, this.f46459zzg, this.f46455zzc, this.f46460zzh, this.f46461zzi);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        @NonNull
        public Builder setCircularRegion(double d, double d5, float f) {
            boolean z = d >= -90.0d && d <= 90.0d;
            StringBuilder sb6 = new StringBuilder(String.valueOf(d).length() + 18);
            sb6.append("Invalid latitude: ");
            sb6.append(d);
            Preconditions.checkArgument(z, sb6.toString());
            boolean z3 = d5 >= -180.0d && d5 <= 180.0d;
            StringBuilder sb9 = new StringBuilder(String.valueOf(d5).length() + 19);
            sb9.append("Invalid longitude: ");
            sb9.append(d5);
            Preconditions.checkArgument(z3, sb9.toString());
            boolean z4 = f > BitmapDescriptorFactory.HUE_RED;
            StringBuilder sb10 = new StringBuilder(String.valueOf(f).length() + 16);
            sb10.append("Invalid radius: ");
            sb10.append(f);
            Preconditions.checkArgument(z4, sb10.toString());
            this.f46456zzd = (short) 1;
            this.f46457zze = d;
            this.f46458zzf = d5;
            this.f46459zzg = f;
            return this;
        }

        @NonNull
        public Builder setExpirationDuration(long j2) {
            if (j2 < 0) {
                this.f46455zzc = -1L;
                return this;
            }
            this.f46455zzc = DefaultClock.getInstance().elapsedRealtime() + j2;
            return this;
        }

        @NonNull
        public Builder setLoiteringDelay(int i) {
            this.f46461zzi = i;
            return this;
        }

        @NonNull
        public Builder setNotificationResponsiveness(int i) {
            this.f46460zzh = i;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull String str) {
            this.f46453zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public Builder setTransitionTypes(@TransitionTypes int i) {
            this.f46454zzb = i;
            return this;
        }
    }

    public @interface GeofenceTransition {
    }

    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    @NonNull
    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
