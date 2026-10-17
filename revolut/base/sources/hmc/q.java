package hmc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f153658b;

    public q(String portfolioId, Template template) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(template, "template");
        this.f153657a = portfolioId;
        this.f153658b = template;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f153657a, qVar.f153657a) && Intrinsics.f(this.f153658b, qVar.f153658b);
    }

    public final int hashCode() {
        return this.f153658b.hashCode() + (this.f153657a.hashCode() * 31);
    }
}
