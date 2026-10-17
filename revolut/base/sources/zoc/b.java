package zoc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ TransferSubjectId A;
    public final /* synthetic */ dj0.d B;
    public dj0.d u;
    public TradingAccount.Robo v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public nmc.a f323956w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f323957x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f323958y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, TransferSubjectId transferSubjectId, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.z = eVar;
        this.A = transferSubjectId;
        this.B = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.z, this.A, this.B, continuation);
        bVar.f323958y = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((TradingAccount.Robo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TradingAccount.Robo robo;
        nmc.a aVar;
        dj0.d dVar;
        Object next;
        TradingAccount.Robo robo2 = (TradingAccount.Robo) this.f323958y;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f323957x;
        if (i == 0) {
            o.b(obj2);
            if (robo2 == null) {
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            e eVar = this.z;
            nmc.a aVar3 = eVar.f323965b;
            String f95657a = this.A.getF95657a();
            this.f323958y = null;
            dj0.d dVar2 = this.B;
            this.u = dVar2;
            this.v = robo2;
            this.f323956w = aVar3;
            this.f323957x = 1;
            obj2 = q.z(mo3.a.g(glc.a.a(eVar.f323964a, f95657a), null, null, 3), this);
            if (obj2 == aVar2) {
                return aVar2;
            }
            robo = robo2;
            aVar = aVar3;
            dVar = dVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.f323956w;
            robo = this.v;
            dVar = this.u;
            o.b(obj2);
        }
        RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) obj2;
        if (roboPortfolioInfo == null) {
            throw new IllegalStateException("portfolio not found but buildOneOffAddMoneySuccessDialogTitle called");
        }
        Iterator it8 = robo.c0().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (com.revolut.shared.feature.wealth.models.trading_accounts.e.a((TradingProduct) next)) {
                break;
            }
        }
        TradingProduct tradingProduct = (TradingProduct) next;
        return aVar.a(roboPortfolioInfo, dVar, tradingProduct != null ? tradingProduct.f105281b : null);
    }
}
