package pld;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class f implements g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f237362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f237363c;

    public /* synthetic */ f(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(d.f237360a.getDescriptor(), i, 7);
            throw null;
        }
        this.f237361a = str;
        this.f237362b = str2;
        this.f237363c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f237361a, fVar.f237361a) && Intrinsics.f(this.f237362b, fVar.f237362b) && Intrinsics.f(this.f237363c, fVar.f237363c);
    }

    public final int hashCode() {
        return this.f237363c.hashCode() + p.a.c(this.f237361a.hashCode() * 31, 31, this.f237362b);
    }
}
