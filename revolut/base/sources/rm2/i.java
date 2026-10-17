package rm2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f255189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f255190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f255191c;

    public i(q selectionStrategy, List scopes, boolean z) {
        Intrinsics.checkNotNullParameter(selectionStrategy, "selectionStrategy");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f255189a = selectionStrategy;
        this.f255190b = scopes;
        this.f255191c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f255189a, iVar.f255189a) && Intrinsics.f(this.f255190b, iVar.f255190b) && this.f255191c == iVar.f255191c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255191c) + p.a.d(this.f255189a.hashCode() * 31, 31, this.f255190b);
    }
}
