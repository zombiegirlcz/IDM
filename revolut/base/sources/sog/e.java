package sog;

import akg.n;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import sl3.i;
import sl5.g;
import soc.f;
import vkm.q;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends x7a.c {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f264829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kbl.a f264830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df0.b f264831c;
    public final z1 d;

    public e(f01.a uiKitResources, kbl.a citizenshipPickerCountryInteractor, df0.b syncedDateProvider) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(citizenshipPickerCountryInteractor, "citizenshipPickerCountryInteractor");
        Intrinsics.checkNotNullParameter(syncedDateProvider, "syncedDateProvider");
        this.f264829a = uiKitResources;
        this.f264830b = citizenshipPickerCountryInteractor;
        this.f264831c = syncedDateProvider;
        this.d = q.b(8, 5, null);
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new s7a.q((String) d0.a0(ids), null);
    }

    @Override // x7a.c, x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new i(27), new g(16), new f(this, 1, selectedModelIds, query));
    }

    @Override // x7a.d
    public final Flow h() {
        return this.d;
    }

    @Override // x7a.c
    public final ff i() {
        return ff.DP_40;
    }

    @Override // x7a.c
    public final String k(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return this.f264829a.b(new CountryClause(countryCode, null)).toString();
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        return this.f264830b.d();
    }

    @Override // x7a.c
    public final n n(Object obj2) {
        return nim.a.v(super.n(obj2), new sl5.a(this, 8));
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        return this.f264830b.a();
    }

    public final a q(wi0.b bVar) {
        CountryClause countryClause = new CountryClause(bVar, null);
        f01.a aVar = this.f264829a;
        String string = aVar.b(countryClause).toString();
        String str = bVar.f297794a;
        qd0.b.Companion.getClass();
        String lowerCase = str.toLowerCase(qd0.a.f244819b);
        return new a(string, aVar.b(new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "nationality.", lowerCase), (List) null, (Clause) new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22)).toString(), bVar);
    }

    public final RowDelegate.Model r(a aVar, Set set) {
        boolean zContains = set.contains(aVar.f264824a.f297794a);
        wi0.b bVar = aVar.f264824a;
        return new RowDelegate.Model(bVar.f297794a, new RowDelegate.Model.MainImage.Image40(new CountryImage(bVar.f297794a, (Integer) null, (ez0.e) null, 14), d8l.d.b(zContains), null, false, null, false, 60), new TextClause(aVar.f264825b, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, 0, new TextClause(aVar.f264826c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, zContains, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536861656);
    }
}
