package gpd;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i3;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f145447a;

    public n(thf.c transactionCategoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        this.f145447a = transactionCategoryResourcesMapper;
    }

    public final ArrayList a(List list, i3 i3Var) {
        List<i3> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (i3 i3Var2 : list2) {
            thf.c cVar = this.f145447a;
            String strK = ((wjf.e) cVar).k(i3Var2);
            LayeredImage layeredImageI = ((wjf.e) cVar).i(i3Var2, null, null);
            String id10 = null;
            String id11 = i3Var2.getId();
            TextClause textClause = new TextClause(strK, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String id12 = i3Var2.getId();
            if (i3Var != null) {
                id10 = i3Var.getId();
            }
            arrayList.add(new IconDelegate.Model(id11, layeredImageI, textClause, null, d8l.d.b(Intrinsics.f(id12, id10)), null, i3Var2, null, 712));
        }
        return arrayList;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (d) iii.c.f(domainState.f145436a, new gn.a(this, 19), new gp3.n(5), new fyg.b(this, domainState, 20));
    }
}
