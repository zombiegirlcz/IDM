package gmg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f144826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144828c;

    public /* synthetic */ j(double d, int i, String str, String str2) {
        if (7 != (i & 7)) {
            j1.f(h.f144825a.getDescriptor(), i, 7);
            throw null;
        }
        this.f144826a = d;
        this.f144827b = str;
        this.f144828c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Double.compare(this.f144826a, jVar.f144826a) == 0 && Intrinsics.f(this.f144827b, jVar.f144827b) && Intrinsics.f(this.f144828c, jVar.f144828c);
    }

    public final int hashCode() {
        return this.f144828c.hashCode() + p.a.c(Double.hashCode(this.f144826a) * 31, 31, this.f144827b);
    }
}
