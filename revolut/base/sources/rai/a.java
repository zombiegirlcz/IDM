package rai;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static ExternalDestination.ByIntent a() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        intent.addFlags(268435456);
        return new ExternalDestination.ByIntent(intent, null);
    }
}
