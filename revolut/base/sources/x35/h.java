package x35;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f302657b = new h("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302658a;

    public h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f302658a = value;
    }

    public final String a() {
        return d0.F0(new Regex(".{4}").h(a0.D(this.f302658a, " ", "", false), new x29.a(10))).toString();
    }

    public final String b() {
        return a0.D(this.f302658a, " ", "", false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f302658a, ((h) obj2).f302658a);
    }

    public final int hashCode() {
        return this.f302658a.hashCode();
    }
}
