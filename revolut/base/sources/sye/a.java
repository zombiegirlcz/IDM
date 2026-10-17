package sye;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    @NotNull
    public static final C1494a Companion = new C1494a();

    /* JADX INFO: renamed from: sye.a$a, reason: collision with other inner class name */
    public static final class C1494a {
        private C1494a() {
        }
    }

    public static CellDetailsDelegate.Model a(qte.a aVar) {
        return new CellDetailsDelegate.Model(j6.a.q("BE_DRIVEN_BREAKDOWN_ITEM_", aVar.f249095a), new t0((Clause) new TextClause(aVar.f249096b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new MoneyClause(aVar.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new b(aVar.f249097c, aVar.d), null, null, 0, null, false, false, null, null, 32696);
    }
}
