package com.google.firebase.perf.session;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import mf.c;
import mf.d;
import uf.a;
import xf.n;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class SessionManager extends d {
    private static final SessionManager instance = new SessionManager();
    private final c appStateMonitor;
    private final Set<WeakReference<a>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, c cVar) {
        super(c.a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = cVar;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.f49591c) {
            this.gaugeManager.logGaugeMetadata(perfSession.f49589a, n.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(n nVar) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.f49591c) {
            this.gaugeManager.logGaugeMetadata(perfSession.f49589a, nVar);
        }
    }

    private void startOrStopCollectingGauges(n nVar) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.f49591c) {
            this.gaugeManager.startCollectingGauges(perfSession, nVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        n nVar = n.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(nVar);
        startOrStopCollectingGauges(nVar);
    }

    @Override // mf.d, mf.b
    public void onUpdateAppState(n nVar) {
        super.onUpdateAppState(nVar);
        if (this.appStateMonitor.f204813q) {
            return;
        }
        if (nVar == n.FOREGROUND) {
            updatePerfSession(PerfSession.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.d()) {
            updatePerfSession(PerfSession.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(nVar);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<a> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new ag.n(this, 6, context, this.perfSession));
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.d()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<a> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.f49589a == this.perfSession.f49589a) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<a>> it8 = this.clients.iterator();
                while (it8.hasNext()) {
                    a aVar = it8.next().get();
                    if (aVar != null) {
                        aVar.a(perfSession);
                    } else {
                        it8.remove();
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.o);
        startOrStopCollectingGauges(this.appStateMonitor.o);
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.c(UUID.randomUUID().toString()), c.a());
    }
}
