package mf;

import java.lang.ref.WeakReference;
import xf.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements b {
    private final c appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private n currentAppState = n.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<b> appStateCallback = new WeakReference<>(this);

    public d(c cVar) {
        this.appStateMonitor = cVar;
    }

    public n getAppState() {
        return this.currentAppState;
    }

    public WeakReference<b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.f204807h.addAndGet(i);
    }

    @Override // mf.b
    public void onUpdateAppState(n nVar) {
        n nVar2 = this.currentAppState;
        n nVar3 = n.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (nVar2 == nVar3) {
            this.currentAppState = nVar;
        } else {
            if (nVar2 == nVar || nVar == nVar3) {
                return;
            }
            this.currentAppState = n.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        c cVar = this.appStateMonitor;
        this.currentAppState = cVar.o;
        WeakReference<b> weakReference = this.appStateCallback;
        synchronized (cVar.f) {
            cVar.f.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            c cVar = this.appStateMonitor;
            WeakReference<b> weakReference = this.appStateCallback;
            synchronized (cVar.f) {
                cVar.f.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}
