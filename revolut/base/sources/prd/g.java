package prd;

import aii.r;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueContract$InputData;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import prd.b;
import yhm.m;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public Object u;
    public i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f238985w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f238986x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f238987y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Continuation continuation) {
        super(2, continuation);
        this.f238987y = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f238987y, continuation);
        gVar.f238986x = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        Object obj3;
        i iVar;
        r rVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f238985w;
        i iVar2 = this.f238987y;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion = m.INSTANCE;
            objA = o.a(th10);
        }
        if (i == 0) {
            o.b(obj2);
            m.Companion companion2 = m.INSTANCE;
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.a aVar2 = new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.a(iVar2, null);
            this.f238986x = null;
            this.u = null;
            this.v = iVar2;
            this.f238985w = 1;
            obj2 = u0.b0(iVar2.X(), "confirm_button", aVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
            iVar = iVar2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj3 = this.u;
                o.b(obj2);
                objA = obj3;
                return new m(objA);
            }
            iVar = this.v;
            o.b(obj2);
        }
        if (!((Boolean) obj2).booleanValue()) {
            throw new IllegalStateException("Unsuccessful operation");
        }
        AdjustAssetValueContract$InputData adjustAssetValueContract$InputData = iVar.o;
        if (adjustAssetValueContract$InputData instanceof AdjustAssetValueContract$InputData.CurrentValue) {
            rVar = b.a.f238978a;
        } else {
            if (!(adjustAssetValueContract$InputData instanceof AdjustAssetValueContract$InputData.HistoricalValue)) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = b.C1322b.f238979a;
        }
        iVar.C2(rVar);
        objA = Unit.f186387a;
        m.Companion companion3 = m.INSTANCE;
        if (m.a(objA) != null) {
            int i2 = R$string.analytics_total_wealth_custom_assets_error_update;
            this.f238986x = null;
            this.u = objA;
            this.v = null;
            this.f238985w = 2;
            if (i.I2(iVar2, i2, this) != aVar) {
                obj3 = objA;
                objA = obj3;
            }
            return aVar;
        }
        return new m(objA);
    }
}
