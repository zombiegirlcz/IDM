package kl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class v1 {

    @NotNull
    public static final u1 Companion = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f185400c;

    public /* synthetic */ v1(int i, String str, boolean z, String str2) {
        if (7 != (i & 7)) {
            qlm.j1.f(t1.f185390a.getDescriptor(), i, 7);
            throw null;
        }
        this.f185398a = str;
        this.f185399b = str2;
        this.f185400c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return Intrinsics.f(this.f185398a, v1Var.f185398a) && Intrinsics.f(this.f185399b, v1Var.f185399b) && this.f185400c == v1Var.f185400c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185400c) + p.a.c(this.f185398a.hashCode() * 31, 31, this.f185399b);
    }

    public v1(String code, String name, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f185398a = code;
        this.f185399b = name;
        this.f185400c = z;
    }
}
