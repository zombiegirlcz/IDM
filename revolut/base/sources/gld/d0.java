package gld;

import com.revolut.feature.slot_manager.impl.navigation.custom_rating.CustomRatingBottomSheetDestination;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.FeedbackBundle;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.f1;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f144634w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(f0 f0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f144634w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f144634w, continuation, 0);
                d0Var.v = obj2;
                return d0Var;
            default:
                d0 d0Var2 = new d0(this.f144634w, continuation, 1);
                d0Var2.v = obj2;
                return d0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d0) create((bld.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d0) create((jld.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Continuation continuation = null;
        int i = 27;
        switch (this.u) {
            case 0:
                final bld.i iVar = (bld.i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean z = iVar instanceof bld.e;
                final f0 f0Var = this.f144634w;
                if (z) {
                    bld.e eVar = (bld.e) iVar;
                    f0Var.T2(new g23.q(f0Var, eVar.f16531a, eVar.f16532b, (Continuation) null), new yi5.b(i));
                } else if (iVar instanceof bld.b) {
                    f0Var.A2(((bld.b) iVar).f16526a);
                } else {
                    final int i2 = 1;
                    if (iVar instanceof bld.h) {
                        f0Var.A2(((bld.h) iVar).f16538a);
                        ((bld.m) f0Var.f144639m).f16548g.set(true);
                    } else if (iVar instanceof bld.f) {
                        bld.f fVar = (bld.f) iVar;
                        final int i3 = 0;
                        f0Var.b3("tell_us_more", fVar.f16534b, fVar.f16535c, f1.ABOVE_ANCHOR_VIEW, new Function0() { // from class: gld.b0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i3) {
                                    case 0:
                                        bld.j jVar = f0Var.f144639m;
                                        FeedbackBundle feedbackBundle = ((bld.f) iVar).f16533a;
                                        bld.m mVar = (bld.m) jVar;
                                        mVar.getClass();
                                        Intrinsics.checkNotNullParameter(feedbackBundle, "feedbackBundle");
                                        mVar.f.k(new bld.b(new CustomRatingBottomSheetDestination(feedbackBundle)));
                                        break;
                                    default:
                                        ((bld.m) f0Var.f144639m).d(((bld.c) iVar).f16527a);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        });
                    } else if (iVar instanceof bld.c) {
                        bld.c cVar = (bld.c) iVar;
                        f0Var.b3("rate_us", cVar.f16528b, cVar.f16529c, cVar.d, new Function0() { // from class: gld.b0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i2) {
                                    case 0:
                                        bld.j jVar = f0Var.f144639m;
                                        FeedbackBundle feedbackBundle = ((bld.f) iVar).f16533a;
                                        bld.m mVar = (bld.m) jVar;
                                        mVar.getClass();
                                        Intrinsics.checkNotNullParameter(feedbackBundle, "feedbackBundle");
                                        mVar.f.k(new bld.b(new CustomRatingBottomSheetDestination(feedbackBundle)));
                                        break;
                                    default:
                                        ((bld.m) f0Var.f144639m).d(((bld.c) iVar).f16527a);
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        });
                    } else if (iVar instanceof bld.g) {
                        f0Var.T2(new ga9.v(iVar, f0Var, continuation, 29), new yi5.b(i));
                    } else {
                        if (!(iVar instanceof bld.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f0Var.Z2(((bld.d) iVar).f16530a, "submission_error");
                    }
                }
                return Unit.f186387a;
            default:
                jld.e eVar2 = (jld.e) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean z3 = eVar2 instanceof jld.c;
                f0 f0Var2 = this.f144634w;
                if (z3) {
                    jld.c cVar2 = (jld.c) eVar2;
                    f0Var2.T2(new g23.q(f0Var2, cVar2.f175714a, cVar2.f175715b, (Continuation) null), new yi5.b(i));
                } else if (eVar2 instanceof jld.a) {
                    f0Var2.N2(f0Var2.o2(((jld.a) eVar2).f175712a), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new gd3.i(f0Var2, 25));
                } else if (eVar2 instanceof jld.d) {
                    jld.d dVar = (jld.d) eVar2;
                    f0Var2.b3("fincrime_nps_tell_us_more", dVar.f175718c, dVar.d, dVar.e, new ghk.t(f0Var2, eVar2, 3));
                } else {
                    if (!(eVar2 instanceof jld.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f0Var2.Z2(((jld.b) eVar2).f175713a, "fincrime_nps_submission_error");
                }
                return Unit.f186387a;
        }
    }
}
