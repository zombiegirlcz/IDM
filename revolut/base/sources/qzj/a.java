package qzj;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthNewsCategory f250661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f250662b;

    public a(WealthNewsCategory newsCategory, c headerType) {
        Intrinsics.checkNotNullParameter(newsCategory, "newsCategory");
        Intrinsics.checkNotNullParameter(headerType, "headerType");
        this.f250661a = newsCategory;
        this.f250662b = headerType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f250661a, aVar.f250661a) && this.f250662b == aVar.f250662b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j6.a.c((this.f250662b.hashCode() + j6.a.c(j6.a.c(this.f250661a.hashCode() * 31, 31, false), 31, false)) * 31, 31, false);
    }
}
