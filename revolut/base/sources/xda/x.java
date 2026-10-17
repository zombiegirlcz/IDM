package xda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304373c;

    public /* synthetic */ x(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(v.f304369a.getDescriptor(), i, 7);
            throw null;
        }
        this.f304371a = str;
        this.f304372b = str2;
        this.f304373c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f304371a, xVar.f304371a) && Intrinsics.f(this.f304372b, xVar.f304372b) && Intrinsics.f(this.f304373c, xVar.f304373c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f304371a.hashCode() * 31, 31, this.f304372b);
        String str = this.f304373c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
