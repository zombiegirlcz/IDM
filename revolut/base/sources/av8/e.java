package av8;

import cli.y;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionController;
import com.revolut.kompot.common.ExternalDestination;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DocumentSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(DocumentSelectionController documentSelectionController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = documentSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listC;
        int i = this.u;
        DocumentSelectionController documentSelectionController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.kyc.impl.document_collection.document_selection.a aVar2 = (com.revolut.feature.kyc.impl.document_collection.document_selection.a) documentSelectionController.R2();
                y yVar = aVar2.f77627r;
                i iVar = ((j) ((j2) yVar.f22677a).getValue()).f9950c;
                if (iVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (iVar instanceof g) {
                    listC = ((g) iVar).f9946a;
                } else {
                    if (!(iVar instanceof h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listC = u.c(((h) iVar).f9947a);
                }
                aVar2.C2(new k(listC, ((j) ((j2) yVar.f22677a).getValue()).f9948a));
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String deeplink = documentSelectionController.K.i;
                if (deeplink != null) {
                    com.revolut.feature.kyc.impl.document_collection.document_selection.a aVar4 = (com.revolut.feature.kyc.impl.document_collection.document_selection.a) documentSelectionController.R2();
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                    aVar4.C1(new ExternalDestination.ImplicitActivity("android.intent.action.VIEW", null, ((f80.b) aVar4.f77626q).f(deeplink), 0, null, 494));
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.kyc.impl.document_collection.document_selection.a) documentSelectionController.R2()).B2();
                return Unit.f186387a;
        }
    }
}
