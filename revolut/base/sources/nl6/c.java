package nl6;

import android.os.Parcelable;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.subaccount.api.models.Subaccount;
import gl6.g;
import io3.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import m35.r;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import pcd.g0;
import pcd.s;
import yp0.e0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f217042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f217043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c91.a f217044c;

    public c(g consentPermissionsMapper, r loanUiContentMapper, gte.a featureToggleInteractor, c91.a juniorAccountNameProvider) {
        Intrinsics.checkNotNullParameter(consentPermissionsMapper, "consentPermissionsMapper");
        Intrinsics.checkNotNullParameter(loanUiContentMapper, "loanUiContentMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountNameProvider, "juniorAccountNameProvider");
        this.f217042a = loanUiContentMapper;
        this.f217043b = featureToggleInteractor;
        this.f217044c = juniorAccountNameProvider;
    }

    public static List a(List list, ArrayList arrayList, List list2, String str, int i, Map map) {
        List<d> list3 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
        for (d dVar : list3) {
            xi0.a aVar = xi0.b.Companion;
            String str2 = dVar.f163147c;
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(str2);
            dj0.d dVar2 = new dj0.d(dVar.i, bVarA);
            n9l.a aVar2 = (n9l.a) map.get(bVarA);
            dj0.d dVarK = aVar2 != null ? pyd.c.K(dVar2, aVar2.f213663c, aVar2.f213662b) : null;
            arrayList2.add(new RowDelegate.Model(j6.a.q("POCKET_ITEM_LIST_ID_", dVar.f163145a), new RowDelegate.Model.MainImage.Image40(new CurrencyImage(dVar.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62), new CurrencyClause(bVarA, null, null, 6), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), dVarK != null ? new MoneyClause(dVarK, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832));
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Subaccount subaccount = (Subaccount) it8.next();
            xi0.b currency = subaccount.getCurrency();
            dj0.d balance = subaccount.getBalance();
            n9l.a aVar3 = (n9l.a) map.get(currency);
            dj0.d dVarK2 = aVar3 != null ? pyd.c.K(balance, aVar3.f213663c, aVar3.f213662b) : null;
            arrayList3.add(new RowDelegate.Model(j6.a.q("SUBACCOUNT_ITEM_LIST_ID_", subaccount.getF88959a().f234881a), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), null, null, false, null, false, 62), !d0.W(subaccount.getName()) ? new TextClause(subaccount.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new CurrencyClause(currency, null, null, 6), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(balance, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), dVarK2 != null ? new MoneyClause(dVarK2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832));
        }
        ArrayList arrayListE0 = zhm.d0.E0(arrayList3, arrayList2);
        List list4 = list2;
        ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
        Iterator it9 = list4.iterator();
        while (it9.hasNext()) {
            arrayList4.add(d((s) it9.next(), map));
        }
        ArrayList arrayListE02 = zhm.d0.E0(arrayList4, arrayListE0);
        return arrayListE02.isEmpty() ? f0.f322471a : yp0.b.g(arrayListE02, new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), e0.INSIDE_BOX, 0, 0, 124);
    }

    public static CellDetailsNoteDelegate.Model b(List list) {
        CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("ACCOUNT_NUMBERS_ITEM_LIST_ID", new TextLocalisedClause(R$string.consent_details_account_numbers, null, null, 14), null, new TextClause(zhm.d0.k0(list, null, null, null, 0, new nl0.c(19), 31), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
        if (list.isEmpty()) {
            return null;
        }
        return model;
    }

    public static CellDetailsDelegate.Model c(DateTime dateTime) {
        if (dateTime != null) {
            return new CellDetailsDelegate.Model("END_DATE_ITEM_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.open_banking_consent_details_row_title_end_date, null, null, 14), (Image) null, 0, false, 30), new TimeClause(dateTime.getMillis(), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        return null;
    }

    public static RowDelegate.Model d(s sVar, Map map) {
        xi0.b bVarU = e.u(sVar, xi0.b.Companion);
        g0 g0Var = sVar.f234885h;
        dj0.d dVar = new dj0.d(g0Var.f234861c, bVarU);
        n9l.a aVar = (n9l.a) map.get(bVarU);
        dj0.d dVarK = aVar != null ? pyd.c.K(dVar, aVar.f213663c, aVar.f213662b) : null;
        return new RowDelegate.Model(j6.a.q("VAULT_ITEM_LIST_ID_", sVar.f234881a), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_vault, R$attr.uikit_colorWhite, R$attr.uikit_colorTerracotta), null, null, false, null, false, 62), !d0.W(g0Var.f234859a) ? new TextClause(g0Var.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new CurrencyClause(bVarU, null, null, 6), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), dVarK != null ? new MoneyClause(dVarK, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, false, 124), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867832);
    }
}
