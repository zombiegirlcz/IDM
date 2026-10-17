package z50;

import android.content.Intent;
import com.revolut.chat.domain.model.ChatEntryPoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f319401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f319402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ChatEntryPoint f319403c;

    private c() {
    }

    public static boolean a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!Intrinsics.f(intent.getStringExtra("serviceIdentifier"), "revolut-chat")) {
            boolean zEquals = "com.revolut.category.CHAT_MESSAGE".equals(intent.getAction());
            boolean z = intent.hasExtra("gcm.notification.click_action") && "com.revolut.category.CHAT_MESSAGE".equalsIgnoreCase(intent.getStringExtra("gcm.notification.click_action"));
            if (!zEquals && !z) {
                return false;
            }
        }
        return true;
    }
}
