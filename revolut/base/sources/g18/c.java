package g18;

import com.revolut.feature.invest.smart_notifications.impl.data.network.InvestSmartNotificationsService;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestSmartNotificationsService f139560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f139561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f139562c;

    public c(InvestSmartNotificationsService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f139560a = service;
        this.f139561b = memoryCache;
        this.f139562c = storage;
    }

    public static String a(String str) {
        return j6.a.q("AIR_TIP_KEY_", str);
    }
}
