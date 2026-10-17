package t69;

import com.revolut.chat.ChatApi$Toggles;
import com.revolut.feature.notification_centre.api.NotificationCentreApi$Toggles;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final boolean a(gte.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        jte.d dVar = (jte.d) aVar;
        if (!dVar.c(ChatApi$Toggles.SupportNewInbox.f50985c)) {
            return false;
        }
        if (dVar.c(NotificationCentreApi$Toggles.OldInboxInProfile.f78132c)) {
            return dVar.c(NotificationCentreApi$Toggles.RevfeedInProfile.f78133c);
        }
        return true;
    }
}
