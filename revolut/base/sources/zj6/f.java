package zj6;

import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilLinkedAccountsGroup;
import com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.BrazilLinkedAccountsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.BrazilLinkedAccountsScreenContract$OutputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BrazilLinkedAccountsScreen f322763w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(BrazilLinkedAccountsScreen brazilLinkedAccountsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f322763w = brazilLinkedAccountsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f322763w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f322763w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BrazilLinkedAccountsScreen brazilLinkedAccountsScreen = this.f322763w;
        switch (i) {
            case 0:
                String linkedAccountId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.a) ((h) brazilLinkedAccountsScreen.P.getValue());
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(linkedAccountId, "linkedAccountId");
                OpenBankingBrazilLinkedAccountsGroup openBankingBrazilLinkedAccountsGroup = (OpenBankingBrazilLinkedAccountsGroup) ((g) ((j2) aVar2.f72649q.f22677a).getValue()).f322764a.getContent();
                if (openBankingBrazilLinkedAccountsGroup == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Linked accounts group should be present on item click");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    aVar2.C2(new BrazilLinkedAccountsScreenContract$OutputData.LinkedAccountClicked(linkedAccountId, openBankingBrazilLinkedAccountsGroup.f72391b.size() == 1));
                }
                break;
            default:
                String linkedAccountId2 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.a aVar4 = (com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts.a) ((h) brazilLinkedAccountsScreen.P.getValue());
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(linkedAccountId2, "linkedAccountId");
                OpenBankingBrazilLinkedAccountsGroup openBankingBrazilLinkedAccountsGroup2 = (OpenBankingBrazilLinkedAccountsGroup) ((g) ((j2) aVar4.f72649q.f22677a).getValue()).f322764a.getContent();
                if (openBankingBrazilLinkedAccountsGroup2 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Linked accounts group should be present on item click");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                } else {
                    aVar4.C2(new BrazilLinkedAccountsScreenContract$OutputData.RevokeClicked(linkedAccountId2, openBankingBrazilLinkedAccountsGroup2.f72390a.f73116b, openBankingBrazilLinkedAccountsGroup2.f72391b.size() == 1));
                }
                break;
        }
        return Unit.f186387a;
    }
}
