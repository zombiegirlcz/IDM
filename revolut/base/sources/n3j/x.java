package n3j;

import com.revolut.data.model.Data;
import com.revolut.domain.models.beneficiary.BankInformationCopFlow;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$BackendDefinition;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;
import vkm.v1;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f212164w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f212165x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d f212166y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f212166y = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                x xVar = new x(0, this.f212166y, continuation);
                xVar.f212164w = flowCollector;
                xVar.f212165x = obj3;
                return xVar.invokeSuspend(Unit.f186387a);
            case 1:
                x xVar2 = new x(1, this.f212166y, continuation);
                xVar2.f212164w = flowCollector;
                xVar2.f212165x = obj3;
                return xVar2.invokeSuspend(Unit.f186387a);
            case 2:
                x xVar3 = new x(2, this.f212166y, continuation);
                xVar3.f212164w = flowCollector;
                xVar3.f212165x = obj3;
                return xVar3.invokeSuspend(Unit.f186387a);
            default:
                x xVar4 = new x(3, this.f212166y, continuation);
                xVar4.f212164w = flowCollector;
                xVar4.f212165x = obj3;
                return xVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        Flow gVar2;
        Object next;
        Flow iVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f212164w;
                    com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar = this.f212166y;
                    p3j.b bVar = dVar.o;
                    BeneficiaryCreationKompotInputData.CreationConfiguration creationConfig = dVar.D.f99673a;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(creationConfig, "creationConfig");
                    v1 v1Var = new v1(new p3j.a(creationConfig, bVar, null));
                    this.f212164w = null;
                    this.f212165x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, v1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f212164w;
                    List validDefinitions = (List) this.f212165x;
                    com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar2 = this.f212166y;
                    q3j.c cVar = dVar2.A;
                    l lVar = (l) ((n) ((j2) dVar2.K.f22677a).getValue()).f212146a.getContent();
                    BeneficiaryInfoState beneficiaryInfoState = lVar != null ? lVar.f212142a : null;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(validDefinitions, "validDefinitions");
                    if (validDefinitions.isEmpty() || beneficiaryInfoState == null) {
                        gVar = new go.g(null, 2);
                    } else {
                        wi0.b bVar2 = beneficiaryInfoState.getD().f99723a;
                        xi0.b bVar3 = beneficiaryInfoState.getE().f99726a;
                        c3j.b bVar4 = cVar.f241980a;
                        String str = bVar2.f297794a;
                        String str2 = bVar3.f306286a;
                        List<Field$BackendDefinition.InputDefinition> list = validDefinitions;
                        int iB = q0.b(zhm.w.t(list, 10));
                        if (iB < 16) {
                            iB = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                        for (Field$BackendDefinition.InputDefinition inputDefinition : list) {
                            linkedHashMap.put(inputDefinition.f99715a.f60271a, inputDefinition.f99716b);
                        }
                        gVar = new mle.x(rd0.e.b(bVar4.b(str, str2, linkedHashMap, BankInformationCopFlow.BENEFICIARY)), cVar, validDefinitions, 11);
                    }
                    this.f212164w = null;
                    this.f212165x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar3 = this.f212166y;
                cli.y yVar = dVar3.K;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f212164w;
                    List validDefinitions2 = (List) this.f212165x;
                    d4j.c cVar2 = dVar3.E;
                    l lVar2 = (l) ((n) ((j2) yVar.f22677a).getValue()).f212146a.getContent();
                    Continuation continuation = null;
                    BeneficiaryInfoState beneficiaryInfoState2 = lVar2 != null ? lVar2.f212142a : null;
                    boolean z = ((n) ((j2) yVar.f22677a).getValue()).e;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(validDefinitions2, "validDefinitions");
                    if (z || beneficiaryInfoState2 == null || validDefinitions2.isEmpty()) {
                        od0.i.Companion.getClass();
                        gVar2 = new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                    } else {
                        d4j.b bVar5 = cVar2.f111340b;
                        Intrinsics.checkNotNullParameter(beneficiaryInfoState2, "beneficiaryInfoState");
                        Intrinsics.checkNotNullParameter(validDefinitions2, "validDefinitions");
                        Iterator it8 = bVar5.f111338b.f99673a.getF99649b().iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (next instanceof BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext suggestionBannerContext = (BeneficiaryCreationKompotInputData.CreationConfiguration.SuggestionBannerContext) next;
                        f5j.l lVar3 = suggestionBannerContext != null ? suggestionBannerContext.f99650a : null;
                        if (lVar3 == null) {
                            iVar = new go.g(null, 2);
                        } else {
                            List<Field$BackendDefinition.InputDefinition> list2 = validDefinitions2;
                            int iB2 = q0.b(zhm.w.t(list2, 10));
                            if (iB2 < 16) {
                                iB2 = 16;
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                            for (Field$BackendDefinition.InputDefinition inputDefinition2 : list2) {
                                linkedHashMap2.put(inputDefinition2.f99715a.f60271a, inputDefinition2.f99716b);
                            }
                            String str3 = beneficiaryInfoState2.getD().f99723a.f297794a;
                            String str4 = beneficiaryInfoState2.getE().f99726a.f306286a;
                            iVar = new acb.i(rd0.e.b(bVar5.f111337a.b(str3, str4, linkedHashMap2, BankInformationCopFlow.BENEFICIARY)), str3, str4, linkedHashMap2, lVar3, 4);
                        }
                        gVar2 = vkm.q.Q(rd0.e.e(iVar, h0.f322473a, new c9k.k(3, 10, continuation)), new cvi.i(continuation, cVar2, 8));
                    }
                    this.f212164w = null;
                    this.f212165x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, gVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f212164w;
                    List list3 = (List) this.f212165x;
                    com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar4 = this.f212166y;
                    q3j.h hVar = dVar4.F;
                    n61.c cVar3 = ((n) ((j2) dVar4.K.f22677a).getValue()).f212147b;
                    hVar.getClass();
                    v1 v1Var2 = new v1(new q3j.g(list3, hVar, cVar3, null));
                    this.f212164w = null;
                    this.f212165x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, v1Var2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
