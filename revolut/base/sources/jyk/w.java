package jyk;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import grl.k9;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ y A;
    public String u;
    public y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TradingAccount.Robo.Regular f179507w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FeatureCommand f179508x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f179509y;
    public final /* synthetic */ jf0.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(jf0.c cVar, y yVar, Continuation continuation) {
        super(2, continuation);
        this.z = cVar;
        this.A = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Object next;
        TradingAccount tradingAccount;
        Object next2;
        FeatureCommand featureCommand;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f179509y;
        y yVar = this.A;
        if (i == 0) {
            yhm.o.b(obj2);
            str = (String) this.z.d.get("accountId");
            if (str == null) {
                throw new IllegalStateException(new IllegalStateException("Account id missing from remediation deeplink but should be present.").toString());
            }
            jhi.b bVarG = mo3.a.g(ybl.k.k(yVar.f179514b, null, null, null, 7), null, new jul.c(13), 1);
            this.u = str;
            this.f179509y = 1;
            obj2 = vkm.q.x(bVarG, this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            featureCommand = this.f179508x;
            tradingAccount = this.f179507w;
            yVar = this.v;
            yhm.o.b(obj2);
            CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(featureCommand, gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) obj2, false, (Integer) null, 0, 61)));
            EndPromptParams endPromptParams = new EndPromptParams(true, EndPromptType.ROBO_REMEDIATION);
            k9 value = k9.RoboAdvisor;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            AnalyticsProduct.Retail retail = new AnalyticsProduct.Retail(value);
            yVar.getClass();
            return y.b(tradingAccount, compositeCommandC, endPromptParams, retail);
        }
        str = this.u;
        yhm.o.b(obj2);
        Iterator it8 = ((TradingAccounts) obj2).f105278a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((TradingAccount) next).getF105262a().toString(), str)) {
                break;
            }
        }
        tradingAccount = (TradingAccount) next;
        if (tradingAccount instanceof TradingAccount.Robo.Regular) {
            TradingAccount.Robo.Regular regular = (TradingAccount.Robo.Regular) tradingAccount;
            Iterator it9 = regular.f105217h.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it9.next();
                com.revolut.shared.feature.wealth.models.trading_accounts.a aVar2 = ((TradingAccount.Portfolio) next2).f105211b;
                if (aVar2 == com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE || aVar2 == com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED) {
                    break;
                }
            }
            TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) next2;
            UUID uuid = portfolio != null ? portfolio.f105210a : null;
            if (uuid != null) {
                FeatureCommand featureCommandA = jbb.a.a(ibb.c.f160141b, null, null, null, 14);
                clc.b bVar = yVar.f179515c;
                String string = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.u = null;
                this.v = yVar;
                this.f179507w = regular;
                this.f179508x = featureCommandA;
                this.f179509y = 2;
                obj2 = ((com.revolut.feature.robo.impl.navigation.c) bVar).d(string, this);
                if (obj2 != aVar) {
                    featureCommand = featureCommandA;
                    CompositeCommand compositeCommandC2 = com.revolut.retail.core.navigation.a.c(featureCommand, gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) obj2, false, (Integer) null, 0, 61)));
                    EndPromptParams endPromptParams2 = new EndPromptParams(true, EndPromptType.ROBO_REMEDIATION);
                    k9 value2 = k9.RoboAdvisor;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    AnalyticsProduct.Retail retail2 = new AnalyticsProduct.Retail(value2);
                    yVar.getClass();
                    return y.b(tradingAccount, compositeCommandC2, endPromptParams2, retail2);
                }
                return aVar;
            }
        } else if (tradingAccount != null) {
            NaviCommand naviCommand = (NaviCommand) yVar.d.getValue();
            EndPromptParams endPromptParams3 = new EndPromptParams(true, EndPromptType.TRADING);
            k9 k9Var = k9.Trading;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            return y.b(tradingAccount, naviCommand, endPromptParams3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
        }
        return DummyCommand.f98635a;
    }
}
