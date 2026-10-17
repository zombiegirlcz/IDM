package hmc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ilc.a f153660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Template f153662c;

    public s(ilc.a roboContext, String portfolioId, Template recommendedTemplate) {
        Intrinsics.checkNotNullParameter(roboContext, "roboContext");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(recommendedTemplate, "recommendedTemplate");
        this.f153660a = roboContext;
        this.f153661b = portfolioId;
        this.f153662c = recommendedTemplate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f153660a == sVar.f153660a && Intrinsics.f(this.f153661b, sVar.f153661b) && Intrinsics.f(this.f153662c, sVar.f153662c);
    }

    public final int hashCode() {
        return this.f153662c.hashCode() + p.a.c(this.f153660a.hashCode() * 31, 31, this.f153661b);
    }
}
