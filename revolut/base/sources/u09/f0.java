package u09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f276120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276121b;

    public f0(e0 type, String link) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f276120a = type;
        this.f276121b = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f276120a == f0Var.f276120a && Intrinsics.f(this.f276121b, f0Var.f276121b);
    }

    public final int hashCode() {
        return this.f276121b.hashCode() + (this.f276120a.hashCode() * 31);
    }
}
