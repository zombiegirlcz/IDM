package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
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
final class zzap extends DeferredLifecycleHelper {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected OnDelegateCreatedListener f46775zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Fragment f46776zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Activity f46777zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final List f46778zzd = new ArrayList();

    public zzap(Fragment fragment) {
        this.f46776zzb = fragment;
    }

    public static /* synthetic */ void zza(zzap zzapVar, Activity activity) {
        zzapVar.f46777zzc = activity;
        zzapVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f46775zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((zzao) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.f46778zzd.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzc() {
        if (this.f46777zzc == null || this.f46775zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.f46777zzc);
            this.f46775zza.onDelegateCreated(new zzao(this.f46776zzb, zzcc.zza(this.f46777zzc, null).zzh(ObjectWrapper.wrap(this.f46777zzc))));
            Iterator it8 = this.f46778zzd.iterator();
            while (it8.hasNext()) {
                ((zzao) getDelegate()).getStreetViewPanoramaAsync((OnStreetViewPanoramaReadyCallback) it8.next());
            }
            this.f46778zzd.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
