package kmc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f185767a;

    public j(Template template) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f185767a = template;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f185767a, ((j) obj2).f185767a);
    }

    public final int hashCode() {
        return this.f185767a.hashCode();
    }
}
