package jeg;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<ieg.b> list = domainState.f173389a;
        ArrayList arrayList = new ArrayList();
        for (ieg.b bVar : list) {
            List<ieg.a> list2 = bVar.f160711b;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (ieg.a aVar : list2) {
                arrayList2.add(new InputChecklistDelegate.Model(j6.a.q("AMENITY_", aVar.f160707a.f97837a), new TextClause(aVar.f160707a.f97839c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), aVar.f160708b, false, null, iq.CHECK_BUTTON, null, null, aVar, null, 0, 0, 0, 523992));
            }
            oei.b bVar2 = bVar.f160710a;
            a0.x(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model(j6.a.q("CATEGORY_", bVar2.name()), (Image) null, (Clause) ue8.c.z(bVar2), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList);
        }
        return new f(arrayList);
    }
}
