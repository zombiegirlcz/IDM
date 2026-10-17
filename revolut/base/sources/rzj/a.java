package rzj;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthNewsArticle f258688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f258689b;

    public a(WealthNewsArticle news, List instruments) {
        Intrinsics.checkNotNullParameter(news, "news");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f258688a = news;
        this.f258689b = instruments;
    }

    @Override // rzj.f
    public final j a() {
        return (j) d0.d0(this.f258689b);
    }

    @Override // rzj.f
    public final j b() {
        return (j) d0.e0(2, this.f258689b);
    }

    @Override // rzj.f
    public final int c() {
        return this.f258689b.size();
    }

    @Override // rzj.f
    public final WealthNewsArticle d() {
        return this.f258688a;
    }

    @Override // rzj.f
    public final j e() {
        return (j) d0.e0(1, this.f258689b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f258688a, aVar.f258688a) && Intrinsics.f(this.f258689b, aVar.f258689b);
    }

    public final int hashCode() {
        return this.f258689b.hashCode() + (this.f258688a.hashCode() * 31);
    }
}
