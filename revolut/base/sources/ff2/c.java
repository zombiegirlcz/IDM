package ff2;

import com.revolut.feature.apm.upi.impl.data.network.UpiQrCodeService;
import dp4.z0;
import e6d.f;
import fca.d;
import gim.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiQrCodeService f134699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f134700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f134701c;
    public final x4l.c d;

    public c(UpiQrCodeService service, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f134699a = service;
        this.f134700b = storage;
        this.f134701c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new f(this, continuation, 6), new d(this, 9), new eul.f(this, 29), new b(this, continuation, 0), new z0(this, continuation, 10), new b(this, continuation, 1));
    }

    public final Object a(Long l2, i iVar) {
        jo3.a aVar;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            xi0.b.Companion.getClass();
            aVar = new jo3.a(jLongValue, xi0.b.E.f306286a);
        } else {
            aVar = null;
        }
        return this.f134699a.generateUpiIdQrCode(new df2.c(aVar), iVar);
    }
}
