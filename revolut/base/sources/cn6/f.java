package cn6;

import com.revolut.domain.models.openbanking.TopupUrlData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pfm.r;
import ufm.n;
import xg6.j;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function1 {
    public TopupUrlData u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e f25364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f25365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f25366y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.f25364w = eVar;
        this.f25365x = str;
        this.f25366y = str2;
        this.z = str3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f25364w, this.f25365x, this.f25366y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TopupUrlData topupUrlData;
        TopupUrlData topupUrlData2;
        com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar = this.f25364w;
        oe6.a aVar = eVar.f72987r;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            UUID uuidA = eVar.f72988s.a();
            EasyBankTransferFlowContract$InputData easyBankTransferFlowContract$InputData = eVar.o;
            n nVarF = ((j) aVar).f(uuidA, this.f25365x, this.f25366y, this.z, easyBankTransferFlowContract$InputData.f72959a, easyBankTransferFlowContract$InputData.f72960b);
            this.v = 1;
            obj2 = nim.a.b(nVarF, this);
            if (obj2 != aVar2) {
            }
            return aVar2;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            topupUrlData2 = this.u;
            o.b(obj2);
            topupUrlData = topupUrlData2;
            oki.h.D2(eVar.v);
            return eVar.C1(new ExternalDestination.Browser(topupUrlData.f60407a, null));
        }
        o.b(obj2);
        topupUrlData = (TopupUrlData) obj2;
        String str = this.z;
        if (str != null) {
            r rVarL = ((j) aVar).l(this.f25365x, str);
            this.u = topupUrlData;
            this.v = 2;
            if (nim.a.a(rVarL, this) != aVar2) {
                topupUrlData2 = topupUrlData;
                topupUrlData = topupUrlData2;
            }
            return aVar2;
        }
        oki.h.D2(eVar.v);
        return eVar.C1(new ExternalDestination.Browser(topupUrlData.f60407a, null));
    }
}
