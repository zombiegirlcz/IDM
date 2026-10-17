package s78;

import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tof.hc;
import tof.i7;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ i7 A;
    public final /* synthetic */ nce.a B;
    public final /* synthetic */ String C;
    public final /* synthetic */ m D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ ProductAccountId G;
    public i7 u;
    public nce.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f260582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ParcelableDestination f260583x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RecurringPaymentAccount.Junior f260584y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i7 i7Var, nce.a aVar, String str, m mVar, String str2, String str3, ProductAccountId productAccountId, Continuation continuation) {
        super(2, continuation);
        this.A = i7Var;
        this.B = aVar;
        this.C = str;
        this.D = mVar;
        this.E = str2;
        this.F = str3;
        this.G = productAccountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.A, this.B, this.C, this.D, this.E, this.F, this.G, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listC;
        i7 i7Var;
        nce.a aVar;
        m mVar;
        Object objA;
        Object objA2;
        List list;
        i7 i7Var2;
        nce.a aVar2;
        ParcelableDestination parcelableDestination;
        RecurringPaymentAccount.Junior junior;
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.z;
        m mVar2 = this.D;
        String str = this.C;
        if (i == 0) {
            o.b(obj2);
            listC = u.c(new hc(str, null));
            i7Var = this.A;
            this.u = i7Var;
            aVar = this.B;
            this.v = aVar;
            this.f260582w = listC;
            this.z = 1;
            mVar = mVar2;
            objA = m.a(mVar, this.E, this.C, this.F, this.G, this);
            if (objA != aVar3) {
            }
            return aVar3;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RecurringPaymentAccount.Junior junior2 = this.f260584y;
            ParcelableDestination parcelableDestination2 = this.f260583x;
            List list2 = this.f260582w;
            aVar2 = this.v;
            i7 i7Var3 = this.u;
            o.b(obj2);
            list = list2;
            i7Var2 = i7Var3;
            junior = junior2;
            parcelableDestination = parcelableDestination2;
            objA2 = obj2;
            return new ssi.n(i7Var2, aVar2, null, list, parcelableDestination, null, junior, (nie.c) objA2, null, 804);
        }
        List list3 = this.f260582w;
        nce.a aVar4 = this.v;
        i7 i7Var4 = this.u;
        o.b(obj2);
        listC = list3;
        mVar = mVar2;
        aVar = aVar4;
        i7Var = i7Var4;
        objA = obj2;
        ParcelableDestination parcelableDestination3 = (ParcelableDestination) objA;
        RecurringPaymentAccount.Junior junior3 = new RecurringPaymentAccount.Junior(this.E, str);
        q78.e eVar = mVar.e;
        this.u = i7Var;
        this.v = aVar;
        this.f260582w = listC;
        this.f260583x = parcelableDestination3;
        this.f260584y = junior3;
        this.z = 2;
        objA2 = u68.b.a(eVar, this.E, this.F, this.G, this, 8);
        if (objA2 != aVar3) {
            list = listC;
            i7Var2 = i7Var;
            aVar2 = aVar;
            parcelableDestination = parcelableDestination3;
            junior = junior3;
            return new ssi.n(i7Var2, aVar2, null, list, parcelableDestination, null, junior, (nie.c) objA2, null, 804);
        }
        return aVar3;
    }
}
