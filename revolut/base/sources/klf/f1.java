package klf;

import et6.l3;
import kkf.b4;
import kkf.m5;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9k.f f185475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f185476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f185477c;
    public final l3 d;
    public final Lazy e;
    public final Lazy f;

    public f1(b9k.f acquiringOrderInteractor, CoroutineScope coroutineScope, h0 commonDataSource, l3 freelancerSettlementSettingsInteractor) {
        Intrinsics.checkNotNullParameter(acquiringOrderInteractor, "acquiringOrderInteractor");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(freelancerSettlementSettingsInteractor, "freelancerSettlementSettingsInteractor");
        this.f185475a = acquiringOrderInteractor;
        this.f185476b = coroutineScope;
        this.f185477c = commonDataSource;
        this.d = freelancerSettlementSettingsInteractor;
        final int i = 0;
        this.e = yhm.j.b(new Function0(this) { // from class: klf.c1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f185458b;

            {
                this.f185458b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        f1 f1Var = this.f185458b;
                        return edl.a.r(rd0.e.e(mo3.a.g(f1Var.d.a(w4l.h.f294642c), null, new b4(8), 1), zhm.h0.f322473a, new i23.c(3, 27, null)), f1Var.f185476b);
                    default:
                        f1 f1Var2 = this.f185458b;
                        Flow flowQ = vkm.q.q(vkm.q.Q(f1Var2.f185477c.h(new kkk.u(10)), new m5(null, f1Var2, 20)));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), f1Var2.f185476b);
                }
            }
        });
        final int i2 = 1;
        this.f = yhm.j.b(new Function0(this) { // from class: klf.c1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f185458b;

            {
                this.f185458b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        f1 f1Var = this.f185458b;
                        return edl.a.r(rd0.e.e(mo3.a.g(f1Var.d.a(w4l.h.f294642c), null, new b4(8), 1), zhm.h0.f322473a, new i23.c(3, 27, null)), f1Var.f185476b);
                    default:
                        f1 f1Var2 = this.f185458b;
                        Flow flowQ = vkm.q.q(vkm.q.Q(f1Var2.f185477c.h(new kkk.u(10)), new m5(null, f1Var2, 20)));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), f1Var2.f185476b);
                }
            }
        });
    }
}
