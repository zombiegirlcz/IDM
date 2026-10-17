package kic;

import android.os.Parcelable;
import aw0.o9;
import aw0.r2;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rewards.api.model.rewards.OutletAvailabilityInterval;
import com.revolut.feature.rewards.api.model.rewards.RewardAction;
import com.revolut.feature.rewards.api.model.rewards.RewardAvailabilityInOutlet;
import com.revolut.feature.rewards.api.model.rewards.RewardFooterAction;
import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import com.revolut.feature.rewards.impl.R$string;
import com.revolut.feature.rewards.impl.ui.details.availability.AvailabilityBottomSheetController;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import mic.v;
import mic.w;
import wli.x;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rewards.impl.ui.details.flow.b f184208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f184209x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(com.revolut.feature.rewards.impl.ui.details.flow.b bVar, w wVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f184208w = bVar;
        this.f184209x = wVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f184208w, this.f184209x, continuation, 0);
            case 1:
                return new n(this.f184208w, this.f184209x, continuation, 1);
            case 2:
                return new n(this.f184208w, this.f184209x, continuation, 2);
            default:
                return new n(this.f184208w, this.f184209x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        RowDelegate.Model model;
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    RewardAction rewardAction = ((mic.p) this.f184209x).f205674a;
                    this.v = 1;
                    boolean z = rewardAction instanceof RewardAction.Activate;
                    com.revolut.feature.rewards.impl.ui.details.flow.b bVar = this.f184208w;
                    if (z) {
                        objA = nim.a.a(((lic.o) bVar.f84941q).a3(c.f184196a), this);
                        if (objA != obj3) {
                            objA = Unit.f186387a;
                        }
                    } else if (rewardAction instanceof RewardAction.ExternalRegistration) {
                        objA = nim.a.a(bVar.f84942r.a3(new f(((RewardAction.ExternalRegistration) rewardAction).f84819c)), this);
                        if (objA != obj3) {
                            objA = Unit.f186387a;
                        }
                    } else if (rewardAction instanceof RewardAction.PartnerMembershipAction.RequestActivation) {
                        RewardAction.PartnerMembershipAction.RequestActivation requestActivation = (RewardAction.PartnerMembershipAction.RequestActivation) rewardAction;
                        objA = nim.a.a(((lic.i) bVar.f84943s).a3(new e(new PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo(requestActivation.f84831a, requestActivation.f84832b, requestActivation.f84833c, false))), this);
                        if (objA != obj3) {
                            objA = Unit.f186387a;
                        }
                    } else if ((rewardAction instanceof RewardAction.OpenUrl) || (rewardAction instanceof RewardAction.RedeemPromocodeAndOpenUrl) || (rewardAction instanceof RewardAction.OpenPromoUrl) || (rewardAction instanceof RewardAction.OpenMap)) {
                        objA = nim.a.a(bVar.f84946x.c3(rewardAction), this);
                        if (objA != obj3) {
                            objA = Unit.f186387a;
                        }
                    } else {
                        if (!(rewardAction instanceof RewardAction.EmptyAction) && !(rewardAction instanceof RewardAction.ComplexAction) && !(rewardAction instanceof RewardAction.Footer) && !(rewardAction instanceof RewardAction.PartnerMembershipAction.Activated)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objA = Unit.f186387a;
                    }
                    if (objA == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    RewardFooterAction rewardFooterAction = ((mic.o) this.f184209x).f205673a;
                    this.v = 1;
                    if (com.revolut.feature.rewards.impl.ui.details.flow.b.J2(this.f184208w, rewardFooterAction, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    x xVar = this.f184208w.u;
                    String str = ((mic.n) this.f184209x).f205672a;
                    lg0.a aVar3 = lg0.a.OPEN_BROWSER;
                    Boolean bool = Boolean.FALSE;
                    this.v = 1;
                    if (xVar.L1(str, aVar3, bool, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                int i6 = 1;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    RewardOutlet outlet = ((v) this.f184209x).f205681a;
                    this.v = 1;
                    com.revolut.feature.rewards.impl.ui.details.flow.b bVar2 = this.f184208w;
                    pic.e eVar = bVar2.f84945w.f236467a;
                    kgm.i iVar = eVar.f236465a;
                    Intrinsics.checkNotNullParameter(outlet, "outlet");
                    Intrinsics.checkNotNullParameter(outlet, "outlet");
                    ArrayList arrayListA = pic.b.a(outlet);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i21 = 0;
                    for (Object obj4 : d0.P0(arrayListA, new pic.a())) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        ggc.n nVar = (ggc.n) obj4;
                        ggc.e eVar2 = nVar.f143654a;
                        ArrayList arrayList4 = nVar.f143655b;
                        String code = eVar2.getCode();
                        if (i21 == 0) {
                            arrayList.add(code);
                            arrayList2.addAll(arrayList4);
                        } else if (arrayList2.equals(arrayList4)) {
                            arrayList.add(code);
                        } else {
                            arrayList3.add(new RewardAvailabilityInOutlet(arrayList2, arrayList));
                            arrayList = new ArrayList();
                            arrayList2 = new ArrayList();
                            arrayList.add(code);
                            arrayList2.addAll(arrayList4);
                        }
                        i21 = i22;
                    }
                    arrayList3.add(new RewardAvailabilityInOutlet(arrayList2, arrayList));
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList3, 10));
                    Iterator it8 = arrayList3.iterator();
                    while (it8.hasNext()) {
                        RewardAvailabilityInOutlet rewardAvailabilityInOutlet = (RewardAvailabilityInOutlet) it8.next();
                        boolean zF = Intrinsics.f(d0.m0(arrayList3), rewardAvailabilityInOutlet);
                        List daysInPeriod = rewardAvailabilityInOutlet.f84836a;
                        ArrayList arrayList6 = rewardAvailabilityInOutlet.f84837b;
                        s0 s0Var = new s0(2);
                        Iterator it9 = it8;
                        if (daysInPeriod.size() == i6) {
                            String dayCode = (String) daysInPeriod.get(0);
                            Intrinsics.checkNotNullParameter(dayCode, "dayCode");
                            model = new RowDelegate.Model("AVAILABILITY_PERIOD_HEADER_ID-" + daysInPeriod, null, new TextClause(iVar.o(dayCode), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
                        } else {
                            Intrinsics.checkNotNullParameter(daysInPeriod, "daysInPeriod");
                            model = new RowDelegate.Model("AVAILABILITY_PERIOD_HEADER_ID-" + daysInPeriod, null, new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(iVar.o((String) d0.b0(daysInPeriod)), " - ", iVar.o((String) d0.m0(daysInPeriod))), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
                        }
                        s0Var.a(model);
                        ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            OutletAvailabilityInterval outletAvailabilityInterval = (OutletAvailabilityInterval) it10.next();
                            kgm.i iVar2 = iVar;
                            boolean zF2 = Intrinsics.f(d0.m0(arrayList6), outletAvailabilityInterval);
                            ArrayList arrayList8 = arrayList3;
                            ArrayList arrayList9 = arrayList6;
                            Iterator it11 = it10;
                            String str2 = "AVAILABILITY_HOURS_LIST_ID-" + daysInPeriod + "-" + a0.d.i(outletAvailabilityInterval.f84810a.getMillisOfDay(), "-", outletAvailabilityInterval.f84811b.getMillisOfDay());
                            TextClause textClause = new TextClause(eVar.b(outletAvailabilityInterval), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            int i32 = R$attr.uikit_dp4;
                            arrayList7.add(new ListSubheaderDelegate.Model(str2, (Image) null, (Clause) textClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i32, (zF && zF2) ? R$attr.uikit_dp16 : i32, 0, 0, 53242));
                            iVar = iVar2;
                            arrayList3 = arrayList8;
                            arrayList6 = arrayList9;
                            it10 = it11;
                        }
                        s0Var.b(arrayList7.toArray(new ListSubheaderDelegate.Model[0]));
                        ArrayList arrayList10 = s0Var.f186433a;
                        arrayList5.add(zhm.v.k(arrayList10.toArray(new Object[arrayList10.size()])));
                        iVar = iVar;
                        it8 = it9;
                        i6 = 1;
                    }
                    ArrayList arrayListU = zhm.w.u(arrayList5);
                    yp0.b.k(arrayListU, 0, R$attr.uikit_dp32, 0, 0, 29);
                    s0 s0Var2 = new s0(2);
                    s0Var2.a(new HeaderDelegate.Model("DIALOG_HEADER_LIST_ID", null, new r2(new TextLocalisedClause(R$string.perks_availability_title, null, null, 14), null), null, null, null, false, 16122));
                    s0Var2.b(arrayListU.toArray(new koi.j[0]));
                    ArrayList arrayList11 = s0Var2.f186433a;
                    yji.l.j2(bVar2, new AvailabilityBottomSheetController(new iic.a(zhm.v.k(arrayList11.toArray(new koi.j[arrayList11.size()])))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                    if (Unit.f186387a == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
