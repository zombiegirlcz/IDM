package n80;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f213185a;

    public d(PackageManager packageManager) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        this.f213185a = packageManager;
    }

    public final boolean a(String str, Uri uri2, List flags) {
        Intrinsics.checkNotNullParameter("android.intent.action.VIEW", "intentAction");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri2, str);
        Iterator it8 = flags.iterator();
        while (it8.hasNext()) {
            intent.addFlags(((Number) it8.next()).intValue());
        }
        Intrinsics.checkNotNullExpressionValue(this.f213185a.queryIntentActivities(intent, 65536), "queryIntentActivities(...)");
        return !r3.isEmpty();
    }
}
