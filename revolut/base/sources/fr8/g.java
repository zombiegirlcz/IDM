package fr8;

import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JuniorTransferAmountScreen f137413w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(JuniorTransferAmountScreen juniorTransferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f137413w = juniorTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f137413w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f137413w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((h9i.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        io3.d dVar;
        int i = this.u;
        JuniorTransferAmountScreen juniorTransferAmountScreen = this.f137413w;
        switch (i) {
            case 0:
                h9i.c item = (h9i.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarT2 = juniorTransferAmountScreen.T2();
                Intrinsics.h(item);
                rVarT2.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                rVarT2.x2(new p(item, 0));
                return Unit.f186387a;
            default:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarT22 = juniorTransferAmountScreen.T2();
                String amount = charSequence.toString();
                rVarT22.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                long jB = rVarT22.f137436s.b(amount, rVarT22.y2().f306286a);
                xi0.b bVarY2 = rVarT22.y2();
                int i2 = q.f137432a[rVarT22.f137433p.f77456b.ordinal()];
                if (i2 == 1) {
                    dVar = (io3.d) ((l) rVarT22.t2()).e.getContent();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = (io3.d) ((l) rVarT22.t2()).d.getContent();
                }
                if (dVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                List list = rVarT22.v.validate(new ir8.j(jB, io3.h.e(dVar).f115082a, bVarY2, bVarY2)).f316033b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((yqi.b) obj3) instanceof srf.a) {
                        arrayList.add(obj3);
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                rVarT22.x2(new csl.a(jB, arrayList2, arrayList, 5));
                return Unit.f186387a;
        }
    }
}
