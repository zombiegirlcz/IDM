package uzk;

import ael.t0;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import efm.r;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s78.n;
import uyh.t;
import uz7.f;
import y7a.w;
import ybl.l;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends a8a.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f284685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f284686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8b.a f284687c;
    public final f01.a d;

    public d(l tradingConfigInteractor, fk3.a configurationInteractor, n8b.a countryInteractor, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f284685a = tradingConfigInteractor;
        this.f284686b = configurationInteractor;
        this.f284687c = countryInteractor;
        this.d = uiKitResources;
    }

    @Override // a8a.d
    public final w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        wi0.a aVar = wi0.b.Companion;
        String str = (String) d0.a0(ids);
        aVar.getClass();
        return new b(wi0.a.a(str));
    }

    @Override // a8a.c, a8a.d
    public final r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        return nim.a.w(super.e(obj2, selectedModelIds, list), new n(list, 28));
    }

    @Override // a8a.c
    public final ff f() {
        return ff.DP_40;
    }

    @Override // a8a.c
    public final String h(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        String str = countryCode.f297794a;
        qd0.b.Companion.getClass();
        String lowerCase = str.toLowerCase(qd0.a.f244819b);
        return this.d.b(new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "nationality.", lowerCase), (List) null, (Clause) new TextClause(((o8b.c) this.f284687c).b(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22)).toString();
    }

    @Override // a8a.c
    public final r i() {
        r map = te0.w.H0(((t0) this.f284685a).e(), ((ik3.c) this.f284686b).i()).x().map(new f(5, new t(8)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // a8a.c
    public final r j() {
        r map = ((t0) this.f284685a).g().x().map(new f(6, new t(9)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
