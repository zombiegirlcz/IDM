package com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer;

import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$Step;
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
    public final /* synthetic */ String f72979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f72980x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f72981y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, String str, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f72979w = str;
        this.f72980x = str2;
        this.f72981y = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f72979w, this.f72980x, this.f72981y, continuation);
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
        String str = this.f72979w;
        if (i == 0) {
            o.b(obj2);
            c64.d dVar = new c64.d(eVar, str, null, 10);
            this.u = 1;
            obj2 = eVar.p2(this, dVar);
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
        boolean z = this.f72981y;
        String str2 = this.f72980x;
        if (institutionInstructions == null) {
            eVar.I2(str, str2, null, z);
        } else {
            h.t2(eVar, eVar.v, new EasyBankTransferFlowContract$Step.Instructions(str, str2, institutionInstructions, z), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
