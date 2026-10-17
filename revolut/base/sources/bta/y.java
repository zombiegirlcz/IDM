package bta;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18509c;
    public final String d;

    public /* synthetic */ y(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(w.f18506a.getDescriptor(), i, 15);
            throw null;
        }
        this.f18507a = str;
        this.f18508b = str2;
        this.f18509c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f18507a, yVar.f18507a) && Intrinsics.f(this.f18508b, yVar.f18508b) && Intrinsics.f(this.f18509c, yVar.f18509c) && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f18507a.hashCode() * 31, 31, this.f18508b), 31, this.f18509c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
