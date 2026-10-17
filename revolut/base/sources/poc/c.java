package poc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f237959a;

    public c(Template template) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f237959a = template;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f237959a, ((c) obj2).f237959a);
    }

    public final int hashCode() {
        return this.f237959a.hashCode();
    }
}
