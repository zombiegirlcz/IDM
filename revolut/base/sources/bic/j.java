package bic;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.rewards.api.model.concierge.Cell;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements Function1 {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f15471a;

    public j(f cellMapper) {
        Intrinsics.checkNotNullParameter(cellMapper, "cellMapper");
        this.f15471a = cellMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List invoke(List list) {
        if (list == null) {
            return f0.f322471a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dgc.b bVar = (dgc.b) obj2;
            String str = bVar.f114617b;
            String str2 = bVar.f114618c;
            ListSubheaderDelegate.Model model = str != null ? new ListSubheaderDelegate.Model(a0.d.n("ID_SECTION_SUBHEADER_", i), (Image) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) (str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514) : null;
            ArrayList arrayList2 = bVar.f114616a;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            int i3 = 0;
            for (Object obj3 : arrayList2) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                arrayList3.add(this.f15471a.invoke(a0.d.g(i, i3, "ID_SECTION_ITEM_", "_"), (Cell) obj3));
                i3 = i5;
            }
            yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
            aim.e eVarB = u.b();
            if (model != null) {
                eVarB.add(model);
            }
            eVarB.addAll(arrayList3);
            arrayList.add(u.a(eVarB));
            i = i2;
        }
        return w.u(arrayList);
    }
}
