package o08;

import android.os.Parcelable;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.insurance_pet.impl.ui.edit.PetEditFlowContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n08.e0;
import nyb.h0;
import pfm.m;
import zh9.u0;
import zw7.d0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f221174b;

    public /* synthetic */ e(k kVar, int i) {
        this.f221173a = i;
        this.f221174b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Parcelable editQuote;
        switch (this.f221173a) {
            case 0:
                d0 pet = (d0) obj2;
                Intrinsics.checkNotNullParameter(pet, "pet");
                k kVar = this.f221174b;
                f08.d dVar = kVar.f221183n;
                kVar.f221184p.getClass();
                n08.d0 screenProfileType = e0.a(pet);
                String petId = (String) ((f08.k) ((f08.h) kVar.f221182m).f131015h).d().get();
                f08.j jVar = (f08.j) dVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(screenProfileType, "screenProfileType");
                Intrinsics.checkNotNullParameter(petId, "petId");
                ln.a aVar = jVar.f131019b;
                ny7.h.Companion.getClass();
                ExplicitActivityDestination explicitActivityDestination = ny7.d.f220691b;
                int i = f08.i.f131017a[screenProfileType.ordinal()];
                if (i == 1) {
                    editQuote = new PetEditFlowContract$Configuration.EditQuote(petId);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    editQuote = new PetEditFlowContract$Configuration.EditPet(petId);
                }
                return aVar.a(new ActivityNavigateCommand(explicitActivityDestination, editQuote, null, 200, 0, null, null, null, null, false, 1012));
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((f08.j) this.f221174b.f221183n).a();
            case 2:
                String menuItem = (String) obj2;
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                if (Intrinsics.f(menuItem, "NAV_FAQ_MENU_ITEM_ID")) {
                    return ((f08.j) this.f221174b.f221183n).b();
                }
                m mVar = m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 3:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                k kVar2 = this.f221174b;
                efm.d0 d0VarFirstOrError = m70.a.g(((f08.h) kVar2.f221182m).l3(), null, null, 3).firstOrError();
                h0 h0Var = new h0(20, new e(kVar2, 0));
                d0VarFirstOrError.getClass();
                pfm.a aVar2 = new pfm.a(d0VarFirstOrError, h0Var, 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return ue0.e.v(aVar2);
            default:
                CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                boolean zF = Intrinsics.f(model.f51822a, "PET_DETAILS_SUPPORT_CHAT_LIST_ID");
                m mVar2 = m.f235744a;
                if (!zF) {
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                k kVar3 = this.f221174b;
                ((f08.h) kVar3.f221182m).f131014g.getClass();
                Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                pfm.a aVarE = ue0.e.v(mVar2).e(((f08.j) kVar3.f221183n).f131019b.a(u0.f(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), true))));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
        }
    }
}
