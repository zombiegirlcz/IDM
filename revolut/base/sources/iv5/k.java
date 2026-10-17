package iv5;

import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroupsResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oim.p;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements p {
    public /* synthetic */ SplitAccountsItemGroup u;
    public /* synthetic */ SplitAccountsItemGroup v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ SplitAccountsItemGroup f168731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ SplitAccountsItemGroup f168732x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ SplitAccountsItemGroup f168733y;

    public k(Continuation continuation) {
        super(6, continuation);
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        k kVar = new k((Continuation) obj7);
        kVar.u = (SplitAccountsItemGroup) obj2;
        kVar.v = (SplitAccountsItemGroup) obj3;
        kVar.f168731w = (SplitAccountsItemGroup) obj4;
        kVar.f168732x = (SplitAccountsItemGroup) obj5;
        kVar.f168733y = (SplitAccountsItemGroup) obj6;
        return kVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SplitAccountsItemGroup splitAccountsItemGroup = this.u;
        SplitAccountsItemGroup splitAccountsItemGroup2 = this.v;
        SplitAccountsItemGroup splitAccountsItemGroup3 = this.f168731w;
        SplitAccountsItemGroup splitAccountsItemGroup4 = this.f168732x;
        SplitAccountsItemGroup splitAccountsItemGroup5 = this.f168733y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new SplitAccountsItemGroupsResult.GroupedByProduct(splitAccountsItemGroup, splitAccountsItemGroup2, splitAccountsItemGroup3, splitAccountsItemGroup4, splitAccountsItemGroup5);
    }
}
