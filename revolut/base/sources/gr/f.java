package gr;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f145778c = {yhm.j.c(yhm.k.PUBLICATION, new gla.k(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f145779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145780b;

    public /* synthetic */ f(int i, j jVar, String str) {
        if (3 != (i & 3)) {
            j1.f(d.f145777a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145779a = jVar;
        this.f145780b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f145779a == fVar.f145779a && Intrinsics.f(this.f145780b, fVar.f145780b);
    }

    public final int hashCode() {
        return this.f145780b.hashCode() + (this.f145779a.hashCode() * 31);
    }

    public f(j documentType, String documentCountry) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(documentCountry, "documentCountry");
        this.f145779a = documentType;
        this.f145780b = documentCountry;
    }
}
