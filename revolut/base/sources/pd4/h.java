package pd4;

import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.UploadDocumentsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UploadDocumentsScreen f235071w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(UploadDocumentsScreen uploadDocumentsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235071w = uploadDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f235071w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f235071w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        UploadDocumentsScreen uploadDocumentsScreen = this.f235071w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = uploadDocumentsScreen.e3();
                Intrinsics.h(aVar);
                ((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) kVarE3).L2(aVar);
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE32 = uploadDocumentsScreen.e3();
                Intrinsics.h(aVar3);
                ((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.d) kVarE32).L2(aVar3);
                break;
        }
        return Unit.f186387a;
    }
}
