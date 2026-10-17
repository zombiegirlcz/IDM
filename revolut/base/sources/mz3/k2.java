package mz3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.CreditOfferConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class k2 extends gim.i implements Function2 {
    public hs3.k0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f210623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l2 f210624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CreditOfferConfig f210625y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(PluginPayload pluginPayload, l2 l2Var, CreditOfferConfig creditOfferConfig, Continuation continuation) {
        super(2, continuation);
        this.f210623w = pluginPayload;
        this.f210624x = l2Var;
        this.f210625y = creditOfferConfig;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k2(this.f210623w, this.f210624x, this.f210625y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        Object next;
        hs3.k0 k0Var;
        PluginPayload pluginPayload = this.f210623w;
        it3.d dVar = pluginPayload.f66247a;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj4 = dVar.e;
            if (!(obj4 instanceof hs3.k0)) {
                List list = dVar.f;
                if (list != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it8.next();
                        if (next instanceof hs3.k0) {
                            break;
                        }
                    }
                    obj3 = (hs3.v) next;
                } else {
                    obj3 = null;
                }
            } else {
                if (obj4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.OfferMetadata");
                }
                obj3 = (hs3.k0) obj4;
            }
            hs3.k0 k0Var2 = (hs3.k0) obj3;
            if (k0Var2 == null) {
                k0Var2 = new hs3.k0(null, hs3.j0.DEFAULT);
            }
            rx3.a aVar2 = this.f210624x.f210633b;
            String str = dVar.f168323a;
            this.u = k0Var2;
            this.v = 1;
            Boolean boolA = aVar2.a(str, "offer");
            if (boolA == aVar) {
                return aVar;
            }
            k0Var = k0Var2;
            obj2 = boolA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k0Var = this.u;
            yhm.o.b(obj2);
        }
        return new FeatureCommand(new CreditApplicationKompotFeatureConfig.Offer(this.f210625y.f66352a, hs3.k0.a(k0Var, ((Boolean) obj2).booleanValue() ? null : k0Var.f154902b), io3.h.R(pluginPayload, ""), null));
    }
}
