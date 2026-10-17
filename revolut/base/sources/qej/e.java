package qej;

import android.content.Context;
import android.telephony.euicc.EuiccManager;
import kotlin.jvm.internal.Intrinsics;
import q97.p1;
import te0.w;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f245188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sej.a f245189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rej.e f245190c;
    public final z1 d;
    public final Object e;

    public e(Context context, rej.f sdkVersionProvider, sej.a broadcastReceiverProvider, rej.e downloadEsimIntentProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkVersionProvider, "sdkVersionProvider");
        Intrinsics.checkNotNullParameter(broadcastReceiverProvider, "broadcastReceiverProvider");
        Intrinsics.checkNotNullParameter(downloadEsimIntentProvider, "downloadEsimIntentProvider");
        this.f245188a = context;
        this.f245189b = broadcastReceiverProvider;
        this.f245190c = downloadEsimIntentProvider;
        this.d = q.a(0, 1, ukm.f.DROP_OLDEST);
        this.e = w.y0(new p1(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final EuiccManager a() {
        if (((Boolean) this.e.getValue()).booleanValue()) {
            return (EuiccManager) this.f245188a.getSystemService("euicc");
        }
        return null;
    }
}
