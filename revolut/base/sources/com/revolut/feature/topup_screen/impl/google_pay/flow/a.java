package com.revolut.feature.topup_screen.impl.google_pay.flow;

import com.revolut.feature.topup_screen.api.topup_limits.TopUpLimitUiModel;
import com.revolut.feature.topup_screen.impl.google_pay.flow.GooglePayFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import oki.h;
import rd0.c;
import rd0.d;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TopUpLimitUiModel f91036w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, TopUpLimitUiModel topUpLimitUiModel, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f91036w = topUpLimitUiModel;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, this.f91036w, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yki.i iVar = this.v.B;
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if ((n1Var instanceof l1) || (n1Var instanceof k1)) {
            h.D2(iVar);
        } else if (n1Var instanceof m1) {
            h.w2(iVar, new GooglePayFlowContract$Step.UnverifiedOwnerLimitValueDialog(this.f91036w), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            if (!(n1Var instanceof j1)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected result ".concat(n1Var.getClass().getSimpleName()));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
