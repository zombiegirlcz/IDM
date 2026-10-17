package koe;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.screens.list.a f186333w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.tax_residency.impl.screens.list.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f186333w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f186333w, continuation, 0);
            case 1:
                return new v(this.f186333w, continuation, 1);
            case 2:
                return new v(this.f186333w, continuation, 2);
            default:
                return new v(this.f186333w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.tax_residency.impl.screens.list.a aVar2 = this.f186333w;
                    if (!aVar2.o.f90085h) {
                        return f0.f322471a;
                    }
                    ufm.f fVarI2 = aVar2.I2();
                    this.v = 1;
                    obj2 = nim.a.b(fVarI2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return (List) obj2;
            case 1:
                com.revolut.feature.tax_residency.impl.screens.list.a aVar3 = this.f186333w;
                yme.a aVar4 = aVar3.f90093q;
                cli.y yVar = aVar3.f90097w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    if (!pyd.c.E(((h) ((j2) yVar.f22677a).getValue()).f186315b)) {
                        return ((h) ((j2) yVar.f22677a).getValue()).f186315b;
                    }
                    efm.r rVarDoOnNext = mo3.a.n(aVar3.o.f90084g ? ((joe.o) ((hoe.a) aVar4).f154277a).f176943h.f(Unit.f186387a, true) : ((joe.o) ((hoe.a) aVar4).f154277a).e.f(Unit.f186387a, true)).doOnNext(new km2.b(12, new r(aVar3, 5)));
                    Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
                    this.v = 1;
                    obj2 = nim.a.f(rVarDoOnNext, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return (Data) obj2;
            case 2:
                com.revolut.feature.tax_residency.impl.screens.list.a aVar6 = this.f186333w;
                cli.y yVar2 = aVar6.f90097w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    if (!pyd.c.E(((h) ((j2) yVar2.f22677a).getValue()).f186316c)) {
                        return ((h) ((j2) yVar2.f22677a).getValue()).f186316c;
                    }
                    efm.r rVarDoOnNext2 = mo3.a.n(nim.a.w(((joe.o) ((hoe.a) aVar6.f90093q).f154277a).d.f(Unit.f186387a, false), new hmc.a(24))).doOnNext(new km2.b(13, new r(aVar6, 6)));
                    Intrinsics.checkNotNullExpressionValue(rVarDoOnNext2, "doOnNext(...)");
                    this.v = 1;
                    obj2 = nim.a.f(rVarDoOnNext2, this);
                    if (obj2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return (Data) obj2;
            default:
                com.revolut.feature.tax_residency.impl.screens.list.a aVar8 = this.f186333w;
                cli.y yVar3 = aVar8.f90097w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    if (!pyd.c.E(((h) ((j2) yVar3.f22677a).getValue()).f186314a)) {
                        return ((h) ((j2) yVar3.f22677a).getValue()).f186314a;
                    }
                    efm.r rVarDoOnNext3 = mo3.a.n(nim.a.w(aVar8.f90094r.k(false), w.f)).doOnNext(new km2.b(14, new r(aVar8, 7)));
                    Intrinsics.checkNotNullExpressionValue(rVarDoOnNext3, "doOnNext(...)");
                    this.v = 1;
                    obj2 = nim.a.f(rVarDoOnNext3, this);
                    if (obj2 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return (Data) obj2;
        }
    }
}
