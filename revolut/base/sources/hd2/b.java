package hd2;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import skm.e0;
import skm.k0;
import t73.q0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i) {
        super(2, null);
        this.u = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(2, 0, continuation);
            case 1:
                return new b(2, 1, continuation);
            case 2:
                return new b(2, 2, continuation);
            case 3:
                return new b(2, 3, continuation);
            case 4:
                return new b(this.v, continuation);
            case 5:
                return new b(2, 5, continuation);
            case 6:
                return new b(2, 6, continuation);
            case 7:
                b bVar = new b(2, 7, continuation);
                bVar.v = ((Number) obj2).intValue();
                return bVar;
            case 8:
                return new b(2, 8, continuation);
            default:
                return new b(2, 9, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create(Integer.valueOf(((Number) obj2).intValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((b) create((q0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b) create(Integer.valueOf(((Number) obj2).intValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(1000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                    iji.c cVar = new iji.c(2, null);
                    this.v = 1;
                    if (e0.J(gVar, cVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(1000L, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(2000L, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.TRUE;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.eraseColor(this.v);
                return bitmapCreateBitmap;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    od0.a aVar7 = od0.a.f224253a;
                    if (od0.a.i()) {
                        this.v = 1;
                        if (k0.b(300L, this) == aVar6) {
                            return aVar6;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(2000L, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return Boolean.valueOf(this.v > 0);
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (k0.b(5000L, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
                    zhi.c cVar2 = new zhi.c(2, null);
                    this.v = 1;
                    if (e0.J(gVar2, cVar2, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.v = i;
    }
}
