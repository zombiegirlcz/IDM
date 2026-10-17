package x32;

import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f302628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d f302629x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f302629x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f302629x, continuation, 0);
                iVar.f302628w = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f302629x, continuation, 1);
                iVar2.f302628w = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((xq2.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                xq2.a aVar = (xq2.a) this.f302628w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.f302628w = null;
                this.v = 1;
                QrScanningScreenContract$ProcessingState.Processing processing = QrScanningScreenContract$ProcessingState.Processing.f62388a;
                com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d dVar = this.f302629x;
                dVar.M2(processing);
                Object objC = dVar.o.c(aVar, this);
                return objC == aVar2 ? aVar2 : objC;
            default:
                Throwable th10 = (Throwable) this.f302628w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    this.f302628w = null;
                    this.v = 1;
                    if (com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d.I2(this.f302629x, th10, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.TRUE;
        }
    }
}
