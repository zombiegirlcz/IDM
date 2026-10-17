package zlg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final do3.e f323250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f323251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f323252c;

    public c(do3.e registeredIdentity, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(registeredIdentity, "registeredIdentity");
        this.f323250a = registeredIdentity;
        this.f323251b = z;
        this.f323252c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f323250a, cVar.f323250a) && this.f323251b == cVar.f323251b && this.f323252c == cVar.f323252c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f323252c) + j6.a.c(this.f323250a.hashCode() * 31, 31, this.f323251b);
    }
}
