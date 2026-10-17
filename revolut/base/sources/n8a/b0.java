package n8a;

import com.revolut.feature.pix.impl.data.network.PixQrCodeService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixQrCodeService f213297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f213298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.pix.impl.domain.error.b f213299c;
    public final x4l.c d;

    public b0(PixQrCodeService pixQrCodeService, ne0.d memoryCache, com.revolut.feature.pix.impl.domain.error.b pixErrorParser) {
        Intrinsics.checkNotNullParameter(pixQrCodeService, "pixQrCodeService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(pixErrorParser, "pixErrorParser");
        this.f213297a = pixQrCodeService;
        this.f213298b = memoryCache;
        this.f213299c = pixErrorParser;
        Continuation continuation = null;
        this.d = new x4l.c(new mtj.k(this, continuation, 6), new n7h.c(this, 4), new mz3.r(this, 28), new mqc.p(2, 7, continuation), new k3c.l(3, 28, continuation));
    }
}
