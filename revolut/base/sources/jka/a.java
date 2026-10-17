package jka;

import com.revolut.feature.product_article.impl.network.ProductArticleConfigService;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import ne0.j;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f175137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f175138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProductArticleConfigService f175139c;
    public final mk0.a d;

    public a(e dateProvider, j memoryCache, ProductArticleConfigService service, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f175137a = dateProvider;
        this.f175138b = memoryCache;
        this.f175139c = service;
        this.d = personalisationStorage;
    }
}
