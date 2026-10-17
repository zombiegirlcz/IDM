package nuh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature.workflow.engine.rfi.api.interactor.UploadState;
import com.revolut.feature.workflow.engine.rfi.impl.errors.UploadDocumentsError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import lfg.d0;
import nii.y0;
import nii.z;
import yhm.o;
import yth.a;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((UploadState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        UploadState uploadState = (UploadState) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = uploadState instanceof UploadState.Completed;
        com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a aVar2 = this.v;
        if (z) {
            aVar2.s1();
            aVar2.C2(a.b.f316811a);
        } else if (uploadState instanceof UploadState.Error) {
            Throwable th10 = ((UploadState.Error) uploadState).f96512a;
            if (!(th10 instanceof UploadDocumentsError)) {
                aVar2.s1();
                throw th10;
            }
            yji.l.a1(aVar2, new d0(aVar2.X1(new y0(null, new z(new TextLocalisedClause(R$string.chooseDocuments_upload_error_failed, null, null, 14), new TextLocalisedClause(R$string.chooseDocuments_upload_error_failed_description, null, null, 14), new TextLocalisedClause(R$string.chooseDocuments_buttons_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 5)), 24), null, null, new j(aVar2, null, 0), 3);
        } else {
            if (!(uploadState instanceof UploadState.InProgress)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = (int) (((UploadState.InProgress) uploadState).f96513a * 100);
            aVar2.u.onNext(Integer.valueOf(i));
            if (i == 100) {
                aVar2.M2(false, true);
            }
        }
        return Unit.f186387a;
    }
}
