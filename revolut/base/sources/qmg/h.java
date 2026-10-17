package qmg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.user.checklist.impl.ui.screen.UserChecklistController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ UserChecklistController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(UserChecklistController userChecklistController, Continuation continuation) {
        super(2, continuation);
        this.v = userChecklistController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVar = (b) this.v.V.getValue();
        Object obj3 = model.u;
        l lVar = (l) bVar;
        lVar.getClass();
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "UserChecklistControllerModel", a0.d.m(obj3, "Parcel is null or not a String : "), null, h0Var);
        } else {
            lVar.n2(new j(lVar, str, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
