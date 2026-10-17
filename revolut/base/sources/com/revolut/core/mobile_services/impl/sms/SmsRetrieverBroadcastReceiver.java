package com.revolut.core.mobile_services.impl.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import th0.a;
import th0.l;
import ue0.e;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/mobile_services/impl/sms/SmsRetrieverBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "mobile_services_google_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SmsRetrieverBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String message;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            a aVar = null;
            Object obj2 = extras != null ? extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            Status status = obj2 instanceof Status ? (Status) obj2 : null;
            if (status == null || status.getStatusCode() != 0 || (message = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE")) == null) {
                return;
            }
            try {
                aVar = (a) e.i(e.j(context), a.class);
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, null, null, e, h0Var);
            }
            if (aVar == null) {
                aVar = (a) l.Companion.c();
            }
            ji0.a aVarG = aVar.g();
            Intrinsics.i(aVarG, "null cannot be cast to non-null type com.revolut.core.mobile_services.impl.sms.GmsSmsRetrieverClient");
            Intrinsics.checkNotNullParameter(message, "message");
            aVarG.f174319b.onNext(message);
        }
    }
}
