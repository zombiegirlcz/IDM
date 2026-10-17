package d8f;

import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f112241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Template f112242c;

    public f(List templates, Template recommendedTemplate, Template previouslySelectedTemplate) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
        Intrinsics.checkNotNullParameter(previouslySelectedTemplate, "previouslySelectedTemplate");
        this.f112240a = templates;
        this.f112241b = recommendedTemplate;
        this.f112242c = previouslySelectedTemplate;
    }

    @Override // d8f.h
    public final List a() {
        return this.f112240a;
    }

    @Override // d8f.h
    public final Template b() {
        return this.f112241b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f112240a, fVar.f112240a) && Intrinsics.f(this.f112241b, fVar.f112241b) && Intrinsics.f(this.f112242c, fVar.f112242c);
    }

    public final int hashCode() {
        return this.f112242c.hashCode() + ((this.f112241b.hashCode() + (this.f112240a.hashCode() * 31)) * 31);
    }
}
