package hf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151774c;

    public /* synthetic */ i(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(g.f151771a.getDescriptor(), i, 7);
            throw null;
        }
        this.f151772a = str;
        this.f151773b = str2;
        this.f151774c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f151772a, iVar.f151772a) && Intrinsics.f(this.f151773b, iVar.f151773b) && Intrinsics.f(this.f151774c, iVar.f151774c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f151772a.hashCode() * 31, 31, this.f151773b);
        String str = this.f151774c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
