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
public class MapView extends FrameLayout {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzai f46598zza;

    public MapView(@NonNull Context context) {
        super(context);
        this.f46598zza = new zzai(this, context, null);
        setClickable(true);
    }

    public void getMapAsync(@NonNull OnMapReadyCallback onMapReadyCallback) {
        Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
        Preconditions.checkNotNull(onMapReadyCallback, "callback must not be null.");
        this.f46598zza.zza(onMapReadyCallback);
    }

    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.f46598zza.onCreate(bundle);
            if (this.f46598zza.getDelegate() == null) {
                DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.f46598zza.onDestroy();
    }

    public void onEnterAmbient(Bundle bundle) {
        Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
        zzai zzaiVar = this.f46598zza;
        if (zzaiVar.getDelegate() != null) {
            ((zzah) zzaiVar.getDelegate()).zza(bundle);
        }
    }

    public void onExitAmbient() {
        Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
        zzai zzaiVar = this.f46598zza;
        if (zzaiVar.getDelegate() != null) {
            ((zzah) zzaiVar.getDelegate()).zzb();
        }
    }

    public void onLowMemory() {
        this.f46598zza.onLowMemory();
    }

    public void onPause() {
        this.f46598zza.onPause();
    }

    public void onResume() {
        this.f46598zza.onResume();
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        this.f46598zza.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.f46598zza.onStart();
    }

    public void onStop() {
        this.f46598zza.onStop();
    }

    public MapView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46598zza = new zzai(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46598zza = new zzai(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(@NonNull Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f46598zza = new zzai(this, context, googleMapOptions);
        setClickable(true);
    }
}
