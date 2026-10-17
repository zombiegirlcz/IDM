package u6k;

import com.revolut.core.model.account.AccountId;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f277610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f277611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MoneyRequest f277612c;

    public /* synthetic */ a(c cVar, MoneyRequest moneyRequest, int i) {
        this.f277610a = i;
        this.f277611b = cVar;
        this.f277612c = moneyRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k71.i descriptor = (k71.i) obj2;
        switch (this.f277610a) {
            case 0:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return this.f277611b.f277615a.a(this.f277612c.f60314a).D(descriptor);
            default:
                String strA = i.a(this.f277612c.f60314a);
                c cVar = this.f277611b;
                cVar.e.a(strA);
                cVar.d.k0(AccountId.Personal.f51414a);
                return Unit.f186387a;
        }
    }
}
