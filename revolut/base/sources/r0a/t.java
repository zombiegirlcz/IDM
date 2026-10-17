package r0a;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f250749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f250750x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y yVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f250749w = yVar;
        this.f250750x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f250749w, continuation, 0);
                tVar.f250750x = obj2;
                return tVar;
            case 1:
                return new t(this.f250749w, this.f250750x, continuation);
            default:
                t tVar2 = new t(this.f250749w, continuation, 2);
                tVar2.f250750x = obj2;
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((ChatTransferRecipient) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((ChatTransferRecipient) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                ChatTransferRecipient chatTransferRecipient = (ChatTransferRecipient) this.f250750x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    Intrinsics.h(chatTransferRecipient);
                    this.f250750x = null;
                    this.v = 1;
                    if (y.I2(this.f250749w, chatTransferRecipient, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                y yVar = this.f250749w;
                pmk.t tVar = new pmk.t(yVar, this.f250750x, null, 27);
                this.v = 1;
                Object objB = pu7.a.B(yVar.k, "onSuggestionCloseClicked", tVar, this);
                return objB == aVar2 ? aVar2 : objB;
            default:
                ChatTransferRecipient chatTransferRecipient2 = (ChatTransferRecipient) this.f250750x;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                mp6.j jVar = new mp6.j(this.f250749w, chatTransferRecipient2, (Continuation) null, 24);
                this.f250750x = null;
                this.v = 1;
                Object objO = e0.o(jVar, this);
                return objO == aVar3 ? aVar3 : objO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f250749w = yVar;
    }
}
