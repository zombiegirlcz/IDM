package ef0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import e0m.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import voi.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DefaultLifecycleObserver, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f125249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ru0.d f125250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ru0.d f125251c;

    public a(i context, ru0.d ntpClockProvider, ru0.d timeSettingsChangedReceiverProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ntpClockProvider, "ntpClockProvider");
        Intrinsics.checkNotNullParameter(timeSettingsChangedReceiverProvider, "timeSettingsChangedReceiverProvider");
        this.f125249a = context;
        this.f125250b = ntpClockProvider;
        this.f125251c = timeSettingsChangedReceiverProvider;
    }

    @Override // e0m.d
    public final void init() {
        ((ff0.a) this.f125250b.invoke()).f134688a.f161863a.b();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ru0.d dVar = this.f125251c;
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) dVar.invoke();
        dVar.invoke();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        ContextCompat.registerReceiver(this.f125249a, broadcastReceiver, intentFilter, 4);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(c.DEBUG, "TimeSettingsChangedBroadcastReceiver", "Registered to receive date time settings changes", null, null, 16);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f125249a.unregisterReceiver((BroadcastReceiver) this.f125251c.invoke());
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(c.DEBUG, "TimeSettingsChangedBroadcastReceiver", "No longer registered to receive date time settings changes", null, null, 16);
    }
}
