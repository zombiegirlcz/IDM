package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import androidx.work.impl.Processor;
import androidx.work.impl.model.WorkGenerationalId;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f49521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49522c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        this.f49520a = 0;
        this.f49522c = context;
        this.f49521b = z;
        this.d = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f49520a;
        boolean z = this.f49521b;
        Object obj2 = this.d;
        Object obj3 = this.f49522c;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor editorEdit = com.bumptech.glide.d.j(context).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } else {
                        String str = "error configuring notification delegate for package " + context.getPackageName();
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
            case 1:
                CorporateEventsHomeScreen.Companion aVar = CorporateEventsHomeScreen.INSTANCE;
                ((CorporateEventsHomeScreen) obj3).h3((Integer) obj2, z);
                return;
            default:
                ((Processor) obj3).lambda$runOnExecuted$2((WorkGenerationalId) obj2, z);
                return;
        }
    }

    public /* synthetic */ q(Object obj2, Object obj3, boolean z, int i) {
        this.f49520a = i;
        this.f49522c = obj2;
        this.d = obj3;
        this.f49521b = z;
    }
}
