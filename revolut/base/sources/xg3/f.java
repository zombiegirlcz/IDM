package xg3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f305488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f305489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f305490c;
    public final String d;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(d.f305487a.getDescriptor(), i, 15);
            throw null;
        }
        this.f305488a = str;
        this.f305489b = str2;
        this.f305490c = str3;
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
        return Intrinsics.f(this.f305488a, fVar.f305488a) && Intrinsics.f(this.f305489b, fVar.f305489b) && Intrinsics.f(this.f305490c, fVar.f305490c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f305488a.hashCode() * 31, 31, this.f305489b), 31, this.f305490c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
