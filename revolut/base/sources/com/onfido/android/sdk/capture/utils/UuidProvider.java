package com.onfido.android.sdk.capture.utils;

import android.content.SharedPreferences;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.common.preferences.StorageKey;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/UuidProvider;", "", "sharedPreferencesDataSource", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "(Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;)V", "uniqueUuid", "", "getPersistedUuid", "getRandomUuid", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UuidProvider {

    @NotNull
    private final SharedPreferencesDataSource sharedPreferencesDataSource;
    private String uniqueUuid;

    public UuidProvider(@NotNull SharedPreferencesDataSource sharedPreferencesDataSource) {
        Intrinsics.checkNotNullParameter(sharedPreferencesDataSource, "sharedPreferencesDataSource");
        this.sharedPreferencesDataSource = sharedPreferencesDataSource;
    }

    @NotNull
    public final String getPersistedUuid() {
        String string;
        Object locale;
        String str = this.uniqueUuid;
        if (str != null) {
            return str;
        }
        SharedPreferencesDataSource sharedPreferencesDataSource = this.sharedPreferencesDataSource;
        StorageKey storageKey = StorageKey.PERSISTED_UUID;
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
        if (string != null) {
            return string;
        }
        String randomUuid = getRandomUuid();
        this.uniqueUuid = randomUuid;
        SharedPreferencesDataSource sharedPreferencesDataSource2 = this.sharedPreferencesDataSource;
        SharedPreferences prefs$onfido_capture_sdk_core_release2 = sharedPreferencesDataSource2.getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release2, "<get-prefs>(...)");
        sharedPreferencesDataSource2.set(prefs$onfido_capture_sdk_core_release2, storageKey.name(), randomUuid);
        return randomUuid;
    }

    @NotNull
    public final String getRandomUuid() {
        return j6.a.p("toString(...)");
    }
}
