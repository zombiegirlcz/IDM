package h9f;

import g2e.m0;
import ghl.l;
import gul.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f150241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f150242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4m.a f150243c;
    public final x4l.c d;

    public d(d4m.a service, j memoryCache, d4m.a storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f150241a = service;
        this.f150242b = memoryCache;
        this.f150243c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new l(this, continuation, 2), new h56.a(this, 12), new h1c.c(this, 18), new n(this, continuation, 26), new m0(this, continuation, 15));
    }

    public static String a(String str) {
        return j6.a.q("STOCK_TRANSFER_ID_", str);
    }
}
