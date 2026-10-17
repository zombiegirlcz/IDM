package fq;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends GlanceAppWidgetReceiver {
    @Override // androidx.glance.appwidget.GlanceAppWidgetReceiver, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onReceive(context, intent);
        if (intent.getBooleanExtra("REGULAR_UPDATE_ENABLED_EXTRA_KEY", false)) {
            Object systemService = context.getSystemService("alarm");
            AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
            if (alarmManager != null) {
                Intent intentPutExtra = new Intent(context, getClass()).putExtra("REGULAR_UPDATE_ENABLED_EXTRA_KEY", true);
                Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
                alarmManager.cancel(PendingIntent.getBroadcast(context, 20, intentPutExtra, 167772160));
            }
        }
    }
}
