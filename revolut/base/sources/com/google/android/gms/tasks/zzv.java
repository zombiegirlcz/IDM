package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzv extends LifecycleCallback {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final List f48808zza;

    private zzv(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.f48808zza = new ArrayList();
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        LifecycleFragment fragment = LifecycleCallback.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.getCallbackOrNull("TaskOnStopCallback", zzv.class);
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized (this.f48808zza) {
            try {
                Iterator it8 = this.f48808zza.iterator();
                while (it8.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it8.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzc();
                    }
                }
                this.f48808zza.clear();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        synchronized (this.f48808zza) {
            this.f48808zza.add(new WeakReference(zzqVar));
        }
    }
}
