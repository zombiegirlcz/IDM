package rp9;

import android.os.Parcelable;
import aw0.o9;
import bnf.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.dg;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.je;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.nb0;
import ip0.pb0;
import ip0.qd0;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.p;
import k71.q;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements p {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.i f256295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.e f256296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f256297c;

    public e(thf.i selectableMapper, thf.e avatarMapper) {
        Intrinsics.checkNotNullParameter(selectableMapper, "selectableMapper");
        Intrinsics.checkNotNullParameter(avatarMapper, "avatarMapper");
        this.f256295a = selectableMapper;
        this.f256296b = avatarMapper;
        this.f256297c = yhm.j.b(new rm0.k(21));
    }

    public static RowDelegate.Model b() {
        RowDelegate.Model model = new RowDelegate.Model("ID_CUSTOM_BILL_ACTION", new RowDelegate.Model.MainImage.Image40(dp9.a.f116846a, null, null, false, null, false, 62), new TextLocalisedClause(R$string.split_bill_create_custom_bill_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static List c() {
        return u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_SEARCH", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124));
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable$Shimmering$Companion, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        ?? r72;
        eg egVar;
        ReferralContactDelegate.Model modelE;
        Iterator it8;
        List list;
        qd0 qd0Var;
        a3 a3Var;
        e eVar = this;
        a domainState = (a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f256289a;
        String str = domainState.f256291c;
        sp9.c cVar = (sp9.c) data.getContent();
        List list2 = domainState.f256290b;
        if (domainState.f256289a.getLoading()) {
            nb0 nb0Var = pb0.Companion;
            List listK = v.k(nb0.b(nb0Var, "1", false, 0, false, 30), nb0.b(nb0Var, "2", false, 0, false, 30), nb0.b(nb0Var, "3", false, 0, false, 30));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return new c(null, listK, c());
        }
        boolean z = false;
        if (cVar != null) {
            ArrayList arrayList = cVar.f264910a;
            if (!arrayList.isEmpty() || !list2.isEmpty()) {
                xi0.b bVarA = com.revolut.feature.payments.bills_chooser.api.common.a.a(list2);
                q extraData = cVar.f264911b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    a3 a3Var2 = (a3) obj2;
                    String strI = a0.d.i(a3Var2.f272593h.getYear(), "_", a3Var2.f272593h.getDayOfYear());
                    Object objO = linkedHashMap.get(strI);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, strI);
                    }
                    ((List) objO).add(obj2);
                }
                List<BillType> list3 = list2;
                ArrayList arrayList2 = new ArrayList();
                for (BillType billType : list3) {
                    if ((billType instanceof BillType.CustomBill) || (billType instanceof BillType.RecurringPaymentBill)) {
                        a3Var = null;
                    } else {
                        if (!(billType instanceof BillType.TransactionBill)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a3Var = ((BillType.TransactionBill) billType).f79176a;
                    }
                    if (a3Var != null) {
                        arrayList2.add(a3Var);
                    }
                }
                ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                Iterator it9 = linkedHashMap.entrySet().iterator();
                while (it9.hasNext()) {
                    List transactions = (List) ((Map.Entry) it9.next()).getValue();
                    a3 a3Var3 = (a3) d0.b0(transactions);
                    TimeClause timeClause = new TimeClause(a3Var3.f272593h.getMillis(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
                    String strM = p.a.m(a3Var3.f272593h.getMillis(), "ID_HEADER_");
                    int i = R$attr.uikit_dp32;
                    ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(strM, (Image) null, (Clause) timeClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i, R$attr.uikit_dp16, i, i, 4090);
                    thf.h formattingOptions = new thf.h(z, z, 6);
                    anf.l lVar = (anf.l) eVar.f256295a;
                    Intrinsics.checkNotNullParameter(transactions, "transactions");
                    Intrinsics.checkNotNullParameter(extraData, "extraData");
                    Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
                    List list4 = transactions;
                    List list5 = list2;
                    ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                    Iterator it10 = list4.iterator();
                    while (it10.hasNext()) {
                        arrayList4.add(lVar.p((a3) it10.next(), extraData, formattingOptions));
                    }
                    ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                    Iterator it11 = arrayList4.iterator();
                    while (it11.hasNext()) {
                        SelectableDelegate.Model model2 = (SelectableDelegate.Model) it11.next();
                        Object obj3 = ((RowDelegate.Model) model2.f53305b).u;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.transactions.models.Transaction");
                        a3 a3Var4 = (a3) obj3;
                        String id10 = a3Var4.f272581b;
                        Intrinsics.checkNotNullParameter(extraData, "<this>");
                        Intrinsics.checkNotNullParameter(id10, "id");
                        boolean z3 = (bVarA == null || bVarA.equals(a3Var4.k.f115083b)) && !(extraData.f181797g.get(id10) != null || extraData.i.get(id10) != null);
                        if (arrayList2.isEmpty()) {
                            it8 = it11;
                            list = list3;
                            qd0Var = qd0.UNSELECTED;
                        } else {
                            Iterator it12 = arrayList2.iterator();
                            while (it12.hasNext()) {
                                it8 = it11;
                                list = list3;
                                if (Intrinsics.f(((a3) it12.next()).f272579a, a3Var4.f272579a)) {
                                    qd0Var = qd0.SELECTED;
                                    break;
                                }
                                it11 = it8;
                                list3 = list;
                            }
                            it8 = it11;
                            list = list3;
                            qd0Var = qd0.UNSELECTED;
                        }
                        arrayList5.add(new SelectableDelegate.Model(model2.f53304a, RowDelegate.Model.x((RowDelegate.Model) model2.f53305b, null, null, null, null, null, 0, null, false, null, new BillType.TransactionBill(a3Var4), 0, 0, 0, 0, null, -4196353, 15), qd0Var, z3 ? SelectableDelegate.b.C0424b.f53319a : new SelectableDelegate.b.a(false), null, false, null, null, null, false, 32752));
                        it11 = it8;
                        list3 = list;
                    }
                    int i2 = R$attr.uikit_dp0;
                    yp0.b.k(arrayList5, i2, i2, 0, 0, 28);
                    arrayList3.add(i2b.a.q(model, arrayList5));
                    list2 = list5;
                    z = false;
                }
                List list6 = list2;
                List<BillType> list7 = list3;
                ArrayList arrayListU = w.u(arrayList3);
                RowDelegate.Model modelB = b();
                if (list6.isEmpty()) {
                    egVar = null;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    for (BillType billType2 : list7) {
                        boolean z4 = billType2 instanceof BillType.CustomBill;
                        Lazy lazy = eVar.f256297c;
                        if (z4) {
                            BillType.CustomBill customBill = (BillType.CustomBill) billType2;
                            modelE = new ReferralContactDelegate.Model(customBill.f79173a, h5k.a.b(R$drawable.uikit_icn_16_receipt), new TextClause(customBill.f79173a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(customBill.f79174b.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), null, null, new je((LayeredImage) lazy.getValue()), null, null, customBill, null, 393136);
                        } else if (billType2 instanceof BillType.TransactionBill) {
                            BillType.TransactionBill transactionBill = (BillType.TransactionBill) billType2;
                            a3 transaction = transactionBill.f79176a;
                            anf.e eVar2 = (anf.e) eVar.f256296b;
                            Intrinsics.checkNotNullParameter(transaction, "transaction");
                            Intrinsics.checkNotNullParameter(extraData, "extraData");
                            MoneyClause moneyClauseH = anf.h.h(eVar2, transaction, false, 3);
                            MoneyClause moneyClause = moneyClauseH != null ? moneyClauseH : null;
                            MoneyClause moneyClauseB = moneyClause != null ? MoneyClause.b(moneyClause, null, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 11) : null;
                            String str2 = transaction.f272581b;
                            Intrinsics.checkNotNullParameter(transaction, "<this>");
                            Intrinsics.checkNotNullParameter(extraData, "extraData");
                            ReferralContactDelegate.Model model3 = new ReferralContactDelegate.Model(str2, ((o) eVar2.f7735a).n(transaction, extraData.d, extraData.e, extraData.f181799j, extraData.f181804q, extraData.f181794a, extraData.f181795b, extraData.f181806s, extraData.f181807t, extraData.u, extraData.f181810y), eVar2.o(transaction, extraData), moneyClauseB, null, null, null, null, null, transaction, null, 393200);
                            AvatarModel avatarModelF0 = model3.f53162b;
                            AvatarModel.Default r102 = avatarModelF0 instanceof AvatarModel.Default ? (AvatarModel.Default) avatarModelF0 : null;
                            if (r102 != null) {
                                avatarModelF0 = AvatarModel.Default.f0(r102, new RawImageBadge((LayeredImage) lazy.getValue()), OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
                            }
                            modelE = ReferralContactDelegate.Model.e(model3, null, avatarModelF0, null, null, false, transactionBill, 6141);
                        } else {
                            if (!(billType2 instanceof BillType.RecurringPaymentBill)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            modelE = null;
                        }
                        if (modelE != null) {
                            arrayList6.add(modelE);
                        }
                        eVar = this;
                    }
                    egVar = new eg("ID_SELECTED_ITEM", arrayList6, dg.c.f54053a, BitmapDescriptorFactory.HUE_RED, 0, 0, 1016);
                }
                List listO = i2b.a.o(i2b.a.r(egVar, modelB), arrayListU);
                List listC = c();
                int size = list6.size();
                return new c(size > 0 ? new TextLocalisedClause(R$string.payments_groups_customisation_actions_continue, u.c(Integer.valueOf(size)), null, 12) : null, listO, listC);
            }
        }
        if (cVar != null && cVar.f264910a.isEmpty() && !kotlin.text.d0.W(str)) {
            return new c(null, u.c(new FullScreenStateDelegate.Model("ID_EMPTY_TRANSACTIONS_SEARCH_PLACEHOLDER", new TextLocalisedClause(R$string.payments_groups_members_search_empty_state, null, null, 14), new TextLocalisedClause(R.string.search_no_transactions_found, u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, true, 0, 0, 31712)), c());
        }
        if (cVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("BillsChooserMapper: content was null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            r72 = 0;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            r72 = 0;
        }
        RowDelegate.Model modelB2 = b();
        FullScreenStateDelegate.Model model4 = new FullScreenStateDelegate.Model("ID_EMPTY_TRANSACTIONS_PLACEHOLDER", new TextLocalisedClause(R$string.payments_groups_split_bill_select_bill_empty_placeholder_title, r72, r72, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", r72, r72, r72, 30)), zj.REGULAR, new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_16_plus, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new TextLocalisedClause(R$string.payments_groups_split_bill_select_bill_empty_placeholder_action, null, null, 14)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, null, false, 0, 0, 31684);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        qv0.i[] elements = {modelB2, model4};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new c(null, kotlin.collections.d.L(elements), c());
    }
}
