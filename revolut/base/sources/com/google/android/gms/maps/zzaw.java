package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import androidx.fragment.app.Fragment;
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
final class zzaw extends DeferredLifecycleHelper {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected OnDelegateCreatedListener f46791zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Fragment f46792zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Activity f46793zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final List f46794zzd = new ArrayList();

    public zzaw(Fragment fragment) {
        this.f46792zzb = fragment;
    }

    public static /* synthetic */ void zza(zzaw zzawVar, Activity activity) {
        zzawVar.f46793zzc = activity;
        zzawVar.zzc();
    }

    @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
    public final void createDelegate(OnDelegateCreatedListener onDelegateCreatedListener) {
        this.f46791zza = onDelegateCreatedListener;
        zzc();
    }

    public final void zzb(OnMapReadyCallback onMapReadyCallback) {
        if (getDelegate() != null) {
            ((zzav) getDelegate()).getMapAsync(onMapReadyCallback);
        } else {
            this.f46794zzd.add(onMapReadyCallback);
        }
    }

    public final void zzc() {
        if (this.f46793zzc == null || this.f46791zza == null || getDelegate() != null) {
            return;
        }
        try {
            MapsInitializer.initialize(this.f46793zzc);
            IMapFragmentDelegate iMapFragmentDelegateZzf = zzcc.zza(this.f46793zzc, null).zzf(ObjectWrapper.wrap(this.f46793zzc));
            if (iMapFragmentDelegateZzf == null) {
                return;
            }
            this.f46791zza.onDelegateCreated(new zzav(this.f46792zzb, iMapFragmentDelegateZzf));
            Iterator it8 = this.f46794zzd.iterator();
            while (it8.hasNext()) {
                ((zzav) getDelegate()).getMapAsync((OnMapReadyCallback) it8.next());
            }
            this.f46794zzd.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        } catch (GooglePlayServicesNotAvailableException unused) {
        }
    }
}
