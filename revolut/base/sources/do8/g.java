package do8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorAppAccessController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JuniorAppAccessController juniorAppAccessController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorAppAccessController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model item = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        Intrinsics.h(item);
        com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar = (com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d) hVarE3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.f(item.f52613a, "ID_DEV_SIMULATE_INVITATION_ACCEPTANCE")) {
            fo8.a aVar2 = dVar.f77289r;
            Object content = ((i) ((j2) dVar.f77293x.f22677a).getValue()).f116451a.getContent();
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar2.b3((JuniorBankingProfile) content);
        }
        return Unit.f186387a;
    }
}
