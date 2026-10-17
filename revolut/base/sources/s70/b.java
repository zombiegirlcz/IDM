package s70;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x80.a f260499a;

    public b(x80.a packageNameProvider, n80.b buildInfo) {
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(buildInfo, "buildInfo");
        this.f260499a = packageNameProvider;
    }

    public final Intent b() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.f260499a.a(), null));
        return intent;
    }

    public final Intent c() {
        return new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
    }

    public final Intent d(String emailSubject, String emailBody, String... emails) {
        Intrinsics.checkNotNullParameter(emailSubject, "emailSubject");
        Intrinsics.checkNotNullParameter(emailBody, "emailBody");
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.SUBJECT", emailSubject);
        intent.putExtra("android.intent.extra.TEXT", emailBody);
        if (emails.length == 0) {
            return intent;
        }
        intent.putExtra("android.intent.extra.EMAIL", emails);
        return intent;
    }

    public final Intent e(String phoneNumber, String message) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(message, "message");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.fromParts("smsto", phoneNumber, null));
        intent.putExtra("sms_body", message);
        return intent;
    }

    public final Intent f(String title, String text, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TITLE", title);
        intent.putExtra("android.intent.extra.TEXT", text);
        if (str != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
        }
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(...)");
        return intentCreateChooser;
    }

    public final PendingIntent g(Context context, int i, Intent intent, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Build.VERSION.SDK_INT < 36) {
            PendingIntent activity = PendingIntent.getActivity(context, i, intent, i2);
            Intrinsics.h(activity);
            return activity;
        }
        ActivityOptions pendingIntentCreatorBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentCreatorBackgroundActivityStartMode(i3);
        Intrinsics.checkNotNullExpressionValue(pendingIntentCreatorBackgroundActivityStartMode, "setPendingIntentCreatorB…undActivityStartMode(...)");
        PendingIntent activity2 = PendingIntent.getActivity(context, i, intent, i2, pendingIntentCreatorBackgroundActivityStartMode.toBundle());
        Intrinsics.h(activity2);
        return activity2;
    }
}
