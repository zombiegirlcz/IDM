package com.revolut.feature.robo.impl.ui.flow.edit_goal;

import aii.q;
import com.revolut.feature.robo.impl.ui.flow.edit_goal.EditGoalFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import dmc.r;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vc.s;
import woc.k;
import yhm.j;
import zjh.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/flow/edit_goal/EditGoalFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditGoalFlow extends ViewController<q> implements yki.f {
    public final jmc.b K;
    public final Lazy L;
    public final Lazy M;
    public final Object N;

    public EditGoalFlow(jmc.b input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = j.b(new Function0(this) { // from class: jmc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditGoalFlow f176522b;

            {
                this.f176522b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EditGoalFlow editGoalFlow = this.f176522b;
                        phm.a aVar = (phm.a) ue0.e.j(editGoalFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).f116039s;
                        b bVar = editGoalFlow.K;
                        bVar.getClass();
                        return new dmc.e(rVar, bVar);
                    case 1:
                        dmc.e eVar = (dmc.e) this.f176522b.L.getValue();
                        b bVar2 = eVar.f115933a;
                        r rVar2 = eVar.f115934b;
                        dmc.a aVar3 = rVar2.e;
                        f fVarA = aVar3.a();
                        d dVar = new d();
                        b bVar3 = eVar.f115933a;
                        t1j.b bVarG = rVar2.f116028b.G();
                        f fVarA2 = aVar3.a();
                        k kVar = new k();
                        l80.e eVarH = rVar2.f116031h.h();
                        s.j(eVarH);
                        return new com.revolut.feature.robo.impl.ui.flow.edit_goal.f(bVar2, fVarA, dVar, new com.revolut.feature.robo.impl.ui.flow.edit_goal.c(bVar3, bVarG, fVarA2, kVar, eVarH));
                    default:
                        EditGoalFlow editGoalFlow2 = this.f176522b;
                        return czi.c.d(0, 6, null, editGoalFlow2, (c) editGoalFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = j.b(new Function0(this) { // from class: jmc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditGoalFlow f176522b;

            {
                this.f176522b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EditGoalFlow editGoalFlow = this.f176522b;
                        phm.a aVar = (phm.a) ue0.e.j(editGoalFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).f116039s;
                        b bVar = editGoalFlow.K;
                        bVar.getClass();
                        return new dmc.e(rVar, bVar);
                    case 1:
                        dmc.e eVar = (dmc.e) this.f176522b.L.getValue();
                        b bVar2 = eVar.f115933a;
                        r rVar2 = eVar.f115934b;
                        dmc.a aVar3 = rVar2.e;
                        f fVarA = aVar3.a();
                        d dVar = new d();
                        b bVar3 = eVar.f115933a;
                        t1j.b bVarG = rVar2.f116028b.G();
                        f fVarA2 = aVar3.a();
                        k kVar = new k();
                        l80.e eVarH = rVar2.f116031h.h();
                        s.j(eVarH);
                        return new com.revolut.feature.robo.impl.ui.flow.edit_goal.f(bVar2, fVarA, dVar, new com.revolut.feature.robo.impl.ui.flow.edit_goal.c(bVar3, bVarG, fVarA2, kVar, eVarH));
                    default:
                        EditGoalFlow editGoalFlow2 = this.f176522b;
                        return czi.c.d(0, 6, null, editGoalFlow2, (c) editGoalFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: jmc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditGoalFlow f176522b;

            {
                this.f176522b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EditGoalFlow editGoalFlow = this.f176522b;
                        phm.a aVar = (phm.a) ue0.e.j(editGoalFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).f116039s;
                        b bVar = editGoalFlow.K;
                        bVar.getClass();
                        return new dmc.e(rVar, bVar);
                    case 1:
                        dmc.e eVar = (dmc.e) this.f176522b.L.getValue();
                        b bVar2 = eVar.f115933a;
                        r rVar2 = eVar.f115934b;
                        dmc.a aVar3 = rVar2.e;
                        f fVarA = aVar3.a();
                        d dVar = new d();
                        b bVar3 = eVar.f115933a;
                        t1j.b bVarG = rVar2.f116028b.G();
                        f fVarA2 = aVar3.a();
                        k kVar = new k();
                        l80.e eVarH = rVar2.f116031h.h();
                        s.j(eVarH);
                        return new com.revolut.feature.robo.impl.ui.flow.edit_goal.f(bVar2, fVarA, dVar, new com.revolut.feature.robo.impl.ui.flow.edit_goal.c(bVar3, bVarG, fVarA2, kVar, eVarH));
                    default:
                        EditGoalFlow editGoalFlow2 = this.f176522b;
                        return czi.c.d(0, 6, null, editGoalFlow2, (c) editGoalFlow2.M.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (dmc.e) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (dmc.e) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (jmc.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
