package n3j;

import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SendFromClipboardType.BankTransferFields f212140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar, SendFromClipboardType.BankTransferFields bankTransferFields, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f212140w = bankTransferFields;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a0(this.v, this.f212140w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar = this.v;
        r3j.a aVar2 = dVar.I;
        BeneficiaryInfoState beneficiaryInfoStateK2 = dVar.K2();
        this.u = 1;
        p96.a aVar3 = aVar2.f251298b;
        SendFromClipboardType.BankTransferFields bankTransferFields = this.f212140w;
        Map map = bankTransferFields.f79696a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((AccountFieldType) entry.getKey()).name(), entry.getValue());
        }
        Object objB = aVar2.f251297a.b(beneficiaryInfoStateK2, bankTransferFields.f79697b, p96.a.f(bankTransferFields.f79698c, bankTransferFields.d, null, linkedHashMap), this);
        return objB == aVar ? aVar : objB;
    }
}
