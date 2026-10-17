package kj0;

import ke7.v;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements h {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f184272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f184273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f184274c;
    public final Lazy d;

    public n(o config, d circuitBreakerStateTransitionTracker) {
        lbm.l registry = new lbm.l();
        Intrinsics.checkNotNullExpressionValue(registry, "ofDefaults(...)");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(circuitBreakerStateTransitionTracker, "circuitBreakerStateTransitionTracker");
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f184272a = config;
        final int i = 0;
        this.f184273b = yhm.j.b(new Function0(this) { // from class: kj0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f184270b;

            {
                this.f184270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return n.c(this.f184270b.f184272a.f184275a);
                    default:
                        return n.c(this.f184270b.f184272a.f184276b.f184278a);
                }
            }
        });
        final int i2 = 1;
        this.f184274c = yhm.j.b(new Function0(this) { // from class: kj0.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f184270b;

            {
                this.f184270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return n.c(this.f184270b.f184272a.f184275a);
                    default:
                        return n.c(this.f184270b.f184272a.f184276b.f184278a);
                }
            }
        });
        this.d = yhm.j.b(new k8e.a(registry, circuitBreakerStateTransitionTracker, 15));
    }

    public static jbm.h c(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        jbm.f fVar = new jbm.f();
        fVar.f172664l = jbm.g.TIME_BASED;
        int i = bVar.f184256a;
        if (i < 1) {
            throw new IllegalArgumentException("slidingWindowSize must be greater than 0");
        }
        fVar.i = i;
        int i2 = bVar.f184257b;
        if (i2 < 1) {
            throw new IllegalArgumentException("minimumNumberOfCalls must be greater than 0");
        }
        fVar.f = i2;
        fVar.b(bVar.f184258c);
        fVar.f172662h = 1;
        fVar.f172658a = new j();
        jbm.h hVarA = fVar.a();
        Intrinsics.checkNotNullExpressionValue(hVarA, "build(...)");
        return hVarA;
    }

    public final l a() {
        return new l(this.f184272a.f184277c, new v(this, 9));
    }

    public final l b() {
        o oVar = this.f184272a;
        return new l(oVar.f184277c, new k79.b(oVar.f184276b.f184279b, this, 17));
    }
}
