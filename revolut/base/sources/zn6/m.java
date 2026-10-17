package zn6;

import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c f323681w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f323681w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f323681w, continuation, 0);
            default:
                return new m(this.f323681w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c cVar = this.f323681w;
                    com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.b bVar = new com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.b(cVar, null);
                    this.v = 1;
                    if (u0.b0(cVar.X(), "CONTINUE_BUTTON_TAG", bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c cVar2 = this.f323681w;
                    xg6.a aVar3 = cVar2.f73061q;
                    ReviewAccountLinkingDetailsScreenContract$InputData reviewAccountLinkingDetailsScreenContract$InputData = cVar2.o;
                    String str = reviewAccountLinkingDetailsScreenContract$InputData.f73053a;
                    String str2 = reviewAccountLinkingDetailsScreenContract$InputData.f73055c;
                    this.v = 1;
                    Object objD = ((th6.m) aVar3.f305573a).d.d(new th6.a(str, str2), false, this);
                    if (objD != aVar2) {
                        objD = Unit.f186387a;
                    }
                    if (objD != aVar2) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
