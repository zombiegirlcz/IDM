package afa;

import ael.r0;
import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pockets.impl.R$plurals;
import com.revolut.feature.pockets.impl.R$string;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListContract$InputData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements cli.n {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f3983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PocketsListContract$InputData f3984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final psi.a f3985c;
    public final b d;

    public e0(f01.c uiKitResources, PocketsListContract$InputData inputData, psi.a accountPocketsComparator, b accountCurrencyInfoComparator) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountPocketsComparator, "accountPocketsComparator");
        Intrinsics.checkNotNullParameter(accountCurrencyInfoComparator, "accountCurrencyInfoComparator");
        this.f3983a = uiKitResources;
        this.f3984b = inputData;
        this.f3985c = accountPocketsComparator;
        this.d = accountCurrencyInfoComparator;
    }

    public static CompositeClause d(String str) {
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str), CurrencyClause.Format.Ticker.f57756a, null, 4);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.account_details_list_item_iban, null, null, 14);
        aVar.getClass();
        Object[] elements = {currencyClause, Intrinsics.f(str, xi0.b.f306272g.f306286a) ? textLocalisedClause : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.a(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static CompositeClause e(String str, wi0.b bVar) {
        xi0.b.Companion.getClass();
        Object[] elements = {new CurrencyClause(xi0.a.a(str), CurrencyClause.Format.DisplayName.f57755a, null, 4), new CountryClause(bVar, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.a(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static Clause f(String str, mda.c cVar) {
        wi0.b bVarA;
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        if (Intrinsics.f(str, xi0.b.f306272g.f306286a)) {
            return d(str);
        }
        aVar.getClass();
        CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str), CurrencyClause.Format.Ticker.f57756a, null, 4);
        if (cVar == null || (bVarA = cVar.a()) == null) {
            return currencyClause;
        }
        Object[] elements = {currencyClause, new CountryClause(bVarA, null)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.a(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static RowDelegate.Model h(io3.d dVar, boolean z, boolean z3, int i) {
        String str = dVar.f163147c;
        String strQ = j6.a.q("EXPANDABLE_GROUP_", str);
        xi0.b.Companion.getClass();
        return new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14), d8l.d.b(z), null, false, null, false, 60), new CurrencyClause(xi0.a.a(str), CurrencyClause.Format.DisplayName.f57755a, null, 4), null, 0, new TextLocalisedQuantityClause(R$plurals.account_details_list_item_multi_country_subtitle, Integer.valueOf(i), (List) null, (Style) null, 28), null, null, 0, new tf(new yy0.j(z3 ? new ResourceImage(R$drawable.uikit_icn_16_chevron_up, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, z, null, null, null, null, null, null, new d0(dVar, null), null, 0, 0, 0, 0, 532667352);
    }

    public final boolean a(String str, wi0.b bVar) {
        if (!kotlin.text.d0.J(bVar.f297794a, str, true)) {
            if (!kotlin.text.d0.J(this.f3983a.b(new CountryClause(bVar, null)), str, true)) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(String str, String str2) {
        if (!kotlin.text.d0.J(str, str2, true)) {
            xi0.b.Companion.getClass();
            if (!kotlin.text.d0.J(this.f3983a.b(new CurrencyClause(xi0.a.a(str), null, null, 6)).toString(), str2, true)) {
                return false;
            }
        }
        return true;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(t1.x(domainState.f3987a, domainState.f3988b, domainState.f3989c, domainState.d, domainState.f3990g, domainState.f3991h), new r0(22), new a9d.p(21), new a15.n(this, domainState, 11)));
    }

    public final boolean g(String str, String str2, List list) {
        if (b(str2, str)) {
            return true;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            if (a(str, ((mda.c) it8.next()).a())) {
                return true;
            }
        }
        return false;
    }
}
