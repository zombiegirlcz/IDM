package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review;

import aqd.i0;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.IncomeSorterReviewContract$ReviewMode;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.retail.feature.api.income_sorter.models.ConflictingIncomeSorterExistsException;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import sqd.f0;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncomeSorterReviewContract$ReviewMode.Create f87861w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, IncomeSorterReviewContract$ReviewMode.Create create, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f87861w = create;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f87861w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        hzi.c cVar;
        Object objD;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        IncomeSorterReviewContract$ReviewMode.Create create = this.f87861w;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            wzi.a aVar2 = iVar.v;
            String str = create.f87848a;
            i0 i0Var = create.e;
            String str2 = create.f87849b;
            int i2 = f0.f265059a[i0Var.ordinal()];
            if (i2 == 1 || i2 == 2) {
                cVar = hzi.c.RECURRING;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = hzi.c.ONE_TIME;
            }
            hzi.c cVar2 = cVar;
            ArrayList arrayList = create.f87850c;
            IncomeSorterDestinationId incomeSorterDestinationId = create.d;
            hzi.a aVarK2 = i.K2(iVar, i0Var);
            boolean z = create.f;
            this.u = 1;
            objD = ((etj.o) aVar2).d(str, str2, cVar2, arrayList, incomeSorterDestinationId, aVarK2, z, this);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objD = ((m) obj2).f314193a;
        }
        m.Companion companion = m.INSTANCE;
        if (objD instanceof n) {
            if (!(m.a(objD) instanceof ConflictingIncomeSorterExistsException)) {
                return i.I2(iVar, m.a(objD));
            }
            oki.h.v2(iVar.A, new IncomeSorterReviewContract$ModalStep.ActiveSorterConflict(create.f87848a, create.f87849b, create.f87850c, create.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return Unit.f186387a;
        }
        if (create.f) {
            i.J2(iVar);
        } else {
            iVar.C2(sqd.h.f265063a);
        }
        return Unit.f186387a;
    }
}
