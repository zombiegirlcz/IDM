package androidx.glance.appwidget.action;

import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/action/SendBroadcastIntentAction;", "Landroidx/glance/appwidget/action/SendBroadcastAction;", "Landroid/content/Intent;", "intent", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SendBroadcastIntentAction implements SendBroadcastAction {
    @NotNull
    public abstract Intent getIntent();
}
