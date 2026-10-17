package z78;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior.accounts.impl.ui.product_picker.AddNewProductPickerScreen;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.pockets.api.ui.add_new.ExtendedAccountId;
import com.revolut.feature.pockets.api.ui.add_new.OpenNewPocketDestination;
import gim.i;
import io3.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddNewProductPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AddNewProductPickerScreen addNewProductPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addNewProductPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.U.getValue();
        Object obj3 = model.u;
        g gVar = (g) fVar;
        gVar.B2();
        if (Intrinsics.f(obj3, d.f319945a)) {
            gVar.C1(new JuniorOnboardingDestination.Creation((mh8.h) null, 3));
        } else if (obj3 instanceof c) {
            l lVar = l.CURRENT;
            t68.f fVar2 = ((c) obj3).f319944a;
            JuniorBankingProfile juniorBankingProfile = fVar2.f268267a;
            gVar.C1(new OpenNewPocketDestination(lVar, (ExtendedAccountId) new ExtendedAccountId.Junior(juniorBankingProfile.f77103j, juniorBankingProfile.f77099b, fVar2.f268268b), true));
        }
        return Unit.f186387a;
    }
}
