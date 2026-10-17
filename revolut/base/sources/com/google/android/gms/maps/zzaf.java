package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzaf extends DeferredLifecycleHelper {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected OnDelegateCreatedListener f46755zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Fragment f46756zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Activity f46757zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final List f46758zzd = new ArrayList();

    public zzaf(Fragment fragment) {
        this.f46756zzb = fragment;
    }

    public static /* synthetic */ void zza(zzaf zzafVar, Activity activity) {
        zzafVar.f46757zzc = activity;
        zzafVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f46755zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((zzae) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.f46758zzd.add(onMapReadyCallback);
        }
    }

    public final void zzc() {
        if (this.f46757zzc == null || this.f46755zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.f46757zzc);
            IMapFragmentDelegate iMapFragmentDelegateZzf = zzcc.zza(this.f46757zzc, null).zzf(ObjectWrapper.wrap(this.f46757zzc));
            if (iMapFragmentDelegateZzf == null) {
                return;
            }
            this.f46755zza.onDelegateCreated(new zzae(this.f46756zzb, iMapFragmentDelegateZzf));
            Iterator it8 = this.f46758zzd.iterator();
            while (it8.hasNext()) {
                ((zzae) getDelegate()).getMapAsync((OnMapReadyCallback) it8.next());
            }
            this.f46758zzd.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
