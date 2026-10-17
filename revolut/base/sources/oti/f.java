package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229633a;

    public /* synthetic */ f(int i, String str) {
        if (1 == (i & 1)) {
            this.f229633a = str;
        } else {
            qlm.j1.f(d.f229625a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f229633a, ((f) obj2).f229633a);
    }

    public final int hashCode() {
        return this.f229633a.hashCode();
    }

    public f(String flightNumberRegex) {
        Intrinsics.checkNotNullParameter(flightNumberRegex, "flightNumberRegex");
        this.f229633a = flightNumberRegex;
    }
}
