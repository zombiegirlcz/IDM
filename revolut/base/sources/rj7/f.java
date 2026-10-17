package rj7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreen;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CFACInsuranceCoverageInfoScreen f254617w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CFACInsuranceCoverageInfoScreen cFACInsuranceCoverageInfoScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254617w = cFACInsuranceCoverageInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f254617w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f254617w, continuation, 1);
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
                return ((f) create((RemoteDocument) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CFACInsuranceCoverageInfoScreen cFACInsuranceCoverageInfoScreen = this.f254617w;
        switch (i) {
            case 0:
                String policyNumber = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) cFACInsuranceCoverageInfoScreen.Y.getValue();
                Intrinsics.h(policyNumber);
                m mVar = (m) kVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(policyNumber, "policyNumber");
                c70.a.b(mVar.f254627p, null, policyNumber, false, 5);
                mVar.X1(new mii.i("ID_COPIED_TO_CLIPBOARD_DIALOG", new TextLocalisedClause(R.string.common_copied_to_clipboard, null, null, 14), null, null, 28));
                break;
            default:
                RemoteDocument productSummary = (RemoteDocument) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) cFACInsuranceCoverageInfoScreen.Y.getValue();
                Intrinsics.h(productSummary);
                m mVar2 = (m) kVar2;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(productSummary, "productSummary");
                mVar2.A1(new r83.g(mVar2, productSummary, null, 22), new yi5.b(25));
                break;
        }
        return Unit.f186387a;
    }
}
