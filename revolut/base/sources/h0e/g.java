package h0e;

import aw0.o9;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.statements.R$plurals;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementsFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lyd.t;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import wxd.z;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements d {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f148380b = v.k(z.FORMAT, z.ACCOUNTS_FILTER);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f148381c = v.k(z.LANGUAGE, z.SHOW_AMOUNTS_IN, z.HIDE_BALANCES);
    public static final ResourceImage d = new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f148382a;

    public g(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f148382a = languageProvider;
    }

    public static ResourceImage a(z zVar) {
        return zVar == z.FORMAT ? new ResourceImage(R$drawable.uikit_icn_24_vertical_expand, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : d;
    }

    public static TextLocalisedClause d(z zVar, t tVar) {
        int i = f.f148377a[zVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.documents_hub_custom_form_settings_hide_balances, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(tVar != null ? n14.e.p(tVar) : R$string.documents_hub_custom_form_filter_title_accounts, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.documents_hub_custom_form_settings_format, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.documents_hub_custom_form_settings_language, null, null, 14);
        }
        if (i == 5) {
            return new TextLocalisedClause(R$string.consolidated_statement_filters_setting_display_currency, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final i b(yxd.c cVar, z zVar) {
        String str;
        Boolean boolE0;
        if (f.f148377a[zVar.ordinal()] == 1) {
            d.Companion.getClass();
            String strA = c.a(zVar);
            TextLocalisedClause textLocalisedClauseD = d(zVar, null);
            List list = (List) cVar.f317664c.get(zVar);
            return new CellDetailsSwitcherDelegate.Model(strA, textLocalisedClauseD, (list == null || (str = (String) d0.M0(list)) == null || (boolE0 = kotlin.text.d0.E0(str)) == null) ? false : boolE0.booleanValue(), true, 0, null, zVar, null, 4016);
        }
        d.Companion.getClass();
        String strA2 = c.a(zVar);
        TextLocalisedClause textLocalisedClauseD2 = d(zVar, null);
        ResourceImage resourceImageA = a(zVar);
        Clause clauseC = c(zVar, cVar, null, h0.f322473a);
        u0 u0Var = zVar == z.LANGUAGE ? u0.LARGE : u0.MEDIUM;
        int i = R$attr.uikit_dp8;
        return new CellDetailsActionDelegate.Model(strA2, textLocalisedClauseD2, 0, resourceImageA, clauseC, false, false, u0Var, zVar, i, i, 25952);
    }

    public final Clause c(z zVar, yxd.c cVar, t tVar, Set set) {
        String str;
        Object next;
        String str2;
        String str3;
        int i = f.f148377a[zVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                Collection collection = (List) cVar.f317663b.get(zVar);
                if (collection == null) {
                    collection = f0.f322471a;
                }
                Collection collection2 = collection;
                ArrayList arrayList = new ArrayList(w.t(collection2, 10));
                Iterator it8 = collection2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((yxd.a) it8.next()).f317658a);
                }
                Set setI1 = set;
                if (setI1.isEmpty()) {
                    Iterable iterable = (List) cVar.f317664c.get(zVar);
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    setI1 = d0.i1(iterable);
                }
                Set set2 = setI1;
                if (!collection.isEmpty() && set2.containsAll(arrayList)) {
                    return new TextLocalisedClause(R$string.documents_hub_custom_form_filter_description_all, null, null, 14);
                }
                if (!set2.isEmpty()) {
                    int i2 = tVar == null ? -1 : f.f148378b[tVar.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1 || i2 == 2) {
                            if (set2.size() >= 5) {
                                return new TextLocalisedQuantityClause(tVar == t.CURRENCIES ? R$plurals.documents_hub_custom_form_filter_description_currencies_count : R$plurals.documents_hub_custom_form_filter_description_assets_count, Integer.valueOf(set2.size()), (List) null, (Style) null, 28);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (set2.contains((String) obj2)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : set2) {
                                if (!arrayList.contains((String) obj3)) {
                                    arrayList3.add(obj3);
                                }
                            }
                            return new TextClause(d0.k0(d0.E0(arrayList3, arrayList2), null, null, null, 0, null, 63), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        }
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return new TextLocalisedQuantityClause(R$plurals.documents_hub_custom_form_filter_description_accounts_count, Integer.valueOf(set2.size()), (List) null, (Style) null, 28);
                }
            } else if (i == 3) {
                List list = (List) cVar.f317664c.get(z.FORMAT);
                if (list != null && (str = (String) d0.M0(list)) != null) {
                    Iterator<E> it9 = StatementsFormat.getEntries().iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it9.next();
                        if (Intrinsics.f(((StatementsFormat) next).getValue(), str)) {
                            break;
                        }
                    }
                    StatementsFormat statementsFormat = (StatementsFormat) next;
                    int i3 = statementsFormat == null ? -1 : f.f148379c[statementsFormat.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            return new TextClause("PDF", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        }
                        if (i3 == 2) {
                            return new TextLocalisedClause(R$string.statement_format_csv, null, null, 14);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (i == 4) {
                List list2 = (List) cVar.f317664c.get(z.LANGUAGE);
                if (list2 != null && (str2 = (String) d0.M0(list2)) != null) {
                    String displayName = Locale.forLanguageTag(str2).getDisplayName(((s80.b) this.f148382a).b());
                    Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
                    return new TextClause(displayName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                List list3 = (List) cVar.f317664c.get(zVar);
                if (list3 != null && (str3 = (String) d0.M0(list3)) != null) {
                    return new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
            }
        }
        return null;
    }
}
