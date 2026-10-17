package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116767c;

    public /* synthetic */ i(int i, String str, boolean z, String str2) {
        if (7 != (i & 7)) {
            qlm.j1.f(g.f116756a.getDescriptor(), i, 7);
            throw null;
        }
        this.f116765a = str;
        this.f116766b = str2;
        this.f116767c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f116765a, iVar.f116765a) && Intrinsics.f(this.f116766b, iVar.f116766b) && this.f116767c == iVar.f116767c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116767c) + p.a.c(this.f116765a.hashCode() * 31, 31, this.f116766b);
    }
}
