package jb5;

import com.revolut.feature.credit.tiles.impl.network.services.CreditTilesService;
import e6d.f;
import j2c.b;
import j2c.n;
import j87.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import ve0.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditTilesService f172595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f172596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f172597c;
    public final x4l.c d;

    public a(CreditTilesService api2, d memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f172595a = api2;
        this.f172596b = memoryCache;
        this.f172597c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new f(this, continuation, 28), new m(this, 12), new n(this, 26), new b(this, continuation, 14), new hwi.b(this, continuation, 12));
    }
}
