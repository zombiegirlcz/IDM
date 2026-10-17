package d8f;

import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f112244b;

    public g(List templates, Template recommendedTemplate) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
        this.f112243a = templates;
        this.f112244b = recommendedTemplate;
    }

    @Override // d8f.h
    public final List a() {
        return this.f112243a;
    }

    @Override // d8f.h
    public final Template b() {
        return this.f112244b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f112243a, gVar.f112243a) && Intrinsics.f(this.f112244b, gVar.f112244b);
    }

    public final int hashCode() {
        return this.f112244b.hashCode() + (this.f112243a.hashCode() * 31);
    }
}
