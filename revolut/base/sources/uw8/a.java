package uw8;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import gim.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qt8.l;
import rd0.c;
import rd0.d;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f283559w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283559w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f283559w, continuation, 0);
            default:
                return new a(this.f283559w, continuation, 1);
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
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        b bVar = this.f283559w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        o.b(obj2);
                        skd.i iVar = bVar.f283561b;
                        SlotContext slotContextH = bVar.f283562c.h();
                        this.v = 1;
                        if (iVar.d(slotContextH, false, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    Unit unit = Unit.f186387a;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                    d.a(c.ERROR, null, null, e2, h0Var);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        o.b(obj2);
                        mt8.d dVar = bVar.f283560a;
                        this.v = 1;
                        x4l.c cVar = ((l) ((qt8.d) dVar).f249018a).d;
                        Object obj3 = Unit.f186387a;
                        Object objD = cVar.d(obj3, false, this);
                        if (objD != aVar2) {
                            objD = obj3;
                        }
                        if (objD == aVar2) {
                            obj3 = objD;
                        }
                        if (obj3 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    Unit unit2 = Unit.f186387a;
                    break;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception e5) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                    d.a(c.ERROR, null, null, e5, h0Var2);
                }
                return Unit.f186387a;
        }
    }
}
