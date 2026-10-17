package rej;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pej.g;
import pej.h;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends BroadcastReceiver {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sej.b f253639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kp0.b f253640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f253641c;

    public c(kp0.b callback) {
        sej.b resultCodeResolver = new sej.b();
        Intrinsics.checkNotNullParameter(resultCodeResolver, "resultCodeResolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f253639a = resultCodeResolver;
        this.f253640b = callback;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.f(intent.getAction(), "esim_download_subscription") || Intrinsics.f(intent.getAction(), "esim_resolve_error")) {
            this.f253639a.getClass();
            Intrinsics.checkNotNullParameter(this, "broadcastReceiver");
            int resultCode = getResultCode();
            kp0.b bVar = this.f253640b;
            if (resultCode == 0) {
                String stringExtra = intent.getStringExtra("esim_profile_id");
                bVar.c(new h(stringExtra != null ? stringExtra : ""));
                return;
            }
            if (resultCode == 1) {
                bVar.c(new g(intent));
                return;
            }
            if (resultCode != 2) {
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.g(intent.getIntExtra("android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_ERROR_CODE", 0), intent.getIntExtra("android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_DETAILED_CODE", 0), "Error: ", ", details: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimDownloadBroadcastReceiver", null, illegalStateException, h0Var);
            String stringExtra2 = intent.getStringExtra("esim_profile_id");
            bVar.c(new pej.d(stringExtra2 != null ? stringExtra2 : "", this.f253641c));
        }
    }
}
