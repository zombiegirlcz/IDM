package lvb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lp6.g;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import vkm.j2;
import vkm.q;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends x7a.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh1.b f200354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f200355b;

    public c(rh1.b addressFlowInteractor) {
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        this.f200354a = addressFlowInteractor;
        this.f200355b = q.c(h0.f322473a);
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new c8a.a((String) d0.a0(ids));
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        Object content = data.getContent();
        List list2 = content instanceof List ? (List) content : null;
        if (list2 == null) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof a) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : arrayList) {
            a aVar = (a) obj4;
            if (kotlin.text.d0.J(aVar.f200352a, query, true) || kotlin.text.d0.J(aVar.f200353b, query, true)) {
                arrayList2.add(obj4);
            }
        }
        List<a> listP0 = d0.P0(arrayList2, new k2j.d(new e23.c(10, selectedModelIds), 5));
        ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
        for (a aVar2 : listP0) {
            boolean zContains = selectedModelIds.contains(aVar2.f200353b);
            arrayList3.add(new RowDelegate.Model(aVar2.f200353b, new RowDelegate.Model.MainImage.Image40(new CountryImage(aVar2.f200353b, (Integer) null, (ez0.e) null, 14), zContains ? new AccentCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60), new TextClause(aVar2.f200352a, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, 0, null, null, null, 0, null, false, null, zContains, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862712));
        }
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        return arrayList3;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new t38.e(((lj1.a) this.f200354a).a(), 24, this.f200355b, new g(this, (Continuation) null, 5));
    }
}
