package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes16.dex */
final class zzad extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzae f38870zza;

    public zzad(zzae zzaeVar) {
        this.f38870zza = zzaeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void zzb(Account account) {
        this.f38870zza.setResult(new zzai(account != null ? Status.RESULT_SUCCESS : zzal.f38879zza, account));
    }
}
