package qll;

import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.sso.impl.domain.models.Identifier;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CombinedAuthenticationUnifiedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = combinedAuthenticationUnifiedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((PhoneEditorDelegate.PhoneData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PhoneEditorDelegate.PhoneData phoneData = (PhoneEditorDelegate.PhoneData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String phoneNumber = phoneData.f52896b;
        com.revolut.sso.impl.ui.combined_authentication.unified.a aVar2 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        cli.y yVar = aVar2.D;
        Identifier.Phone phone = ((q) ((j2) yVar.f22677a).getValue()).f247596b;
        String strG = aVar2.u.g(phoneNumber, ((q) ((j2) yVar.f22677a).getValue()).f247596b.f106152c);
        if (strG != null) {
            phoneNumber = strG;
        }
        aVar2.H2(yVar, new qce.a(aVar2, Identifier.Phone.a(phone, phoneNumber, 0, null, 6), 19));
        return Unit.f186387a;
    }
}
