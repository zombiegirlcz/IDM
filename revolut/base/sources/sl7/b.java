package sl7;

import android.content.Intent;
import android.net.Uri;
import com.revolut.feature.insurance_car.impl.data.model.Contact;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final ExternalDestination.Browser a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!a0.H(str, "https://", false) && !a0.H(str, "http://", false)) {
            str = "https://".concat(str);
        }
        return new ExternalDestination.Browser(str, null);
    }

    public static final ExternalDestination.ByIntent b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new ExternalDestination.ByIntent(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)), null);
    }

    public static final ExternalDestination.ByIntent c(Contact contact) {
        Intrinsics.checkNotNullParameter(contact, "<this>");
        kl7.e eVar = contact.f75198a;
        String str = contact.f75199b;
        int i = a.f264154a[eVar.ordinal()];
        if (i == 1) {
            return b(str);
        }
        if (i == 2) {
            return d(str);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ExternalDestination.ByIntent d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new ExternalDestination.ByIntent(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + str)), null);
    }
}
