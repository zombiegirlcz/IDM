package hdk;

import aii.q;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$Step;
import h54.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qdk.c0;
import qdk.d0;
import qdk.e0;
import qdk.f0;
import qdk.g0;
import qdk.h0;
import qdk.i0;
import qdk.j0;
import qdk.k0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d f151472b;

    public /* synthetic */ f(com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d dVar, int i) {
        this.f151471a = i;
        this.f151472b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f151471a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                oki.h.D2(this.f151472b.u);
                return Boolean.TRUE;
            case 1:
                com.revolut.retail.feature.plan_rewards.impl.presentation.flow.d dVar = this.f151472b;
                yki.i iVar = dVar.u;
                k0 result = (k0) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, c0.f244959a)) {
                    oki.h.D2(iVar);
                } else if (result instanceof j0) {
                    oki.h.t2(dVar, dVar.u, new MonthlyDrawsFlowContract$Step.Reveal(((j0) result).f244969a), false, null, false, 12);
                } else {
                    Continuation continuation = null;
                    if (Intrinsics.f(result, f0.f244963a)) {
                        dVar.A1(new h(dVar, continuation, 0), new yi5.b(25));
                    } else if (result instanceof g0) {
                        oki.h.u2(dVar, iVar, new MonthlyDrawsFlowContract$Step.OptOut(((g0) result).f244965a), TransitionAnimation.FADE.f98392a, 4);
                    } else if (result instanceof e0) {
                        dVar.l2(new o(dVar, ((e0) result).f244962a, continuation, 19), new yi5.b(26));
                    } else {
                        boolean z = result instanceof d0;
                        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                        if (z) {
                            oki.h.w2(iVar, new MonthlyDrawsFlowContract$Step.BottomSheet(((d0) result).f244960a), bottom_dialog);
                        } else if (Intrinsics.f(result, h0.f244966a)) {
                            oki.h.w2(iVar, MonthlyDrawsFlowContract$Step.PreparingRevealSheet.f102546a, bottom_dialog);
                        } else {
                            if (!(result instanceof i0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar.l2(new com.revolut.retail.feature.plan_rewards.impl.presentation.flow.b(dVar, ((i0) result).f244968a, null), new yi5.b(26));
                        }
                    }
                }
                return Unit.f186387a;
            default:
                q it9 = (q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                oki.h.D2(this.f151472b.u);
                return Unit.f186387a;
        }
    }
}
