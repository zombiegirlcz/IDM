package ag;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class u {
    public static final Date e = new Date(-1);
    public static final Date f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4740b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4741c = new Object();
    public final Object d = new Object();

    public u(SharedPreferences sharedPreferences) {
        this.f4739a = sharedPreferences;
    }

    public final t a() {
        t tVar;
        synchronized (this.f4741c) {
            int i = this.f4739a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f4739a.getLong("backoff_end_time_in_millis", -1L));
            tVar = new t(0);
            tVar.f4737b = i;
            tVar.f4738c = date;
        }
        return tVar;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f4739a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final long c() {
        return this.f4739a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public final w d() {
        w wVar;
        synchronized (this.f4740b) {
            try {
                this.f4739a.getLong("last_fetch_time_in_millis", -1L);
                int i = this.f4739a.getInt("last_fetch_status", 0);
                long j2 = m.f4704j;
                long j3 = this.f4739a.getLong("fetch_timeout_in_seconds", 60L);
                if (j3 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j3)));
                }
                long j5 = this.f4739a.getLong("minimum_fetch_interval_in_seconds", j2);
                if (j5 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j5 + " is an invalid argument");
                }
                wVar = new w(i);
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return wVar;
    }

    public final String e() {
        return this.f4739a.getString("last_fetch_etag", null);
    }

    public final Date f() {
        return new Date(this.f4739a.getLong("last_fetch_time_in_millis", -1L));
    }

    public final long g() {
        return this.f4739a.getLong("last_template_version", 0L);
    }

    public final long h() {
        return this.f4739a.getLong("minimum_fetch_interval_in_seconds", m.f4704j);
    }

    public final t i() {
        t tVar;
        synchronized (this.d) {
            int i = this.f4739a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f4739a.getLong("realtime_backoff_end_time_in_millis", -1L));
            tVar = new t(1);
            tVar.f4737b = i;
            tVar.f4738c = date;
        }
        return tVar;
    }

    public final void j() {
        k(f, 0);
    }

    public final void k(Date date, int i) {
        synchronized (this.f4741c) {
            this.f4739a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void l(String str) {
        synchronized (this.f4740b) {
            this.f4739a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void m(long j2) {
        synchronized (this.f4740b) {
            this.f4739a.edit().putLong("last_template_version", j2).apply();
        }
    }

    public final void n(Date date, int i) {
        synchronized (this.d) {
            this.f4739a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void o() {
        synchronized (this.f4740b) {
            this.f4739a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void p(Date date) {
        synchronized (this.f4740b) {
            this.f4739a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public final void q() {
        synchronized (this.f4740b) {
            this.f4739a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
