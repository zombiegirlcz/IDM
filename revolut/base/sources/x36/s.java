package x36;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public h0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public DeFiAssetDetails f302679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f302680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f302681y;
    public final /* synthetic */ y z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.z = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.z, continuation, 0);
                sVar.f302681y = obj2;
                return sVar;
            default:
                s sVar2 = new s(this.z, continuation, 1);
                sVar2.f302681y = obj2;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h0 h0Var;
        DeFiAssetDetails deFiAssetDetails;
        h0 h0VarG;
        DeFiAssetDetails deFiAssetDetails2;
        switch (this.u) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f302681y;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f302680x;
                y yVar = this.z;
                Continuation continuation = null;
                if (i == 0) {
                    yhm.o.b(obj2);
                    h0 h0VarG2 = e0.g(coroutineScope, null, null, new r(yVar, continuation, 1), 3);
                    h0 h0VarG3 = e0.g(coroutineScope, null, null, new r(yVar, continuation, 0), 3);
                    this.f302681y = null;
                    this.v = h0VarG2;
                    this.f302680x = 1;
                    Object objY = h0VarG3.y(this);
                    if (objY == aVar) {
                        return aVar;
                    }
                    h0Var = h0VarG2;
                    obj2 = objY;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        deFiAssetDetails = this.f302679w;
                        yhm.o.b(obj2);
                        yVar.H2(yVar.A, new wwa.a(yVar, deFiAssetDetails, (FundingSource) obj2, 23));
                        return Unit.f186387a;
                    }
                    h0Var = this.v;
                    yhm.o.b(obj2);
                }
                DeFiAssetDetails deFiAssetDetails3 = (DeFiAssetDetails) obj2;
                this.f302681y = null;
                this.v = null;
                this.f302679w = deFiAssetDetails3;
                this.f302680x = 2;
                Object objI = h0Var.i(this);
                if (objI == aVar) {
                    return aVar;
                }
                deFiAssetDetails = deFiAssetDetails3;
                obj2 = objI;
                yVar.H2(yVar.A, new wwa.a(yVar, deFiAssetDetails, (FundingSource) obj2, 23));
                return Unit.f186387a;
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f302681y;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f302680x;
                y yVar2 = this.z;
                Continuation continuation2 = null;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    h0 h0VarG4 = e0.g(coroutineScope2, null, null, new r(yVar2, continuation2, 3), 3);
                    h0VarG = e0.g(coroutineScope2, null, null, new r(yVar2, continuation2, 4), 3);
                    this.f302681y = null;
                    this.v = h0VarG;
                    this.f302680x = 1;
                    obj2 = h0VarG4.y(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        deFiAssetDetails2 = this.f302679w;
                        yhm.o.b(obj2);
                        yVar2.H2(yVar2.A, new wwa.a(yVar2, deFiAssetDetails2, (DeFiBalance) obj2, 24));
                        return Unit.f186387a;
                    }
                    h0VarG = this.v;
                    yhm.o.b(obj2);
                }
                DeFiAssetDetails deFiAssetDetails4 = (DeFiAssetDetails) obj2;
                this.f302681y = null;
                this.v = null;
                this.f302679w = deFiAssetDetails4;
                this.f302680x = 2;
                Object objI2 = h0VarG.i(this);
                if (objI2 == aVar2) {
                    return aVar2;
                }
                deFiAssetDetails2 = deFiAssetDetails4;
                obj2 = objI2;
                yVar2.H2(yVar2.A, new wwa.a(yVar2, deFiAssetDetails2, (DeFiBalance) obj2, 24));
                return Unit.f186387a;
        }
    }
}
