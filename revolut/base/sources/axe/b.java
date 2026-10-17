package axe;

import a09.o;
import akl.e0;
import av8.n;
import com.revolut.feature.topup_screen.impl.flows.checkout.post_activation.network.PostActivationService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PostActivationService f10930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f10931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f10932c;
    public final x4l.c d;

    public b(PostActivationService service, j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f10930a = service;
        this.f10931b = memoryCache;
        this.f10932c = storage;
        int i = 16;
        Continuation continuation = null;
        this.d = new x4l.c(new o(this, continuation, i), new auj.o(this, i), new n(this, 3), new e0(this, continuation, 28), new awd.b(this, continuation, 1));
    }
}
