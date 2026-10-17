package gk3;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements Serializable {

    @NotNull
    public static final f Companion = new f();
    public static final g e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f144323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f144324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f144325c;
    public final List d;

    static {
        f0 f0Var = f0.f322471a;
        e = new g(f0Var, f0Var, f0Var, false);
    }

    public g(List automation, List manual, List unsupported, boolean z) {
        Intrinsics.checkNotNullParameter(automation, "automation");
        Intrinsics.checkNotNullParameter(manual, "manual");
        Intrinsics.checkNotNullParameter(unsupported, "unsupported");
        this.f144323a = z;
        this.f144324b = automation;
        this.f144325c = manual;
        this.d = unsupported;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f144323a == gVar.f144323a && Intrinsics.f(this.f144324b, gVar.f144324b) && Intrinsics.f(this.f144325c, gVar.f144325c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(Boolean.hashCode(this.f144323a) * 31, 31, this.f144324b), 31, this.f144325c);
    }
}
