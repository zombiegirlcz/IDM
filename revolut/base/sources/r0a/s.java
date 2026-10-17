package r0a;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.impl.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f250748w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f250748w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f250748w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f250748w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(this.f250748w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
            case 3:
                s sVar4 = new s(this.f250748w, continuation, 3);
                sVar4.v = obj2;
                return sVar4;
            default:
                s sVar5 = new s(this.f250748w, continuation, 4);
                sVar5.v = obj2;
                return sVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((sz9.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((s) create((ChatTransferRecipient) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j jVar;
        int i = this.u;
        y yVar = this.f250748w;
        switch (i) {
            case 0:
                sz9.a aVar = (sz9.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!Intrinsics.f(yVar.z.f79802b, aVar.f266781a)) {
                    yVar.C2(new l(aVar.f266781a));
                }
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.E, new qna.p(data, 23));
                break;
            case 2:
                r rVar = (r) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.E, new qpb.a(rVar.f250746a, rVar.f250747b, 28));
                break;
            case 3:
                ChatTransferRecipient recipient = (ChatTransferRecipient) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.f250761t.getClass();
                Intrinsics.checkNotNullParameter(recipient, "recipient");
                j jVar2 = null;
                if (recipient instanceof ChatTransferRecipient.CryptoAddressRecipient) {
                    CryptoAddress cryptoAddress = ((ChatTransferRecipient.CryptoAddressRecipient) recipient).f79721a;
                    if (cryptoAddress.f71062g == ko5.c.FAILED_SCREENING) {
                        jVar = new j(new TextLocalisedClause(R$string.payments_chat_wallets_status_rejected_text, null, null, 14));
                    } else if (cryptoAddress.f71067n != null) {
                        List listK = zhm.v.k(new TextLocalisedClause(R$string.social_payments_chat_disclaimer_crypto_address_limits, null, null, 14), new TextLocalisedClause(R$string.payments_chat_wallets_action_view_limits, null, new Click(30, (Integer) null, (Object) null, "TRANSFER_ONLY_CRYPTO_ADDRESS_VIEW_LIMITS_CLICK_ID", false), 10));
                        m70.a.t(t0.f186434a);
                        jVar = new j(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
                    }
                    jVar2 = jVar;
                }
                yVar.H2(yVar.E, new qtb.c(jVar2, 19));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yVar.H2(yVar.E, new qna.p(data2, 24));
                break;
        }
        return Unit.f186387a;
    }
}
