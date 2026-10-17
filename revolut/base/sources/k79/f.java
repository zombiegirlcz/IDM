package k79;

import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.RevolutFeedScreen;
import k3k.q0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutFeedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RevolutFeedScreen revolutFeedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revolutFeedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ChatBubbleDelegate.ButtonModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        ChatBubbleDelegate.ButtonModel buttonModel = (ChatBubbleDelegate.ButtonModel) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarR2 = this.v.R2();
        Object obj3 = buttonModel.d;
        r rVar = (r) hVarR2;
        rVar.getClass();
        int i = 19;
        int i2 = 18;
        Continuation continuation = null;
        if (obj3 instanceof m79.a) {
            m79.a aVar2 = (m79.a) obj3;
            s69.d dVar = aVar2.f203350c;
            rVar.l2(new q0(rVar, aVar2.f203349b, continuation, i2), new yi5.b(26));
            rVar.l2(new q0(rVar, dVar, continuation, i), new yi5.b(26));
        } else if (obj3 instanceof s69.d) {
            s69.d dVar2 = (s69.d) obj3;
            s69.e eVar = (s69.e) d0.d0(dVar2.f260164l);
            if (eVar == null || (str = eVar.f260168c) == null) {
                str = dVar2.f260163j;
            }
            if (str != null) {
                rVar.l2(new q0(rVar, str, continuation, i2), new yi5.b(26));
            }
            rVar.l2(new q0(rVar, dVar2, continuation, i), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
