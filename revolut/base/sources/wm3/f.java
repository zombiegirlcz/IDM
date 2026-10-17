package wm3;

import com.revolut.feature.contacts.impl.ui_kompot.add_contact_legacy.AddContactLegacyScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wk2.x;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddContactLegacyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AddContactLegacyScreen addContactLegacyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addContactLegacyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddContactLegacyScreen addContactLegacyScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                addContactLegacyScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) ((b) addContactLegacyScreen.R.getValue());
                lVar.getClass();
                lVar.l2(new w76.a(lVar, null, 21), new x(lVar, 12));
                break;
        }
        return Unit.f186387a;
    }
}
