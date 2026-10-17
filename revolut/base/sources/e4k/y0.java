package e4k;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.extensions.AvailableTypesErrorHandlerExtension$ErrorType;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final class y0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f122652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f122653x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a f122654y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i, com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f122654y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                y0 y0Var = new y0(0, this.f122654y, continuation);
                y0Var.f122652w = flowCollector;
                y0Var.f122653x = obj3;
                return y0Var.invokeSuspend(Unit.f186387a);
            default:
                y0 y0Var2 = new y0(1, this.f122654y, continuation);
                y0Var2.f122652w = flowCollector;
                y0Var2.f122653x = obj3;
                return y0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        TextLocalisedClause textLocalisedClause;
        hrf.h hVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f122652w;
                    com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar2 = this.f122654y;
                    h4k.k kVar = aVar2.f102081q;
                    BankTransferData bankTransferData = ((x) aVar2.t2()).f122647c;
                    Continuation continuation = null;
                    Map mapG = bankTransferData != null ? bankTransferData.f101931m : null;
                    if (mapG == null) {
                        mapG = zhm.r0.g();
                    }
                    Map currentAdditionalInputs = mapG;
                    BankTransferData transferData = aVar2.G2();
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(currentAdditionalInputs, "currentAdditionalInputs");
                    Intrinsics.checkNotNullParameter(transferData, "transferData");
                    v1 v1Var = new v1(new g0a.e(currentAdditionalInputs, kVar, transferData, continuation, 17));
                    this.f122652w = null;
                    this.f122653x = null;
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
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f122652w;
                    Data availableTypes = (Data) this.f122653x;
                    com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar4 = this.f122654y;
                    g4k.b bVar = aVar4.A;
                    z zVar = ((x) aVar4.t2()).d;
                    com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.extensions.a aVar5 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.extensions.a) bVar;
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(availableTypes, "availableTypes");
                    yqi.b bVar2 = (zVar == null || (hVar = zVar.f122659h) == null) ? null : hVar.f154819c;
                    boolean z = bVar2 instanceof urf.b;
                    Flow flowL2 = vkm.i.f290039a;
                    if (!z && !(bVar2 instanceof urf.a)) {
                        ServerError serverErrorA = aVar5.f102088l.a(availableTypes.getError());
                        AvailableTypesErrorHandlerExtension$ErrorType.Companion companion = AvailableTypesErrorHandlerExtension$ErrorType.INSTANCE;
                        Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                        companion.getClass();
                        Iterator<E> it8 = AvailableTypesErrorHandlerExtension$ErrorType.b().iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                int code = ((AvailableTypesErrorHandlerExtension$ErrorType) next).getCode();
                                if (numValueOf != null && code == numValueOf.intValue()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        AvailableTypesErrorHandlerExtension$ErrorType availableTypesErrorHandlerExtension$ErrorType = (AvailableTypesErrorHandlerExtension$ErrorType) next;
                        v60.e eVar = aVar5.f102089m;
                        if (availableTypesErrorHandlerExtension$ErrorType != null) {
                            v60.d dVarB = ((ao0.a) eVar).b(Integer.valueOf(availableTypesErrorHandlerExtension$ErrorType.getCode()));
                            if (dVarB == null) {
                                dVarB = new v60.b();
                            }
                            TextLocalisedClause textLocalisedClauseO = ofm.q.O(dVarB);
                            int i3 = g4k.d.f140542a[availableTypesErrorHandlerExtension$ErrorType.ordinal()];
                            if (i3 == 1) {
                                textLocalisedClause = null;
                            } else {
                                if (i3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                            }
                            flowL2 = aVar5.L2(new nii.y0("ERROR_DIALOG_ID", new nii.z(textLocalisedClauseO, null, textLocalisedClause, null, null, availableTypesErrorHandlerExtension$ErrorType, true, null, null, null, null, null, null, 32374), false, 4));
                        }
                    }
                    this.f122652w = null;
                    this.f122653x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowL2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
