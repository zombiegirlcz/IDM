package com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all;

import cli.y;
import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesInfo;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$FaqReferralsFlowMigrationV4;
import com.revolut.feature.referrals.shared.ui.api.SharedReferralsUiApi$Toggles$ShowInviteListPaginated;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import cya.f;
import cya.g;
import efm.r;
import hx7.e;
import java.util.ArrayList;
import java.util.Iterator;
import jxa.j;
import jya.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pwa.i;
import pwa.n;
import r10.t;
import xya.k;
import xya.m;
import xya.o;
import xya.q;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements q {
    public final AllReferralsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f81924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f81925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f81926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f81927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f81928t;
    public final f u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f81929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f81930x;

    public b(AllReferralsScreenContract$InputData inputData, t referralsWidgetInteractor, j sharedReferralsNavigationInteractor, d invitesPagingSource, gte.a featureToggleInteractor, g ineligibilityBottomSheetControllerProvider, f deeplinkControllerModelExtension, xya.t stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(referralsWidgetInteractor, "referralsWidgetInteractor");
        Intrinsics.checkNotNullParameter(sharedReferralsNavigationInteractor, "sharedReferralsNavigationInteractor");
        Intrinsics.checkNotNullParameter(invitesPagingSource, "invitesPagingSource");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(ineligibilityBottomSheetControllerProvider, "ineligibilityBottomSheetControllerProvider");
        Intrinsics.checkNotNullParameter(deeplinkControllerModelExtension, "deeplinkControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f81924p = referralsWidgetInteractor;
        this.f81925q = sharedReferralsNavigationInteractor;
        this.f81926r = invitesPagingSource;
        this.f81927s = featureToggleInteractor;
        this.f81928t = ineligibilityBottomSheetControllerProvider;
        this.u = deeplinkControllerModelExtension;
        boolean zC = ((jte.d) featureToggleInteractor).c(SharedReferralsUiApi$Toggles$ShowInviteListPaginated.f81821c);
        this.v = zC;
        this.f81929w = mra.d.b(this, new m(zC ? new xya.j(new Data(null, null, true, 3, null)) : k.f309688a, false), stateMapper, null, false, 12);
        this.f81930x = e.a(this, new xwd.a(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        if (this.v) {
            l.a1(this, this.f81926r.j(250L), null, null, new xya.f(this, null, 0), 3);
            l2(new xya.g(this, null, 0), new yi5.b(26));
        }
    }

    public final void I2(Object obj2, String itemId) throws Throwable {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "I-cant-find-my-invitee")) {
            this.f81925q.getClass();
            C1(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, "r-referrals-trigger", null, null, 6)));
            return;
        }
        if (!(obj2 instanceof pwa.j)) {
            if (obj2 instanceof ActiveOrPastInviteeDetails) {
                n2(new a(obj2, this, null), new whi.b(6));
                return;
            } else {
                wp5.y.B("No appropriate item click handler");
                return;
            }
        }
        pwa.j jVar = (pwa.j) obj2;
        if (jVar.e != pwa.b.INELIGIBLE) {
            C2(new o(jVar.f240360a));
            return;
        }
        h.v2(this.f81930x, new AllReferralsScreenContract$ModalStep.IneligibilityDialog(jVar.f240363g), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f81930x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.v) {
            return;
        }
        boolean zC = ((jte.d) this.f81927s).c(SharedReferralsUiApi$Toggles$FaqReferralsFlowMigrationV4.f81817c);
        Continuation continuation = null;
        AllReferralsScreenContract$InputData allReferralsScreenContract$InputData = this.o;
        final t tVar = this.f81924p;
        if (zC) {
            n referralCampaignV4Type = allReferralsScreenContract$InputData.f81920a;
            tVar.getClass();
            Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
            final int i = 2;
            l.b1(this, vkm.q.q(rd0.e.b(nim.a.w(((wwa.b) tVar.f250857a).b(referralCampaignV4Type), new Function1() { // from class: gya.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ActiveOrPastInvitesInfo info = (ActiveOrPastInvitesInfo) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(info, "info");
                            ArrayList arrayList = info.f81705a;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it8 = arrayList.iterator();
                            while (it8.hasNext()) {
                                RowDelegate.Model modelA = ((tya.j) tVar.f250858b).a((ActiveOrPastInviteeDetails) it8.next(), tya.d.RECENT_UI_TYPE, n.STANDARD);
                                if (modelA != null) {
                                    arrayList2.add(modelA);
                                }
                            }
                            return arrayList2;
                        case 1:
                            Intrinsics.checkNotNullParameter(info, "info");
                            ArrayList arrayList3 = info.f81705a;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it9 = arrayList3.iterator();
                            while (it9.hasNext()) {
                                RowDelegate.Model modelA2 = ((tya.j) tVar.f250858b).a((ActiveOrPastInviteeDetails) it9.next(), tya.d.RECENT_UI_TYPE, n.STANDARD);
                                if (modelA2 != null) {
                                    arrayList4.add(modelA2);
                                }
                            }
                            return arrayList4;
                        default:
                            Intrinsics.checkNotNullParameter(info, "info");
                            ArrayList arrayList5 = info.f81705a;
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it10 = arrayList5.iterator();
                            while (it10.hasNext()) {
                                RowDelegate.Model modelA3 = ((tya.j) tVar.f250858b).a((ActiveOrPastInviteeDetails) it10.next(), tya.d.RECENT_UI_TYPE, n.STANDARD);
                                if (modelA3 != null) {
                                    arrayList6.add(modelA3);
                                }
                            }
                            return arrayList6;
                    }
                }
            }))), null, new xya.f(this, null, 1), 3);
            return;
        }
        n referralCampaignV4Type2 = allReferralsScreenContract$InputData.f81920a;
        tVar.getClass();
        wwa.b bVar = (wwa.b) tVar.f250857a;
        Intrinsics.checkNotNullParameter(referralCampaignV4Type2, "referralCampaignV4Type");
        final int i2 = 0;
        vkm.d dVarB = rd0.e.b(nim.a.w(wwa.b.a(bVar, i.ACTIVE, referralCampaignV4Type2, 12), new Function1() { // from class: gya.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ActiveOrPastInvitesInfo info = (ActiveOrPastInvitesInfo) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(info, "info");
                        ArrayList arrayList = info.f81705a;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            RowDelegate.Model modelA = ((tya.j) tVar.f250858b).a((ActiveOrPastInviteeDetails) it8.next(), tya.d.RECENT_UI_TYPE, n.STANDARD);
                            if (modelA != null) {
                                arrayList2.add(modelA);
                            }
                        }
                        return arrayList2;
                    case 1:
                        Intrinsics.checkNotNullParameter(info, "info");
                        ArrayList arrayList3 = info.f81705a;
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            RowDelegate.Model modelA2 = ((tya.j) tVar.f250858b).a((ActiveOrPastInviteeDetails) it9.next(), tya.d.RECENT_UI_TYPE, n.STANDARD);
                            if (modelA2 != null) {
                                arrayList4.add(modelA2);
                            }
                        }
                        return arrayList4;
                    default:
                        Intrinsics.checkNotNullParameter(info, "info");
                        ArrayList arrayList5 = info.f81705a;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            RowDelegate.Model modelA3 = ((tya.j) tVar.f250858b).a((ActiveOrPastInviteeDetails) it10.next(), tya.d.RECENT_UI_TYPE, n.STANDARD);
                            if (modelA3 != null) {
                                arrayList6.add(modelA3);
                            }
                        }
                        return arrayList6;
                }
            }
        }));
        n referralCampaignV4Type3 = allReferralsScreenContract$InputData.f81920a;
        Intrinsics.checkNotNullParameter(referralCampaignV4Type3, "referralCampaignV4Type");
        r rVarA = wwa.b.a(bVar, i.PAST, referralCampaignV4Type3, 12);
        final int i3 = 1;
        l.b1(this, vkm.q.q(new t38.e(dVarB, 24, rd0.e.b(nim.a.w(rVarA, new Function1() { // from class: gya.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                ActiveOrPastInvitesInfo info = (ActiveOrPastInvitesInfo) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(info, "info");
                        ArrayList arrayList = info.f81705a;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            RowDelegate.Model modelA = ((tya.j) tVar.f250858b).a((ActiveOrPastInviteeDetails) it8.next(), tya.d.RECENT_UI_TYPE, n.STANDARD);
                            if (modelA != null) {
                                arrayList2.add(modelA);
                            }
                        }
                        return arrayList2;
                    case 1:
                        Intrinsics.checkNotNullParameter(info, "info");
                        ArrayList arrayList3 = info.f81705a;
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it9 = arrayList3.iterator();
                        while (it9.hasNext()) {
                            RowDelegate.Model modelA2 = ((tya.j) tVar.f250858b).a((ActiveOrPastInviteeDetails) it9.next(), tya.d.RECENT_UI_TYPE, n.STANDARD);
                            if (modelA2 != null) {
                                arrayList4.add(modelA2);
                            }
                        }
                        return arrayList4;
                    default:
                        Intrinsics.checkNotNullParameter(info, "info");
                        ArrayList arrayList5 = info.f81705a;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            RowDelegate.Model modelA3 = ((tya.j) tVar.f250858b).a((ActiveOrPastInviteeDetails) it10.next(), tya.d.RECENT_UI_TYPE, n.STANDARD);
                            if (modelA3 != null) {
                                arrayList6.add(modelA3);
                            }
                        }
                        return arrayList6;
                }
            }
        })), new wvg.i(this, continuation, 22))), null, null, 7);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f81929w;
    }
}
