package h8e;

import com.revolut.feature.subaccount.impl.ui.edit.permission.UserPermissionEditScreen;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UserPermissionEditScreen f150019w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(UserPermissionEditScreen userPermissionEditScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f150019w = userPermissionEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f150019w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f150019w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        UserPermissionEditScreen userPermissionEditScreen = this.f150019w;
        switch (i) {
            case 0:
                um0 model = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) userPermissionEditScreen.Z.getValue();
                Intrinsics.h(model);
                i iVar = (i) fVar;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f166695a, "TWIN_HORIZONTAL_BUTTON_LIST_ID")) {
                    j60.a.v(iVar.f150025q, false, null, 3);
                }
                break;
            default:
                um0 model2 = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar2 = (f) userPermissionEditScreen.Z.getValue();
                Intrinsics.h(model2);
                i iVar2 = (i) fVar2;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f166695a, "TWIN_HORIZONTAL_BUTTON_LIST_ID")) {
                    j60.a.v(iVar2.f150025q, false, null, 3);
                    iVar2.l2(new h(iVar2, null), new gwc.h(1, iVar2, q7e.b.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 17));
                }
                break;
        }
        return Unit.f186387a;
    }
}
