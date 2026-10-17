package njj;

import android.os.Parcelable;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.sf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.v3;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.y3;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.insurance_embedded.impl.data.model.BottomSheet;
import com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout;
import com.revolut.feature.insurance_embedded.impl.data.model.LegalNotice;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.tracking.v3.IdContext;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.bk0;
import ip0.ck0;
import ip0.jl0;
import ip0.pr;
import ip0.qd0;
import ip0.yj0;
import ip0.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ms0.i4;
import mx0.v5;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f216550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f216551c;

    public /* synthetic */ c1(Object obj2, int i, Object obj3, Object obj4) {
        this.f216549a = i;
        this.f216550b = obj3;
        this.f216551c = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x071a  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable$Shimmering$Companion, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r22v9, types: [com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r75v3 */
    /* JADX WARN: Type inference failed for: r75v4 */
    /* JADX WARN: Type inference failed for: r75v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r74, java.lang.Object r75, java.lang.Object r76) {
        /*
            Method dump skipped, instruction units count: 2407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: njj.c1.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04c8 A[Catch: all -> 0x04d8, TryCatch #1 {all -> 0x04d8, blocks: (B:174:0x04b7, B:175:0x04c2, B:177:0x04c8, B:179:0x04d4, B:182:0x04da, B:183:0x04e6, B:189:0x04f6, B:190:0x04fa, B:194:0x0507, B:197:0x050b), top: B:314:0x04b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0590 A[LOOP:14: B:206:0x058a->B:208:0x0590, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023d A[Catch: all -> 0x024d, TryCatch #4 {all -> 0x024d, blocks: (B:88:0x022c, B:89:0x0237, B:91:0x023d, B:93:0x0249, B:96:0x024f, B:97:0x025b, B:99:0x0261, B:102:0x026b, B:103:0x026f, B:105:0x0277, B:106:0x027a, B:107:0x027b), top: B:318:0x022c }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0261 A[Catch: all -> 0x024d, TryCatch #4 {all -> 0x024d, blocks: (B:88:0x022c, B:89:0x0237, B:91:0x023d, B:93:0x0249, B:96:0x024f, B:97:0x025b, B:99:0x0261, B:102:0x026b, B:103:0x026f, B:105:0x0277, B:106:0x027a, B:107:0x027b), top: B:318:0x022c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r53, java.lang.Object r54, java.lang.Object r55) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: njj.c1.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r65, java.lang.Object r66, java.lang.Object r67) {
        /*
            Method dump skipped, instruction units count: 1654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: njj.c1.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        int i;
        o07.j jVar = (o07.j) this.f216550b;
        o07.b bVar = (o07.b) this.f216551c;
        List fees = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(fees, "fees");
        l71.d dVar = (l71.d) bVar.f221160b.getContent();
        aim.e eVarB = zhm.u.b();
        List<as6.b> list = fees;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (as6.b bVar2 : list) {
            List list2 = bVar2.f8798b;
            as6.a aVar = bVar2.f8797a;
            if (!list2.isEmpty()) {
                String strName = aVar.name();
                switch (o07.i.f221169a[aVar.ordinal()]) {
                    case 1:
                        i = R$string.freelancer_processing_fees_group_customer_not_present_title;
                        break;
                    case 2:
                        i = R$string.freelancer_processing_fees_group_customer_present_title;
                        break;
                    case 3:
                        i = R$string.freelancer_processing_fees_group_tap_to_pay_title;
                        break;
                    case 4:
                        i = R$string.freelancer_processing_fees_group_revolut_pay_customer_not_present_title;
                        break;
                    case 5:
                        i = R$string.freelancer_processing_fees_group_revolut_pay_customer_present_title;
                        break;
                    case 6:
                        i = R$string.freelancer_processing_fees_group_open_banking_title;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                eVarB.add(new ListSubheaderDelegate.Model(strName, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, R$attr.uikit_dp16, 0, 49146));
            }
            List list3 = bVar2.f8798b;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                ArrayList arrayListA = jVar.f221170a.a(aVar, (List) it8.next());
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                arrayList2.add(Boolean.valueOf(eVarB.addAll(arrayListA)));
            }
            arrayList.add(arrayList2);
        }
        if (!eVarB.isEmpty() && l71.f.g(dVar)) {
            eVarB.add(new TextDelegate.Model("ID_LIST_PT_FEE_FOOTER", new TextLocalisedClause(R$string.freelancer_processing_fees_disclaimer_additional_taxes, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        }
        return zhm.u.a(eVarB);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        bw0.m mVar;
        PlainTextDelegate.Model model;
        o27.w wVar = (o27.w) this.f216550b;
        o27.l lVar = (o27.l) this.f216551c;
        o27.k refundInfo = (o27.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(refundInfo, "refundInfo");
        aim.e eVarB = zhm.u.b();
        dj0.d dVar = lVar.f221517b;
        dj0.d dVar2 = lVar.f221518c;
        TextClause textClause = new TextClause(dVar.f115083b.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        nx0.e eVar = nx0.e.NONE;
        w80.b bVar = wVar.f221533a;
        dj0.d dVar3 = lVar.f221516a;
        String strE = bVar.e(dVar3);
        String string = u80.o.b(new u80.g(dVar3, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
        o27.j jVar = lVar.d;
        bw0.h hVar = new bw0.h(strE, string, null, true, null, Boolean.valueOf(jVar == o27.j.AMOUNT), false, false, null, null, null, null, 32724);
        boolean z = refundInfo.f221513a.f221510b;
        dj0.d totalProBalance = refundInfo.f221515c;
        Intrinsics.checkNotNullParameter(totalProBalance, "totalProBalance");
        bw0.m mVar2 = new bw0.m(new TextLocalisedClause(R$string.freelancer_refund_input_subtitle, zhm.u.c(new MoneyClause(totalProBalance, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), z ? bw0.l.INFO : bw0.l.ERROR, null, false, null, 20);
        dj0.d amountToRefund = lVar.f221517b;
        o27.i iVar = refundInfo.f221514b;
        dj0.d dVar4 = iVar != null ? iVar.f221512a : null;
        boolean z3 = refundInfo.f221513a.f221511c;
        Intrinsics.checkNotNullParameter(amountToRefund, "amountToRefund");
        if (dVar4 != null) {
            mVar = new bw0.m(new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), z3 ? bw0.l.ACTION_INFO : bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 24);
        } else {
            mVar = !z3 ? new bw0.m(new TextLocalisedClause(R$string.freelancer_refund_input_error_exceeds_max, zhm.u.c(new MoneyClause(amountToRefund, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.ERROR, null, false, null, 28) : null;
        }
        AmountEditDelegate.Model model2 = new AmountEditDelegate.Model("LIST_ID_AMOUNT_EDIT_INPUT", textClause, hVar, eVar, null, mVar2, mVar, false, dVar3.f115083b, null, 1680);
        yp0.b.r(model2, 0, dVar2 != null ? R$attr.uikit_dp0 : R$attr.uikit_dp8, 0, 0, 13);
        if (dVar2 != null) {
            int i = R$string.freelancer_refund_equivalent_amount_disclaimer_footer;
            MoneyClause moneyClause = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, zhm.v.k(moneyClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            pa paVar = pa.LIGHT;
            int i2 = R$attr.uikit_dp0;
            PlainTextDelegate.Model model3 = new PlainTextDelegate.Model("LIST_ID_AMOUNT_EDIT_INFO_TEXT", (Clause) null, (Clause) textLocalisedClause, (v5) null, (UrlImage) null, false, paVar, (Object) null, (AnalyticsContext) null, i2, i2, 0, 0, 52718);
            yp0.b.r(model3, R$attr.uikit_dp0, 0, 0, 0, 14);
            model = model3;
        } else {
            model = null;
        }
        Object[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        eVarB.addAll(kotlin.collections.d.L(elements));
        InputTextDelegate.Model model4 = new InputTextDelegate.Model("LIST_ID_REASON_INPUT", new TextClause(lVar.f221519g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.freelancer_common_word_reason, null, null, 14), null, false, null, false, new TextLocalisedClause(R$string.freelancer_common_word_optional, null, null, 14), null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, pr.f165860a, false, jVar == o27.j.REASON, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -83886216, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model4);
        return zhm.u.a(eVarB);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        o88.b bVar = (o88.b) this.f216550b;
        String listId = (String) this.f216551c;
        n78.d challengesInfo = (n78.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(challengesInfo, "challengesInfo");
        p88.a aVar = bVar.f222959c;
        List tasks = challengesInfo.f213040a;
        sf8.h uiState = challengesInfo.f213042c;
        ((p88.b) aVar).getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause((tasks.isEmpty() && c8g.a.l(uiState)) ? com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_challenges_empty_title : com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_challenges_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        List list = tasks;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (((dp8.b) obj5).e == dp8.h.PLANNED) {
                arrayList.add(obj5);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list) {
            if (((dp8.b) obj6).e == dp8.h.COMPLETED) {
                arrayList2.add(obj6);
            }
        }
        if (!c8g.a.l(uiState)) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_challenges_inactive_kid_subtitle, null, null, 14);
        } else if (!arrayList.isEmpty() || arrayList2.isEmpty()) {
            textLocalisedClause = !arrayList.isEmpty() ? new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_challenges_multiple_planned_subtitle, zhm.u.c(Integer.valueOf(arrayList.size())), null, 12) : null;
        } else {
            int i = com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_challenges_all_completed_subtitle;
            dj0.d.Companion.getClass();
            dj0.d dVar = dj0.d.e;
            int i2 = 0;
            dj0.d dVarO = dVar;
            for (Object obj7 : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    zhm.v.s();
                    throw null;
                }
                dVarO = i2 == 0 ? ((dp8.b) obj7).f : pyd.c.O(dVarO, ((dp8.b) obj7).f);
                i2 = i3;
            }
            textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        }
        return new AvatarWidgetDelegate.Model(listId, LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_entertainment, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, textLocalisedClause2, textLocalisedClause, null, null, null, null, new q88.a(c8g.a.l(uiState)), null, 12240);
    }

    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6 */
    private final Object h(Object obj2, Object obj3, Object obj4) {
        NaviCommand naviCommand;
        j8 j8Var;
        int i;
        List list;
        ?? r112;
        TextLocalisedClause textLocalisedClause;
        kotlin.jvm.internal.s0 s0Var;
        aim.e eVar;
        String inviteeName = (String) this.f216550b;
        l8e.d dVar = (l8e.d) this.f216551c;
        l8e.a content = (l8e.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Set permissions = content.f192958b.f234906g;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        boolean zContains = permissions.contains(pcd.y.WITHDRAW);
        kotlin.jvm.internal.s0 s0Var2 = new kotlin.jvm.internal.s0(2);
        s0Var2.a(new ListSubheaderDelegate.Model("USER_PERMISSIONS_SUB_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.vaults.R$string.subaccount_group_invite_permissions_user_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        List listK = zhm.v.k(new ListCellDelegate.Model("USER_PERMISSIONS_DEPOSIT_ITEM_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_arrows_sort, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), new TextLocalisedClause(zContains ? com.revolut.feature.vaults.R$string.subaccount_group_invite_permissions_user_can_withdraw : com.revolut.feature.vaults.R$string.subaccount_group_invite_permissions_user_cannot_withdraw, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072), new ListCellDelegate.Model("USER_PERMISSIONS_SEE_MEMBERS_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_group_vaults_invitation_screen_your_permissions_second, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072), new ListCellDelegate.Model("USER_PERMISSIONS_LEAVE_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_broken_heart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), new TextLocalisedClause(com.revolut.feature.vaults.R$string.group_pocket_onboarding_your_permissions_third, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072));
        yp0.b.k(listK, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        s0Var2.b(listK.toArray(new ListCellDelegate.Model[0]));
        ArrayList arrayList = s0Var2.f186433a;
        List listK2 = zhm.v.k(arrayList.toArray(new qv0.i[arrayList.size()]));
        wi0.b currentMemberCountry = content.d;
        boolean z = content.e;
        NaviCommand naviCommand2 = dVar.f192962c;
        Intrinsics.checkNotNullParameter(currentMemberCountry, "currentMemberCountry");
        Intrinsics.checkNotNullParameter(inviteeName, "inviteeName");
        kotlin.jvm.internal.s0 s0Var3 = new kotlin.jvm.internal.s0(2);
        s0Var3.a(new ListSubheaderDelegate.Model("OTHER_MEMBERS_SUB_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.vaults.R$string.subaccount_group_invite_permissions_other_members_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        aim.e eVarB = zhm.u.b();
        eVarB.add(new ListCellDelegate.Model("OTHER_MEMBERS_SEE_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_eye_show, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_group_vaults_invitation_screen_others_permissions_first, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072));
        if (z) {
            eVarB.add(new ListCellDelegate.Model("OTHER_MEMBERS_WITHDRAW_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_group_vaults_invitation_screen_others_permissions_second, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072));
        }
        j8 j8Var2 = new j8(new ResourceImage(R$drawable.uikit_icn_24_add_contact, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        wi0.b.Companion.getClass();
        if (currentMemberCountry.equals(wi0.b.O)) {
            j8Var = j8Var2;
            naviCommand = naviCommand2;
            list = listK2;
            i = 12;
            r112 = 0;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.group_pockets_invitation_screen_others_permissions_close_co, zhm.u.c(new TextClause(inviteeName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        } else {
            naviCommand = naviCommand2;
            j8Var = j8Var2;
            i = 12;
            list = listK2;
            r112 = 0;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.group_pockets_invitation_screen_others_permissions_close, null, null, 14);
        }
        eVarB.add(new ListCellDelegate.Model("OTHER_MEMBERS_OWNER_CAN_CLOSE_ID", j8Var, textLocalisedClause, null, false, null, null, 0, 0, 0, 0, 4072));
        if (!com.bumptech.glide.d.r(currentMemberCountry) || naviCommand == null) {
            s0Var = s0Var3;
            eVar = eVarB;
        } else {
            s0Var = s0Var3;
            eVar = eVarB;
            eVar.add(new ListCellDelegate.Model("OTHER_MEMBERS_PRIVACY_POLICY_ID", null, new TextLocalisedClause(com.revolut.feature.vaults.R$string.group_pockets_invitation_screen_privacy_policy_footer_privacy_disclaimer, zhm.u.c(new TextLocalisedClause(com.revolut.feature.vaults.R$string.group_pockets_invitation_screen_privacy_policy_footer_privacy_disclaimer_action, r112, new Click(28, (Integer) null, (Object) naviCommand, "privacy_policy", false), 10)), r112, i), null, false, null, null, 0, 0, 0, 0, 4072));
        }
        aim.e eVarA = zhm.u.a(eVar);
        yp0.b.k(eVarA, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        s0Var.b(eVarA.toArray(new ListCellDelegate.Model[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        return zhm.w.u(zhm.v.k(list, zhm.v.k(arrayList2.toArray(new qv0.i[arrayList2.size()]))));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        o9d.d dVar = (o9d.d) this.f216550b;
        m9d.z zVar = (m9d.z) this.f216551c;
        List items = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        boolean z = zVar.f203758l;
        List<cj0.a> list = items;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (cj0.a aVar : list) {
            String strQ = j6.a.q("QUICK_HELP_ACTION_ITEM_ID", aVar.f24567a);
            TextClause textClause = new TextClause(aVar.f24567a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            UrlImage urlImage = new UrlImage(aVar.f24569c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            com.google.protobuf.w0 w0VarD = kii.e.d(IdContext.newBuilder(), aVar.f24568b, AnalyticsContext.INSTANCE);
            int i = R$attr.uikit_dp12;
            arrayList.add(new RowDelegate.Model(strQ, urlImage, null, null, textClause, null, null, null, 0, null, false, false, null, null, null, null, null, aVar, new AnalyticsContext(w0VarD), i, i, 0, 0, 822083564));
        }
        TextLocalisedClause textLocalisedClause = ((rf3.d) dVar.f223255b).b() == j30.b.FULLY_ENABLED ? new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_quick_help_articles, null, null, 14) : new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_quick_help_frequently_asked_questions, null, null, 14);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_library, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), null, null, false, null, false, 60);
        int i2 = R$attr.uikit_dp12;
        ArrayList arrayListF0 = zhm.d0.F0(new RowDelegate.Model("FREQUENTLY_ASKED_QUESTIONS_ITEM_ID", image40, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i2, i2, 0, 0, 486539256), arrayList);
        yp0.b.k(arrayListF0, 0, 0, 0, 0, 31);
        return arrayListF0;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        i3g.k kVar = (i3g.k) this.f216550b;
        obc.h hVar = (obc.h) this.f216551c;
        obc.g content = (obc.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        String query = hVar.f223918b;
        nd.n nVar = (nd.n) kVar.f158221b;
        if (content instanceof obc.d) {
            obc.d carrierSearchState = (obc.d) content;
            Intrinsics.checkNotNullParameter(carrierSearchState, "carrierSearchState");
            aim.e eVarB = zhm.u.b();
            List list = carrierSearchState.f223913a;
            List list2 = carrierSearchState.f223914b;
            List list3 = list;
            if (!list3.isEmpty()) {
                eVarB.add(new ListSubheaderDelegate.Model("SUGGESTED_CARRIERS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_shipping_carrier_search_suggested_carriers, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338));
                eVarB.addAll(nVar.j(list));
            }
            if (!list2.isEmpty()) {
                if (!list3.isEmpty()) {
                    eVarB.add(new ListSubheaderDelegate.Model("ALL_CARRIERS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_shipping_carrier_search_all_carriers, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338));
                }
                eVarB.addAll(nVar.j(list2));
            }
            return zhm.u.a(eVarB);
        }
        if (content instanceof obc.e) {
            obc.e carrierSearchState2 = (obc.e) content;
            Intrinsics.checkNotNullParameter(carrierSearchState2, "carrierSearchState");
            return nVar.j(carrierSearchState2.f223915a);
        }
        if (!(content instanceof obc.f)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(query, "query");
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("NO_RESULTS_LIST_ID", new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_shipping_carrier_search_empty_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_shipping_carrier_search_empty_results_subtitle, zhm.u.c(query), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.revolutpay.order_tracking.impl.R$string.revolut_pay_shipping_carrier_search_empty_results_clear_search, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [zhm.f0] */
    private final Object k(Object obj2, Object obj3, Object obj4) throws Throwable {
        TextClause textClause;
        TextLocalisedClause textLocalisedClause;
        Object next;
        List list;
        int i;
        i3g.k kVar = (i3g.k) this.f216550b;
        oc4.d dVar = (oc4.d) this.f216551c;
        mu3.b content = (mu3.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        w74.a aVar = (w74.a) kVar.f158221b;
        ax4.b constructorState = dVar.f224093a;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(constructorState, "constructorState");
        List list2 = content.f;
        String str = content.e;
        List<mu3.a> list3 = list2;
        for (mu3.a aVar2 : list3) {
            if (Intrinsics.f(aVar2.f208943a, str)) {
                String str2 = aVar2.f208945c;
                Throwable th10 = null;
                TextLocalisedClause textLocalisedClause2 = str2 != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_constructor_tabbed_content_action_button, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
                String str3 = content.f208946a;
                String str4 = content.e;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                int i2 = 0;
                for (Object obj5 : list3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        Throwable th11 = th10;
                        zhm.v.s();
                        throw th11;
                    }
                    mu3.a aVar3 = (mu3.a) obj5;
                    String str5 = aVar3.f208943a;
                    String str6 = str3;
                    List list4 = list2;
                    if (i2 != 0) {
                        list = list3;
                        i = i2 != 1 ? i2 != 2 ? com.revolut.feature.credit.core.R$string.credit_application_constructor_tabbed_content_tab_title : com.revolut.feature.credit.core.R$string.credit_application_constructor_tabbed_content_tab_title_third : com.revolut.feature.credit.core.R$string.credit_application_constructor_tabbed_content_tab_title_second;
                    } else {
                        list = list3;
                        i = com.revolut.feature.credit.core.R$string.credit_application_constructor_tabbed_content_tab_title_first;
                    }
                    arrayList.add(new com.revolut.core.ui_kit.views.q(str5, new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(i, zhm.u.c(new TextClause(aVar3.f208944b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)), 58));
                    th10 = null;
                    i2 = i3;
                    str3 = str6;
                    str4 = str4;
                    list2 = list4;
                    list3 = list;
                }
                List<mu3.a> list5 = list3;
                List listL = zhm.v.l(list2.size() > 1 ? new TabsDelegate.Model(str3, arrayList, str4, null, null, null, 0, 0, null, 8184) : null);
                for (mu3.a aVar4 : list5) {
                    if (Intrinsics.f(aVar4.f208943a, str)) {
                        ArrayList items = zhm.d0.E0(aVar.f295465a.b(aVar4.d, constructorState), listL);
                        Intrinsics.checkNotNullParameter(items, "items");
                        String str7 = content.f208947b;
                        if (str7 == null) {
                            m70.a.c(kotlin.jvm.internal.t0.f186434a);
                            str7 = "";
                        }
                        TextLocalisedClause textLocalisedClauseG = i3g.k.g(str7);
                        String str8 = content.f208948c;
                        if (str8 != null) {
                            textClause = null;
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_constructor_tabbed_content_description, zhm.u.c(new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                        } else {
                            textClause = null;
                            textLocalisedClause = null;
                        }
                        String str9 = content.d;
                        TextClause textClause2 = str9 != null ? new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textClause;
                        ax4.b bVar = dVar.f224093a;
                        Iterator it8 = content.f.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                next = textClause;
                                break;
                            }
                            next = it8.next();
                            if (Intrinsics.f(((mu3.a) next).f208943a, str)) {
                                break;
                            }
                        }
                        mu3.a aVar5 = (mu3.a) next;
                        ?? r92 = aVar5 != null ? aVar5.d : textClause;
                        if (r92 == 0) {
                            r92 = zhm.f0.f322471a;
                        }
                        return new oc4.h(textLocalisedClauseG, textLocalisedClause, textClause2, textLocalisedClause2, ix4.b.a(r92, bVar), items);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v17, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: njj.c1.l(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.lang.Object[], qv0.i[]] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    private final Object m(Object obj2, Object obj3, Object obj4) {
        char c2;
        char c3;
        aim.e eVar;
        ?? r112;
        RowDelegate.Model modelD;
        ?? D;
        ?? D2;
        ?? model;
        com.revolut.feature.retail.privacy.impl.ui.flow.screen.b bVar = (com.revolut.feature.retail.privacy.impl.ui.flow.screen.b) this.f216550b;
        ocb.g gVar = (ocb.g) this.f216551c;
        qla.a content = (qla.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int i = ocb.m.f224185a[content.ordinal()];
        if (i != 1) {
            if (i == 2) {
                qv0.i[] elements = {com.revolut.feature.retail.privacy.impl.ui.flow.screen.b.b(gVar.f224180m), bVar.g(gVar.f224175c), bVar.e(gVar.f), com.revolut.feature.retail.privacy.impl.ui.flow.screen.b.d(bVar, "ID_PAYMENTS_PROFILE_REVEAL", R$drawable.uikit_icn_24_image, com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_payments_reveal_name_title, Integer.valueOf(com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_payments_reveal_name_subtitle), null, gVar.e, 208), bVar.f(com.revolut.retail.common.ui.R$string.application_full_name, gVar.d), com.revolut.feature.retail.privacy.impl.ui.flow.screen.b.d(bVar, "ID_FLIP_GESTURE_HIDE_BALANCES", R$drawable.uikit_icn_24_device_down, com.revolut.feature.retail.privacy.impl.R$string.profileHome_settings_item_hide_balances_gesture_toggle_title, Integer.valueOf(com.revolut.feature.retail.privacy.impl.R$string.profileHome_settings_item_hide_balances_gesture_toggle_description), null, gVar.f224174b, 208)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return listL;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aim.e eVarB = zhm.u.b();
            List listC = bVar.c(gVar);
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            eVarB.addAll(listC);
            RowDelegate.Model modelF = bVar.f(com.revolut.retail.common.ui.R$string.revolutx_application_full_name, gVar.d);
            yp0.b.l(modelF, 0, 0, 0, 0, null, false, 63);
            eVarB.add(modelF);
            return zhm.u.a(eVarB);
        }
        aim.e eVarB2 = zhm.u.b();
        List listC2 = bVar.c(gVar);
        yp0.b.k(listC2, 0, 0, 0, 0, 31);
        eVarB2.addAll(listC2);
        RowDelegate.Model modelB = com.revolut.feature.retail.privacy.impl.ui.flow.screen.b.b(gVar.f224180m);
        if (gVar.f224178j) {
            c2 = 4;
            c3 = 3;
            r112 = 0;
            eVar = eVarB2;
            modelD = com.revolut.feature.retail.privacy.impl.ui.flow.screen.b.d(bVar, "ID_MEXICO_FOREIGN_CURRENCIES_CARD", R$drawable.uikit_icn_24_card, com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_mcy_card_title, Integer.valueOf(com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_mcy_card_subtitle), null, gVar.k, 208);
        } else {
            c2 = 4;
            c3 = 3;
            eVar = eVarB2;
            r112 = 0;
            modelD = null;
        }
        RowDelegate.Model modelG = bVar.g(gVar.f224175c);
        RowDelegate.Model modelE = bVar.e(gVar.f);
        RowDelegate.Model modelD2 = com.revolut.feature.retail.privacy.impl.ui.flow.screen.b.d(bVar, "ID_PAYMENTS_PROFILE_REVEAL", R$drawable.uikit_icn_24_image, com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_payments_reveal_name_title, Integer.valueOf(com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_payments_reveal_name_subtitle), null, gVar.e, 208);
        Boolean bool = gVar.f224177h;
        ?? D3 = bool != null ? com.revolut.feature.retail.privacy.impl.ui.flow.screen.b.d(bVar, "ID_PAYMENTS_MESSAGING_PRICING_PLAN_REVEAL", R$drawable.uikit_icn_24_premium, com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_plan_reveal_title, Integer.valueOf(com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_plan_reveal_subtitle), null, bool.booleanValue(), 208) : r112;
        ocb.a0 a0Var = gVar.i;
        if (a0Var instanceof ocb.z) {
            D = com.revolut.feature.retail.privacy.impl.ui.flow.screen.b.d(bVar, "ID_BIRTHDAY_SHARING", R$drawable.uikit_icn_24_present, com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_payments_birthday_sharing_title, Integer.valueOf(com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_payments_birthday_sharing_subtitle), null, ((ocb.z) a0Var).f224205a, 208);
        } else {
            if (!(a0Var instanceof ocb.y)) {
                throw new NoWhenBranchMatchedException();
            }
            D = r112;
        }
        RowDelegate.Model modelF2 = bVar.f(com.revolut.retail.common.ui.R$string.application_full_name, gVar.d);
        ocb.a0 a0Var2 = gVar.f224176g;
        if (a0Var2 instanceof ocb.z) {
            D2 = com.revolut.feature.retail.privacy.impl.ui.flow.screen.b.d(bVar, "ID_CREDIT_STATUS_DATA_SHARING", R$drawable.uikit_icn_24_credit_card, com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_credit_category_title, Integer.valueOf(com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_credit_data_sharing_subtitle), null, ((ocb.z) a0Var2).f224205a, 208);
        } else {
            if (!(a0Var2 instanceof ocb.y)) {
                throw new NoWhenBranchMatchedException();
            }
            D2 = r112;
        }
        if (gVar.f224181n) {
            RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shopping, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_rev_points_personalisation_title, r112, r112, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.retail.privacy.impl.R$string.profile_privacy_rev_points_personalisation_subtitle, r112, r112, 14);
            yy0.i iVar = yy0.l.Companion;
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246);
            iVar.getClass();
            model = new RowDelegate.Model("ID_REV_POINTS_PERSONALISATION", image24, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new tf(yy0.i.a(resourceImage), sf.TOP), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        } else {
            model = r112;
        }
        ?? elements2 = new qv0.i[10];
        elements2[0] = modelB;
        elements2[1] = modelD;
        elements2[2] = modelG;
        elements2[c3] = modelE;
        elements2[c2] = modelD2;
        elements2[5] = D3;
        elements2[6] = D;
        elements2[7] = modelF2;
        elements2[8] = D2;
        elements2[9] = model;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL2 = kotlin.collections.d.L(elements2);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        eVar.addAll(listL2);
        return zhm.u.a(eVar);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        Collection collectionG;
        oo2.r rVar = (oo2.r) this.f216550b;
        oo2.i iVar = (oo2.i) this.f216551c;
        qo2.k content = (qo2.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        if (iVar.f226997b == mn2.a.CASS && iVar.f226998c == wn2.d.PARTIAL) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_review_preferences_import_contacts_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_review_preferences_import_contacts_description, zhm.u.c(iVar.e.f63972a), null, 12);
            Boolean bool = iVar.f;
            RowDelegate.Model model = new RowDelegate.Model("ID_MIGRATE_BENEFICIARIES_TOGGLE", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_phone_book, null, null, 6), null, null, false, null, false, 60), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new vf(bool != null ? bool.booleanValue() : false, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        Map map = content.f247998b;
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : collectionValues) {
            if (!((qo2.i) obj5).f247992a.f247984g) {
                arrayList.add(obj5);
            }
        }
        if (arrayList.isEmpty()) {
            collectionG = zhm.f0.f322471a;
        } else {
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                qo2.b bVar = ((qo2.i) it8.next()).f247992a;
                String strQ = j6.a.q("ID_UNSUPPORTED_PAYMENT_", bVar.f247981a);
                RowDelegate.Model.MainImage.Image40 image40A = oo2.r.a(bVar, new WarningCircleBadge(dw0.a.Suspicious));
                TextClause textClause = new TextClause(bVar.f247982b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                pf pfVar = new pf(new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_review_payments_edit_action, null, null, 14), null, null, false, null, null, 510);
                String str = bVar.i;
                arrayList2.add(new RowDelegate.Model(strQ, image40A, textClause, null, 0, str != null ? new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null, oo2.r.b(bVar), null, 0, pfVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867736));
            }
            collectionG = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("ID_UNSUPPORTED_PAYMENTS_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_review_payments_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), yp0.e0.INSIDE_BOX, 0, 0, 124);
        }
        eVarB.addAll(collectionG);
        Collection collectionValues2 = map.values();
        ArrayList<qo2.i> arrayList3 = new ArrayList();
        for (Object obj6 : collectionValues2) {
            qo2.b bVar2 = ((qo2.i) obj6).f247992a;
            if (bVar2.f247984g && bVar2.f247987l) {
                arrayList3.add(obj6);
            }
        }
        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
        for (qo2.i iVar2 : arrayList3) {
            qo2.b bVar3 = iVar2.f247992a;
            arrayList4.add(new SelectableDelegate.Model(j6.a.q("ID_SUPPORTED_PAYMENT_", bVar3.f247981a), rVar.d("ID_SUPPORTED_PAYMENT_INNER_" + bVar3.f247981a, bVar3), iVar2.f247993b ? qd0.SELECTED : qd0.UNSELECTED, SelectableDelegate.b.c.f53320a, null, false, null, null, null, false, 32752));
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList4);
        Collection collectionValues3 = map.values();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj7 : collectionValues3) {
            qo2.b bVar4 = ((qo2.i) obj7).f247992a;
            if (bVar4.f247984g && !bVar4.f247987l) {
                arrayList5.add(obj7);
            }
        }
        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            qo2.b bVar5 = ((qo2.i) it9.next()).f247992a;
            arrayList6.add(rVar.d("ID_UNSELECTABLE_PAYMENT_" + bVar5.f247981a, bVar5));
        }
        yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList6);
        aim.e eVarA = zhm.u.a(eVarB);
        TextClause textClause2 = new TextClause(content.f247997a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_review_payments_action_confirm, null, null, 14);
        int i = content.d;
        if (i != 0) {
            List listK = zhm.v.k(textLocalisedClause3, new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            m70.a.a(kotlin.jvm.internal.t0.f186434a);
            textLocalisedClause3 = new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        return new oo2.n(eVarA, textClause2, textLocalisedClause3);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0443  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r75, java.lang.Object r76, java.lang.Object r77) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: njj.c1.o(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        String str;
        String str2;
        aim.e eVarA;
        wi0.b bVar;
        Trip trip;
        ood.a aVar = (ood.a) this.f216550b;
        List list = (List) this.f216551c;
        ood.i content = (ood.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        wi0.b bVar2 = aVar.f;
        if (bVar2 == null || (str = bVar2.f297794a) == null) {
            str = do3.q.y(content.h().f227033c).f297794a;
        }
        String str3 = str;
        List listI = content.i();
        ArrayList arrayList = new ArrayList(zhm.w.t(listI, 10));
        Iterator it8 = listI.iterator();
        while (it8.hasNext()) {
            arrayList.add(((fod.c) it8.next()).f136925a.d.f297794a);
        }
        List listU = zhm.d0.U(zhm.d0.F0(str3, arrayList));
        boolean z = content instanceof ood.g;
        if (z) {
            str2 = ((ood.g) content).f227040c.f136925a.d.f297794a;
        } else {
            if (!(content instanceof ood.h)) {
                throw new NoWhenBranchMatchedException();
            }
            wi0.b bVar3 = ((ood.h) content).f227044c;
            str2 = bVar3 != null ? bVar3.f297794a : null;
        }
        boolean z3 = content instanceof ood.h;
        ood.h hVar = z3 ? (ood.h) content : null;
        int i = -1;
        if (hVar != null && (bVar = hVar.d) != null) {
            Iterator it9 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                koi.j jVar = (koi.j) it9.next();
                if (jVar instanceof RowDelegate.Model) {
                    Object obj5 = ((RowDelegate.Model) jVar).u;
                    fod.c cVar = obj5 instanceof fod.c ? (fod.c) obj5 : null;
                    if (Intrinsics.f((cVar == null || (trip = cVar.f136925a) == null) ? null : trip.d, bVar)) {
                        i = i2;
                        break;
                    }
                }
                i2++;
            }
        }
        if (z3) {
            aim.e eVarB = zhm.u.b();
            eVarB.add(PlusActionNavBarMenuItem.Companion.b(PlusActionNavBarMenuItem.INSTANCE, "menu_add_trip", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_add_trip_banner_button, null, null, 14)));
            ood.h hVar2 = (ood.h) content;
            if (hVar2.f227044c == null && !hVar2.f227042a.isEmpty()) {
                eVarB.add(new LabelNavBarMenuItem("menu_share_trips", new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.trips_list_header_share, null, null, 14), null, null, 504));
            }
            eVarA = zhm.u.a(eVarB);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            aim.e eVarB2 = zhm.u.b();
            if (!(((ood.g) content).f227040c.f136926b instanceof ind.d)) {
                eVarB2.add(new ActionNavBarMenuItem("menu_edit_trip", LayeredImage.Companion.c(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_pencil, Integer.valueOf(R$attr.uikit_colorAccentNeutral), new Color.Solid(R$attr.uikit_colorWidgetBackground), 6.0f, null, 48)));
            }
            eVarA = zhm.u.a(eVarB2);
        }
        return new ood.d(listU, str2, i, str3, eVarA, bVar2 != null);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        otk.r rVar = (otk.r) this.f216550b;
        otk.f fVar = (otk.f) this.f216551c;
        nel.n instrument = (nel.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        f4h.d dVar = (f4h.d) rVar.f229744a;
        TextClause textClauseE = dVar.e(instrument);
        Clause clauseD = dVar.d(fVar.d, instrument);
        CompositeClause compositeClauseB = dVar.b(instrument);
        TextClause textClauseC = dVar.c(instrument);
        yy0.j jVarA = dVar.a(instrument);
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrument, "<this>");
        nel.a aVar = instrument.f214599h;
        TagViewData tagViewDataB = null;
        nel.f fVar2 = aVar instanceof nel.f ? (nel.f) aVar : null;
        if (pd.b.j(fVar2 != null ? Boolean.valueOf(fVar2.f214571b) : null)) {
            TagViewData.Companion companion = TagViewData.INSTANCE;
            int i = R$drawable.uikit_icn_24_boost;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_trading_instrument_details_etns_leveraged, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
            int i2 = R$attr.uikit_colorAccent_20;
            int i3 = R$attr.uikit_colorAccent;
            Integer numValueOf = Integer.valueOf(i);
            companion.getClass();
            tagViewDataB = TagViewData.Companion.b(i2, i3, textLocalisedClause, numValueOf);
        }
        NavBarMenuItem[] elements = {q2d.a.a(), rVar.f229745b.a(fVar.e)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new otk.g(tagViewDataB, clauseD, compositeClauseB, textClauseE, textClauseC, kotlin.collections.d.L(elements), jVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[EDGE_INSN: B:105:0x0076->B:22:0x0076 BREAK  A[LOOP:4: B:16:0x0058->B:106:?]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: njj.c1.r(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        PlainTextDelegate.Model model;
        List listA;
        PlainTextDelegate.Model model2;
        TextLocalisedClause textLocalisedClause;
        BottomSheet bottomSheet;
        Clause clauseA;
        ov7.o oVar = (ov7.o) this.f216550b;
        ov7.j jVar = (ov7.j) this.f216551c;
        CoverageDetailsLayout layout = (CoverageDetailsLayout) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        aim.e eVarB = zhm.u.b();
        List list = layout.d;
        int i = 10;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            Style style = null;
            if (!it8.hasNext()) {
                break;
            }
            CoverageDetailsLayout.RestrictionsSection section = (CoverageDetailsLayout.RestrictionsSection) it8.next();
            oVar.f229980a.getClass();
            Intrinsics.checkNotNullParameter(section, "section");
            List list2 = section.f75935b;
            String str = section.f75934a;
            List<CoverageDetailsLayout.Restriction> list3 = list2;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, i));
            for (CoverageDetailsLayout.Restriction restriction : list3) {
                String str2 = restriction.f75929a;
                BottomSheet bottomSheet2 = restriction.f75931c;
                String str3 = restriction.f75930b;
                String strQ = j6.a.q("COVERAGE_RESTRICTION_ITEM_ID_", str2);
                String str4 = restriction.f75929a;
                aw0.t0 t0Var = new aw0.t0((Clause) sr7.c.a(str4, style), (Image) null, 0, false, 30);
                if (bottomSheet2 != null) {
                    String str5 = restriction.f75930b;
                    int i2 = R$drawable.uikit_icn_16_info_outline;
                    Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
                    Float fValueOf = Float.valueOf(16.0f);
                    ImageClause imageClause = new ImageClause(i2, numValueOf, fValueOf, fValueOf, 16);
                    bottomSheet = bottomSheet2;
                    Clause[] elements = {imageClause, sr7.c.a(str5, new Click(28, (Integer) null, (Object) bottomSheet, str5, false))};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    clauseA = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
                } else {
                    bottomSheet = bottomSheet2;
                    clauseA = sr7.c.a(str3, style);
                }
                arrayList2.add(new CellDetailsDelegate.Model(strQ, t0Var, clauseA, null, restriction.f75931c, null, str3.length() > str4.length() ? aw0.u0.LARGE : aw0.u0.MEDIUM, 0, null, bottomSheet != null, false, null, null, 30392));
                style = null;
            }
            arrayList.add(xu7.b.a(R$attr.uikit_dp16, j6.a.q("COVERAGE_RESTRICTION_HEADER_ID_", str), str, arrayList2));
            i = 10;
        }
        eVarB.addAll(zhm.w.u(arrayList));
        boolean z = jVar.f229974b;
        CoverageDetailsLayout.Exclusions exclusions = layout.e;
        if (exclusions != null) {
            String str6 = exclusions.f75913a;
            oVar.f229981b.getClass();
            Intrinsics.checkNotNullParameter(exclusions, "exclusions");
            List listV0 = exclusions.f75914b;
            boolean z3 = listV0.size() > 5;
            if (!z) {
                listV0 = zhm.d0.V0(listV0, 5);
            }
            List<String> list4 = listV0;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
            for (String str7 : list4) {
                arrayList3.add(new jl0(j6.a.q("COVERAGE_EXCLUSIONS_ITEM_ID_", str7), new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), sr7.c.a(str7, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254))));
            }
            ToDoItemDelegate.INSTANCE.getClass();
            ToDoItemDelegate.Companion.a(arrayList3);
            if (z3) {
                if (z) {
                    model = null;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_coverage_details_exclusions_show_less, null, null, 14);
                } else {
                    model = null;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_coverage_details_exclusions_show_more, null, null, 14);
                }
                arrayList3 = zhm.d0.F0(new LabelButtonDelegate.Model("COVERAGE_EXCLUSIONS_LABEL_BUTTON_ID", textLocalisedClause, null, null, null, R$attr.uikit_dp0, 0, 0, 1980), arrayList3);
            } else {
                model = null;
            }
            listA = xu7.b.a(R$attr.uikit_dp16, j6.a.q("COVERAGE_EXCLUSIONS_HEADER_ID_", str6), str6, arrayList3);
        } else {
            model = null;
            listA = null;
        }
        if (listA == null) {
            listA = zhm.f0.f322471a;
        }
        eVarB.addAll(listA);
        CoverageDetailsLayout.Disclaimer disclaimer = layout.f;
        if (disclaimer != null) {
            PlainTextDelegate.Model model3 = new PlainTextDelegate.Model("DISCLAIMER_ID", (Clause) null, (Clause) new HtmlClause(0, 30, (Integer) null, (Object) null, disclaimer.f75910a), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            model2 = model3;
        } else {
            model2 = model;
        }
        eVarB.addAll(zhm.v.l(model2));
        LegalNotice legalNotice = layout.f75908g;
        if (legalNotice != null) {
            eVarB.add(xv7.m.a(legalNotice));
        }
        return zhm.u.a(eVarB);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        TextDelegate.Model model;
        ow1.s sVar = (ow1.s) this.f216550b;
        ow1.i iVar = (ow1.i) this.f216551c;
        i80.a qrCode = (i80.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Alias alias = iVar.f230259a;
        dj0.d dVar = iVar.f230261c;
        QRCodeDelegate.Model model2 = new QRCodeDelegate.Model("QR_CODE_ID", null, new QrCodeImage(qrCode.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(1000), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28), null, null, null, 0, R$attr.uikit_dp0, 0, 0, 63482);
        TextDelegate.Model model3 = new TextDelegate.Model("ALIAS_SELECTOR_ID", yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextClause(sVar.f230274a.a(alias), (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), new ImageClause(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Float) null, (Float) null, 30))), true, new bk0(0), null, null, 0, R$attr.uikit_dp8, 0, 0, 1776);
        if (dVar != null) {
            List listK = zhm.v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new ImageClause(R$drawable.uikit_icn_24_pencil, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28));
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(30, (Integer) null, (Object) null, "MODIFY_DETAILS_ID", false), null, 8);
            ck0 ck0Var = new ck0(yj0.CENTER_HORIZONTAL);
            int i = R$attr.uikit_dp8;
            model = new TextDelegate.Model("AMOUNT_INFO_ID", compositeClause, false, ck0Var, null, null, i, i, 0, 0, 1652);
        } else {
            model = null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.breb.api.R$string.bre_b_qr_request_description, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10);
        ck0 ck0Var2 = new ck0(yj0.CENTER_HORIZONTAL);
        int i2 = R$attr.uikit_dp8;
        TextDelegate.Model model4 = new TextDelegate.Model("DESCRIPTION_ID", textLocalisedClause, false, ck0Var2, null, null, i2, i2, 0, 0, 1652);
        h4 h4Var = h4.ACCENT;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.breb.api.R$string.bre_b_qr_request_action_share_link, null, null, 14);
        i4 i4Var = new i4();
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        int i3 = R$attr.uikit_dp32;
        Object[] elements = {model2, model3, model, model4, new SmallActionButtonDelegate.Model("SHARE_QR_ID", h4Var, resourceImage, null, textLocalisedClause2, null, i4Var, null, null, i3, i3, 0, 0, 26456)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.PrimaryNeutral primaryNeutral = CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.PrimaryNeutral.f52095a;
        return zhm.d0.F0(new y3(zhm.u.c(dVar == null ? new CircleActionButtonsBarDelegate.CircleActionButton("SET_AMOUNT_ACTION_ID", (Clause) new TextLocalisedClause(com.revolut.feature.apm.breb.api.R$string.bre_b_qr_request_action_set_amount, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle) primaryNeutral, (v3) null, (String) null, false, (Object) null, 496) : new CircleActionButtonsBarDelegate.CircleActionButton("RESET_QR_ID", (Clause) new TextLocalisedClause(com.revolut.feature.apm.breb.api.R$string.bre_b_qr_request_action_reset, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_arrow_repeat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle) primaryNeutral, (v3) null, (String) null, false, (Object) null, 496)), "BOTTOM_ACTIONS_ID", R$attr.uikit_dp32, 0, Constants.TAG_OS_VERSION), listL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0342 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.core.ui_kit.models.Style, java.util.List, mx0.d7] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25, types: [com.revolut.core.ui_kit.models.HtmlClause] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26, types: [com.revolut.core.ui_kit.models.HtmlClause] */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r4v10, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v54, types: [koi.j] */
    /* JADX WARN: Type inference failed for: r4v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v56, types: [com.revolut.core.ui_kit.delegates.wh] */
    /* JADX WARN: Type inference failed for: r4v57, types: [com.revolut.core.ui_kit.delegates.wh] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43, types: [com.revolut.feature.shared.savings.models.product.ProductGroup$CurrencySelectionScreen] */
    /* JADX WARN: Type inference failed for: r6v62 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 3348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: njj.c1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ c1(Object obj2, Object obj3, int i) {
        this.f216549a = i;
        this.f216550b = obj2;
        this.f216551c = obj3;
    }
}
