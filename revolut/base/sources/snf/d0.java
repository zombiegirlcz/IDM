package snf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 implements f0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264577b;

    public d0(String name, String juniorId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f264576a = name;
        this.f264577b = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f264576a, d0Var.f264576a) && Intrinsics.f(this.f264577b, d0Var.f264577b);
    }

    public final int hashCode() {
        return this.f264577b.hashCode() + (this.f264576a.hashCode() * 31);
    }
}
