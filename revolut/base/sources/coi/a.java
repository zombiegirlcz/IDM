package coi;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import pd.g;
import td.c;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25549b;

    public a(b bVar) {
        this.f25548a = 0;
        this.f25549b = bVar;
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f25548a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                b bVar = (b) this.f25549b;
                if (!bVar.f25552c) {
                    bVar.f25552c = true;
                    bVar.d = bundle != null;
                    break;
                }
                break;
            default:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f25549b;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                        break;
                    } catch (RuntimeException e) {
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                                td.b bVar2 = (td.b) g.c().b(td.b.class);
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                if (bVar2 != null) {
                                    String string2 = bundle2.getString("google.c.a.c_id");
                                    c cVar = (c) bVar2;
                                    if (ud.a.c("fcm") && ud.a.d("fcm", "_ln")) {
                                        cVar.f269904a.setUserProperty("fcm", "_ln", string2);
                                    }
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("source", "Firebase");
                                    bundle3.putString("medium", "notification");
                                    bundle3.putString("campaign", string2);
                                    cVar.a("fcm", "_cmp", bundle3);
                                }
                            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                            }
                        }
                        s.p(bundle2, "_no");
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f25548a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f25548a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f25548a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        switch (this.f25548a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f25548a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f25548a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "activity");
                break;
        }
    }

    public a() {
        this.f25548a = 1;
        this.f25549b = new ArrayDeque(10);
    }
}
