package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class zzkq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final WeakHashMap f45351zza = new WeakHashMap();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Context f45352zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final WeakReference f45353zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final NfcAdapter f45354zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private boolean f45355zze = true;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private boolean f45356zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private boolean f45357zzg;

    private zzkq(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        this.f45352zzb = applicationContext;
        WeakReference weakReference = new WeakReference(activity);
        this.f45353zzc = weakReference;
        this.f45354zzd = NfcAdapter.getDefaultAdapter(applicationContext);
        activity.getApplication().registerActivityLifecycleCallbacks(new zzkp(this, weakReference));
    }

    public static synchronized zzkq zza(Activity activity) {
        WeakHashMap weakHashMap;
        try {
            weakHashMap = f45351zza;
            if (!weakHashMap.containsKey(activity)) {
                weakHashMap.put(activity, new zzkq(activity));
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return (zzkq) weakHashMap.get(activity);
    }

    public static /* synthetic */ void zzb(zzkq zzkqVar, Tag tag2) {
        Intent intent = new Intent("android.nfc.action.TAG_DISCOVERED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("android.nfc.extra.TAG", tag2);
        zzkqVar.f45352zzb.sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        NfcAdapter nfcAdapter;
        if (!this.f45355zze || !this.f45356zzf) {
            if (this.f45357zzg) {
                Activity activity = (Activity) this.f45353zzc.get();
                if (activity != null) {
                    this.f45354zzd.disableReaderMode(activity);
                }
                this.f45357zzg = false;
                return;
            }
            return;
        }
        if (this.f45357zzg) {
            return;
        }
        if (this.f45352zzb.getPackageManager().hasSystemFeature("android.hardware.nfc") && ContextCompat.checkSelfPermission(this.f45352zzb, "android.permission.NFC") == 0 && (nfcAdapter = this.f45354zzd) != null && nfcAdapter.isEnabled()) {
            Activity activity2 = (Activity) this.f45353zzc.get();
            if (activity2 == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("presence", 100);
            this.f45354zzd.enableReaderMode(activity2, new NfcAdapter.ReaderCallback() { // from class: com.google.android.gms.internal.nearby.zzko
                @Override // android.nfc.NfcAdapter.ReaderCallback
                public final void onTagDiscovered(Tag tag2) {
                    zzkq.zzb(this.f45348zza, tag2);
                }
            }, 385, bundle);
            this.f45357zzg = true;
        }
    }

    public final void zze() {
        this.f45356zzf = true;
        zzg();
    }

    public final void zzf() {
        this.f45356zzf = false;
        zzg();
    }
}
