package e2j;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import ip0.pb0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyChooserInputData f122137a;

    public q(CurrencyChooserInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f122137a = inputData;
    }

    public static ArrayList a() {
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("CURRENCY_LOADING", it8.nextInt())));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public final AccountCellItemDelegate.Model b(e eVar, boolean z) {
        RowDelegate.Model.c.b bVar;
        dj0.d dVar = eVar.f122119b;
        dj0.d dVar2 = eVar.f122119b;
        xi0.b bVar2 = dVar.f115083b;
        String str = bVar2.f306286a;
        CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        CurrencyClause currencyClause = new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, null, 4);
        CurrencyClause currencyClause2 = new CurrencyClause(bVar2, CurrencyClause.Format.DisplayName.f57755a, null, 4);
        if (!this.f122137a.f || dVar2.f115082a <= 0) {
            bVar = null;
        } else {
            bVar = new RowDelegate.Model.c.b(cp5.d.z(dVar2.f115083b) ? u5l.a.b(dVar2, null, null, null, 15) : new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
        }
        return new AccountCellItemDelegate.Model(str, z, (Image) currencyImage, (Clause) currencyClause, (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) currencyClause2, bVar, (ProgressStyle) null, (Object) bVar2, (Parcelable) null, 128816);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f122121b, new j(this, domainState), new dt4.p(23, domainState, this), new dn8.k(this, domainState, 8));
    }
}
