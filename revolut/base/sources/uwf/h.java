package uwf;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f283658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f283659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f283660c;

    public h(Map values, List fields, List errors) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f283658a = fields;
        this.f283659b = values;
        this.f283660c = errors;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f283658a, hVar.f283658a) && Intrinsics.f(this.f283659b, hVar.f283659b) && Intrinsics.f(this.f283660c, hVar.f283660c);
    }

    public final int hashCode() {
        return this.f283660c.hashCode() + p.a.e(this.f283658a.hashCode() * 31, 31, this.f283659b);
    }
}
