package x61;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f303011b;

    static {
        m70.a.c(t0.f186434a);
        new c("", false);
    }

    public c(String iban, boolean z) {
        Intrinsics.checkNotNullParameter(iban, "iban");
        this.f303010a = iban;
        this.f303011b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f303010a, cVar.f303010a) && this.f303011b == cVar.f303011b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f303011b) + (this.f303010a.hashCode() * 31);
    }
}
