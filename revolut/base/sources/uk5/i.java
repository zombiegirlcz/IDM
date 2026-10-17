package uk5;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ComparisonCellDelegate;
import com.revolut.core.ui_kit.delegates.c4;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto.remittance.impl.R$string;
import ip0.hb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import q2j.v;
import wk5.k;
import wk5.m;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xi0.b[] f280692c;
    public static final k[] d;
    public static final Custom e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj5.a f280693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik5.d f280694b;

    static {
        xi0.b.Companion.getClass();
        f280692c = (xi0.b[]) kotlin.collections.d.h0(new xi0.b[]{xi0.b.H, xi0.b.J, xi0.b.P, xi0.b.O, xi0.b.G, xi0.b.M});
        d = (k[]) kotlin.collections.d.h0(new k[]{k.BITCOIN, k.EVM, k.TRON, k.SPL, k.RIPPLE, k.BITCOINCASH, k.LITECOIN, k.DOGECOIN, k.CARDANO, k.STELLAR, k.POLKADOT, k.TEZOS, k.ALGORAND});
        e = new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254);
    }

    public i(uj5.a blockchainUiMapper, ik5.d cryptoAddressTypeUiMapper) {
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        Intrinsics.checkNotNullParameter(cryptoAddressTypeUiMapper, "cryptoAddressTypeUiMapper");
        this.f280693a = blockchainUiMapper;
        this.f280694b = cryptoAddressTypeUiMapper;
    }

    public final CompositeClause a(Iterable iterable) {
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ik5.a) this.f280693a).b((wk5.a) it8.next(), true, null));
        }
        return yoj.b.m(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList);
    }

    @Override // cli.n
    public final o c(j jVar) {
        List listJ;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        tk5.j jVar2 = domainState.f280687a;
        List list = domainState.f280688b;
        int i = f.f280691a[jVar2.ordinal()];
        Custom custom = e;
        if (i == 1) {
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                listJ = f0.f322471a;
            } else {
                ComparisonCellDelegate.Model model = new ComparisonCellDelegate.Model("COMPARISON_CELL_HEADER_LIST_ID", new c4(new TextLocalisedClause(R$string.crypto_multi_network_asset_title, null, custom, 10), null, 6), new c4(new TextLocalisedClause(R$string.crypto_withdrawals_multi_network_networks_title, null, custom, 10), null, 6), null, 0, 1016);
                List listP0 = d0.P0(list, new v(new v(new h(), 12), 11));
                ArrayList arrayList = new ArrayList(w.t(listP0, 10));
                int i2 = 0;
                for (Object obj2 : listP0) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    pd5.g gVar = (pd5.g) obj2;
                    arrayList.add(new ComparisonCellDelegate.Model(a0.d.n("COMPARISON_CELL_LIST_ID", i2), new c4(ix0.d0.a(gVar.f235102a, null), null, 6), new c4(a(gVar.d), hb.START, 2), null, 0, 1016));
                    i2 = i3;
                }
                listJ = ue0.e.J(model, arrayList);
                yp0.b.k(listJ, R$attr.uikit_dp24, 0, 0, 0, 30);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List list3 = list;
            if (list3 == null || list3.isEmpty()) {
                listJ = f0.f322471a;
            } else {
                ComparisonCellDelegate.Model model2 = new ComparisonCellDelegate.Model("COMPARISON_CELL_HEADER_LIST_ID", new c4(new TextLocalisedClause(R$string.crypto_multi_network_address_type_title, null, custom, 10), null, 6), new c4(new TextLocalisedClause(R$string.crypto_withdrawals_multi_network_networks_title, null, custom, 10), null, 6), null, 0, 1016);
                List list4 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((pd5.g) it8.next()).d);
                }
                ArrayList arrayListU = w.u(arrayList2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayListU) {
                    k kVarA = m.a((wk5.a) obj3);
                    Object arrayList3 = linkedHashMap.get(kVarA);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(kVarA, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), d0.i1((Iterable) entry.getValue()));
                }
                Map mapT = r0.t(d0.P0(zhm.t0.C(linkedHashMap2), new v(new g(), 10)));
                ArrayList arrayList4 = new ArrayList(mapT.size());
                for (Map.Entry entry2 : mapT.entrySet()) {
                    String strQ = j6.a.q("COMPARISON_CELL_LIST_ID", ((k) entry2.getKey()).name());
                    k kVar = (k) entry2.getKey();
                    this.f280694b.getClass();
                    arrayList4.add(new ComparisonCellDelegate.Model(strQ, new c4(ik5.d.a(kVar), null, 6), new c4(a((Iterable) entry2.getValue()), hb.START, 2), null, 0, 1016));
                }
                listJ = ue0.e.J(model2, arrayList4);
                yp0.b.k(listJ, R$attr.uikit_dp24, 0, 0, 0, 30);
            }
        }
        return new c(listJ);
    }
}
