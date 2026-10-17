package f96;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.direct_deposit.impl.R$string;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.account.DirectDepositAccountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DirectDepositAccountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DirectDepositAccountScreen directDepositAccountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = directDepositAccountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.Q.getValue();
        Intrinsics.h(model);
        i iVar = (i) cVar;
        t70.g gVar = iVar.f132843q;
        Intrinsics.checkNotNullParameter(model, "model");
        n71.b bVar = (n71.b) ((a) ((j2) iVar.f132845s.f22677a).getValue()).f132836a.getContent();
        if (bVar != null) {
            String str = bVar.f212983p;
            tqi.e eVar = iVar.f132842p;
            String string = gVar.getString(R$string.direct_deposit_transfer_share_subject);
            StringBuilder sb6 = new StringBuilder();
            Address address = bVar.f212978h;
            String str2 = bVar.i;
            String str3 = bVar.d;
            if (str != null) {
                sb6.append(gVar.getString(R$string.direct_deposit_achRoutingNumber));
                sb6.append(": ");
                sb6.append(str);
                sb6.append("\n");
            }
            if (str3 != null) {
                sb6.append(gVar.getString(R$string.direct_deposit_account_number));
                sb6.append(": ");
                sb6.append(str3);
                sb6.append("\n");
            }
            if (str2 != null) {
                sb6.append(gVar.getString(R$string.direct_deposit_beneficiary));
                sb6.append(": ");
                sb6.append(str2);
                sb6.append("\n");
            }
            if (address != null) {
                sb6.append(gVar.getString(R$string.direct_deposit_beneficiary_address));
                sb6.append(": ");
                sb6.append(o51.a.b(address, null));
                sb6.append("\n");
            }
            iVar.C1(eVar.b(string, sb6.toString()));
        }
        return Unit.f186387a;
    }
}
