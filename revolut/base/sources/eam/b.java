package eam;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.play.core.install.zza;
import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import com.youTransactor.uCube.connexion.ConnectionStatus;
import com.youTransactor.uCube.connexion.ScanListener;
import defpackage.t1;
import defpackage.v0;
import financial.atomic.transact.activity.TransactActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import jji.e;
import kotlin.jvm.internal.Intrinsics;
import oc.d;
import pc.k;
import sz5.f;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f124277b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f124276a = i;
        this.f124277b = obj2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        String string;
        String action;
        switch (this.f124276a) {
            case 0:
                if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("type")) == null || !string.equals("DISMISS")) {
                    return;
                }
                ((TransactActivity) this.f124277b).finish();
                return;
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                CallNotificationService callNotificationService = (CallNotificationService) this.f124277b;
                CallNotificationService.Companion companion = CallNotificationService.Companion;
                callNotificationService.h(intent);
                return;
            case 2:
                d dVar = (d) this.f124277b;
                if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
                    dVar.f224002a.c("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                dVar.f224002a.c("List of extras in received intent:", new Object[0]);
                for (String str : intent.getExtras().keySet()) {
                    dVar.f224002a.c("Key: %s; value: %s", str, intent.getExtras().get(str));
                }
                k kVar = dVar.f224002a;
                kVar.c("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                kVar.c("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                kVar.c("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getIntExtra("error.code", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getStringExtra("package.name"));
                dVar.f224002a.c("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (dVar) {
                    Iterator it8 = new HashSet(dVar.d).iterator();
                    while (it8.hasNext()) {
                        ((tc.a) it8.next()).a(zzaVar);
                        break;
                    }
                }
                return;
            default:
                e eVar = (e) this.f124277b;
                if (((v0) eVar.f174963b) != null && (action = intent.getAction()) != null && action.equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE) == 10) {
                    t1.b("receive bluetooth state OFF", new Exception[0]);
                    v0 v0Var = (v0) eVar.f174963b;
                    v0Var.getClass();
                    t1.a("Bluetooth OFF");
                    f fVar = v0Var.f284695l;
                    if (fVar != null) {
                        t1.a("bluetooth turned off");
                        ((Handler) fVar.f).removeCallbacksAndMessages(null);
                        ScanListener scanListener = (ScanListener) fVar.e;
                        if (scanListener != null) {
                            scanListener.onScanComplete((ArrayList) fVar.f266768g);
                            fVar.e = null;
                        }
                    }
                    v0Var.c(ConnectionStatus.ERROR_BT_TURNED_OFF);
                    t1.b("Bluetooth state OFF", new Exception[0]);
                    v0Var.f();
                    return;
                }
                return;
        }
    }
}
