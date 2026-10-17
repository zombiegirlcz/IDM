package k0d;

import com.revolut.feature.semi_independent_activation.impl.data.service.SemiIndependentActivationInvitationService;
import ghl.l;
import jv.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SemiIndependentActivationInvitationService f180019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f180020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe0.e f180021c;
    public final x4l.c d;

    public f(SemiIndependentActivationInvitationService service, ne0.d memoryCache, xe0.e storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f180019a = service;
        this.f180020b = memoryCache;
        this.f180021c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new l(this, continuation, 26), new c(this, 0), new jnf.d(this, 26), new o(this, continuation, 10), new j40.d(this, continuation, 8));
    }

    public static String a(String str) {
        return j6.a.q("MEMORY_CACHE_KEY_INCOMING_INVITATIONS_", str);
    }
}
