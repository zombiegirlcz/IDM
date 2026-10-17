package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
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
final class zzaz extends DeferredLifecycleHelper {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected OnDelegateCreatedListener f46798zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Fragment f46799zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Activity f46800zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final List f46801zzd = new ArrayList();

    public zzaz(Fragment fragment) {
        this.f46799zzb = fragment;
    }

    public static /* synthetic */ void zza(zzaz zzazVar, Activity activity) {
        zzazVar.f46800zzc = activity;
        zzazVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f46798zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        if (getDelegate() != null) {
            ((zzay) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            this.f46801zzd.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public final void zzc() {
        if (this.f46800zzc == null || this.f46798zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.f46800zzc);
            this.f46798zza.onDelegateCreated(new zzay(this.f46799zzb, zzcc.zza(this.f46800zzc, null).zzh(ObjectWrapper.wrap(this.f46800zzc))));
            Iterator it8 = this.f46801zzd.iterator();
            while (it8.hasNext()) {
                ((zzay) getDelegate()).getStreetViewPanoramaAsync((OnStreetViewPanoramaReadyCallback) it8.next());
            }
            this.f46801zzd.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
