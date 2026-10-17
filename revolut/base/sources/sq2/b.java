package sq2;

import com.revolut.feature.banners.impl.data.network.BannersService;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import sl5.g;
import w4l.f;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannersService f264990a;

    public b(BannersService service, oq2.a dao, d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f264990a = service;
        new f(new g(22), new soi.a(this, 9), new g(this, 23), new soi.a(this, 10), new g(this, 24), null, null, null, BERTags.FLAGS);
    }
}
