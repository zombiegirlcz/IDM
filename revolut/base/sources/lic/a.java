package lic;

import aw0.o9;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.co_borrower.consent.CoBorrowerActiveApplicationException;
import com.revolut.feature.rewards.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.m0;
import nii.u0;
import nii.z;
import ot1.b0;
import p0l.v;
import retrofit2.HttpException;
import wp4.i0;
import zhm.h0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f195446b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f195445a = i;
        this.f195446b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nii.p1
    public final m0 a(Object obj2) throws Throwable {
        z zVar;
        int i = this.f195445a;
        Integer numValueOf = null;
        Object obj3 = this.f195446b;
        switch (i) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Set setB = y0.b(new Pair("ExternalRegistrationActionHandler", "registerExternal"));
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, setB);
                ServerError serverErrorA = ((g) obj3).o.a(throwable);
                Integer numValueOf2 = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                if (numValueOf2 != null && numValueOf2.intValue() == 74501) {
                    zVar = new z(new TextLocalisedClause(R$string.perks_fetch_external_registration_details_error_title, null, null, 14), null, new TextLocalisedClause(R$string.perks_fetch_external_registration_details_error_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
                } else {
                    if (numValueOf2 != null && numValueOf2.intValue() == 74500) {
                        return null;
                    }
                    zVar = new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
                }
                return zVar;
            case 1:
                ((ljc.r) obj3).f195645s.getClass();
                return new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_state_error_title_generic, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502);
            case 2:
                m64.k kVar = (m64.k) obj3;
                if (!(((Throwable) obj2) instanceof CoBorrowerActiveApplicationException)) {
                    return null;
                }
                iu3.c cVar = kVar.o.f67228c.d;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_request_consent_error_title, u.c(new TextClause(cVar.f168461a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_request_consent_error_description, u.c(new TextClause(cVar.f168462b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_request_consent_error_primary_button, u.c(new TextClause(cVar.f168463c.f168459a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                iu3.b bVar = cVar.d;
                return new z(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, bVar != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.co_borrower_consent_initiator_request_consent_error_secondary_button, u.c(new TextClause(bVar.f168459a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, null, null, false, null, null, null, null, null, null, 32724);
            case 3:
                return (z) ((mfl.o) obj3).f205037s.getValue();
            case 4:
                ((com.revolut.feature.wealth_protection.sso.impl.ui.a) obj3).f96324y.getClass();
                return new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 5:
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var);
                ((com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.a) obj3).f69446q.getClass();
                return vt4.b.a();
            case 6:
                ((com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) obj3).u.getClass();
                return new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 7:
                b0 b0Var = (b0) obj3;
                Throwable throwable2 = (Throwable) obj2;
                qt1.n nVar = b0Var.u;
                e7l.c cVar2 = b0Var.y2().f229397c;
                com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.c cVar3 = (com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.c) nVar;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                oi0.d.I(cVar3.q2(), false, false);
                return cVar3.f61644m.a(throwable2, cVar2);
            case 8:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((o0l.b) ((v) obj3).f231574t).a().f216244b;
            case 9:
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar2 = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) obj3;
                ServerError serverErrorA2 = bVar2.z.a((Throwable) obj2);
                if (serverErrorA2 == null || serverErrorA2.f51362a != 1217) {
                    return null;
                }
                return new l0(new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_terminate_mcy_error_title, null, null, 14), ((Boolean) bVar2.D.getValue()).booleanValue() ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_terminate_mcy_error_description_extended, null, null, 14) : new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_terminate_mcy_error_description, null, null, 14), null, null, null, null, false, null, 1020);
            case 10:
                Throwable throwable3 = (Throwable) obj2;
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable3, h0Var2);
                usa.h hVar = ((qsa.u) obj3).u;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(throwable3, "error");
                kbb.c cVar4 = hVar.f282860m;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(throwable3, "throwable");
                ServerError serverErrorA3 = ((sf0.h) cVar4.d).a(throwable3);
                nii.y0 y0VarA = serverErrorA3 != null ? ((sw8.a) cVar4.f182550c).a(serverErrorA3.f51362a) : null;
                if (y0VarA != null) {
                    return y0VarA.f216244b;
                }
                return null;
            case 11:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((qvh.g) obj3).f249704q.getClass();
                return qvh.h.a();
            case 12:
                com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar = (com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) obj3;
                Throwable throwable4 = (Throwable) obj2;
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable4, h0Var3);
                uu4.b bVar3 = aVar.f69624x;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(throwable4, "throwable");
                boolean z = throwable4 instanceof HttpException;
                Integer numValueOf3 = z ? Integer.valueOf(((HttpException) throwable4).code()) : throwable4 instanceof ServerErrorException ? Integer.valueOf(((ServerErrorException) throwable4).e) : null;
                if (numValueOf3 != null && numValueOf3.intValue() == 422) {
                    if (z) {
                        ServerError serverErrorC = bVar3.f283133a.c((HttpException) throwable4);
                        if (serverErrorC != null) {
                            numValueOf = Integer.valueOf(serverErrorC.f51362a);
                        }
                    } else if (throwable4 instanceof ServerErrorException) {
                        numValueOf = Integer.valueOf(((ServerErrorException) throwable4).f.f51362a);
                    }
                    if (numValueOf != null && numValueOf.intValue() == 42000) {
                        aVar.v.a("credit_card_repay_payment_idempotency_key_tag");
                    }
                }
                aVar.f69623w.getClass();
                return vt4.b.a();
            case 13:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b) obj3).f90797q.getClass();
                return new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 14:
                Throwable throwable5 = (Throwable) obj2;
                nh9.f fVar = (nh9.f) ((th9.v) obj3).f271354s;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(throwable5, "throwable");
                oi0.d.I(fVar.q2(), false, false);
                return fVar.f215389l.a(throwable5);
            case 15:
                ((tic.d) obj3).f271477p.getClass();
                return new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_state_error_title_generic, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502);
            case 16:
                Throwable throwable6 = (Throwable) obj2;
                t82.g gVar = ((u82.m) obj3).f278091p;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(throwable6, "throwable");
                return gVar.f268810a.e(throwable6);
            case 17:
                ((udi.b) ((com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b) obj3).f97814p).getClass();
                return new z(new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_common_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_common_error_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 18:
                return ((uek.m) obj3).f279483s.c((Throwable) obj2);
            case 19:
                je6.d dVarA = ((ug6.b) ((ug6.v) obj3).v).a((Throwable) obj2);
                if (dVarA instanceof je6.b) {
                    return ((je6.b) dVarA).f173231a;
                }
                if (dVarA instanceof je6.c) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "EsimGiftRecipientSelectionScreenModel", null, (Throwable) obj2, h0Var4);
                ((com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) obj3).f100970p.getClass();
                return new z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, u0.SOFT_FAIL, null, null, 28668);
            case 21:
                uic.d dVar = (uic.d) obj3;
                sf0.h hVar2 = dVar.f280376s;
                uic.e eVar = dVar.f280374q;
                ServerError serverErrorA4 = hVar2.a((Throwable) obj2);
                Integer numValueOf4 = serverErrorA4 != null ? Integer.valueOf(serverErrorA4.f51362a) : null;
                if (numValueOf4 != null && numValueOf4.intValue() == 10005003) {
                    eVar.getClass();
                    return new z(new TextLocalisedClause(R$string.perks_access_offer_expired_title, null, null, 14), new TextLocalisedClause(R$string.perks_access_offer_expired_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500);
                }
                eVar.getClass();
                return new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_state_error_title_generic, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502);
            case 22:
                com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c cVar5 = (com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.c) obj3;
                Throwable th10 = (Throwable) obj2;
                ServerError serverErrorA5 = cVar5.f69091r.a(th10);
                if (serverErrorA5 != null && serverErrorA5.f51362a == 9401) {
                    throw th10;
                }
                h0 h0Var5 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var5);
                cVar5.f69090q.getClass();
                return vt4.b.a();
            case 23:
                return (m0) obj3;
            case 24:
                h0 h0Var6 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var6);
                ((com.revolut.feature.credit.card.impl.ui.instalment.create.b) obj3).f69342p.getClass();
                return vt4.b.a();
            case 25:
                i0 i0Var = (i0) obj3;
                Throwable th11 = (Throwable) obj2;
                ServerError serverErrorA6 = i0Var.z.a(th11);
                if (serverErrorA6 != null && serverErrorA6.f51362a == 9401) {
                    throw th11;
                }
                h0 h0Var7 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList8 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var7);
                i0Var.v.getClass();
                return vt4.b.a();
            case 26:
                wqf.d dVar2 = (wqf.d) obj3;
                dVar2.v = true;
                j60.a.v(dVar2.f299449q, false, null, 3);
                dVar2.f299452t.getClass();
                return new z(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_error_something_went_wrong, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 27:
                ((xdi.u) obj3).f304474t.getClass();
                return new z(new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_common_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_onboarding_error_dialog_description, null, null, 14), new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_onboarding_error_dialog_button_title, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            case 28:
                h0 h0Var8 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList9 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var8);
                ((com.revolut.feature.credit.card.impl.ui.instalment.repay.details.c) obj3).f69490q.getClass();
                return vt4.b.a();
            default:
                return ((rud.b) ((com.revolut.feature.staking.impl.unstake.v2.a) obj3).f88166t).a((Throwable) obj2);
        }
    }
}
