package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* JADX INFO: loaded from: classes16.dex */
public class StreetViewPanoramaView extends FrameLayout {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzat f46616zza;

    public StreetViewPanoramaView(@NonNull Context context) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"));
        this.f46616zza = new zzat(this, context, null);
    }

    public void getStreetViewPanoramaAsync(@NonNull OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        Preconditions.checkNotNull(onStreetViewPanoramaReadyCallback, "callback must not be null");
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        this.f46616zza.zza(onStreetViewPanoramaReadyCallback);
    }

    public final void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f46616zza.onCreate(bundle);
            if (this.f46616zza.getDelegate() == null) {
                DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.f46616zza.onDestroy();
    }

    public final void onLowMemory() {
        this.f46616zza.onLowMemory();
    }

    public final void onPause() {
        this.f46616zza.onPause();
    }

    public void onResume() {
        this.f46616zza.onResume();
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        this.f46616zza.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.f46616zza.onStart();
    }

    public void onStop() {
        this.f46616zza.onStop();
    }

    public StreetViewPanoramaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"), attributeSet);
        this.f46616zza = new zzat(this, context, null);
    }

    public StreetViewPanoramaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"), attributeSet, i);
        this.f46616zza = new zzat(this, context, null);
    }

    public StreetViewPanoramaView(@NonNull Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"));
        this.f46616zza = new zzat(this, context, streetViewPanoramaOptions);
    }
}
