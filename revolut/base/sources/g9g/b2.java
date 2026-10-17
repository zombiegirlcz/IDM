package g9g;

import android.content.ContentResolver;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b2 implements e4m.e {
    public static x8g.b a(Context context, f01.c uiKitResources) {
        a2.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return new x8g.b(contentResolver, uiKitResources);
    }
}
