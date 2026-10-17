package wnc;

import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f298804b;

    public k(List templates, Template recommendedTemplate) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
        this.f298803a = templates;
        this.f298804b = recommendedTemplate;
    }

    @Override // wnc.l
    public final List a() {
        return this.f298803a;
    }

    @Override // wnc.l
    public final Template b() {
        return this.f298804b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f298803a, kVar.f298803a) && Intrinsics.f(this.f298804b, kVar.f298804b);
    }

    public final int hashCode() {
        return this.f298804b.hashCode() + (this.f298803a.hashCode() * 31);
    }
}
