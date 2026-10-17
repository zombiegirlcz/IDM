package ig;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Preferences.Key f161062c = PreferencesKeys.booleanKey("firebase_sessions_enabled");
    public static final Preferences.Key d = PreferencesKeys.doubleKey("firebase_sessions_sampling_rate");
    public static final Preferences.Key e = PreferencesKeys.intKey("firebase_sessions_restart_timeout");
    public static final Preferences.Key f = PreferencesKeys.intKey("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Preferences.Key f161063g = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f161064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f161065b;

    public o(DataStore dataStore) throws Throwable {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f161064a = dataStore;
        e0.E(kotlin.coroutines.g.f186406a, new afe.a(this, null, 7));
    }

    public static final void a(o oVar, Preferences preferences) {
        oVar.getClass();
        oVar.f161065b = new h((Boolean) preferences.get(f161062c), (Double) preferences.get(d), (Integer) preferences.get(e), (Integer) preferences.get(f), (Long) preferences.get(f161063g));
    }

    public final boolean b() {
        h hVar = this.f161065b;
        if (hVar == null) {
            Intrinsics.r("sessionConfigs");
            throw null;
        }
        Long l2 = hVar.e;
        if (hVar != null) {
            Integer num = hVar.d;
            return l2 == null || num == null || (System.currentTimeMillis() - l2.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        Intrinsics.r("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(androidx.datastore.preferences.core.Preferences.Key r6, java.lang.Object r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ig.m
            if (r0 == 0) goto L13
            r0 = r8
            ig.m r0 = (ig.m) r0
            int r1 = r0.f161059w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161059w = r1
            goto L18
        L13:
            ig.m r0 = new ig.m
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161059w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r8)     // Catch: java.io.IOException -> L27
            goto L56
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r8)
            androidx.datastore.core.DataStore r8 = r5.f161064a     // Catch: java.io.IOException -> L27
            ig.n r2 = new ig.n     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.f161059w = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L56
            return r1
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
        L56:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.o.c(androidx.datastore.preferences.core.Preferences$Key, java.lang.Object, gim.c):java.lang.Object");
    }
}
