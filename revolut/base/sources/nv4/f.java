package nv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f219460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f219461b;

    public f(List statements, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(statements, "statements");
        this.f219460a = countryCode;
        this.f219461b = statements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f219460a, fVar.f219460a) && Intrinsics.f(this.f219461b, fVar.f219461b);
    }

    public final int hashCode() {
        return this.f219461b.hashCode() + (this.f219460a.f297794a.hashCode() * 31);
    }
}
