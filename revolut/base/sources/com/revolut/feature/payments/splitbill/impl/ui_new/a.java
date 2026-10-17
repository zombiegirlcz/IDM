package com.revolut.feature.payments.splitbill.impl.ui_new;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$Step;
import efm.r;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wl3.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f79849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f79850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SplitMethod f79851y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, List list, AccountId.Joint joint, SplitMethod splitMethod, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f79849w = list;
        this.f79850x = joint;
        this.f79851y = splitMethod;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f79849w, this.f79850x, this.f79851y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarG = m70.a.g(((h) eVar.f79861y).n(), null, null, 3);
            this.u = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        boolean z = !((Boolean) obj2).booleanValue();
        AccountId.Joint joint = this.f79850x;
        eVar.E2(new SplitBillsFlowContract$Step.SelectContacts(this.f79849w, z, joint == null, joint == null, joint, this.f79851y), true, null, false);
        return Unit.f186387a;
    }
}
