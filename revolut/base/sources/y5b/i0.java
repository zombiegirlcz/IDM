package y5b;

import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsWidgetService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsWidgetService f311045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f311046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f311047c;
    public final x4l.c d;

    public i0(CobrandedCardsWidgetService service, ue0.c storage, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f311045a = service;
        this.f311046b = storage;
        this.f311047c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new wtc.b0(this, continuation, 11), new y1.a(this, 17), new xwd.a(this, 23), new xni.h(this, continuation, 29), new wa7.j(this, continuation, 18));
    }
}
