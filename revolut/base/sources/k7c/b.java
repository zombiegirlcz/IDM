package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayService f181944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f181945b;

    public b(RevolutPayService revolutPayService, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(revolutPayService, "revolutPayService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f181944a = revolutPayService;
        this.f181945b = memoryCache;
    }
}
