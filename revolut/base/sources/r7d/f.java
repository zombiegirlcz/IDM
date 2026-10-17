package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.article.FaqArticleScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqArticleScreenContract$InputData f252110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f252111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252112c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f252113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f252114h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f252115j;
    public final e4m.e k;

    public f(l lVar, t tVar, BaseScreen baseScreen, FaqArticleScreenContract$InputData faqArticleScreenContract$InputData) {
        this.f252111b = lVar;
        this.f252110a = faqArticleScreenContract$InputData;
        this.f252112c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 24;
        this.d = e4m.b.b(new ppd.j(lVar, tVar, this, 2, i));
        this.e = e4m.b.b(new ppd.j(lVar, tVar, this, 1, i));
        this.f = e4m.b.b(new ppd.j(lVar, tVar, this, 0, i));
        this.f252113g = e4m.b.b(new ppd.j(lVar, tVar, this, 5, i));
        this.f252114h = e4m.b.b(new ppd.j(lVar, tVar, this, 4, i));
        this.i = e4m.b.b(new ppd.j(lVar, tVar, this, 3, i));
        this.f252115j = e4m.b.b(new ppd.j(lVar, tVar, this, 7, i));
        this.k = e4m.b.b(new ppd.j(lVar, tVar, this, 6, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.i.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
