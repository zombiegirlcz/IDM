package pol;

import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreen;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ EnterPhoneScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EnterPhoneScreen enterPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.u = enterPhoneScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LabelButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.sso.impl.ui.phone.enter_phone.a aVar2 = (com.revolut.sso.impl.ui.phone.enter_phone.a) this.u.d();
        EnterPhoneScreenContract$InputData.Mode mode = aVar2.o.f106662a;
        if ((mode instanceof EnterPhoneScreenContract$InputData.Mode.Create) || (mode instanceof EnterPhoneScreenContract$InputData.Mode.Collect) || (mode instanceof EnterPhoneScreenContract$InputData.Mode.LostAccess)) {
            IllegalStateException illegalStateException = new IllegalStateException("Alternative action is not supported");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            if (!(mode instanceof EnterPhoneScreenContract$InputData.Mode.SignUp)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2.C2(i.f238053a);
        }
        return Unit.f186387a;
    }
}
