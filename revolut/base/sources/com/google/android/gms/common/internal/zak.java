package com.google.android.gms.common.internal;

import a0.d;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes16.dex */
public final class zak implements Handler.Callback {

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    private final zaj f38112zab;

    /* JADX INFO: renamed from: zah, reason: collision with root package name */
    private final Handler f38118zah;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final ArrayList f38113zac = new ArrayList();
    final ArrayList zaa = new ArrayList();

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    private final ArrayList f38114zad = new ArrayList();

    /* JADX INFO: renamed from: zae, reason: collision with root package name */
    private volatile boolean f38115zae = false;

    /* JADX INFO: renamed from: zaf, reason: collision with root package name */
    private final AtomicInteger f38116zaf = new AtomicInteger(0);

    /* JADX INFO: renamed from: zag, reason: collision with root package name */
    private boolean f38117zag = false;

    /* JADX INFO: renamed from: zai, reason: collision with root package name */
    private final Object f38119zai = new Object();

    public zak(Looper looper, zaj zajVar) {
        this.f38112zab = zajVar;
        this.f38118zah = new com.google.android.gms.internal.base.zau(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            d.n("Don't know how to handle message: ", i);
            new Exception();
            return false;
        }
        GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
        synchronized (this.f38119zai) {
            try {
                if (this.f38115zae && this.f38112zab.isConnected() && this.f38113zac.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(null);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return true;
    }

    public final void zaa() {
        this.f38115zae = false;
        this.f38116zaf.incrementAndGet();
    }

    public final void zab() {
        this.f38115zae = true;
    }

    public final void zac(ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.f38118zah, "onConnectionFailure must only be called on the Handler thread");
        this.f38118zah.removeMessages(1);
        synchronized (this.f38119zai) {
            try {
                ArrayList<GoogleApiClient.OnConnectionFailedListener> arrayList = new ArrayList(this.f38114zad);
                int i = this.f38116zaf.get();
                for (GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : arrayList) {
                    if (this.f38115zae && this.f38116zaf.get() == i) {
                        if (this.f38114zad.contains(onConnectionFailedListener)) {
                            onConnectionFailedListener.onConnectionFailed(connectionResult);
                        }
                    }
                    return;
                }
            } finally {
            }
        }
    }

    public final void zad(Bundle bundle) {
        Preconditions.checkHandlerThread(this.f38118zah, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f38119zai) {
            try {
                Preconditions.checkState(!this.f38117zag);
                this.f38118zah.removeMessages(1);
                this.f38117zag = true;
                Preconditions.checkState(this.zaa.isEmpty());
                ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList = new ArrayList(this.f38113zac);
                int i = this.f38116zaf.get();
                for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                    if (!this.f38115zae || !this.f38112zab.isConnected() || this.f38116zaf.get() != i) {
                        break;
                    } else if (!this.zaa.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnected(bundle);
                    }
                }
                this.zaa.clear();
                this.f38117zag = false;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zae(int i) {
        Preconditions.checkHandlerThread(this.f38118zah, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f38118zah.removeMessages(1);
        synchronized (this.f38119zai) {
            try {
                this.f38117zag = true;
                ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList = new ArrayList(this.f38113zac);
                int i2 = this.f38116zaf.get();
                for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList) {
                    if (!this.f38115zae || this.f38116zaf.get() != i2) {
                        break;
                    } else if (this.f38113zac.contains(connectionCallbacks)) {
                        connectionCallbacks.onConnectionSuspended(i);
                    }
                }
                this.zaa.clear();
                this.f38117zag = false;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f38119zai) {
            try {
                if (this.f38113zac.contains(connectionCallbacks)) {
                    String str = "registerConnectionCallbacks(): listener " + String.valueOf(connectionCallbacks) + " is already registered";
                } else {
                    this.f38113zac.add(connectionCallbacks);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (this.f38112zab.isConnected()) {
            Handler handler = this.f38118zah;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void zag(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f38119zai) {
            try {
                if (this.f38114zad.contains(onConnectionFailedListener)) {
                    String str = "registerConnectionFailedListener(): listener " + String.valueOf(onConnectionFailedListener) + " is already registered";
                } else {
                    this.f38114zad.add(onConnectionFailedListener);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zah(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f38119zai) {
            try {
                if (!this.f38113zac.remove(connectionCallbacks)) {
                    String str = "unregisterConnectionCallbacks(): listener " + String.valueOf(connectionCallbacks) + " not found";
                } else if (this.f38117zag) {
                    this.zaa.add(connectionCallbacks);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zai(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f38119zai) {
            try {
                if (!this.f38114zad.remove(onConnectionFailedListener)) {
                    String str = "unregisterConnectionFailedListener(): listener " + String.valueOf(onConnectionFailedListener) + " not found";
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final boolean zaj(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean zContains;
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.f38119zai) {
            zContains = this.f38113zac.contains(connectionCallbacks);
        }
        return zContains;
    }

    public final boolean zak(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean zContains;
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.f38119zai) {
            zContains = this.f38114zad.contains(onConnectionFailedListener);
        }
        return zContains;
    }
}
