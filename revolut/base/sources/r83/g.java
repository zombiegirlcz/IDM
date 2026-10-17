package r83;

import ael.t0;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogControllerContract$ModalStep;
import com.revolut.feature.checklist_challenges.impl.network.ChecklistChallengesService;
import com.revolut.feature.confirmation_code.toggles.ESignOtpToggles$SmsOtpExtraction;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import com.revolut.feature.retail.privacy.impl.R$string;
import com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.MakeMeDiscoverableDialogMapper;
import com.revolut.feature.shared.network_authentication.impl.network.TokenService;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.ScreenerService;
import h93.l0;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jid.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import ocb.a0;
import om4.d0;
import r40.n0;
import rh8.k0;
import rp0.y;
import vkm.j2;
import wli.x;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f252320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f252321x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f252320w = obj2;
        this.f252321x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((q) this.f252320w, (l0) this.f252321x, continuation, 0);
            case 1:
                return new g((com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b) this.f252320w, (t61.g) this.f252321x, continuation, 1);
            case 2:
                return new g((r8e.n) this.f252320w, this.f252321x, continuation, 2);
            case 3:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a) this.f252320w, (it3.d) this.f252321x, continuation, 3);
            case 4:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a) this.f252320w, (CreditApplicationPluginFlowContract$Configuration) this.f252321x, continuation, 4);
            case 5:
                return new g((com.revolut.feature.subscriptions.impl.block_future_payments.a) this.f252320w, (qua.p) this.f252321x, continuation, 5);
            case 6:
                g gVar = new g((dj0.d) this.f252321x, continuation, 6);
                gVar.f252320w = obj2;
                return gVar;
            case 7:
                g gVar2 = new g((ra8.c) this.f252321x, continuation, 7);
                gVar2.f252320w = obj2;
                return gVar2;
            case 8:
                return new g((d0) this.f252320w, (String) this.f252321x, continuation, 8);
            case 9:
                return new g((rae.c) this.f252320w, (qua.p) this.f252321x, continuation, 9);
            case 10:
                return new g((rc8.k) this.f252320w, (kn8.d) this.f252321x, continuation, 10);
            case 11:
                g gVar3 = new g((com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b) this.f252321x, continuation, 11);
                gVar3.f252320w = obj2;
                return gVar3;
            case 12:
                return new g((rcg.q) this.f252320w, (HotelsProperty) this.f252321x, continuation, 12);
            case 13:
                g gVar4 = new g((z) this.f252321x, continuation, 13);
                gVar4.f252320w = obj2;
                return gVar4;
            case 14:
                return new g((rf3.a) this.f252320w, (String) this.f252321x, continuation, 14);
            case 15:
                return new g((rf3.a) this.f252320w, (File) this.f252321x, continuation, 15);
            case 16:
                return new g((rf9.l) this.f252320w, (xo1.g) this.f252321x, continuation, 16);
            case 17:
                return new g((rg3.o) this.f252320w, (String) this.f252321x, continuation, 17);
            case 18:
                return new g((rga.p) this.f252320w, (wga.a) this.f252321x, continuation, 18);
            case 19:
                return new g((rgi.m) this.f252320w, (String) this.f252321x, continuation, 19);
            case 20:
                return new g((k0) this.f252320w, (String) this.f252321x, continuation, 20);
            case 21:
                return new g((prl.e) this.f252320w, (String) this.f252321x, continuation, 21);
            case 22:
                return new g((rj7.m) this.f252320w, (RemoteDocument) this.f252321x, continuation, 22);
            case 23:
                return new g((com.revolut.feature.confirmation_code.ui.otp.a) this.f252320w, (nk3.a) this.f252321x, continuation, 23);
            case 24:
                return new g((com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.b) this.f252320w, (em8.a) this.f252321x, continuation, 24);
            case 25:
                return new g((rld.m) this.f252320w, (ty0.a) this.f252321x, continuation, 25);
            case 26:
                g gVar5 = new g((rle.j) this.f252321x, continuation, 26);
                gVar5.f252320w = obj2;
                return gVar5;
            case 27:
                return new g((rlh.j) this.f252320w, (rlh.s) this.f252321x, continuation, 27);
            case 28:
                return new g((rm0.b) this.f252320w, (hn0.k) this.f252321x, continuation, 28);
            default:
                return new g((com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) this.f252320w, (BackgroundCatalogControllerContract$ModalStep) this.f252321x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objJ;
        Object objRefreshScopedToken;
        Object objB;
        Object objX1;
        tk3.b bVar;
        Object objA;
        Object objB2;
        int i = this.u;
        int i2 = 10;
        int i3 = 14;
        final int i5 = 0;
        Continuation continuation = null;
        Object obj3 = this.f252321x;
        final int i6 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    q qVar = (q) this.f252320w;
                    l0 l0Var = (l0) obj3;
                    this.v = 1;
                    e eVar = q.Companion;
                    if (l0Var != l0.INDIA_GLOBAL || (objJ = qVar.j(this)) != aVar) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b bVar2 = (com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b) this.f252320w;
                r85.d dVar = new r85.d(bVar2, (t61.g) obj3, continuation, i6);
                this.v = 1;
                Object objB3 = pu7.a.B(bVar2.k, "processNewCard", dVar, this);
                return objB3 == aVar2 ? aVar2 : objB3;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    rsi.g gVar = ((r8e.n) this.f252320w).f252418t;
                    rsi.c cVar = new rsi.c((GroupMemberClickData) obj3);
                    this.v = 1;
                    if (gVar.Z2(cVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a) this.f252320w;
                    r25.a aVar6 = new r25.a(aVar5, (it3.d) obj3, continuation, 4);
                    this.v = 1;
                    if (aVar5.p2(this, aVar6) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar8 = (com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a) this.f252320w;
                r94.c cVar2 = new r94.c(aVar8, (CreditApplicationPluginFlowContract$Configuration) obj3, continuation, i6);
                this.v = 1;
                Object objB4 = pu7.a.B(aVar8.k, "account confirmation", cVar2, this);
                return objB4 == aVar7 ? aVar7 : objB4;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.subscriptions.impl.block_future_payments.a aVar10 = (com.revolut.feature.subscriptions.impl.block_future_payments.a) this.f252320w;
                r25.a aVar11 = new r25.a(aVar10, (qua.p) obj3, continuation, 5);
                this.v = 1;
                Object objP2 = aVar10.p2(this, aVar11);
                return objP2 == aVar9 ? aVar9 : objP2;
            case 6:
                FlowCollector flowCollector = (FlowCollector) this.f252320w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(new hrf.e(new hrf.d((dj0.d) obj3, null), true, null), false, null, 3);
                    this.f252320w = null;
                    this.v = 1;
                    if (flowCollector.emit(dataP, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                CoroutineScope coroutineScope = (CoroutineScope) this.f252320w;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    ra8.c cVar3 = (ra8.c) obj3;
                    com.revolut.feature.junior.isa.impl.ui.jisa_details.flow.a aVar14 = new com.revolut.feature.junior.isa.impl.ui.jisa_details.flow.a(coroutineScope, cVar3, null);
                    this.f252320w = null;
                    this.v = 1;
                    if (cVar3.p2(this, aVar14) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                d0 d0Var = (d0) this.f252320w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    Object obj4 = ((d4m.a) d0Var.f226551b).get();
                    Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    pad.a aVar16 = new pad.a((String) obj3);
                    this.v = 1;
                    objRefreshScopedToken = ((TokenService) obj4).refreshScopedToken(aVar16, "Widget", this);
                    if (objRefreshScopedToken == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objRefreshScopedToken = obj2;
                }
                pad.b bVar3 = (pad.b) objRefreshScopedToken;
                return new imi.a(bVar3.getExpiryDate(), bVar3.getAccessCode(), bVar3.getRefreshCode(), bVar3.getOwnerId());
            case 9:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                nm1.c cVar4 = ((rae.c) this.f252320w).f252818b;
                this.v = 1;
                Object objA2 = ((qm1.f) cVar4).a((qua.p) obj3, this);
                return objA2 == aVar17 ? aVar17 : objA2;
            case 10:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    rc8.k kVar = (rc8.k) this.f252320w;
                    oqk.h hVar = new oqk.h(obj3, (Object) kVar, false, (Continuation) null, 24);
                    this.v = 1;
                    if (kVar.Y2(this, hVar) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                yhm.r rVar = (yhm.r) this.f252320w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    a0 revTagDiscoverableState = (a0) rVar.f314201a;
                    a0 phoneNumberDiscoverableState = (a0) rVar.f314202b;
                    do3.n nVar = (do3.n) rVar.f314203c;
                    com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b bVar4 = (com.revolut.feature.retail.privacy.impl.ui.flow.screen.extensions.discoverability.b) obj3;
                    j60.a aVar20 = bVar4.f82788m;
                    final MakeMeDiscoverableDialogMapper makeMeDiscoverableDialogMapper = bVar4.f82787l;
                    final String revTag = nVar.f;
                    if (revTag == null) {
                        revTag = "";
                    }
                    makeMeDiscoverableDialogMapper.getClass();
                    Intrinsics.checkNotNullParameter(revTag, "revTag");
                    Intrinsics.checkNotNullParameter(phoneNumberDiscoverableState, "phoneNumberDiscoverableState");
                    Intrinsics.checkNotNullParameter(revTagDiscoverableState, "revTagDiscoverableState");
                    rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.profile_privacy_make_me_discoverable_title, null, null, 14), new TextLocalisedClause(R$string.profile_privacy_make_me_discoverable_subtitle, null, null, 14), null, 28);
                    qv0.i[] elements = {MakeMeDiscoverableDialogMapper.a(phoneNumberDiscoverableState, new Function1() { // from class: rcb.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i101 = i5;
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            switch (i101) {
                                case 0:
                                    int i102 = R$drawable.uikit_icn_24_smartphone;
                                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.profile_details_item_phone, null, null, 14);
                                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.profile_details_item_phone_subtitle, u.c(new TextClause("@".concat(revTag), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                                    makeMeDiscoverableDialogMapper.getClass();
                                    return MakeMeDiscoverableDialogMapper.b("ID_PAYMENTS_BS_PHONE_DISCOVERABLE", i102, textLocalisedClause, textLocalisedClause2, zBooleanValue);
                                default:
                                    int i103 = R$drawable.uikit_icn_24_profile;
                                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.profile_privacy_discoverable_by_username_title, null, null, 14);
                                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.profile_privacy_discoverable_by_username_subtitle, u.c(new TextClause("@".concat(revTag), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                                    makeMeDiscoverableDialogMapper.getClass();
                                    return MakeMeDiscoverableDialogMapper.b("ID_PAYMENTS_BS_REVTAG_DISCOVERABLE", i103, textLocalisedClause3, textLocalisedClause4, zBooleanValue);
                            }
                        }
                    }), MakeMeDiscoverableDialogMapper.a(revTagDiscoverableState, new Function1() { // from class: rcb.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            int i101 = i6;
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            switch (i101) {
                                case 0:
                                    int i102 = R$drawable.uikit_icn_24_smartphone;
                                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.profile_details_item_phone, null, null, 14);
                                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.profile_details_item_phone_subtitle, u.c(new TextClause("@".concat(revTag), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                                    makeMeDiscoverableDialogMapper.getClass();
                                    return MakeMeDiscoverableDialogMapper.b("ID_PAYMENTS_BS_PHONE_DISCOVERABLE", i102, textLocalisedClause, textLocalisedClause2, zBooleanValue);
                                default:
                                    int i103 = R$drawable.uikit_icn_24_profile;
                                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.profile_privacy_discoverable_by_username_title, null, null, 14);
                                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.profile_privacy_discoverable_by_username_subtitle, u.c(new TextClause("@".concat(revTag), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                                    makeMeDiscoverableDialogMapper.getClass();
                                    return MakeMeDiscoverableDialogMapper.b("ID_PAYMENTS_BS_REVTAG_DISCOVERABLE", i103, textLocalisedClause3, textLocalisedClause4, zBooleanValue);
                            }
                        }
                    })};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    List listL = kotlin.collections.d.L(elements);
                    yp0.b.k(listL, 0, 0, 0, 0, 31);
                    efm.b bVarG = aVar20.G(new y(listL, tVar, rp0.l.WINDOW, null, null, null, 1016));
                    this.f252320w = null;
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    rcg.q qVar2 = (rcg.q) this.f252320w;
                    String str = ((HotelsProperty) obj3).f97981a;
                    this.v = 1;
                    if (pu7.a.B(qVar2.k, str, new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.c(qVar2, str, null), this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                FlowCollector flowCollector2 = (FlowCollector) this.f252320w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    if (kii.e.n("HIDDEN_DELISTED_POCKETS", (mk0.a) ((z) obj3).f174462c) == null) {
                        f0 f0Var = f0.f322471a;
                        this.f252320w = null;
                        this.v = 1;
                        if (flowCollector2.emit(f0Var, this) == aVar22) {
                            return aVar22;
                        }
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    rf3.a aVar24 = (rf3.a) this.f252320w;
                    r25.a aVar25 = new r25.a(aVar24, (String) obj3, continuation, 9);
                    this.v = 1;
                    if (aVar24.Y2(this, aVar25) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    rf3.a aVar27 = (rf3.a) this.f252320w;
                    r25.a aVar28 = new r25.a(aVar27, (File) obj3, continuation, i2);
                    this.v = 1;
                    if (aVar27.Y2(this, aVar28) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                rf9.l lVar = (rf9.l) this.f252320w;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    wo1.b bVar5 = lVar.f253730n;
                    xo1.d dVar2 = new xo1.d((xo1.g) obj3, null, null, 30);
                    this.v = 1;
                    objB = ((vp1.c) bVar5).b(dVar2, this);
                    if (objB == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i105 != 1) {
                        if (i105 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                List list = (List) objB;
                j2 j2Var = lVar.f253732q;
                while (true) {
                    Object value = j2Var.getValue();
                    List list2 = list;
                    if (j2Var.h(value, rf9.m.a((rf9.m) value, null, list, r0.g(), false, 9))) {
                        lVar.r3(list2);
                        this.v = 2;
                        if (rf9.l.o3(lVar, list2, this) == aVar29) {
                            return aVar29;
                        }
                        return Unit.f186387a;
                    }
                    list = list2;
                }
                break;
            case 17:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    ChecklistChallengesService checklistChallengesService = ((rg3.o) this.f252320w).d;
                    qg3.c cVar5 = new qg3.c((String) obj3);
                    this.v = 1;
                    if (checklistChallengesService.optInToChecklistChallenge(cVar5, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x xVar = ((rga.p) this.f252320w).f254062l;
                String str2 = ((wga.a) obj3).f297267a;
                lg0.a aVar32 = lg0.a.IGNORE;
                Boolean bool = Boolean.FALSE;
                this.v = 1;
                Object objL1 = xVar.L1(str2, aVar32, bool, this);
                return objL1 == aVar31 ? aVar31 : objL1;
            case 19:
                rgi.m mVar = (rgi.m) this.f252320w;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objX1 = lg0.b.x1(mVar.o, (String) obj3, null, null, this, 6);
                    if (objX1 == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objX1 = obj2;
                }
                if (!((Boolean) objX1).booleanValue()) {
                    mVar.H2(mVar.f254199q, new n0((String) obj3, i2));
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objA3 = k0.a((k0) this.f252320w, (String) obj3, this);
                return objA3 == aVar34 ? aVar34 : objA3;
            case 21:
                prl.e eVar2 = (prl.e) this.f252320w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((ScreenerService) eVar2.e).deleteScreener((String) obj3, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i110 != 1) {
                        if (i110 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (eVar2.s(this) == aVar35) {
                    return aVar35;
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    rj7.m mVar2 = (rj7.m) this.f252320w;
                    f9i.c cVar6 = new f9i.c(new f9i.e(((RemoteDocument) obj3).f75844a, true));
                    this.v = 1;
                    if (mVar2.G1(cVar6, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                nk3.a aVar37 = (nk3.a) obj3;
                com.revolut.feature.confirmation_code.ui.otp.a aVar38 = (com.revolut.feature.confirmation_code.ui.otp.a) this.f252320w;
                cli.y yVar = aVar38.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    phm.a aVar40 = (phm.a) aVar38.f65965q.get(aVar37);
                    if (aVar40 == null || (bVar = (tk3.b) aVar40.get()) == null) {
                        throw new IllegalArgumentException(j6.a.q("Unsupported channel ", aVar37.name()));
                    }
                    this.v = 1;
                    objA = bVar.a(this);
                    if (objA == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                String str3 = (String) objA;
                int i113 = rk3.n.f254742a[aVar37.ordinal()];
                if (i113 != 1) {
                    if (i113 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar38.H2(yVar, new n0(str3, 16));
                } else if (str3.length() == 8) {
                    aVar38.H2(yVar, new n0(str3, i3));
                    if (aVar38.f314520h != aii.s.HIDDEN) {
                        aVar38.I2(str3);
                    }
                } else if (((jte.d) aVar38.f65967s).c(ESignOtpToggles$SmsOtpExtraction.f65950c)) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "ESignOtpScreenModel", a0.d.n("SMS OTP handler returned an unexpected code length: ", str3.length()), null, h0Var);
                } else {
                    aVar38.H2(yVar, new n0(str3, 15));
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.b bVar6 = (com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.b) this.f252320w;
                r25.a aVar42 = new r25.a(bVar6, (em8.a) obj3, continuation, 12);
                this.v = 1;
                Object objB5 = pu7.a.B(bVar6.k, "HANDLE_JUNIOR_ADD_PHONE_NUMBER_RESULT", aVar42, this);
                return objB5 == aVar41 ? aVar41 : objB5;
            case 25:
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x xVar2 = ((rld.m) this.f252320w).f255025p;
                String str4 = ((ty0.a) obj3).f275445a;
                lg0.a aVar44 = lg0.a.OPEN_BROWSER;
                Boolean bool2 = Boolean.FALSE;
                this.v = 1;
                Object objL12 = xVar2.L1(str4, aVar44, bool2, this);
                return objL12 == aVar43 ? aVar43 : objL12;
            case 26:
                List list3 = (List) this.f252320w;
                fim.a aVar45 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    if (!hx7.l.p(list3)) {
                        od0.i.Companion.getClass();
                        return od0.i.f224256b;
                    }
                    ufm.i iVarF = ((t0) ((rle.j) obj3).f255037c).f();
                    this.f252320w = null;
                    this.v = 1;
                    objB2 = nim.a.b(iVarF, this);
                    if (objB2 == aVar45) {
                        return aVar45;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                Links links = (Links) objB2;
                od0.h hVar2 = od0.i.Companion;
                Intrinsics.h(links);
                rle.d dVar3 = new rle.d(links);
                hVar2.getClass();
                return od0.h.a(dVar3);
            case 27:
                fim.a aVar46 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                rlh.j jVar = (rlh.j) this.f252320w;
                rlh.f fVar = new rlh.f((rlh.s) obj3, jVar, null);
                this.v = 1;
                Object objB6 = pu7.a.B(jVar.k, "onInstrumentClick", fVar, this);
                return objB6 == aVar46 ? aVar46 : objB6;
            case 28:
                fim.a aVar47 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    rm0.b.Companion.getClass();
                    long j2 = rm0.b.f255137n;
                    this.v = 1;
                    if (skm.k0.c(j2, this) == aVar47) {
                        return aVar47;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ((rm0.b) this.f252320w).f255143j.remove((hn0.k) obj3);
                return Unit.f186387a;
            default:
                fim.a aVar48 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar7 = (com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) this.f252320w;
                r25.a aVar49 = new r25.a(bVar7, (BackgroundCatalogControllerContract$ModalStep) obj3, continuation, 13);
                this.v = 1;
                Object objB7 = pu7.a.B(bVar7.k, "delete-background", aVar49, this);
                return objB7 == aVar48 ? aVar48 : objB7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f252321x = obj2;
    }
}
