package cam;

import android.content.Context;
import android.webkit.WebView;
import financial.atomic.transact.activity.TransactActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22678a;

    public g(TransactActivity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22678a = context;
        WebView.setWebContentsDebuggingEnabled(false);
        try {
            WebView.setDataDirectorySuffix("transact");
        } catch (IllegalStateException unused) {
        }
    }
}
