package fr1;

import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import com.revolut.feature.apm.bills.postal_check.impl.data.PostalCheckService;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatusTerms;
import com.revolut.feature.terms.api.model.TermsScope;
import dj0.d;
import gim.i;
import gr1.c;
import gr1.e;
import gr1.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f137372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f137373x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f137372w = bVar;
        this.f137373x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f137372w, this.f137373x, continuation, 0);
            default:
                return new a(this.f137372w, this.f137373x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objScanQr;
        List inputs;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    PostalCheckService postalCheckService = this.f137372w.f137374a;
                    this.v = 1;
                    if (postalCheckService.requestReceipt(this.f137373x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                String qrCode = this.f137373x;
                if (i2 == 0) {
                    o.b(obj2);
                    PostalCheckService postalCheckService2 = this.f137372w.f137374a;
                    gr1.b bVar = new gr1.b(qrCode);
                    this.v = 1;
                    objScanQr = postalCheckService2.scanQr(bVar, this);
                    if (objScanQr == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objScanQr = obj2;
                }
                f fVar = (f) objScanQr;
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                Intrinsics.checkNotNullParameter(qrCode, "qrCode");
                ?? arrayList = 0;
                arrayList = 0;
                if (!(fVar instanceof c)) {
                    if (!(fVar instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e eVar = (e) fVar;
                    String title = eVar.getTerms().getTitle();
                    if (title == null) {
                        title = "";
                    }
                    List scopes = eVar.getTerms().getScopes();
                    ArrayList arrayList2 = new ArrayList(w.t(scopes, 10));
                    Iterator it8 = scopes.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(new TermsScope((String) it8.next()));
                    }
                    return new PostalCheckQrScanResult.TermsRequired(new ApmOnboardingStatusTerms(title, null, arrayList2), qrCode);
                }
                c cVar = (c) fVar;
                Long lD = cVar.getDetails().getDecodeId();
                jo3.a aVarB = cVar.getDetails().getAmount();
                d dVarO = aVarB != null ? mo3.a.o(aVarB) : null;
                jo3.a aVarJ = cVar.getDetails().getMinAmount();
                d dVarO2 = aVarJ != null ? mo3.a.o(aVarJ) : null;
                jo3.a aVarI = cVar.getDetails().getMaxAmount();
                d dVarO3 = aVarI != null ? mo3.a.o(aVarI) : null;
                String strH = cVar.getDetails().getIssuerName();
                String strG = cVar.getDetails().getIssuerAccountNumber();
                String strE = cVar.getDetails().getDueDate();
                String strK = cVar.getDetails().getVoucherNumber();
                boolean zA = cVar.getDetails().getAlreadyPaid();
                String strC = cVar.getDetails().getCheckNote();
                yo1.e eVarF = cVar.getDetails().getFormFields();
                if (eVarF != null && (inputs = eVarF.getInputs()) != null) {
                    List list = inputs;
                    arrayList = new ArrayList(w.t(list, 10));
                    Iterator it9 = list.iterator();
                    while (it9.hasNext()) {
                        arrayList.add(zo1.a.c((yo1.c) it9.next()));
                    }
                }
                if (arrayList == 0) {
                    arrayList = f0.f322471a;
                }
                return new PostalCheckQrScanResult.Success(new PostalCheckQrScanResult.Success.Details(lD, dVarO, dVarO2, dVarO3, strH, strG, strK, strE, strC, zA, arrayList), qrCode);
        }
    }
}
