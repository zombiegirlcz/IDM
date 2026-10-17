package ntf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f219030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f219031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f219032c;
    public final h d;

    public n(List items, boolean z, boolean z3, h headerConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerConfig, "headerConfig");
        this.f219030a = items;
        this.f219031b = z;
        this.f219032c = z3;
        this.d = headerConfig;
    }

    @Override // cli.p
    public final List c() {
        return this.f219030a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f219030a, nVar.f219030a) && this.f219031b == nVar.f219031b && this.f219032c == nVar.f219032c && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f219030a.hashCode() * 31, 31, this.f219031b), 31, this.f219032c);
    }
}
