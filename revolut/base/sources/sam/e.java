package sam;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f261461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qam.e f261462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2m.b f261463c;
    public f d;

    public e(Context context, qam.e device) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(context, "context");
        g rotationListener = new g(context);
        Intrinsics.checkNotNullParameter(rotationListener, "rotationListener");
        Intrinsics.checkNotNullParameter(device, "device");
        this.f261461a = rotationListener;
        this.f261462b = device;
        c2m.b bVar = new c2m.b(this, 6);
        this.d = new f(c.f261459c, device.b());
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        rotationListener.f261466a = bVar;
    }
}
