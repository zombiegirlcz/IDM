package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class zadc {
    public static final Status zaa = new Status(8, "The connection to Google Play services was lost");

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final Set f37929zab = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final zadb f37930zac = new zadb(this);

    public final void zaa(BasePendingResult basePendingResult) {
        this.f37929zab.add(basePendingResult);
        basePendingResult.zan(this.f37930zac);
    }

    public final void zab() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f37929zab.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                this.f37929zab.remove(basePendingResult);
            }
        }
    }
}
