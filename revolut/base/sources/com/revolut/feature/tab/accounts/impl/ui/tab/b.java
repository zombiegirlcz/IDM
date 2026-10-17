package com.revolut.feature.tab.accounts.impl.ui.tab;

import android.os.Parcelable;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$ModalStep;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import tji.m;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m mVar = (m) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (mVar instanceof mii.m) {
            Parcelable parcelable = ((mii.m) mVar).f205873a.f205877b;
            TabAccountsShotDialogAction.Action action = parcelable instanceof TabAccountsShotDialogAction.Action ? (TabAccountsShotDialogAction.Action) parcelable : null;
            boolean z = action instanceof TabAccountsShotDialogAction.Action.Navigate;
            d dVar = this.v;
            if (z) {
                dVar.C1(((TabAccountsShotDialogAction.Action.Navigate) action).f89547b);
            } else if (action instanceof TabAccountsShotDialogAction.Action.ShowModal) {
                TabAccountsShotDialogAction.Action.ShowModal showModal = (TabAccountsShotDialogAction.Action.ShowModal) action;
                h.v2(dVar.p0, new TabAccountsScreenContract$ModalStep.ShotAction(showModal.f89549b), showModal.f89550c);
            } else if (action != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f186387a;
    }
}
