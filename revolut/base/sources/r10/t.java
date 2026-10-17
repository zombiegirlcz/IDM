package r10;

import android.app.Activity;
import android.content.Context;
import aqd.d0;
import ard.c0;
import c8i.j0;
import cc.f;
import com.google.common.collect.ImmutableMap;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkError;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkGenericError;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkNoResponse;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkNotHandledError;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkRegistrationNeeded;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkSuspended;
import com.revolut.feature.apm.multibanco.sdk.proxy.models.results.MBWaySdkUnavailable;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData;
import com.revolut.feature.defi.remittances.impl.domain.model.DeFiTransferQuoteRequest;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.a;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.feature.twofa.exceptions.UserDeclinedTwoFaException;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import com.youTransactor.uCube.rpc.Constants;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.t0;
import nii.z;
import q97.b1;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q0;
import vkm.y;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f250857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f250858b;

    public t(g5a.e chatTransferNavBarTitleMapper, g5a.d chatTransferNavBarMenuMapper, w chatTransferNavBarSearchTextMapper) {
        Intrinsics.checkNotNullParameter(chatTransferNavBarTitleMapper, "chatTransferNavBarTitleMapper");
        Intrinsics.checkNotNullParameter(chatTransferNavBarMenuMapper, "chatTransferNavBarMenuMapper");
        Intrinsics.checkNotNullParameter(chatTransferNavBarSearchTextMapper, "chatTransferNavBarSearchTextMapper");
        this.f250857a = chatTransferNavBarMenuMapper;
        this.f250858b = chatTransferNavBarSearchTextMapper;
    }

    public static akg.n j(t tVar) {
        return nim.a.v(tVar.n(), new j4h.m(tVar, new jcj.n(17), 27));
    }

    public static wkm.l p(t tVar, DeFiTransferQuoteRequest request) {
        tVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return vkm.q.Q(rd0.e.b(xv5.c.b((xv5.c) tVar.f250857a)), new eh9.j((Continuation) null, tVar, request, 15));
    }

    public f a() {
        return new f((String) this.f250857a, Collections.unmodifiableList((List) this.f250858b));
    }

    public void b() {
        e0.n(((zkm.d) this.f250858b).f323100a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gim.c r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f250858b
            com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData r0 = (com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData) r0
            java.lang.String r0 = r0.f65812a
            boolean r1 = r8 instanceof eh3.c
            if (r1 == 0) goto L19
            r1 = r8
            eh3.c r1 = (eh3.c) r1
            int r2 = r1.f125708w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L19
            int r2 = r2 - r3
            r1.f125708w = r2
            goto L1e
        L19:
            eh3.c r1 = new eh3.c
            r1.<init>(r7, r8)
        L1e:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f125708w
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            yhm.o.b(r8)
            goto L5f
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.f250857a
            lg3.a r8 = (lg3.a) r8
            r1.f125708w = r5
            pg3.b r8 = (pg3.b) r8
            rg3.o r8 = r8.f235795a
            rd3.m r3 = new rd3.m
            r5 = 28
            r3.<init>(r5)
            r8.getClass()
            qg7.p r5 = new qg7.p
            r6 = 13
            r5.<init>(r8, r3, r4, r6)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r5, r1)
            if (r8 != r2) goto L5f
            return r2
        L5f:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r1 = r8.getContent()
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L77
            java.lang.Throwable r8 = r8.getError()
            if (r8 != 0) goto L76
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to get challenges"
            r8.<init>(r0)
        L76:
            throw r8
        L77:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r8 = r1.iterator()
        L7d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L93
            java.lang.Object r1 = r8.next()
            r2 = r1
            com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge r2 = (com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge) r2
            java.lang.String r2 = r2.f65775a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r0)
            if (r2 == 0) goto L7d
            r4 = r1
        L93:
            com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge r4 = (com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge) r4
            if (r4 == 0) goto L98
            return r4
        L98:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unable to find challenge "
            java.lang.String r0 = j6.a.q(r1, r0)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.t.c(gim.c):java.lang.Object");
    }

    public com.revolut.kompot.navigable.b d() {
        return (com.revolut.kompot.navigable.b) this.f250858b;
    }

    public z e(Throwable throwable) {
        v60.d bVar;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if ((throwable instanceof UserDeclinedTwoFaException) || (throwable instanceof HandledNetworkException)) {
            return null;
        }
        if (!(throwable instanceof MBWaySdkError)) {
            j72.c cVarH = ((w) this.f250857a).h(throwable);
            Integer numValueOf = cVarH != null ? Integer.valueOf(cVarH.f171837a) : null;
            v60.e eVar = (v60.e) this.f250858b;
            if (numValueOf == null || (bVar = ((ao0.a) eVar).b(numValueOf)) == null) {
                bVar = new v60.b();
            }
            return new z(ofm.q.O(bVar), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
        }
        MBWaySdkError mBWaySdkError = (MBWaySdkError) throwable;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14);
        if ((mBWaySdkError instanceof MBWaySdkGenericError) || (mBWaySdkError instanceof MBWaySdkNoResponse)) {
            textLocalisedClause = new TextLocalisedClause(R$string.multibanco_sdk_error_generic, null, null, 14);
        } else if (mBWaySdkError instanceof MBWaySdkNotHandledError) {
            textLocalisedClause = new TextLocalisedClause(R$string.multibanco_sdk_error_not_handled, null, null, 14);
        } else if (mBWaySdkError instanceof MBWaySdkRegistrationNeeded) {
            textLocalisedClause = new TextLocalisedClause(R$string.multibanco_sdk_error_registration, null, null, 14);
        } else if (mBWaySdkError instanceof MBWaySdkSuspended) {
            textLocalisedClause = new TextLocalisedClause(R$string.multibanco_sdk_error_suspended, null, null, 14);
        } else {
            if (!(mBWaySdkError instanceof MBWaySdkUnavailable)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.multibanco_sdk_error_unavailable, null, null, 14);
        }
        return new z(textLocalisedClause2, textLocalisedClause, null, null, null, null, false, null, null, null, null, null, null, 32764);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    public c5a.s f(c5a.l domainState) {
        c5a.r qVar;
        List listC;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.a aVar = domainState.f21498a;
        if (Intrinsics.f(aVar, a.C0521a.f80161a)) {
            qVar = new c5a.p(new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_transfer_title, null, null, 14));
        } else {
            if (!(aVar instanceof c5a.o)) {
                throw new NoWhenBranchMatchedException();
            }
            qVar = new c5a.q(((c5a.o) domainState.f21498a).f21517a);
        }
        g5a.d dVar = (g5a.d) this.f250857a;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (((Boolean) dVar.f140704b.getValue()).booleanValue()) {
            IconNavBarMenuItem[] elements = {domainState.f21509r ? new IconNavBarMenuItem("ID_MENU_ITEM_SCHEDULED", new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_home_schedule_payment, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION) : null, new IconNavBarMenuItem("ID_MENU_ITEM_NEW", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.who_to_pay_header_action, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listC = kotlin.collections.d.L(elements);
        } else {
            listC = zhm.u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_NEW", new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.who_to_pay_header_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.who_to_pay_header_action, null, null, 14), 52));
        }
        return new c5a.s(qVar, listC, ((Boolean) ((w) this.f250858b).f250866b.getValue()).booleanValue() ? new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_global_search_bar_lite_app, null, null, 14) : new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_global_search_bar, null, null, 14), domainState.i, domainState.o, domainState.f21508q);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof buc.c
            if (r0 == 0) goto L13
            r0 = r5
            buc.c r0 = (buc.c) r0
            int r1 = r0.f18761w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18761w = r1
            goto L18
        L13:
            buc.c r0 = new buc.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18761w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.f250857a
            ang.f r5 = (ang.f) r5
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f18761w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            do3.n r5 = (do3.n) r5
            java.lang.Object r0 = r4.f250858b
            wtc.q0 r0 = (wtc.q0) r0
            r0.getClass()
            if (r5 == 0) goto L58
            com.revolut.feature.address.models.Address r5 = r5.k
            if (r5 == 0) goto L58
            wi0.b r5 = nz8.d.g(r5)
            goto L59
        L58:
            r5 = 0
        L59:
            boolean r5 = com.bumptech.glide.d.u(r5)
            if (r5 == 0) goto L62
            com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey r5 = com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey.STREET_MODE_INTRO_MX
            goto L64
        L62:
            com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey r5 = com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey.STREET_MODE_INTRO
        L64:
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = rwc.d.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.t.g(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof c41.d
            if (r0 == 0) goto L13
            r0 = r8
            c41.d r0 = (c41.d) r0
            int r1 = r0.f20974w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20974w = r1
            goto L18
        L13:
            c41.d r0 = new c41.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20974w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            goto L5c
        L28:
            r8 = move-exception
            goto L5f
        L2a:
            r8 = move-exception
            goto L65
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.f250857a     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            xg0.a r8 = (xg0.a) r8     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r2 = r7.f250858b     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.String r5 = "feature_seon_sdk_retail"
            java.util.Set r5 = zhm.y0.b(r5)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            oi0.b r8 = (oi0.b) r8     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            vkm.d r8 = r8.e(r2, r5)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            a2c.c r2 = new a2c.c     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r5 = 2
            r6 = 19
            r2.<init>(r5, r6, r3)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f20974w = r4     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r8 = vkm.q.y(r8, r2, r0)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            if (r8 != r1) goto L5c
            return r1
        L5c:
            xg0.u r8 = (xg0.u) r8     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            return r8
        L5f:
            xg0.o r0 = new xg0.o
            r0.<init>(r4, r8, r3)
            return r0
        L65:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.t.h(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof c41.e
            if (r0 == 0) goto L13
            r0 = r6
            c41.e r0 = (c41.e) r0
            int r1 = r0.f20975w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20975w = r1
            goto L18
        L13:
            c41.e r0 = new c41.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20975w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f250857a
            xg0.a r6 = (xg0.a) r6
            java.lang.Object r2 = r5.f250858b
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r4 = "feature_seon_sdk_retail"
            java.util.Set r4 = zhm.y0.b(r4)
            r0.f20975w = r3
            oi0.b r6 = (oi0.b) r6
            java.lang.Object r6 = r6.c(r2, r4, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            xg0.h r6 = (xg0.h) r6
            java.util.Set r6 = r6.f305464a
            boolean r6 = r6.isEmpty()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.t.i(gim.c):java.lang.Object");
    }

    @Override // zp0.c
    public void k(String newValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(newValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        if (z) {
            d0 d0VarE3 = ((IncomeSortersDetailsController) this.f250857a).d();
            IncomeSorterHomeContract$DestinationValue destinationValue = (IncomeSorterHomeContract$DestinationValue) this.f250858b;
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) d0VarE3;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(destinationValue, "destinationValue");
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            aqd.m mVar = (aqd.m) ((aqd.t) ((j2) eVar.f87766x.f22677a).getValue()).f8402a.getContent();
            if (mVar == null) {
                return;
            }
            dj0.d dVar = mVar.f8363a;
            Long lN = kotlin.text.z.n(newValue);
            dj0.d dVar2 = new dj0.d(((100 / ((long) 2)) + (dVar.f115082a * (lN != null ? lN.longValue() : 0L))) / 100, dVar.f115083b);
            j2 j2Var = eVar.A;
            j2Var.setValue(r0.q((Map) j2Var.getValue(), new Pair(destinationValue.f87827c, dVar2)));
        }
    }

    public y l(amd.a balanceTimeframe, List sources) {
        ZonedDateTime zonedDateTimeMinusWeeks;
        efm.r rVarA;
        Intrinsics.checkNotNullParameter(balanceTimeframe, "balanceTimeframe");
        Intrinsics.checkNotNullParameter(sources, "sources");
        j0 j0Var = (j0) this.f250858b;
        Intrinsics.checkNotNullParameter(balanceTimeframe, "balanceTimeframe");
        ZonedDateTime zonedDateTimeMinusSeconds = ((l80.f) j0Var.f22203a).e().plusDays(1L).atStartOfDay(ZoneOffset.UTC).minusSeconds(1L);
        int i = dsd.c.f117291a[balanceTimeframe.ordinal()];
        int i2 = 3;
        Continuation continuation = null;
        if (i == 1) {
            zonedDateTimeMinusWeeks = zonedDateTimeMinusSeconds.minusWeeks(1L);
        } else if (i == 2) {
            zonedDateTimeMinusWeeks = zonedDateTimeMinusSeconds.minusMonths(1L);
        } else if (i == 3) {
            zonedDateTimeMinusWeeks = zonedDateTimeMinusSeconds.minusMonths(5L).withDayOfMonth(1);
        } else if (i == 4) {
            zonedDateTimeMinusWeeks = zonedDateTimeMinusSeconds.minusYears(1L).withDayOfMonth(1).plusMonths(1L);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            zonedDateTimeMinusWeeks = null;
        }
        Long lValueOf = zonedDateTimeMinusWeeks != null ? Long.valueOf(pu7.a.I(zonedDateTimeMinusWeeks)) : null;
        ZonedDateTime zonedDateTimeMinusDays = zonedDateTimeMinusSeconds.minusDays(1L);
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeMinusDays, "minusDays(...)");
        long jI = pu7.a.I(zonedDateTimeMinusDays);
        csd.a aVar = new csd.a(lValueOf, jI);
        nqj.c cVar = (nqj.c) this.f250857a;
        Intrinsics.checkNotNullParameter(sources, "sources");
        qqj.h hVar = cVar.f218477a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(sources, "sources");
        if (lValueOf == null) {
            lqj.a aVar2 = hVar.f248565b;
            List list = sources;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((nzi.f) it8.next()).a());
            }
            rVarA = aVar2.b(jI, arrayList);
        } else {
            lqj.a aVar3 = hVar.f248565b;
            long jLongValue = lValueOf.longValue();
            List list2 = sources;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((nzi.f) it9.next()).a());
            }
            rVarA = aVar3.a(jLongValue, jI, arrayList2);
        }
        return rd0.e.e(new c0(cVar.b(new y(new b6i.d0(hVar, lValueOf, jI, sources, (Continuation) null), t1.E(new q0(new b1(rd0.e.b(rVarA), 15), new qqj.e(hVar, lValueOf, jI, sources, null), 1)))), this, balanceTimeframe, aVar, 8), h0.f322473a, new a82.q(i2, 10, continuation));
    }

    public akg.n m(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        ybl.b bVar = (ybl.b) this.f250857a;
        a08.o oVar = new a08.o(ref2, this, 26);
        ybl.b.Companion.getClass();
        return nim.a.v(rd0.e.b(((ael.k) bVar).h(oVar, InstrumentTickerInteractor$Companion.f105074b, w4l.i.f294643c)), new a9h.b(10));
    }

    public vkm.d n() {
        wl3.h hVar = (wl3.h) ((cl3.a) this.f250857a);
        efm.r rVarW = nim.a.w(((sl3.k) hVar.f298380a).g(), new wje.m(27));
        efm.r map = hVar.o("").map(new j6k.g(new jcj.n(16), 22)).map(new j6k.g(new jcj.n(20), 21));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(nim.a.w(kli.a.h(rVarW, map), new jcj.n(18)));
    }

    public void o(i81.c action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof i81.b) {
            ((Activity) this.f250857a).runOnUiThread(new d0.c(this, ((i81.b) action).f159410a, 14));
        } else if (!(action instanceof i81.a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public efm.b q(zm3.a contact, iy9.b setting) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(setting, "setting");
        wl3.u uVar = (wl3.u) this.f250857a;
        if (!(contact instanceof zm3.l)) {
            throw new IllegalStateException("contactInfo doesn't contain revolut contact");
        }
        efm.b bVarH = uVar.c((zm3.l) contact, setting).h(sjg.a.b((eli.j) this.f250858b));
        Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
        return bVarH;
    }

    public t(Context context, dcl.q componentNameFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(componentNameFactory, "componentNameFactory");
        this.f250857a = context;
        this.f250858b = yhm.j.b(new e58.e(this, 4));
    }

    public t(lg3.a checklistChallengesInteractor, ChecklistCollectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(checklistChallengesInteractor, "checklistChallengesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f250857a = checklistChallengesInteractor;
        this.f250858b = inputData;
    }

    public t(fnh.a collectionsAssetListSourceCollectionKeyProvider, fnh.c collectionsAssetListSourceFiltersProvider) {
        Intrinsics.checkNotNullParameter(collectionsAssetListSourceCollectionKeyProvider, "collectionsAssetListSourceCollectionKeyProvider");
        Intrinsics.checkNotNullParameter(collectionsAssetListSourceFiltersProvider, "collectionsAssetListSourceFiltersProvider");
        this.f250857a = collectionsAssetListSourceCollectionKeyProvider;
        this.f250858b = collectionsAssetListSourceFiltersProvider;
    }

    public t(yof.d transferAmountMapper, d hintTextProvider) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(hintTextProvider, "hintTextProvider");
        this.f250857a = transferAmountMapper;
        this.f250858b = hintTextProvider;
    }

    public t(Activity activity, sri.m navigator, t0 dialogDisplayer) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        this.f250857a = activity;
        this.f250858b = dialogDisplayer;
    }

    public t(ang.f userInteractor, wtc.q0 userCountryInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCountryInteractor, "userCountryInteractor");
        this.f250857a = userInteractor;
        this.f250858b = userCountryInteractor;
    }

    public t(ImmutableMap hiddenAccountsEventsHandlers, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(hiddenAccountsEventsHandlers, "hiddenAccountsEventsHandlers");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f250857a = hiddenAccountsEventsHandlers;
        this.f250858b = hiddenAccountsInteractor;
    }

    public t(wl3.u revolutContactPaymentsSettingsInteractor, eli.j twoFaErrorHandler) {
        Intrinsics.checkNotNullParameter(revolutContactPaymentsSettingsInteractor, "revolutContactPaymentsSettingsInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        this.f250857a = revolutContactPaymentsSettingsInteractor;
        this.f250858b = twoFaErrorHandler;
    }

    public t(Context context, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f250857a = context;
        this.f250858b = uiKitResources;
    }

    public t(x0d.b configRepository, x0d.e invitationRepository) {
        Intrinsics.checkNotNullParameter(configRepository, "configRepository");
        Intrinsics.checkNotNullParameter(invitationRepository, "invitationRepository");
        this.f250857a = configRepository;
        this.f250858b = invitationRepository;
    }

    public t(z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f250857a = contextProvider;
        this.f250858b = yhm.j.b(new e58.e(this, 29));
    }

    public t(mq9.f paymentsGroupsInteractor, sr9.d requestMapper) {
        Intrinsics.checkNotNullParameter(paymentsGroupsInteractor, "paymentsGroupsInteractor");
        Intrinsics.checkNotNullParameter(requestMapper, "requestMapper");
        this.f250857a = paymentsGroupsInteractor;
        this.f250858b = requestMapper;
    }

    public t(xv5.c baseCurrencyInteractor, e56.b deFiSendRepository) {
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(deFiSendRepository, "deFiSendRepository");
        this.f250857a = baseCurrencyInteractor;
        this.f250858b = deFiSendRepository;
    }

    public t(wwa.b inviteCampaignHomeInteractor, tya.j referralItemMapper) {
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(referralItemMapper, "referralItemMapper");
        this.f250857a = inviteCampaignHomeInteractor;
        this.f250858b = referralItemMapper;
    }

    public t(xg0.a dynamicDelivery, Context context, l0i.b seonSdkModuleName) {
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(seonSdkModuleName, "seonSdkModuleName");
        this.f250857a = dynamicDelivery;
        this.f250858b = context;
    }

    public t(ybl.b tickerInteractor, blh.j searchSourceInstrumentFilter) {
        Intrinsics.checkNotNullParameter(tickerInteractor, "tickerInteractor");
        Intrinsics.checkNotNullParameter(searchSourceInstrumentFilter, "searchSourceInstrumentFilter");
        this.f250857a = tickerInteractor;
        this.f250858b = searchSourceInstrumentFilter;
    }

    public t(hj8.a juniorProfileInteractor, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f250857a = productCatalogueInteractor;
        this.f250858b = juniorProfileInteractor;
    }

    public t(f01.c uiKitResources, com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.b tabsProvider) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(tabsProvider, "tabsProvider");
        this.f250857a = uiKitResources;
        this.f250858b = tabsProvider;
    }

    public t(cl3.a contactsInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f250857a = contactsInteractor;
        this.f250858b = dateProvider;
    }

    public t(nqj.c balanceHistoryInteractor, j0 balanceIntervalProvider) {
        Intrinsics.checkNotNullParameter(balanceHistoryInteractor, "balanceHistoryInteractor");
        Intrinsics.checkNotNullParameter(balanceIntervalProvider, "balanceIntervalProvider");
        this.f250857a = balanceHistoryInteractor;
        this.f250858b = balanceIntervalProvider;
    }

    public t(iki.d... schedulers) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.f250857a = schedulers;
        p0 p0Var = p0.f264001a;
        this.f250858b = jh.d.a(zkm.o.f323119a);
    }

    public t(wsg.n walletInteractor, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f250857a = walletInteractor;
        this.f250858b = productCatalogueInteractor;
    }

    public t(w serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f250857a = serverErrorParser;
        this.f250858b = serverErrorsProvider;
    }

    public t(g3k.a paymentVendorsInteractor, cw9.d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(paymentVendorsInteractor, "paymentVendorsInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f250857a = paymentVendorsInteractor;
        this.f250858b = paymentsProductFeatureChecker;
    }

    public t(l93.f revolutCardsInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f250857a = revolutCardsInteractor;
        this.f250858b = walletInteractor;
    }

    public t(ChatDatabase chatDatabase) {
        this.f250857a = chatDatabase;
        this.f250858b = new ofg.i(this, 19);
    }

    public t() {
        this.f250857a = "";
        this.f250858b = new ArrayList();
    }

    public t(IncomeSortersDetailsController incomeSortersDetailsController, IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue) {
        this.f250857a = incomeSortersDetailsController;
        this.f250858b = incomeSorterHomeContract$DestinationValue;
    }

    public t(lki.r animatable, com.revolut.kompot.navigable.b embeddedInManager) {
        Intrinsics.checkNotNullParameter(animatable, "animatable");
        Intrinsics.checkNotNullParameter(embeddedInManager, "embeddedInManager");
        this.f250857a = animatable;
        this.f250858b = embeddedInManager;
    }
}
