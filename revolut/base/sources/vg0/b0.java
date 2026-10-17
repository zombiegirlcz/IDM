package vg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f288683c;

    public b0(String id10, String rawId, a0 response) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(rawId, "rawId");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f288681a = id10;
        this.f288682b = rawId;
        this.f288683c = response;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f288681a, b0Var.f288681a) && Intrinsics.f(this.f288682b, b0Var.f288682b) && Intrinsics.f(this.f288683c, b0Var.f288683c);
    }

    public final int hashCode() {
        return this.f288683c.hashCode() + p.a.c(this.f288681a.hashCode() * 31, 31, this.f288682b);
    }
}
