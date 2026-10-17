package noc;

import com.revolut.feature.wealth.models.robo.Template;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f218002a;

    public w(Template template) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f218002a = template;
    }

    @Override // noc.x
    public final List a() {
        List list = this.f218002a.f;
        return list == null ? f0.f322471a : list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f218002a, ((w) obj2).f218002a);
    }

    public final int hashCode() {
        return this.f218002a.hashCode();
    }
}
