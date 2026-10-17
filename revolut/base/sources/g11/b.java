package g11;

import com.revolut.crypto.challenge.impl.service.ChallengeRewardsService;
import dp4.z0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import org.jetbrains.annotations.NotNull;
import x4l.c;
import xe0.e;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f139514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f139515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChallengeRewardsService f139516c;
    public final e11.b d;
    public final c e;

    public b(e storage, d memoryCache, ChallengeRewardsService challengeRewardsService, e11.b challengeStatusMapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(challengeRewardsService, "challengeRewardsService");
        Intrinsics.checkNotNullParameter(challengeStatusMapper, "challengeStatusMapper");
        this.f139514a = storage;
        this.f139515b = memoryCache;
        this.f139516c = challengeRewardsService;
        this.d = challengeStatusMapper;
        Continuation continuation = null;
        this.e = new c(new frk.a(this, continuation, 3), new g1.b(this, 4), new fv1.a(this, 16), new ft.d(this, continuation, 15), new z0(this, continuation, 13));
    }
}
