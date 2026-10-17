package cg7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import f01.c;
import go.g;
import java.util.ArrayList;
import java.util.List;
import jf7.l1;
import jf7.x;
import jf7.y;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements xf7.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f23866a;

    public b(xf7.a commonMapper, c uiKitResources) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f23866a = uiKitResources;
    }

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        Object objG;
        y block = (y) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        List list = block.f173725b;
        if (list.isEmpty()) {
            objG = f0.f322471a;
        } else {
            ListSubheaderDelegate.Model modelA = xf7.a.a(j6.a.q("ICON_LIST_TITLE_LIST_ID_", block.f173724a), new TextClause(block.f173724a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null);
            List<x> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (x xVar : list2) {
                String str = xVar.f173719a;
                String str2 = xVar.f173721c;
                String str3 = xVar.f173720b;
                int iA = this.f23866a.a(str);
                Integer numValueOf = Integer.valueOf(iA);
                if (iA == 0) {
                    numValueOf = null;
                }
                arrayList.add(new ListCellDelegate.Model(p.a.p("ICON_LIST_ITEM_ID_", str3, str2), new j8(new ResourceImage(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, false, null, null, 0, 0, 0, 0, 4064));
            }
            objG = yp0.b.g(arrayList, modelA, null, 0, 0, 126);
        }
        return new g(objG, 2);
    }
}
