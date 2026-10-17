package az4;

import aim.e;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import ip0.ak0;
import ip0.yj0;
import java.util.List;
import jki.i;
import jki.j;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e eVarB = u.b();
        ak0 ak0Var = new ak0(yj0.START, xy4.a.a());
        m70.a.c(t0.f186434a);
        eVarB.add(new TextDelegate.Model("id_image_item", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, ak0Var, null, null, 0, R$attr.uikit_dp0, 0, 0, 1780));
        List listK = v.k(new ListCellDelegate.Model("id_item_0", new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new HtmlLocalisedClause(R$string.credit_direct_debit_guarantee_list_0, (List) null, (Integer) null, (Object) null, 30), null, false, null, null, 0, 0, 0, 0, 4072), new ListCellDelegate.Model("id_item_1", new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new HtmlLocalisedClause(R$string.credit_direct_debit_guarantee_list_1, (List) null, (Integer) null, (Object) null, 30), null, false, null, null, 0, 0, 0, 0, 4072), new ListCellDelegate.Model("id_item_2", new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new HtmlLocalisedClause(R$string.credit_direct_debit_guarantee_list_2, (List) null, (Integer) null, (Object) null, 30), null, false, null, null, 0, 0, 0, 0, 4072), new ListCellDelegate.Model("id_item_3", new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new HtmlLocalisedClause(R$string.credit_direct_debit_guarantee_list_3, (List) null, (Integer) null, (Object) null, 30), null, false, null, null, 0, 0, 0, 0, 4072));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new b(u.a(eVarB));
    }
}
