package xo8;

import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsController;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JuniorSettingsController f307694w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(JuniorSettingsController juniorSettingsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307694w = juniorSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f307694w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f307694w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorSettingsController juniorSettingsController = this.f307694w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = juniorSettingsController.e3();
                Intrinsics.h(listId);
                h0 h0Var = (h0) nVarE3;
                h0Var.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("ADD_NEW_KID_NAV_BAR_MENU_LIST_ID")) {
                    h0Var.C1(new JuniorOnboardingDestination.Creation((mh8.h) null, 3));
                }
                break;
            default:
                ty0.a model = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE32 = juniorSettingsController.e3();
                Intrinsics.h(model);
                h0 h0Var2 = (h0) nVarE32;
                h0Var2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.d;
                String str = model.f275445a;
                if (Intrinsics.f(str, "DATA_DEPOSIT_CLICK_ID") && (obj3 instanceof String)) {
                    h0Var2.C1(new ExternalDestination.Browser((String) obj3, null));
                } else {
                    StringBuilder sbM = v0.a.m("Could not handle model id=", str, ", text=", model.f275446b, ", parcel=");
                    sbM.append(obj3);
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sbM.toString());
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
