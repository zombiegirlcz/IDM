package aw0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    private t1() {
    }

    public static v1 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kli.a.q(context) ? v1.DARK : v1.LIGHT;
    }
}
