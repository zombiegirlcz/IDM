package yje;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ e C;
    public int D;
    public Pair[] u;
    public ProductArticleParams.ArticleReference.Key v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Pair[] f314446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f314447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f314448y;
    public e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.C = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, this);
    }
}
