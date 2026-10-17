package s43;

import com.google.common.collect.ImmutableMap;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_payment_method.impl.R$string;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import h93.l0;
import ip0.gu;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import q43.b0;
import q43.c0;
import q43.s;
import x33.e;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements jki.p {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f259747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f259748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f259749c;

    public l(h tabsMapper, ImmutableMap sectionsMappers) {
        Intrinsics.checkNotNullParameter(tabsMapper, "tabsMapper");
        Intrinsics.checkNotNullParameter(sectionsMappers, "sectionsMappers");
        this.f259747a = tabsMapper;
        this.f259748b = sectionsMappers;
        b0[] b0VarArrValues = b0.values();
        ArrayList arrayList = new ArrayList(b0VarArrValues.length);
        for (b0 b0Var : b0VarArrValues) {
            String strQ = j6.a.q("LIST_ID_LOADING_SECTION_", b0Var.a());
            gu guVar = new gu(strQ, 0, 0, 30);
            IntRange intRangeO = kotlin.ranges.f.o(0, 3);
            ArrayList arrayList2 = new ArrayList(w.t(intRangeO, 10));
            vim.f it8 = intRangeO.iterator();
            while (it8.f289625c) {
                arrayList2.add(new pb0(com.google.android.gms.internal.mlkit_vision_face.a.k(it8.nextInt(), strQ, "_")));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            arrayList.add(i2b.a.q(guVar, arrayList2));
        }
        this.f259749c = w.u(arrayList);
    }

    public static boolean b(List list) {
        return list.size() == 1 && d0.b0(list) == b0.CRYPTO;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        boolean z;
        int i;
        Address address;
        s domainState = (s) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final AccountId accountId = domainState.f242042a;
        sh5.c cVar = domainState.i;
        final List list = domainState.f242044c;
        final String str = domainState.f;
        Data data = domainState.f242043b;
        final Set set = domainState.d;
        final x33.e eVar = domainState.f242045g;
        final x33.e eVar2 = domainState.f242046h;
        final l0 l0Var = domainState.f242047j;
        k kVar = (k) iii.c.f(data, new s31.a(list, this, 4), new er9.a(list, 4), new Function3() { // from class: s43.i
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                String str2;
                nkm.h items;
                List listJ;
                x33.b content = (x33.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                List list2 = list;
                boolean zB = l.b(list2);
                boolean z3 = !zB;
                Iterator it8 = list2.iterator();
                int i2 = 0;
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    str2 = str;
                    if (!zHasNext) {
                        break;
                    }
                    b0 b0Var = (b0) it8.next();
                    g gVar = (g) r0.h(b0Var, this.f259739a.f259748b);
                    int i3 = i2;
                    final f input = new f(accountId, b0Var, content, str2, set, eVar, eVar2, z3, l0Var);
                    final u43.e eVar3 = (u43.e) gVar;
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(input, "input");
                    u43.d dVarA = eVar3.a(input);
                    final int i5 = 0;
                    nkm.h hVarN = y.n(dVarA.f277036a, new Function1() { // from class: u43.b
                        /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
                        /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r5) {
                            /*
                                Method dump skipped, instruction units count: 270
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: u43.b.invoke(java.lang.Object):java.lang.Object");
                        }
                    });
                    if (str2.length() == 0) {
                        items = hVarN;
                    } else {
                        final int i6 = 1;
                        items = y.n(hVarN, new Function1() { // from class: u43.b
                            /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
                            /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r5) {
                                /*
                                    Method dump skipped, instruction units count: 270
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: u43.b.invoke(java.lang.Object):java.lang.Object");
                            }
                        });
                    }
                    if (y.j(items) > 0) {
                        Object obj5 = dVarA.f277037b;
                        Intrinsics.checkNotNullParameter(items, "items");
                        u43.c cVarD = eVar3.d(input, new u43.d(items, obj5));
                        ListSubheaderDelegate.Model model = cVarD.f277034a;
                        listJ = y.J(cVarD.f277035b);
                        if (zB) {
                            yp0.b.k(listJ, 0, 0, 0, 0, 31);
                        } else {
                            listJ = yp0.b.g(listJ, model, null, 0, 0, 126);
                        }
                    } else {
                        listJ = f0.f322471a;
                    }
                    List items2 = listJ;
                    int iJ = y.j(hVarN);
                    Intrinsics.checkNotNullParameter(items2, "items");
                    if (!items2.isEmpty()) {
                        arrayList.add(b0Var);
                    }
                    a0.x(items2, arrayList2);
                    i2 = i3 + iJ;
                }
                int i21 = i2;
                if (str2.length() > 0 && arrayList2.isEmpty()) {
                    FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("EMPTY_SEARCH_ITEM_LIST_ID", new TextLocalisedClause(R$string.card_payment_method_spend_from_search_no_results_title, null, null, 14), new TextLocalisedClause(R$string.card_payment_method_spend_from_search_no_results_subtitle, u.c(str2), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(model2);
                }
                return new k(arrayList, i21 >= 10, arrayList2);
            }
        });
        List sections = kVar.f259744a;
        List list2 = kVar.f259745b;
        boolean z3 = kVar.f259746c;
        x33.e eVarB = domainState.b();
        if (eVarB instanceof e.a) {
            z = true;
            break;
        }
        z = false;
        if (eVarB instanceof x33.f) {
            List list3 = ((x33.f) eVarB).f302640a;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    if (r6.b.B(xi0.b.Companion, ((PocketWithSubaccount) it8.next()).f65523a.f163147c)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        do3.n nVar = domainState.f242048l;
        TextLocalisedClause textLocalisedClause = (com.bumptech.glide.d.q((nVar == null || (address = nVar.k) == null) ? null : nz8.d.g(address)) && z) ? new TextLocalisedClause(R$string.card_payment_method_spend_from_crypto_footer, u.c(new TextLocalisedClause(R$string.card_payment_method_common_learn_more, null, new Click(30, (Integer) null, (Object) null, "FOOTER_LEARN_MORE_LIST_ID", false), 10)), null, 12) : null;
        if (sections.size() <= 1) {
            return new q43.d0(cVar.f263437c ? (Clause) cVar.d.getValue() : null, textLocalisedClause, list2, z3, b(list));
        }
        ((p) this.f259747a).getClass();
        Intrinsics.checkNotNullParameter(sections, "sections");
        List<b0> list4 = sections;
        ArrayList arrayList = new ArrayList(w.t(list4, 10));
        for (b0 b0Var : list4) {
            String strB = b0Var.b();
            int i2 = o.f259751a[b0Var.ordinal()];
            if (i2 == 1) {
                i = R$string.card_payment_method_cash_section_title;
            } else if (i2 == 2) {
                i = R$string.card_payment_method_cash_section_title;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.card_payment_method_crypto_section_title;
            }
            arrayList.add(new q(strB, new t(new TextLocalisedClause(i, null, null, 14)), 58));
        }
        return new c0(list2, z3, b(list), cVar.f263437c ? (Clause) cVar.d.getValue() : null, textLocalisedClause, arrayList, domainState.e.b());
    }
}
