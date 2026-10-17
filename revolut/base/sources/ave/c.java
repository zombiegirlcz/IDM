package ave;

import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.feature.topup_screen.impl.data.network.service.ExternalCardVerificationService;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o7.d;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f10018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f10019x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f10018w = dVar;
        this.f10019x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f10018w, this.f10019x, continuation, 0);
            default:
                return new c(this.f10018w, this.f10019x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f10019x;
        d dVar = this.f10018w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ExternalCardVerificationService externalCardVerificationService = (ExternalCardVerificationService) dVar.f222642b;
                    this.v = 1;
                    obj2 = externalCardVerificationService.getCardVerificationStatus(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                try {
                    return CardholderVerificationStatus.valueOf(((oue.a) obj2).getCardholderVerificationStatus());
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    ExternalCardVerificationService externalCardVerificationService2 = (ExternalCardVerificationService) dVar.f222642b;
                    this.v = 1;
                    if (externalCardVerificationService2.launchAutomaticCardOwnerVerification(str, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
