package xrg;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.chat.RealtimeWaveformView;
import com.revolut.core.ui_kit.views.ChatInputView;
import d90.f;
import gim.i;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.k0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f308338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f308339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f308340y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.f308339x = fVar;
        this.f308340y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f308340y, this.f308339x, continuation);
                cVar.f308338w = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f308339x, this.f308340y, continuation);
                cVar2.f308338w = obj2;
                return cVar2;
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
        switch (this.u) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f308338w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                while (e0.x(coroutineScope.getF74819h())) {
                    b0 b0Var = this.f308340y.f308344p;
                    if (b0Var != null) {
                        long jA = this.f308339x.a();
                        ChatInputView chatInputView = (ChatInputView) b0Var.f185144b;
                        chatInputView.d0(chatInputView.getTimerView(), jA);
                    }
                    this.f308338w = coroutineScope;
                    this.v = 1;
                    if (k0.b(1000L, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f186387a;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f308338w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0 && i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                while (e0.x(coroutineScope2.getF74819h())) {
                    f fVar = this.f308339x;
                    int i3 = d90.d.f112325a[fVar.f112329c.ordinal()];
                    byte bG = 0;
                    if (i3 == 1) {
                        int maxAmplitude = fVar.f112327a.getMaxAmplitude();
                        if (maxAmplitude > 0) {
                            double dE = kotlin.ranges.f.e((kotlin.ranges.f.e(Math.log10(((double) maxAmplitude) / ((double) 32767)) * 20.0d, -40.0d, 0.0d) - (-40.0d)) / 40.0d, 0.0d, 1.0d);
                            bG = (byte) kotlin.ranges.f.g(rim.d.b((3.0d - (dE * 2.0d)) * dE * dE * ((double) 100)), 0, 100);
                        }
                    } else if (i3 != 2 && i3 != 3 && i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d dVar = this.f308340y;
                    b0 b0Var2 = dVar.f308344p;
                    if (b0Var2 != null) {
                        RealtimeWaveformView realtimeWaveformView = ((ChatInputView) b0Var2.f185144b).getRealtimeWaveformView();
                        realtimeWaveformView.f56850b = (byte) Math.max((int) realtimeWaveformView.f56850b, (int) bG);
                        if (!realtimeWaveformView.f56856m) {
                            realtimeWaveformView.f56856m = true;
                            realtimeWaveformView.f56855l.e(BitmapDescriptorFactory.HUE_RED, realtimeWaveformView.e, 500L, -1L, true);
                        }
                    }
                    dVar.f308351y.b(bG);
                    this.f308338w = coroutineScope2;
                    this.v = 1;
                    if (k0.b(74L, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.f308340y = dVar;
        this.f308339x = fVar;
    }
}
