package un8;

import com.revolut.feature.junior_settings.impl.services.JuniorDeviceService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th6.p;
import umd.n;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorDeviceService f281355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f281356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f281357c;
    public final x4l.c d;

    public b(JuniorDeviceService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f281355a = service;
        this.f281356b = memoryCache;
        this.f281357c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new p(this, continuation, 6), new um7.d(this, 5), new n(this, 2), new uf0.d(this, continuation, 20), new sne.e(this, continuation, 11));
    }

    public static String a(String str) {
        return j6.a.q("devices_", str);
    }
}
