package csi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends BroadcastReceiver {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yri.a f108474a;

    public f(yri.a screensInteractor) {
        Intrinsics.checkNotNullParameter(screensInteractor, "screensInteractor");
        this.f108474a = screensInteractor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (!a0.z(intent != null ? intent.getAction() : null, "subprocess_screen_interaction_action", false)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Can't handle action ", intent != null ? intent.getAction() : null));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SubprocessScreenInteractionBroadcastReceiver", null, illegalArgumentException, h0Var);
            return;
        }
        a aVarValueOf = (intent == null || (stringExtra = intent.getStringExtra("subprocess_screen_interaction_activity_event_key")) == null) ? null : a.valueOf(stringExtra);
        if (aVarValueOf == null) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(j6.a.q("Can't handle string key: ", intent != null ? intent.getStringExtra("subprocess_screen_interaction_activity_event_key") : null));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SubprocessScreenInteractionBroadcastReceiver", null, illegalArgumentException2, h0Var2);
            return;
        }
        int i = e.f108473a[aVarValueOf.ordinal()];
        yri.a aVar = this.f108474a;
        if (i == 1) {
            aVar.c();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.e();
        }
    }
}
