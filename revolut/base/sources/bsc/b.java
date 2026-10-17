package bsc;

import a09.o;
import brc.h;
import com.revolut.feature.sca_prompt.impl.data.service.CryptoScaPromptService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f18158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f18159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoScaPromptService f18160c;
    public final x4l.c d;

    public b(ue0.c storage, j memoryCache, CryptoScaPromptService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f18158a = storage;
        this.f18159b = memoryCache;
        this.f18160c = service;
        Continuation continuation = null;
        this.d = new x4l.c(new o(this, continuation, 21), new bq7.j(this, 7), new bhi.c(this, 23), new h(this, continuation, 4), new awd.b(this, continuation, 12));
    }
}
