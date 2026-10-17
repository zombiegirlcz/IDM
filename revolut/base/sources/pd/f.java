package pd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f235020b = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f235021a;

    public f(Context context) {
        this.f235021a = context;
    }

    public static void a(Context context) {
        AtomicReference atomicReference = f235020b;
        if (atomicReference.get() == null) {
            f fVar = new f(context);
            while (!atomicReference.compareAndSet(null, fVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.k) {
            try {
                Iterator it8 = g.f235022l.values().iterator();
                while (it8.hasNext()) {
                    ((g) it8.next()).e();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        this.f235021a.unregisterReceiver(this);
    }
}
