package dnk;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ggk.d1;
import ggk.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f116365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f116366b;

    public m(c descriptionMapper, d idsMapper, l iconMapper) {
        Intrinsics.checkNotNullParameter(idsMapper, "idsMapper");
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
        this.f116365a = iconMapper;
        this.f116366b = descriptionMapper;
    }

    public final List a(d1 d1Var) {
        List list;
        if (d1Var != null && (list = (List) ue0.e.M(d1Var.f143709c)) != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                m0 m0Var = (m0) obj2;
                String strN = a0.d.n("app---", i);
                TextClause textClause = new TextClause(m0Var.f143751a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str = m0Var.f143752b;
                arrayList.add(new SplitColumnCellDelegate.Model(strN, textClause, this.f116366b.a(m0Var.f143753c), null, m0Var.d, m0Var.e != null, str != null ? n.a(str) : null, false, false, null, 524072));
                i = i2;
            }
            return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("perks_header", (Image) this.f116365a.c(d1Var.f143708b), (Clause) new TextClause(d1Var.f143707a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), null, 0, 0, 126);
        }
        return f0.f322471a;
    }
}
