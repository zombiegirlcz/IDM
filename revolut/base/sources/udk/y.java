package udk;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import skm.a2;
import skm.e0;
import skm.k0;

/* JADX INFO: loaded from: classes11.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f279276w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f279276w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f279276w, continuation, 0);
            case 1:
                return new y(this.f279276w, continuation, 1);
            default:
                return new y(this.f279276w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                z zVar = this.f279276w;
                cli.y yVar = zVar.f279283x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Continuation continuation = null;
                if (i == 0) {
                    yhm.o.b(obj2);
                    su4.n nVar = new su4.n(zVar, continuation, 25);
                    this.v = 1;
                    obj2 = zVar.p2(this, nVar);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                xck.t tVar = (xck.t) obj2;
                zVar.H2(yVar, new ud3.n(tVar, 3));
                xck.u uVar = tVar.f304184c;
                skm.r rVarB = e0.b();
                zVar.f279282w = rVarB;
                zVar.v = zVar.l2(new twb.b0(zVar, uVar, rVarB, continuation, 12), new yi5.b(26));
                if (tVar.f304182a == null || tVar.f304183b == null) {
                    zVar.H2(yVar, new ud3.m(15));
                    zVar.u = zVar.l2(new y(zVar, continuation, 2), new yi5.b(26));
                } else {
                    zVar.H2(yVar, new ud3.m(14));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                z zVar2 = this.f279276w;
                zVar2.H2(zVar2.f279283x, new ud3.m(16));
                zVar2.u = zVar2.l2(new y(zVar2, null, 2), new yi5.b(26));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                Continuation continuation2 = null;
                z zVar3 = this.f279276w;
                try {
                    if (i3 == 0) {
                        yhm.o.b(obj2);
                        skm.r rVar = zVar3.f279282w;
                        if (rVar == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        su4.n nVar2 = new su4.n(rVar, continuation2, 26);
                        this.v = 1;
                        if (zVar3.p2(this, nVar2) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    zVar3.H2(zVar3.f279283x, new ud3.m(17));
                    break;
                } catch (TimeoutCancellationException unused) {
                    a2 a2Var = zVar3.v;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    zVar3.v = null;
                    zVar3.J2(false);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused2) {
                    a2 a2Var2 = zVar3.v;
                    if (a2Var2 != null) {
                        a2Var2.f(null);
                    }
                    zVar3.v = null;
                    zVar3.J2(false);
                }
                return Unit.f186387a;
        }
    }
}
