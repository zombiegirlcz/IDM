package ob0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f223833a;

    public n(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f223833a = uiKitResources;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.backend_flow.impl.ui.form_screen.interactors.CurrencyPickerParams");
        String str = ((e) obj2).f223818a;
        xi0.a aVar = xi0.b.Companion;
        String str2 = (String) d0.a0(ids);
        aVar.getClass();
        return new lb0.s(str, xi0.a.a(str2));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new v1(new k(obj2, null, 1));
    }

    @Override // ob0.b
    public final ArrayList i(String query, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            xi0.b bVar = (xi0.b) obj2;
            if (kotlin.text.d0.J(this.f223833a.b(new CurrencyClause(bVar, null, null, 6)).toString(), query, true) || kotlin.text.d0.J(bVar.f306286a, query, true)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // ob0.b
    public final Image j(Object obj2) {
        xi0.b bVar = (xi0.b) obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
    }

    @Override // ob0.b
    public final String k(Object obj2) {
        xi0.b bVar = (xi0.b) obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.f306286a;
    }

    @Override // ob0.b
    public final Clause m(Object obj2) {
        xi0.b bVar = (xi0.b) obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // ob0.b
    public final Clause n(Object obj2) {
        xi0.b bVar = (xi0.b) obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new CurrencyClause(bVar, null, null, 6);
    }
}
