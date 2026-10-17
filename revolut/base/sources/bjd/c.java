package bjd;

import a0.d;
import bjd.b;
import com.revolut.core.ui_kit.delegates.pe;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.za0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static List a(boolean z) {
        b.a aVar = b.a.f15594a;
        Object obj2 = z ? aVar : null;
        b.C0101b c0101b = b.C0101b.f15595a;
        if (obj2 == null) {
            obj2 = c0101b;
        }
        if (!obj2.equals(aVar)) {
            if (!obj2.equals(c0101b)) {
                throw new NoWhenBranchMatchedException();
            }
            List listK = v.k(new gu("SHOPS_SEARCH_LAYOUT_LOADING_RESULT_HEADER", 0, 0, 30), nb0.b(pb0.Companion, "SHOPS_SEARCH_LAYOUT_LOADING_RESULT_ROW", false, 0, false, 30));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return listK;
        }
        gu guVar = new gu("SHOPS_SEARCH_LAYOUT_LOADING_EMPTY_HEADER", 0, 0, 30);
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(new pe(d.n("SHOPS_SEARCH_LAYOUT_LOADING_EMPTY_GRID_ITEM__", i)));
        }
        za0 za0Var = new za0("SHOPS_SEARCH_LAYOUT_LOADING_EMPTY_GRID", arrayList);
        yp0.b.l(za0Var, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
        return v.k(guVar, za0Var);
    }
}
