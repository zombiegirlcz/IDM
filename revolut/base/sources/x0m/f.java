package x0m;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.core.util.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import z0m.j;
import zhm.r0;

/* JADX INFO: loaded from: classes23.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f301663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f301664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f301665c;
    public volatile int d;
    public i1m.f e;
    public final AtomicBoolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f301666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f301667h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f301668j;
    public Runnable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f301669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Runnable f301670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Runnable f301671n;
    public Consumer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SharedPreferences f301672p;

    public f(long j2, long j3, TimeUnit timeUnit, Context context, boolean z) {
        String string;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f301663a = z;
        this.f = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f301666g = atomicBoolean;
        this.i = timeUnit.toMillis(j2);
        this.f301668j = timeUnit.toMillis(j3);
        this.f301667h = true;
        atomicBoolean.set(!this.f301663a);
        String str = "snowplow_session_vars_" + new Regex("[^a-zA-Z0-9_]+").replace("com.fourthline.sdk", "-");
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            HashMap mapB = b(context, str);
            if (mapB == null) {
                Intrinsics.checkNotNullExpressionValue("f", "TAG");
                j.d("f", "No previous session info available", new Object[0]);
            } else {
                i1m.f.Companion.getClass();
                this.e = i1m.e.a(mapB);
            }
            e eVar = Companion;
            i1m.f fVar = this.e;
            synchronized (eVar) {
                if (fVar != null) {
                    try {
                        string = fVar.f;
                        if (string == null) {
                            string = UUID.randomUUID().toString();
                            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                        }
                    } finally {
                    }
                } else {
                    string = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("snowplow_general_vars", 0);
                String string2 = sharedPreferences.getString("SPInstallationUserId", null);
                if (string2 != null) {
                    string = string2;
                } else {
                    sharedPreferences.edit().putString("SPInstallationUserId", string).commit();
                }
            }
            this.f301664b = string;
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(str, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            this.f301672p = sharedPreferences2;
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            Intrinsics.checkNotNullExpressionValue("f", "TAG");
            j.e("f", "Tracker Session Object created.", new Object[0]);
        } catch (Throwable th10) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th10;
        }
    }

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            runnable.run();
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("f", "TAG");
            j.b("f", "Session event callback failed", new Object[0]);
        }
    }

    public static HashMap b(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                if (!sharedPreferences.contains("session_state")) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    return null;
                }
                HashMap map = new HashMap();
                String string = sharedPreferences.getString("session_state", null);
                JSONObject jSONObject = string != null ? new JSONObject(string) : null;
                Iterator<String> itKeys = jSONObject != null ? jSONObject.keys() : null;
                while (itKeys != null) {
                    if (!itKeys.hasNext()) {
                        break;
                    }
                    String next = itKeys.next();
                    map.put(next, jSONObject.get(next));
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return map;
            } catch (JSONException e) {
                e.printStackTrace();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return null;
            }
        } catch (Throwable th10) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th10;
        }
    }

    public final void c() {
        i1m.f fVar = this.e;
        if (fVar != null) {
            LinkedHashMap linkedHashMapZ = r0.z(fVar.a());
            Long l2 = fVar.i;
            if (l2 != null) {
                linkedHashMapZ.put("lastUpdate", Long.valueOf(l2.longValue()));
            }
            String string = new JSONObject(linkedHashMapZ).toString();
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
            SharedPreferences.Editor editorEdit = this.f301672p.edit();
            editorEdit.putString("session_state", string);
            editorEdit.apply();
        }
    }

    public final void d(boolean z) {
        Intrinsics.checkNotNullExpressionValue("f", "TAG");
        j.a("f", "Session is suspended: %s", Boolean.valueOf(z));
        this.f301667h = !z;
    }

    public final synchronized void e(long j2, String str) {
        try {
            this.f301666g.set(false);
            i1m.f fVar = this.e;
            if (fVar == null) {
                String strU = a1m.e.u(j2);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                this.e = new i1m.f(str, strU, string, null, 1, this.f301664b, "LOCAL_STORAGE", null, null);
            } else {
                fVar.b(j2, str);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
