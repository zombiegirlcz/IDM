package ma1;

import android.content.Context;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f203884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sa1.a f203885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IntentFilter f203886c;

    public j(Context context, sa1.a broadcastReceiver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(broadcastReceiver, "broadcastReceiver");
        this.f203884a = context;
        this.f203885b = broadcastReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.PAIRING_REQUEST");
        this.f203886c = intentFilter;
    }
}
