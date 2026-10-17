package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zaak implements Runnable {
    final /* synthetic */ zaaw zaa;

    public zaak(zaaw zaawVar) {
        this.zaa = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zaaw zaawVar = this.zaa;
        zaawVar.f37842zad.cancelAvailabilityErrorNotifications(zaawVar.f37841zac);
    }
}
