package n87;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements cli.n {

    @NotNull
    private static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f213269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f213270b;

    public t(b headerMapper, v performanceAssetMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f213269a = performanceAssetMapper;
        this.f213270b = wealthDisclaimersMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        int i2;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        h87.f key = domainState.f213254a;
        Intrinsics.checkNotNullParameter(key, "key");
        int[] iArr = a.f213247a;
        switch (iArr[key.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                i = R$string.markets_indexes_header_title;
                break;
            case 5:
                i = R$string.markets_commodities_header_title;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                i = R$string.markets_currency_pairs_header_title;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        h87.f key2 = domainState.f213254a;
        Intrinsics.checkNotNullParameter(key2, "key");
        switch (iArr[key2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                i2 = R$string.markets_indexes_header_description;
                break;
            case 5:
                i2 = R$string.markets_commodities_header_description;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = R$string.markets_currency_pairs_header_description;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
        Data data = domainState.f213255b;
        List list = data != null ? (List) iii.c.f(data, new n5k.c(this), new r(this), new m88.c(domainState, this, 22)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new n(textLocalisedClause, textLocalisedClause2, list, domainState.d);
    }
}
