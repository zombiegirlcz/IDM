package hmc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f153627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Template f153628c;
    public final a0 d;
    public final boolean e;

    public b0(String portfolioId, Template currentTemplate, Template recommendedTemplate, a0 templateChangeState, boolean z) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currentTemplate, "currentTemplate");
        Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
        Intrinsics.checkNotNullParameter(templateChangeState, "templateChangeState");
        this.f153626a = portfolioId;
        this.f153627b = currentTemplate;
        this.f153628c = recommendedTemplate;
        this.d = templateChangeState;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f153626a, b0Var.f153626a) && Intrinsics.f(this.f153627b, b0Var.f153627b) && Intrinsics.f(this.f153628c, b0Var.f153628c) && Intrinsics.f(this.d, b0Var.d) && this.e == b0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.f153628c.hashCode() + ((this.f153627b.hashCode() + (this.f153626a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
