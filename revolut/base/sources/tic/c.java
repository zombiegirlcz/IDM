package tic;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rewards.impl.R$string;
import efm.r;
import gim.i;
import iuf.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import n14.k;
import nii.c0;
import nii.l1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f271476w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f271476w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f271476w, continuation, 0);
            default:
                return new c(this.f271476w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                r rVarG = m70.a.g(rd0.e.c(ugc.a.m(this.f271476w.o), g.f186406a), null, null, 3);
                this.v = 1;
                Object objC = nim.a.c(rVarG, this);
                return objC == aVar ? aVar : objC;
            default:
                d dVar = this.f271476w;
                yki.i iVar = dVar.f271478q;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    dVar.f271477p.getClass();
                    c0 c0Var = new c0(new TextLocalisedClause(R$string.perks_concierge_albertine_redeem_loading_title, null, null, 14), null, null, false, null, false, false, null, 1918);
                    lic.a aVar3 = new lic.a(dVar, 15);
                    y yVar = new y(dVar, 24);
                    c cVar = new c(dVar, null, 0);
                    this.v = 1;
                    objP = k.P(dVar.X(), c0Var, aVar3, yVar, cVar, this);
                    if (objP == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objP = obj2;
                }
                nii.e eVar = (nii.e) objP;
                if (eVar instanceof nii.d) {
                    h.D2(iVar);
                } else {
                    if (!(eVar instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((nii.c) eVar).f216124b instanceof l1) {
                        h.D2(iVar);
                    }
                }
                return Unit.f186387a;
        }
    }
}
