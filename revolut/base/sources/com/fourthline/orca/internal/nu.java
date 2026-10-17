package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.eid.EidServiceProvider;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class nu {
    public final EidServiceProvider a(Context context, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        try {
            Object objNewInstance = Class.forName("com.fourthline.eid.RealEidServiceProvider").getConstructor(Context.class, CoroutineScope.class).newInstance(context, coroutineScope);
            Intrinsics.i(objNewInstance, "null cannot be cast to non-null type com.fourthline.core.eid.EidServiceProvider");
            return (EidServiceProvider) objNewInstance;
        } catch (Throwable unused) {
            return zf0.f35578a;
        }
    }
}
