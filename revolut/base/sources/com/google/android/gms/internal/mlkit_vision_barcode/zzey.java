package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes16.dex */
final class zzey extends zzei implements RunnableFuture {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private volatile zzeu f41389zzb;

    public zzey(zzup zzupVar) {
        this.f41389zzb = new zzex(this, zzupVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.f41389zzb;
        if (zzeuVar != null) {
            zzeuVar.run();
        }
        this.f41389zzb = null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec
    public final String zze() {
        zzeu zzeuVar = this.f41389zzb;
        return zzeuVar != null ? p.a.p("task=[", zzeuVar.toString(), "]") : super.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec
    public final void zzk() {
        zzeu zzeuVar;
        if (zzn() && (zzeuVar = this.f41389zzb) != null) {
            zzeuVar.zze();
        }
        this.f41389zzb = null;
    }
}
