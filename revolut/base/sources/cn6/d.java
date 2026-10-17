package cn6;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import xg6.j;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EasyBankTransferDescriptor$PreselectedInstitutionInfo f25360w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar, EasyBankTransferDescriptor$PreselectedInstitutionInfo easyBankTransferDescriptor$PreselectedInstitutionInfo, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f25360w = easyBankTransferDescriptor$PreselectedInstitutionInfo;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f25360w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            f0 f0VarT = zi0.c.t(((j) eVar.f72987r).d(((EasyBankTransferDescriptor$PreselectedInstitutionInfo.Id) this.f25360w).f72270a, w4l.h.f294642c));
            this.u = 1;
            obj2 = nim.a.b(f0VarT, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ExternalInstitution externalInstitution = (ExternalInstitution) obj2;
        Intrinsics.h(externalInstitution);
        eVar.n2(new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.d(eVar, externalInstitution.f66107a, externalInstitution.f66108b, externalInstitution.f66111h.contains(ho3.c.REMITTER_IBAN), externalInstitution.i, null), new whi.b(6));
        return Unit.f186387a;
    }
}
