package rg3;

import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.feature.checklist_challenges.impl.network.ChecklistChallengesService;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import mle.x;
import org.jetbrains.annotations.NotNull;
import p24.q;
import pti.s;
import vkm.v1;
import vkm.y;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f254013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f254014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f254015c;
    public final ChecklistChallengesService d;
    public final n5b.d e;
    public final x4l.c f;

    public o(c cachedService, ne0.j memoryCache, ue0.c storage, ChecklistChallengesService service, n5b.d revPointsExclusiveStoreProvider) {
        Intrinsics.checkNotNullParameter(cachedService, "cachedService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(revPointsExclusiveStoreProvider, "revPointsExclusiveStoreProvider");
        this.f254013a = cachedService;
        this.f254014b = memoryCache;
        this.f254015c = storage;
        this.d = service;
        this.e = revPointsExclusiveStoreProvider;
        Continuation continuation = null;
        this.f = new x4l.c(new s(this, continuation, 7), new raf.o(this, 17), new r6f.i(this, 18), new r0e.c(this, continuation, 22), new q(this, continuation, 23));
    }

    public final y a(String str, Function1 function1) {
        return new y(new x(mo3.a.g(new v1(new mp6.j(26, this, function1, str, (Continuation) null)), null, new rd3.k(17), 1), function1, str, 20), new nx1.q(4, 2, null));
    }

    public final List b() {
        List list = (List) this.f254014b.get("CHALLENGES_KEY");
        return list == null ? (List) p.a.j(ChecklistChallenge.class, KTypeProjection.INSTANCE, List.class, this.f254015c, "CHALLENGES_KEY") : list;
    }
}
