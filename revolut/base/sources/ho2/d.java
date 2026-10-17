package ho2;

import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.form.phone_number_input.PhoneNumberInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PhoneNumberInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PhoneNumberInputScreen phoneNumberInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = phoneNumberInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((PhoneEditorDelegate.PhoneData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PhoneEditorDelegate.PhoneData phoneData = (PhoneEditorDelegate.PhoneData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.Q.getValue();
        String phoneNumber = phoneData.f52896b;
        j jVar = (j) gVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        jVar.H2(jVar.f154216q, new gqh.a(phoneNumber, 29));
        return Unit.f186387a;
    }
}
