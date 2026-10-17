package j20;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170648c;

    public /* synthetic */ k(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(i.f170645a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170646a = str;
        this.f170647b = str2;
        this.f170648c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f170646a, kVar.f170646a) && Intrinsics.f(this.f170647b, kVar.f170647b) && Intrinsics.f(this.f170648c, kVar.f170648c);
    }

    public final int hashCode() {
        return this.f170648c.hashCode() + p.a.c(this.f170646a.hashCode() * 31, 31, this.f170647b);
    }
}
