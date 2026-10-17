package e76;

import com.revolut.feature.defi.transactions.impl.data.network.DeFiFeeBreakdownService;
import dp4.a1;
import dp4.f1;
import e54.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiFeeBreakdownService f123087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f123088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f123089c;
    public final x4l.c d;

    public d(DeFiFeeBreakdownService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f123087a = service;
        this.f123088b = memoryCache;
        this.f123089c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new a1(this, continuation, 8), new e2j.j(this, 22), new r(this, 4), new e0b.c(this, continuation, 20), new f1(this, continuation, 3));
    }
}
