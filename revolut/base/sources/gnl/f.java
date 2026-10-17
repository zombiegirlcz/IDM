package gnl;

import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.sso.impl.domain.models.Identifier;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IdentifierInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(IdentifierInputScreen identifierInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = identifierInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((PhoneEditorDelegate.PhoneData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Identifier.Phone phone;
        PhoneEditorDelegate.PhoneData data = (PhoneEditorDelegate.PhoneData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarT2 = this.v.T2();
        Intrinsics.h(data);
        s sVar = (s) mVarT2;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        String str = data.f52895a;
        String str2 = data.f52896b;
        if (Intrinsics.f(str, "PHONE")) {
            Identifier identifier = ((h) sVar.t2()).f145029a;
            boolean z = identifier instanceof Identifier.Phone;
            if (z) {
                Identifier.Phone phone2 = (Identifier.Phone) identifier;
                String strG = sVar.f145056y.g(str2, phone2.f106152c);
                if (strG != null) {
                    str2 = strG;
                }
                phone = Identifier.Phone.a(phone2, str2, 0, null, 6);
            } else if (z) {
                phone = (Identifier.Phone) new Identifier.Email("");
            } else {
                if (!(identifier instanceof Identifier.Email)) {
                    throw new NoWhenBranchMatchedException();
                }
                wi0.b bVarY2 = sVar.y2();
                phone = new Identifier.Phone(sVar.z2(bVarY2), "", bVarY2);
            }
            sVar.x2(new a9j.n(phone, 3, sVar, data));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Processing for the input with id ", str, " is not defined"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
