package ajh;

import aii.u;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public l u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f5577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f5578x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, RowDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.f5577w = model;
        this.f5578x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.f5578x, this.f5577w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        l lVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            Object obj3 = this.f5577w.u;
            if (!(obj3 instanceof e)) {
                return Unit.f186387a;
            }
            l lVar2 = this.f5578x;
            ejh.b bVar = lVar2.f5582s;
            WealthAccount wealthAccount = ((e) obj3).f5574a;
            this.u = lVar2;
            this.v = 1;
            obj2 = bVar.a(wealthAccount, sih.b.STOCKS, this);
            if (obj2 == aVar) {
                return aVar;
            }
            lVar = lVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = this.u;
            o.b(obj2);
        }
        return lVar.C1((u) obj2);
    }
}
