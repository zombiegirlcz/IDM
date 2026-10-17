package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
final class zaap extends zaav {
    final /* synthetic */ zaaw zaa;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final ArrayList f37837zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaap(zaaw zaawVar, ArrayList arrayList) {
        super(zaawVar, null);
        this.zaa = zaawVar;
        this.f37837zac = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    public final void zaa() {
        zaaw zaawVar = this.zaa;
        zaawVar.zaa.f37872zag.f37858zad = zaaw.zao(zaawVar);
        ArrayList arrayList = this.f37837zac;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Api.Client client = (Api.Client) arrayList.get(i);
            zaaw zaawVar2 = this.zaa;
            client.getRemoteService(zaawVar2.zao, zaawVar2.zaa.f37872zag.f37858zad);
        }
    }
}
