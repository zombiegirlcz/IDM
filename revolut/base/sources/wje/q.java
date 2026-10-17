package wje;

import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreen;
import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.crypto.impl.ui.settings.a f298080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f298081x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.tab.crypto.impl.ui.settings.a aVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f298080w = aVar;
        this.f298081x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.f298080w, this.f298081x, continuation);
        qVar.v = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        DummyCommand dummyCommand = DummyCommand.f98635a;
        com.revolut.feature.tab.crypto.impl.ui.settings.a aVar2 = this.f298080w;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                m.Companion companion = yhm.m.INSTANCE;
                d0 d0VarA = xh5.a.a(aVar2.f89806w, dummyCommand);
                this.v = null;
                this.u = 1;
                obj2 = nim.a.b(d0VarA, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            objA = (NaviCommand) obj2;
            m.Companion companion2 = yhm.m.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (yhm.m.a(objA) != null) {
            objA = dummyCommand;
        }
        NaviCommand naviCommand = (NaviCommand) objA;
        if (Intrinsics.f(naviCommand, dummyCommand)) {
            aVar2.f89804s.getClass();
            yji.l.g2(aVar2, new CryptoSpareChangeScreen(new CryptoSpareChangeScreenContract$InputData(this.f298081x)), null, new j(aVar2, 3), 1);
            return Unit.f186387a;
        }
        aVar2.H = true;
        Intrinsics.h(naviCommand);
        aVar2.C1(new BridgeDestination(naviCommand));
        return Unit.f186387a;
    }
}
