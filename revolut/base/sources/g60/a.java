package g60;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140810a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f140811b;

    public a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f140811b = activity;
    }

    public final void a(Intent intent, int i) {
        switch (this.f140810a) {
            case 0:
                Intrinsics.checkNotNullParameter(intent, "intent");
                ((com.revolut.kompot.navigable.a) this.f140811b).N2(intent, i, null);
                break;
            default:
                Intrinsics.checkNotNullParameter(intent, "intent");
                ((Activity) this.f140811b).startActivityForResult(intent, i);
                break;
        }
    }

    public a(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f140811b = controller;
    }
}
