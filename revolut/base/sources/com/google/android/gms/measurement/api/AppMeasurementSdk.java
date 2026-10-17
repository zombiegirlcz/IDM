package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.measurement.internal.zzkb;
import com.google.android.gms.measurement.internal.zzkc;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzff f46832zza;

    /* JADX INFO: loaded from: classes16.dex */
    @KeepForSdk
    public static final class ConditionalUserProperty {

        @NonNull
        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";

        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";

        @NonNull
        @KeepForSdk
        public static final String ACTIVE = "active";

        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";

        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";

        @NonNull
        @KeepForSdk
        public static final String VALUE = "value";

        @NonNull
        @KeepForSdk
        public static final String TIME_TO_LIVE = "time_to_live";

        @NonNull
        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";

        @NonNull
        @KeepForSdk
        public static final String NAME = "name";

        @NonNull
        @KeepForSdk
        public static final String ORIGIN = "origin";

        @NonNull
        @KeepForSdk
        public static final String CREATION_TIMESTAMP = "creation_timestamp";

        @NonNull
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";

        @NonNull
        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";

        @NonNull
        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";

        @NonNull
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";

        private ConditionalUserProperty() {
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzkb {
        @Override // com.google.android.gms.measurement.internal.zzkb
        @ShowFirstParty
        @KeepForSdk
        void interceptEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j2);
    }

    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzkc {
        @Override // com.google.android.gms.measurement.internal.zzkc
        @ShowFirstParty
        @KeepForSdk
        void onEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j2);
    }

    public AppMeasurementSdk(zzff zzffVar) {
        this.f46832zza = zzffVar;
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurementSdk getInstance(@NonNull Context context) {
        return zzff.zzg(context, null, null, null, null).zzd();
    }

    @KeepForSdk
    public void beginAdUnitExposure(@NonNull String str) {
        this.f46832zza.zzv(str);
    }

    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull String str, String str2, Bundle bundle) {
        this.f46832zza.zzw(str, str2, bundle);
    }

    @KeepForSdk
    public void endAdUnitExposure(@NonNull String str) {
        this.f46832zza.zzx(str);
    }

    @KeepForSdk
    public long generateEventId() {
        return this.f46832zza.zzb();
    }

    @KeepForSdk
    public String getAppIdOrigin() {
        return this.f46832zza.zzk();
    }

    @KeepForSdk
    public String getAppInstanceId() {
        return this.f46832zza.zzm();
    }

    @NonNull
    @KeepForSdk
    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.f46832zza.zzq(str, str2);
    }

    @KeepForSdk
    public String getCurrentScreenClass() {
        return this.f46832zza.zzn();
    }

    @KeepForSdk
    public String getCurrentScreenName() {
        return this.f46832zza.zzo();
    }

    @KeepForSdk
    public String getGmpAppId() {
        return this.f46832zza.zzp();
    }

    @KeepForSdk
    public int getMaxUserProperties(@NonNull String str) {
        return this.f46832zza.zza(str);
    }

    @NonNull
    @KeepForSdk
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f46832zza.zzr(str, str2, z);
    }

    @KeepForSdk
    public void logEvent(@NonNull String str, @NonNull String str2, Bundle bundle) {
        this.f46832zza.zzz(str, str2, bundle);
    }

    @KeepForSdk
    public void logEventNoInterceptor(@NonNull String str, @NonNull String str2, Bundle bundle, long j2) {
        this.f46832zza.zzA(str, str2, bundle, j2);
    }

    @KeepForSdk
    public void performAction(@NonNull Bundle bundle) {
        this.f46832zza.zzc(bundle, false);
    }

    @KeepForSdk
    public Bundle performActionWithResponse(@NonNull Bundle bundle) {
        return this.f46832zza.zzc(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(@NonNull OnEventListener onEventListener) {
        this.f46832zza.zzC(onEventListener);
    }

    @KeepForSdk
    public void setConditionalUserProperty(@NonNull Bundle bundle) {
        this.f46832zza.zzF(bundle);
    }

    @KeepForSdk
    @Deprecated
    public void setConsent(@NonNull Bundle bundle) {
    }

    @KeepForSdk
    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.f46832zza.zzH(zzdj.zza(activity), str, str2);
    }

    @ShowFirstParty
    @KeepForSdk
    public void setEventInterceptor(@NonNull EventInterceptor eventInterceptor) {
        this.f46832zza.zzK(eventInterceptor);
    }

    @KeepForSdk
    @Deprecated
    public void setMeasurementEnabled(Boolean bool) {
    }

    @KeepForSdk
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj2) {
        this.f46832zza.zzP(str, str2, obj2, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(@NonNull OnEventListener onEventListener) {
        this.f46832zza.zzQ(onEventListener);
    }

    public final void zza(boolean z) {
        this.f46832zza.zzI(z);
    }

    @KeepForSdk
    @Deprecated
    public void setMeasurementEnabled(boolean z) {
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static AppMeasurementSdk getInstance(@NonNull Context context, @NonNull String str, @NonNull String str2, String str3, @NonNull Bundle bundle) {
        return zzff.zzg(context, str, str2, str3, bundle).zzd();
    }
}
