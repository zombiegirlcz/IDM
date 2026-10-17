package cve;

import bwb.n;
import cnc.t;
import com.revolut.feature.topup_screen.impl.data.network.service.StoredMethodService;
import cul.n0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f109337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoredMethodService f109338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej9.c f109339c;
    public final x4l.c d;

    public c(j memoryCache, StoredMethodService storedMethodService, ej9.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storedMethodService, "storedMethodService");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f109337a = memoryCache;
        this.f109338b = storedMethodService;
        this.f109339c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new cuh.a(this, continuation, 1), new n0(this, 10), new t(this, 26), new ck7.j(this, continuation, 29), new n(this, continuation, 18));
    }

    public static String a(String str) {
        return j6.a.q("INDIA_STORED_METHOD_KEY_storedMethodId=", str);
    }
}
