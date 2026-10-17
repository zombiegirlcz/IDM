package au6;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f9625w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                u uVar = new u(3, 0, (Continuation) obj4);
                uVar.f9625w = (List) obj2;
                uVar.v = zBooleanValue;
                return uVar.invokeSuspend(Unit.f186387a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                u uVar2 = new u((m2) this.f9625w, (Continuation) obj4, 1);
                uVar2.v = zBooleanValue2;
                return uVar2.invokeSuspend(Unit.f186387a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                u uVar3 = new u(3, 2, (Continuation) obj4);
                uVar3.f9625w = (st2.c) obj2;
                uVar3.v = zBooleanValue3;
                return uVar3.invokeSuspend(Unit.f186387a);
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                u uVar4 = new u(3, 3, (Continuation) obj4);
                uVar4.f9625w = (Boolean) obj2;
                uVar4.v = zBooleanValue4;
                return uVar4.invokeSuspend(Unit.f186387a);
            case 4:
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                u uVar5 = new u(3, 4, (Continuation) obj4);
                uVar5.f9625w = (String) obj2;
                uVar5.v = zBooleanValue5;
                return uVar5.invokeSuspend(Unit.f186387a);
            case 5:
                boolean zBooleanValue6 = ((Boolean) obj2).booleanValue();
                u uVar6 = new u(3, 5, (Continuation) obj4);
                uVar6.v = zBooleanValue6;
                uVar6.f9625w = (CryptoInvestmentsSortingType) obj3;
                return uVar6.invokeSuspend(Unit.f186387a);
            case 6:
                boolean zBooleanValue7 = ((Boolean) obj3).booleanValue();
                u uVar7 = new u(3, 6, (Continuation) obj4);
                uVar7.f9625w = (lmh.e) obj2;
                uVar7.v = zBooleanValue7;
                return uVar7.invokeSuspend(Unit.f186387a);
            case 7:
                boolean zBooleanValue8 = ((Boolean) obj3).booleanValue();
                u uVar8 = new u((mtj.q) this.f9625w, (Continuation) obj4, 7);
                uVar8.v = zBooleanValue8;
                return uVar8.invokeSuspend(Unit.f186387a);
            case 8:
                boolean zBooleanValue9 = ((Boolean) obj3).booleanValue();
                u uVar9 = new u((uea.f) this.f9625w, (Continuation) obj4, 8);
                uVar9.v = zBooleanValue9;
                return uVar9.invokeSuspend(Unit.f186387a);
            default:
                boolean z = ((kf1.d) obj3).f183270a;
                u uVar10 = new u((vfc.f) this.f9625w, (Continuation) obj4, 9);
                uVar10.v = z;
                return uVar10.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Class cls = Boolean.TYPE;
        switch (i) {
            case 0:
                List list = (List) this.f9625w;
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 1:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(cls, ((m2) this.f9625w).f9572c, "STORAGE_KEY_TRADING_NAME_ENABLED", Boolean.valueOf(z3));
                break;
            case 2:
                st2.c cVar = (st2.c) this.f9625w;
                boolean z4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 3:
                Boolean bool = (Boolean) this.f9625w;
                boolean z6 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 4:
                String str = (String) this.f9625w;
                boolean z11 = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 5:
                boolean z12 = this.v;
                CryptoInvestmentsSortingType cryptoInvestmentsSortingType = (CryptoInvestmentsSortingType) this.f9625w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 6:
                lmh.e eVar = (lmh.e) this.f9625w;
                boolean z29 = this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (eVar != null) {
                    zel.f instrumentGroup = eVar.f197078a;
                    Data data = eVar.f197079b;
                    Data data2 = eVar.f197080c;
                    Data swipeableAssets = eVar.d;
                    ScreenerSortingOptions screenerSortingOptions = eVar.e;
                    Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
                    Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
                }
                break;
            case 7:
                boolean z31 = this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((mtj.q) this.f9625w).d.G(Boolean.valueOf(z31), "CHALLENGES_ELIGIBILITY_STORAGE_KEY", wim.z.d(kotlin.jvm.internal.o0.b(cls)));
                break;
            case 8:
                boolean z41 = this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(cls, ((uea.f) this.f9625w).d, "SWITCH_ACCOUNT_BANNER_STORAGE_KEY", Boolean.valueOf(z41));
                break;
            default:
                boolean z49 = this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vfc.f fVar = (vfc.f) this.f9625w;
                xe0.e eVar2 = fVar.d;
                fVar.f288568c.getClass();
                eVar2.G(new ufc.b(z49), "ProMerchantTogglesRepositoryImpl:CardReaderUsage:Storage", wim.z.d(kotlin.jvm.internal.o0.b(ufc.b.class)));
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f9625w = obj2;
    }
}
