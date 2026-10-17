package ov8;

import bx8.n;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreen;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$FieldResult;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.shared.feature.workflow.engine.api.models.EligibilityDataPointValue;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import my8.l;
import yhm.o;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.kyc.impl.flow.input_document_id.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.screens.documentid_input.a f229984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ KYCDocumentIdInputScreen f229985x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.kyc.impl.flow.input_document_id.a aVar, com.revolut.feature.kyc.impl.screens.documentid_input.a aVar2, KYCDocumentIdInputScreen kYCDocumentIdInputScreen, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f229984w = aVar2;
        this.f229985x = kYCDocumentIdInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f229984w, this.f229985x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.kyc.impl.flow.input_document_id.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar3 = aVar2.f77692p;
            n nVar = (n) this.f229984w;
            ArrayList arrayList = nVar.f19523a;
            l lVar = this.f229985x.K.f77864b;
            String str = lVar.f210384b.f77926a;
            String str2 = lVar.f;
            String str3 = lVar.f210385c.f297794a;
            ArrayList<KYCDocumentIdInputScreenContract$FieldResult> arrayList2 = nVar.f19524b;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            for (KYCDocumentIdInputScreenContract$FieldResult kYCDocumentIdInputScreenContract$FieldResult : arrayList2) {
                arrayList3.add(new EligibilityDataPointValue.FieldValue(kYCDocumentIdInputScreenContract$FieldResult.f77857a, kYCDocumentIdInputScreenContract$FieldResult.f77859c, kYCDocumentIdInputScreenContract$FieldResult.f77858b));
            }
            List listC = u.c(new EligibilityDataPointValue.DocumentIdDataPointValue("DOCUMENT", new EligibilityDataPointValue.DocumentIdValue(str, str2, str3, arrayList3)));
            this.u = 1;
            if (jvh.a.i(aVar3, "DECLARATION", listC, arrayList, null, this, 8) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return aVar2.C1(new BridgeDestination(new FinishCommand(new Integer(-1), null, null, 6)));
    }
}
