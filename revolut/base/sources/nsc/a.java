package nsc;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final boolean a(RecipientPaymentsSettings recipientPaymentsSettings) {
        Object next;
        Boolean boolC;
        Intrinsics.checkNotNullParameter(recipientPaymentsSettings, "<this>");
        Iterator it8 = recipientPaymentsSettings.f79674c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((RecipientPaymentsSettings.Setting) next).f79675a == iy9.c.TWO_FA_REQUIRED) {
                break;
            }
        }
        RecipientPaymentsSettings.Setting setting = (RecipientPaymentsSettings.Setting) next;
        if (setting == null || (boolC = setting.c()) == null) {
            return false;
        }
        return !boolC.booleanValue();
    }
}
