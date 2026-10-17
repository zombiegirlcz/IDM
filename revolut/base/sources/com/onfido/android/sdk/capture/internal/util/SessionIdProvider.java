package com.onfido.android.sdk.capture.internal.util;

import android.content.SharedPreferences;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.common.preferences.StorageKey;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.android.sdk.capture.utils.UuidProvider;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u0006\u0010\u0011\u001a\u00020\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/SessionIdProvider;", "", "uuidProvider", "Lcom/onfido/android/sdk/capture/utils/UuidProvider;", "timeProvider", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "sharedPreferencesDataSource", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "(Lcom/onfido/android/sdk/capture/utils/UuidProvider;Lcom/onfido/android/sdk/capture/utils/TimeProvider;Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;)V", "sessionId", "", "sessionIdCreatedAt", "", "generateNewSessionId", "", "getPersistedSessionId", "getPersistedSessionIdCreatedAt", "getSessionId", "isSessionExpired", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SessionIdProvider {
    private static final long SESSION_DURATION_MINUTE = 30;

    @NotNull
    private volatile String sessionId;
    private volatile long sessionIdCreatedAt;

    @NotNull
    private final SharedPreferencesDataSource sharedPreferencesDataSource;

    @NotNull
    private final TimeProvider timeProvider;

    @NotNull
    private final UuidProvider uuidProvider;

    public SessionIdProvider(@NotNull UuidProvider uuidProvider, @NotNull TimeProvider timeProvider, @NotNull SharedPreferencesDataSource sharedPreferencesDataSource) {
        Intrinsics.checkNotNullParameter(uuidProvider, "uuidProvider");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(sharedPreferencesDataSource, "sharedPreferencesDataSource");
        this.uuidProvider = uuidProvider;
        this.timeProvider = timeProvider;
        this.sharedPreferencesDataSource = sharedPreferencesDataSource;
        this.sessionId = "";
        this.sessionIdCreatedAt = getPersistedSessionIdCreatedAt();
        this.sessionId = getPersistedSessionId();
    }

    private final void generateNewSessionId() {
        long currentTimestamp = this.timeProvider.getCurrentTimestamp();
        this.sessionId = this.uuidProvider.getRandomUuid();
        this.sessionIdCreatedAt = currentTimestamp;
        SharedPreferencesDataSource sharedPreferencesDataSource = this.sharedPreferencesDataSource;
        StorageKey storageKey = StorageKey.SESSION_ID;
        String str = this.sessionId;
        SharedPreferences prefs$onfido_capture_sdk_core_release = sharedPreferencesDataSource.getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        sharedPreferencesDataSource.set(prefs$onfido_capture_sdk_core_release, storageKey.name(), str);
        SharedPreferencesDataSource sharedPreferencesDataSource2 = this.sharedPreferencesDataSource;
        StorageKey storageKey2 = StorageKey.SESSION_ID_CREATED_AT;
        Long lValueOf = Long.valueOf(this.sessionIdCreatedAt);
        SharedPreferences prefs$onfido_capture_sdk_core_release2 = sharedPreferencesDataSource2.getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release2, "<get-prefs>(...)");
        sharedPreferencesDataSource2.set(prefs$onfido_capture_sdk_core_release2, storageKey2.name(), lValueOf);
    }

    private final String getPersistedSessionId() {
        String string;
        Object locale;
        SharedPreferencesDataSource sharedPreferencesDataSource = this.sharedPreferencesDataSource;
        StorageKey storageKey = StorageKey.SESSION_ID;
        SharedPreferences prefs$onfido_capture_sdk_core_release = sharedPreferencesDataSource.getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        String strName = storageKey.name();
        if (prefs$onfido_capture_sdk_core_release.contains(strName)) {
            p0 p0Var = o0.f186429a;
            KClass kClassB = p0Var.b(String.class);
            if (kClassB.equals(p0Var.b(String.class))) {
                string = prefs$onfido_capture_sdk_core_release.getString(strName, "");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                if (kClassB.equals(p0Var.b(Integer.TYPE))) {
                    locale = Integer.valueOf(prefs$onfido_capture_sdk_core_release.getInt(strName, -1));
                } else if (kClassB.equals(p0Var.b(Boolean.TYPE))) {
                    locale = Boolean.valueOf(prefs$onfido_capture_sdk_core_release.getBoolean(strName, false));
                } else if (kClassB.equals(p0Var.b(Float.TYPE))) {
                    locale = Float.valueOf(prefs$onfido_capture_sdk_core_release.getFloat(strName, -1.0f));
                } else if (kClassB.equals(p0Var.b(Long.TYPE))) {
                    locale = Long.valueOf(prefs$onfido_capture_sdk_core_release.getLong(strName, -1L));
                } else {
                    if (!kClassB.equals(p0Var.b(Locale.class))) {
                        throw SharedPreferencesDataSource.Companion.getUNSUPPORTED_TYPE_EXCEPTION();
                    }
                    locale = sharedPreferencesDataSource.getLocale(prefs$onfido_capture_sdk_core_release, strName);
                    if (locale == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                string = (String) locale;
            }
        } else {
            string = null;
        }
        return string == null ? "" : string;
    }

    private final long getPersistedSessionIdCreatedAt() {
        String string;
        Object locale;
        SharedPreferencesDataSource sharedPreferencesDataSource;
        SharedPreferences prefs$onfido_capture_sdk_core_release;
        String strName;
        Long lValueOf;
        Object locale2;
        Object objValueOf;
        Class cls = Long.TYPE;
        Class cls2 = Float.TYPE;
        Class cls3 = Boolean.TYPE;
        Class cls4 = Integer.TYPE;
        try {
            sharedPreferencesDataSource = this.sharedPreferencesDataSource;
            StorageKey storageKey = StorageKey.SESSION_ID_CREATED_AT;
            prefs$onfido_capture_sdk_core_release = sharedPreferencesDataSource.getPrefs$onfido_capture_sdk_core_release();
            Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
            strName = storageKey.name();
        } catch (ClassCastException e) {
            e = e;
        }
        try {
            if (prefs$onfido_capture_sdk_core_release.contains(strName)) {
                p0 p0Var = o0.f186429a;
                KClass kClassB = p0Var.b(Long.class);
                if (kClassB.equals(p0Var.b(String.class))) {
                    locale2 = prefs$onfido_capture_sdk_core_release.getString(strName, "");
                    if (locale2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                } else {
                    if (kClassB.equals(p0Var.b(cls4))) {
                        objValueOf = Integer.valueOf(prefs$onfido_capture_sdk_core_release.getInt(strName, -1));
                    } else if (kClassB.equals(p0Var.b(cls3))) {
                        objValueOf = Boolean.valueOf(prefs$onfido_capture_sdk_core_release.getBoolean(strName, false));
                    } else if (kClassB.equals(p0Var.b(cls2))) {
                        objValueOf = Float.valueOf(prefs$onfido_capture_sdk_core_release.getFloat(strName, -1.0f));
                    } else if (kClassB.equals(p0Var.b(cls))) {
                        lValueOf = Long.valueOf(prefs$onfido_capture_sdk_core_release.getLong(strName, -1L));
                    } else {
                        if (!kClassB.equals(p0Var.b(Locale.class))) {
                            throw SharedPreferencesDataSource.Companion.getUNSUPPORTED_TYPE_EXCEPTION();
                        }
                        locale2 = sharedPreferencesDataSource.getLocale(prefs$onfido_capture_sdk_core_release, strName);
                        if (locale2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                        }
                    }
                    lValueOf = (Long) objValueOf;
                }
                lValueOf = (Long) locale2;
            } else {
                lValueOf = null;
            }
            if (lValueOf == null) {
                lValueOf = 0L;
            }
            return lValueOf.longValue();
        } catch (ClassCastException e2) {
            e = e2;
            Timber.INSTANCE.i(e);
            SharedPreferencesDataSource sharedPreferencesDataSource2 = this.sharedPreferencesDataSource;
            StorageKey storageKey2 = StorageKey.SESSION_ID_CREATED_AT;
            SharedPreferences prefs$onfido_capture_sdk_core_release2 = sharedPreferencesDataSource2.getPrefs$onfido_capture_sdk_core_release();
            Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release2, "<get-prefs>(...)");
            String strName2 = storageKey2.name();
            if (prefs$onfido_capture_sdk_core_release2.contains(strName2)) {
                p0 p0Var2 = o0.f186429a;
                KClass kClassB2 = p0Var2.b(String.class);
                if (kClassB2.equals(p0Var2.b(String.class))) {
                    string = prefs$onfido_capture_sdk_core_release2.getString(strName2, "");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    if (kClassB2.equals(p0Var2.b(cls4))) {
                        locale = Integer.valueOf(prefs$onfido_capture_sdk_core_release2.getInt(strName2, -1));
                    } else if (kClassB2.equals(p0Var2.b(cls3))) {
                        locale = Boolean.valueOf(prefs$onfido_capture_sdk_core_release2.getBoolean(strName2, false));
                    } else if (kClassB2.equals(p0Var2.b(cls2))) {
                        locale = Float.valueOf(prefs$onfido_capture_sdk_core_release2.getFloat(strName2, -1.0f));
                    } else if (kClassB2.equals(p0Var2.b(cls))) {
                        locale = Long.valueOf(prefs$onfido_capture_sdk_core_release2.getLong(strName2, -1L));
                    } else {
                        if (!kClassB2.equals(p0Var2.b(Locale.class))) {
                            throw SharedPreferencesDataSource.Companion.getUNSUPPORTED_TYPE_EXCEPTION();
                        }
                        locale = sharedPreferencesDataSource2.getLocale(prefs$onfido_capture_sdk_core_release2, strName2);
                        if (locale == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    string = (String) locale;
                }
            } else {
                string = null;
            }
            if (string == null) {
                string = "0";
            }
            return Long.parseLong(string);
        }
    }

    private final boolean isSessionExpired() {
        return this.timeProvider.getCurrentTimestamp() - this.sessionIdCreatedAt > TimeUnit.MINUTES.toMillis(SESSION_DURATION_MINUTE);
    }

    @NotNull
    public final synchronized String getSessionId() {
        try {
            if (isSessionExpired()) {
                generateNewSessionId();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.sessionId;
    }
}
