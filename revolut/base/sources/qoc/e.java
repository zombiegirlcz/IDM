package qoc;

import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        jlc.r rVarA;
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        InputSliderDelegate.Model model = (InputSliderDelegate.Model) pair.f186385a;
        cy0.a aVar2 = (cy0.a) pair.f186386b;
        r rVar = this.v.f248119c;
        Object obj3 = model.f52567m;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.ProjectionChartParcel.Slider");
        c0 parcel = (c0) obj3;
        dj0.d dVar = parcel.f248102b;
        int i = aVar2.f110014a;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        toc.a aVar3 = parcel.f248101a;
        alc.g gVar = parcel.f248103c;
        int i2 = n.f248129a[aVar3.ordinal()];
        if (i2 == 1) {
            rVarA = jlc.r.a((jlc.r) rVar.b3(), null, null, null, dj0.d.c(dVar, g4i.a.s(i, gVar.f6196a.d.f115082a), null, 2), null, null, null, null, null, null, null, null, null, null, 32759);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rVarA = jlc.r.a((jlc.r) rVar.b3(), null, null, null, null, dj0.d.c(dVar, g4i.a.s(i, gVar.f6197b.d.f115082a), null, 2), null, null, null, null, null, null, null, null, null, 32751);
        }
        rVar.d3(new fnc.z(rVarA, 3));
        rVar.j3(rVarA);
        return Unit.f186387a;
    }
}
