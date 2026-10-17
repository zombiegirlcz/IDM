package com.revolut.feature.in_app_calls;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import be7.h;
import com.revolut.feature.in_app_calls.CallActivity;
import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import ipa.j;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n30.k0;
import pe7.d;
import pe7.f;
import rd0.c;
import skm.e0;
import skm.p0;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements h, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f74790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f74791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f74792c;

    public a(z70.a contextProvider, f voiceCallsWrapper, phm.a inAppCallsFeatureAvailabilityLogger) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(voiceCallsWrapper, "voiceCallsWrapper");
        Intrinsics.checkNotNullParameter(inAppCallsFeatureAvailabilityLogger, "inAppCallsFeatureAvailabilityLogger");
        this.f74790a = contextProvider;
        this.f74791b = voiceCallsWrapper;
        this.f74792c = inAppCallsFeatureAvailabilityLogger;
    }

    public final boolean a(Context context, j data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zHandleFcmMessage = this.f74791b.handleFcmMessage(context, data, this);
        if (zHandleFcmMessage) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(c.INFO, "InAppCalls", j6.a.q("handleFcmMessage with data=", d0.k0(data.f167702a.entrySet(), null, null, null, 0, null, 63)), null, null, 16);
        }
        return zHandleFcmMessage;
    }

    public final boolean b() {
        return this.f74791b.isTwilioDynamicModuleAvailable();
    }

    public final void c() {
        Context context = this.f74790a.getContext();
        CallActivity.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(CallActivity.Companion.a(0, context));
    }

    public final Object d(String str, String str2, k0 k0Var) {
        a1a.c cVar = new a1a.c(this, str, str2, (Continuation) null, 22);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, cVar, k0Var);
    }

    public final void e(UUID uuid, UUID uuid2, String str, Callee callee) {
        CallNotificationService.Companion companion = CallNotificationService.INSTANCE;
        Context context = this.f74790a.getContext();
        companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) CallNotificationService.class);
        intent.putExtra("EXTRA_INBOUND_CALL_EXTRAS", new CallNotificationService.Companion.InboundCallExtras(uuid, uuid2, str, callee));
        intent.setAction("ACTION_CALL_TO_REVOLUT");
        ContextCompat.startForegroundService(context, intent);
    }
}
