package gh3;

import cli.o;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.nb0;
import ip0.pb0;
import ip0.yl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hh3.c f143851a;

    public n(hh3.c uiBlocksMapper, kh3.a checklistUiScreenErrorMapper) {
        Intrinsics.checkNotNullParameter(uiBlocksMapper, "uiBlocksMapper");
        Intrinsics.checkNotNullParameter(checklistUiScreenErrorMapper, "checklistUiScreenErrorMapper");
        this.f143851a = uiBlocksMapper;
    }

    public static List a(int i, int i2) {
        List listC = u.c(new yl(a0.d.n("LOADING_SECTION_TITLE_LIST_ID_PREFIX_", i), 0, 30));
        IntRange intRangeO = kotlin.ranges.f.o(0, i2);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(nb0.b(pb0.Companion, a0.d.g(i, it8.nextInt(), "LOADING_SECTION_ITEM_LIST_ID_PREFIX_", "_"), true, 0, false, 28));
        }
        yp0.b.k(arrayList, R$attr.uikit_dp0, 0, 0, 0, 30);
        return i2b.a.o(listC, arrayList);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f143837a, new gd8.j(this, 20), new gcc.c(this, 10), new fnk.o(this, 26));
    }
}
