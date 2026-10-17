package iv5;

import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroupsResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements oim.o {
    public /* synthetic */ SplitAccountsItemGroup u;
    public /* synthetic */ ov5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ SplitAccountsItemGroup f168729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ SplitAccountsItemGroup f168730x;

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        j jVar = new j(5, (Continuation) obj6);
        jVar.u = (SplitAccountsItemGroup) obj2;
        jVar.v = (ov5.a) obj3;
        jVar.f168729w = (SplitAccountsItemGroup) obj4;
        jVar.f168730x = (SplitAccountsItemGroup) obj5;
        return jVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SplitAccountsItemGroup splitAccountsItemGroup = this.u;
        ov5.a aVar = this.v;
        SplitAccountsItemGroup splitAccountsItemGroup2 = this.f168729w;
        SplitAccountsItemGroup splitAccountsItemGroup3 = this.f168730x;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new SplitAccountsItemGroupsResult.Classic(splitAccountsItemGroup, aVar.f229960a, aVar.f229961b, splitAccountsItemGroup2, splitAccountsItemGroup3);
    }
}
