package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes16.dex */
public final class AFj1tSDK implements AFj1ySDK {
    @Override // com.appsflyer.internal.AFj1ySDK
    @NotNull
    public final String AFInAppEventType() {
        Object objA;
        Object obj2;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            obj2 = declaredField.get(null);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (obj2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        objA = (String) obj2;
        if (objA instanceof yhm.n) {
            objA = "";
        }
        return (String) objA;
    }
}
