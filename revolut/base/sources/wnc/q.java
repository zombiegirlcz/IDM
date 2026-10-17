package wnc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f298811a;

    public q(Template template) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f298811a = template;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f298811a, ((q) obj2).f298811a);
    }

    public final int hashCode() {
        return this.f298811a.hashCode();
    }
}
