package mk5;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements cli.n {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData f206182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xj5.c f206183b;

    public c0(CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData, xj5.c revolutFriendsTabUiMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutFriendsTabUiMapper, "revolutFriendsTabUiMapper");
        this.f206182a = inputData;
        this.f206183b = revolutFriendsTabUiMapper;
    }

    public static ArrayList a() {
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("CURRENCY_LOADING", it8.nextInt())));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public final AccountCellItemDelegate.Model b(l lVar, boolean z) {
        dj0.d dVar;
        xi0.b bVar = lVar.f206187b;
        String str = bVar.f306286a;
        RowDelegate.Model.c.b bVar2 = null;
        CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        CurrencyClause currencyClause = new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4);
        TextClause textClause = new TextClause(lVar.f206186a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (this.f206182a.f70948h && (dVar = lVar.f206188c) != null && dVar.f115082a != 0) {
            MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, ScaleMode.CryptoHoldingFormat.f51439a, false, false, 13), null, null, 12);
            dj0.d dVar2 = lVar.d;
            bVar2 = new RowDelegate.Model.c.b(moneyClause, dVar2 != null ? new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, false, 124);
        }
        return new AccountCellItemDelegate.Model(str, z, (Image) currencyImage, (Clause) currencyClause, (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) textClause, bVar2, (ProgressStyle) null, (Object) bVar, (Parcelable) null, 128816);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = b0.f206180a[domainState.f206189a.ordinal()];
        if (i == 1) {
            return (p) iii.c.f(domainState.f206191c, new m98.k(this, domainState), new m84.e(domainState, 21), new m88.c(this, domainState, 8));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Data data = domainState.e;
        boolean z = domainState.f;
        String str = domainState.f206190b;
        return new p(((vk5.c) this.f206183b).a(data, str, z), domainState.d, domainState.f206189a, str);
    }
}
