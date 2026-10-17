package aw;

import com.revolut.camerakit.core.settings.VideoWatermark;
import com.revolut.camerakit.core.settings.WatermarkConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ k u;
    public final /* synthetic */ VideoWatermark.Enabled v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, VideoWatermark.Enabled enabled, Continuation continuation) {
        super(2, continuation);
        this.u = kVar;
        this.v = enabled;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        dw.v vVar = (dw.v) this.u.k.get();
        VideoWatermark.Enabled enabled = this.v;
        String nonce = enabled.f50746a;
        WatermarkConfig config = enabled.f50747b;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(config, "config");
        dw.u uVar = vVar.f118225a;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(config, "config");
        uVar.f118224b.d.execute(new b0.d(uVar, 5, nonce, config));
        return Unit.f186387a;
    }
}
