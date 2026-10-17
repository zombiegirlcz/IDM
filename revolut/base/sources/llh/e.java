package llh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Iterator;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public NaviCommand[] u;
    public NaviCommand[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f196809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f196810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ WealthAccount.Robo f196811y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WealthAccount.Robo robo, f fVar, Continuation continuation) {
        super(2, continuation);
        this.f196811y = robo;
        this.z = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.f196811y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FeatureCommand featureCommandF;
        Object next;
        NaviCommand[] naviCommandArr;
        NaviCommand[] naviCommandArr2;
        UUID uuid;
        NaviCommand[] naviCommandArr3;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f196810x;
        int i2 = 1;
        if (i == 0) {
            o.b(obj2);
            Iterator it8 = this.f196811y.f95237c.iterator();
            while (true) {
                featureCommandF = null;
                if (it8.hasNext()) {
                    next = it8.next();
                    TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) next;
                    Intrinsics.checkNotNullParameter(portfolio, "<this>");
                    switch (com.revolut.shared.feature.wealth.models.trading_accounts.c.f105338a[portfolio.f105211b.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            break;
                        case 4:
                        case 5:
                        case 6:
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    next = null;
                }
            }
            TradingAccount.Portfolio portfolio2 = (TradingAccount.Portfolio) next;
            naviCommandArr = new NaviCommand[2];
            naviCommandArr[0] = jbb.a.a(ibb.c.f160141b, null, null, null, 14);
            if (portfolio2 == null || (uuid = portfolio2.f105210a) == null) {
                naviCommandArr2 = naviCommandArr;
                naviCommandArr[i2] = featureCommandF;
                return new CompositeCommand(v.m(naviCommandArr2));
            }
            clc.b bVar = this.z.f196813b;
            String string = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.u = naviCommandArr;
            this.v = naviCommandArr;
            this.f196809w = 1;
            this.f196810x = 1;
            Object objD = ((com.revolut.feature.robo.impl.navigation.c) bVar).d(string, this);
            if (objD == aVar) {
                return aVar;
            }
            naviCommandArr3 = naviCommandArr;
            obj2 = objD;
            naviCommandArr2 = naviCommandArr3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.f196809w;
            naviCommandArr3 = this.v;
            naviCommandArr2 = this.u;
            o.b(obj2);
        }
        featureCommandF = gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) obj2, false, (Integer) null, 0, 61));
        naviCommandArr = naviCommandArr3;
        naviCommandArr[i2] = featureCommandF;
        return new CompositeCommand(v.m(naviCommandArr2));
    }
}
