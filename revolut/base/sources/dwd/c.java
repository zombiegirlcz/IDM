package dwd;

import a19.e;
import akl.o;
import com.revolut.feature.staking.impl.service.unstaking.UnstakingLockedTransactionsService;
import dp4.a1;
import dt4.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnstakingLockedTransactionsService f120370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f120371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f120372c;

    public c(UnstakingLockedTransactionsService service, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f120370a = service;
        this.f120371b = memoryCache;
        Continuation continuation = null;
        this.f120372c = new x4l.c(new a1(this, continuation, 4), new dug.a(this, 7), new p(this, 10), new o(2, 29, continuation), new e(3, 26, continuation));
    }
}
