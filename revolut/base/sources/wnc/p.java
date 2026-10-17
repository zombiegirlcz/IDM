package wnc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f298810a;

    public p(Template recommendedTemplate) {
        Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
        this.f298810a = recommendedTemplate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f298810a, ((p) obj2).f298810a);
    }

    public final int hashCode() {
        return this.f298810a.hashCode();
    }
}
