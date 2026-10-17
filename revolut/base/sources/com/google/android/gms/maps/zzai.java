package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.zzcc;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzai extends DeferredLifecycleHelper {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected OnDelegateCreatedListener f46763zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ViewGroup f46764zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Context f46765zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final GoogleMapOptions f46766zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final List f46767zze = new ArrayList();

    public zzai(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f46764zzb = viewGroup;
        this.f46765zzc = context;
        this.f46766zzd = googleMapOptions;
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f46763zza = onDelegateCreatedListener;
        zzb();
    }

    public final void zza(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((zzah) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.f46767zze.add(onMapReadyCallback);
        }
    }

    public final void zzb() {
        if (this.f46763zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.f46765zzc);
            IMapViewDelegate iMapViewDelegateZzg = zzcc.zza(this.f46765zzc, null).zzg(ObjectWrapper.wrap(this.f46765zzc), this.f46766zzd);
            if (iMapViewDelegateZzg == null) {
                return;
            }
            this.f46763zza.onDelegateCreated(new zzah(this.f46764zzb, iMapViewDelegateZzg));
            Iterator it8 = this.f46767zze.iterator();
            while (it8.hasNext()) {
                ((zzah) getDelegate()).getMapAsync((OnMapReadyCallback) it8.next());
            }
            this.f46767zze.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
