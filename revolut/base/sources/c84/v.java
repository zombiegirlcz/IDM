package c84;

import android.content.Intent;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class v {
    private v() {
    }

    public static u a(Intent intent) {
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("key-credit-application-plugin-status") : null;
        if (serializableExtra instanceof u) {
            return (u) serializableExtra;
        }
        return null;
    }

    public static Map b(it3.d creditApplicationPluginStatus, boolean z) {
        Intrinsics.checkNotNullParameter(creditApplicationPluginStatus, "creditApplicationPluginStatus");
        return q0.c(new Pair("key-credit-application-plugin-status", new u(creditApplicationPluginStatus, z)));
    }
}
