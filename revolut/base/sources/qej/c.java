package qej;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import android.telephony.SubscriptionManager;
import android.telephony.euicc.EuiccManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f245182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f245183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f245184c;
    public final Object d;

    public c(Context context, rej.f sdkVersionProvider, rej.a dataSubscriptionIdProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkVersionProvider, "sdkVersionProvider");
        Intrinsics.checkNotNullParameter(dataSubscriptionIdProvider, "dataSubscriptionIdProvider");
        this.f245182a = context;
        final int i = 0;
        this.f245183b = w.y0(new Function0(this) { // from class: qej.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f245181b;

            {
                this.f245181b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(this.f245181b.f245182a.getPackageManager().hasSystemFeature("android.hardware.telephony.euicc"));
                    case 1:
                        return Boolean.valueOf(this.f245181b.f245182a.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription"));
                    default:
                        Object systemService = this.f245181b.f245182a.getSystemService("user");
                        Intrinsics.i(systemService, "null cannot be cast to non-null type android.os.UserManager");
                        return (UserManager) systemService;
                }
            }
        });
        final int i2 = 1;
        this.f245184c = w.y0(new Function0(this) { // from class: qej.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f245181b;

            {
                this.f245181b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(this.f245181b.f245182a.getPackageManager().hasSystemFeature("android.hardware.telephony.euicc"));
                    case 1:
                        return Boolean.valueOf(this.f245181b.f245182a.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription"));
                    default:
                        Object systemService = this.f245181b.f245182a.getSystemService("user");
                        Intrinsics.i(systemService, "null cannot be cast to non-null type android.os.UserManager");
                        return (UserManager) systemService;
                }
            }
        });
        final int i3 = 2;
        this.d = w.y0(new Function0(this) { // from class: qej.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f245181b;

            {
                this.f245181b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(this.f245181b.f245182a.getPackageManager().hasSystemFeature("android.hardware.telephony.euicc"));
                    case 1:
                        return Boolean.valueOf(this.f245181b.f245182a.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription"));
                    default:
                        Object systemService = this.f245181b.f245182a.getSystemService("user");
                        Intrinsics.i(systemService, "null cannot be cast to non-null type android.os.UserManager");
                        return (UserManager) systemService;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean a() {
        EuiccManager euiccManager;
        if (((Boolean) this.f245183b.getValue()).booleanValue()) {
            Object systemService = this.f245182a.getSystemService("euicc");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.telephony.euicc.EuiccManager");
            euiccManager = (EuiccManager) systemService;
        } else {
            euiccManager = null;
        }
        if (pd.b.j(euiccManager != null ? Boolean.valueOf(euiccManager.isEnabled()) : null)) {
            return Build.VERSION.SDK_INT < 35 || !((UserManager) this.d.getValue()).hasUserRestriction("no_sim_globally");
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final SubscriptionManager b() {
        if (!((Boolean) this.f245184c.getValue()).booleanValue()) {
            return null;
        }
        Object systemService = this.f245182a.getSystemService("telephony_subscription_service");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.telephony.SubscriptionManager");
        return (SubscriptionManager) systemService;
    }
}
