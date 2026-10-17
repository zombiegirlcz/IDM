package coa;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.api.CreditApi$Toggles;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.l3;
import om4.s3;
import vkm.q;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f25506w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f25506w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f25506w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f25506w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f25506w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            default:
                g gVar4 = new g(this.f25506w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((qla.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((qla.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        int i = this.u;
        i iVar = this.f25506w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f25513t, new ck2.c(data, 12));
                return Unit.f186387a;
            case 1:
                qla.a aVar2 = (qla.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f25513t, new h(aVar2, 0));
                return Unit.f186387a;
            case 2:
                qla.a aVar4 = (qla.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f25513t, new h(aVar4, 1));
                vkm.d dVarB = rd0.e.b(iVar.o.b());
                int i2 = f.f25505a[aVar4.ordinal()];
                od0.i iVar2 = od0.i.f224256b;
                if (i2 != 1) {
                    int i3 = 3;
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a25.a aVar6 = (a25.a) iVar.f25511r;
                    aVar6.getClass();
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    if (aVar6.f666b.a(CreditApi$Toggles.CreditCollectionNotificationSettings.f66161c)) {
                        od0.i.Companion.getClass();
                        gVar = new go.g(new Data(iVar2, null, false, 6, null), 2);
                    } else {
                        s3 s3Var = (s3) aVar6.f667c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        int i5 = 4;
                        gVar = boh.f.e(q.q(n14.k.p(nim.a.v(q.Q(s3Var.h(loadingStrategy), new okf.m((Continuation) null, s3Var.f226692g, i5)), new l3(i3)), new l3(i5))), new a08.o(aVar6, loadingStrategy, i3));
                    }
                } else {
                    od0.i.Companion.getClass();
                    gVar = new go.g(new Data(iVar2, null, false, 6, null), 2);
                }
                return u0.m(dVarB, gVar);
            default:
                Data data2 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                iVar.H2(iVar.f25513t, new ck2.c(data2, 13));
                return Unit.f186387a;
        }
    }
}
