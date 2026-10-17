package m0a;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import j54.v0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f201121w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ChatTransferRecipient f201122x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ChatItem f201123y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ChatItem chatItem, ChatTransferRecipient chatTransferRecipient, Continuation continuation) {
        super(2, continuation);
        this.f201121w = kVar;
        this.f201123y = chatItem;
        this.f201122x = chatTransferRecipient;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f201121w, this.f201123y, this.f201122x, continuation);
            default:
                return new j(this.f201121w, this.f201122x, this.f201123y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                ChatTransferRecipient chatTransferRecipient = this.f201122x;
                k kVar = this.f201121w;
                i iVar = new i(kVar, this.f201123y, chatTransferRecipient, null);
                this.v = 1;
                Object objB = pu7.a.B(kVar.e, "onP2PMessageClicked", iVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                k kVar2 = this.f201121w;
                v0 v0Var = new v0(kVar2, this.f201122x, this.f201123y, (Continuation) null, 28);
                this.v = 1;
                Object objY2 = kVar2.Y2(this, v0Var);
                return objY2 == aVar2 ? aVar2 : objY2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ChatTransferRecipient chatTransferRecipient, ChatItem chatItem, Continuation continuation) {
        super(2, continuation);
        this.f201121w = kVar;
        this.f201122x = chatTransferRecipient;
        this.f201123y = chatItem;
    }
}
