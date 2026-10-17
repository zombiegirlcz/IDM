package mtj;

import au6.u;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import com.revolut.retail.feature.impl.rewards_hub.network.RewardsHubService;
import d0j.c0;
import d0j.h0;
import d0j.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7c.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import wp5.y;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements e {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RewardsHubService f208893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f208894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f208895c;
    public final xe0.e d;
    public final mk0.a e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f208896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f208897h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f208898j;
    public final s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x4l.c f208899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x4l.c f208900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x4l.c f208901n;

    static {
        Intrinsics.checkNotNullParameter("CHALLENGE_DETAILS_CONFETTI", "id");
    }

    public q(ze0.a forceReloadStrategyFactory, RewardsHubService rewardsHubService, d cachedService, ne0.d memoryCache, xe0.e storage, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        Intrinsics.checkNotNullParameter(rewardsHubService, "rewardsHubService");
        Intrinsics.checkNotNullParameter(cachedService, "cachedService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f208893a = rewardsHubService;
        this.f208894b = cachedService;
        this.f208895c = memoryCache;
        this.d = storage;
        this.e = personalisationStorage;
        Continuation continuation = null;
        l lVar = new l(this, continuation, 1);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: mtj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208875b;

            {
                this.f208875b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (d0j.f) this.f208875b.f208895c.get("REWARDS_HUB_MEMORY_KEY");
                    case 1:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0j.k) this.f208875b.f208895c.get(q.b(params));
                    case 2:
                        String param = (String) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        return (c0) this.f208875b.f208895c.get(q.e(param));
                    case 3:
                        d0j.l params2 = (d0j.l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f110420b == null) {
                            return (d0j.q) this.f208875b.f208895c.get(q.c(params2.f110419a));
                        }
                        return null;
                    case 4:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (h0) this.f208875b.f208895c.get("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY");
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Boolean) this.f208875b.f208895c.get("CHALLENGES_ELIGIBILITY_MEMORY_KEY");
                    case 6:
                        String collectionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        return (r) v1.c.s("COLLECTION_MEMORY_KEY_", collectionId, this.f208875b.f208895c);
                    default:
                        String screen = (String) obj2;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (List) v1.c.s("REWARDS_HUB_WIDGET_MEMORY_KEY_", screen, this.f208875b.f208895c);
                }
            }
        };
        final int i2 = 6;
        this.f = new x4l.c(lVar, function1, new Function2(this) { // from class: mtj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208877b;

            {
                this.f208877b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        d0j.k domain = (d0j.k) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f208877b.f208895c.f(q.b(params), domain);
                        break;
                    case 1:
                        String param = (String) obj2;
                        c0 domain2 = (c0) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f208877b.f208895c.f(q.e(param), domain2);
                        break;
                    case 2:
                        d0j.l params2 = (d0j.l) obj2;
                        d0j.q page = (d0j.q) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (params2.f110420b == null) {
                            this.f208877b.f208895c.f(q.c(params2.f110419a), page);
                        }
                        break;
                    case 3:
                        h0 count = (h0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(count, "count");
                        this.f208877b.f208895c.f("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY", count);
                        break;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f208877b.f208895c.f("CHALLENGES_ELIGIBILITY_MEMORY_KEY", bool);
                        break;
                    case 5:
                        String collectionId = (String) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f208877b.f208895c.f("COLLECTION_MEMORY_KEY_" + collectionId, domain3);
                        break;
                    case 6:
                        d0j.f domain4 = (d0j.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_MEMORY_KEY", domain4);
                        break;
                    default:
                        String screen = (String) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_WIDGET_MEMORY_KEY_" + screen, domain5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 1), new l05.b(this, continuation, 16));
        final int i3 = 7;
        this.f208896g = new x4l.c(new n(this, continuation, 2), new Function1(this) { // from class: mtj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208875b;

            {
                this.f208875b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (d0j.f) this.f208875b.f208895c.get("REWARDS_HUB_MEMORY_KEY");
                    case 1:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0j.k) this.f208875b.f208895c.get(q.b(params));
                    case 2:
                        String param = (String) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        return (c0) this.f208875b.f208895c.get(q.e(param));
                    case 3:
                        d0j.l params2 = (d0j.l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f110420b == null) {
                            return (d0j.q) this.f208875b.f208895c.get(q.c(params2.f110419a));
                        }
                        return null;
                    case 4:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (h0) this.f208875b.f208895c.get("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY");
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Boolean) this.f208875b.f208895c.get("CHALLENGES_ELIGIBILITY_MEMORY_KEY");
                    case 6:
                        String collectionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        return (r) v1.c.s("COLLECTION_MEMORY_KEY_", collectionId, this.f208875b.f208895c);
                    default:
                        String screen = (String) obj2;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (List) v1.c.s("REWARDS_HUB_WIDGET_MEMORY_KEY_", screen, this.f208875b.f208895c);
                }
            }
        }, new Function2(this) { // from class: mtj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208877b;

            {
                this.f208877b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        d0j.k domain = (d0j.k) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f208877b.f208895c.f(q.b(params), domain);
                        break;
                    case 1:
                        String param = (String) obj2;
                        c0 domain2 = (c0) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f208877b.f208895c.f(q.e(param), domain2);
                        break;
                    case 2:
                        d0j.l params2 = (d0j.l) obj2;
                        d0j.q page = (d0j.q) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (params2.f110420b == null) {
                            this.f208877b.f208895c.f(q.c(params2.f110419a), page);
                        }
                        break;
                    case 3:
                        h0 count = (h0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(count, "count");
                        this.f208877b.f208895c.f("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY", count);
                        break;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f208877b.f208895c.f("CHALLENGES_ELIGIBILITY_MEMORY_KEY", bool);
                        break;
                    case 5:
                        String collectionId = (String) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f208877b.f208895c.f("COLLECTION_MEMORY_KEY_" + collectionId, domain3);
                        break;
                    case 6:
                        d0j.f domain4 = (d0j.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_MEMORY_KEY", domain4);
                        break;
                    default:
                        String screen = (String) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_WIDGET_MEMORY_KEY_" + screen, domain5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, 4), new lp6.g(this, continuation, 14));
        x xVar = new x(this, continuation, 29);
        final int i5 = 1;
        Function1 function12 = new Function1(this) { // from class: mtj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208875b;

            {
                this.f208875b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (d0j.f) this.f208875b.f208895c.get("REWARDS_HUB_MEMORY_KEY");
                    case 1:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0j.k) this.f208875b.f208895c.get(q.b(params));
                    case 2:
                        String param = (String) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        return (c0) this.f208875b.f208895c.get(q.e(param));
                    case 3:
                        d0j.l params2 = (d0j.l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f110420b == null) {
                            return (d0j.q) this.f208875b.f208895c.get(q.c(params2.f110419a));
                        }
                        return null;
                    case 4:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (h0) this.f208875b.f208895c.get("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY");
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Boolean) this.f208875b.f208895c.get("CHALLENGES_ELIGIBILITY_MEMORY_KEY");
                    case 6:
                        String collectionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        return (r) v1.c.s("COLLECTION_MEMORY_KEY_", collectionId, this.f208875b.f208895c);
                    default:
                        String screen = (String) obj2;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (List) v1.c.s("REWARDS_HUB_WIDGET_MEMORY_KEY_", screen, this.f208875b.f208895c);
                }
            }
        };
        final int i6 = 0;
        this.f208897h = new x4l.c(xVar, function12, new Function2(this) { // from class: mtj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208877b;

            {
                this.f208877b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        d0j.k domain = (d0j.k) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f208877b.f208895c.f(q.b(params), domain);
                        break;
                    case 1:
                        String param = (String) obj2;
                        c0 domain2 = (c0) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f208877b.f208895c.f(q.e(param), domain2);
                        break;
                    case 2:
                        d0j.l params2 = (d0j.l) obj2;
                        d0j.q page = (d0j.q) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (params2.f110420b == null) {
                            this.f208877b.f208895c.f(q.c(params2.f110419a), page);
                        }
                        break;
                    case 3:
                        h0 count = (h0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(count, "count");
                        this.f208877b.f208895c.f("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY", count);
                        break;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f208877b.f208895c.f("CHALLENGES_ELIGIBILITY_MEMORY_KEY", bool);
                        break;
                    case 5:
                        String collectionId = (String) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f208877b.f208895c.f("COLLECTION_MEMORY_KEY_" + collectionId, domain3);
                        break;
                    case 6:
                        d0j.f domain4 = (d0j.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_MEMORY_KEY", domain4);
                        break;
                    default:
                        String screen = (String) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_WIDGET_MEMORY_KEY_" + screen, domain5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, i6), new lp6.g(this, continuation, 10));
        n nVar = new n(this, continuation, 1);
        final int i21 = 2;
        Function1 function13 = new Function1(this) { // from class: mtj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208875b;

            {
                this.f208875b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (d0j.f) this.f208875b.f208895c.get("REWARDS_HUB_MEMORY_KEY");
                    case 1:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0j.k) this.f208875b.f208895c.get(q.b(params));
                    case 2:
                        String param = (String) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        return (c0) this.f208875b.f208895c.get(q.e(param));
                    case 3:
                        d0j.l params2 = (d0j.l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f110420b == null) {
                            return (d0j.q) this.f208875b.f208895c.get(q.c(params2.f110419a));
                        }
                        return null;
                    case 4:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (h0) this.f208875b.f208895c.get("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY");
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Boolean) this.f208875b.f208895c.get("CHALLENGES_ELIGIBILITY_MEMORY_KEY");
                    case 6:
                        String collectionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        return (r) v1.c.s("COLLECTION_MEMORY_KEY_", collectionId, this.f208875b.f208895c);
                    default:
                        String screen = (String) obj2;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (List) v1.c.s("REWARDS_HUB_WIDGET_MEMORY_KEY_", screen, this.f208875b.f208895c);
                }
            }
        };
        final int i22 = 1;
        this.i = new x4l.c(nVar, function13, new Function2(this) { // from class: mtj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208877b;

            {
                this.f208877b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        d0j.k domain = (d0j.k) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f208877b.f208895c.f(q.b(params), domain);
                        break;
                    case 1:
                        String param = (String) obj2;
                        c0 domain2 = (c0) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f208877b.f208895c.f(q.e(param), domain2);
                        break;
                    case 2:
                        d0j.l params2 = (d0j.l) obj2;
                        d0j.q page = (d0j.q) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (params2.f110420b == null) {
                            this.f208877b.f208895c.f(q.c(params2.f110419a), page);
                        }
                        break;
                    case 3:
                        h0 count = (h0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(count, "count");
                        this.f208877b.f208895c.f("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY", count);
                        break;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f208877b.f208895c.f("CHALLENGES_ELIGIBILITY_MEMORY_KEY", bool);
                        break;
                    case 5:
                        String collectionId = (String) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f208877b.f208895c.f("COLLECTION_MEMORY_KEY_" + collectionId, domain3);
                        break;
                    case 6:
                        d0j.f domain4 = (d0j.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_MEMORY_KEY", domain4);
                        break;
                    default:
                        String screen = (String) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_WIDGET_MEMORY_KEY_" + screen, domain5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, 3), new lp6.g(this, continuation, 13));
        k kVar = new k(this, continuation, 0);
        final int i32 = 3;
        Function1 function14 = new Function1(this) { // from class: mtj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208875b;

            {
                this.f208875b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i32) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (d0j.f) this.f208875b.f208895c.get("REWARDS_HUB_MEMORY_KEY");
                    case 1:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0j.k) this.f208875b.f208895c.get(q.b(params));
                    case 2:
                        String param = (String) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        return (c0) this.f208875b.f208895c.get(q.e(param));
                    case 3:
                        d0j.l params2 = (d0j.l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f110420b == null) {
                            return (d0j.q) this.f208875b.f208895c.get(q.c(params2.f110419a));
                        }
                        return null;
                    case 4:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (h0) this.f208875b.f208895c.get("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY");
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Boolean) this.f208875b.f208895c.get("CHALLENGES_ELIGIBILITY_MEMORY_KEY");
                    case 6:
                        String collectionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        return (r) v1.c.s("COLLECTION_MEMORY_KEY_", collectionId, this.f208875b.f208895c);
                    default:
                        String screen = (String) obj2;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (List) v1.c.s("REWARDS_HUB_WIDGET_MEMORY_KEY_", screen, this.f208875b.f208895c);
                }
            }
        };
        final int i33 = 2;
        this.f208898j = new x4l.c(kVar, function14, new Function2(this) { // from class: mtj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208877b;

            {
                this.f208877b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        d0j.k domain = (d0j.k) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f208877b.f208895c.f(q.b(params), domain);
                        break;
                    case 1:
                        String param = (String) obj2;
                        c0 domain2 = (c0) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f208877b.f208895c.f(q.e(param), domain2);
                        break;
                    case 2:
                        d0j.l params2 = (d0j.l) obj2;
                        d0j.q page = (d0j.q) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (params2.f110420b == null) {
                            this.f208877b.f208895c.f(q.c(params2.f110419a), page);
                        }
                        break;
                    case 3:
                        h0 count = (h0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(count, "count");
                        this.f208877b.f208895c.f("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY", count);
                        break;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f208877b.f208895c.f("CHALLENGES_ELIGIBILITY_MEMORY_KEY", bool);
                        break;
                    case 5:
                        String collectionId = (String) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f208877b.f208895c.f("COLLECTION_MEMORY_KEY_" + collectionId, domain3);
                        break;
                    case 6:
                        d0j.f domain4 = (d0j.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_MEMORY_KEY", domain4);
                        break;
                    default:
                        String screen = (String) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_WIDGET_MEMORY_KEY_" + screen, domain5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, 1), new lp6.g(this, continuation, 11));
        this.k = ((ze0.c) forceReloadStrategyFactory).b(30000L);
        final int i43 = 4;
        final int i59 = 3;
        this.f208899l = new x4l.c(new l(this, continuation, 2), new Function1(this) { // from class: mtj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208875b;

            {
                this.f208875b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i43) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (d0j.f) this.f208875b.f208895c.get("REWARDS_HUB_MEMORY_KEY");
                    case 1:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0j.k) this.f208875b.f208895c.get(q.b(params));
                    case 2:
                        String param = (String) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        return (c0) this.f208875b.f208895c.get(q.e(param));
                    case 3:
                        d0j.l params2 = (d0j.l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f110420b == null) {
                            return (d0j.q) this.f208875b.f208895c.get(q.c(params2.f110419a));
                        }
                        return null;
                    case 4:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (h0) this.f208875b.f208895c.get("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY");
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Boolean) this.f208875b.f208895c.get("CHALLENGES_ELIGIBILITY_MEMORY_KEY");
                    case 6:
                        String collectionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        return (r) v1.c.s("COLLECTION_MEMORY_KEY_", collectionId, this.f208875b.f208895c);
                    default:
                        String screen = (String) obj2;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (List) v1.c.s("REWARDS_HUB_WIDGET_MEMORY_KEY_", screen, this.f208875b.f208895c);
                }
            }
        }, new Function2(this) { // from class: mtj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208877b;

            {
                this.f208877b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i59) {
                    case 0:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        d0j.k domain = (d0j.k) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f208877b.f208895c.f(q.b(params), domain);
                        break;
                    case 1:
                        String param = (String) obj2;
                        c0 domain2 = (c0) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f208877b.f208895c.f(q.e(param), domain2);
                        break;
                    case 2:
                        d0j.l params2 = (d0j.l) obj2;
                        d0j.q page = (d0j.q) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (params2.f110420b == null) {
                            this.f208877b.f208895c.f(q.c(params2.f110419a), page);
                        }
                        break;
                    case 3:
                        h0 count = (h0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(count, "count");
                        this.f208877b.f208895c.f("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY", count);
                        break;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f208877b.f208895c.f("CHALLENGES_ELIGIBILITY_MEMORY_KEY", bool);
                        break;
                    case 5:
                        String collectionId = (String) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f208877b.f208895c.f("COLLECTION_MEMORY_KEY_" + collectionId, domain3);
                        break;
                    case 6:
                        d0j.f domain4 = (d0j.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_MEMORY_KEY", domain4);
                        break;
                    default:
                        String screen = (String) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_WIDGET_MEMORY_KEY_" + screen, domain5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 2), new l05.b(this, continuation, 17));
        final int i66 = 5;
        final int i74 = 4;
        this.f208900m = new x4l.c(new l(this, continuation, 0), new Function1(this) { // from class: mtj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208875b;

            {
                this.f208875b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i66) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (d0j.f) this.f208875b.f208895c.get("REWARDS_HUB_MEMORY_KEY");
                    case 1:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0j.k) this.f208875b.f208895c.get(q.b(params));
                    case 2:
                        String param = (String) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        return (c0) this.f208875b.f208895c.get(q.e(param));
                    case 3:
                        d0j.l params2 = (d0j.l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f110420b == null) {
                            return (d0j.q) this.f208875b.f208895c.get(q.c(params2.f110419a));
                        }
                        return null;
                    case 4:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (h0) this.f208875b.f208895c.get("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY");
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Boolean) this.f208875b.f208895c.get("CHALLENGES_ELIGIBILITY_MEMORY_KEY");
                    case 6:
                        String collectionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        return (r) v1.c.s("COLLECTION_MEMORY_KEY_", collectionId, this.f208875b.f208895c);
                    default:
                        String screen = (String) obj2;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (List) v1.c.s("REWARDS_HUB_WIDGET_MEMORY_KEY_", screen, this.f208875b.f208895c);
                }
            }
        }, new Function2(this) { // from class: mtj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208877b;

            {
                this.f208877b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i74) {
                    case 0:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        d0j.k domain = (d0j.k) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f208877b.f208895c.f(q.b(params), domain);
                        break;
                    case 1:
                        String param = (String) obj2;
                        c0 domain2 = (c0) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f208877b.f208895c.f(q.e(param), domain2);
                        break;
                    case 2:
                        d0j.l params2 = (d0j.l) obj2;
                        d0j.q page = (d0j.q) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (params2.f110420b == null) {
                            this.f208877b.f208895c.f(q.c(params2.f110419a), page);
                        }
                        break;
                    case 3:
                        h0 count = (h0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(count, "count");
                        this.f208877b.f208895c.f("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY", count);
                        break;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f208877b.f208895c.f("CHALLENGES_ELIGIBILITY_MEMORY_KEY", bool);
                        break;
                    case 5:
                        String collectionId = (String) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f208877b.f208895c.f("COLLECTION_MEMORY_KEY_" + collectionId, domain3);
                        break;
                    case 6:
                        d0j.f domain4 = (d0j.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_MEMORY_KEY", domain4);
                        break;
                    default:
                        String screen = (String) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_WIDGET_MEMORY_KEY_" + screen, domain5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new m(this, continuation, 0), new u(this, continuation, 7));
        final int i92 = 6;
        final int i96 = 5;
        this.f208901n = new x4l.c(new n(this, continuation, 0), new Function1(this) { // from class: mtj.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208875b;

            {
                this.f208875b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i92) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (d0j.f) this.f208875b.f208895c.get("REWARDS_HUB_MEMORY_KEY");
                    case 1:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (d0j.k) this.f208875b.f208895c.get(q.b(params));
                    case 2:
                        String param = (String) obj2;
                        Intrinsics.checkNotNullParameter(param, "param");
                        return (c0) this.f208875b.f208895c.get(q.e(param));
                    case 3:
                        d0j.l params2 = (d0j.l) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        if (params2.f110420b == null) {
                            return (d0j.q) this.f208875b.f208895c.get(q.c(params2.f110419a));
                        }
                        return null;
                    case 4:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (h0) this.f208875b.f208895c.get("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY");
                    case 5:
                        Unit it10 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        return (Boolean) this.f208875b.f208895c.get("CHALLENGES_ELIGIBILITY_MEMORY_KEY");
                    case 6:
                        String collectionId = (String) obj2;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        return (r) v1.c.s("COLLECTION_MEMORY_KEY_", collectionId, this.f208875b.f208895c);
                    default:
                        String screen = (String) obj2;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        return (List) v1.c.s("REWARDS_HUB_WIDGET_MEMORY_KEY_", screen, this.f208875b.f208895c);
                }
            }
        }, new Function2(this) { // from class: mtj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f208877b;

            {
                this.f208877b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i96) {
                    case 0:
                        RewardsHubChallengeDetailsParams params = (RewardsHubChallengeDetailsParams) obj2;
                        d0j.k domain = (d0j.k) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f208877b.f208895c.f(q.b(params), domain);
                        break;
                    case 1:
                        String param = (String) obj2;
                        c0 domain2 = (c0) obj3;
                        Intrinsics.checkNotNullParameter(param, "param");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f208877b.f208895c.f(q.e(param), domain2);
                        break;
                    case 2:
                        d0j.l params2 = (d0j.l) obj2;
                        d0j.q page = (d0j.q) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (params2.f110420b == null) {
                            this.f208877b.f208895c.f(q.c(params2.f110419a), page);
                        }
                        break;
                    case 3:
                        h0 count = (h0) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(count, "count");
                        this.f208877b.f208895c.f("UNACKNOWLEDGED_CHALLENGES_MEMORY_KEY", count);
                        break;
                    case 4:
                        Boolean bool = (Boolean) obj3;
                        bool.getClass();
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        this.f208877b.f208895c.f("CHALLENGES_ELIGIBILITY_MEMORY_KEY", bool);
                        break;
                    case 5:
                        String collectionId = (String) obj2;
                        r domain3 = (r) obj3;
                        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f208877b.f208895c.f("COLLECTION_MEMORY_KEY_" + collectionId, domain3);
                        break;
                    case 6:
                        d0j.f domain4 = (d0j.f) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_MEMORY_KEY", domain4);
                        break;
                    default:
                        String screen = (String) obj2;
                        List domain5 = (List) obj3;
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        Intrinsics.checkNotNullParameter(domain5, "domain");
                        this.f208877b.f208895c.f("REWARDS_HUB_WIDGET_MEMORY_KEY_" + screen, domain5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new j(this, continuation, 2), new lp6.g(this, continuation, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00aa -> B:34:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b2 -> B:36:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(mtj.q r12, com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams r13, com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams r14, gim.c r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof mtj.o
            if (r0 == 0) goto L16
            r0 = r15
            mtj.o r0 = (mtj.o) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.C = r1
            goto L1b
        L16:
            mtj.o r0 = new mtj.o
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L56
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            int r13 = r0.f208888x
            int r14 = r0.f208887w
            d0j.k r2 = r0.v
            com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams r6 = r0.u
            yhm.o.b(r15)
            goto Lae
        L37:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3f:
            int r13 = r0.z
            int r14 = r0.f208889y
            int r2 = r0.f208888x
            int r6 = r0.f208887w
            d0j.k r7 = r0.v
            com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams r8 = r0.u
            yhm.o.b(r15)
            r11 = r14
            r14 = r13
            r13 = r2
            r2 = r0
            r0 = r6
            r6 = r15
            r15 = r11
            goto L81
        L56:
            yhm.o.b(r15)
            d0j.k r14 = r12.f(r14)
            r15 = 11
            r2 = r0
            r0 = r15
            r15 = r14
            r14 = r3
        L63:
            if (r14 >= r0) goto Lb8
            mtj.d r6 = r12.f208894b
            r2.u = r13
            r2.v = r15
            r2.f208887w = r0
            r2.f208888x = r14
            r2.f208889y = r14
            r2.z = r3
            r2.C = r5
            java.lang.Object r6 = r6.a(r15, r13, r2)
            if (r6 != r1) goto L7c
            goto La9
        L7c:
            r8 = r13
            r13 = r14
            r7 = r15
            r15 = r13
            r14 = r3
        L81:
            d0j.k r6 = (d0j.k) r6
            d0j.n r9 = r6.e
            d0j.n r10 = d0j.n.NOT_STARTED
            if (r9 == r10) goto L8a
            return r6
        L8a:
            r6 = 10
            if (r15 >= r6) goto Lb2
            if (r15 != 0) goto L93
            r9 = 100
            goto L95
        L93:
            r9 = 1000(0x3e8, double:4.94E-321)
        L95:
            r2.u = r8
            r2.v = r7
            r2.f208887w = r0
            r2.f208888x = r13
            r2.f208889y = r15
            r2.z = r14
            r2.C = r4
            java.lang.Object r14 = skm.k0.b(r9, r2)
            if (r14 != r1) goto Laa
        La9:
            return r1
        Laa:
            r14 = r0
            r0 = r2
            r2 = r7
            r6 = r8
        Lae:
            r15 = r2
            r2 = r0
            r0 = r14
            goto Lb4
        Lb2:
            r15 = r7
            r6 = r8
        Lb4:
            int r14 = r13 + 1
            r13 = r6
            goto L63
        Lb8:
            com.revolut.retail.feature.impl.rewards_hub.data.repository.RewardsHubRepositoryImpl$ChallengeStartFailedException r12 = new com.revolut.retail.feature.impl.rewards_hub.data.repository.RewardsHubRepositoryImpl$ChallengeStartFailedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mtj.q.a(mtj.q, com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams, com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams, gim.c):java.lang.Object");
    }

    public static String b(RewardsHubChallengeDetailsParams rewardsHubChallengeDetailsParams) {
        String str = rewardsHubChallengeDetailsParams.f99252b;
        String str2 = rewardsHubChallengeDetailsParams.f99251a;
        return str != null ? a0.d.s("challenge_details_", str2, "_", str) : j6.a.q("challenge_details_", str2);
    }

    public static String c(d0j.m mVar) {
        return j6.a.q("CHALLENGE_HISTORY_MEMORY_KEY_", mVar.b());
    }

    public static String d(d0j.m mVar) {
        return j6.a.q("CHALLENGE_HISTORY_STORAGE_KEY_", mVar.b());
    }

    public static String e(String str) {
        return j6.a.q("eligibility_criteria_", str);
    }

    public static ArrayList g(ArrayList arrayList, d0j.h hVar, boolean z) {
        String str = hVar.f110400b;
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!Intrinsics.f(((d0j.h) obj2).f110400b, str)) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            d0j.h hVar2 = (d0j.h) it8.next();
            if (Intrinsics.f(hVar2.f110400b, str)) {
                hVar2 = hVar;
            }
            arrayList3.add(hVar2);
        }
        return arrayList3;
    }

    public final d0j.k f(RewardsHubChallengeDetailsParams rewardsHubChallengeDetailsParams) {
        String strB = b(rewardsHubChallengeDetailsParams);
        d0j.k kVar = (d0j.k) this.f208895c.get(strB);
        if (kVar != null) {
            return kVar;
        }
        ntj.l lVar = (ntj.l) y.t(ntj.l.class, this.d, strB);
        if (lVar != null) {
            return z92.f.A(lVar);
        }
        return null;
    }
}
