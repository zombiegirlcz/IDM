package boc;

import com.revolut.feature.wealth.api.declaration.WithdrawFeatureConfig;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function1 {
    public h u;
    public TransferSubjectId.Portfolio v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WealthAccountType f17380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f17382y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f17382y = hVar;
        this.z = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f17382y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TransferSubjectId.Portfolio portfolio;
        WealthAccountType wealthAccountType;
        h hVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f17381x;
        if (i == 0) {
            o.b(obj2);
            String str = this.z;
            portfolio = new TransferSubjectId.Portfolio(str);
            WealthAccountType wealthAccountType2 = WealthAccountType.ROBO;
            h hVar2 = this.f17382y;
            zjh.f fVar = hVar2.f17385n;
            this.u = hVar2;
            this.v = portfolio;
            this.f17380w = wealthAccountType2;
            this.f17381x = 1;
            xi0.b.Companion.getClass();
            obj2 = oi0.d.j(fVar, str, xi0.b.i, this);
            if (obj2 == aVar) {
                return aVar;
            }
            wealthAccountType = wealthAccountType2;
            hVar = hVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wealthAccountType = this.f17380w;
            portfolio = this.v;
            hVar = this.u;
            o.b(obj2);
        }
        return hVar.A2(new WithdrawFeatureConfig.Destination(portfolio, wealthAccountType, (xi0.b) obj2));
    }
}
