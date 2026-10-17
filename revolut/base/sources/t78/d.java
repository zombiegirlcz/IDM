package t78;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior.pending_graduation.impl.R$string;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(model.f52613a, "SHARE_BUTTON")) {
            f fVar = this.v;
            kb8.f fVar2 = fVar.f268613p;
            Object obj3 = model.i;
            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
            String juniorFirstName = (String) obj3;
            fVar2.getClass();
            Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
            kb8.a aVar2 = fVar2.f182537a;
            Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
            f01.c cVar = aVar2.f182529a;
            String title = cVar.b(new TextLocalisedClause(R$string.junior_pending_graduation_share_title, u.c(juniorFirstName), null, 12)).toString();
            String text = cVar.b(new TextLocalisedClause(R$string.junior_pending_graduation_share_message, u.c(juniorFirstName), null, 12)).toString();
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            fVar.A2(new ExternalDestination.ByIntent(((s70.b) fVar2.f182538b).f(title, text, null), null));
        }
        return Unit.f186387a;
    }
}
