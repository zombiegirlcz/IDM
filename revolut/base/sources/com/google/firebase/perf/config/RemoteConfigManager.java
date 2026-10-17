package com.google.firebase.perf.config;

import ag.m;
import ag.x;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import cf.b;
import com.google.firebase.perf.util.f;
import de.i;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nf.d;
import nf.w;
import pd.g;
import zc0.b0;
import zf.a;
import zf.c;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, c> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final w cache;
    private final Executor executor;
    private a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private b firebaseRemoteConfigProvider;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final qf.a logger = qf.a.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    private RemoteConfigManager() {
        this(w.b(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(25000)) + 5000, getInitialStartupMillis());
    }

    public static long getInitialStartupMillis() {
        pd.a aVar;
        try {
            aVar = (pd.a) g.c().b(pd.a.class);
        } catch (IllegalStateException unused) {
            logger.a("Unable to get StartupTime instance.");
            aVar = null;
        }
        return aVar != null ? aVar.f235011a : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private c getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        c cVar = this.allRcConfigMap.get(str);
        x xVar = (x) cVar;
        if (xVar.f4747b != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", xVar.d(), str);
        return cVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j2) {
        return j2 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j2) {
        return j2 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc2) {
        logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc2);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        a aVar = this.firebaseRemoteConfig;
        m mVar = aVar.e;
        mVar.a(mVar.f4709h.h()).onSuccessTask(i.INSTANCE, new x2l.a(27, false)).onSuccessTask(aVar.f321807b, new b0(aVar, 22)).addOnSuccessListener(this.executor, new nf.x(this)).addOnFailureListener(this.executor, new nf.x(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.a());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public f getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new f();
        }
        c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new f(Boolean.valueOf(((x) remoteConfigValue).a()));
            } catch (IllegalArgumentException unused) {
                x xVar = (x) remoteConfigValue;
                if (!xVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", xVar.d(), str);
                }
            }
        }
        return new f();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public f getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return new f();
        }
        c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new f(Double.valueOf(((x) remoteConfigValue).b()));
            } catch (IllegalArgumentException unused) {
                x xVar = (x) remoteConfigValue;
                if (!xVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", xVar.d(), str);
                }
            }
        }
        return new f();
    }

    public f getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new f();
        }
        c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new f(Long.valueOf(((x) remoteConfigValue).c()));
            } catch (IllegalArgumentException unused) {
                x xVar = (x) remoteConfigValue;
                if (!xVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", xVar.d(), str);
                }
            }
        }
        return new f();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t2) {
        c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t2 instanceof Boolean) {
                    return (T) Boolean.valueOf(((x) remoteConfigValue).a());
                }
                if (t2 instanceof Double) {
                    return (T) Double.valueOf(((x) remoteConfigValue).b());
                }
                if (!(t2 instanceof Long) && !(t2 instanceof Integer)) {
                    if (t2 instanceof String) {
                        return (T) ((x) remoteConfigValue).d();
                    }
                    T t3 = (T) ((x) remoteConfigValue).d();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t2);
                        return t3;
                    } catch (IllegalArgumentException unused) {
                        t2 = t3;
                        x xVar = (x) remoteConfigValue;
                        if (!xVar.d().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", xVar.d(), str);
                        }
                        return t2;
                    }
                }
                return (T) Long.valueOf(((x) remoteConfigValue).c());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t2;
    }

    public f getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new f();
        }
        c remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new f(((x) remoteConfigValue).d()) : new f();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        b bVar;
        zf.g gVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (gVar = (zf.g) bVar.get()) != null) {
            this.firebaseRemoteConfig = gVar.a("fireperf");
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        a aVar = this.firebaseRemoteConfig;
        return aVar == null || aVar.f321809g.d().f4745a == 1 || this.firebaseRemoteConfig.f321809g.d().f4745a == 2;
    }

    public void setFirebaseRemoteConfigProvider(b bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    public void syncConfigValues(Map<String, c> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        d dVarH = d.H();
        ConcurrentHashMap<String, c> concurrentHashMap = this.allRcConfigMap;
        dVarH.getClass();
        c cVar = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (cVar == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", ((x) cVar).a());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    public RemoteConfigManager(w wVar, Executor executor, a aVar, long j2, long j3) {
        ConcurrentHashMap<String, c> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = wVar;
        this.executor = executor;
        this.firebaseRemoteConfig = aVar;
        if (aVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(aVar.a());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j3;
        this.appStartConfigFetchDelayInMs = j2;
    }
}
