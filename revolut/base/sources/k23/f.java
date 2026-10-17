package k23;

import e7l.g;
import ffk.t;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.c2;
import vkm.d2;
import vkm.q;
import vkm.y;
import w4l.h;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f180315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f180316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.a f180317c;
    public final t d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f180318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f180319h;
    public final Lazy i;

    public f(CoroutineScope coroutineScope, ang.f userInteractor, fk3.a configurationInteractor, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f180315a = coroutineScope;
        this.f180316b = userInteractor;
        this.f180317c = configurationInteractor;
        this.d = pricingPlanInteractor;
        final int i = 0;
        this.e = j.b(new Function0(this) { // from class: k23.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f180313b;

            {
                this.f180313b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        f fVar = this.f180313b;
                        return q.M(q.q(mo3.a.g(fVar.f180316b.j(h.f294642c), null, null, 3)), fVar.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 1:
                        f fVar2 = this.f180313b;
                        return q.M(q.q(mo3.a.g(rd0.e.b(fVar2.d.q()), null, null, 3)), fVar2.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 2:
                        f fVar3 = this.f180313b;
                        int i2 = 3;
                        Continuation continuation = null;
                        return q.M(q.q(new y(new t38.e(fVar3.a(), 24, (Flow) fVar3.i.getValue(), new e(i2, 1, continuation)), new i23.c(i2, 13, continuation))), fVar3.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 3:
                        f fVar4 = this.f180313b;
                        int i3 = 3;
                        Continuation continuation2 = null;
                        return q.M(q.q(new y(new t38.e(fVar4.a(), 24, (Flow) fVar4.i.getValue(), new e(i3, 0, continuation2)), new i23.c(i3, 12, continuation2))), fVar4.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    default:
                        f fVar5 = this.f180313b;
                        fk3.a aVar = fVar5.f180317c;
                        return q.M(q.q(mo3.a.g(rd0.e.b(((ik3.c) aVar).l(g.b.f123407a, h.f294642c)), null, null, 3)), fVar5.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                }
            }
        });
        final int i2 = 1;
        this.f = j.b(new Function0(this) { // from class: k23.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f180313b;

            {
                this.f180313b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        f fVar = this.f180313b;
                        return q.M(q.q(mo3.a.g(fVar.f180316b.j(h.f294642c), null, null, 3)), fVar.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 1:
                        f fVar2 = this.f180313b;
                        return q.M(q.q(mo3.a.g(rd0.e.b(fVar2.d.q()), null, null, 3)), fVar2.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 2:
                        f fVar3 = this.f180313b;
                        int i22 = 3;
                        Continuation continuation = null;
                        return q.M(q.q(new y(new t38.e(fVar3.a(), 24, (Flow) fVar3.i.getValue(), new e(i22, 1, continuation)), new i23.c(i22, 13, continuation))), fVar3.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 3:
                        f fVar4 = this.f180313b;
                        int i3 = 3;
                        Continuation continuation2 = null;
                        return q.M(q.q(new y(new t38.e(fVar4.a(), 24, (Flow) fVar4.i.getValue(), new e(i3, 0, continuation2)), new i23.c(i3, 12, continuation2))), fVar4.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    default:
                        f fVar5 = this.f180313b;
                        fk3.a aVar = fVar5.f180317c;
                        return q.M(q.q(mo3.a.g(rd0.e.b(((ik3.c) aVar).l(g.b.f123407a, h.f294642c)), null, null, 3)), fVar5.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                }
            }
        });
        final int i3 = 2;
        this.f180318g = j.b(new Function0(this) { // from class: k23.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f180313b;

            {
                this.f180313b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        f fVar = this.f180313b;
                        return q.M(q.q(mo3.a.g(fVar.f180316b.j(h.f294642c), null, null, 3)), fVar.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 1:
                        f fVar2 = this.f180313b;
                        return q.M(q.q(mo3.a.g(rd0.e.b(fVar2.d.q()), null, null, 3)), fVar2.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 2:
                        f fVar3 = this.f180313b;
                        int i22 = 3;
                        Continuation continuation = null;
                        return q.M(q.q(new y(new t38.e(fVar3.a(), 24, (Flow) fVar3.i.getValue(), new e(i22, 1, continuation)), new i23.c(i22, 13, continuation))), fVar3.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 3:
                        f fVar4 = this.f180313b;
                        int i32 = 3;
                        Continuation continuation2 = null;
                        return q.M(q.q(new y(new t38.e(fVar4.a(), 24, (Flow) fVar4.i.getValue(), new e(i32, 0, continuation2)), new i23.c(i32, 12, continuation2))), fVar4.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    default:
                        f fVar5 = this.f180313b;
                        fk3.a aVar = fVar5.f180317c;
                        return q.M(q.q(mo3.a.g(rd0.e.b(((ik3.c) aVar).l(g.b.f123407a, h.f294642c)), null, null, 3)), fVar5.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                }
            }
        });
        final int i5 = 3;
        this.f180319h = j.b(new Function0(this) { // from class: k23.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f180313b;

            {
                this.f180313b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        f fVar = this.f180313b;
                        return q.M(q.q(mo3.a.g(fVar.f180316b.j(h.f294642c), null, null, 3)), fVar.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 1:
                        f fVar2 = this.f180313b;
                        return q.M(q.q(mo3.a.g(rd0.e.b(fVar2.d.q()), null, null, 3)), fVar2.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 2:
                        f fVar3 = this.f180313b;
                        int i22 = 3;
                        Continuation continuation = null;
                        return q.M(q.q(new y(new t38.e(fVar3.a(), 24, (Flow) fVar3.i.getValue(), new e(i22, 1, continuation)), new i23.c(i22, 13, continuation))), fVar3.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 3:
                        f fVar4 = this.f180313b;
                        int i32 = 3;
                        Continuation continuation2 = null;
                        return q.M(q.q(new y(new t38.e(fVar4.a(), 24, (Flow) fVar4.i.getValue(), new e(i32, 0, continuation2)), new i23.c(i32, 12, continuation2))), fVar4.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    default:
                        f fVar5 = this.f180313b;
                        fk3.a aVar = fVar5.f180317c;
                        return q.M(q.q(mo3.a.g(rd0.e.b(((ik3.c) aVar).l(g.b.f123407a, h.f294642c)), null, null, 3)), fVar5.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                }
            }
        });
        final int i6 = 4;
        this.i = j.b(new Function0(this) { // from class: k23.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f180313b;

            {
                this.f180313b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        f fVar = this.f180313b;
                        return q.M(q.q(mo3.a.g(fVar.f180316b.j(h.f294642c), null, null, 3)), fVar.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 1:
                        f fVar2 = this.f180313b;
                        return q.M(q.q(mo3.a.g(rd0.e.b(fVar2.d.q()), null, null, 3)), fVar2.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 2:
                        f fVar3 = this.f180313b;
                        int i22 = 3;
                        Continuation continuation = null;
                        return q.M(q.q(new y(new t38.e(fVar3.a(), 24, (Flow) fVar3.i.getValue(), new e(i22, 1, continuation)), new i23.c(i22, 13, continuation))), fVar3.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    case 3:
                        f fVar4 = this.f180313b;
                        int i32 = 3;
                        Continuation continuation2 = null;
                        return q.M(q.q(new y(new t38.e(fVar4.a(), 24, (Flow) fVar4.i.getValue(), new e(i32, 0, continuation2)), new i23.c(i32, 12, continuation2))), fVar4.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                    default:
                        f fVar5 = this.f180313b;
                        fk3.a aVar = fVar5.f180317c;
                        return q.M(q.q(mo3.a.g(rd0.e.b(((ik3.c) aVar).l(g.b.f123407a, h.f294642c)), null, null, 3)), fVar5.f180315a, c2.a(d2.Companion, 10000L, 2), 1);
                }
            }
        });
    }

    public final Flow a() {
        return (Flow) this.e.getValue();
    }
}
