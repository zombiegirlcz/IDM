package tb6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c f269503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ qua.p f269504x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar, qua.p pVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f269503w = cVar;
        this.f269504x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f269503w, this.f269504x, continuation, 0);
            default:
                return new y(this.f269503w, this.f269504x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.c cVar;
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                cVar = this.f269503w;
                try {
                    if (i == 0) {
                        yhm.o.b(obj2);
                        cVar.X1(new y0("LOADING_DIALOG_ID", new nii.c0(null, null, null, false, null, false, false, null, 1919), false, 4));
                        aa6.c cVar2 = cVar.f72069p;
                        String id10 = this.f269504x.f249314a.f160150a;
                        xua.a aVar = ((sa6.t) cVar2).f261346b;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        ufm.i iVarJ = ((yua.q) aVar).j(id10);
                        this.v = 1;
                        obj2 = nim.a.b(iVarJ, this);
                        if (obj2 == obj3) {
                        }
                        return obj3;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    obj3 = (qua.p) obj2;
                    cVar.s1();
                    return obj3;
                } finally {
                }
            default:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                cVar = this.f269503w;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        cVar.X1(new y0("LOADING_DIALOG_ID", new nii.c0(null, null, null, false, null, false, false, null, 1919), false, 4));
                        aa6.c cVar3 = cVar.f72069p;
                        String id11 = this.f269504x.f249314a.f160150a;
                        xua.a aVar2 = ((sa6.t) cVar3).f261346b;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        efm.d0 d0VarF = ((yua.q) aVar2).f(id11);
                        this.v = 1;
                        obj2 = nim.a.b(d0VarF, this);
                        if (obj2 == obj4) {
                        }
                        return obj4;
                    }
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    obj4 = (qua.p) obj2;
                    cVar.s1();
                    return obj4;
                } finally {
                }
        }
    }
}
