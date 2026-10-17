package ika;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData;
import hc2.r;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleFlowContract$InputData f161929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f161930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f161931c;
    public final b d;
    public final d e = this;
    public final e4m.e f;

    public d(b bVar, ProductArticleFlowContract$InputData productArticleFlowContract$InputData, Boolean bool, Boolean bool2) {
        this.d = bVar;
        this.f161929a = productArticleFlowContract$InputData;
        this.f161930b = bool;
        this.f161931c = bool2;
        this.f = e4m.b.b(new r(bVar, this, 21));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
