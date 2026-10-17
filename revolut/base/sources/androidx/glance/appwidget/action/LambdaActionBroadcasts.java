package androidx.glance.appwidget.action;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/glance/appwidget/action/LambdaActionBroadcasts;", "", "<init>", "()V", "Landroid/content/ComponentName;", "receiver", "", "actionKey", "", "appWidgetId", "Landroid/content/Intent;", "createIntent$glance_appwidget_release", "(Landroid/content/ComponentName;Ljava/lang/String;I)Landroid/content/Intent;", "createIntent", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LambdaActionBroadcasts {

    @NotNull
    public static final LambdaActionBroadcasts INSTANCE = new LambdaActionBroadcasts();

    private LambdaActionBroadcasts() {
    }

    @NotNull
    public final Intent createIntent$glance_appwidget_release(@NotNull ComponentName receiver, @NotNull String actionKey, int appWidgetId) {
        return new Intent().setComponent(receiver).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", actionKey).putExtra("EXTRA_APPWIDGET_ID", appWidgetId);
    }
}
