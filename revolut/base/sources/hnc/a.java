package hnc;

import a0.d;
import android.os.Parcelable;
import aw0.k7;
import aw0.ka;
import aw0.o9;
import c93.e;
import cli.j;
import cli.n;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.delegates.kf;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lf;
import com.revolut.core.ui_kit.delegates.mf;
import com.revolut.core.ui_kit.delegates.mj;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.EarnAssetsRootScreenContract$Step;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.learn.shared.impl.ui.course.overview.c;
import com.revolut.feature.learn.shared.impl.ui.course.overview.f;
import com.revolut.feature.learn.shared.models.domain.LearnReward;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.TaxPeriod;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature.travel.flights.models.domain.location.LocationSearchResult;
import com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.youTransactor.uCube.rpc.Constants;
import hwf.h;
import hz2.p;
import i09.i;
import i09.m;
import i0e.a0;
import i0e.b0;
import i0e.c0;
import i0e.e0;
import i0e.r;
import i0e.t;
import i0e.x;
import i0e.z;
import i2h.k;
import i2l.t0;
import i6j.s;
import ip0.a10;
import ip0.c10;
import ip0.pb0;
import ip0.qd0;
import ip0.re;
import ip0.te;
import ip0.ue;
import ip0.zj;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jel.p1;
import jel.q1;
import jel.r1;
import jel.t1;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import nvf.c;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import thf.g;
import tof.a3;
import u09.o;
import u09.q;
import u09.y;
import yp0.b;
import z0h.i0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zm3.l;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f154088b;

    public /* synthetic */ a(int i, j jVar, n nVar) {
        this.f154087a = i;
        this.f154088b = jVar;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        c cVar = ((h) this.f154088b).f156173a;
        List<PurchasedTransitTicket> content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayList = new ArrayList();
        for (PurchasedTransitTicket purchasedTransitTicket : content) {
            RowDelegate.Model modelA = purchasedTransitTicket instanceof PurchasedTransitTicket.Expired ? cVar.a((PurchasedTransitTicket.Expired) purchasedTransitTicket) : purchasedTransitTicket instanceof PurchasedTransitTicket.NotPurchased ? cVar.b((PurchasedTransitTicket.NotPurchased) purchasedTransitTicket) : null;
            if (modelA != null) {
                arrayList.add(modelA);
            }
        }
        b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        List listE0;
        hz2.b bVar = (hz2.b) this.f154088b;
        List termsList = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(termsList, "termsList");
        e eVar = bVar.f156986a.f64815b;
        if (termsList.isEmpty()) {
            listE0 = hz2.b.a();
        } else {
            List<Terms> list = termsList;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (Terms terms : list) {
                String str = terms.f90355a;
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                TermsScope termsScope = terms.f;
                TermsScope.INSTANCE.getClass();
                TermsScope termsScope2 = TermsScope.f90379r0;
                int i = (!Intrinsics.f(termsScope, termsScope2) && Intrinsics.f(termsScope, TermsScope.f90381s0)) ? R$drawable.uikit_icn_24_info_outline : R$drawable.uikit_icn_24_card_check;
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(companion.i(i, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), null, null, false, null, false, 62);
                TextLocalisedClause textLocalisedClause = (!Intrinsics.f(termsScope, termsScope2) && Intrinsics.f(termsScope, TermsScope.f90381s0)) ? new TextLocalisedClause(R$string.card_issuance_terms_information_button, null, null, 14) : new TextLocalisedClause(R$string.card_issuance_terms_agreement_button, null, null, 14);
                arrayList.add(new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), true, null, false, null, null, null, null, null, null, terms, null, 0, 0, 0, 0, 532673528));
            }
            b.k(arrayList, 0, 0, 0, 0, 31);
            ArrayList arrayListF0 = d0.F0(new ListSubheaderDelegate.Model("ADDITIONAL_INFO_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.card_issuance_terms_additional_info_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), arrayList);
            ArrayList arrayList2 = new ArrayList();
            if (eVar == e.DISPOSABLE) {
                arrayList2.add(new RowDelegate.Model(String.valueOf(R$string.card_issuance_terms_additional_info_disposable_regenerates), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.card_issuance_terms_additional_info_disposable_regenerates, u.c(new TextLocalisedClause(R$string.card_issuance_terms_additional_info_learn_more, null, new Click(30, (Integer) null, (Object) null, "DISPOSABLE_CARD_LEARN_MORE_BUTTON_TAG", false), 10)), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            }
            Iterator it8 = v.k(Integer.valueOf(R$string.card_issuance_terms_additional_info_debit_immediately), Integer.valueOf(R$string.card_issuance_terms_additional_info_no_hidden_fees), Integer.valueOf(R$string.card_issuance_terms_additional_info_terminate_anytime)).iterator();
            while (it8.hasNext()) {
                int iIntValue = ((Number) it8.next()).intValue();
                arrayList2.add(new RowDelegate.Model(String.valueOf(iIntValue), new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(iIntValue, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            }
            b.k(arrayList2, 0, 0, 0, 0, 31);
            listE0 = d0.E0(arrayList2, arrayListF0);
        }
        return new p(listE0, !termsList.isEmpty());
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model model;
        i08.h hVar = (i08.h) this.f154088b;
        List documents = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(documents, "docs");
        hVar.f157318n.getClass();
        Intrinsics.checkNotNullParameter(documents, "documents");
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : documents) {
            if (obj5 instanceof PolicyDocument.Pdf) {
                arrayList.add(obj5);
            }
        }
        s0 s0Var = new s0(2);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : arrayList) {
            if (((PolicyDocument.Pdf) obj6).f == null) {
                arrayList2.add(obj6);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        int i = 0;
        for (Object obj7 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            PolicyDocument.Pdf pdf2 = (PolicyDocument.Pdf) obj7;
            arrayList3.add(new RowDelegate.Model(d.n("DOCUMENT_HISTORY_ACTIVE_DOC_ROW_ID_PREFIX_", i), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_document, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, pdf2.f76270a, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_all_documents_status_active, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, false, null, null, null, null, null, pdf2, null, 0, 0, 0, 0, 1056958316));
            i = i2;
        }
        b.k(arrayList3, 0, 0, 0, 0, 31);
        s0Var.b((koi.j[]) arrayList3.toArray(new RowDelegate.Model[0]));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj8 : arrayList) {
            if (((PolicyDocument.Pdf) obj8).f != null) {
                arrayList4.add(obj8);
            }
        }
        s0 s0Var2 = new s0(2);
        s0Var2.a(!arrayList4.isEmpty() ? new ListSubheaderDelegate.Model("DOCUMENT_HISTORY_NOT_ACTIVE_DOC_HEADER_ITEM", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_all_documents_statement_insurance_sections_history_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530) : null);
        ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
        int i3 = 0;
        for (Object obj9 : arrayList4) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            PolicyDocument.Pdf pdf3 = (PolicyDocument.Pdf) obj9;
            if (pdf3.f != null) {
                String strN = d.n("DOCUMENT_HISTORY_NOT_ACTIVE_DOC_ROW_ID_PREFIX_", i3);
                LayeredImage layeredImageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_document, R$attr.uikit_colorGreyTone20, R$attr.uikit_colorGreyTone20_10);
                Clause clause = pdf3.f76270a;
                int i6 = com.revolut.feature.insurance_pet.impl.R$string.pets_all_documents_expiration_date;
                long jB = jli.b.b(pdf3.f);
                TimeClause.Format.INSTANCE.getClass();
                model = new RowDelegate.Model(strN, layeredImageI, null, null, clause, new TextLocalisedClause(i6, u.c(new TimeClause(jB, TimeClause.Format.f57959a, null, null, 12)), null, 12), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, false, null, null, null, null, null, pdf3, null, 0, 0, 0, 0, 1056958316);
            } else {
                model = null;
            }
            arrayList5.add(model);
            i3 = i5;
        }
        ArrayList arrayListZ = d0.Z(arrayList5);
        b.k(arrayListZ, 0, 0, 0, 0, 31);
        s0Var2.b(arrayListZ.toArray(new RowDelegate.Model[0]));
        ArrayList arrayList6 = s0Var2.f186433a;
        s0Var.b((koi.j[]) v.m(arrayList6.toArray(new Object[arrayList6.size()])).toArray(new koi.j[0]));
        ArrayList arrayList7 = s0Var.f186433a;
        return v.k(arrayList7.toArray(new koi.j[arrayList7.size()]));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        Collection collectionC;
        ResourceImage resourceImage;
        boolean z;
        ArrayList arrayListE0;
        CompositeClause compositeClauseM;
        LearnReward learnReward;
        boolean z3;
        Clause moneyClause;
        f fVar = (f) this.f154088b;
        u09.f course = (u09.f) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(course, "course");
        ResourceImage resourceImage2 = null;
        if (course.f276114j.isEmpty() && zBooleanValue) {
            arrayListE0 = fVar.f78008a;
            resourceImage = null;
            z = true;
        } else {
            o oVar = course.o;
            if (oVar == null || ((z3 = (learnReward = oVar.f276138a) instanceof LearnReward.NoReward))) {
                collectionC = f0.f322471a;
            } else {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.investmentlearn_course_overview_total_card_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                if (learnReward instanceof LearnReward.ToPocket) {
                    LearnReward.ToPocket toPocket = (LearnReward.ToPocket) learnReward;
                    moneyClause = new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.investmentlearn_reward_earn_in_description, v.k(new MoneyClause(toPocket.f78029a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), toPocket.f78030b), null, 12);
                } else {
                    if (!(learnReward instanceof LearnReward.ToInvestAccount)) {
                        if (z3) {
                            throw new IllegalStateException("exhaustive");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    moneyClause = new MoneyClause(((LearnReward.ToInvestAccount) learnReward).f78028a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
                }
                VaultsProgressDelegate.Model model = new VaultsProgressDelegate.Model("LIST_ID_TOTAL_EARNED", null, null, null, null, textLocalisedClause, moneyClause, null, false, 0, null, false, null, null, 8386174);
                b.l(model, 0, 0, 0, 0, null, false, 63);
                collectionC = u.c(model);
            }
            Collection collection = collectionC;
            List list = course.f276114j;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                q lesson = (q) it8.next();
                Intrinsics.checkNotNullParameter(lesson, "lesson");
                LearnReward learnReward2 = lesson.f276148g;
                y yVar = lesson.f276149h;
                yVar.getClass();
                h09.e eVarD = h09.f.d(learnReward2, yVar == y.COMPLETED);
                Clause clause = eVarD.f148334a;
                Integer num = eVarD.f148335b;
                Integer num2 = eVarD.f148336c;
                String strQ = j6.a.q("LESSON_ITEM_", lesson.f276145a);
                TextClause textClause = new TextClause(lesson.f276146b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Iterator it9 = it8;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.learn.shared.impl.R$string.investmentlearn_course_overview_lesson_card_lesson_number, u.c(Integer.valueOf(lesson.f276151l)), null, 12);
                if (clause != null) {
                    Clause[] elements = {num != null ? new ImageClause(num.intValue(), num2, (Float) null, (Float) null, 28) : null, clause};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    compositeClauseM = yoj.b.m(new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
                } else {
                    compositeClauseM = null;
                }
                NewsDelegate.Model model2 = new NewsDelegate.Model(strQ, textClause, new UrlImage(lesson.d, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), textLocalisedClause2, null, compositeClauseM, null, null, yVar == y.LOCKED ? NewsDelegate.Model.c.C0415c.f52864a : NewsDelegate.Model.c.b.f52863a, lesson, null, 2480);
                b.l(model2, 0, 0, 0, 0, null, false, 63);
                arrayList.add(model2);
                resourceImage2 = null;
                it8 = it9;
            }
            resourceImage = resourceImage2;
            z = true;
            arrayListE0 = d0.E0(arrayList, collection);
        }
        Intrinsics.checkNotNullParameter(course, "course");
        h09.e eVarC = h09.f.c(course.f276111c, course.b(), course.f276115l, course.f276119q, z);
        Clause clause2 = eVarC.f148334a;
        Integer num3 = eVarC.f148335b;
        Integer num4 = eVarC.f148336c;
        TextClause textClause2 = new TextClause(course.f276110b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause3 = new TextClause(course.f276113h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ResourceImage resourceImage3 = num3 != null ? new ResourceImage(num3.intValue(), (Integer) null, (Integer) null, num4, (List) null, (ImageTransformations) null, (Clause) null, 246) : resourceImage;
        String str = course.f276117n;
        if (str == null) {
            str = course.d;
        }
        UrlImage urlImage = new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        f0 f0Var = f0.f322471a;
        int iA = course.a();
        return new m(arrayListE0, new i09.j(textClause2, textClause3, resourceImage3, clause2, iA != 0 ? iA != 100 ? new i(iA) : c.a.f77997a : c.b.f77998a, urlImage, f0Var));
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        boolean z;
        l lVar = (l) this.f154088b;
        Map profiles = (Map) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Collection collectionValues = profiles.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = collectionValues.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((JuniorBankingProfile) it8.next()).f77101g, lVar.getCode())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        Iterable iterableC;
        List listE0;
        boolean z;
        Clause clauseB;
        int i;
        r rVar = (r) this.f154088b;
        i0e.d state = (i0e.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        Object obj5 = (b0) state.f157362b.get(state.f157361a);
        if (obj5 == null) {
            obj5 = b0.a.f157358a;
        }
        boolean z3 = obj5 instanceof b0.a;
        if (z3) {
            rVar.getClass();
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_ITEM_LIST_ID", new TextLocalisedClause(com.revolut.feature.statements.R$string.common_error_no_results_found, null, null, 14), new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_error_no_results_found_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
            b.l(model, 0, 0, 0, 0, null, false, 63);
            listE0 = u.c(model);
        } else {
            rVar.getClass();
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.statements.R$string.common_word_period, null, null, 14);
            boolean z4 = obj5 instanceof i0e.y;
            if (z4) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_period_all_time, null, null, 14);
            } else if (obj5 instanceof i0e.d0) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_period_month, null, null, 14);
            } else if (obj5 instanceof e0) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_period_tax_year, null, null, 14);
            } else if ((obj5 instanceof c0) || (obj5 instanceof z)) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_period_calendar_year, null, null, 14);
            } else {
                if (!(obj5 instanceof a0)) {
                    if (z3) {
                        throw new IllegalArgumentException("No title available for the empty period!");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_period_custom, null, null, 14);
            }
            Object obj6 = obj5;
            InputTextDelegate.Model model2 = new InputTextDelegate.Model("PERIOD_CHOOSER_ITEM_ID", textLocalisedClause, textLocalisedClause2, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, state, null, null, 0, 0, 0, 0, -8, 65023);
            InputTextDelegate.Model modelE = state.f157362b.size() < 2 ? InputTextDelegate.Model.e(model2, null, null, -16777217) : yp0.r.a(model2);
            b.l(modelE, 0, 0, 0, 0, null, false, 63);
            List listC = u.c(modelE);
            if (z3 || z4) {
                iterableC = f0.f322471a;
            } else if (obj6 instanceof a0) {
                a0 a0Var = (a0) obj6;
                StatementPeriod statementPeriod = a0Var.f157354b;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_period_from, null, null, 14);
                long jN = oc.c.N(statementPeriod.getStart());
                TimeClause.Format.INSTANCE.getClass();
                TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
                InputTextDelegate.Model modelA = yp0.r.a(new InputTextDelegate.Model("CUSTOM_VALUES_FROM_ITEM_ID", new TimeClause(jN, dateMedium, null, null, 12), textLocalisedClause3, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, a0Var, null, null, 0, 0, 0, 0, -8, 65023));
                b.l(modelA, 0, 0, 0, 0, null, false, 63);
                InputTextDelegate.Model modelA2 = yp0.r.a(new InputTextDelegate.Model("CUSTOM_VALUES_TO_ITEM_ID", new TimeClause(oc.c.N(statementPeriod.getEnd()), dateMedium, null, null, 12), new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_period_to, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, a0Var, null, null, 0, 0, 0, 0, -8, 65023));
                b.l(modelA2, 0, 0, 0, 0, null, false, 63);
                iterableC = v.k(modelA, modelA2);
            } else {
                int size = 0;
                if (obj6 instanceof i0e.d0) {
                    i0e.d0 d0Var = (i0e.d0) obj6;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    aim.e<StatementPeriod> eVar = d0Var.f157363a;
                    StatementPeriod statementPeriod2 = d0Var.f157364b;
                    int size2 = 0;
                    for (StatementPeriod statementPeriod3 : eVar) {
                        arrayList.add(new ue(new TimeClause(oc.c.N(statementPeriod3.getStart()), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), statementPeriod3.getStart()));
                        arrayList2.add(new ue(new TimeClause(oc.c.N(statementPeriod3.getEnd()), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), statementPeriod3.getEnd()));
                        if (Intrinsics.f(statementPeriod3.getStart(), statementPeriod2.getStart())) {
                            size = arrayList.size() - 1;
                        }
                        if (Intrinsics.f(statementPeriod3.getEnd(), statementPeriod2.getEnd()) || size2 == 0) {
                            size2 = arrayList2.size() - 1;
                        }
                    }
                    re reVar = new re("MONTH_VALUES_ITEM_ID", new te(new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_starting_on, null, null, 14), arrayList, Integer.valueOf(size), 24), new te(new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_ending_on, null, null, 14), arrayList2, Integer.valueOf(size2), 24));
                    b.l(reVar, 0, 0, 0, 0, null, false, 63);
                    iterableC = u.c(reVar);
                } else {
                    int i2 = 1;
                    if (obj6 instanceof z) {
                        z zVar = (z) obj6;
                        ArrayList arrayList3 = new ArrayList();
                        int size3 = 1;
                        for (StatementPeriod statementPeriod4 : zVar.f157394a) {
                            arrayList3.add(new c10(new TimeClause(oc.c.N(statementPeriod4.getStart()), new TimeClause.Format.Year(0), null, null, 12), new StatementPeriod(statementPeriod4.getStart(), statementPeriod4.getEnd())));
                            if (zVar.f157395b.equals(statementPeriod4) || size3 == -1) {
                                size3 = arrayList3.size() - 1;
                            }
                        }
                        a10 a10Var = new a10("CALENDAR_YEAR_VALUES_ITEM_ID", arrayList3, size3);
                        b.l(a10Var, 0, 0, 0, 0, null, false, 63);
                        iterableC = u.c(a10Var);
                    } else if (obj6 instanceof c0) {
                        c0 c0Var = (c0) obj6;
                        ArrayList arrayList4 = new ArrayList();
                        int size4 = 0;
                        for (StatementPeriod statementPeriod5 : c0Var.f157359a) {
                            arrayList4.add(new c10(new TimeClause(oc.c.N(statementPeriod5.getStart()), new TimeClause.Format.Year(0), null, null, 12), new StatementPeriod(statementPeriod5.getStart(), statementPeriod5.getEnd())));
                            if (c0Var.f157360b.equals(statementPeriod5) || size4 == -1) {
                                size4 = arrayList4.size() - 1;
                            }
                        }
                        a10 a10Var2 = new a10("CALENDAR_YEAR_VALUES_ITEM_ID", arrayList4, size4);
                        b.l(a10Var2, 0, 0, 0, 0, null, false, 63);
                        iterableC = u.c(a10Var2);
                    } else {
                        if (!(obj6 instanceof e0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e0 e0Var = (e0) obj6;
                        ArrayList arrayList5 = new ArrayList();
                        TaxPeriod taxPeriod = e0Var.f157365a;
                        boolean z6 = taxPeriod.getFrom().compareTo((ChronoLocalDate) taxPeriod.getTo()) < 0;
                        int size5 = 1;
                        for (StatementPeriod statementPeriod6 : e0Var.f157366b) {
                            StatementPeriod statementPeriod7 = new StatementPeriod(statementPeriod6.getStart(), statementPeriod6.getEnd());
                            if (statementPeriod6.getStart().getYear() != statementPeriod6.getEnd().getYear()) {
                                z = z6;
                                clauseB = x.b(statementPeriod6, new TimeClause.Format.Year(0));
                            } else if (z6) {
                                clauseB = new TimeClause(oc.c.N(statementPeriod6.getStart()), new TimeClause.Format.Year(0), null, null, 12);
                                z = z6;
                            } else {
                                z = z6;
                                if (statementPeriod6.getEnd().compareTo((ChronoLocalDate) taxPeriod.getTo().withYear(statementPeriod6.getEnd().getYear())) <= 0) {
                                    LocalDate localDateWithYear = taxPeriod.getFrom().withYear(statementPeriod6.getStart().minusYears(1L).getYear());
                                    Intrinsics.checkNotNullExpressionValue(localDateWithYear, "withYear(...)");
                                    clauseB = x.b(StatementPeriod.copy$default(statementPeriod6, localDateWithYear, null, 2, null), new TimeClause.Format.Year(0));
                                } else {
                                    LocalDate localDateWithYear2 = taxPeriod.getTo().withYear(statementPeriod6.getEnd().plusYears(1L).getYear());
                                    Intrinsics.checkNotNullExpressionValue(localDateWithYear2, "withYear(...)");
                                    clauseB = x.b(StatementPeriod.copy$default(statementPeriod6, null, localDateWithYear2, i2, null), new TimeClause.Format.Year(0));
                                }
                            }
                            arrayList5.add(new c10(clauseB, statementPeriod7));
                            if (e0Var.f157367c.equals(statementPeriod6) || size5 == -1) {
                                i = 1;
                                size5 = arrayList5.size() - 1;
                            } else {
                                i = 1;
                            }
                            z6 = z;
                            i2 = i;
                        }
                        a10 a10Var3 = new a10("TAX_VALUES_ITEM_ID", arrayList5, size5);
                        b.l(a10Var3, 0, 0, 0, 0, null, false, 63);
                        iterableC = u.c(a10Var3);
                    }
                }
            }
            listE0 = d0.E0(iterableC, listC);
        }
        return new t(listE0);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        String str;
        MoneyClause moneyClause;
        Object model;
        i2h.f fVar = (i2h.f) this.f154088b;
        i2h.d cashResult = (i2h.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cashResult, "cashResult");
        List list = cashResult.f157933b;
        String str2 = cashResult.f157932a;
        if (list.isEmpty() && !kotlin.text.d0.W(str2)) {
            return h2h.a.a(str2);
        }
        List<kel.c> list2 = cashResult.f157933b;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (kel.c cVar : list2) {
            Set set = fVar.f157935b;
            y1h.e eVar = fVar.f157934a;
            xi0.a aVar = xi0.b.Companion;
            kel.b bVar = cVar.f183153a;
            kel.b bVar2 = cVar.f183153a;
            String str3 = bVar.f183148a.e;
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(str3);
            dj0.d dVar = cVar.f183154b;
            dj0.d dVar2 = bVar2.f183149b;
            kel.a aVar2 = bVar2.f183148a;
            String str4 = aVar2.e;
            String str5 = aVar2.f183145a;
            String strQ = j6.a.q("ASSET_CASH_SELECTION_INNER_ITEM_ID_", str5);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str4, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 60);
            CurrencyClause currencyClause = new CurrencyClause(bVarA, null, null, 6);
            i2h.f fVar2 = fVar;
            CurrencyClause currencyClause2 = new CurrencyClause(bVarA, CurrencyClause.Format.Ticker.f57756a, null, 4);
            MoneyClause moneyClause2 = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            if (dVar == null || dVar.equals(dVar2)) {
                str = str4;
                moneyClause = null;
            } else {
                str = str4;
                moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            }
            String str6 = str;
            RowDelegate.Model model2 = new RowDelegate.Model(strQ, image40, currencyClause, null, 0, currencyClause2, null, null, 0, new RowDelegate.Model.c.b(moneyClause2, moneyClause, null, false, 124), false, null, false, null, null, null, null, null, null, bVar2, null, 0, 0, 0, 0, 532675544);
            int i = k.f157945a[eVar.ordinal()];
            if (i == 1) {
                model = model2;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                model = new SelectableDelegate.Model(j6.a.q("ASSET_CASH_SELECTION_ITEM_ID_", str5), model2, set.contains(str6) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760);
            }
            arrayList.add(model);
            fVar = fVar2;
        }
        b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        Object next;
        TextLocalisedClause textLocalisedClause;
        int i;
        List list;
        Iterator it8;
        boolean z;
        RowDelegate.Model model;
        mf mfVar;
        RowDelegate.Model.MainImage.Image40 image40;
        lf lfVar;
        i2k.k kVar = (i2k.k) this.f154088b;
        List options = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(options, "content");
        boolean z3 = d0.d0(options) instanceof z1k.b;
        Intrinsics.checkNotNullParameter(options, "options");
        List list2 = options;
        Iterator it9 = list2.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (((z1k.c) next).b()) {
                break;
            }
        }
        z1k.c cVar = (z1k.c) next;
        dj0.d dVarA = cVar != null ? cVar.a() : null;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        int i2 = 0;
        while (it10.hasNext()) {
            Object next2 = it10.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            z1k.c cVar2 = (z1k.c) next2;
            if (cVar2 instanceof z1k.b) {
                z1k.b option = (z1k.b) cVar2;
                TextLocalisedClause textLocalisedClause2 = option.d;
                dj0.d dVar = option.f318854c;
                boolean z4 = i2 == 0 && z3;
                Intrinsics.checkNotNullParameter(option, "option");
                dj0.d dVarH = pyd.c.H(dVar, dVarA);
                boolean z6 = dVarA != null && dVar.i(dVarA);
                String strQ = j6.a.q("pricing_", option.f318852a);
                TextClause textClause = new TextClause(option.f318852a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                if (z6) {
                    it8 = it10;
                    mfVar = new mf(new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true);
                } else {
                    it8 = it10;
                    mfVar = null;
                }
                z = z3;
                RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(new UrlImage(option.f318853b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), option.f ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60);
                if (z4) {
                    image40 = image402;
                    lfVar = new lf(new TextLocalisedClause(com.revolut.retail.feature.payments.bank_transfer.impl.R$string.remittance_price_comparison_badge_cheapest, null, null, 14), kf.MEDIUM, 4);
                } else {
                    image40 = image402;
                    lfVar = null;
                }
                model = new RowDelegate.Model(strQ, image40, textClause, null, 0, textLocalisedClause2, null, lfVar, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), k2k.a.a(dVarH), null, false, 124), z6, null, option.f, null, null, mfVar, null, null, null, z6 ? new k2k.c(textLocalisedClause2, option.e) : null, null, 0, 0, 0, 0, 532599640);
            } else {
                it8 = it10;
                z = z3;
                if (!(cVar2 instanceof z1k.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z1k.a option2 = (z1k.a) cVar2;
                dj0.d dVar2 = option2.f318851c;
                Intrinsics.checkNotNullParameter(option2, "option");
                model = new RowDelegate.Model(j6.a.q("pricing_", option2.f318849a), new RowDelegate.Model.MainImage.Image40(new UrlImage(option2.f318850b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 62), new TextClause(option2.f318849a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12), k2k.a.a(pyd.c.H(dVar2, dVarA)), null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536859608);
            }
            arrayList.add(model);
            i2 = i3;
            it10 = it8;
            z3 = z;
        }
        boolean z11 = z3;
        b.k(arrayList, 0, 0, 0, 0, 31);
        dj0.d recipientMoney = kVar.f157998b;
        Intrinsics.checkNotNullParameter(recipientMoney, "recipientMoney");
        if (z11) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.payments.bank_transfer.impl.R$string.remittance_price_comparison_screen_subtitle, u.c(new MoneyClause(recipientMoney, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
            i = 10;
            list = null;
        } else {
            i = 10;
            list = null;
            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.payments.bank_transfer.impl.R$string.remittance_price_comparison_screen_subtitle_not_best_price, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        return new i2k.m(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new TextLocalisedClause(com.revolut.retail.feature.payments.bank_transfer.impl.R$string.remittance_price_comparison_screen_subtitle_action, list, new Click(30, (Integer) null, (Object) null, "HOW_IS_THIS_CALCULATED_DISCLAIMER_ID", false), i))), arrayList);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        t0 t0Var = (t0) this.f154088b;
        List transactionList = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionList, "transactionList");
        if (transactionList.isEmpty()) {
            return f0.f322471a;
        }
        List<a3> listV0 = d0.V0(transactionList, 3);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        for (a3 a3Var : listV0) {
            g gVar = t0Var.f158047a;
            k71.q.Companion.getClass();
            arrayList.add(RowDelegate.Model.x(((anf.k) gVar).p(a3Var, k71.p.a(), new thf.f(false, 3)), null, null, null, null, null, 0, null, true, null, a3Var, 0, 0, 0, 0, null, -4196353, 15));
        }
        aim.e eVarB = u.b();
        eVarB.addAll(arrayList);
        if (transactionList.size() > 3) {
            eVarB.add(new LargeActionButtonDelegate.Model("travel_status_partner_transactions_see_all", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.retail.feature.travel_status.impl.R$string.travel_status_partner_details_section_transactions_see_all, null, null, 14), false, null, null, Unit.f186387a, null, 744));
        }
        return b.g(u.a(eVarB), t0.a(), null, 0, 0, 126);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        i42.d dVar = (i42.d) this.f154088b;
        i42.c content = (i42.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content instanceof i42.b) {
            kj kjVar = new kj("TERMS_CONTENT_LIST_ID", new mj(((i42.b) content).f158267a, null), null, Constants.TAG_FC_SPEED_MODE);
            b.l(kjVar, 0, 0, 0, 0, null, false, 63);
            return new i42.e(u.c(kjVar), null, dVar.f158269b);
        }
        if (content instanceof i42.a) {
            return new i42.e(f0.f322471a, ((i42.a) content).f158266a, dVar.f158269b);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        i4h.d dVar = (i4h.d) this.f154088b;
        e3h.h content = (e3h.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return dVar.f158447b.a(content.f122293a, true, content.f122294b);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        j5b.b bVar = ((i5b.k) this.f154088b).f158805a;
        h2b.a settingsContent = (h2b.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(settingsContent, "settingsContent");
        List list = null;
        ArrayList arrayListU = w.u(v.l(settingsContent.f148764a ? bVar.a(i5b.a.CFD_ASSESSMENT) : null));
        b.k(arrayListU, 0, 0, 0, 0, 31);
        if (settingsContent.f148765b) {
            List listA = bVar.a(i5b.a.CLOSE_ACCOUNT);
            b.k(listA, 0, 0, 0, 0, 31);
            list = listA;
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return d0.E0(list, arrayListU);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        char c2;
        PlainTextDelegate.Model modelA;
        i5e.c cVar = (i5e.c) this.f154088b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        w2 w2Var = (w2) pair.f186385a;
        nel.n nVar = (nel.n) pair.f186386b;
        int i = i5e.e.f158818a[cVar.f158813a.ordinal()];
        if (i == 1) {
            nel.a aVar = nVar.f214599h;
            nel.e0 e0Var = aVar instanceof nel.e0 ? (nel.e0) aVar : null;
            PlainTextDelegate.Model[] elements = {(e0Var == null || e0Var.e == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_issue_face_value, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_issue_info_face_value, "face_value"), (e0Var == null || e0Var.f == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_issue_issue_price, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_issue_info_issue_price, "issue_price"), nVar.f214600j != null ? i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_issue_isin, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_issue_info_isin, "isin") : null, i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_lifecycle_note_trade_date, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_lifecycle_info_note_trade_date, "trade_date"), i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_lifecycle_issue_date, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_lifecycle_info_issue_date, "issue_date"), i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_lifecycle_final_observation_date, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_lifecycle_info_final_observation_date, "final_observation_date"), i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_lifecycle_maturity_date, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_lifecycle_info_maturity_date, "maturity_date"), (e0Var == null || e0Var.f214567c == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_notes_term, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_info_notes_term, "term")};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.L(elements);
        }
        if (i == 2) {
            r1 r1Var = w2Var.f;
            qv0.i[] elements2 = {(r1Var == null || r1Var.f173557a == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_coupon_rate, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_info_coupon_rate, "coupon_rate"), (r1Var == null || r1Var.f173558b == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_frequency, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_info_frequency, "coupon_frequency"), (r1Var == null || r1Var.f173559c == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_coupon_type, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_info_coupon_type, "coupon_type"), (r1Var == null || r1Var.d == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_coupon_barrier, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_info_coupon_barrier, "coupon_barrier"), (r1Var == null || r1Var.e == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_first_observation_date, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_info_first_observation_date, "coupon_first_observation_date"), (r1Var == null || r1Var.f == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_performance_basis, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_coupon_info_performance_basis, "coupon_performance_basis")};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            return kotlin.collections.d.L(elements2);
        }
        if (i != 3) {
            if (i == 4) {
                q1 q1Var = w2Var.f173589h;
                qv0.i[] elements3 = {(q1Var == null || q1Var.f173545a == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_capital_protection_capital_protected, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_capital_protection_info_capital_protected, "capital_protection_protected"), (q1Var == null || q1Var.f173546b == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_capital_protection_capital_barrier, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_capital_protection_info_barrier, "capital_protection_barrier"), (q1Var == null || q1Var.f173547c == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_capital_protection_strike, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_capital_protection_info_strike, "capital_protection_strike"), (q1Var == null || q1Var.d == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_capital_protection_performance_basis, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_capital_protection_info_performance_basis, "capital_protection_performance_basis")};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                return kotlin.collections.d.L(elements3);
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            t1 t1Var = w2Var.i;
            qv0.i[] elements4 = {(t1Var == null || t1Var.f173566a == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_final_payout_profit_multiplier, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_final_payout_info_profit_multiplier, "final_payout_profit_multiplier"), (t1Var == null || t1Var.f173567b == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_final_payout_loss_multiplier, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_final_payout_info_loss_multiplier, "final_payout_loss_multiplier"), (t1Var == null || t1Var.f173568c == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_final_payout_strike, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_final_payout_info_strike, "final_payout_strike"), (t1Var == null || t1Var.d == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_final_payout_cap, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_final_payout_info_maximum_return, "final_payout_cap"), (t1Var == null || t1Var.e == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_final_payout_performance_basis, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_final_payout_info_performance_basis, "final_payout_performance_basis")};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            return kotlin.collections.d.L(elements4);
        }
        p1 p1Var = w2Var.f173588g;
        PlainTextDelegate.Model modelA2 = (p1Var == null || p1Var.f173534a == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_about_note_call_accumulating_return, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_info_accumulating_return, "call_accumulating_return");
        PlainTextDelegate.Model modelA3 = (p1Var == null || p1Var.f173535b == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_redemption_amount, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_info_redemption_amount, "call_redemption");
        PlainTextDelegate.Model modelA4 = (p1Var == null || p1Var.f173536c == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_frequency, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_info_frequency, "call_frequency");
        PlainTextDelegate.Model modelA5 = (p1Var == null || p1Var.d == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_barrier, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_info_barrier, "call_barrier");
        if (p1Var == null || p1Var.e == null) {
            c2 = 1;
            modelA = null;
        } else {
            c2 = 1;
            modelA = i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_first_observation_date, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_info_first_observation_date, "call_first_observation");
        }
        PlainTextDelegate.Model modelA6 = (p1Var == null || p1Var.f == null) ? null : i5e.f.a(com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_performance_basis, com.revolut.feature.structured_note.details.impl.R$string.trading_structured_notes_attributes_dictionary_call_info_performance_basis, "call_performance_basis");
        qv0.i[] elements5 = new qv0.i[6];
        elements5[0] = modelA2;
        elements5[c2] = modelA3;
        elements5[2] = modelA4;
        elements5[3] = modelA5;
        elements5[4] = modelA;
        elements5[5] = modelA6;
        Intrinsics.checkNotNullParameter(elements5, "elements");
        return kotlin.collections.d.L(elements5);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        int i;
        Clause textLocalisedClause;
        i6g.f fVar = (i6g.f) this.f154088b;
        List locations = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(locations, "locations");
        if (locations.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("EMPTY_STATE_ID", new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_destination_search_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_destination_search_empty_state_subtitle, u.c(fVar.f158995a), null, 12), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, new ImageTransformations(null, null, null, gz0.b.Center, null, 56, 56, 23), (Clause) null, 182)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
            b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        List<LocationSearchResult> list = locations;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (LocationSearchResult locationSearchResult : list) {
            String str = locationSearchResult.f93525a;
            m7g.f fVar2 = locationSearchResult.d;
            int[] iArr = i6g.o.f159007a;
            int i2 = iArr[fVar2.ordinal()];
            if (i2 == 1) {
                i = R$drawable.uikit_icn_24_company_filled;
            } else if (i2 == 2) {
                i = R$drawable.uikit_icn_24_travel;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_location_pin;
            }
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorGreyTone10, 8.0f, null, null, 48), null, null, false, null, false, 62);
            int i3 = iArr[fVar2.ordinal()];
            if (i3 == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.travel.flights.api.R$string.travel_flights_destination_search_city_result_title, u.c(locationSearchResult.f93526b), null, 12);
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextClause(locationSearchResult.f93526b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            arrayList.add(new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, new TextClause(locationSearchResult.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new RowDelegate.Model.c.b(new TextClause(locationSearchResult.f93527c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, null, false, LDSFile.EF_DG14_TAG), false, null, false, null, null, null, null, null, null, locationSearchResult, null, 0, 0, 0, 0, 532675544));
        }
        b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        Clause textClause;
        kpj.f fVar = ((s) this.f154088b).f159036a;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        jt5.b bVar = (jt5.b) pair.f186385a;
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair.f186386b;
        dj0.d dVar = bVar.f178355b;
        if (dVar != null) {
            textClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        } else {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        hel.b bVar2 = tradingLegalEntityInformation.f105106a;
        n2l.b bVar3 = n2l.b.f211584a;
        return new i6j.i(textClause, fVar.h(bVar3, bVar2, null), nz8.d.L(LayeredImage.INSTANCE.i(fVar.g(bVar3), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0224 A[LOOP:3: B:43:0x021e->B:45:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020f A[EDGE_INSN: B:54:0x020f->B:42:0x020f BREAK  A[LOOP:2: B:23:0x0117->B:41:0x01ea], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r41, java.lang.Object r42, java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hnc.a.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        Object next;
        fgi.a aVar = (fgi.a) this.f154088b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Iterator it8 = content.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((fgi.b) next).f135075a == aVar) {
                break;
            }
        }
        fgi.b bVar = (fgi.b) next;
        od0.i.Companion.getClass();
        return bVar != null ? od0.h.a(bVar) : od0.i.f224256b;
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        Object cVar;
        Object cVar2;
        i9h.o oVar = (i9h.o) this.f154088b;
        i9h.d dVar = oVar.f159864j;
        List assets = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(assets, "content");
        if (assets.isEmpty()) {
            if (!zBooleanValue) {
                dVar.getClass();
                return u.c(adh.n.b(dVar));
            }
            dVar.f159850b.getClass();
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new pb0(d.n("Loading.Row.", i)));
            }
            b.k(arrayList, 0, 0, 0, 0, 31);
            return arrayList;
        }
        MostTradedAssetsScreenContract$Configuration configuration = oVar.i;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int i2 = 0;
        if ((configuration instanceof MostTradedAssetsScreenContract$Configuration.Cfd) || (configuration instanceof MostTradedAssetsScreenContract$Configuration.Stock)) {
            List list = assets;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (Object obj5 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                xzg.v vVar = (xzg.v) obj5;
                if (vVar instanceof xzg.t) {
                    cVar = new q0h.b(((xzg.t) vVar).f310031b);
                } else {
                    if (!(vVar instanceof xzg.u)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = new q0h.c(((xzg.u) vVar).f310034b);
                }
                arrayList2.add(dVar.d(vVar, i3, cVar));
                i2 = i3;
            }
            b.k(arrayList2, 0, 0, 0, 0, 31);
            return arrayList2;
        }
        if (!(configuration instanceof MostTradedAssetsScreenContract$Configuration.Crypto)) {
            throw new NoWhenBranchMatchedException();
        }
        List list2 = assets;
        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
        for (Object obj6 : list2) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            xzg.v vVar2 = (xzg.v) obj6;
            if (vVar2 instanceof xzg.t) {
                cVar2 = new q0h.b(((xzg.t) vVar2).f310031b);
            } else {
                if (!(vVar2 instanceof xzg.u)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2 = new q0h.c(((xzg.u) vVar2).f310034b);
            }
            arrayList3.add(dVar.d(vVar2, i5, cVar2));
            i2 = i5;
        }
        b.k(arrayList3, 0, 0, 0, 0, 31);
        return arrayList3;
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        bof.r rVar = (bof.r) this.f154088b;
        z0h.t1 disclaimer = (z0h.t1) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        z0h.q1 q1Var = (z0h.q1) rVar.d;
        Links links = disclaimer.f318563a;
        hel.b bVar = disclaimer.f318564b;
        return ((aah.m) q1Var).c(u.c(new i0(links, bVar)), bVar);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        id8.e eVar = (id8.e) this.f154088b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List listP0 = d0.P0(content, new id8.d());
        if (listP0.isEmpty()) {
            return new go.g(f0.f322471a, 2);
        }
        return mo3.a.f(((nj8.n) eVar.f160441b).k(null, w4l.h.f294642c), new i83.m(17), new id8.b(listP0, eVar), new i83.m(18));
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        idj.a aVar = (idj.a) this.f154088b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        g gVar = aVar.f160495a;
        k71.q.Companion.getClass();
        return ((anf.k) gVar).q(content, k71.p.a(), new thf.f(false, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hnc.a.w(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj2, Object obj3, Object obj4) {
        com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b bVar = (com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b) this.f154088b;
        ((Boolean) obj3).booleanValue();
        if (((List) obj2).isEmpty()) {
            com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b.I2(bVar, EarnAssetsRootScreenContract$Step.Preview.f70807a);
        } else {
            com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b.I2(bVar, EarnAssetsRootScreenContract$Step.Assets.f70804a);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r73, java.lang.Object r74, java.lang.Object r75) {
        /*
            Method dump skipped, instruction units count: 3372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hnc.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(ieb.g gVar, ieb.p pVar) {
        this.f154087a = 27;
        this.f154088b = gVar;
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f154087a = i;
        this.f154088b = obj2;
    }
}
