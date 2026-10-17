package wnc;

import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f298798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Template f298799c;

    public i(List templates, Template currentTemplate, Template recommendedTemplate) {
        Intrinsics.checkNotNullParameter(templates, "templates");
        Intrinsics.checkNotNullParameter(currentTemplate, "currentTemplate");
        Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
        this.f298797a = templates;
        this.f298798b = currentTemplate;
        this.f298799c = recommendedTemplate;
    }

    @Override // wnc.l
    public final List a() {
        return this.f298797a;
    }

    @Override // wnc.l
    public final Template b() {
        return this.f298799c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f298797a, iVar.f298797a) && Intrinsics.f(this.f298798b, iVar.f298798b) && Intrinsics.f(this.f298799c, iVar.f298799c);
    }

    public final int hashCode() {
        return this.f298799c.hashCode() + ((this.f298798b.hashCode() + (this.f298797a.hashCode() * 31)) * 31);
    }
}
