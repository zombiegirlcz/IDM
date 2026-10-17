package com.revolut.sso.impl.ui.country_selection;

import cjl.j;
import cjl.k;
import cjl.l;
import cli.y;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreenContract$ModalStep;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nml.g;
import oki.h;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ty0.a f106504w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ty0.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f106504w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f106504w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.v;
        y yVar = bVar.f106507r;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        ty0.a aVar2 = this.f106504w;
        if (i == 0) {
            o.b(obj2);
            jx0.a aVarI2 = bVar.I2();
            String str = aVar2.f275445a;
            wi0.b bVar2 = ((g) ((j2) yVar.f22677a).getValue()).f217378a;
            this.u = 1;
            obj2 = aVarI2.u(this, str, bVar2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        l lVar = (l) obj2;
        if (lVar instanceof j) {
            return bVar.C1(((j) lVar).f24714a);
        }
        if (lVar instanceof k) {
            h.v2(bVar.f106508s, new CountrySelectionScreenContract$ModalStep.Terms(aVar2.f275445a, ((g) ((j2) yVar.f22677a).getValue()).f217378a), ModalDestination.Style.POPUP.f98311a);
            return Unit.f186387a;
        }
        if (lVar == null) {
            return Unit.f186387a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
