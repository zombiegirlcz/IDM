package f5h;

import com.revolut.feature.wealth.commodity_additional_services.impl.data.additional_services.network.CommodityAdditionalServicesService;
import dp4.f1;
import eul.f;
import ew1.d;
import fnc.s;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommodityAdditionalServicesService f132326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f132327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f132328c;
    public final ue0.c d;
    public final x4l.c e;

    public c(CommodityAdditionalServicesService service, s mapper, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f132326a = service;
        this.f132327b = mapper;
        this.f132328c = memoryCache;
        this.d = storage;
        Continuation continuation = null;
        this.e = new x4l.c(new b(this, continuation, 0), new f0m.c(this, 10), new f(this, 16), new d(this, continuation, 25), new f1(this, continuation, 14));
    }
}
