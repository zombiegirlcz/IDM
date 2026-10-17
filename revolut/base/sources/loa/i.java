package loa;

import com.revolut.feature.toggles.models.FeatureDefinition;
import com.revolut.feature.toggles.models.PublicExperimentDefinition;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.RestartApplicationCommand;
import gvc.n;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.k1;
import nii.l1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f197435w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f197435w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f197435w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f197435w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l lVar = this.f197435w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                gte.a aVar2 = lVar.f197439p;
                for (FeatureDefinition featureDefinition : lVar.f197440q) {
                    PublicExperimentDefinition publicExperimentDefinitionV2 = featureDefinition.V2();
                    if (publicExperimentDefinitionV2 != null && ((jte.d) aVar2).c(publicExperimentDefinitionV2)) {
                        linkedHashMap.put(publicExperimentDefinitionV2, Boolean.valueOf(((jte.d) aVar2).c(featureDefinition)));
                    }
                }
                lVar.x2(new n(linkedHashMap, list));
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if ((n1Var instanceof l1) || (n1Var instanceof k1)) {
                    lVar.C1(new BridgeDestination(RestartApplicationCommand.f98667a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
