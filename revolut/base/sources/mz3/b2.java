package mz3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class b2 extends gim.i implements Function2 {
    public hs3.h0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f210586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c2 f210587x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(PluginPayload pluginPayload, c2 c2Var, Continuation continuation) {
        super(2, continuation);
        this.f210586w = pluginPayload;
        this.f210587x = c2Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b2(this.f210586w, this.f210587x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        Object next;
        hs3.h0 h0Var;
        hs3.j0 j0Var;
        PluginPayload pluginPayload = this.f210586w;
        it3.d dVar = pluginPayload.f66247a;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj4 = dVar.e;
            if (!(obj4 instanceof hs3.h0)) {
                List list = dVar.f;
                if (list != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it8.next();
                        if (next instanceof hs3.h0) {
                            break;
                        }
                    }
                    obj3 = (hs3.v) next;
                } else {
                    obj3 = null;
                }
            } else {
                if (obj4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.MortgageOfferMetadata");
                }
                obj3 = (hs3.h0) obj4;
            }
            hs3.h0 h0Var2 = (hs3.h0) obj3;
            rx3.a aVar2 = this.f210587x.f210589a;
            String str = dVar.f168323a;
            this.u = h0Var2;
            this.v = 1;
            Boolean boolA = aVar2.a(str, "offer");
            if (boolA == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
            obj2 = boolA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = this.u;
            yhm.o.b(obj2);
        }
        hs3.c cVar = (((Boolean) obj2).booleanValue() || h0Var == null) ? null : h0Var.f154892a;
        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$ConfigurationR = io3.h.R(pluginPayload, "");
        if (h0Var == null || (j0Var = h0Var.f154893b) == null) {
            j0Var = hs3.j0.DEFAULT;
        }
        return new FeatureCommand(new CreditApplicationKompotFeatureConfig.MortgageOffer(cVar, creditApplicationPluginFlowContract$ConfigurationR, j0Var, null));
    }
}
