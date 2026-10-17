package hea;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public com.revolut.feature.pockets.impl.details_v2.pocket_details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.d f151636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountId f151637x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f151638y;
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i, com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.z = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0(0, this.z, continuation);
            default:
                return new i0(1, this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        io3.d dVarI2;
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar;
        Object obj3;
        AccountId accountId;
        DocumentsPage joint;
        io3.d dVarI22;
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar2;
        Object obj4;
        AccountId accountId2;
        AccountStatementProduct jointCurrent;
        switch (this.u) {
            case 0:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.f151638y;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar4 = this.z;
                    dVarI2 = aVar4.I2();
                    AccountId accountId3 = aVar4.o.f80846b;
                    r10.v vVar = aVar4.P;
                    String str = aVar4.I2().f163146b;
                    this.v = aVar4;
                    this.f151636w = dVarI2;
                    this.f151637x = accountId3;
                    this.f151638y = 1;
                    Object objY = vVar.y(str, this);
                    if (objY == aVar3) {
                        return aVar3;
                    }
                    aVar = aVar4;
                    obj3 = objY;
                    accountId = accountId3;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    accountId = this.f151637x;
                    dVarI2 = this.f151636w;
                    aVar = this.v;
                    yhm.o.b(obj2);
                    RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) obj2;
                    obj3 = registeredIdentityId != null ? registeredIdentityId.f74764a : null;
                }
                String str2 = (String) obj3;
                if (str2 != null) {
                    joint = new DocumentsPage.Teen(str2);
                } else if (accountId instanceof AccountId.Joint) {
                    String id10 = dVarI2.f163146b;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    joint = new DocumentsPage.Joint(id10);
                } else {
                    joint = DocumentsPage.Personal.f81305a;
                }
                return aVar.C1(new KompotProfileFeatureConfig.DocumentsDestination(joint));
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f151638y;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar6 = this.z;
                    dVarI22 = aVar6.I2();
                    AccountId accountId4 = aVar6.o.f80846b;
                    r10.v vVar2 = aVar6.P;
                    String str3 = aVar6.I2().f163146b;
                    this.v = aVar6;
                    this.f151636w = dVarI22;
                    this.f151637x = accountId4;
                    this.f151638y = 1;
                    Object objY2 = vVar2.y(str3, this);
                    if (objY2 == aVar5) {
                        return aVar5;
                    }
                    aVar2 = aVar6;
                    obj4 = objY2;
                    accountId2 = accountId4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    accountId2 = this.f151637x;
                    dVarI22 = this.f151636w;
                    aVar2 = this.v;
                    yhm.o.b(obj2);
                    RegisteredIdentityId registeredIdentityId2 = (RegisteredIdentityId) obj2;
                    obj4 = registeredIdentityId2 != null ? registeredIdentityId2.f74764a : null;
                }
                String str4 = (String) obj4;
                Set setB = y0.b(z92.f.l(dVarI22));
                if (str4 != null) {
                    String id11 = dVarI22.f163146b;
                    Intrinsics.checkNotNullParameter(id11, "id");
                    jointCurrent = new AccountStatementProduct.Teen(str4, id11);
                } else {
                    jointCurrent = dVarI22.e == io3.l.MERCHANT ? AccountStatementProduct.Pro.f88238a : accountId2 instanceof AccountId.Joint ? new AccountStatementProduct.JointCurrent((AccountId.Joint) accountId2) : AccountStatementProduct.PersonalCurrent.f88237a;
                }
                return aVar2.C1(new AccountsStatementFeatureConfig.AccountsStatementDestination(setB, jointCurrent));
        }
    }
}
