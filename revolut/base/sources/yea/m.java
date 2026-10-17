package yea;

import aii.u;
import com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload;
import com.revolut.feature.pockets.api.ui.add_new.ExtendedAccountId;
import com.revolut.feature.pockets.impl.ui.add_new.OpenNewPocketFlowContract$InputData;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function1 {
    public com.revolut.feature.pockets.impl.ui.add_new.d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.ui.add_new.d f312847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ jda.a f312848x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.pockets.impl.ui.add_new.d dVar, jda.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f312847w = dVar;
        this.f312848x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.f312847w, this.f312848x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair;
        com.revolut.feature.pockets.impl.ui.add_new.d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.pockets.impl.ui.add_new.d dVar2 = this.f312847w;
            zfe.e eVar = dVar2.f80903p;
            MainScreenTab mainScreenTab = ibb.c.f160140a;
            OpenNewPocketFlowContract$InputData openNewPocketFlowContract$InputData = dVar2.o;
            String str = this.f312848x.f173043a;
            io3.l lVar = openNewPocketFlowContract$InputData.f80888a;
            ExtendedAccountId extendedAccountId = openNewPocketFlowContract$InputData.f80889b;
            if (lVar == io3.l.MERCHANT) {
                pair = new Pair(ProductId.PRO, null);
            } else if (extendedAccountId instanceof ExtendedAccountId.Personal) {
                pair = new Pair(ProductId.CURRENCY, null);
            } else if (extendedAccountId instanceof ExtendedAccountId.Joint) {
                pair = new Pair(ProductId.JOINT, null);
            } else {
                if (!(extendedAccountId instanceof ExtendedAccountId.Junior)) {
                    throw new IllegalArgumentException("Unsupported input: pocketType=" + openNewPocketFlowContract$InputData.f80888a + ", accountIdClass=" + extendedAccountId.getClass().getSimpleName());
                }
                pair = new Pair(ProductId.YOUTH, new JuniorProductAccountIdPayload(((ExtendedAccountId.Junior) extendedAccountId).f80790a, str));
            }
            ProductAccountDescriptor$Value.Main main = new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, (JuniorProductAccountIdPayload) pair.f186386b), (ProductId) pair.f186385a);
            this.u = dVar2;
            this.v = 1;
            Object objB = ((cge.e) eVar).b(main, mainScreenTab, null, this);
            if (objB == aVar) {
                return aVar;
            }
            dVar = dVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.u;
            o.b(obj2);
        }
        return dVar.C1((u) obj2);
    }
}
