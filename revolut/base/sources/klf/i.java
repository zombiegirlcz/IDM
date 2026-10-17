package klf;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.f f185509c;
    public final g6e.a d;
    public final Lazy e;
    public final Lazy f;

    public i(CoroutineScope coroutineScope, h0 commonDataSource, l93.f revolutCardsInteractor, g6e.a pocketSubaccountsProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(pocketSubaccountsProvider, "pocketSubaccountsProvider");
        this.f185507a = coroutineScope;
        this.f185508b = commonDataSource;
        this.f185509c = revolutCardsInteractor;
        this.d = pocketSubaccountsProvider;
        final int i = 0;
        this.e = yhm.j.b(new Function0(this) { // from class: klf.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f185463b;

            {
                this.f185463b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        i iVar = this.f185463b;
                        Flow flowQ = vkm.q.q(new a6e.b(rd0.e.n(zi0.c.w(vkm.q.Q(iVar.f185508b.h(new kkk.u(2)), new e(null, iVar, 0))), zhm.h0.f322473a), 20));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), iVar.f185507a);
                    default:
                        i iVar2 = this.f185463b;
                        SharedFlow sharedFlowA = iVar2.a();
                        h0 h0Var = iVar2.f185508b;
                        Flow flowQ2 = vkm.q.q(new a6e.b(rd0.e.n(zi0.c.w(vkm.q.Q(yh5.b.e(sharedFlowA, h0Var.e(), h0Var.h(new kkk.u(3))), new e(null, iVar2, 1))), zhm.h0.f322473a), 21));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ2, oji.e.f225788b), iVar2.f185507a);
                }
            }
        });
        final int i2 = 1;
        this.f = yhm.j.b(new Function0(this) { // from class: klf.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f185463b;

            {
                this.f185463b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        i iVar = this.f185463b;
                        Flow flowQ = vkm.q.q(new a6e.b(rd0.e.n(zi0.c.w(vkm.q.Q(iVar.f185508b.h(new kkk.u(2)), new e(null, iVar, 0))), zhm.h0.f322473a), 20));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), iVar.f185507a);
                    default:
                        i iVar2 = this.f185463b;
                        SharedFlow sharedFlowA = iVar2.a();
                        h0 h0Var = iVar2.f185508b;
                        Flow flowQ2 = vkm.q.q(new a6e.b(rd0.e.n(zi0.c.w(vkm.q.Q(yh5.b.e(sharedFlowA, h0Var.e(), h0Var.h(new kkk.u(3))), new e(null, iVar2, 1))), zhm.h0.f322473a), 21));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ2, oji.e.f225788b), iVar2.f185507a);
                }
            }
        });
    }

    public final SharedFlow a() {
        return (SharedFlow) this.e.getValue();
    }
}
