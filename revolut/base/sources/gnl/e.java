package gnl;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.sso.impl.domain.models.Identifier;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreen;
import ghk.x;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IdentifierInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(IdentifierInputScreen identifierInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = identifierInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Identifier.Email email;
        InputTextDelegate.TextData data = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarT2 = this.v.T2();
        Intrinsics.h(data);
        s sVar = (s) mVarT2;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        String str = data.f52597a;
        if (Intrinsics.f(str, "EMAIL")) {
            Identifier identifier = ((h) sVar.t2()).f145029a;
            boolean z = identifier instanceof Identifier.Email;
            if (z) {
                email = Identifier.Email.a(data.f52598b.toString());
            } else if (identifier instanceof Identifier.Phone) {
                email = new Identifier.Email("");
            } else {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                wi0.b bVarY2 = sVar.y2();
                email = (Identifier.Email) new Identifier.Phone(sVar.z2(bVarY2), "", bVarY2);
            }
            sVar.x2(new x(email, data, 3));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Processing for the input with id ", str, " is not defined"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
