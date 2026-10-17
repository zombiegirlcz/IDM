package wm3;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact_legacy.AddContactLegacyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddContactLegacyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AddContactLegacyScreen addContactLegacyScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addContactLegacyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData data = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.R.getValue();
        Intrinsics.h(data);
        l lVar = (l) bVar;
        y yVar = lVar.f298607p;
        Intrinsics.checkNotNullParameter(data, "data");
        String str = data.f52597a;
        CharSequence charSequence = data.f52598b;
        if (Intrinsics.f(str, "ID_INPUT_CONTACT_NAME")) {
            String string = charSequence.toString();
            lVar.H2(yVar, new wb3.k(string, 14));
            lVar.f298608q.setValue(string);
        } else if (Intrinsics.f(str, "ID_INPUT_CONTACT_PHONE_OR_EMAIL")) {
            String string2 = charSequence.toString();
            lVar.H2(yVar, new wb3.k(string2, 15));
            lVar.f298609r.setValue(string2);
        }
        return Unit.f186387a;
    }
}
