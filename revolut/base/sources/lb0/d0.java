package lb0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowBinary;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import com.revolut.feature.backend_flow.domain.models.FilesUploadItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.backend_flow.impl.ui.form_screen.a f193532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f193533x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(com.revolut.core.backend_flow.impl.ui.form_screen.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f193532w = aVar;
        this.f193533x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f193532w, this.f193533x, continuation, 0);
                d0Var.v = obj2;
                return d0Var;
            default:
                d0 d0Var2 = new d0(this.f193532w, this.f193533x, continuation, 1);
                d0Var2.v = obj2;
                return d0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        BackendFlowBinary backendFlowBinary = (BackendFlowBinary) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d0) create(backendFlowBinary, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        String str = this.f193533x;
        com.revolut.core.backend_flow.impl.ui.form_screen.a aVar = this.f193532w;
        switch (i) {
            case 0:
                BackendFlowBinary backendFlowBinary = (BackendFlowBinary) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                InputItem inputItemM2 = com.revolut.core.backend_flow.impl.ui.form_screen.a.M2(((p) ((j2) aVar.C.f22677a).getValue()).f193546a, str);
                FilesUploadItem filesUploadItem = inputItemM2 instanceof FilesUploadItem ? (FilesUploadItem) inputItemM2 : null;
                boolean z = false;
                if (filesUploadItem != null && filesUploadItem.d) {
                    z = true;
                }
                String fileId = ((BackendFlowFile) backendFlowBinary).d;
                if (!z || fileId == null) {
                    return new go.g(backendFlowBinary, 2);
                }
                ob0.i iVar = aVar.A;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(backendFlowBinary, "backendFlowBinary");
                Intrinsics.checkNotNullParameter(fileId, "fileId");
                return new v1(new ob0.h(backendFlowBinary, iVar, fileId, null));
            default:
                BackendFlowBinary backendFlowBinary2 = (BackendFlowBinary) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.S2(new aa0.q0(backendFlowBinary2), str);
                return Unit.f186387a;
        }
    }
}
