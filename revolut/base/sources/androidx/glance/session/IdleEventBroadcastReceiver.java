package androidx.glance.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/glance/session/IdleEventBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lkotlin/Function0;", "", "onIdle", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "checkIdleStatus$glance_release", "(Landroid/content/Context;)V", "checkIdleStatus", "Lkotlin/jvm/functions/Function0;", "getOnIdle", "()Lkotlin/jvm/functions/Function0;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IdleEventBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final List<String> events;

    @NotNull
    private static final IntentFilter filter;

    @NotNull
    private final Function0<Unit> onIdle;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/session/IdleEventBroadcastReceiver$Companion;", "", "<init>", "()V", "Landroid/content/IntentFilter;", "filter", "Landroid/content/IntentFilter;", "getFilter", "()Landroid/content/IntentFilter;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntentFilter getFilter() {
            return IdleEventBroadcastReceiver.filter;
        }

        private Companion() {
        }
    }

    static {
        List<String> listK = v.k("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        events = listK;
        IntentFilter intentFilter = new IntentFilter();
        Iterator<T> it8 = listK.iterator();
        while (it8.hasNext()) {
            intentFilter.addAction((String) it8.next());
        }
        filter = intentFilter;
    }

    public IdleEventBroadcastReceiver(@NotNull Function0<Unit> function0) {
        this.onIdle = function0;
    }

    public final void checkIdleStatus$glance_release(@NotNull Context context) {
        int i = Build.VERSION.SDK_INT;
        Object systemService = context.getSystemService("power");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        boolean zIsIdle = Api23Impl.INSTANCE.isIdle(powerManager);
        if (i >= 33) {
            zIsIdle = zIsIdle || Api33Impl.INSTANCE.isLightIdleOrLowPowerStandby(powerManager);
        }
        if (zIsIdle) {
            this.onIdle.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        if (d0.T(events, intent.getAction())) {
            checkIdleStatus$glance_release(context);
        }
    }
}
