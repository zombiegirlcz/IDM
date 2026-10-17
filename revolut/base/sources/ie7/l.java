package ie7;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.in_app_calls.CallActivity;
import com.revolut.feature.in_app_calls.R$string;
import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import com.revolut.feature.in_app_calls.wrapper.VoiceCallInvite;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.in_app_calls.notifications.d f160671a;

    public l(com.revolut.feature.in_app_calls.notifications.d intentFactory, m channelsFactory) {
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        Intrinsics.checkNotNullParameter(channelsFactory, "channelsFactory");
        this.f160671a = intentFactory;
    }

    public static Person b(CallNotificationService callNotificationService, String str) {
        Person.Builder builder = new Person.Builder();
        if (str == null) {
            str = callNotificationService.getString(R$string.in_app_calls_screen_call_preview_agent_name);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        Person personBuild = builder.setName(str).setIcon(IconCompat.createWithResource(callNotificationService, R$drawable.uikit_revolut_logo_white)).setImportant(true).build();
        Intrinsics.checkNotNullExpressionValue(personBuild, "build(...)");
        return personBuild;
    }

    public final Notification a(CallNotificationService context, VoiceCallInvite voiceCallInvite) {
        String str;
        com.revolut.feature.in_app_calls.notifications.d dVar = this.f160671a;
        z70.a aVar = dVar.f74834a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (voiceCallInvite != null) {
            Intrinsics.checkNotNullParameter(voiceCallInvite, "<this>");
            str = (String) voiceCallInvite.f74841c.get("agentName");
        } else {
            str = null;
        }
        Person personB = b(context, str);
        m.a(context);
        NotificationCompat.Builder ongoing = new NotificationCompat.Builder(context, "com.revolut.call.active.v2").addPerson(personB).setContentTitle(context.getString(R$string.in_app_calls_notification_title)).setContentText(context.getString(R$string.in_app_calls_notification_text)).setVisibility(1).setPriority(0).setCategory("call").setSmallIcon(R$drawable.uikit_icn_24_logo_revolut_colour).setSound(null).setVibrate(null).setOngoing(true);
        s70.a aVar2 = dVar.f74835b;
        Context context2 = aVar.getContext();
        CallActivity.Companion companion = CallActivity.INSTANCE;
        Context context3 = aVar.getContext();
        companion.getClass();
        Intrinsics.checkNotNullParameter(context3, "context");
        NotificationCompat.Builder contentIntent = ongoing.setContentIntent(((s70.b) aVar2).g(context2, 5, CallActivity.Companion.a(2, context3), 201326592, 3));
        IconCompat iconCompatCreateWithResource = IconCompat.createWithResource(context, com.revolut.feature.in_app_calls.R$drawable.ic_in_app_call_notification_decline);
        String string = context.getString(R$string.in_app_calls_notification_hangup);
        Context context4 = aVar.getContext();
        CallNotificationService.Companion companion2 = CallNotificationService.INSTANCE;
        Context context5 = aVar.getContext();
        companion2.getClass();
        PendingIntent service = PendingIntent.getService(context4, 4, CallNotificationService.Companion.a(context5), 201326592);
        Intrinsics.checkNotNullExpressionValue(service, "getService(...)");
        Notification notificationBuild = contentIntent.addAction(new NotificationCompat.Action.Builder(iconCompatCreateWithResource, string, service).build()).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        return notificationBuild;
    }
}
