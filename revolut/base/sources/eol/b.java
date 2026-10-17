package eol;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.sso.impl.domain.models.ClaimToManage;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.PasskeysListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PasskeysListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PasskeysListController passkeysListController, Continuation continuation) {
        super(2, continuation);
        this.v = passkeysListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.P.getValue();
        String listId = model.f53228a;
        Object obj3 = model.u;
        l lVar = (l) dVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (a0.H(listId, "LIST_ID_PASSKEY.", false)) {
            if (obj3 == null) {
                throw new IllegalStateException("parcel can't be null");
            }
            if (!(obj3 instanceof ClaimToManage.WebAuthn)) {
                throw new IllegalStateException(a0.d.r(o0.f186429a.b(obj3.getClass()).m(), " is not supported here"));
            }
            lVar.C2(new e((ClaimToManage.WebAuthn) obj3));
        }
        return Unit.f186387a;
    }
}
