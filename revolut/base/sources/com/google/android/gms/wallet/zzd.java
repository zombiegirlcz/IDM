package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes16.dex */
public final class zzd extends Fragment {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    boolean f49033zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f49034zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzc f49035zzc;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(Task task) {
        if (this.f49033zza) {
            return;
        }
        this.f49033zza = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        if (task != null) {
            AutoResolveHelper.zzf(activity, this.f49034zzb, task);
        } else {
            AutoResolveHelper.zze(activity, this.f49034zzb, 0, new Intent());
        }
    }

    private final void zzc() {
        zzc zzcVar = this.f49035zzc;
        if (zzcVar != null) {
            zzcVar.zzb(this);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49034zzb = getArguments().getInt("requestCode");
        if (AutoResolveHelper.f48821zza != getArguments().getLong("initializationElapsedRealtime")) {
            this.f49035zzc = null;
        } else {
            this.f49035zzc = (zzc) zzc.f49028zzb.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.f49033zza = z;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        zzc();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        zzc zzcVar = this.f49035zzc;
        if (zzcVar != null) {
            zzcVar.zzc(this);
        } else {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
            }
            zzb(null);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f49033zza);
        zzc();
    }
}
