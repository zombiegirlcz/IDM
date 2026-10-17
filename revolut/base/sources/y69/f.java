package y69;

import b79.m;
import com.revolut.data.model.Data;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import s69.j;
import vkm.j2;
import vkm.q;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r69.a f311240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zja.a f311241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z69.b f311242c;
    public final j2 d;

    public f(r69.a inboxInteractor, zja.a productArticleInteractor, z69.b productArticleParamsMapper) {
        Intrinsics.checkNotNullParameter(inboxInteractor, "inboxInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(productArticleParamsMapper, "productArticleParamsMapper");
        this.f311240a = inboxInteractor;
        this.f311241b = productArticleInteractor;
        this.f311242c = productArticleParamsMapper;
        this.d = q.c(r0.g());
    }

    public static Data a(Data entriesData, Map articles) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(entriesData, "entriesData");
        Intrinsics.checkNotNullParameter(articles, "articles");
        try {
            Object content = entriesData.getContent();
            if (content != null) {
                List<g79.a> list = (List) content;
                arrayList = new ArrayList(w.t(list, 10));
                for (g79.a aVarA : list) {
                    ProductArticleParams productArticleParams = aVarA.f141134b;
                    if (productArticleParams != null) {
                        Data data = (Data) articles.get(productArticleParams);
                        if (data == null) {
                            data = new Data(null, null, true, 3, null);
                        }
                        if (!Intrinsics.f(aVarA.f141135c, data)) {
                            aVarA = g79.a.a(aVarA, null, data, 3);
                        }
                    }
                    arrayList.add(aVarA);
                }
            } else {
                arrayList = null;
            }
            return new Data(arrayList, entriesData.getError(), entriesData.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, entriesData.getLoading());
        }
    }

    public final t38.e b(j pageParams) {
        Intrinsics.checkNotNullParameter(pageParams, "pageParams");
        d dVar = (d) this.f311240a;
        Intrinsics.checkNotNullParameter(pageParams, "pageParams");
        m mVar = (m) dVar.f311235a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(pageParams, "pageParams");
        return new t38.e(nim.a.v(mVar.k.c(pageParams, pageParams.f260172a == null ? mVar.i.a("time_based_paging_cache", false) : false), new y1.a(this, 21)), 24, this.d, new e(this, null, 0));
    }
}
