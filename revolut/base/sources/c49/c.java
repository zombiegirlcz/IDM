package c49;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.messaging.w;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f21120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f21121c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f21119a = i;
        this.f21120b = obj2;
        this.f21121c = obj3;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        w wVar = (w) this.f21120b;
        if (wVar != null) {
            Context context = wVar.f49553c.f49452b;
            this.f21121c = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r3, android.content.Intent r4) {
        /*
            r2 = this;
            int r0 = r2.f21119a
            switch(r0) {
                case 0: goto L80;
                case 1: goto L4b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f21120b
            kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r3 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = r4.getAction()
            java.lang.String r1 = "android.nfc.action.ADAPTER_STATE_CHANGED"
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
            if (r3 == 0) goto L4a
            java.lang.String r3 = "android.nfc.extra.ADAPTER_STATE"
            r1 = 1
            int r3 = r4.getIntExtra(r3, r1)
            if (r3 == r1) goto L38
            r4 = 2
            if (r3 == r4) goto L38
            r4 = 3
            if (r3 == r4) goto L32
            r4 = 4
            if (r3 == r4) goto L38
            goto L3d
        L32:
            kmi.h r3 = kmi.h.ENABLED
            r0.mo3647trySendJP2dKIU(r3)
            goto L3d
        L38:
            kmi.h r3 = kmi.h.DISABLED
            r0.mo3647trySendJP2dKIU(r3)
        L3d:
            java.lang.Object r3 = r2.f21121c
            kmi.g r3 = (kmi.g) r3
            r4 = 0
            r3.f185896c = r4
            r3.b()
            r3.a()
        L4a:
            return
        L4b:
            java.lang.Object r3 = r2.f21120b
            com.google.firebase.messaging.w r3 = (com.google.firebase.messaging.w) r3
            if (r3 != 0) goto L52
            goto L7f
        L52:
            boolean r3 = r3.a()
            if (r3 != 0) goto L59
            goto L7f
        L59:
            r3 = 3
            java.lang.String r4 = "FirebaseMessaging"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L65
            java.lang.String r3 = "Connectivity changed. Starting background sync."
        L65:
            java.lang.Object r3 = r2.f21120b
            com.google.firebase.messaging.w r3 = (com.google.firebase.messaging.w) r3
            com.google.firebase.messaging.FirebaseMessaging r4 = r3.f49553c
            r4.getClass()
            r0 = 0
            com.google.firebase.messaging.FirebaseMessaging.b(r0, r3)
            java.lang.Object r3 = r2.f21121c
            android.content.Context r3 = (android.content.Context) r3
            if (r3 == 0) goto L7c
            r3.unregisterReceiver(r2)
        L7c:
            r3 = 0
            r2.f21120b = r3
        L7f:
            return
        L80:
            java.lang.Object r3 = r2.f21120b
            tfm.z0 r3 = (tfm.z0) r3
            java.lang.Object r4 = r2.f21121c
            c49.d r4 = (c49.d) r4
            x39.b r4 = r4.g()
            r3.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c49.c.onReceive(android.content.Context, android.content.Intent):void");
    }

    public c(w wVar) {
        this.f21119a = 1;
        this.f21120b = wVar;
    }
}
