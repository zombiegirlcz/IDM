package l25;

import com.revolut.feature.credit.card.api.navigation.deeplink.CreditCardDeeplink;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDialog$Descriptor;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDialog$InputData;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ CreditCardDeeplink u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f191637w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CreditCardDeeplink creditCardDeeplink, u uVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = creditCardDeeplink;
        this.v = uVar;
        this.f191637w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, this.v, this.f191637w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        CreditCardDeeplink creditCardDeeplink = this.u;
        boolean z = creditCardDeeplink instanceof CreditCardDeeplink.Help;
        int i = 2;
        String str = this.f191637w;
        u uVar = this.v;
        Continuation continuation = null;
        if (z) {
            uVar.V2(new i(uVar, str, continuation, i), new yi5.b(29));
            return Unit.f186387a;
        }
        int i2 = 1;
        if (creditCardDeeplink instanceof CreditCardDeeplink.InfoBalance) {
            return uVar.V2(new i(uVar, str, continuation, i2), new yi5.b(29));
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.InfoTerminated) {
            return uVar.V2(new l(uVar, str, null), new yi5.b(29));
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.AutopayFail) {
            CreditCardDeeplink.AutopayFail autopayFail = (CreditCardDeeplink.AutopayFail) creditCardDeeplink;
            int i3 = b.f191621b[com.revolut.feature.credit.card.api.navigation.deeplink.a.valueOf((String) r0.h("reason", autopayFail.a().d())).ordinal()];
            if (i3 == 1) {
                uVar.V2(new r(uVar, autopayFail, null), new yi5.b(29));
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f186387a;
        }
        if (creditCardDeeplink instanceof CreditCardDeeplink.CreditLimitDecreaseAccept) {
            uVar.V2(new i(uVar, str, continuation, 0), new yi5.b(29));
            return Unit.f186387a;
        }
        if (!(creditCardDeeplink instanceof CreditCardDeeplink.Dialog)) {
            return Unit.f186387a;
        }
        String str2 = (String) ((CreditCardDeeplink.Dialog) creditCardDeeplink).a().d().get("type");
        if (str2 != null && str2.length() != 0) {
            uVar.A2(new ControllerDestination.Modal(new CreditCardDialog$Descriptor(new CreditCardDialog$InputData.LoadContent(str, str2)), ModalDestination.Style.BOTTOM_DIALOG.f98301a));
        }
        return Unit.f186387a;
    }
}
