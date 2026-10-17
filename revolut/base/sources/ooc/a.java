package ooc;

import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f227026a;

    public a(Template template) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f227026a = template;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f227026a, ((a) obj2).f227026a);
    }

    public final int hashCode() {
        return this.f227026a.hashCode();
    }
}
