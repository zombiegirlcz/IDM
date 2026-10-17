package ok7;

import com.revolut.feature.insurance.api.models.details.CFACDocument;
import com.revolut.feature.insurance.api.navigation.InsuranceDestination$SuitabilityStatement;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreenContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CFACInsuranceDocumentsScreen f225915w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CFACInsuranceDocumentsScreen cFACInsuranceDocumentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f225915w = cFACInsuranceDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f225915w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f225915w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((CFACDocument) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CFACInsuranceDocumentsScreen cFACInsuranceDocumentsScreen = this.f225915w;
        switch (i) {
            case 0:
                String selectedTabId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) cFACInsuranceDocumentsScreen.Q.getValue();
                Intrinsics.h(selectedTabId);
                lVar.getClass();
                Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
                lVar.x2(new o23.l(selectedTabId, 22));
                break;
            default:
                CFACDocument document = (CFACDocument) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) cFACInsuranceDocumentsScreen.Q.getValue();
                Intrinsics.h(document);
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(document, "document");
                String str = document.f74985c;
                Continuation continuation = null;
                if (str != null) {
                    lVar2.A1(new l10.m((Object) lVar2, (Object) str, false, continuation, 10), new yi5.b(25));
                } else {
                    List list = document.d;
                    if (list != null) {
                        lVar2.C1(new InsuranceDestination$SuitabilityStatement(list));
                    } else {
                        String str2 = document.f74984b;
                        if (str2 != null) {
                            String baseUrl = lVar2.f225928q.getBaseUrl();
                            CFACInsuranceDocumentsScreenContract$InputData cFACInsuranceDocumentsScreenContract$InputData = lVar2.f225927p;
                            lVar2.A1(new l10.m((Object) lVar2, (Object) j6.a.w(p.a.t(baseUrl, "/insurance/cfac/policies/", cFACInsuranceDocumentsScreenContract$InputData.f75123a, "/documents?type=", str2), "&insuranceSubtype=", u1.g(cFACInsuranceDocumentsScreenContract$InputData.f75124b.f75001c.f115711a, gj7.a.f144239b), "&reimbursementType=", Intrinsics.f(((h) lVar2.t2()).f225920b, "ID_DOC_PROOF_TAB") ? "DOCUMENTARY_PROOF" : "NO_PROOF"), true, continuation, 10), new yi5.b(25));
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
