package oc;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc.k f224002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f224003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f224004c;
    public final HashSet d;
    public eam.b e;

    public d(Context context) {
        pc.k kVar = new pc.k("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.d = new HashSet();
        this.e = null;
        this.f224002a = kVar;
        this.f224003b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f224004c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        eam.b bVar;
        HashSet hashSet = this.d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.f224004c;
        if (!zIsEmpty && this.e == null) {
            eam.b bVar2 = new eam.b(this, 2);
            this.e = bVar2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f224003b;
            if (i >= 33) {
                context.registerReceiver(bVar2, intentFilter, 2);
            } else {
                context.registerReceiver(bVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (bVar = this.e) == null) {
            return;
        }
        context.unregisterReceiver(bVar);
        this.e = null;
    }
}
