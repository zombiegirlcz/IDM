package ff0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f134689a;

    public d(a ntpClock) {
        Intrinsics.checkNotNullParameter(ntpClock, "ntpClock");
        this.f134689a = ntpClock;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "TimeSettingsChangedBroadcastReceiver", "Date and time settings changed", null, null, 16);
        this.f134689a.f134688a.f161863a.b();
    }
}
