package b19;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11754c;
    public final String d;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(d.f11751a.getDescriptor(), i, 15);
            throw null;
        }
        this.f11752a = str;
        this.f11753b = str2;
        this.f11754c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f11752a, fVar.f11752a) && Intrinsics.f(this.f11753b, fVar.f11753b) && Intrinsics.f(this.f11754c, fVar.f11754c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f11752a.hashCode() * 31, 31, this.f11753b), 31, this.f11754c);
    }
}
