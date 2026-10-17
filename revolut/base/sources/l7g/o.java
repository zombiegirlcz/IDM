package l7g;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f192629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f192631c;

    public o(n fare, String airlineRulesDescription, ArrayList boundRules) {
        Intrinsics.checkNotNullParameter(fare, "fare");
        Intrinsics.checkNotNullParameter(airlineRulesDescription, "airlineRulesDescription");
        Intrinsics.checkNotNullParameter(boundRules, "boundRules");
        this.f192629a = fare;
        this.f192630b = airlineRulesDescription;
        this.f192631c = boundRules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f192629a.equals(oVar.f192629a) && Intrinsics.f(this.f192630b, oVar.f192630b) && this.f192631c.equals(oVar.f192631c);
    }

    public final int hashCode() {
        return this.f192631c.hashCode() + p.a.c(this.f192629a.hashCode() * 31, 31, this.f192630b);
    }
}
