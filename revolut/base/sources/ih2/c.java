package ih2;

import com.revolut.feature.apm.wero.impl.data.WeroPayService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeroPayService f161288a;

    public c(WeroPayService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f161288a = service;
    }
}
