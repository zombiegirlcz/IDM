package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.b;
import com.google.firebase.perf.util.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import mf.c;
import mf.d;
import uf.a;
import wf.e;

/* JADX INFO: loaded from: classes.dex */
public class Trace extends d implements Parcelable, a {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final qf.a f49581m = qf.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f49582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Trace f49583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GaugeManager f49584c;
    public final String d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f49585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f49586h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ah.a f49587j;
    public Timer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Timer f49588l;

    static {
        new ConcurrentHashMap();
        CREATOR = new q(2);
    }

    public Trace(String str, e eVar, ah.a aVar, c cVar) {
        this(str, eVar, aVar, cVar, GaugeManager.getInstance());
    }

    @Override // uf.a
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            f49581m.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.k == null || c()) {
                return;
            }
            this.f49585g.add(perfSession);
        }
    }

    public final void b(String str, String str2) {
        if (c()) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalArgumentException(p.a.p("Trace '", this.d, "' has been stopped"));
        }
        ConcurrentHashMap concurrentHashMap = this.f;
        if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
            sf.e.b(str, str2);
        } else {
            Locale locale2 = Locale.ENGLISH;
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
    }

    public final boolean c() {
        return this.f49588l != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.k != null) && !c()) {
                f49581m.g("Trace '%s' is started but not stopped when it is destructed!", this.d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter = str != null ? (Counter) this.e.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.f49580b.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j2) {
        String strC = sf.e.c(str);
        qf.a aVar = f49581m;
        if (strC != null) {
            aVar.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        Timer timer = this.k;
        String str2 = this.d;
        if (timer == null) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        AtomicLong atomicLong = counter.f49580b;
        atomicLong.addAndGet(j2);
        aVar.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z;
        qf.a aVar = f49581m;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            aVar.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.d);
            z = true;
        } catch (Exception e) {
            aVar.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            this.f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j2) {
        String strC = sf.e.c(str);
        qf.a aVar = f49581m;
        if (strC != null) {
            aVar.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        Timer timer = this.k;
        String str2 = this.d;
        if (timer == null) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.e;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        counter.f49580b.set(j2);
        aVar.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j2), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (!c()) {
            this.f.remove(str);
            return;
        }
        qf.a aVar = f49581m;
        if (aVar.f245203b) {
            aVar.f245202a.getClass();
        }
    }

    @Keep
    public void start() {
        String str;
        boolean zO = nf.a.e().o();
        qf.a aVar = f49581m;
        if (!zO) {
            aVar.a("Trace feature is disabled.");
            return;
        }
        String str2 = this.d;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else if (str2.startsWith("_")) {
            b[] bVarArrValues = b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (bVarArrValues[i].toString().equals(str2)) {
                        break;
                    } else {
                        i++;
                    }
                } else if (str2.startsWith("_st_")) {
                    break;
                } else {
                    str = "Trace name must not start with '_'";
                }
            }
            str = null;
        } else {
            str = null;
        }
        if (str != null) {
            aVar.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.k != null) {
            aVar.c("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.f49587j.getClass();
        this.k = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f49582a);
        a(perfSession);
        if (perfSession.f49591c) {
            this.f49584c.collectGaugeMetricOnce(perfSession.f49590b);
        }
    }

    @Keep
    public void stop() {
        Timer timer = this.k;
        String str = this.d;
        qf.a aVar = f49581m;
        if (timer == null) {
            aVar.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (c()) {
            aVar.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f49582a);
        unregisterForAppState();
        this.f49587j.getClass();
        Timer timer2 = new Timer();
        this.f49588l = timer2;
        if (this.f49583b == null) {
            ArrayList arrayList = this.f49586h;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) p.a.i(1, arrayList);
                if (trace.f49588l == null) {
                    trace.f49588l = timer2;
                }
            }
            if (str.isEmpty()) {
                if (aVar.f245203b) {
                    aVar.f245202a.getClass();
                    return;
                }
                return;
            }
            this.i.c(new a31.a(this, 22).b(), getAppState());
            if (SessionManager.getInstance().perfSession().f49591c) {
                this.f49584c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f49590b);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.f49583b, 0);
        parcel.writeString(this.d);
        parcel.writeList(this.f49586h);
        parcel.writeMap(this.e);
        parcel.writeParcelable(this.k, 0);
        parcel.writeParcelable(this.f49588l, 0);
        synchronized (this.f49585g) {
            parcel.writeList(this.f49585g);
        }
    }

    public Trace(String str, e eVar, ah.a aVar, c cVar, GaugeManager gaugeManager) {
        super(cVar);
        this.f49582a = new WeakReference(this);
        this.f49583b = null;
        this.d = str.trim();
        this.f49586h = new ArrayList();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.f49587j = aVar;
        this.i = eVar;
        this.f49585g = Collections.synchronizedList(new ArrayList());
        this.f49584c = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : c.a());
        this.f49582a = new WeakReference(this);
        this.f49583b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f49586h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = concurrentHashMap;
        this.f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.k = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f49588l = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f49585g = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.i = null;
            this.f49587j = null;
            this.f49584c = null;
        } else {
            this.i = e.f296850s;
            this.f49587j = new ah.a(3);
            this.f49584c = GaugeManager.getInstance();
        }
    }
}
