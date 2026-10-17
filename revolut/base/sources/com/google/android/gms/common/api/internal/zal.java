package com.google.android.gms.common.api.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class zal {

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private int f37942zad;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final ArrayMap f37940zab = new ArrayMap();

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final TaskCompletionSource f37941zac = new TaskCompletionSource();

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private boolean f37943zae = false;
    private final ArrayMap zaa = new ArrayMap();

    public zal(Iterable iterable) {
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            this.zaa.put(((HasApiKey) it8.next()).getApiKey(), null);
        }
        this.f37942zad = this.zaa.keySet().size();
    }

    public final Task zaa() {
        return this.f37941zac.getTask();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, String str) {
        this.zaa.put(apiKey, connectionResult);
        this.f37940zab.put(apiKey, str);
        this.f37942zad--;
        if (!connectionResult.isSuccess()) {
            this.f37943zae = true;
        }
        if (this.f37942zad == 0) {
            if (!this.f37943zae) {
                this.f37941zac.setResult(this.f37940zab);
            } else {
                this.f37941zac.setException(new AvailabilityException(this.zaa));
            }
        }
    }
}
