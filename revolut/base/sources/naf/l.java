package naf;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequestPosition;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<TransferRequestPosition> list = domainState.f213891a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TransferRequestPosition transferRequestPosition : list) {
            String str = transferRequestPosition.f91525a;
            Boolean bool = transferRequestPosition.f;
            String strQ = j6.a.q(" TRANSFER_IN_POSITION_", str);
            TextClause textClause = new TextClause(transferRequestPosition.f91526b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            f fVar = null;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new InstrumentImage(transferRequestPosition.f91525a, 30, null, null), null, null, false, null, false, 62);
            NumberClause numberClause = new NumberClause(transferRequestPosition.d, (NumberClause.Format.Compact) null, (Custom) null, 6);
            xi0.a aVar = xi0.b.Companion;
            String str2 = transferRequestPosition.f91527c;
            aVar.getClass();
            List listK = v.k(numberClause, new CurrencyClause(xi0.a.a(str2), CurrencyClause.Format.Ticker.f57756a, null, 4));
            t0 t0Var = t0.f186434a;
            m70.a.t(t0Var);
            CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            ej0.b bVar = transferRequestPosition.e;
            if (bVar != null) {
                List listK2 = v.k(compositeClause, new MoneyClause(mif.a.P(bVar, 0, 3), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                compositeClause = new CompositeClause(listK2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
            Boolean bool2 = Boolean.TRUE;
            tf tfVar = (!Intrinsics.f(bool, bool2) || bVar == null) ? null : new tf(6, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
            boolean zF = Intrinsics.f(bool, bool2);
            if (Intrinsics.f(bool, bool2) && bVar != null) {
                fVar = new f(transferRequestPosition);
            }
            arrayList.add(new RowDelegate.Model(strQ, image40, textClause, null, 0, compositeClause, null, null, 0, tfVar, zF, null, false, null, null, null, null, null, null, fVar, null, 0, 0, 0, 0, 532673496));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new h(arrayList);
    }
}
