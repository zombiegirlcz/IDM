package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzat extends DeferredLifecycleHelper {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected OnDelegateCreatedListener f46783zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ViewGroup f46784zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Context f46785zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final StreetViewPanoramaOptions f46786zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final List f46787zze = new ArrayList();

    public zzat(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        this.f46784zzb = viewGroup;
        this.f46785zzc = context;
        this.f46786zzd = streetViewPanoramaOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f46783zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zza(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((zzas) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.f46787zze.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzb() {
        if (this.f46783zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.f46785zzc);
            this.f46783zza.onDelegateCreated(new zzas(this.f46784zzb, zzcc.zza(this.f46785zzc, null).zzi(ObjectWrapper.wrap(this.f46785zzc), this.f46786zzd)));
            Iterator it8 = this.f46787zze.iterator();
            while (it8.hasNext()) {
                ((zzas) getDelegate()).getStreetViewPanoramaAsync((OnStreetViewPanoramaReadyCallback) it8.next());
            }
            this.f46787zze.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
