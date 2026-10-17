package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120829c;

    public x1(String name, String title, String description) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f120827a = name;
        this.f120828b = title;
        this.f120829c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.f120827a, x1Var.f120827a) && Intrinsics.f(this.f120828b, x1Var.f120828b) && Intrinsics.f(this.f120829c, x1Var.f120829c);
    }

    public final int hashCode() {
        return this.f120829c.hashCode() + p.a.c(this.f120827a.hashCode() * 31, 31, this.f120828b);
    }
}
