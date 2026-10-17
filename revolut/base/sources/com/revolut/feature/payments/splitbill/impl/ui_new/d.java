package com.revolut.feature.payments.splitbill.impl.ui_new;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$Step;
import do3.n;
import efm.d0;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f79855w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f79856x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SplitMethod f79857y;
    public final /* synthetic */ AccountId.Joint z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, List list, List list2, SplitMethod splitMethod, AccountId.Joint joint, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f79855w = list;
        this.f79856x = list2;
        this.f79857y = splitMethod;
        this.z = joint;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f79855w, this.f79856x, this.f79857y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarF = eVar.z.f(false);
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        SplitMemberType.SplitMember.UserMember userMember = new SplitMemberType.SplitMember.UserMember((n) obj2, null);
        List list = this.f79856x;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new SplitMemberType.SplitMember.ContactMember((zm3.a) it8.next(), null));
        }
        eVar.E2(new SplitBillsFlowContract$Step.SplitSummary(this.f79855w, new SplitMembersType.Split(userMember, ue0.e.J(userMember, arrayList)), this.f79857y, this.z), true, null, false);
        return Unit.f186387a;
    }
}
