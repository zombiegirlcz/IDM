package xpl;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import com.revolut.sso.impl.ui.revolut_id.main.RevolutIDMainScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutIDMainScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RevolutIDMainScreen revolutIDMainScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revolutIDMainScreen;
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
        i iVar = (i) this.v.Q.getValue();
        Intrinsics.h(model);
        l lVar = (l) iVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "PERSONAL_DETAILS")) {
            lVar.C2(f.f308015a);
        } else if (Intrinsics.f(str, "IDENTITY_DOCUMENTS")) {
            lVar.C2(e.f308014a);
        } else if (Intrinsics.f(str, "SIGN_IN_&_PASSCODE")) {
            lVar.C2(g.f308016a);
        } else if (a0.H(str, "REVOLUT_ACCOUNT_", false)) {
            Object obj3 = model.u;
            if (obj3 == null) {
                RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("Unexpected null parcel");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
            } else if (obj3 instanceof UserInfoAccount) {
                lVar.C2(new d((UserInfoAccount) obj3));
            } else {
                RevolutSSOException.IllegalState illegalState2 = new RevolutSSOException.IllegalState(p.a.p("Unexpected ", obj3.getClass().getName(), " parcel type"));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalState2, h0Var2);
            }
        }
        return Unit.f186387a;
    }
}
