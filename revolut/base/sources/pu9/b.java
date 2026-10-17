package pu9;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import dv9.m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ku9.d f239840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ku9.a f239841b;

    public b(ku9.d chatNotificationsRepository, ku9.a activeChatRepository) {
        Intrinsics.checkNotNullParameter(chatNotificationsRepository, "chatNotificationsRepository");
        Intrinsics.checkNotNullParameter(activeChatRepository, "activeChatRepository");
        this.f239840a = chatNotificationsRepository;
        this.f239841b = activeChatRepository;
    }

    public final void a(m conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        ku9.a aVar = this.f239841b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        aVar.f189756a = conversation;
        ku9.d dVar = this.f239840a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        ((NotificationManager) dVar.f189760b.getValue()).cancel(conversation.f118076a, 0);
        StatusBarNotification[] activeNotifications = ((NotificationManager) dVar.f189760b.getValue()).getActiveNotifications();
        Intrinsics.checkNotNullExpressionValue(activeNotifications, "getActiveNotifications(...)");
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (Intrinsics.f(statusBarNotification.getNotification().getGroup(), "CHAT_GROUP_NAME")) {
                arrayList.add(statusBarNotification);
            }
        }
        if (arrayList.size() <= 1) {
            ((NotificationManager) dVar.f189760b.getValue()).cancel("CHAT_GROUP_TAG", 777123777);
        }
    }
}
