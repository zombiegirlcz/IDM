package rgf;

import com.revolut.feature.tab.accounts.api.TabAccountsApi$Toggles;
import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ t v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, Continuation continuation) {
        super(2, continuation);
        this.v = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        t tVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = ((jte.d) tVar.f254170q).c(TabAccountsApi$Toggles.HomeTotalWealth.f89457c) ? ((ji5.e) tVar.f254171r).e(this) : Boolean.FALSE;
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Collection collectionB = ((Boolean) obj2).booleanValue() ? y0.b(NonProductAccountFilter.Crypto.f89715a) : h0.f322473a;
        tVar.H2(tVar.f254174w, new m(collectionB, tVar, 0));
        if (!collectionB.isEmpty()) {
            gv5.d dVar = tVar.f254172s;
            efm.r rVarSwitchMap = xv5.c.b(dVar.f147061b).switchMap(new gqk.b(new gv5.a(dVar, 0), 29));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
            yji.l.a1(tVar, new r7b.e(rd0.e.b(rVarSwitchMap), 5), null, null, new s(tVar, null), 3);
        }
        return Unit.f186387a;
    }
}
