package com.onfido.android.sdk.capture.common.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import java.util.Locale;
import jh.d;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0017\u0018\u0000 .2\u00020\u0001:\u0001.B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J&\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u001cH\u0002J5\u0010\u001d\u001a\u0002H\u0016\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00160\u001fH\u0080\bø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001cH\u0010¢\u0006\u0002\b%J,\u0010&\u001a\u00020\u0011\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u0002H\u0016H\u0080\b¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u001cH\u0010¢\u0006\u0002\b+J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u0001*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u001cH\u0082\b¢\u0006\u0002\u0010,J\u001e\u0010-\u001a\u00020\u0011*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "", "context", "Landroid/content/Context;", "jsonParser", "Lkotlinx/serialization/json/Json;", "(Landroid/content/Context;Lkotlinx/serialization/json/Json;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs$onfido_capture_sdk_core_release$annotations", "()V", "getPrefs$onfido_capture_sdk_core_release", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "delete", "", "key", "Lcom/onfido/android/sdk/capture/common/preferences/StorageKey;", "delete$onfido_capture_sdk_core_release", "get", "T", "get$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/preferences/StorageKey;)Ljava/lang/Object;", "getLocale", "Ljava/util/Locale;", "pref", "", "getOrDefault", "default", "Lkotlin/Function0;", "getOrDefault$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/preferences/StorageKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hasRequestedPermission", "", "permission", "hasRequestedPermission$onfido_capture_sdk_core_release", "save", "value", "save$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/preferences/StorageKey;Ljava/lang/Object;)V", "setHasRequestedPermission", "setHasRequestedPermission$onfido_capture_sdk_core_release", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/Object;", "set", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SharedPreferencesDataSource {

    @NotNull
    private final Json jsonParser;

    /* JADX INFO: renamed from: prefs$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy prefs;

    @NotNull
    private static final String LOCALE_ROOT = "locale-root";

    @NotNull
    private static final String ONFIDO_PREFERENCES_ID = "ONFIDO_PREFERENCES";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Lazy UNSUPPORTED_TYPE_EXCEPTION$delegate = j.b(SharedPreferencesDataSource$Companion$UNSUPPORTED_TYPE_EXCEPTION$2.INSTANCE);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u00060\u0007j\u0002`\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource$Companion;", "", "()V", "LOCALE_ROOT", "", "ONFIDO_PREFERENCES_ID", "UNSUPPORTED_TYPE_EXCEPTION", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "getUNSUPPORTED_TYPE_EXCEPTION", "()Ljava/lang/UnsupportedOperationException;", "UNSUPPORTED_TYPE_EXCEPTION$delegate", "Lkotlin/Lazy;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final UnsupportedOperationException getUNSUPPORTED_TYPE_EXCEPTION() {
            return (UnsupportedOperationException) SharedPreferencesDataSource.UNSUPPORTED_TYPE_EXCEPTION$delegate.getValue();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SharedPreferencesDataSource(@ApplicationContext @NotNull Context context, @NotNull Json jsonParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        this.jsonParser = jsonParser;
        this.prefs = j.b(new SharedPreferencesDataSource$prefs$2(context));
    }

    private final <T> T get(SharedPreferences sharedPreferences, String str) {
        if (!sharedPreferences.contains(str)) {
            return null;
        }
        Intrinsics.q();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getLocale(SharedPreferences pref, String key) {
        String string = pref.getString(key, null);
        if (Intrinsics.f(string, "locale-root")) {
            Locale locale = Locale.ROOT;
            Intrinsics.h(locale);
            return locale;
        }
        if (string != null) {
            Json json = this.jsonParser;
            Locale locale2 = (Locale) json.b(d.v(json.f187949b, o0.a(Locale.class)), string);
            if (locale2 != null) {
                return locale2;
            }
        }
        Locale locale3 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale3, "getDefault(...)");
        return locale3;
    }

    public static /* synthetic */ void getPrefs$onfido_capture_sdk_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set(SharedPreferences sharedPreferences, String str, Object obj2) {
        SharedPreferences.Editor editor;
        if (obj2 == null ? true : obj2 instanceof String) {
            editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putString(str, (String) obj2);
        } else if (obj2 instanceof Integer) {
            editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putInt(str, ((Number) obj2).intValue());
        } else if (obj2 instanceof Boolean) {
            editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putBoolean(str, ((Boolean) obj2).booleanValue());
        } else if (obj2 instanceof Float) {
            editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putFloat(str, ((Number) obj2).floatValue());
        } else {
            if (!(obj2 instanceof Long)) {
                if (!(obj2 != null ? obj2 instanceof Locale : true)) {
                    throw Companion.getUNSUPPORTED_TYPE_EXCEPTION();
                }
                SharedPreferences.Editor editor2 = sharedPreferences.edit();
                Intrinsics.checkNotNullExpressionValue(editor2, "editor");
                if (Intrinsics.f(obj2, Locale.ROOT)) {
                    editor2.putString(str, "locale-root");
                } else {
                    Json json = this.jsonParser;
                    editor2.putString(str, json.c(d.v(json.f187949b, o0.a(Locale.class)), obj2));
                }
                editor2.apply();
                return;
            }
            editor = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editor, "editor");
            editor.putLong(str, ((Number) obj2).longValue());
        }
        editor.apply();
    }

    public final void delete$onfido_capture_sdk_core_release(@NotNull StorageKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences prefs$onfido_capture_sdk_core_release = getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        SharedPreferences.Editor editor = prefs$onfido_capture_sdk_core_release.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.remove(key.name());
        editor.apply();
    }

    public final <T> T get$onfido_capture_sdk_core_release(StorageKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences prefs$onfido_capture_sdk_core_release = getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        if (!prefs$onfido_capture_sdk_core_release.contains(key.name())) {
            return null;
        }
        Intrinsics.q();
        throw null;
    }

    public final <T> T getOrDefault$onfido_capture_sdk_core_release(StorageKey key, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(function0, "default");
        SharedPreferences prefs$onfido_capture_sdk_core_release = getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        if (!prefs$onfido_capture_sdk_core_release.contains(key.name())) {
            return (T) function0.invoke();
        }
        Intrinsics.q();
        throw null;
    }

    public final SharedPreferences getPrefs$onfido_capture_sdk_core_release() {
        return (SharedPreferences) this.prefs.getValue();
    }

    public boolean hasRequestedPermission$onfido_capture_sdk_core_release(@NotNull String permission) {
        Boolean boolValueOf;
        Object locale;
        Intrinsics.checkNotNullParameter(permission, "permission");
        SharedPreferences prefs$onfido_capture_sdk_core_release = getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        if (prefs$onfido_capture_sdk_core_release.contains(permission)) {
            p0 p0Var = o0.f186429a;
            KClass kClassB = p0Var.b(Boolean.class);
            if (kClassB.equals(p0Var.b(String.class))) {
                locale = prefs$onfido_capture_sdk_core_release.getString(permission, "");
                if (locale == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            } else if (kClassB.equals(p0Var.b(Integer.TYPE))) {
                locale = Integer.valueOf(prefs$onfido_capture_sdk_core_release.getInt(permission, -1));
            } else if (kClassB.equals(p0Var.b(Boolean.TYPE))) {
                boolValueOf = Boolean.valueOf(prefs$onfido_capture_sdk_core_release.getBoolean(permission, false));
            } else if (kClassB.equals(p0Var.b(Float.TYPE))) {
                locale = Float.valueOf(prefs$onfido_capture_sdk_core_release.getFloat(permission, -1.0f));
            } else if (kClassB.equals(p0Var.b(Long.TYPE))) {
                locale = Long.valueOf(prefs$onfido_capture_sdk_core_release.getLong(permission, -1L));
            } else {
                if (!kClassB.equals(p0Var.b(Locale.class))) {
                    throw Companion.getUNSUPPORTED_TYPE_EXCEPTION();
                }
                locale = getLocale(prefs$onfido_capture_sdk_core_release, permission);
                if (locale == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            }
            boolValueOf = (Boolean) locale;
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final /* synthetic */ <T> void save$onfido_capture_sdk_core_release(StorageKey key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences prefs$onfido_capture_sdk_core_release = getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        set(prefs$onfido_capture_sdk_core_release, key.name(), value);
    }

    public void setHasRequestedPermission$onfido_capture_sdk_core_release(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        SharedPreferences prefs$onfido_capture_sdk_core_release = getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        set(prefs$onfido_capture_sdk_core_release, permission, Boolean.TRUE);
    }
}
