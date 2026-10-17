package uo;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f281504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppWidgetManager f281505b;

    public r0(Context context, AppWidgetManager appWidgetManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        this.f281504a = context;
        this.f281505b = appWidgetManager;
    }
}
