package y66;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.HexagonalTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerContract$InputData;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements cli.n {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiAssetPickerContract$InputData f311206a;

    public s(DeFiAssetPickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f311206a = inputData;
    }

    public static ArrayList a(int i, String str) {
        IntRange intRangeO = kotlin.ranges.f.o(0, i);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(nb0.b(pb0.Companion, p.a.o(str, it8.nextInt()), false, 0, false, 30));
        }
        return arrayList;
    }

    public final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!this.f311206a.f71881b.contains(((e16.g) obj2).f121894a.f71635a)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.d;
        Data data = domainState.f311182a;
        if (str.length() > 0) {
            Object obj2 = (List) data.getContent();
            if (obj2 == null) {
                obj2 = f0.f322471a;
            }
            list = (List) iii.c.g(domainState.f311183b, new p(this, 0), new y65.n(2), new soc.f(this, 17, domainState, obj2));
        } else {
            list = (List) iii.c.f(data, new y4b.b(this, 29), new y65.n(1), new wx6.k(this, domainState, 29));
        }
        return new c(list);
    }

    public final RowDelegate.Model d(q66.e eVar) {
        DefiCurrency defiCurrency = eVar.f242515a;
        boolean zF = Intrinsics.f(defiCurrency.f71671a, this.f311206a.f71880a);
        return new RowDelegate.Model(defiCurrency.f71671a, RowDelegate.Model.MainImage.Image40.b(z66.a.a(defiCurrency), d8l.d.b(zF), 61), new TextClause(defiCurrency.f71673c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(defiCurrency.f71672b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, zF, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862680);
    }

    public final RowDelegate.Model e(e16.g gVar) {
        DeFiBalance deFiBalance = gVar.f121894a;
        boolean zF = Intrinsics.f(deFiBalance.f71635a, this.f311206a.f71880a);
        String str = deFiBalance.f71635a;
        String str2 = deFiBalance.f71639h;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str2, new ImageTransformations(null, HexagonalTransformation.f60062a, null, null, null, null, null, ISO781611.SMT_TAG), (TextLocalisedClause) null, 10), d8l.d.b(zF), null, false, null, false, 60);
        TextClause textClause = new TextClause(deFiBalance.f71639h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        CurrencyClause currencyClause = new CurrencyClause(new xi0.b(6, str2, null), null, null, 6);
        AssetClause assetClauseE = u5l.a.e(deFiBalance.a(), null);
        dj0.d dVar = gVar.f121895b;
        return new RowDelegate.Model(str, image40, textClause, null, 0, currencyClause, null, null, 0, new RowDelegate.Model.c.b(assetClauseE, dVar != null ? u5l.a.c(dVar, null, null, null, 7) : null, null, false, 76), false, null, zF, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536861656);
    }
}
