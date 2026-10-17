package jid;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import aw0.o9;
import com.google.common.collect.ImmutableMap;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.javax.inject.Provider;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.onboarding.api.onboarding.OnboardingApi$Toggles;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreen;
import com.youTransactor.uCube.rpc.Constants;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Timed;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kl.g0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import nl.c0;
import nl.g1;
import nl.q0;
import om4.y1;
import qlm.r1;
import skm.p0;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements igm.o, l8.o, el.b, zp0.c, r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f174461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f174462c;

    public /* synthetic */ z(Object obj2, Object obj3, int i) {
        this.f174460a = i;
        this.f174461b = obj2;
        this.f174462c = obj3;
    }

    @Override // qlm.r1
    public KSerializer a(KClass key) {
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f174462c;
        Class clsO = nim.a.o(key);
        Object lVar = concurrentHashMap.get(clsO);
        if (lVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsO, (lVar = new qlm.l((KSerializer) ((Function1) this.f174461b).invoke(key))))) != null) {
            lVar = objPutIfAbsent;
        }
        return ((qlm.l) lVar).f247673a;
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        switch (this.f174460a) {
            case 3:
                Scheduler scheduler = (Scheduler) this.f174462c;
                TimeUnit timeUnit = (TimeUnit) this.f174461b;
                scheduler.getClass();
                return new Timed(obj2, Scheduler.a(timeUnit), timeUnit);
            case 15:
                Observable sharedUIEvents = (Observable) obj2;
                Intrinsics.checkNotNullParameter(sharedUIEvents, "sharedUIEvents");
                Observable observableCast = sharedUIEvents.filter(nl.b.f216874b).cast(ml.s.class);
                Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
                nl.e eVar = (nl.e) this.f174461b;
                g0 g0Var = (g0) this.f174462c;
                eVar.getClass();
                Observable observableCompose = observableCast.compose(new nl.a(g0Var, eVar));
                Observable observableCast2 = sharedUIEvents.filter(nl.b.f216875c).cast(ml.r.class);
                Intrinsics.checkNotNullExpressionValue(observableCast2, "cast(...)");
                return Observable.merge(observableCompose, observableCast2.compose(new nl.a(eVar, g0Var)));
            default:
                Observable sharedUIEventsStream = (Observable) obj2;
                c0 c0Var = (c0) this.f174462c;
                Intrinsics.checkNotNullParameter(sharedUIEventsStream, "sharedUIEventsStream");
                sl.x xVar = (sl.x) this.f174461b;
                if (xVar instanceof sl.p) {
                    c0Var.getClass();
                    return sharedUIEventsStream.compose(new kp0.b(c0Var, (sl.p) xVar, 17));
                }
                if (!(xVar instanceof sl.q)) {
                    return Observable.empty();
                }
                q0 q0Var = c0Var.f216894b;
                sl.q workflowTask = (sl.q) xVar;
                q0Var.getClass();
                Intrinsics.checkNotNullParameter(workflowTask, "workflowTask");
                return sharedUIEventsStream.compose(new kp0.b(q0Var, workflowTask, 18));
        }
    }

    public Clause b(wi0.b countryCode, boolean z, boolean z3, boolean z4, boolean z6, t89.g gVar) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        qa9.a aVar = (qa9.a) this.f174462c;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        if (com.bumptech.glide.d.l(countryCode)) {
            return new TextLocalisedClause(R$string.signup_registration_country_footer_au_privacy_notice, zhm.v.k(qa9.a.a(R$string.signup_input_passcode_TnC, "TERMS_LINK_ID"), qa9.a.a(R$string.signup_agreement_privacy_policy, "PRIVACY_LINK_ID"), qa9.a.a(R$string.signup_registration_country_terms_product_disclosure_statement, "product_disclosure_statement_link_id"), qa9.a.a(R$string.signup_registration_country_terms_financial_services_guide, "financial_service_guide_link_id")), null, 12);
        }
        if (com.bumptech.glide.d.n(countryCode)) {
            return new TextLocalisedClause(R$string.brazil_disclosure_footer_content_v2, zhm.v.k(qa9.a.a(R$string.brazil_disclosure_terms_and_conditions_link, "TERMS_LINK_ID"), qa9.a.a(R$string.brazil_disclosure_privacy_notice_link, "PRIVACY_LINK_ID")), null, 12);
        }
        wi0.a aVar2 = wi0.b.Companion;
        aVar2.getClass();
        if (Intrinsics.f(countryCode, wi0.b.I0)) {
            return new TextLocalisedClause(R$string.disclosure_hu_footer_agreement, zhm.v.k(qa9.a.a(R$string.disclosure_hu_footer_privacy_notice, "PRIVACY_LINK_ID"), qa9.a.a(R$string.disclosure_hu_footer_contractual_documentation, "REMOTE_ELECTRONIC_ONBOARDING_LINK_ID")), null, 12);
        }
        if (z) {
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (com.bumptech.glide.d.x(countryCode)) {
            return new TextLocalisedClause(R$string.terms_lead_disclosure_footer, zhm.v.k(qa9.a.a(R$string.lead_disclosure_revolut_privacy_policy_link, "PRIVACY_LINK_ID"), qa9.a.a(R$string.lead_disclosure_lead_bank_privacy_policy_link, "LEAD_PRIVACY_LINK_ID"), qa9.a.a(R$string.lead_disclosure_esign_consent_link, "e_sign_link_id")), null, 12);
        }
        if (com.bumptech.glide.d.u(countryCode)) {
            return new TextLocalisedClause(R$string.disclosure_mexico_footer_agreement, zhm.v.k(qa9.a.a(R$string.disclosure_mexico_footer_customerPolicy, "PRIVACY_LINK_ID"), qa9.a.a(R$string.disclosure_mexico_footer_terms_and_conditions, "GENERAL_APPLICATION_TERMS_LINK_ID")), null, 12);
        }
        if (com.bumptech.glide.d.o(countryCode)) {
            return new TextLocalisedClause(R$string.disclosure_colombia_footer_text, zhm.v.k(qa9.a.a(R$string.disclosure_colombia_footer_link_data_privacy_policy, "PRIVACY_LINK_ID"), qa9.a.a(R$string.disclosure_colombia_footer_link_data_processing_policy, "COLOMBIA_DATA_PROCESSING_POLICY_LINK_ID")), null, 12);
        }
        aVar2.getClass();
        if (Intrinsics.f(countryCode, wi0.b.f297765o2)) {
            return qa9.a.b("WEBSITE_TERMS_LINK_ID");
        }
        if (com.bumptech.glide.d.k(countryCode)) {
            return new TextLocalisedClause(R$string.signup_registration_country_footer_uae, zhm.v.k(qa9.a.a(R$string.signup_registration_country_title_terms, "TERMS_LINK_ID"), qa9.a.a(R$string.terms_link_privacy_policy, "PRIVACY_LINK_ID")), null, 12);
        }
        if (com.bumptech.glide.d.v(countryCode)) {
            return new TextLocalisedClause(R$string.signup_registration_country_footer_sg, zhm.v.k(qa9.a.a(R$string.signup_registration_country_title_terms, "TERMS_LINK_ID"), qa9.a.a(R$string.terms_link_privacy_policy, "PRIVACY_LINK_ID")), null, 12);
        }
        if (com.bumptech.glide.d.t(countryCode)) {
            return new TextLocalisedClause(R$string.signup_registration_country_footer_jp_language_disclaimer, zhm.v.k(qa9.a.a(R$string.signup_input_passcode_TnC, "TERMS_LINK_ID"), qa9.a.a(R$string.signup_agreement_privacy_policy, "PRIVACY_LINK_ID")), null, 12);
        }
        aVar2.getClass();
        if (Intrinsics.f(countryCode, wi0.b.y2) && ((jte.d) aVar.f243977a).c(OnboardingApi$Toggles.SpecificPortugalDisclosure.f78184c)) {
            return new TextLocalisedClause(R$string.disclosure_pt_footer_agreement, zhm.v.k(qa9.a.a(R$string.disclosure_pt_footer_customer_privacy_notice, "PRIVACY_LINK_ID"), qa9.a.a(R$string.disclosure_pt_footer_contractual_documentation, "CONTRACTUAL_DOCUMENTATION_LINK_ID")), null, 12);
        }
        if (gVar == t89.g.REVOLUT_BANK_UK_LTD) {
            return new TextLocalisedClause(R$string.disclosure_uk_footer_agreement, zhm.u.c(qa9.a.a(R$string.disclosure_uk_footer_privacy_policy, "PRIVACY_LINK_ID")), null, 12);
        }
        if (com.bumptech.glide.d.w(countryCode)) {
            return new TextLocalisedClause(R$string.signup_registration_country_footer_ua_privacy_notice, zhm.u.c(qa9.a.a(R$string.signup_registration_country_footer_privacy_notice_here, "PRIVACY_LINK_ID")), null, 12);
        }
        aVar2.getClass();
        if (Intrinsics.f(countryCode, wi0.b.W)) {
            return new TextLocalisedClause(R$string.signup_registration_country_footer_de_privacy_notice, zhm.u.c(qa9.a.a(R$string.signup_registration_country_footer_privacy_notice_here, "PRIVACY_LINK_ID")), null, 12);
        }
        aVar2.getClass();
        return Intrinsics.f(countryCode, wi0.b.D2) ? new TextLocalisedClause(R$string.signup_registration_country_footer_ro_privacy_notice, zhm.u.c(qa9.a.a(R$string.signup_registration_country_footer_ro_links_privacy_notice, "PRIVACY_LINK_ID")), null, 12) : (z6 && com.bumptech.glide.d.s(countryCode)) ? new TextLocalisedClause(R$string.terms_footer_description, null, null, 14) : z3 ? new TextLocalisedClause(R$string.signup_registration_country_footer_checkbox, zhm.v.k(qa9.a.a(R$string.signup_input_passcode_TnC, "TERMS_LINK_ID"), qa9.a.a(R$string.signup_agreement_privacy_policy, "PRIVACY_LINK_ID")), null, 12) : z4 ? new TextLocalisedClause(R$string.signup_registration_country_footer_privacy_notice, zhm.u.c(qa9.a.a(R$string.signup_registration_country_footer_privacy_notice_here, "PRIVACY_LINK_ID")), null, 12) : qa9.a.b("TERMS_LINK_ID");
    }

    public ArrayList c(wi0.b countryCode, t89.c creditTerms, boolean z, boolean z3, boolean z4) {
        List listC;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditTerms, "creditTerms");
        qa9.p pVar = (qa9.p) this.f174461b;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditTerms, "creditTerms");
        kbb.c cVar = pVar.f243998b;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditTerms, "creditTerms");
        boolean z6 = creditTerms.f268862a;
        t89.b bVar = creditTerms.f268863b;
        sa9.d aVar = (z6 && bVar == t89.b.PCW) ? (onh.b) cVar.f182549b : (z6 && bVar == t89.b.OPEN_MARKET) ? (p56.a) cVar.f182550c : (z4 && com.bumptech.glide.d.s(countryCode)) ? (sa9.b) cVar.d : new sa9.a();
        if (z6 || z4) {
            listC = null;
        } else {
            int i = z ? R$attr.uikit_dp0 : R$attr.uikit_dp8;
            InputTextDelegate.Model model = new InputTextDelegate.Model("country_selector_id", new TextClause(((o8b.g) pVar.f243997a).a(countryCode.f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, null, false, false, 0, false, 0, false, false, false, null, false, false, 0, false, false, null, -151142540, 131071);
            yp0.b.l(model, 0, i, 0, 0, null, false, 61);
            listC = zhm.u.c(yp0.r.a(model));
        }
        List[] elements = {listC, aVar.b(), z ? aVar.c(z3) : null, aVar.d()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.w.u(kotlin.collections.d.L(elements));
    }

    public efm.r d(List pockets) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        return nim.a.w(rd0.e.c(o(), p0.f264003c), new q2j.j(pockets, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(com.revolut.feature.slot_manager.api.model.SlotContext r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rmg.e
            if (r0 == 0) goto L13
            r0 = r6
            rmg.e r0 = (rmg.e) r0
            int r1 = r0.f255317w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255317w = r1
            goto L18
        L13:
            rmg.e r0 = new rmg.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255317w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f174461b
            skd.i r6 = (skd.i) r6
            akg.n r5 = r6.b(r5)
            q87.q r6 = new q87.q
            r2 = 4
            r6.<init>(r5, r2)
            r0.f255317w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r5 = r6.getContent()
            java.util.List r5 = (java.util.List) r5
            r6 = 0
            if (r5 == 0) goto L72
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L5a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r5.next()
            boolean r1 = r0 instanceof com.revolut.feature.slot_manager.api.model.prompt.SlotFincrimeChecklistPrompt
            if (r1 == 0) goto L5a
            goto L6a
        L69:
            r0 = r6
        L6a:
            boolean r5 = r0 instanceof com.revolut.feature.slot_manager.api.model.prompt.SlotFincrimeChecklistPrompt
            if (r5 != 0) goto L6f
            goto L70
        L6f:
            r6 = r0
        L70:
            com.revolut.feature.slot_manager.api.model.prompt.SlotFincrimeChecklistPrompt r6 = (com.revolut.feature.slot_manager.api.model.prompt.SlotFincrimeChecklistPrompt) r6
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jid.z.e(com.revolut.feature.slot_manager.api.model.SlotContext, gim.c):java.lang.Object");
    }

    @Override // l8.o
    public void f(Bitmap bitmap, f8.a aVar) throws IOException {
        IOException iOException = ((y8.e) this.f174462c).f311598b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            aVar.a(bitmap);
            throw iOException;
        }
    }

    @Override // l8.o
    public void g() {
        l8.x xVar = (l8.x) this.f174461b;
        synchronized (xVar) {
            xVar.f192759c = xVar.f192757a.length;
        }
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        return new g1((Navigator) ((Provider) this.f174461b).get(), (sl.f) ((Provider) this.f174462c).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(android.content.Context r8, com.revolut.core.ui_kit_core.displayers.image.Image r9, int r10, int r11, gim.c r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof k01.j
            if (r0 == 0) goto L14
            r0 = r12
            k01.j r0 = (k01.j) r0
            int r1 = r0.f179907y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f179907y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            k01.j r0 = new k01.j
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f179905w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f179907y
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            int r11 = r6.v
            int r10 = r6.u
            yhm.o.b(r12)
            r2 = r10
            r3 = r11
            goto L53
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r12)
            java.lang.Object r12 = r7.f174462c
            k01.l r12 = (k01.l) r12
            yy0.f r1 = r12.f179913c
            r6.u = r10
            r6.v = r11
            r6.f179907y = r2
            r3 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = ofm.q.J(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L51
            return r0
        L51:
            r2 = r4
            r3 = r5
        L53:
            r1 = r12
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r5 = 4
            r6 = 0
            r4 = 0
            android.graphics.Bitmap r8 = androidx.core.graphics.drawable.DrawableKt.toBitmap$default(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jid.z.h(android.content.Context, com.revolut.core.ui_kit_core.displayers.image.Image, int, int, gim.c):java.lang.Object");
    }

    public Set i() {
        Set setI1;
        List list = (List) kii.e.n("HIDDEN_DELISTED_POCKETS", (mk0.a) this.f174462c);
        return (list == null || (setI1 = d0.i1(list)) == null) ? h0.f322473a : setI1;
    }

    public efm.d0 j(AccountId accountId) {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.d0 d0VarFirstOrError = m70.a.g(zi0.c.J(rd0.e.c(n(accountId), kotlin.coroutines.g.f186406a)), null, new rd3.k(16), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        oul.m mVarE3 = ((TargetPriceScreen) this.f174461b).d();
        oul.i parcel = (oul.i) this.f174462c;
        com.revolut.trading.orders.ui.invest.placement.target_price.b bVar = (com.revolut.trading.orders.ui.invest.placement.target_price.b) mVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        bVar.H2(bVar.getState(), new ard.t(bVar, formattedValue, z, parcel, 22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        if (r1 == r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(java.lang.String r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jid.z.l(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r4.i(r2, r8, r5, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof rmg.f
            if (r0 == 0) goto L13
            r0 = r8
            rmg.f r0 = (rmg.f) r0
            int r1 = r0.f255319x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255319x = r1
            goto L18
        L13:
            rmg.f r0 = new rmg.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255319x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L64
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            com.revolut.feature.slot_manager.api.model.SlotContext r2 = r0.u
            yhm.o.b(r8)
            goto L4e
        L38:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.f174462c
            om4.d0 r8 = (om4.d0) r8
            com.revolut.feature.slot_manager.api.model.SlotContext r2 = r8.h()
            r0.u = r2
            r0.f255319x = r4
            java.lang.Object r8 = r7.e(r2, r0)
            if (r8 != r1) goto L4e
            goto L63
        L4e:
            com.revolut.feature.slot_manager.api.model.prompt.SlotFincrimeChecklistPrompt r8 = (com.revolut.feature.slot_manager.api.model.prompt.SlotFincrimeChecklistPrompt) r8
            if (r8 == 0) goto L67
            java.lang.Object r4 = r7.f174461b
            skd.i r4 = (skd.i) r4
            akd.a r5 = akd.a.VIEW
            r6 = 0
            r0.u = r6
            r0.f255319x = r3
            java.lang.Object r8 = r4.i(r2, r8, r5, r0)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L67:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jid.z.m(gim.c):java.lang.Object");
    }

    public akg.n n(AccountId accountId) {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.v(u0.m(rd0.e.b(osg.b.c((wsg.n) this.f174461b, loadingStrategy, y0.b(io3.k.DELISTED), null, io3.i.INTERNAL, accountId, 4)), o()), new rd3.m(17));
    }

    public ahe.i o() {
        return new ahe.i(new vkm.y(new r83.g(this, null, 13), ((mk0.a) this.f174462c).j(new tk0.e("HIDDEN_DELISTED_POCKETS"))), 14);
    }

    public Flow p(Set transactionIds) {
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        if (transactionIds.isEmpty()) {
            return zi0.c.i(pr4.f.f238932a);
        }
        return xam.a.h(new y1(this, transactionIds, null), ((om4.c0) ((al4.e) this.f174462c)).f226538b.a());
    }

    public akg.n q(LocalDate startDate, LocalDate endDate, Set set) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        vkm.d dVarB = rd0.e.b(((wsg.n) this.f174462c).J(AccountId.Personal.f51414a, w4l.h.f294642c));
        oia.a aVar = (oia.a) ((hia.a) this.f174461b);
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        lia.d dVar = aVar.f225590a;
        kia.a aVar2 = kia.a.DAY;
        String id10 = ZoneId.systemDefault().getId();
        Intrinsics.checkNotNullExpressionValue(id10, "getId(...)");
        return nim.a.v(u0.m(dVarB, ((lia.f) dVar).a(new kia.b(startDate, endDate, aVar2, id10, set), loadingStrategy)), new knd.a(this, 7));
    }

    public efm.r r(String str, String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        oid.e eVar = (oid.e) this.f174462c;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return nim.a.w(eVar.d.e(new oid.a(str), w4l.h.f294642c), new o23.l(placementId, 19));
    }

    public SpannableStringBuilder s(Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        k01.l lVar = (k01.l) this.f174462c;
        return ty0.c.a(lVar.f179912b, clause, lVar.f179911a, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
    }

    public Flow t(z3d.d plainWatchlist, Integer num, String orderingKey, boolean z, ogd.k sortingCriteria) {
        Intrinsics.checkNotNullParameter(plainWatchlist, "plainWatchlist");
        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
        Intrinsics.checkNotNullParameter(sortingCriteria, "sortingCriteria");
        if (!plainWatchlist.f319252c.isEmpty()) {
            return boh.f.e(nim.a.v(((kl.c0) this.f174461b).f(plainWatchlist.f319252c), new l3d.d(this, plainWatchlist, 0)), new ael.s(this, sortingCriteria, z || sortingCriteria.f225123a == ogd.m.PRICE_CHANGE, orderingKey, num, 6));
        }
        return new go.g(new Data(new Watchlist(f0.f322471a, plainWatchlist.d, plainWatchlist.f319250a, plainWatchlist.f319251b), null, false, 6, null), 2);
    }

    public pfm.h u(io3.d pocket, boolean z) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        return pd.b.n(kotlin.coroutines.g.f186406a, new l10.m(this, z, pocket, (Continuation) null, 15));
    }

    public z(lp5.c defaultDestinationTagValidator, ImmutableMap validators) {
        this.f174460a = 8;
        Intrinsics.checkNotNullParameter(defaultDestinationTagValidator, "defaultDestinationTagValidator");
        Intrinsics.checkNotNullParameter(validators, "validators");
        this.f174461b = defaultDestinationTagValidator;
        this.f174462c = validators;
    }

    public z(z58.c revPointsPillProvider, z58.c postOnboardingPersonalisationProvider) {
        this.f174460a = 9;
        Intrinsics.checkNotNullParameter(revPointsPillProvider, "revPointsPillProvider");
        Intrinsics.checkNotNullParameter(postOnboardingPersonalisationProvider, "postOnboardingPersonalisationProvider");
        this.f174461b = revPointsPillProvider;
        this.f174462c = postOnboardingPersonalisationProvider;
    }

    public z(kdh.b instrumentActionsInteractor, d4h.b actionsToActionPanelStateMapper) {
        this.f174460a = 10;
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(actionsToActionPanelStateMapper, "actionsToActionPanelStateMapper");
        this.f174461b = instrumentActionsInteractor;
        this.f174462c = actionsToActionPanelStateMapper;
    }

    public z(dsl.a analyticsProvider, ogm.i marketPriceBuilder) {
        this.f174460a = 26;
        Intrinsics.checkNotNullParameter(analyticsProvider, "analyticsProvider");
        Intrinsics.checkNotNullParameter(marketPriceBuilder, "marketPriceBuilder");
        this.f174461b = analyticsProvider;
        this.f174462c = marketPriceBuilder;
    }

    public z(oid.e shopsSearchRepository, oid.e shopsSearchLayoutRepository) {
        this.f174460a = 0;
        Intrinsics.checkNotNullParameter(shopsSearchRepository, "shopsSearchRepository");
        Intrinsics.checkNotNullParameter(shopsSearchLayoutRepository, "shopsSearchLayoutRepository");
        this.f174461b = shopsSearchRepository;
        this.f174462c = shopsSearchLayoutRepository;
    }

    public z(qa9.p countryScreenItemsProvider, qa9.a disclaimerProvider) {
        this.f174460a = 24;
        Intrinsics.checkNotNullParameter(countryScreenItemsProvider, "countryScreenItemsProvider");
        Intrinsics.checkNotNullParameter(disclaimerProvider, "disclaimerProvider");
        this.f174461b = countryScreenItemsProvider;
        this.f174462c = disclaimerProvider;
    }

    public z(ffk.t pricingPlanInteractor, hy2.f cardDesignInteractor) {
        this.f174460a = 13;
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        this.f174461b = pricingPlanInteractor;
        this.f174462c = cardDesignInteractor;
    }

    public z(r2d.s mapper, r2d.p presentationModel) {
        this.f174460a = 27;
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f174461b = mapper;
        this.f174462c = presentationModel;
    }

    public z(ppf.c transferAmountMapper, gte.a featureToggleInteractor) {
        this.f174460a = 23;
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f174461b = transferAmountMapper;
        this.f174462c = featureToggleInteractor;
    }

    public z(skd.i slotManagerInteractor, om4.d0 mainApplicationSlotContextProvider) {
        this.f174460a = 29;
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(mainApplicationSlotContextProvider, "mainApplicationSlotContextProvider");
        this.f174461b = slotManagerInteractor;
        this.f174462c = mainApplicationSlotContextProvider;
    }

    public z(tbk.b planGiftingAvailabilityInteractor, y21.c optOutRepository) {
        this.f174460a = 19;
        Intrinsics.checkNotNullParameter(planGiftingAvailabilityInteractor, "planGiftingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.f174461b = planGiftingAvailabilityInteractor;
        this.f174462c = optOutRepository;
    }

    public z(yce.a hourOfDayProvider, ang.f userInteractor) {
        this.f174460a = 7;
        Intrinsics.checkNotNullParameter(hourOfDayProvider, "hourOfDayProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f174461b = hourOfDayProvider;
        this.f174462c = userInteractor;
    }

    public z(j9k.z flowInteractor, j9k.c0 quoteInteractor) {
        this.f174460a = 14;
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        this.f174461b = flowInteractor;
        this.f174462c = quoteInteractor;
    }

    public z(lu5.r transactionsFiltersProvider, whf.b transactionsContentProvider) {
        this.f174460a = 18;
        Intrinsics.checkNotNullParameter(transactionsFiltersProvider, "transactionsFiltersProvider");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f174461b = transactionsFiltersProvider;
        this.f174462c = transactionsContentProvider;
    }

    public z(h30.q amountScreenRepository, mp.p streetModePaymentLocationInteractor) {
        this.f174460a = 1;
        Intrinsics.checkNotNullParameter(amountScreenRepository, "amountScreenRepository");
        Intrinsics.checkNotNullParameter(streetModePaymentLocationInteractor, "streetModePaymentLocationInteractor");
        this.f174461b = amountScreenRepository;
        this.f174462c = streetModePaymentLocationInteractor;
    }

    public z(usc.a freeStocksInteractor, vrl.c investOrderInteractor) {
        this.f174460a = 12;
        Intrinsics.checkNotNullParameter(freeStocksInteractor, "freeStocksInteractor");
        Intrinsics.checkNotNullParameter(investOrderInteractor, "investOrderInteractor");
        this.f174461b = freeStocksInteractor;
        this.f174462c = investOrderInteractor;
    }

    public z(l3d.h0 watchlistInteractor, l3d.r multipleWatchlistInteractor) {
        this.f174460a = 22;
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(multipleWatchlistInteractor, "multipleWatchlistInteractor");
        this.f174461b = watchlistInteractor;
        this.f174462c = multipleWatchlistInteractor;
    }

    public z(hia.a proAnalyticsInteractor, wsg.n walletInteractor) {
        this.f174460a = 4;
        Intrinsics.checkNotNullParameter(proAnalyticsInteractor, "proAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f174461b = proAnalyticsInteractor;
        this.f174462c = walletInteractor;
    }

    public z(whf.b transactionItemsProvider, al4.e creditCardDebitToInstalmentInteractor) {
        this.f174460a = 20;
        Intrinsics.checkNotNullParameter(transactionItemsProvider, "transactionItemsProvider");
        Intrinsics.checkNotNullParameter(creditCardDebitToInstalmentInteractor, "creditCardDebitToInstalmentInteractor");
        this.f174461b = transactionItemsProvider;
        this.f174462c = creditCardDebitToInstalmentInteractor;
    }

    public z(wsg.n walletInteractor, mk0.a personalisationStorage) {
        this.f174460a = 28;
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f174461b = walletInteractor;
        this.f174462c = personalisationStorage;
        Intrinsics.checkNotNullParameter("HIDDEN_DELISTED_POCKETS", "id");
    }

    public z(k01.l lVar, CoroutineScope scope) {
        this.f174460a = 2;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f174462c = lVar;
        this.f174461b = scope;
    }

    public z(Function1 compute) {
        this.f174460a = 25;
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f174461b = compute;
        this.f174462c = new ConcurrentHashMap();
    }

    public z(kl.c0 detailsFetcher, l3d.c itemCreator, kgm.i sorter) {
        this.f174460a = 5;
        Intrinsics.checkNotNullParameter(detailsFetcher, "detailsFetcher");
        Intrinsics.checkNotNullParameter(itemCreator, "itemCreator");
        Intrinsics.checkNotNullParameter(sorter, "sorter");
        this.f174461b = detailsFetcher;
        this.f174462c = sorter;
    }

    public z() {
        this.f174460a = 11;
        this.f174461b = new AtomicLong();
        this.f174462c = new AtomicLong();
    }
}
