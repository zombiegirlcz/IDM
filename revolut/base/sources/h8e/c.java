package h8e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.subaccount.impl.ui.edit.permission.UserPermissionEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pcd.x;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UserPermissionEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserPermissionEditScreen userPermissionEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = userPermissionEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Z.getValue();
        Object obj3 = model.u;
        i iVar = (i) fVar;
        iVar.getClass();
        if (obj3 instanceof x) {
            iVar.x2(new av8.o(obj3, 25));
        }
        return Unit.f186387a;
    }
}
