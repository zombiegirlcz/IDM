package d2c;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.qe0;
import ip0.we0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        we0 we0Var = new we0("IMAGE_ITEM_ID", new qe0(Constants.TAG_SUPPORTED_LOCALE_LIST, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)));
        List listK = v.k(new Pair(Integer.valueOf(R$string.rev_points_deactivation_round_ups_stop), Integer.valueOf(R$drawable.uikit_icn_24_decline)), new Pair(Integer.valueOf(R$string.rev_points_deactivation_card_spend_stop), Integer.valueOf(R$drawable.uikit_icn_24_decline)), new Pair(Integer.valueOf(R$string.rev_points_deactivation_redeem_points_allowed), Integer.valueOf(R$drawable.uikit_icn_24_check)));
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        int i = 0;
        for (Object obj2 : listK) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Pair pair = (Pair) obj2;
            int iIntValue = ((Number) pair.f186385a).intValue();
            arrayList.add(new RowDelegate.Model(String.valueOf(i), new RowDelegate.Model.MainImage.Image24(new ResourceImage(((Number) pair.f186386b).intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(iIntValue, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new f(i2b.a.q(we0Var, arrayList));
    }
}
