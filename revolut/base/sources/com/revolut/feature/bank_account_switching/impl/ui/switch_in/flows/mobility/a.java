package com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility;

import com.revolut.feature.bank_account_switching.impl.domain.joint_account.JointAccountData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.mobility.MobilityAccountSwitchingFlowContract$Step;
import do2.h;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import np2.e;
import smd.s;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public wn2.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f64025w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f64026x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ MobilityAccountSwitchingFlowContract$Step.SourceAccountForm f64027y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, b bVar, MobilityAccountSwitchingFlowContract$Step.SourceAccountForm sourceAccountForm, Continuation continuation) {
        super(2, continuation);
        this.f64025w = hVar;
        this.f64026x = bVar;
        this.f64027y = sourceAccountForm;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f64025w, this.f64026x, this.f64027y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        wn2.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        b bVar = this.f64026x;
        h hVar = this.f64025w;
        if (i == 0) {
            o.b(obj2);
            wn2.a aVar3 = hVar.f116378b.f63911b;
            s sVar = bVar.f64028p;
            this.u = aVar3;
            this.v = 1;
            Object objB = sVar.B(this);
            if (objB == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            o.b(obj2);
        }
        JointAccountData jointAccountData = (JointAccountData) obj2;
        MobilityAccountSwitchingFlowContract$Step.SourceAccountForm sourceAccountForm = this.f64027y;
        if (jointAccountData != null) {
            int i2 = aVar == null ? -1 : e.f218127a[aVar.ordinal()];
            if (i2 == -1 || i2 == 1) {
                oki.h.t2(bVar, bVar.f64030r, new MobilityAccountSwitchingFlowContract$Step.TargetAccountSelection(sourceAccountForm.f64017a, hVar.f116377a, jointAccountData), true, null, false, 12);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.K2(hVar.f116377a, wn2.a.JOINT, sourceAccountForm.f64017a);
            }
        } else {
            bVar.K2(hVar.f116377a, wn2.a.PERSONAL, sourceAccountForm.f64017a);
        }
        return Unit.f186387a;
    }
}
