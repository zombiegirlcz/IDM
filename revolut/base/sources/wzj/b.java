package wzj;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import org.jetbrains.annotations.NotNull;
import rzj.c;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements vzj.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f301426b = r0.k(new Pair("GENERAL_MARKET", c.GENERAL_MARKET), new Pair("STOCK_MARKET", c.STOCK_MARKET), new Pair("CRYPTO_MARKET", c.CRYPTO_MARKET), new Pair("COMMODITY_MARKET", c.COMMODITY_MARKET));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f301427a;

    public b(d memoryCache) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f301427a = memoryCache;
    }
}
