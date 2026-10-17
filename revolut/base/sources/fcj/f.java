package fcj;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.crypto_deposits.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import eii.l;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj5.a f133834a;

    public f(uj5.a blockchainUiMapper) {
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        this.f133834a = blockchainUiMapper;
    }

    public final eii.c a(List blockchains, wk5.a aVar) {
        Intrinsics.checkNotNullParameter(blockchains, "blockchains");
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.crypto_receive_screen_select_network_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_receive_screen_select_network_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "SELECT_NETWORK_LEARN_MORE_ID", false), 10))), null, null, false, 28);
        Intrinsics.checkNotNullParameter(blockchains, "blockchains");
        List<wk5.a> list = blockchains;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (wk5.a aVar3 : list) {
            boolean z = aVar3 == aVar;
            uj5.a aVar4 = this.f133834a;
            Clause clauseB = ((ik5.a) aVar4).b(aVar3, false, null);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int iC = ((ik5.a) aVar4).c(aVar3);
            int i = R$attr.uikit_colorAccentNeutral;
            arrayList.add(new l(clauseB, (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.a(companion, iC, new Color.Solid(i), new Color.ModifiedColor(new Color.Solid(i), 0.1f), 8.0f, Float.valueOf(24.0f), 32), z ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), true, z, (RowDelegate.Model.c) null, (Object) aVar3, 200));
        }
        k9 value = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new eii.c(aVar2, null, arrayList, new AnalyticsProduct.Retail(value), null);
    }
}
