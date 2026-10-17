package nu7;

import android.content.Intent;
import android.net.Uri;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
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

    public static final ExternalDestination.ByIntent c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new ExternalDestination.ByIntent(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + str)), null);
    }
}
