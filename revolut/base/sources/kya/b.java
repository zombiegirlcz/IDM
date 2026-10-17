package kya;

import com.revolut.feature.referrals.shared.ui.impl.network.services.ReferralsTroubleshooterService;
import k3c.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kv7.g;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f190637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReferralsTroubleshooterService f190638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f190639c;
    public final x4l.c d;

    public b(c storage, ReferralsTroubleshooterService service, j memoryCache) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f190637a = storage;
        this.f190638b = service;
        this.f190639c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new k(this, continuation, 7), new g(this, 17), new kj4.c(this, 24), new ko2.b(this, continuation, 11), new hwi.b(this, continuation, 29));
    }
}
