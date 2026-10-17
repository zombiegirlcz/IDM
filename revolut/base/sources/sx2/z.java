package sx2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.R$string;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ oki.h A;
    public final /* synthetic */ int u = 0;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f266352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f266353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f266354y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.feature.card_design.impl.card_design.carousel.e eVar, Continuation continuation) {
        super(2, continuation);
        this.A = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z((com.revolut.feature.card_design.impl.card_design.carousel.e) this.A, continuation);
                zVar.f266353x = obj2;
                return zVar;
            default:
                z zVar2 = new z((xsi.b) this.z, (xsi.p) this.A, this.f266354y, continuation);
                zVar2.f266353x = obj2;
                return zVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z) create((vf0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        Data data;
        boolean z3;
        Pair pair;
        boolean zBooleanValue;
        Object objP2;
        switch (this.u) {
            case 0:
                com.revolut.feature.card_design.impl.card_design.carousel.e eVar = (com.revolut.feature.card_design.impl.card_design.carousel.e) this.A;
                vf0.g gVar = (vf0.g) this.f266353x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f266352w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    final Data data2 = (Data) gVar.f288428a;
                    final Data data3 = (Data) gVar.f288429b;
                    final Data data4 = (Data) gVar.f288430c;
                    final Data data5 = (Data) gVar.d;
                    final Data data6 = (Data) gVar.e;
                    final bla.c cVar = (bla.c) gVar.f;
                    final boolean zBooleanValue2 = ((Boolean) gVar.f288431g).booleanValue();
                    final boolean zBooleanValue3 = ((Boolean) gVar.f288432h).booleanValue();
                    eVar.H2(eVar.N, new Function1() { // from class: sx2.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            Data data7 = data2;
                            Intrinsics.h(data7);
                            Data data8 = data4;
                            Intrinsics.h(data8);
                            Data data9 = data5;
                            Intrinsics.h(data9);
                            return c0.a((c0) obj3, data7, data3, data8, data9, null, null, data6, null, cVar, zBooleanValue2, zBooleanValue3, 13153);
                        }
                    });
                    j2 j2Var = eVar.J;
                    Intrinsics.h(data4);
                    this.f266353x = null;
                    this.z = data3;
                    this.v = zBooleanValue2;
                    this.f266354y = zBooleanValue3;
                    this.f266352w = 1;
                    j2Var.getClass();
                    j2Var.g(null, data4);
                    if (Unit.f186387a == aVar) {
                        return aVar;
                    }
                    z = zBooleanValue3;
                    data = data3;
                    z3 = zBooleanValue2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    z = this.f266354y;
                    z3 = this.v;
                    data = (Data) this.z;
                    yhm.o.b(obj2);
                }
                j2 j2Var2 = eVar.K;
                this.f266353x = null;
                this.z = null;
                this.v = z3;
                this.f266354y = z;
                this.f266352w = 2;
                j2Var2.setValue(data);
                if (Unit.f186387a == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                xsi.p pVar = (xsi.p) this.A;
                xsi.b bVar = (xsi.b) this.z;
                xsi.a aVar2 = bVar.f308525c;
                CoroutineScope coroutineScope = (CoroutineScope) this.f266353x;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f266352w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    boolean z4 = bVar.d;
                    if (!z4 && aVar2.f308520a == bVar.f308524b) {
                        pair = new Pair(Boolean.FALSE, new dj0.d(aVar2.f308520a, aVar2.f308522c));
                    } else if (!z4 && aVar2.f308520a > 0) {
                        pair = new Pair(Boolean.TRUE, new dj0.d(aVar2.f308520a, aVar2.f308522c));
                    } else {
                        if (!z4) {
                            return Unit.f186387a;
                        }
                        pair = new Pair(Boolean.TRUE, null);
                    }
                    zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                    f9k.e eVar2 = new f9k.e(coroutineScope, pVar, bVar, this.f266354y, zBooleanValue, (dj0.d) pair.f186386b, (Continuation) null);
                    this.f266353x = null;
                    this.v = zBooleanValue;
                    this.f266352w = 1;
                    objP2 = pVar.p2(this, eVar2);
                    if (objP2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        pVar.B2();
                        return Unit.f186387a;
                    }
                    boolean z6 = this.v;
                    yhm.o.b(obj2);
                    zBooleanValue = z6;
                    objP2 = obj2;
                }
                if (!((Boolean) objP2).booleanValue()) {
                    pVar.X1(new y0("ERROR_DIALOG_ID", new nii.z(new TextLocalisedClause(R$string.common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4));
                    return Unit.f186387a;
                }
                Flow flowX1 = pVar.X1(((wsi.a) pVar.f308542s).a(this.f266354y));
                this.f266353x = null;
                this.v = zBooleanValue;
                this.f266352w = 2;
                if (vkm.q.x(flowX1, this) == aVar3) {
                    return aVar3;
                }
                pVar.B2();
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(xsi.b bVar, xsi.p pVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.z = bVar;
        this.A = pVar;
        this.f266354y = z;
    }
}
