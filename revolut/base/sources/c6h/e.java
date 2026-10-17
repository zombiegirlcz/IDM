package c6h;

import bwb.n;
import c1i.f;
import c69.v;
import com.google.gson.reflect.TypeToken;
import com.revolut.feature.wealth.gia.margin_trading.impl.data.network.WealthMarginRequiredMinimumService;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements a {

    @NotNull
    private static final b Companion = new b();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthMarginRequiredMinimumService f21804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f21805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f21806c;
    public final x4l.c d;

    static {
        Type type = new TypeToken<i6h.d>() { // from class: com.revolut.feature.wealth.gia.margin_trading.impl.data.repository.WealthMarginRequiredMinimumRepositoryImpl$Companion$MARGIN_REQUIRED_MINIMUM_PAGE_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public e(WealthMarginRequiredMinimumService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f21804a = service;
        this.f21805b = memoryCache;
        this.f21806c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new b6a.d(this, continuation, 17), new v(this, 1), new bwd.a(this, 26), new f(this, continuation, 13), new n(this, continuation, 4));
    }
}
