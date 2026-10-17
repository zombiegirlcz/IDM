package em6;

import com.revolut.domain.models.openbanking.TopupUrlData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$InputData;
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
public final class h extends i implements Function1 {
    public TopupUrlData u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e f127630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f127631x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f127632y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.f127630w = eVar;
        this.f127631x = str;
        this.f127632y = str2;
        this.z = str3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.f127630w, this.f127631x, this.f127632y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TopupUrlData topupUrlData;
        TopupUrlData topupUrlData2;
        com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.e eVar = this.f127630w;
        oe6.a aVar = eVar.f72852q;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            UUID uuidA = eVar.f72853r.a();
            CrossBorderEasyBankTransferFlowContract$InputData crossBorderEasyBankTransferFlowContract$InputData = eVar.o;
            n nVarF = ((j) aVar).f(uuidA, this.f127631x, this.f127632y, this.z, crossBorderEasyBankTransferFlowContract$InputData.f72814a, crossBorderEasyBankTransferFlowContract$InputData.f72815b);
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
            oki.h.D2(eVar.f72858y);
            return eVar.C1(new ExternalDestination.Browser(topupUrlData.f60407a, null));
        }
        o.b(obj2);
        topupUrlData = (TopupUrlData) obj2;
        String str = this.z;
        if (str != null) {
            r rVarL = ((j) aVar).l(this.f127631x, str);
            this.u = topupUrlData;
            this.v = 2;
            if (nim.a.a(rVarL, this) != aVar2) {
                topupUrlData2 = topupUrlData;
                topupUrlData = topupUrlData2;
            }
            return aVar2;
        }
        oki.h.D2(eVar.f72858y);
        return eVar.C1(new ExternalDestination.Browser(topupUrlData.f60407a, null));
    }
}
