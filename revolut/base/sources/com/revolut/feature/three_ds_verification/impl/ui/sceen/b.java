package com.revolut.feature.three_ds_verification.impl.ui.sceen;

import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationScreenContract$ModalStep;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpLimitUiModel;
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
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TopUpLimitUiModel f90427w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, TopUpLimitUiModel topUpLimitUiModel, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f90427w = topUpLimitUiModel;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f90427w, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!(n1Var instanceof l1) && !(n1Var instanceof k1)) {
            if (n1Var instanceof m1) {
                h.v2(this.v.N, new ThreeDsVerificationScreenContract$ModalStep.UnverifiedOwnerLimitValueDialog(this.f90427w), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else {
                if (!(n1Var instanceof j1)) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected result ".concat(n1Var.getClass().getSimpleName()));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
        }
        return Unit.f186387a;
    }
}
