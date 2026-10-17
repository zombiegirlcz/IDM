package kj6;

import aii.r;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilConsentsGroup;
import com.revolut.feature.external_accounts.impl.ui.brazil.consents.BrazilConsentsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.consents.BrazilConsentsScreenContract$OutputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BrazilConsentsScreen f184307w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(BrazilConsentsScreen brazilConsentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f184307w = brazilConsentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f184307w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f184307w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r outboundConsentClicked;
        int i = this.u;
        BrazilConsentsScreen brazilConsentsScreen = this.f184307w;
        switch (i) {
            case 0:
                String consentId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.consents.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.brazil.consents.a) ((g) brazilConsentsScreen.P.getValue());
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(consentId, "consentId");
                OpenBankingBrazilConsentsGroup openBankingBrazilConsentsGroup = (OpenBankingBrazilConsentsGroup) ((f) ((j2) aVar2.f72562q.f22677a).getValue()).f184308a.getContent();
                if (openBankingBrazilConsentsGroup == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Consents group should be present on item click");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    boolean z = openBankingBrazilConsentsGroup.f72387b.size() == 1;
                    int i2 = i.f184310a[aVar2.o.f72553b.ordinal()];
                    if (i2 == 1) {
                        outboundConsentClicked = new BrazilConsentsScreenContract$OutputData.OutboundConsentClicked(consentId, z);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        outboundConsentClicked = new BrazilConsentsScreenContract$OutputData.InboundConsentClicked(consentId, z);
                    }
                    aVar2.C2(outboundConsentClicked);
                }
                return Unit.f186387a;
            default:
                String consentId2 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.consents.a aVar4 = (com.revolut.feature.external_accounts.impl.ui.brazil.consents.a) ((g) brazilConsentsScreen.P.getValue());
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(consentId2, "consentId");
                OpenBankingBrazilConsentsGroup openBankingBrazilConsentsGroup2 = (OpenBankingBrazilConsentsGroup) ((f) ((j2) aVar4.f72562q.f22677a).getValue()).f184308a.getContent();
                if (openBankingBrazilConsentsGroup2 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Consents group should present on revoke click");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                } else {
                    aVar4.C2(new BrazilConsentsScreenContract$OutputData.RevokeClicked(consentId2, openBankingBrazilConsentsGroup2.f72386a.f73116b, openBankingBrazilConsentsGroup2.f72387b.size() == 1));
                }
                return Unit.f186387a;
        }
    }
}
