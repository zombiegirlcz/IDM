package hb4;

import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.o9;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.d5;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.models.blik.BlikCode;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.freelancer.common.models.onboarding.BusinessCategory;
import com.revolut.feature.freelancer.common.models.payments.FreelancerOrderPaymentReceipt;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import com.revolut.feature_market_data_api.navigation.TransactionUnitsType;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import cv3.p;
import cv3.r;
import cv3.v;
import cv3.x;
import dx4.q;
import dx4.q4;
import ff4.s;
import hu1.f0;
import hu1.j0;
import hx5.b;
import ip0.v7;
import ip0.z;
import ip0.zj;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import nr6.c0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import rp0.t;
import rp0.y;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class n implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f150608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f150609c;

    public /* synthetic */ n(hu6.a aVar, nr6.b bVar, Data data) {
        this.f150607a = 17;
        this.f150608b = bVar;
        this.f150609c = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x08be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r66, java.lang.Object r67, java.lang.Object r68) {
        /*
            Method dump skipped, instruction units count: 2468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb4.n.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        ff4.j jVar;
        CompositeClause compositeClause;
        CompositeClause compositeClause2;
        TextClause textClause;
        Clause textClause2;
        String str;
        Click click;
        hf4.i iVar = (hf4.i) this.f150608b;
        ff4.i iVar2 = (ff4.i) this.f150609c;
        bv3.b content = (bv3.b) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        bv3.c cVar = content.f18943a;
        String str2 = cVar.f18947b;
        TextLocalisedClause textLocalisedClauseA = str2 != null ? hf4.i.a(str2) : null;
        r rVar = cVar.f18946a;
        p pVar = rVar instanceof p ? (p) rVar : null;
        if (pVar != null) {
            x xVar = pVar.f109263a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_tile_title, u.c(xVar.f109276b), null, 12);
            q qVar = xVar.d;
            ResourceImage resourceImage = qVar != null ? new ResourceImage(c8g.c.v(qVar), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null;
            boolean z = xVar.e != null;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_constructor_tile_subtitle, u.c(xVar.f109277c), null, 12);
            v vVar = xVar.f;
            if (vVar != null) {
                int i = R$string.credit_application_constructor_tile_label;
                String str3 = vVar.f109271a;
                dx4.l lVar = vVar.f109272b;
                if (lVar != null) {
                    str = str3;
                    click = new Click(28, (Integer) null, (Object) lVar, str3, false);
                } else {
                    str = str3;
                    click = null;
                }
                textClause2 = new TextLocalisedClause(i, u.c(new TextClause(str, (Style) click, (Integer) null, false, (o9) null, (List) null, 124)), null, 12);
            } else {
                m70.a.c(t0.f186434a);
                textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            jVar = new ff4.j(textLocalisedClause, resourceImage, z, textLocalisedClause2, textClause2);
        } else {
            jVar = null;
        }
        ff4.k kVar = new ff4.k(jVar);
        String str4 = cVar.f18948c;
        TextClause textClause3 = str4 != null ? new TextClause(str4, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null;
        ResourceImage resourceImage2 = hf4.h.f151750a[cVar.f18949g.ordinal()] == 1 ? new ResourceImage(R$drawable.uikit_icn_16_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_application_offer_action, u.c(new TextClause(cVar.k.f66298a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        List list = cVar.f18950h;
        if (list != null) {
            if ((!list.isEmpty() ? list : null) != null) {
                List<q4> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (q4 q4Var : list2) {
                    dx4.l lVar2 = q4Var.f120728c;
                    if (lVar2 != null) {
                        String str5 = q4Var.f120726a;
                        textClause = new TextClause(str5, (Style) new Click(28, (Integer) null, (Object) lVar2, str5, false), (Integer) null, false, (o9) null, (List) null, 124);
                    } else {
                        textClause = q4Var.f120727b ? new TextClause(q4Var.f120726a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : new TextClause(q4Var.f120726a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    arrayList.add(textClause);
                }
                compositeClause2 = new CompositeClause(arrayList, new DotDividerClause((Integer) null), null, null, 12);
            } else {
                compositeClause2 = null;
            }
            compositeClause = compositeClause2;
        } else {
            compositeClause = null;
        }
        iVar2.getClass();
        return new s(iVar.f151751a.a(cVar, iVar2.f134719a), textLocalisedClauseA, null, null, null, textClause3, resourceImage2, compositeClause, textLocalisedClause3, zBooleanValue, true, kVar, null, 28);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        hg4.w wVar = (hg4.w) this.f150608b;
        hg4.j jVar = (hg4.j) this.f150609c;
        ev3.b content = (ev3.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z = jVar.f152094b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.personal_details_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.personal_details_subtitle, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.personal_details_button, null, null, 14);
        InputTextDelegate.Model model = new InputTextDelegate.Model("NAME_INPUT_ID", new TextClause(content.f129700a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.personal_details_name, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        LocalDate localDate = content.f129701b;
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.personal_details_birthday, null, null, 14);
        com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
        if (localDate == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        jVar2.getClass();
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("DATA_OF_BIRTH_INPUT_ID", com.revolut.core.ui_kit.models.j.a(localDate, LocalDateClause$DateFormat.DateEditable.f57802a, null), textLocalisedClause4, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("SSN_INPUT_ID", new TextClause(j6.a.q("XXX-XX-", content.d.f129699a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.personal_details_ssn_or_itin, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        Address address = content.f129702c;
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.personal_details_residential_address, null, null, 14);
        String strA = address != null ? o51.a.a(address, ((s80.b) wVar.f152107a).b()) : null;
        if (strA == null) {
            strA = "";
        }
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("RESIDENTIAL_ADDRESS_INPUT_ID", new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause5, null, null, null, null, false, null, false, false, 0, false, 0, false, false, false, null, false, false, 0, false, false, null, -83886088, 131071);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        List listK = zhm.v.k(model, model2, model3, model4);
        ListSubheaderDelegate.Model model5 = new ListSubheaderDelegate.Model("id_disclosure", (Image) null, (Clause) new TextLocalisedClause(R$string.personal_details_disclosure, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        InputDisclosureDelegate.Model model6 = new InputDisclosureDelegate.Model("DISCLOSURE_ID", new TextLocalisedClause(R$string.personal_details_customer_identification_program, null, null, 14), null, null, null, 1020);
        yp0.b.l(model6, R$attr.uikit_dp0, R$attr.uikit_dp32, 0, 0, null, false, 60);
        return new hg4.r(d0.E0(zhm.v.k(model5, model6), listK), textLocalisedClause, textLocalisedClause2, textLocalisedClause3, true, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r63, java.lang.Object r64, java.lang.Object r65) {
        /*
            Method dump skipped, instruction units count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb4.n.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb4.n.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v5 hkk.i, still in use, count: 3, list:
          (r6v5 hkk.i) from 0x036e: MOVE (r19v0 hkk.i) = (r6v5 hkk.i)
          (r6v5 hkk.i) from 0x0091: MOVE (r19v2 hkk.i) = (r6v5 hkk.i)
          (r6v5 hkk.i) from 0x007f: MOVE (r19v4 hkk.i) = (r6v5 hkk.i)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object g(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 1409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb4.n.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        LocalDate localDate;
        hp2.m mVar = (hp2.m) this.f150608b;
        hp2.f fVar = (hp2.f) this.f150609c;
        DatePickerConfig content = (DatePickerConfig) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        LocalDate localDate2 = fVar.f154387b;
        if (localDate2 == null) {
            LocalDate localDateE = content.f63987b;
            if (localDateE == null) {
                localDateE = ((l80.f) mVar.f154398a).e();
            }
            localDate = localDateE;
        } else {
            localDate = localDate2;
        }
        g5 g5Var = new g5("ID_DATE_PICKER", localDate, localDate2, false, null, content.f63987b, content.f63988c, null, u.c(new d5(content.d)), null, 0, 0, 1047352);
        yp0.b.l(g5Var, 0, 0, 0, 0, null, false, 63);
        return new hp2.h(u.c(g5Var), hp2.m.a(fVar), content.f63986a, true, localDate2 != null);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        hs4.p pVar = (hs4.p) this.f150608b;
        hs4.e eVar = (hs4.e) this.f150609c;
        hs4.d content = (hs4.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        hs4.j jVar = new hs4.j(hs4.p.a(eVar.f154988b), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        LinkedHashMap linkedHashMap = content.f154986a;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LocalDate localDate = (LocalDate) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                RowDelegate.Model modelC = ((gs4.h) pVar.f155001a).c((ql4.i) it8.next());
                if (modelC != null) {
                    arrayList2.add(modelC);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList2 = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("id_past_item_header", (Image) null, (Clause) new TimeClause(oc.c.F(localDate), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            }
            arrayList.add(arrayList2);
        }
        return new hs4.k(w.u(arrayList), jVar);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        hu1.o oVar = (hu1.o) this.f150608b;
        j0 j0Var = (j0) this.f150609c;
        BlikCode blikCode = (BlikCode) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(blikCode, "blikCode");
        boolean z = oVar.e;
        boolean z3 = oVar.f;
        boolean z4 = oVar.d;
        my0.e eVar = j0Var.f155527a;
        hu1.s.Companion.getClass();
        return ky0.c.a(eVar, hu1.n.f155531b, new f0(z, z3, j0Var, blikCode, z4));
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        ActionsView.Item item;
        Boolean boolValueOf;
        nr6.b bVar = (nr6.b) this.f150608b;
        Data data = (Data) this.f150609c;
        fu6.h paymentDetails = (fu6.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        aim.e eVarB = u.b();
        ActionsView.Item item2 = null;
        ActionsView.Item item3 = (bVar.d == c0.AUTHORISED && bVar.f == nr6.c.MANUAL && ((Boolean) yhm.j.b(new hq1.f(paymentDetails.f138086a, 9)).getValue()).booleanValue()) ? new ActionsView.Item("ACTION_ID_CANCEL", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_action_cancel, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new hu6.b(bVar.f218537a), null, 24476) : null;
        if (item3 != null) {
            eVarB.add(item3);
        }
        ArrayList arrayList = paymentDetails.f138087b;
        if (arrayList.isEmpty()) {
            item = null;
        } else {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (((FreelancerOrderPaymentReceipt) it8.next()).f73460b.f73461a != null) {
                    item = new ActionsView.Item("ACTION_ID_RECEIPT", null, false, null, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_action_receipt, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_receipt, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, new hu6.c(arrayList), null, 24478);
                    break;
                }
            }
            item = null;
        }
        if (item != null) {
            eVarB.add(item);
        }
        if (data.getContent() != null) {
            nr6.w wVar = paymentDetails.f138086a;
            List list = (List) ue0.e.M(wVar.e);
            if (list != null) {
                List list2 = list;
                boolean z = false;
                if (!list2.isEmpty()) {
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            break;
                        }
                        AcquiringOrderPayment acquiringOrderPayment = (AcquiringOrderPayment) it9.next();
                        dj0.d dVar = acquiringOrderPayment.i;
                        if (dVar != null) {
                            long j2 = acquiringOrderPayment.f73358g.f115082a;
                            long j3 = dVar.f115082a;
                            boolValueOf = Boolean.valueOf(1 <= j3 && j3 < j2);
                        } else {
                            boolValueOf = null;
                        }
                        if (pd.b.j(boolValueOf)) {
                            z = true;
                            break;
                        }
                    }
                }
                item2 = new ActionsView.Item("ACTION_ID_REFUND", null, false, null, null, new TextLocalisedClause(z ? com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_action_refund_more : com.revolut.feature.freelancer.impl.R$string.freelancer_common_action_refund, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_revert_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new hu6.d(wVar), null, 24478);
            }
            if (item2 != null) {
                eVarB.add(item2);
            }
        }
        aim.e eVarA = u.a(eVarB);
        aim.e eVarB2 = u.b();
        if (!eVarA.isEmpty()) {
            eVarB2.add(new z("LIST_ID_ACTIONS", eVarA, null, null, 0, 0, 124));
        }
        return u.a(eVarB2);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        Integer num = (Integer) this.f150608b;
        qta.f fVar = (qta.f) this.f150609c;
        xzg.h content = (xzg.h) obj2;
        ((Boolean) obj3).getClass();
        b.a aVar = hx5.b.Companion;
        Intrinsics.checkNotNullParameter(content, "content");
        if (num != null) {
            xzg.i iVar = (xzg.i) d0.e0(num.intValue(), content.f309995b);
            if ((iVar != null ? Long.valueOf(iVar.f309998a) : null) != null) {
                return new TimeClause(((xzg.i) content.f309995b.get(num.intValue())).f309998a, new TimeClause.Format.Pretty(q0.DATETIME), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
            }
        }
        return hx5.b.b(fVar, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        String str;
        String str2;
        hz6.m mVar = (hz6.m) this.f150608b;
        hz6.e eVar = (hz6.e) this.f150609c;
        List content = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty() && zBooleanValue) {
            return hz6.m.a();
        }
        String str3 = eVar.f157041b;
        if (content.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        if (!kotlin.text.d0.W(str3)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : content) {
                BusinessCategory businessCategory = (BusinessCategory) obj5;
                if (kotlin.text.d0.J(businessCategory.f73443b, str3, true) || (((str = businessCategory.d) != null && kotlin.text.d0.J(str, str3, true)) || ((str2 = businessCategory.e) != null && kotlin.text.d0.J(str2, str3, true)))) {
                    arrayList.add(obj5);
                }
            }
            content = arrayList;
        }
        aim.e eVarB = u.b();
        if (content.isEmpty()) {
            FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("ITEM_ID_EMPTY_SEARCH_STATE", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_business_category_picker_search_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_business_category_picker_search_no_results_subtitle, u.c(str3), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, null, YearClass.CLASS_2016);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
        } else {
            List<BusinessCategory> list = content;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (BusinessCategory businessCategory2 : list) {
                String str4 = businessCategory2.f;
                Integer numValueOf = str4 != null ? Integer.valueOf(mVar.f157052a.a(str4)) : null;
                arrayList2.add(new RowDelegate.Model(businessCategory2.f73442a, (numValueOf == null || numValueOf.intValue() == 0) ? null : new RowDelegate.Model.MainImage.Image24(new ResourceImage(numValueOf.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextClause(businessCategory2.f73443b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, businessCategory2, null, 0, 0, 0, 0, 532676600));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList2);
        }
        return u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, x17.c] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v10, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object n(Object obj2, Object obj3, Object obj4) {
        ?? arrayList;
        Iterator it8;
        Iterator it9;
        vad.f fVar;
        TextLocalisedClause textLocalisedClause;
        Integer num;
        Style style;
        Clause textLocalisedClause2;
        xi0.b bVar;
        i27.o oVar = (i27.o) this.f150608b;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a aVar = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) this.f150609c;
        List orders = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Throwable th10 = (Throwable) obj4;
        Intrinsics.checkNotNullParameter(orders, "content");
        x17.f fVar2 = oVar.f157888b;
        u17.k kVar = oVar.f157887a;
        FreelancerSalesFilters$CompoundFreelancerSalesFilter compoundFilter = aVar.f74191b;
        boolean z = aVar.f;
        String str = aVar.f74192c;
        fVar2.getClass();
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(compoundFilter, "compoundFilter");
        x17.k kVar2 = fVar2.f302319a;
        List selectedStatuses = compoundFilter.f73470b;
        kVar2.getClass();
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(selectedStatuses, "selectedStatuses");
        List orders2 = x17.k.a(orders, selectedStatuses, new x17.i(kVar2, 0));
        x17.e eVar = fVar2.d;
        FilteringDateRange filteringDateRange = compoundFilter.e;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(orders2, "orders");
        List orders3 = eVar.a(orders2, filteringDateRange, new x1.n(10));
        ?? r112 = fVar2.e;
        String str2 = compoundFilter.f;
        String str3 = compoundFilter.f73472g;
        r112.getClass();
        Intrinsics.checkNotNullParameter(orders3, "orders");
        int i = 0;
        List list = (str2 == null && str3 == null) ? orders3 : null;
        if (list == null) {
            arrayList = new ArrayList();
            for (Object obj5 : orders3) {
                if (((OrderInitiationPage) obj5).f != null) {
                    arrayList.add(obj5);
                }
            }
        } else {
            arrayList = list;
        }
        List orders4 = r112.a(arrayList, str2, str3, new x1.n(9));
        fVar2.f.getClass();
        Intrinsics.checkNotNullParameter(orders4, "orders");
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj6 : orders4) {
                if (kotlin.text.d0.J(((OrderInitiationPage) obj6).e, str, true)) {
                    arrayList2.add(obj6);
                }
            }
            orders4 = arrayList2;
        }
        x17.d dVar = fVar2.f302322g;
        Set selectedCurrencies = compoundFilter.f73473h;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(orders4, "orders");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        if (!orders4.isEmpty() && !selectedCurrencies.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj7 : orders4) {
                OrderInitiationPage it10 = (OrderInitiationPage) obj7;
                Intrinsics.checkNotNullParameter(it10, "it");
                dj0.d dVar2 = it10.f;
                if ((dVar2 == null || (bVar = dVar2.f115083b) == null) && (bVar = it10.f86430g) == null) {
                    dj0.d.Companion.getClass();
                    bVar = dj0.d.f115081c;
                }
                if (selectedCurrencies.contains(bVar)) {
                    arrayList3.add(obj7);
                }
            }
            orders4 = arrayList3;
        }
        if (orders4.isEmpty() && zBooleanValue && z) {
            aim.e eVarB = u.b();
            eVarB.add(kVar.a(compoundFilter));
            eVarB.addAll(i27.o.a(null, true));
            return u.a(eVarB);
        }
        int i2 = 14;
        if (orders4.isEmpty() && !zBooleanValue && z) {
            z zVarA = kVar.a(compoundFilter);
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("NO_RESULTS_FOUND_ITEM_ID", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_no_results_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_no_results_action_clear_filters, null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return zhm.v.k(zVarA, model);
        }
        if (orders4.isEmpty() && !zBooleanValue) {
            List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_STATE_ITEM_ID", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_payment_links_placeholder_no_content_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_payment_links_placeholder_no_content_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), aVar.e ? new l6(12, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_payment_links_placeholder_no_content_action_create_new, null, null, 14), null, h4.ACCENT) : null, null, false, null, null, null, YearClass.CLASS_2016));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        ArrayList arrayList4 = new ArrayList();
        a0.x(u.c(kVar.a(compoundFilter)), arrayList4);
        aim.e eVarB2 = u.b();
        List listP0 = d0.P0(orders4, new i27.n());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj8 : listP0) {
            Integer numValueOf = Integer.valueOf(((OrderInitiationPage) obj8).f86428b.toLocalDate().getYear());
            Object objU = linkedHashMap.get(numValueOf);
            if (objU == null) {
                objU = v7.u(linkedHashMap, numValueOf);
            }
            ((List) objU).add(obj8);
        }
        Iterator it11 = linkedHashMap.entrySet().iterator();
        while (it11.hasNext()) {
            Map.Entry entry = (Map.Entry) it11.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list2 = (List) entry.getValue();
            eVarB2.add(new ListSubheaderDelegate.Model(a0.d.n("PAYMENT_LINK_SUBHEADER_", iIntValue), (Image) null, (Clause) new TextClause(String.valueOf(iIntValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            List list3 = list2;
            ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
            Iterator it12 = list3.iterator();
            while (it12.hasNext()) {
                OrderInitiationPage orderInitiationPage = (OrderInitiationPage) it12.next();
                String str4 = orderInitiationPage.f86427a;
                xi0.b bVar2 = orderInitiationPage.f86430g;
                TextClause textClause = new TextClause(orderInitiationPage.e, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                aim.e eVarB3 = u.b();
                vad.f fVar3 = orderInitiationPage.f86429c;
                int[] iArr = i27.m.f157886a;
                switch (iArr[fVar3.ordinal()]) {
                    case 1:
                        it8 = it11;
                        it9 = it12;
                        fVar = fVar3;
                        num = null;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_payment_links_filters_statuses_kind_active, null, new Custom(Integer.valueOf(R$attr.uikit_colorLightGreen), false, null, false, null, 254), 10);
                        break;
                    case 2:
                        it8 = it11;
                        it9 = it12;
                        fVar = fVar3;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_payment_links_filters_statuses_kind_suspended, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10);
                        num = null;
                        break;
                    case 3:
                        it8 = it11;
                        it9 = it12;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_payment_links_filters_statuses_kind_completed, null, null, i2);
                        num = null;
                        fVar = fVar3;
                        break;
                    case 4:
                        it8 = it11;
                        it9 = it12;
                        fVar = fVar3;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_payment_links_filters_statuses_kind_expired, null, null, i2);
                        num = null;
                        break;
                    case 5:
                    case 6:
                        it8 = it11;
                        it9 = it12;
                        fVar = fVar3;
                        textLocalisedClause = null;
                        num = null;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (textLocalisedClause != null) {
                    eVarB3.add(textLocalisedClause);
                    eVarB3.add(new DotDividerClause(num));
                }
                int i3 = i;
                eVarB3.add(new TimeClause(oi0.d.R(orderInitiationPage.f86428b), new TimeClause.Format.DayAndMonth(i3), null, null, 12));
                Unit unit = Unit.f186387a;
                CompositeClause compositeClause = new CompositeClause(u.a(eVarB3), null, null, null, 14);
                dj0.d dVar3 = orderInitiationPage.f;
                if (dVar3 != null) {
                    textLocalisedClause2 = new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), iArr[fVar.ordinal()] == 3 ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254) : new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8);
                    style = null;
                } else if (bVar2 != null) {
                    style = null;
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.merchant_ui_order_initiation_page_item_amount_set_by_customer_title, null, iArr[fVar.ordinal()] == 3 ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254) : new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
                } else {
                    style = null;
                    textLocalisedClause2 = null;
                }
                RowDelegate.Model model2 = new RowDelegate.Model(str4, null, textClause, null, 0, compositeClause, null, null, 0, new RowDelegate.Model.c.b(textLocalisedClause2, bVar2 != null ? new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, style, 4) : style, null, false, 124), false, null, false, null, null, null, null, null, null, orderInitiationPage, null, 0, 0, 0, 0, 532675546);
                yp0.b.l(model2, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                arrayList5.add(model2);
                i = i3;
                it11 = it8;
                it12 = it9;
                i2 = 14;
            }
            eVarB2.addAll(arrayList5);
            i2 = 14;
        }
        eVarB2.addAll(i27.o.a(th10, zBooleanValue));
        a0.x(u.a(eVarB2), arrayList4);
        return arrayList4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c4  */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [com.revolut.core.ui_kit.models.TextClause] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32, types: [int] */
    /* JADX WARN: Type inference failed for: r9v33, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r66, java.lang.Object r67, java.lang.Object r68) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb4.n.o(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        i47.r rVar = (i47.r) this.f150608b;
        i47.h hVar = (i47.h) this.f150609c;
        ds6.d0 filters = (ds6.d0) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(filters, "filters");
        aim.e eVarB = u.b();
        if (filters.e == 0) {
            eVarB.add(w47.b.c(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_no_transactions_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_transaction_export_no_transactions_subtitle, null, null, 14)));
        } else {
            eVarB.addAll(w47.b.b(hVar.e, hVar.f158289c, filters.f, 3));
            if (filters.e <= 2000) {
                eVarB.addAll(w47.b.a(rVar.f158307a, hVar.d, hVar.f158288b, 9, zBooleanValue));
            }
        }
        return u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x046e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb4.n.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        BigDecimal bigDecimal;
        i5i.b bVar = (i5i.b) this.f150608b;
        Screen.TransactionPriceDescription screen = (Screen.TransactionPriceDescription) this.f150609c;
        jel.c instrumentDetails = (jel.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        bVar.i.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        if (!(instrumentDetails instanceof jel.m)) {
            throw new IllegalStateException("Only BondDetails are supported, but details=" + instrumentDetails);
        }
        jel.m mVar = (jel.m) instrumentDetails;
        TransactionUnitsType transactionUnitsType = screen.e;
        BigDecimal bigDecimal2 = screen.f97148c;
        Asset asset = screen.d;
        TransactionUnitsType.Lots lots = transactionUnitsType instanceof TransactionUnitsType.Lots ? (TransactionUnitsType.Lots) transactionUnitsType : null;
        if (lots == null || (bigDecimal = lots.f97102a) == null) {
            throw new IllegalStateException("lotQuantity is expected, but null");
        }
        BigDecimal bigDecimalMultiply = bigDecimal2.multiply(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        t tVar = new t(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_lot_title, u.c(new AssetClause(bigDecimalMultiply, i5i.g.a(asset.f104719a), asset.f104720b, null, null, 24)), null, 12), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_lot_description, null, null, 14), null, 28);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_dirty_price, null, null, 14);
        BigDecimal scale = bigDecimal2.setScale(4, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        AssetClause assetClause = new AssetClause(scale, i5i.g.a(asset.f104719a), asset.f104720b, null, o9.NON_SENSITIVE, 8);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        jel.j jVar = mVar.f173501g;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("DIRTY_PRICE_CELL", textLocalisedClause, assetClause, null, resourceImage, true, 0, null, new i5i.c(jVar.f173479a, jVar.f173481c), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_orders_bonds_dialog_price_description_units, null, null, 14);
        String plainString = (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        List listK = zhm.v.k(model, new CellDetailsDelegate.Model("UNITS_CELL", textLocalisedClause2, new TextClause(plainString, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new i5i.d(mVar.d.d, bigDecimal), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008));
        yp0.b.k(listK, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, 28);
        return new y(listK, tVar, rp0.l.WINDOW, null, screen, null, 984);
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        Object next;
        i6a.b bVar = (i6a.b) this.f150608b;
        g6a.f fVar = (g6a.f) this.f150609c;
        w5a.f paymentsMigrationDetails = (w5a.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(paymentsMigrationDetails, "paymentsMigrationDetails");
        List list = paymentsMigrationDetails.f294768a;
        String str = fVar.f140900b;
        List<w5a.d> list2 = list;
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((w5a.d) next).f294764a, str)) {
                break;
            }
        }
        w5a.d dVar = (w5a.d) next;
        if (dVar == null && (dVar = (w5a.d) d0.d0(list)) == null) {
            return new g6a.l(e6a.b.a(null), null, null, null, false, false, 14);
        }
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (w5a.d dVar2 : list2) {
            arrayList.add(new com.revolut.core.ui_kit.views.q(dVar2.f294764a, new com.revolut.core.ui_kit.views.t(new TextClause(dVar2.f294765b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), 58));
        }
        return new g6a.l(bVar.f158903a.a("", dVar.f294766c), arrayList, dVar.f294764a, null, arrayList.size() > 1, true, 8);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    private final Object t(Object obj2, Object obj3, Object obj4) {
        Collection collectionD;
        i83.p pVar = (i83.p) this.f150608b;
        i83.f fVar = (i83.f) this.f150609c;
        List cards = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cards, "cards");
        i83.j jVar = fVar.f159418a;
        CellDetailsChevronDelegate.Model model = null;
        if (((Boolean) pVar.d.getValue()).booleanValue()) {
            List list = cards;
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : list) {
                if (((TerminatedCard) obj5).f65551h.f65542a) {
                    arrayList.add(obj5);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj6 : list) {
                if (!((TerminatedCard) obj6).f65551h.f65542a) {
                    arrayList2.add(obj6);
                }
            }
            Collection collectionD2 = (arrayList.isEmpty() && arrayList2.isEmpty()) ? i83.p.d(com.revolut.feature.cards_core.R$string.card_reactivate_no_cards_title) : arrayList.isEmpty() ? i83.p.d(com.revolut.feature.cards_core.R$string.card_reactivate_empty_title) : pVar.b(arrayList);
            aim.e eVarB = u.b();
            eVarB.addAll(collectionD2);
            if (!arrayList2.isEmpty()) {
                eVarB.add(new ListSubheaderDelegate.Model("CANNOT_REACTIVATE_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_reactivate_cannot_reactivate_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                eVarB.addAll(pVar.b(arrayList2));
            }
            return u.a(eVarB);
        }
        List list2 = cards;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj7 : list2) {
            if (((TerminatedCard) obj7).f65551h.f65542a) {
                arrayList3.add(obj7);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj8 : list2) {
            if (!((TerminatedCard) obj8).f65551h.f65542a) {
                arrayList4.add(obj8);
            }
        }
        int i = i83.o.f159427a[jVar.ordinal()];
        if (i == 1) {
            collectionD = (arrayList3.isEmpty() && arrayList4.isEmpty()) ? i83.p.d(com.revolut.feature.cards_core.R$string.card_reactivate_no_cards_title) : arrayList3.isEmpty() ? i83.p.d(com.revolut.feature.cards_core.R$string.card_reactivate_empty_title) : pVar.b(arrayList3);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            collectionD = arrayList4.isEmpty() ? i83.p.d(com.revolut.feature.cards_core.R$string.card_reactivate_empty_title) : pVar.b(arrayList4);
        }
        int size = arrayList4.size();
        if (jVar == i83.j.CAN_ACTIVATE && size > 0) {
            CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("CANNOT_REACTIVATE_CELL_DETAILS_LIST_ID", new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_reactivate_cannot_reactivate_title, null, null, 14), 0, false, null, null, null, 2044);
            yp0.b.l(model2, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
            model = model2;
        }
        aim.e eVarB2 = u.b();
        eVarB2.addAll(collectionD);
        n14.e.b(eVarB2, model);
        return u.a(eVarB2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x09a6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r50, java.lang.Object r51, java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 2747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb4.n.u(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r66, java.lang.Object r67, java.lang.Object r68) {
        /*
            Method dump skipped, instruction units count: 3530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb4.n.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ n(Integer num, hx5.b bVar, qta.f fVar) {
        this.f150607a = 18;
        this.f150608b = num;
        this.f150609c = fVar;
    }

    public /* synthetic */ n(Object obj2, Object obj3, int i) {
        this.f150607a = i;
        this.f150608b = obj2;
        this.f150609c = obj3;
    }
}
