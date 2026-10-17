package k49;

import aw0.x4;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import vkm.q;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements i49.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f180845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f180846b;

    public b(Set delegates, Comparator comparator) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.f180845a = delegates;
        this.f180846b = comparator;
    }

    public static List a(ArrayList arrayList) {
        List listC = u.c(new hg("ACTIONS_CAROUSEL_LIST_ID", arrayList, 1, x4.c.f10604a, null, new gg.b(arrayList.size() > 1, 2), false, false, null, null, 0, 0, 0, 0, 32704));
        int i = R$attr.uikit_dp0;
        yp0.b.q(listC, 0, 0, i, i, 3);
        return listC;
    }

    public final Flow b(j49.i params) {
        Intrinsics.checkNotNullParameter(params, "params");
        List listP0 = d0.P0(this.f180845a, this.f180846b);
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList.add(((i49.c) it8.next()).f(params));
        }
        ie7.h hVar = new ie7.h((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), this, 25);
        p0 p0Var = p0.f264001a;
        return q.C(hVar, elm.f.f127540b);
    }
}
