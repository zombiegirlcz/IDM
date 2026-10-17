package znj;

import com.revolut.retail.feature.esim.impl.utils.product_articles.EsimArticleKey;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimArticleKey f323831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f323832b;

    public a(EsimArticleKey key, Map substitutionData) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
        this.f323831a = key;
        this.f323832b = substitutionData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f323831a == aVar.f323831a && Intrinsics.f(this.f323832b, aVar.f323832b);
    }

    public final int hashCode() {
        return this.f323832b.hashCode() + (this.f323831a.hashCode() * 31);
    }
}
