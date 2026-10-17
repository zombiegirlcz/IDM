package ulh;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import okl.l1;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.q0;
import vkm.y;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements a {

    @NotNull
    public static final b Companion = new b();
    public static final Type d = new TypeToken<Map<String, ? extends Boolean>>() { // from class: com.revolut.feature.wealth.ui.impl.repository.AccountWidgetsPersonalisationRepositoryImpl$Companion$MAP_STRING_BOOLEAN_TYPE$1
    }.getType();
    public static final Type e = new TypeToken<List<? extends String>>() { // from class: com.revolut.feature.wealth.ui.impl.repository.AccountWidgetsPersonalisationRepositoryImpl$Companion$LIST_STRING_BOOLEAN_TYPE$1
    }.getType();
    public static final String f = "UPSSELLING_ACCOUNTS_SHOWN_FIRST_TIME_DATE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f281017g = "UPSSELLING_ACCOUNTS_ENABLED";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f281018h;
    public static final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f281019j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f281020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4m.a f281021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk0.a f281022c;

    static {
        Intrinsics.checkNotNullParameter("INVEST_PORTFOLIO_WIDGET_SORT_BY", "id");
        f281018h = "INVEST_PORTFOLIO_WIDGET_SORT_BY";
        Intrinsics.checkNotNullParameter("INVEST_PORTFOLIO_WIDGET_SHOW_UP_TO", "id");
        i = "INVEST_PORTFOLIO_WIDGET_SHOW_UP_TO";
        Intrinsics.checkNotNullParameter("INVEST_PORTFOLIO_WIDGET_GROUP_BY_PRODUCT", "id");
        f281019j = "INVEST_PORTFOLIO_WIDGET_GROUP_BY_PRODUCT";
    }

    public n(d4m.a storage, d4m.a memoryCache, mk0.a personalisationStorage, vlh.b portfolioSortByMapper, vlh.a portfolioShowUpToMapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(portfolioSortByMapper, "portfolioSortByMapper");
        Intrinsics.checkNotNullParameter(portfolioShowUpToMapper, "portfolioShowUpToMapper");
        this.f281020a = storage;
        this.f281021b = memoryCache;
        this.f281022c = personalisationStorage;
    }

    public final Flow a() {
        return q.q(new y(new e(this, null, 0), new l1(new q0(t1.E(((ue0.c) this.f281020a.get()).C0(f, LocalDate.class)), new d(this, null, 0), 1), 11)));
    }

    public final l b() {
        return new l(oc.c.t(this.f281022c, new tk0.f(f281018h), (Serializable) r0.g()), this, 1);
    }
}
