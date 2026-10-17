package vr4;

import com.revolut.feature.credit.card.impl.navigation.articles.CreditCardArticleKey;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardArticleKey f291502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f291503b;

    public t(CreditCardArticleKey articleKey, Map substitutionData) {
        Intrinsics.checkNotNullParameter(articleKey, "articleKey");
        Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
        this.f291502a = articleKey;
        this.f291503b = substitutionData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f291502a, tVar.f291502a) && Intrinsics.f(this.f291503b, tVar.f291503b);
    }

    public final int hashCode() {
        return this.f291503b.hashCode() + (this.f291502a.hashCode() * 31);
    }
}
