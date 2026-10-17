package com.fourthline.core;

import com.fourthline.core.internal.security.NativeSecurityChecker;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.Metadata;
import kotlin.text.d0;
import kotlin.text.f0;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\b¨\u0006\n"}, d2 = {"", "fallback", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "isDeviceRooted", "()Z", "()Ljava/lang/String;", "is02Language", "fourthline-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class DeviceMetadataKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String a() {
        String language = Locale.getDefault().getLanguage();
        return language.length() == 2 ? language : d0.T(language, "_", 0, false, 6) == 2 ? f0.U0(2, language) : "";
    }

    public static final boolean isDeviceRooted() {
        return NativeSecurityChecker.INSTANCE.isCompromised();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(String str) {
        try {
            return Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused) {
            return str;
        }
    }
}
