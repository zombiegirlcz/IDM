package ov5;

import ael.s;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oi3.g;
import oim.o;
import y7a.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements o {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f229963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f229964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Parcelable f229965y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(5, continuation);
        this.u = i;
        this.z = obj2;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.u) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                d dVar = new d((e) this.z, (Continuation) obj6, 0);
                dVar.v = zBooleanValue;
                dVar.f229963w = (CryptoInvestmentsSortingType) obj3;
                dVar.f229964x = (st5.b) obj4;
                dVar.f229965y = (SplitAccountsItemGroup) obj5;
                return dVar.invokeSuspend(Unit.f186387a);
            default:
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                d dVar2 = new d((f0) this.z, (Continuation) obj6, 1);
                dVar2.f229963w = (Data) obj2;
                dVar2.f229964x = (String) obj3;
                dVar2.v = zBooleanValue2;
                dVar2.f229965y = (Clause) obj5;
                return dVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                boolean z = this.v;
                CryptoInvestmentsSortingType cryptoInvestmentsSortingType = (CryptoInvestmentsSortingType) this.f229963w;
                st5.b bVar = (st5.b) this.f229964x;
                SplitAccountsItemGroup splitAccountsItemGroup = (SplitAccountsItemGroup) this.f229965y;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new g(((e) obj3).f229967b.a(cryptoInvestmentsSortingType, bVar, !z, new go.g(SplitAccountsItemGroup.Empty.f71455a, 2)), splitAccountsItemGroup, 14);
            default:
                Data data = (Data) this.f229963w;
                String str = (String) this.f229964x;
                boolean z3 = this.v;
                Clause clause = (Clause) this.f229965y;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var = (f0) obj3;
                f0Var.x2(new s(data, z3, clause, str, f0Var));
                return Unit.f186387a;
        }
    }
}
