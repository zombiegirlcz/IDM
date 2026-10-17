package v21;

import com.revolut.data.network.models.news.NewsItemDto;
import com.revolut.data.network.services.NewsService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import efm.r;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import v20.s;
import v20.t;
import zhm.a1;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements q71.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewsService f285625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f285626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f285627c;
    public final w4l.f d;

    public f(NewsService newsService, ne0.d newsCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(newsService, "newsService");
        Intrinsics.checkNotNullParameter(newsCache, "newsCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f285625a = newsService;
        this.f285626b = newsCache;
        this.f285627c = storage;
        final int i = 0;
        final int i2 = 1;
        this.d = new w4l.f(new Function2(this) { // from class: v21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f285624b;

            {
                this.f285624b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i;
                f fVar = this.f285624b;
                switch (i3) {
                    case 0:
                        NewsService newsService2 = fVar.f285625a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String param = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (!Intrinsics.f(param, "ALL_NEWS")) {
                            d0<NewsItemDto> newsById = newsService2.getNewsById(param);
                            t tVar = new t(new s(15), 17);
                            newsById.getClass();
                            i iVar = new i(newsById, tVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        NewsService.Companion companion = NewsService.INSTANCE;
                        d0<List<NewsItemDto>> news = newsService2.getNews("WALLET");
                        t tVar2 = new t(new s(14), 16);
                        news.getClass();
                        i iVar2 = new i(news, tVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        ne0.d dVar = fVar.f285626b;
                        String params = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (Intrinsics.f(params, "ALL_NEWS")) {
                            dVar.t1(value, new s(13));
                        } else {
                            dVar.f(j6.a.q("NEWS_ITEMS_LIST_", params), value.get(0));
                        }
                        return Unit.f186387a;
                }
            }
        }, new uu9.b(this, 28), new Function2(this) { // from class: v21.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f285624b;

            {
                this.f285624b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i2;
                f fVar = this.f285624b;
                switch (i3) {
                    case 0:
                        NewsService newsService2 = fVar.f285625a;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String param = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(param, "param");
                        if (!Intrinsics.f(param, "ALL_NEWS")) {
                            d0<NewsItemDto> newsById = newsService2.getNewsById(param);
                            t tVar = new t(new s(15), 17);
                            newsById.getClass();
                            i iVar = new i(newsById, tVar, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                            return iVar;
                        }
                        NewsService.Companion companion = NewsService.INSTANCE;
                        d0<List<NewsItemDto>> news = newsService2.getNews("WALLET");
                        t tVar2 = new t(new s(14), 16);
                        news.getClass();
                        i iVar2 = new i(news, tVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                        return iVar2;
                    default:
                        ne0.d dVar = fVar.f285626b;
                        String params = (String) obj2;
                        List value = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (Intrinsics.f(params, "ALL_NEWS")) {
                            dVar.t1(value, new s(13));
                        } else {
                            dVar.f(j6.a.q("NEWS_ITEMS_LIST_", params), value.get(0));
                        }
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    @Override // q71.a
    public final void a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Type type = l21.d.f191611b;
        Intrinsics.checkNotNullExpressionValue(type, "<get-SET_OF_STRINGS_TYPE>(...)");
        ue0.c cVar = this.f285627c;
        Set set = (Set) cVar.T2("VIEWED_NEWS_STORAGE", type);
        if (set == null) {
            set = h0.f322473a;
        }
        cVar.G(a1.m(set, id10), "VIEWED_NEWS_STORAGE", kii.e.o(String.class, KTypeProjection.INSTANCE, Set.class));
    }

    @Override // q71.a
    public final r b() {
        return this.d.f("ALL_NEWS", false);
    }

    @Override // q71.a
    public final r c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return nim.a.w(this.d.f(id10, false), new s(16));
    }

    @Override // q71.a
    public final boolean d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Type type = l21.d.f191611b;
        Intrinsics.checkNotNullExpressionValue(type, "<get-SET_OF_STRINGS_TYPE>(...)");
        Set set = (Set) this.f285627c.T2("VIEWED_NEWS_STORAGE", type);
        return set != null && set.contains(id10);
    }
}
