package alj;

import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttributesValidation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zkj.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static boolean a(b userInput) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        EsimPhoneNumberPortingAttributesValidation esimPhoneNumberPortingAttributesValidation = userInput.f323057b;
        if (esimPhoneNumberPortingAttributesValidation == null) {
            return true;
        }
        boolean z = esimPhoneNumberPortingAttributesValidation.d;
        String str = userInput.f323056a;
        String string = str != null ? d0.F0(str).toString() : null;
        if (!z && (string == null || string.length() == 0)) {
            return true;
        }
        if (string == null) {
            return false;
        }
        if (z && string.length() == 0) {
            return false;
        }
        Long l2 = esimPhoneNumberPortingAttributesValidation.f100342a;
        if (l2 != null) {
            if (string.length() < l2.longValue()) {
                return false;
            }
        }
        Long l3 = esimPhoneNumberPortingAttributesValidation.f100343b;
        if (l3 != null) {
            if (string.length() > l3.longValue()) {
                return false;
            }
        }
        String str2 = esimPhoneNumberPortingAttributesValidation.f100344c;
        return str2 == null || ch.qos.logback.core.util.a.x(str2, string);
    }
}
