package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer;

import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f72845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f72846x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f72847y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, String str, String str2, boolean z, String str3, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f72845w = str;
        this.f72846x = str2;
        this.f72847y = z;
        this.z = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f72845w, this.f72846x, this.f72847y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            eg4.b bVar = new eg4.b(eVar, this.f72845w, null, 9);
            this.u = 1;
            obj2 = eVar.p2(this, bVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        InstitutionInstructions institutionInstructions = (InstitutionInstructions) obj2;
        if (institutionInstructions == null) {
            e.I2(eVar, this.f72845w, this.f72846x, this.f72847y, this.z, null);
        } else {
            h.t2(eVar, eVar.f72858y, new CrossBorderEasyBankTransferFlowContract$Step.Instructions(this.f72845w, this.f72846x, institutionInstructions, this.f72847y, this.z), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
