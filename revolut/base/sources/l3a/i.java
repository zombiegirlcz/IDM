package l3a;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.common.mapper.search.SearchResultsSectionItemsMapper$HiddenRevtagItem;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jq9.b0;
import jq9.t;
import jq9.x;
import jq9.y;
import jq9.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import m3j.n;
import md6.s;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;
import zhm.q;
import zhm.q0;
import zhm.t0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements b {

    @NotNull
    public static final c Companion = new c();
    public static final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final LinkedHashMap f191872l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3a.a f191873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f191874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aqa.c f191875c;
    public final dl3.f d;
    public final nq9.b e;
    public final io5.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fa6.a f191876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lx1.i f191877h;
    public final tn9.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a f191878j;

    static {
        List listK = v.k(d3a.a.REVOLUT, d3a.a.APM_AANI, d3a.a.APM_BIZUM, d3a.a.APM_BLIK, d3a.a.APM_BREB, d3a.a.APM_IRIS, d3a.a.APM_MULTIBANCO, d3a.a.APM_PAYID, d3a.a.APM_PIX, d3a.a.APM_QVIK, d3a.a.APM_SPIN, d3a.a.APM_UPI, d3a.a.APM_WERO, d3a.a.BILLERS, d3a.a.ACCOUNTS, d3a.a.MOBILE_WALLET, d3a.a.CARDS, d3a.a.GROUPS, d3a.a.REVTAG, d3a.a.CRYPTO_WALLET, d3a.a.DEVICE, d3a.a.CHARITIES, d3a.a.CHECKS);
        k = listK;
        q qVarK1 = d0.k1(listK);
        int iB = q0.b(w.t(qVarK1, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it8 = qVarK1.iterator();
        while (true) {
            kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                f191872l = linkedHashMap;
                return;
            } else {
                IndexedValue indexedValue = (IndexedValue) dVar.next();
                linkedHashMap.put((d3a.a) indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a));
            }
        }
    }

    public i(k3a.a itemsMapper, n beneficiaryItemViewMapper, aqa.c cardOwnersMapper, dl3.f contactsMapper, nq9.b groupsMapper, io5.b cryptoAddressItemsMapper, fa6.a charityItemsMapper, lx1.i apmRecipientMapper, tn9.a paymentCounterpartyMapper, com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a transferActionsFactory) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(beneficiaryItemViewMapper, "beneficiaryItemViewMapper");
        Intrinsics.checkNotNullParameter(cardOwnersMapper, "cardOwnersMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(groupsMapper, "groupsMapper");
        Intrinsics.checkNotNullParameter(cryptoAddressItemsMapper, "cryptoAddressItemsMapper");
        Intrinsics.checkNotNullParameter(charityItemsMapper, "charityItemsMapper");
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        Intrinsics.checkNotNullParameter(paymentCounterpartyMapper, "paymentCounterpartyMapper");
        Intrinsics.checkNotNullParameter(transferActionsFactory, "transferActionsFactory");
        this.f191873a = itemsMapper;
        this.f191874b = beneficiaryItemViewMapper;
        this.f191875c = cardOwnersMapper;
        this.d = contactsMapper;
        this.e = groupsMapper;
        this.f = cryptoAddressItemsMapper;
        this.f191876g = charityItemsMapper;
        this.f191877h = apmRecipientMapper;
        this.i = paymentCounterpartyMapper;
        this.f191878j = transferActionsFactory;
    }

    public static RowDelegate.Model b() {
        return new RowDelegate.Model("HIDDEN_REVTAG_ITEM_ID", new RowDelegate.Model.MainImage.Image40(h5k.a.b(R$drawable.uikit_icn_24_eye_show), null, null, false, null, false, 62), new TextLocalisedClause(R$string.who_to_pay_recipients_section_revtag_item_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, SearchResultsSectionItemsMapper$HiddenRevtagItem.f80056a, null, 0, 0, 0, 0, 532676600);
    }

    public static ListSubheaderDelegate.Model c(d3a.a aVar, String str, String str2, List list) {
        StringBuilder sb6 = new StringBuilder("SECTION_HEADER_");
        sb6.append(aVar);
        if (str != null) {
            sb6.append("_");
            sb6.append(str);
        }
        return new ListSubheaderDelegate.Model(sb6.toString(), (Image) null, yoj.b.w(yoj.b.w(e(aVar, str2), new DotDividerClause((Integer) null)), new TextClause(String.valueOf(list.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338);
    }

    public static Clause e(d3a.a aVar, String str) {
        switch (e.f191871a[aVar.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_revolut_friends, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_not_contacts, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_other, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_other, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_cards, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_groups, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_accounts, null, null, 14);
            case 8:
                return (str == null || kotlin.text.d0.W(str)) ? new TextLocalisedClause(R$string.who_to_pay_recipients_section_other, null, null, 14) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 9:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_crypto, null, null, 14);
            case 10:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_charities, null, null, 14);
            case 11:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_other, null, null, 14);
            case 12:
                return ApmAani.f61807c.e();
            case 13:
                return ApmBizum.f61808c.e();
            case 14:
                ApmBlik.f61809c.getClass();
                return new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_product_blik_payments_section, null, null, 14);
            case 15:
                return ApmBreb.f61810c.e();
            case 16:
                return ApmIris.f61811c.e();
            case 17:
                return ApmMultibanco.f61815c.e();
            case 18:
                return ApmPayId.f61819c.e();
            case 19:
                return ApmPix.f61820c.e();
            case 20:
                return ApmQvik.f61823c.e();
            case 21:
                return ApmSpin.f61827c.e();
            case 22:
                return ApmUpi.f61828c.e();
            case 23:
                return ApmWero.f61829c.e();
            case 24:
                return new TextLocalisedClause(R$string.who_to_pay_recipients_section_billers, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static ArrayList f(Map map) {
        ?? C;
        List<Pair> listP0 = d0.P0(t0.C(map), new g());
        ArrayList arrayList = new ArrayList();
        for (Pair pair : listP0) {
            d3a.a aVar = (d3a.a) pair.f186385a;
            List list = (List) pair.f186386b;
            if (aVar == d3a.a.MOBILE_WALLET) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    String strF = s.f((t) obj2);
                    Object objO = linkedHashMap.get(strF);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, strF);
                    }
                    ((List) objO).add(obj2);
                }
                C = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    C.add(new d(aVar, (String) entry.getKey(), (List) entry.getValue()));
                }
            } else {
                C = u.c(new d(aVar, null, list));
            }
            a0.x((Iterable) C, arrayList);
        }
        return arrayList;
    }

    public final RowDelegate.Model a(t tVar) {
        RowDelegate.Model.c.a aVar;
        if (tVar instanceof jq9.v) {
            jq9.v vVar = (jq9.v) tVar;
            return RowDelegate.Model.x(this.f191874b.c(vVar.f177523a, true), null, null, null, null, null, 0, null, false, null, vVar, 0, 0, 0, 0, null, -4194305, 15);
        }
        if (tVar instanceof jq9.w) {
            jq9.w wVar = (jq9.w) tVar;
            return RowDelegate.Model.x(((mra.i) this.f191875c).c(wVar.f177524a.f81495a), null, null, null, null, null, 0, null, false, null, wVar, 0, 0, 0, 0, null, -4194305, 15);
        }
        if (tVar instanceof y) {
            y yVar = (y) tVar;
            zm3.a aVar2 = yVar.f177526a;
            RowDelegate.Model modelM = ((xl3.d) this.d).m(aVar2);
            zm3.i iVar = aVar2 instanceof zm3.i ? (zm3.i) aVar2 : null;
            if (iVar != null && iVar.f323352c && ((zm3.i) aVar2).f323358n == 0) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.badge_new_sign_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorBackground), false, null, false, null, 254), 10);
                int i = R$attr.uikit_colorAccent;
                aVar = new RowDelegate.Model.c.a(new TagViewData(null, textLocalisedClause, i, null, i, null, 1000), null, false, 6);
            } else {
                aVar = null;
            }
            return RowDelegate.Model.x(modelM, null, null, null, null, null, 0, aVar, false, null, yVar, 0, 0, 0, 0, null, -4195329, 15);
        }
        if (tVar instanceof b0) {
            b0 b0Var = (b0) tVar;
            return RowDelegate.Model.x(((tr9.c) this.e).b(b0Var.f177496a), null, null, null, null, null, 0, null, false, null, b0Var, 0, 0, 0, 0, null, -4194305, 15);
        }
        if (tVar instanceof jq9.a0) {
            jq9.a0 a0Var = (jq9.a0) tVar;
            return RowDelegate.Model.x(io5.b.a(this.f, a0Var.f177495a), null, null, null, null, null, 0, null, false, null, a0Var, 0, 0, 0, 0, null, -4194305, 15);
        }
        if (tVar instanceof x) {
            x xVar = (x) tVar;
            return RowDelegate.Model.x(((db6.a) this.f191876g).a(xVar.f177525a), null, null, null, null, null, 0, null, false, null, xVar, 0, 0, 0, 0, null, -4194305, 15);
        }
        if (tVar instanceof jq9.u) {
            jq9.u uVar = (jq9.u) tVar;
            return RowDelegate.Model.x(((fy1.q) this.f191877h).g(uVar.f177522a), null, null, null, null, null, 0, null, false, null, uVar, 0, 0, 0, 0, null, -4194305, 15);
        }
        if (!(tVar instanceof z)) {
            throw new NoWhenBranchMatchedException();
        }
        z zVar = (z) tVar;
        return RowDelegate.Model.x(((do9.d) this.i).d(zVar.f177527a), null, null, null, null, null, 0, null, false, null, zVar, 0, 0, 0, 0, null, -4194305, 15);
    }

    public final ArrayList d(List list, d3a.a aVar, boolean z) {
        List listP0 = d0.P0(list, new f());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList.add((aVar == d3a.a.REVTAG && z) ? b() : a((t) it8.next()));
        }
        return arrayList;
    }
}
