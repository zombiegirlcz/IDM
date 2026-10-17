package m0k;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lu5.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f201161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WealthNewsCategory f201162c;

    public /* synthetic */ d(e eVar, WealthNewsCategory wealthNewsCategory, int i) {
        this.f201160a = i;
        this.f201161b = eVar;
        this.f201162c = wealthNewsCategory;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f201160a) {
            case 0:
                rzj.e wealthNews = (rzj.e) obj2;
                Intrinsics.checkNotNullParameter(wealthNews, "wealthNews");
                return nim.a.w(this.f201161b.f201164b.a(this.f201162c.f101803a, wealthNews.f258693a), new o(wealthNews, 29));
            default:
                List articles = (List) obj2;
                Intrinsics.checkNotNullParameter(articles, "articles");
                return this.f201161b.f201164b.a(this.f201162c.f101803a, articles);
        }
    }
}
