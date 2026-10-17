package androidx.glance.appwidget.action;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/action/ListAdapterTrampolineApi26Impl;", "", "()V", "startForegroundService", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ListAdapterTrampolineApi26Impl {

    @NotNull
    public static final ListAdapterTrampolineApi26Impl INSTANCE = new ListAdapterTrampolineApi26Impl();

    private ListAdapterTrampolineApi26Impl() {
    }

    public final void startForegroundService(@NotNull Context context, @NotNull Intent intent) {
        context.startForegroundService(intent);
    }
}
