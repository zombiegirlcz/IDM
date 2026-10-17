package li5;

import com.revolut.feature.crypto.account.api.model.dto.CryptoAccountOnboardingDto;
import com.revolut.feature.crypto.onboarding.impl.service.CryptoOnboardingService;
import gim.i;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ec5.i f195416w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ec5.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f195416w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f195416w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            if (i == 0) {
                o.b(obj2);
                CryptoOnboardingService cryptoOnboardingService = this.v.f195417a;
                ec5.i iVar = this.f195416w;
                String strName = iVar != null ? iVar.name() : null;
                this.u = 1;
                obj2 = cryptoOnboardingService.startProcess(strName, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            m.Companion companion = m.INSTANCE;
            objA = knm.b.G((CryptoAccountOnboardingDto) obj2);
        } catch (Throwable th10) {
            if (th10 instanceof CancellationException) {
                throw th10;
            }
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        return new m(objA);
    }
}
