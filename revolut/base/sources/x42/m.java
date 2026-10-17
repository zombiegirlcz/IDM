package x42;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(c cVar) {
        return new RowDelegate.Model(cVar.f302776a, null, cVar.f302777b, null, 0, null, null, null, 0, new vf(cVar.a(), true), false, null, false, null, null, null, null, null, null, cVar, null, 0, 0, 0, 0, 532675578);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        x42.a domainState = (x42.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        RowDelegate.Model[] elements = {a(domainState.f302772a), a(domainState.f302773b)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        LocalDate localDate = domainState.f302774c;
        CellDetailsActionDelegate.Model model = new CellDetailsActionDelegate.Model("ID_EXPIRY_DATE", new TextLocalisedClause(R$string.apm_transfer_amount_settings_field_expiry, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TimeClause(oc.c.F(localDate), new TimeClause.Format.DayAndMonth(0), null, null, 12), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return new f(u.a(eVarB));
    }
}
