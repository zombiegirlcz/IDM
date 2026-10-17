package com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation;

import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.OpenBankingBrPaymentsFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ String A;
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f72701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Boolean f72702x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Map f72703y;
    public final /* synthetic */ Map z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, String str, Boolean bool, Map map, Map map2, String str2, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f72701w = str;
        this.f72702x = bool;
        this.f72703y = map;
        this.z = map2;
        this.A = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f72701w, this.f72702x, this.f72703y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a aVar3 = dVar.o;
            this.u = 1;
            aVar = this;
            obj2 = ((com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b) aVar3).a(this.f72701w, this.f72702x, this.f72703y, this.z, aVar);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            aVar = this;
        }
        String str = (String) obj2;
        String str2 = aVar.A;
        if (str != null) {
            d.I2(dVar, str2, str);
        } else {
            h.w2(dVar.f72712t, new OpenBankingBrPaymentsFlowContract$Step.ManualReturnToClient(str2), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
