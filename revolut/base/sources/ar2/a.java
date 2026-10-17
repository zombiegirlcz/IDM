package ar2;

import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode;
import gim.i;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.h2;
import xq2.f;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f8501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xu.e f8502x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, xu.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f8501w = cVar;
        this.f8502x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f8501w, this.f8502x, continuation, 0);
            default:
                return new a(this.f8501w, this.f8502x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
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
                bi0.e eVar = (bi0.e) this.f8501w.e.getValue();
                xu.e frame = this.f8502x;
                Intrinsics.checkNotNullParameter(frame, "frame");
                if (!(frame instanceof xu.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(frame.f308845a);
                Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
                bv.c cVar = frame.f308846b;
                ch0.a aVar2 = new ch0.a(byteBufferWrap, cVar.f18922a, cVar.f18923b, frame.f308847c, 17);
                this.v = 1;
                Object objD = eVar.d(aVar2, this);
                return objD == aVar ? aVar : objD;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                c cVar2 = this.f8501w;
                if (i2 == 0) {
                    o.b(obj2);
                    a aVar4 = new a(cVar2, this.f8502x, null, 0);
                    this.v = 1;
                    obj2 = h2.d(1000L, aVar4, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                MsBarcode msBarcode = (MsBarcode) obj2;
                if (msBarcode != null) {
                    cVar2.f8507g.onNext(e.a(msBarcode, f.CAMERA));
                }
                return Unit.f186387a;
        }
    }
}
