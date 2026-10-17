package g8c;

import aw0.n6;
import com.revolut.feature.revolutpay.impl.ui.add_email.AddEmailScreen;
import f2i.x;
import fo1.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddEmailScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AddEmailScreen addEmailScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addEmailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddEmailScreen addEmailScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                addEmailScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) ((g) addEmailScreen.O.getValue());
                lVar.getClass();
                lVar.n2(new b0(lVar, null, 19), new x(1, lVar, l.class, "handleSaveEmailError", "handleSaveEmailError(Ljava/lang/Throwable;)Z", 0, 26));
                break;
        }
        return Unit.f186387a;
    }
}
