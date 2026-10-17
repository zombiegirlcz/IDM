package x7e;

import com.revolut.feature.subaccount.impl.ui.create.screen.permission.UserPermissionSelectorScreen;
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
    public final /* synthetic */ UserPermissionSelectorScreen f303179w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(UserPermissionSelectorScreen userPermissionSelectorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f303179w = userPermissionSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f303179w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f303179w, continuation, 1);
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

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        UserPermissionSelectorScreen userPermissionSelectorScreen = this.f303179w;
        switch (i) {
            case 0:
                um0 model = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) userPermissionSelectorScreen.Z.getValue();
                Intrinsics.h(model);
                iVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f166695a, "TWIN_HORIZONTAL_BUTTON_LIST_ID")) {
                    j60.a.v(iVar.f303184p, false, null, 3);
                }
                break;
            default:
                um0 model2 = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) userPermissionSelectorScreen.Z.getValue();
                Intrinsics.h(model2);
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f166695a, "TWIN_HORIZONTAL_BUTTON_LIST_ID")) {
                    j60.a.v(iVar2.f303184p, false, null, 3);
                    iVar2.y2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
