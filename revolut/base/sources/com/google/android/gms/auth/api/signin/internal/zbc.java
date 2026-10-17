package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.content.AsyncTaskLoader;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class zbc extends AsyncTaskLoader implements SignInConnectionListener {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    private final Semaphore f37521zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    private final Set f37522zbb;

    public zbc(Context context, Set set) {
        super(context);
        this.f37521zba = new Semaphore(0);
        this.f37522zbb = set;
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Iterator it8 = this.f37522zbb.iterator();
        int i = 0;
        while (it8.hasNext()) {
            if (((GoogleApiClient) it8.next()).maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.f37521zba.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.f37521zba.release();
    }

    @Override // androidx.loader.content.Loader
    public final void onStartLoading() {
        this.f37521zba.drainPermits();
        forceLoad();
    }
}
