package wnc;

import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f298801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Template f298802c;

    public j(List templates, Template recommendedTemplate, Template previouslySelectedTemplate) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
        Intrinsics.checkNotNullParameter(previouslySelectedTemplate, "previouslySelectedTemplate");
        this.f298800a = templates;
        this.f298801b = recommendedTemplate;
        this.f298802c = previouslySelectedTemplate;
    }

    @Override // wnc.l
    public final List a() {
        return this.f298800a;
    }

    @Override // wnc.l
    public final Template b() {
        return this.f298801b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f298800a, jVar.f298800a) && Intrinsics.f(this.f298801b, jVar.f298801b) && Intrinsics.f(this.f298802c, jVar.f298802c);
    }

    public final int hashCode() {
        return this.f298802c.hashCode() + ((this.f298801b.hashCode() + (this.f298800a.hashCode() * 31)) * 31);
    }
}
