package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zaad {
    private final Map zaa = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final Map f37828zab = Collections.synchronizedMap(new WeakHashMap());

    private final void zah(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.zaa) {
            map = new HashMap(this.zaa);
        }
        synchronized (this.f37828zab) {
            map2 = new HashMap(this.f37828zab);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }

    public final void zac(BasePendingResult basePendingResult, boolean z) {
        this.zaa.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.addStatusListener(new zaab(this, basePendingResult));
    }

    public final void zad(TaskCompletionSource taskCompletionSource, boolean z) {
        this.f37828zab.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.getTask().addOnCompleteListener(new zaac(this, taskCompletionSource));
    }

    public final void zae(int i, String str) {
        StringBuilder sb6 = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb6.append(" due to service disconnection.");
        } else if (i == 3) {
            sb6.append(" due to dead object exception.");
        }
        if (str != null) {
            sb6.append(" Last reason for disconnect: ");
            sb6.append(str);
        }
        zah(true, new Status(20, sb6.toString()));
    }

    public final void zaf() {
        zah(false, GoogleApiManager.zaa);
    }

    public final boolean zag() {
        return (this.zaa.isEmpty() && this.f37828zab.isEmpty()) ? false : true;
    }
}
