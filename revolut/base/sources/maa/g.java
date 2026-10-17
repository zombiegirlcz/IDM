package maa;

import cli.y;
import com.revolut.feature.pix.impl.flow.pix_area.screens.add_trusted_account.PixAddTrustedAccountScreen;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixAddTrustedAccountScreen f203975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(PixAddTrustedAccountScreen pixAddTrustedAccountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203975w = pixAddTrustedAccountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f203975w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f203975w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f203975w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            default:
                g gVar4 = new g(this.f203975w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((f5j.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((f5j.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l lVar;
        int i = this.u;
        PixAddTrustedAccountScreen pixAddTrustedAccountScreen = this.f203975w;
        switch (i) {
            case 0:
                l filter = (l) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE3 = pixAddTrustedAccountScreen.d();
                sVarE3.getClass();
                Intrinsics.checkNotNullParameter(filter, "filter");
                y yVar = sVarE3.f203994t;
                l lVar2 = ((j) ((j2) yVar.f22677a).getValue()).d;
                int i2 = o.f203985a[filter.ordinal()];
                if (i2 == 1) {
                    lVar = l.NONE;
                } else if (i2 == 2) {
                    lVar = l.INDIVIDUALS;
                    if (lVar2 == lVar) {
                        lVar = l.NONE;
                    }
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar = l.BUSINESSES;
                    if (lVar2 == lVar) {
                        lVar = l.NONE;
                    }
                }
                sVarE3.H2(yVar, new m98.k(lVar, 7));
                return Unit.f186387a;
            case 1:
                f5j.a beneficiary = (f5j.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE32 = pixAddTrustedAccountScreen.d();
                sVarE32.getClass();
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                y yVar2 = sVarE32.f203994t;
                Set setH1 = d0.h1(((j) ((j2) yVar2.f22677a).getValue()).e);
                if (setH1.contains(beneficiary)) {
                    setH1.remove(beneficiary);
                } else {
                    setH1.add(beneficiary);
                }
                sVarE32.H2(yVar2, new imk.e(11, setH1));
                return Unit.f186387a;
            case 2:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE33 = pixAddTrustedAccountScreen.d();
                Intrinsics.h(query);
                sVarE33.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                sVarE33.f203993s.k(query);
                return Unit.f186387a;
            default:
                f5j.a beneficiary2 = (f5j.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarE34 = pixAddTrustedAccountScreen.d();
                sVarE34.getClass();
                Intrinsics.checkNotNullParameter(beneficiary2, "beneficiary");
                y yVar3 = sVarE34.f203994t;
                Set setH12 = d0.h1(((j) ((j2) yVar3.f22677a).getValue()).e);
                setH12.remove(beneficiary2);
                sVarE34.H2(yVar3, new imk.e(12, setH12));
                return Unit.f186387a;
        }
    }
}
