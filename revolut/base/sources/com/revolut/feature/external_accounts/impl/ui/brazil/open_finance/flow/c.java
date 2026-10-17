package com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.OpenFinanceFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mii.k;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f72687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f72688x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, boolean z, String str, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f72687w = z;
        this.f72688x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f72687w, this.f72688x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            dg4.c cVar = new dg4.c(dVar, this.f72688x, null, 1);
            this.u = 1;
            if (dVar.p2(this, cVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (this.f72687w) {
            h.r2(dVar.f72691r);
            h.t2(dVar, dVar.f72691r, OpenFinanceFlowContract$Step.OpenFinance.f72679a, false, null, false, 12);
        } else {
            dVar.B2();
        }
        return dVar.X1(new k("ID_TOAST_INBOUND_REVOKE_SUCCESS", new TextLocalisedClause(R$string.open_banking_consents_revoke_permission_success_toast_title, null, null, 14), null, null, null, 28));
    }
}
